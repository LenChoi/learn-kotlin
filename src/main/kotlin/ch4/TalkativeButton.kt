package ch4

internal open class TalkativeButton: Focusable {
    private fun yell() = println("Hey!")
    protected fun whisper() = println("Let's talk!")
}

//fun TalkativeButton.giveSpeech() {    <-
//    yell()     <- private 라서 오류
//    whisper()  <- protected 라서 오류
//}