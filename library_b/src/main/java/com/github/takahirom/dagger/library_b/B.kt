package com.github.takahirom.dagger.library_b

import dagger.Component
import javax.inject.Inject


class B @Inject internal constructor()

@Component
interface ComponentB {
    fun b(): B
}
