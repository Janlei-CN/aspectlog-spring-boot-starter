# 自定义Spring Boot Starter
## 第一步 创建项目名规则
>Do not start your module names with spring-boot, even if you use a different Maven groupId. We may offer official support for the thing you auto-configure in the future.
As a rule of thumb, you should name a combined module after the starter.
>  
**命名潜规则**  
spring-boot-starter-XX是springboot官方的starter
XX-spring-boot-starter是第三方扩展的starter
## 第二步 写自动配置逻辑
## 第三步 META-INF/spring.factories
META-INF/spring.factories是spring的工厂机制，在这个文件中定义的类，都会被自动加载。
## 第四步 打包测试
使用mvn install将jar包打包存入maven本地库