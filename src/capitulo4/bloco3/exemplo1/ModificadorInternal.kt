package capitulo4.bloco3.exemplo1

internal open class TalkativeButton {
    private fun yell() = println("Hey!")
    protected fun whisper() = println("Let's talk!")
}
//fun TalkativeButton.giveSpeech() {
//    yell()
//    whisper()
//}

internal class OtherButton : TalkativeButton() {
    fun giveSpeech () {
//        yell()
        whisper()
    }
}
