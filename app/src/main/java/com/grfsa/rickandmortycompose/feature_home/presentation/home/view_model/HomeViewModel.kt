package com.grfsa.rickandmortycompose.feature_home.presentation.home.view_model

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.grfsa.rickandmortycompose.feature_home.data.utils.RequestState
import com.grfsa.rickandmortycompose.feature_home.domain.mappers.toListVO
import com.grfsa.rickandmortycompose.feature_home.domain.model.CharacterInfoVO
import com.grfsa.rickandmortycompose.feature_home.domain.repository.FetchCharacterUseCase
import com.grfsa.rickandmortycompose.feature_home.domain.utils.UiState
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.onStart
import kotlinx.coroutines.launch

class HomeViewModel(private val useCase: FetchCharacterUseCase) : ViewModel() {

    private val _charactersList =
        MutableStateFlow<UiState<List<CharacterInfoVO>>>(UiState.InitialState)
    val characterList: Flow<UiState<List<CharacterInfoVO>>> get() = _charactersList

    fun fetchCharacters() {
        viewModelScope.launch {
            useCase.invoke().onStart {
                _charactersList.value = UiState.Loading
            }
                .catch { e ->
                    _charactersList.value = UiState.Failure(e)
                }.collect {
                    val characterList = (it as RequestState.Success).data?.characterList?.toListVO()
                    _charactersList.value = UiState.Success(characterList)
                }

        }
    }
}