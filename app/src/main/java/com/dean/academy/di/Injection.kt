package com.dean.academy.di

import android.content.Context
import com.dean.academy.data.source.AcademyRepository
import com.dean.academy.data.source.remote.RemoteDataSource
import com.dean.academy.utils.JsonHelper

object Injection {
    fun provideRepository(context: Context): AcademyRepository {

        val remoteDataSource = RemoteDataSource.getInstance(JsonHelper(context))

        return AcademyRepository.getInstance(remoteDataSource)
    }
}