package com.example.modul

import com.example.modul.one.Carbivores
import com.example.modul.one.Herbivores

fun main() {
    val Herbivores1 = Herbivores(animalName = "лось")
    println(Herbivores1.animalName)
    val Herbivores2 = Herbivores(animalName = "жираф")
    println(Herbivores2.animalName)
    val Herbivores3 = Herbivores(animalName = "корова")
    println(Herbivores3.animalName)
    val Carbivores1 = Carbivores(animalName = "лев")
    val Carbivores2 = Carbivores(animalName = "тигр")
    val Carbivores3 = Carbivores(animalName = "ёжик")
    println(Carbivores1.animalName)
    println(Carbivores2.animalName)
    println(Carbivores3.animalName)

    var listOfHerbivores: List<String> = listOf("жираф", "лось", "корова")
    var listOfCarbivores: List<String> = listOf("ёжик", "лев", "тигр")
    for (Herbivores in listOfHerbivores) {
        println("травоядное зовут $Herbivores")
    }
    for (Carbivores in listOfCarbivores) {
        println("плотоядное зовут $Carbivores")
    }
    var listOfNewHerbivores: MutableList<String> = mutableListOf("бык", "конь")
    println("$listOfNewHerbivores это травоядные")

    var listOfNewCarbivores: MutableList<String> = mutableListOf("ёжик", "тигр", "лев")
    println("$listOfNewCarbivores это плотоядные")

}