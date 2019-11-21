package capitulo4.bloco8.exemplo2

object ComparadorNome: Comparator<String> {
    override fun compare(o1: String, o2: String): Int {
        return o1.compareTo(o2)
    }
}

class Pessoa {
    object ComparadorNome: Comparator<String> {
        override fun compare(o1: String, o2: String): Int {
            return o1.compareTo(o2)
        }
    }
}


fun main() {
    val nomes = listOf("Zeca", "Ana", "Pedro", "Jeremias")
    println(nomes)

    val ordenado = nomes.sortedWith(ComparadorNome)
    println(ordenado)

    val ordenado2 = nomes.sortedWith(Pessoa.ComparadorNome)
    println(ordenado2)
}