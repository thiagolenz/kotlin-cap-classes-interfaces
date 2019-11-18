package capitulo4.bloco5.exemplo3

open class User (val nickName: String)

class FacebookUser (nickName: String, val email: String): User(nickName)


open class Aviao

class Boeing (val modelo: String): Aviao()