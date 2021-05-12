Chapter5 람다로 프로그래밍
=================
### 1. 람다 식과 멤버 참조
- maxByOrNull
```
perple.mayByOrNull{it.age}

people.maxByOrNull(Person::age) 
```
- 람다의 파라미터가 하나뿐이고 그 타입을 컴파일러가 추론할 수 있을 경우 it을 쓸 수 있다.

- forEach
  - 컬렉션의 모든 원소에 대해 람다를 호출 해줌
  
```
messages.forEach{
    println("$prefix $it")
}
```

- 멤버 참조(::)
  - 프로퍼티나 메소드를 단 하나만 호출하는 함수 값을 만들어준다
```
people.maxBy(Person::age)
people.maxBy{p -> p.age}
people.maxBy{it.age} // 다 같다
```
  - 최상위에 선언된 함수나 프로퍼티를 참조 할 수 있다
```
fun salute() = println("Salute!")
>> run(::salute) // run은 인자로 받은 람다를 호출
```
  - 람다가 인자가 여럿인 다른 함수한테 작업을 위임하는 경우 람다를 정의하지 않고 직접 위임 함수에 대한 참조를 제공하면 편리하다
```
val action = { person: Person, message: String ->  // 이 람다는 sendEmail 함수에게 작업을 위임한다 
    sendEmail(person, message)
}
val nextAction = ""
```

### 2. 컬렉션 함수형 API
- filter
  - 컬렉션에서 원치 않는 원소를 제거
  - 원소를 변환 할 수는 없다
  - 컬렉션 값 자체를 제거하는 건 아니고 출력 만 해줌
  
- map
  - 주어진 람다를 컬렉션의 각 원소에 적용한 결과를 모아서 새 컬렉션을 만든다 








  