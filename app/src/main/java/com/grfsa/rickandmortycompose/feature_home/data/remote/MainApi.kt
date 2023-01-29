package com.grfsa.rickandmortycompose.feature_home.data.remote

import com.grfsa.rickandmortycompose.feature_home.data.response.CharacterInfoResponse
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface MainApi {

    @GET(GET_CHARACTERS)
    suspend fun getAllCharacters(): CharacterInfoResponse

    companion object {
        private const val GET_CHARACTERS = "character"


        val api: MainApi by lazy {
            Retrofit.Builder()
                .baseUrl(Network.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(MainApi::class.java)
        }
    }
}