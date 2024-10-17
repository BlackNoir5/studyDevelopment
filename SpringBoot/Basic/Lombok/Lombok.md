# Lombok

스프링 프로젝트의 빠르고 간편한 생산성을 위해서 구현된 @annotation 친화적 프레임워크

### plugin
Lombok은 사용하기 위해서 통합 개발 환경 내에서 설정해줄 필요가 있다.

1. file -> settings 선택 (OS에 따라 IntelliJ IDEA 선택)
2. plugin 검색
3. Lombok 검색 후 install
4. 통합 개발 환경 창을 껏다가 켜서 적용 후 사용
5. Lombok 사용을 위해서 dependancies 설정 필수


```java:build.gradle

dependencies {
	compileOnly 'org.projectlombok:lombok'
	annotationProcessor 'org.projectlombok:lombok'
}

```

### Annotation 설정

위 과정을 완료하고 @Data나 @AllArgsConstructor를 사용 후 실행을 눌러 프로젝트가 빌드를 시도하면 Lombok설정을 했지만 Annotation 메소드를 찾을 수 없다고한다.
이때 Annotation 설정을 진행해야하는데 과정은 다음과 같다.

1. file -> settings 선택 (OS에 따라 IntelliJ IDEA 선택)
2. build -> compiler -> Annotation Processors 선택
3. enable annotation processing 체크박스 활성화
   
