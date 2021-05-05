Chapter2 코틀린 기초
=================
### 1. Hello, World!
```
println("Hello, world")
```
- 자바와 달리 꼭 클래스 안에 함수를 안 넣어도 됨
- 배열 처리를 위한 문법이 없음
- System.out.println -> println
- 파이썬 처럼 세미콜론(;)를 붙이지 않아도 됨


### 2. 함수
```
fun max(a: Int, b: Int): Int {
    return if (a > b) a else b
}
```
- 함수 이름, 파라미터 목록, 반환 타입 순으로 작성
- 파라미터 목록과 반환 타입 사이에는 : 으로 구분

```
fun max(a: Int, b: Int): Int = if (a > b) a else b
// 간결하게 표현 가능
fun max(a: Int, b: Int) = if (a > b) a else b
// 반환 타입도 생략 가능
```
- 코틀린은 사용자가 반환 타입을 적지 않아도 컴파일러가 함수를 분석해 반환 타입을 정해준다.(타입 추론)


### 3. 변수

- val (value)
  - 변경 불가능한 참조를 지정하는 변수
  - 초기화 후 재대입이 불가능
  - 자바의 final 변수에 해당
    
- var (variable)
  - 변경 가능한 참조
  - 값이 바뀔 수 있음 
  - 자바의 일반 변수

```
val answer: Int
answer = 42
```
- 초기화 식을 사용하지 않고 변수를 선언하려면 변수 타입을 반드시 명시


### 4. 문자열 템플릿
```
val name = if (args.size > 0) args[0] else "Kotlin"
println("Hello, $name!")
```
- 문자열 리터럴이 필요한 곳에 변수를 넣되 변수 앞에 $를 추가
- 컴파일러는 정적으로 검사하기 떄문에 존재하지 않는 변수를 템플릿에 사용하면 오류 발생
- 중괄호 안에 문자열 템플릿을 넣을 수 있음 
- **변수명 뒤에 바로 한글을 붙여 사용하면 오류가 발생하기 때문에 "${name}님 반가워요" 와 같은 중괄호 사용하자 **


### 5. 클래스
```
class Person(
    val name: String, 
    var isMarried: Boolean
)
```
- val: 읽기 전용 프로버티로 비공개 필드와 게터를 생성
- var: 쓸 수 있는 프로퍼티로, 비공개 필드와 게터, 세터 생성

```
val person = Person("Bob", true)
println(person.name)
println(person.isMarried)
person.isMarried = false // 자바와 다르게 사용 가능
```
- 프로퍼티 이름을 직접 사용해도 자동으로 게터 호출




