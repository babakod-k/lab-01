package com.example.petshop

class Sad (date: String) : Mood(date) {
    override fun petMood(): String {
        return "Sad"
    }
}