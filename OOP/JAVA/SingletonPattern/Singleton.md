# Singleton Pattern

### 싱글톤 패턴이란?
- 프로그램에서 인스턴스가 단 한 개만 생성되어야 하는 경우 사용하는 디자인 패턴
- static 변수, 메서드를 활용하여 구현 할 수 있음

### 싱글톤 패턴으로 자동차 객체 구현하기

```java : Car.java
  public class Car {
     
     private int carNum=10000;
     private static int idx=0;
  
     public Car(){
         idx++;
         carNum +=idx;
     }
  
     public int getCarNum(){
         return this.carNum;
     }
      
  }
```



```java : CarFactory.java
  public class CarFactory {
      // private 생성자
      private CarFactory(){};
      // 인스턴스 생성
      private static CarFactory instance = new CarFactory();

      public static CarFactory getInstance() {
              
          if( instance == null) {
              instance = new CarFactory();
          }
          return instance;
              
      }
  
      public Car createCar(){
          Car car = new Car();
          return car;
      }
      
  }
```

```java : SingletonMain.java
  public class SingletonMain {

  	public static void main(String[] args) {
  		CarFactory factory = CarFactory.getInstance(); // 유일하게 선언된 Instance를 사용
  		Car mySonata = factory.createCar();
  		Car yourSonata = factory.createCar();
  		
  		System.out.println(mySonata.getCarNum());     //10001 출력
  		System.out.println(yourSonata.getCarNum());   //10002 출력
  	}
  }
```
