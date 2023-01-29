package com.grfsa.rickandmortycompose.feature_home.domain.model

data class CharacterInfoVO(
    var created: String? = null,
    val episode: List<String>? = null,
    val gender: String? = null,
    val id: Int? = null,
    val image: String? = null,
    val locationVO: LocationVO? = null,
    val name: String? = null,
    val originVO: OriginVO? = null,
    val species: String? = null,
    val status: String? = null,
    val type: String? = null,
    val url: String? = null
)
