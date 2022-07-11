package kg.example.lovecalculator.network

import android.app.Application

class App:Application() {
companion object {
    lateinit var loveApi: LoveApi
}
    override fun onCreate() {
        super.onCreate()
        val retrofitService = RetrofitService()
        loveApi = retrofitService.getApi()
    }
}