package capitulo4.bloco2.exemplo3

abstract class Carro {
    open fun ligar () = println ("Carro ligando")
}

open class Ferrari: Carro() {
    final override fun ligar() {
        super.ligar()
        println("Ferrari ligando")
    }
}
//
//class F812: Ferrari() {
//    override fun ligar() {
//        super.ligar()
//        println("F812 ligando")
//    }
//}