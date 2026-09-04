package com.example.petshop

class Angry (date: String) : Mood(date) {
    override fun petMood(): String {
        return "Angry"
    }
}