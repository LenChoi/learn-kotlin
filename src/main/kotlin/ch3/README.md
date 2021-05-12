Chapter3 함수 정의와 호출
=================
### 1. 코틀린에서 컬렉션 만들기
- hashSetOf( )
- arrayListOf( )
- hashMapOf( )

```
fun <T> joinToString2( // Default 파라미터
    collection: Collection<T>,
    separator: String = ",",
    prefix: String = "",
    postfix: String = ""
) 
```

- 함수의 파라미터 값이 4개인데 중간 값을 생략하고 싶으면 인자의 이름을 붙여줌
```
joinToString2(list, postfix = ";", prefix = "#"))
```
- 상수로 선언하고 싶으면 const를 붙인다
```
const val UNIX_LINE_SEPARATOR = "\n"
```

### 2. 확장 함수와 확장 프로퍼티
```
fun String.lastChar(): Char = this.get(this.length -1)
println("Kotlin".lastChar())
//String -> 수신 객체 타입, "Kotlin" -> 수신 객체
```
- 확장 함수
    - 추가하려는 함수 이름 앞에 그 함수가 확장할 클래스의 이름을 덧붙인다
    - 클래스 이름을 "수신 객체 타입"이라 함
    - 확장 함수가 호출되는 대상이 되는 값을 "수신 객체"라고 부름
    - private, protected 멤버 사용 불가능
    - 확장 함수는 정적인 메소드이기 때문에 오버라이드 할 수 없다

### 컬렉션 처리
- 코틀린 컬렉션의 .last(), .max() 등은 확장 함수 이다.
- 파라미터 앞에 vararg를 붙이면 가변 길이 인자가 됨
- 자바에서는 배열을 그냥 넘기면 되지만 코틀린에서는 명시적으로 배열 앞에 *를 붙여 각 원소가 인자로 전달되게 해야 함
```
fun main(args: Array<String>) {
  val list = listOf("args: ", *args)
  println(list)
}
```
- 중위 호출
```
1.to("one") // to 메소드를 일반적인 방식으로 호출
1 to "one"  // to 메소드를 중위 호출 방식으로 호출

// to 함수를 보면
infix fun Any.to(other: Any) = Pair(this. other)
```
  - 함수를 중위 호출에 사용하게 허용하고 싶으면 infix 변경자를 함수 선언 앞에 추가한다.
  - to를 사용하면 타입과 관계없이 임의의 순서쌍을 만들 수 있다.

### 문자열과 정규식 다루기
- 자바에서는 '.'로 split이 안되었지만 코틀린은 지원
- 정규식에서 3중 따움표 
- 문자열을 쉽게 파싱하는 방법
```
fun parsePath(path: String) {
    val directory = path.substringBeforeLast("/")
    val fullName = path.substringAfterLast("/")
    val fileName = fullName.substringBeforeLast(".")
    val extension = fullName.substringAfterLast(".")
    println("Dir: $directory, name: $fileName, ext: $extension")
}
```

- 3중 따옴표 문자열
  - +연산자로 연결 할 필요 없이 한번에 처리 가능
  - 이스케이프 문자를 사용할 수 없다
  - 문자열이 그대로 표현되기 때문에 들여쓰기가 전부 그대로 표현
    - 특별한 문자(ex. .)를 맨앞에 두고 trimMargin() 메소드를 사용해서 들여쓰기를 모두 제거
  

### 코드 다듬기





  