# zxy-utils

Java 工具类库，提供常用的工具方法。

## 项目信息

- **GroupId**: `io.github.jasperzxy`
- **ArtifactId**: `zxy-utils`
- **Version**: `1.0.0`
- **Java 版本**: 8+

## 快速开始

### Maven 依赖

```xml
<dependency>
    <groupId>io.github.jasperzxy</groupId>
    <artifactId>zxy-utils</artifactId>
    <version>1.0.0</version>
</dependency>
```

## 工具类

### StrUtils

字符串工具类，提供常用的字符串操作方法。

| 方法 | 说明 |
|------|------|
| `isEmpty(String str)` | 判断字符串是否为空（null 或长度为 0） |
| `isNotEmpty(String str)` | 判断字符串是否不为空 |
| `isBlank(String str)` | 判断字符串是否为空白（null、空字符串或仅包含空白字符） |
| `isNotBlank(String str)` | 判断字符串是否不为空白 |
| `reverse(String str)` | 反转字符串 |
| `capitalize(String str)` | 首字母大写 |
| `uncapitalize(String str)` | 首字母小写 |

## 构建

```bash
mvn clean package
```

## 测试

```bash
mvn test
```
