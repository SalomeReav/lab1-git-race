package es.unizar.webeng.hello.translate

import retrofit2.Call
import retrofit2.http.POST
import retrofit2.http.Headers
import retrofit2.http.Body
import retrofit2.converter.gson.GsonConverterFactory
import es.unizar.webeng.hello.translate.Translation

interface HelloTranslateInterface {
    // Request method and URL specified in the annotation
    // Callback for the parsed response is the last parameter
    @Headers("Content-Type: application/json")
    @POST("translate")
    fun translate(@Body translation:Translation ):Call<Translation>;
}