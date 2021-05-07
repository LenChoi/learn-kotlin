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

### 6. enum과 when
- enum
  - 자바와 다르게 enum class를 사용
  - 값만 열거하는 존재가 아닌 프로퍼티나 메소드를 정의할 수 있음
  - enum 클래스 안에 메소드를 정의하는 경우 반드시 ENUm 상수 목록과 메소드 정의 사이에 세미콜론을 넣어야 함

- when
  - 자바와 다르게 break를 넣지 않아도 됨
  - 한 분기 안에서 여러 값을 매치 할 경우 콤마(,)로 분리
  - 인자가 없는  When을 사용하면 불필요한 객체생성을 막을 수 있어 성능을 향상시키지만 코드가 읽이 어려워 지는 단점이 있음  

- is
  - 코틀린의 is는 자바의 instanceof와 비슷하다
  - 변수가 원하는 타입인지 is로 검사하면 굳이원하는 타입으로 캐스팅 하지 않아도 사용할 수 있음(스마트 캐스트)
  
### 7. While과 for 루프
- while, do while
  - 자바와 비슷

```
for (i in 1..100) {

}

for (i in 100 downTo 1 step 2) {

}
```
- for
  - ..은 항상 범위의 우항 값을 포함
  - downTo 1 이면 -1 만큼 작아지는 역방향 수열을 만든다
  - step 2는 증가 값의 절대값이 2로 바뀌기 때문에 증가값은 -2
  - map, collection에 대하여 in을 사용하여 이터레이션 가능
  
-in
  - c in 'a'..'z' 를 하면 'a' <= c && c <= 'z'로  실행 해줌
  - "Kotlin" in "Java".."Scala" 처럼 Java와 Scala 사이의 문자열인지 확인 해줌
  - "Kotlin" in setOf("Java","Scala)도 가능

### 8. 코틀린의 예외 처리
- 자바와 다르게 throw new Exception에서 throw Exception으로 사용 가능
- 예외 처리에서 함수 선언 뒤에 throws ~Exception을 안붙여도 됨 