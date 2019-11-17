package capitulo4.bloco1.exemplo1

interface Clickable {
    fun onClick ()
}

class Button: Clickable {
    override fun onClick() {
        println("Button clicked!!")
    }
}

fun main() {
    Button().onClick()
}