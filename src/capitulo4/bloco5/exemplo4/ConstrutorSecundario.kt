package capitulo4.bloco5.exemplo4


data class Cidade(val nome: String)

data class Estado(val nome: String)

open class Imposto {
    constructor (descricao: String, cidade: Cidade) {
        println(cidade)
    }
    constructor (descricao: String, estado: Estado) {
        println(estado)
    }
}

class ISS : Imposto{
    constructor(descricao: String, cidade: Cidade) : super(descricao, cidade)
}

class Cofins : Imposto{
    constructor(descricao: String, estado: Estado) : super(descricao, estado)
}

fun main() {
    ISS("Iss BH", Cidade("Belo Horizonte"))
    Cofins("Cofins PR", Estado("Paraná"))
}
