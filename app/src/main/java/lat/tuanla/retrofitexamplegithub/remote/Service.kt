package lat.tuanla.retrofitexamplegithub.remote

import lat.tuanla.retrofitexamplegithub.Model.ObjectModel
import retrofit2.Call
import retrofit2.http.GET

interface Service{
    @GET("users?q=tuanla")
    fun getUser() : Call<ObjectModel.UserList>
}