package com.grfsa.rickandmortycompose.feature_home.data.response

import com.google.gson.annotations.SerializedName


data class CharacterInfoResponse(
    val info: InfoResponse,
    @SerializedName("results")
    val characterList: List<CharacterResponse>
)
