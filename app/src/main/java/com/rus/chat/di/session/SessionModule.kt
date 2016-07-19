package com.rus.chat.di.session

import com.rus.chat.repositories.BaseRepository
import com.rus.chat.repositories.login.SessionRepository
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by RUS on 20.07.2016.
 */
@Module
class SessionModule(val baseRepository: BaseRepository) {

    @Provides
    @Singleton
    fun getSessionRepo(): BaseRepository = baseRepository

}