Chapter3 클래스, 객체, 인터페이스
=================
### 1. 클래스 계층 정의
- 코틀린 인터페이스
  - 자바의 extends와 implements 대신 클래스 명 뒤에 : 을 붙인다.
  - 인터페이스에 디폴트 구현이 있는 메소드를 선언하면 새로운 동작을 정의할 수도 있고 디폴트로 사요할 수도 있다.
  - 상위 타입의 이름을 꺽쇠(<>) 사이에 넣어서 "super"를 지정하면 어떤 상위 타입의 멤버 메소드를 호출할지 지정할 수 있음
  - 어떤 클래스의 상속을 허용하려면 클래스 앞에 open 변경자를 붙여야함.
  
```
super<Clickable>.showOff()
```
      
- 메소드 오버라이드
  - 오버라이드를 허용하고 싶은 메소드나 프로퍼티 앞에도 open 변경자를 붙여야함
  - 하위 클래스에서 오버라이드 못하게 하려면 메소드 앞에 final을 명시 
  
- 클래스 내에서 상속 제어 변경자의 의미
  - final: 오버라이드 할 수 없음
  - open: 오버라이 할 수 있음
  - abstract: 반드시 오버라이드해야 함
  - override: 상위 클래스나 상위 인스턴스의 멤버를 오버라이드하는 중

- 가시성 변경자: 기본적으로 공개
  - 아무 변경자 없으면 public
  - 코틀린에서는 자바와 다르게 최상위 선언에 대해 private 가시성을 허용(하위 시스템의 자세한 구현 사항을 외부에 감추고 싶은 경우 유용)
    
- 코틀린의 가시성 변경자
  - public(Default): 모든 곳에서 볼 수 있다.
  - internal: 같은 모듈 안에서만 볼 수 있다.
  - protected: 하위 클래스 안에서만 볼 수 있다.
  - private: 같은 클래스 안에서만 볼 수 있다.
  
- 코틀린은 public 함수에서 그보다 가시성이 더 낮은(ex. internal)타입을 참조하지 못하게 한다.
- 자바에서는 같은 패키지 안에서 protected 멤버에 접근할 수 있지만 코틀린에서는 접근 할 수 없다.
- 코틀린의 protected 멤버는 오직 어떤 클래스나 그 클래스를 상속한 클래스 안에서만 보인다.
- 클래스를 확장한 함수는 그 클래스의 private나 protected 멤버에 접근할 수 없다.

- 중첩 클래스
  -바깥쪽 클래스 인스턴스에 대한 접근 권하이 없다
  

- 생성자와 프로퍼티를 갖는 클래스 선언
  - 클래스를 정의할 때 별도의 생성자를 정의하지 않으면 디폴트 생성자를 자동으로 만들어 줌
  - 아무 인자도 없는 클래스를 상속하면 하위 클래스는 반드시 상위 클래스의 생성자를 호출해야 함
  - 어떤 클래스를 외부에서 인스턴스화하지 못하게 막고 싶으면 모든 생성자를 private로 만들면 됨
  
```
class Secretive private constructor() {}
```

- 접근자의 가시성 변경
  
```
class LengthCounter {
    var counter: Int = 0
        private set

    fun addWord(word: String) {
        counter += word.length
    }
}
```
  - set 앞에 private를 선언하여 외부에서 직접 변경하는 것이 아닌 내부에서 메소드를 통하여 변경하도록 설정

- 컴파일러가 생성한 메소드
  - toString()
    - toString을 override 해서 작성
```
override fun toString() = "Client(name=$name, postalCode=$postalCode)"
```

  - equals()
    - euquals도 override를 해야한다.
    - 복잡한 작업을 하는 경우 equals를 해도 제대로 동작하지 않는 경우가 있다. hashCode정의를 사용하지 않아서
  
  - hashCode()
    - 자바에서 equals를 오버라이드 할 떄 반드시 hashCode도 오버라이드 해야한다
    - JVM언어에는 equals  true를 반환하는 두 객체는 반드시 같은 hashCode()를 반환해야 한다라는 제약이 있음
    
- 하지만 코틀린에서는 이 모든 메소드를 자동으로 생성해줄 수 있다.
  - class 앞에 data만 붙이면 된다
```
data class Client2(val name: String, val postalCode: Int)
```

- copy() 메소드
  - 

- by 키워드, 데코레이터 패턴

- object 키워드
  - 객체 선언은 싱글턴을 정의 하는 방법 중 하나
  - 동반 객체는 인스턴스 메소드는 아니지만 어떤 클래스와 관련 있는 메소드와 팩토리 메소드를 담을 때 쓰인다
  

여기부터는 코틀린을 어느정도 이해하고 보는게 좋을 것 같다...
  


