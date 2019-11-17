package capitulo4.bloco1.exemplo2

interface Clickable {
    fun onClick ()
    fun setup () = println("Este é um metodo padrao de interface")
}

class Button: Clickable {
    override fun onClick() {
        setup()
        println("Button clicked!!")
    }
}

fun main() {
    Button().onClick()
}