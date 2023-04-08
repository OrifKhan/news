import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

 class DataRetrofit   {
    private val interceptor = HttpLoggingInterceptor()

init {

      interceptor.level= HttpLoggingInterceptor.Level.BASIC
}


    private val client= OkHttpClient.Builder().addInterceptor(interceptor).build()

    val retrofit = Retrofit.Builder()
        .baseUrl("https://guidebook.com/service/v2/").client(client)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

}