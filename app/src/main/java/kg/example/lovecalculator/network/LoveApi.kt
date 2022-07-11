package kg.example.lovecalculator.network

import kg.example.lovecalculator.network.model.LoveModel
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query

interface LoveApi {
    @GET("getPercentage")
    fun getPersantage(
        @Query("fname") firsName: String,
        @Query("sname") secondName: String,
        @Header("X-RapidAPI-Key") key:String = "7c013713f5mshdc1bb70a95db0fbp13780ejsnb15c5899d5b9",
        @Header("X-RapidAPI-Host") host:String= "love-calculator.p.rapidapi.com",
    ): Call <LoveModel>
}