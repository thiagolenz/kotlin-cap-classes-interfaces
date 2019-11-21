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

    override fun setup() {
        super.setup()
        println("este é setup do button")
    }
}

fun main() {
    Button().onClick()
}