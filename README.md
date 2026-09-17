# Try-Kotlin - simple api

Kotlin / Spring Boot の学習を目的としたシンプルな REST API プロジェクトです。

CRUD API の実装を通して、Spring Boot による Web API 開発や
Spring Data JPA を利用したデータベース操作を学習します。

## Tech Stack

- Kotlin
- Spring Boot
- Spring Web
- Spring JDBC
- Spring Boot DevTools
- SQLite
- Gradle

## Getting Started

### Requirements

- Java 21 (JDK)

### Run

Windows

```bash
gradlew.bat bootRun
```

macOS / Linux

```bash
./gradlew bootRun
```

**アプリケーションは以下の URL で起動します。**

`http://localhost:8080`

## API

| メソッド | エンドポイント | 説明     |
| -------- | -------------- | -------- |
| GET      | `/`            | 動作確認 |

### GET /

アプリケーションの動作確認用エンドポイントです。

**Response**

```text
Hello Spring!
```

_Status: 200 OK_
