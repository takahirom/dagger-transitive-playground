package com.github.takahirom.dagger.transive

import com.github.takahirom.dagger.library_a.A
import com.github.takahirom.dagger.library_a.ComponentA
import dagger.Component
import javax.inject.Inject

class App @Inject constructor(a: A)

@Component(dependencies = [ComponentA::class])
interface ComponentApp {
    fun app(): App
}