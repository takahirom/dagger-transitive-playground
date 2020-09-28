package com.github.takahirom.dagger.library_a

import com.github.takahirom.dagger.library_b.B
import javax.inject.Inject

class A @Inject constructor(a: B)
