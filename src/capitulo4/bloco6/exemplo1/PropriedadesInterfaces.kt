package capitulo4.bloco6.exemplo1

interface Usuario {
    val nickname: String
}

class UsuarioContabilizei(override val nickname: String) : Usuario


class UsuarioFacebook(val email: String) : Usuario {
    override val nickname: String get() = email.substringBefore("@")
}