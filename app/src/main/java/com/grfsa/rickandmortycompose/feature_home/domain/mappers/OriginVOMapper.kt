package com.grfsa.rickandmortycompose.feature_home.domain.mappers

import com.grfsa.rickandmortycompose.feature_home.data.response.OriginResponse
import com.grfsa.rickandmortycompose.feature_home.domain.model.OriginVO

fun OriginResponse.toVO() = OriginVO(
    name = this.name,
    url = this.url
)
