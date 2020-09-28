package com.github.takahirom.dagger.transive

import com.github.takahirom.dagger.library_a.A
import dagger.Component
import javax.inject.Inject

class App @Inject constructor(a: A)

@Component
interface ComponentApp {
    fun app(): App
}