package capitulo4.bloco7.exemplo2

import java.math.BigDecimal
import java.time.LocalDateTime

data class ObjetoComplexo(
    val dataCadastro: LocalDateTime,
    val dataAlteracao: LocalDateTime,
    val cnpj : String,
    val valor: BigDecimal,
    val observacao: String
)

fun main() {
    val objetoComplexo = ObjetoComplexo(LocalDateTime.now(),
        LocalDateTime.now(), "1281823812312",
        BigDecimal(10), "Cadastro inicial")

    println(objetoComplexo)
    val outroObjeto = objetoComplexo.copy(dataAlteracao = LocalDateTime.now().plusDays(1), observacao = "Alteracao de cadastro")

    println(outroObjeto)
}