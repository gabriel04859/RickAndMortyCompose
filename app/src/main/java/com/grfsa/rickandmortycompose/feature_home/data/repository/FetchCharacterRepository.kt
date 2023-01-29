package com.grfsa.rickandmortycompose.feature_home.data.repository

import com.grfsa.rickandmortycompose.feature_home.data.response.CharacterInfoResponse

interface FetchCharacterRepository {
    suspend fun getAllCharacters(): CharacterInfoResponse
}