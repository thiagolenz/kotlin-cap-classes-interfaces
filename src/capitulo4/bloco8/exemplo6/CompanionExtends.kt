package capitulo4.bloco8.exemplo6

import capitulo4.bloco8.exemplo4.NotaFiscal
import capitulo4.bloco8.exemplo4.NotaFiscalItem
import java.math.BigDecimal


class NotaService {
    companion object Emissores {
        fun emitirPR (nota : NotaFiscal ) {
            println("Emitindo PR = $nota")
        }
    }
}

fun NotaService.Emissores.emitirSP (nota: NotaFiscal) {
    println("Emitindo SP = $nota")
}

fun main() {
    val nota = NotaFiscal.criarNota(listOf(
        NotaFiscalItem(BigDecimal(10), BigDecimal(10.30), "Caneta Importada"),
        NotaFiscalItem(BigDecimal(2), BigDecimal(15.20), "Lápis de Cor")
    ))
    NotaService.emitirPR(nota)
    NotaService.emitirSP(nota)
}