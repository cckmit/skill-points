## 简介<br/> 

父项目是一个maven项目，继承spring-boot-starter-parent，同时引入了部分公用依赖<br/>

```xml
    <!--  父类继承spring-boot-starter-parent  -->
    <parent>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-parent</artifactId>
        <version>2.1.0.RELEASE</version>
        <relativePath/>
    </parent>

    <!-- 在父类引入一下通用的依赖 -->
    <dependencies>
        <!-- spring-boot-starter -->
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter</artifactId>
        </dependency>

        <!-- springboot web(MVC)-->
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>

        <!-- springboot -->
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-test</artifactId>
            <scope>test</scope>
        </dependency>

        <!--lombok插件 -->
        <dependency>
            <groupId>org.projectlombok</groupId>
            <artifactId>lombok</artifactId>
        </dependency>

        <!--热部署工具dev-tools-->
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-devtools</artifactId>
            <optional>true</optional>
            <scope>runtime</scope>
        </dependency>
    </dependencies>
```
<br/>每个子项目都是一个独立的SpringBoot项目，子项目直接继承父类<br/>
```xml
    <!--继承父类-->
    <parent>
        <groupId>cn.huanzi.qch</groupId>
        <artifactId>parent</artifactId>
        <version>1.0.0</version>
    </parent>
```
<br/>


## 学习资料<br/>
Spring全家桶的GitHub：https://github.com/spring-projects <br/>
SpringBoot官方文档：https://spring.io/projects/spring-boot <br/>
StringBoot官方GitHub：https://github.com/spring-projects/spring-boot <br/>
SpringBoot官方的简单引导案例：https://github.com/spring-projects/spring-boot/tree/v2.1.6.RELEASE/spring-boot-samples <br/>

这些资料有丰富的文档介绍、代码示例 <br/>