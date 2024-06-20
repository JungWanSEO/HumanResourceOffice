#기본 이미지로 openjdk:17을 사용할 것임을 의미.
#SpringBoot의 버전이 3.x.x인 경우, openjdk의 버전이 반드시 17 이상.
FROM openjdk:17
#변수에는 현재 디렉토리(build > libs)에 위치한 jar 파일이 저장된다.
ARG JAR_FRIE=/build/libs/*.jar
#JAR_FILE 변수를 컨테이너 경로로 복사한다.
COPY ${JAR_FILE} /app.jar
#ENTRYPOINT: 컨테이너가 시작될 때, 실행할 스크립트를 지정한다.
ENTRYPOINT ["java", "-jar", "/app.jar"]