package com.grfsa.rickandmortycompose.di

import com.grfsa.rickandmortycompose.feature_home.data.remote.MainApi
import com.grfsa.rickandmortycompose.feature_home.data.remote.Network
import com.grfsa.rickandmortycompose.feature_home.data.repository.FetchCharacterRepository
import com.grfsa.rickandmortycompose.feature_home.data.repository.FetchCharacterRepositoryImpl
import com.grfsa.rickandmortycompose.feature_home.domain.repository.FetchCharacterUseCase
import com.grfsa.rickandmortycompose.feature_home.presentation.home.view_model.HomeViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

val apiModule = module {
    single {
        Retrofit.Builder()
            .baseUrl(Network.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(MainApi::class.java)
    }
}

val repositoriesModule = module {
    factory<FetchCharacterRepository> { FetchCharacterRepositoryImpl(get()) }
}

val useCasesModule = module {
    single { FetchCharacterUseCase(get()) }
}

val viewModelsModule = module {
    viewModel {
        HomeViewModel(get())
    }
}
