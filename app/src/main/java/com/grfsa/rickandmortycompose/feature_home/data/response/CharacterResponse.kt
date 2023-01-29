package com.grfsa.rickandmortycompose.feature_home.data.response

data class CharacterResponse(
    val created: String? = null,
    val episode: List<String>? = null,
    val gender: String? = null,
    val id: Int? = null,
    val image: String? = null,
    val locationResponse: LocationResponse? = null,
    val name: String? = null,
    val originResponse: OriginResponse? = null,
    val species: String? = null,
    val status: String? = null,
    val type: String? = null,
    val url: String? = null
)