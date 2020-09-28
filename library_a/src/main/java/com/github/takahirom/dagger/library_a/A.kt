package com.github.takahirom.dagger.library_a

import com.github.takahirom.dagger.library_b.B
import com.github.takahirom.dagger.library_b.ComponentB
import dagger.Component
import javax.inject.Inject

class A @Inject constructor(a: B)

@Component(dependencies = [ComponentB::class])
interface ComponentA {
    fun a(): A
}