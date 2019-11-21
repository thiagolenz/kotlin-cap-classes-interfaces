package capitulo4.bloco8.exemplo1

object ConexaoDatabase {
    private val conexoesAtivas = mutableSetOf<String>()
    fun conectar (url: String) = conexoesAtivas.add(url)

    fun mostrarConexoesAtivas () {
        for (url in conexoesAtivas) {
            println("Conexão ativa $url")
        }
    }
}

fun main() {
//    ConexaoDatabase()
    ConexaoDatabase.conectar("localhost")
    ConexaoDatabase.mostrarConexoesAtivas()
    println("------")
    ConexaoDatabase.conectar("producao")
    ConexaoDatabase.mostrarConexoesAtivas()
}



