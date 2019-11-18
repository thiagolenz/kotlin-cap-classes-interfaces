package capitulo4.bloco5.exemplo1

class Usuario constructor(_nome: String) {
    val nome: String
    init {
        nome = _nome
    }
}

class Pessoa (_nome: String) {
    val nome = _nome
}

class User (val nome: String)


fun main() {
    Usuario(_nome = "Joaquim")
}