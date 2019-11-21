package capitulo4.bloco8.exemplo3


class PessoaService {
    private val teste: String = "aaaaa"

    companion object Logger {
        fun log (service: PessoaService) {
            println ("Teste ${service.teste}")
        }
        fun outroMetodo() {
            println("Outro metodo foi chamado")
        }
    }

    fun fazerAlgumaCoisa () {
        log(this)
    }
}

fun main() {
    PessoaService().fazerAlgumaCoisa()
    PessoaService.outroMetodo()
//    PessoaService().log()
    //    PessoaService().log()
}