package capitulo4.bloco8.exemplo5

interface ParserObject<T> {
    fun parseTemplateGoverno (obj: T): String
}

data class Pessoa (val nome: String, val cpf: String)

class PessoaService {
    companion object Converter: ParserObject<Pessoa> {
        override fun parseTemplateGoverno(obj: Pessoa): String = "${obj.cpf}|${obj.nome.trim()}"
    }
}

fun main() {
    println(PessoaService.parseTemplateGoverno(Pessoa("Jeison almeida ", "82828288228")))
}