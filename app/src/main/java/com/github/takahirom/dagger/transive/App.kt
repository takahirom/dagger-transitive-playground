package com.github.takahirom.dagger.transive

import android.app.Application
import com.github.takahirom.dagger.library_a.A
import dagger.Component
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject

@HiltAndroidApp
class App :Application(){
    @Inject lateinit var a: A

}

