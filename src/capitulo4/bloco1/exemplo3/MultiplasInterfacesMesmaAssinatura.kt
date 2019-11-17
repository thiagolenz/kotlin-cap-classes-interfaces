package capitulo4.bloco1.exemplo3

interface Veiculo {
    fun log () = println ("Veiculo.log foi chamado")
    fun locomover()
}

interface Motorizado {
    fun log () = println ("Motorizado.log foi chamado")
    fun ligar()
}

class Carro: Veiculo, Motorizado {
    override fun log() {
        super<Veiculo>.log()
        super<Motorizado>.log()
    }

//    override fun log() {
//        super<Veiculo>.log()
//    }

//    override fun log() = println ("sou fodão e sobreescrevi tudo")

    override fun ligar() {
        println("Carro vai ligar")
        log()
    }
    override fun locomover() {
        println("Carro vai locomover")
        log()
    }
}

fun main() {
    val carro = Carro()
    carro.ligar()
    carro.locomover()
}