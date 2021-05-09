package ch4

open class RichButton : Clickable {
    fun disable() {} // 이 함수는 final
    open fun animate() {} // 이 함수는 열려 있음, 오버라이드 가능
    override fun click() {} // 이 함수는 상위 클래스에 선언된 열려있는 메소드를 오버라이드 한다.
}