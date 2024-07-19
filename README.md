# Portfolio API Testing Framework

This project is an API testing framework built using Rest Assured, JUnit 5, and Maven. 

## Project Structure

```
java-rest-assured-framework/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── com/
│   │   │   │   ├── PortfolioApiTest/
│   │   │   │   │   ├── api/
│   │   │   │   │   │   ├── ApiClient.java
│   │   │   │   │   ├── config/
│   │   │   │   │   │   ├── Config.java
│   │   │   │   │   ├── services/
│   │   │   │   │   │   ├── PostService.java
│   │   │   │   │   │   ├── CommentService.java
│   │   │   │   │   │   ├── UserService.java
│   │   │   │   │   │   ├── AlbumService.java
│   │   │   │   │   │   ├── PhotoService.java
│   │   │   │   │   │   ├── TodoService.java
│   │   │   │   │   ├── utils/
│   │   │   │   │   │   ├── Helpers.java
│   │   │   │   │   │   ├── LoggingUtils.java
│   │   │   │   │   ├── .env
│   ├── test/
│   │   ├── java/
│   │   │   ├── com/
│   │   │   │   ├── PortfolioApiTest/
│   │   │   │   │   ├── tests/
│   │   │   │   │   │   ├── TestPosts.java
│   │   │   │   │   │   ├── TestComments.java
│   │   │   │   │   │   ├── TestUsers.java
│   │   │   │   │   │   ├── TestAlbums.java
│   │   │   │   │   │   ├── TestPhotos.java
│   │   │   │   │   │   ├── TestTodos.java
│   │   ├── resources/
│   │   │   ├── data/
│   │   │   │   ├── albums_test_data.json
│   │   │   │   ├── comments_test_data.json
│   │   │   │   ├── photos_test_data.json
│   │   │   │   ├── posts_test_data.json
│   │   │   │   ├── todos_test_data.json
│   │   │   │   ├── users_test_data.json
├── .github/
│   ├── workflows/
│   │   ├── ci.yml
├── .env
├── .gitignore
├── README.md
├── pom.xml
```

