package com.example.unittestingapplication

/**
 * Created by bhupendrapatel on 15/06/22.
 */
class Validation {
    private val EMAIL_PATTERN = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+"

    fun email(email:String):Boolean{
        if(email.matches(EMAIL_PATTERN.toRegex()))
            return true
        return false
    }
}