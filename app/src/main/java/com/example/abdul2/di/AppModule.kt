package com.example.abdul2.di

import com.example.abdul2.common.Constants
import com.example.abdul2.data.domain.PicsumAPI
import com.example.abdul2.data.repository.ImageRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object AppModule {

   // API impl
    @Provides
   @Singleton
    fun providePicsumApi() : PicsumAPI {
        return Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(PicsumAPI::class.java)
    }

   // repo
   @Provides
   @Singleton
    fun provideRepo(api: PicsumAPI): ImageRepository{
        return ImageRepository(picsumAPI = api)
    }
}