package lat.tuanla.retrofitexamplegithub

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import lat.tuanla.retrofitexamplegithub.Model.ObjectModel
import lat.tuanla.retrofitexamplegithub.remote.Api
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    private var txtUser : TextView? = null
    var str : String = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txtUser = findViewById(R.id.txtUser)
        getUser()
    }

    private fun getUser() {
        var call = Api.getService().getUser()
        call.enqueue(object : Callback<ObjectModel.UserList>{
            override fun onFailure(call: Call<ObjectModel.UserList>, t: Throwable) {
                Log.v("Co Loi:",t.toString())
            }

            override fun onResponse(
                call: Call<ObjectModel.UserList>,
                response: Response<ObjectModel.UserList>
            ) {
                var userList = response.body()
                var user = userList?.userList
                var length = user!!.size
                for (i in 0 until length){
                    str = str + "\n" + user.get(i).id + " - "+ user.get(i).login + " - " + user.get(i).score
                }
                txtUser!!.text = str
            }

        })
    }
}
