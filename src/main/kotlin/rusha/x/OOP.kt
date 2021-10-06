package rusha.x

abstract class Animal(private val age: Int) {
    abstract fun makeSound()
    fun info() : String {
        return "age :$age"
    }
}

class Cat(age : Int, length : Int) : Animal(age) {
    override fun makeSound() {
        println("mao")
    }

}

class Dog( age : Int ) : Animal(age) {
    override fun makeSound() {
        println("gao")
    }
}

fun main() {
    val animals = listOf<Animal>(Cat(5, 9), Dog(7))
    makeSounds(animals = animals)
}
 fun makeSounds(animals : List<Animal>) {
     animals.forEach() { a ->
         a.makeSound()
     }
     animals.forEach() { a ->
         println(a.info())
     }
 }

