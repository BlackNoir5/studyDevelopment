# JPA (Java Persistent API)
JPA는 ORM이다!

### ORM(Object Relational Mapping)
- RDB 데이터베이스의 정보를 객체지향으로 손쉽게 활용할 수 있도록 도와주는 도구
- Object와 Relaion 둘간의 맵핑을 통해 보다 손쉽게 접근할 수 있는 기술을 제공한다.
- 쿼리에 집중하기보다 객체에 집중함으로써 프로그래밍 적으로 많이 사용할 수 있다.

### build.gradle - dependencies 설정

```java
  dependencies {

  	implementation 'org.springframework.boot:spring-boot-starter-data-jpa'
        // spring-boot-starter-data-jpa dependency 설정

  	runtimeOnly 'com.mysql:mysql-connector-j'
        // mysql-connector-j dependency 설정  
  }
```

### application properties 설정

```java
  # db source url
  spring.datasource.url = jdbc:mysql://localhost:3306/study?useSSL=false&useUnicode=true&serverTimezone=Asia/Seoul
  
  #db response name
  spring.datasource.username = root
  
  #db response password
  spring.datasource.password = root
```
