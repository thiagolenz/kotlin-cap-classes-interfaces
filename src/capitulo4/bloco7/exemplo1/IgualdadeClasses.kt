package capitulo4.bloco7.exemplo1

data class Pessoa (val nome: String)

fun main() {
    val pessoa1 = Pessoa ("Jeremias")
    val pessoa2 = Pessoa ("Jeremias")
    val pessoa3 = pessoa1

    println (pessoa1 == pessoa2)
    println (pessoa1 === pessoa2)
    println (pessoa1 === pessoa3)

    val lista = listOf(pessoa1, pessoa2)
    println(lista.contains(Pessoa("Jeremias")))
}