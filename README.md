# Park_PR
혹시 모를 외주를 맡길 때를 대비해서 세팅만 잡아주는 역할 -- 비용 절감을 위해서 하는 거니 세팅만 잡을게욤 주사님ㅎㅎ

> 모놀리식 아키텍처 방식이라고 하나의 서버 안에 기능들을 전부 넣는 방향으로 진행했습니다!! 이 부분 참고 바랍니다!!!

## 기술 스택

### 📚 Tech Stack
#### 💻 Development
<img src="https://skillicons.dev/icons?i=java,spring,mysql,docker,netlify& perline="/>

#### ⌛ Developed Period
##### 2023.12.31

## 진행 방식

**도커 파일 작성:**
```dockerfile
# 기본 이미지 선택
FROM some-base-image

# 작업 디렉토리 설정
WORKDIR /usr/src/app

# ARG 속성 추가 - 여러번 사용되는 문자열이나 숫자 등을 변수로 만들어주는 속성
ARG JAR_PATH=./build/libs

# 로컬 빌드 경로에서 JAR 파일을 이미지로 복사
COPY ./build/libs/app1-0.0.1-SNAPSHOT.jar ./build/libs/app1-0.0.1-SNAPSHOT.jar

# 애플리케이션 실행 명령어 설정
CMD ["java","-jar","./build/libs/app1-0.0.1-SNAPSHOT.jar"]
```

### 도커 이미지 빌드
```
docker build -t springbootapp .
```

### 도커 컨테이너 생성 및 실행
```
docker run -d --name my_app_container springbootapp
```


# 이슈사항
> 필요 이슈사항 아래에 작성 바랍니다.

-
- 

### 💡 웹사이트 기능 소개
> 회원 기능
- 회원가입 및 로그인, 아이디 찾기, 비밀번호 찾기

> 커뮤니티
- 공지사항, 자유게시판, FAQ, Q&A, 자료실

> 관리자
- 회원관리, 공지사항 관리, FAQ관리, 자유게시판관리

> 고객센터
- 문의사항, 자주 묻는 질문

> 게시판
- 정책 자료실, 소통합니다, 등등....
  <br>

## 💡 Commit Convention

|       Tags       |               Explanation               |
| :--------------: | :-------------------------------------: |
|       Feat       |            새로운 기능 추가             |
|       Fix        |                버그 수정                |
| !BREAKING CHANGE |         커다란 API 변경의 경우          |
|     !HOTFIX      |          급한 치명적 버그 수정          |
|      Build       |           빌드 관련 파일 수정           |
|      Design      |        CSS를 포함 UI 디자인 변경        |
|       Docs       |                문서 수정                |
|      Style       | 코드 포맷팅, 세미콜론 누락, 코드 변경 X |
|     Refactor     |              코드 리팩토링              |
|     Comment      |        필요한 주석 추가 및 변경         |
|       Test       |            테스트 코드 수정             |
|      Rename      |         파일, 폴더명 이름 수정          |
|      Remove      |             파일, 폴더 삭제             |
|      chore       |            빌드, 패키지 수정            |
