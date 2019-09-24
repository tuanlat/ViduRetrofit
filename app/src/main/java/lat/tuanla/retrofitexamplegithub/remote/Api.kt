package lat.tuanla.retrofitexamplegithub.remote

import lat.tuanla.retrofitexamplegithub.Model.ObjectModel
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

class Api{
    companion object{
        val BASE_URL = "https://api.github.com/search/"
        fun getService() : Service{
            val retrofit = Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
            return retrofit.create(Service::class.java)
        }
    }
}