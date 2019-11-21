package capitulo4.bloco6.exemplo1

interface Usuario {
    val nickname: String
}

// backking field
class UsuarioContabilizei(override val nickname: String) : Usuario

// calculada
class UsuarioFacebook(val email: String) : Usuario {
    override val nickname: String get() = email.substringBefore("@")
}

fun main() {
    val usuario = UsuarioFacebook("fulano@gmail.com")
    println(usuario.nickname)

    val contabilizei = UsuarioContabilizei("pessoa.sobrenome")
    println(contabilizei.nickname)
}