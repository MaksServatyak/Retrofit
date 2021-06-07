
import com.example.retrofit.Interface.RetrofitServices
import com.example.retrofit.Retrofit.RetrofitClient

object Common {
    private const val BASE_URL = "https://www.simplifiedcoding.net/demos/"
    val retrofitService: RetrofitServices
        get() = RetrofitClient.getClient(BASE_URL).create(RetrofitServices::class.java)
}