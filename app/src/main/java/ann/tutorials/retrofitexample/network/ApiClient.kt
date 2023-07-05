package ann.tutorials.retrofitexample.network

import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory


object ApiClient {

    private val BASE_URL ="https://rickandmortyapi.com/api/"

//   next we create a variable for the moshi builder adding a converter to it


    private val moshi = Moshi.Builder().add(KotlinJsonAdapterFactory()).build()
}