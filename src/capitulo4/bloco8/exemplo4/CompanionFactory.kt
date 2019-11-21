package capitulo4.bloco8.exemplo4

import java.math.BigDecimal

data class NotaFiscalItem (val valorUnitario:BigDecimal,
                           val quantidade: BigDecimal,
                           val descricao: String)

data class NotaFiscal constructor (val valorNota: BigDecimal, val itens: List<NotaFiscalItem>) {
    companion object {
        fun criarNota (itens: List<NotaFiscalItem>): NotaFiscal {
            return NotaFiscal (getValorTotalItens(itens), itens)
        }

        fun getValorTotalItens (itens: List<NotaFiscalItem>): BigDecimal {
            return itens.map { it.quantidade.multiply(it.valorUnitario) }
                .reduce { acc, atual -> acc.add(atual) }
        }
    }
}

fun main() {
    val nota = NotaFiscal.criarNota(listOf(
        NotaFiscalItem(BigDecimal(10), BigDecimal(10.30), "Caneta Importada"),
        NotaFiscalItem(BigDecimal(2), BigDecimal(15.20), "Lápis de Cor")
    ))
    println(nota)
}