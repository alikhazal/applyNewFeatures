package com.friendstalk

class Classes {
    open class Player(val name: String, val age: String, val gender: String) {
        fun attack() {
            println("Attack !!!")
        }

        fun defend() {
            println("Defend yourself strongly")
        }

        open fun walk() {
            println("Walk Now")
        }
    }

    class Warrior(name: String, age: String, gender: String, weapon: String) :
        Player(name, age, gender) {
        fun fight() {
            println("Fight Now ... Fight Now")
        }

        override fun walk() {
            println("Walk Now ... Walk Now .... Walk Now....")
        }
    }

    class Rival(name: String, age: String, gender: String, planet: String) :
        Player(name, age, gender) {
        fun fight() {
            println("Fight to the end ...")
        }
    }

}
    fun main(arg: Array<String>) {
        val player = Classes.Player("John", "29", "Male")
        val warrior = Classes.Warrior("Ali", "50", "Male", "Machine Gun")
        val rival = Classes.Rival("Jack", "40", "Male", "Mars")

        player.attack()
        warrior.attack()
        rival.attack()

        warrior.fight()
        rival.fight()

        warrior.defend()
        rival.defend()

        warrior.walk()
        rival.walk()


    }
