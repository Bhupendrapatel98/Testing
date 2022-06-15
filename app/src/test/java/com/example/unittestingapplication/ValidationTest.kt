package com.example.unittestingapplication

import com.google.common.truth.Truth.assertThat
import org.junit.Before
import org.junit.Test

/**
 * Created by bhupendrapatel on 15/06/22.
 */
class ValidationTest{
    private  lateinit var validation :Validation

    @Before
    fun setUp(){
        validation = Validation()
    }

    @Test
    fun checkEmail(){
        val result = validation.email("test12@gmail.com")
        assertThat(result).isTrue()
    }
}