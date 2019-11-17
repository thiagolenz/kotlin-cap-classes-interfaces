package capitulo4.bloco2.exemplo2

open class SuperClass {
    open fun hello () = "Hello"
    fun sayIt (name: String) = println("${hello()}, $name")
}

class OutraClass : SuperClass() {
    override fun hello(): String {
        return "Olá"
    }
}

fun main() {
    OutraClass().sayIt("Astolfo")
}
