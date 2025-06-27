# Rest API Demo for API Testing

这是一个基于 Spring Boot 的简单 REST API 示例项目，用于演示如何构建和测试基本的 API 接口。

## 📦 项目功能

- 提供基础的数学运算接口（加法、减法、乘法、除法）
- 返回 "Hello, World!" 的 GET 接口
- 集成 Swagger UI，方便查看和测试 API 接口
- 支持 Gradle 构建和本地运行

## 🚀 快速开始

### 环境要求

- Java 17 或更高版本
- Gradle（推荐使用 Wrapper）
- Git（可选）

### 构建项目

bash
./gradlew build

### 运行项目
bash 
./gradlew bootRun

访问 `http://localhost:8080/api/hello` 查看 Hello World 接口输出。

### 访问 Swagger 文档

启动服务后，访问以下地址查看 API 文档： 
http://localhost:8080/swagger-ui.html

## 📁 项目结构

src 
├── main 

│ ├── java 

│ │ └── org.wanjinzhuo.restapidemoforapitesting 

│ │ ├── CalculatorController.java 

│ │ └── RestApiDemoforApiTestingApplication.java 

│ └── resources 

│ └── application.properties 

└── README.md

## 🧪 API 列表

| 方法 | 路径 | 描述 |
|------|------|------|
| GET | `/api/hello` | 返回 "Hello, World!" |
| GET | `/api/add/{a}/{b}` | 返回两个数的和 |
| GET | `/api/subtract/{a}/{b}` | 返回两个数的差 |
| GET | `/api/multiply/{a}/{b}` | 返回两个数的积 |
| GET | `/api/divide/{a}/{b}` | 返回两个数的商 |

## 📝 License

MIT License - see the [LICENSE](LICENSE) file for details.







