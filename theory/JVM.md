# 22-01-27 

# __JVM__
  
## __자바 프로그램이 실행되는 과정__ 
 >   1. - JVM은 OS로부터 프로그램이 필요로 하는 메모리를 Runtime Data Areas에 할당 받는다.  
 >          - JVM은 메모리를 용도에 따라 Runtime Data Areas를 여러 영역으로 나누어 관리한다.  
 >   2. JDK의 자바 컴파일러(javac)가 자바소스(.java)를 읽어들여 자바 바이트코드(.class)로 변환시킨다.  
 >   3. Class Loader를 통해 .class 파일들을 JVM으로 로딩한다.  
 >   4. 로딩된 .class 파일들은 Execution engine을 통해 해석된다.  
 >   5. 해석된 바이트코드는 Runtime Data Areas에 배치되어 실질적인 수행이 이뤄진다.  
 >

</br>

<p align="center"><img src="https://media.vlpt.us/images/hono2030/post/bebacab0-139d-4f84-9234-5df2b8931ad7/image.png" width="70%" height="70%"></p>

###### 출처 : https://jeong-pro.tistory.com/148

</br>

---

</br>
<center>

|__JVM 구성 요소__||||
|:-:|:-:|:-:|:-:|
|[Class Loader](#class-loader)|[Execution Engine](#execution-engine)|[Garbage Collector](#garbage-collector)|[Runtime Data Area](#runtime-data-area)|

</center>

</br>

## __Class Loader__ 
    javac가 컴파일한 .class 파일들을 모아 OS로부터 할당받은 메모리 영역 Runtime Data Area로 적재한다.
## __Execution Engine__ 
    Class Loader에 의해 메모리에 적재된 클래스들을 기계어로 변경해 명령어 단위(operation code)로 실행한다.  
    Q. 명령어 단위라는 게?
        - 인터프리터 : 컴파일러가 기계어로 변환하지 않고 인터프리터가 해석할 수 있는 ByteCode로 변환한다.
        런타임 시, 인터프리터가 명령어 단위로 바이트 코드를 해석하고 실행한다. 
    Q. 명렁어 단위로 실행하는 것과 한 줄 씩 실행하는 스크립트랑 뭐가 다르지?
        - 명령어 하나 씩의 동작은 빠르지만 전체 수행은 느리다.
        - JIT(Just In Time compiler) : 프로그램이 시작되고 코드를 컴파일한 후에 JIT 컴파일러를 실행한다. 
        Q. 이게 무슨 말이지? JIT 자체가 뭔지 모르겠음.
        전체 바이트 코드를 네이티브 코드로 변환하고 실행
        - 전체적인 동작은 빠르나 컴파일이 오래 걸린다.

## __Garbage Collector__ 
    Heap 메모리 영역에 생성된 객체들 중 참조되지 않은 객체들을 제거한다.
    GC의 동작시간이 일정하지 않으며 GC를 수행하는 동안 GC Thread를 제외한 다른 Thread는 일시정지 상태가 된다.
    => Full GC가 일어나 모든 Thread가 정지한다면 심각한 장애로 이어질 수 있다. 
## __Runtime Data Area__ 

> </br>
> 
>  JVM의 메모리 영역으로 자바 애플리케이션 실행 시 사용되는 데이터를 적재하는 영역이다
> 
> </br>
> 
>  <p align="center"><img src="https://media.vlpt.us/images/hono2030/post/e4862dd9-0843-4307-b2b6-cd10dbeb8296/image.png" width="70%" height="70%"></p>
> 
> ###### 출처 : https://jeong-pro.tistory.com/148
> </br>
>
> > ## 1. Method Area
> > - Q. 전혀 모르겠음! 
> > - 필드 정보(클래스 멤버 변수명, 데이터 타입, 접근 제어자 정보)
> > - 메소드 정보(메소드명, 리턴 타입, 접근 제어자 정보)
> > - Type 정보(Interface인지 Class인지)
> > - Constant Pool(상수 풀: 문자 상수, 타입, 필드, 객체 참조 저장)
> > - static 변수
> > - final 클래스 변수 Q. final은 상수 아닌가?
> 
> > ## 2. Heap Area
> > - new 키워드로 생성된 객체와 배열이 생성되는 영역
> > - Method Area에 로드된 class만 생성 가능하며 GC가 참조되지 않은 메모리를 확인하고 제거하는 영역
> 
> > ## 3. Stack Area
> > Q. 무슨 소리지?
> > - 지역변수, 파라미터, 리턴 값, 연산에 사용되는 임시값 등을 저장
> > - int a = 10 을 예로 들면 정수값이 할당될 수 있는 메모리 공간을 a라고 잡아두고 그 메모리 영역에 10을 넣는다.
> > - 클래스 A a = new A()의 경우 A a는 스택영역에 저장되고 new로 생성된 A클래스의 인스턴스는 Heap영역에 생성된다. Q. 특히 여기
> > - 또한 스택영역에 생성된 a는 힙영역의 주소값을 가지고 있다. 즉 a가 heap영역에 생성된 객체를 가리키며 참조하고 있다.
> > - 메소드 호출시마다 개별적으로 스택이 생성된다.
> 
> > ## 4. PC Register
> > - Thread가 생성될 때마다 생성되는 영역으로 Program Counter 즉, 현재 쓰레드가 실행되는 부분의 주소와 명령을 저장하고 있는 영역이다. 
> > - 이것을 이용해 쓰레드를 돌아가면서 수행한다
> 
> > ## 5. Native Method Stack
> > - 자바 외 언어로 작성된 네이티브 코드를 위한 메모리 영역이다  
> > (네이티브 언어 : 컴파일러의 결과물이 특정 CPU의 기계어인 경우. CPU 내에서 곧바로 해석될 수 있다.)
> > Q. 자바는 컴파일 시 ByteCode로 변환 시키니까 네이티브 언어가 아닌건가?
> > - 보통 C/C++등의 코드를 수행하기 위한 스택이다 (JNI)
---
