package capitulo4.bloco3.exemplo2

class Externa (val nome : String) {
    class Interna {
//        fun teste () = "Este é um teste com $nome"
    }
}

class Externa2 (val nome : String) {
    inner class Interna {
        fun teste () = "Este é um teste com $nome"
        fun getReferencia (): Externa2 = this@Externa2
    }
}

fun main() {
    val a = Externa2("joao")
    println(a.Interna().teste())
    println(a.Interna().getReferencia())
}