package com.grfsa.rickandmortycompose.feature_home.data.repository

import com.grfsa.rickandmortycompose.feature_home.data.remote.MainApi
import com.grfsa.rickandmortycompose.feature_home.data.response.CharacterInfoResponse

class FetchCharacterRepositoryImpl(private val api: MainApi): FetchCharacterRepository {

    override suspend fun getAllCharacters(): CharacterInfoResponse{
       return api.getAllCharacters()
    }

}