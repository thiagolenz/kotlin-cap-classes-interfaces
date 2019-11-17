package capitulo4.bloco4.exemplo1

sealed class User

class FacebookUser : User () {
    fun getFacebookNickName () = "user.login"
}

class GmailUser : User () {
    fun getName () = "Nome do Usuario"
}

//class InstaUser : User () {
//    fun getNickName () = "Nome do Usuario"
//}


fun getName (user: User): String {
    return when (user) {
        is FacebookUser -> user.getFacebookNickName()
        is GmailUser -> user.getName()
    }
}

fun main() {
    println(getName(FacebookUser()))
    println(getName(GmailUser()))
}




