package com.github.takahirom.dagger.library_b

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object BModule {
    @Provides
    fun b(): B {
        return B()
    }
}

class B()
