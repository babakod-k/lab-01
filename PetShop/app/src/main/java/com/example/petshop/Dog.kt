package com.example.petshop

class Dog (name: String, age: Int) : Pet(name,age), Pettable {
    override fun speak(): String {
        return "Bark"
    }
    override fun pet() {
        println("This is a pettable dog $name")
    }
}