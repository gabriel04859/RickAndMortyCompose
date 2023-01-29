package com.grfsa.rickandmortycompose.feature_home.domain.repository

import com.grfsa.rickandmortycompose.feature_home.data.repository.FetchCharacterRepository
import com.grfsa.rickandmortycompose.feature_home.data.response.CharacterInfoResponse
import com.grfsa.rickandmortycompose.feature_home.data.utils.RequestState
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException

class FetchCharacterUseCase(private val repository: FetchCharacterRepository) {

    suspend operator fun invoke(): Flow<RequestState<CharacterInfoResponse>> = flow {
        try {
            emit(RequestState.Success(repository.getAllCharacters()))
        } catch (e: HttpException) {
            emit(RequestState.Failure(e))
        } catch (e: IOException) {
            emit(RequestState.Failure(e))
        }
    }
}
