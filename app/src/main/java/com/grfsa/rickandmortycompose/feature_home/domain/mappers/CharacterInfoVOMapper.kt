package com.grfsa.rickandmortycompose.feature_home.domain.mappers

import com.grfsa.rickandmortycompose.feature_home.data.response.CharacterResponse
import com.grfsa.rickandmortycompose.feature_home.domain.model.CharacterInfoVO

fun CharacterResponse.toVO() = CharacterInfoVO(
    created = this.created,
    episode = this.episode,
    gender = this.gender,
    id = this.id,
    image = this.image,
    locationVO = this.locationResponse?.toVO(),
    name = this.name,
    originVO = this.originResponse?.toVO(),
    species = this.species,
    type = this.type,
    url = this.url
)

fun List<CharacterResponse>.toListVO(): MutableList<CharacterInfoVO> {
    val listVO = mutableListOf<CharacterInfoVO>()
    this.forEach {
        listVO.add(it.toVO())
    }
    return listVO
}