package com.grfsa.rickandmortycompose.feature_home.domain.mappers

import com.grfsa.rickandmortycompose.feature_home.data.response.LocationResponse
import com.grfsa.rickandmortycompose.feature_home.domain.model.LocationVO

fun LocationResponse.toVO() = LocationVO(
    name = this.name,
    url = this.url
)
