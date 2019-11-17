package capitulo4.bloco1.bonus1

class Bonus {
    fun setFocus (b: Boolean) = println("Elemento ${if (b) "ganhou" else "perdeu"} foco.")
}

fun main() {
    val bonus = Bonus()
    bonus.setFocus(true)
    bonus.setFocus(false)
}