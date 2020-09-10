package com.example.password_generator

class PasswordGenerator {

    private val character = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz123456789"

    fun generatePassword(length: Int, specialWord: String = ""): String {

        val sb = StringBuilder(length)

        for (x in 0 until length) {
            val random = (character.indices).random()
            sb.append(character[random])
        }
        sb.insert((0 until length).random(), specialWord)
        return sb.toString()
    }
}