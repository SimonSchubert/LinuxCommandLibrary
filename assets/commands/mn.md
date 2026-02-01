# TLDR

**Create a new application**

```mn create-app [com.example.myapp]```

**Create with specific features**

```mn create-app [com.example.myapp] --features [postgres,hibernate-jpa]```

**Create a function**

```mn create-function [com.example.myfunction]```

**Create a CLI application**

```mn create-cli-app [com.example.mycli]```

**Generate a controller**

```mn create-controller [User]```

**Generate a service bean**

```mn create-bean [UserService]```

**List available features**

```mn feature-diff --features```

**Start interactive mode**

```mn```

# SYNOPSIS

**mn** _command_ [_options_] [_args_...]

# COMMANDS

**create-app** _name_
> Create new Micronaut application.

**create-function** _name_
> Create serverless function project.

**create-cli-app** _name_
> Create CLI application.

**create-grpc-app** _name_
> Create gRPC application.

**create-messaging-app** _name_
> Create messaging application.

**create-controller** _name_
> Generate controller class.

**create-bean** _name_
> Generate service bean.

**create-client** _name_
> Generate HTTP client.

**create-job** _name_
> Generate scheduled job.

**create-test** _name_
> Generate test class.

**feature-diff**
> Compare feature differences.

# PARAMETERS

**--features** _list_
> Comma-separated feature list.

**--build** _tool_
> Build tool: gradle (default), gradle-kotlin, maven.

**--lang** _language_
> Language: java (default), kotlin, groovy.

**--jdk** _version_
> Target JDK version.

**--test** _framework_
> Test framework: junit, spock, kotest.

**--inplace**
> Create in current directory.

**-i**, **--interactive**
> Interactive mode.

# FEATURES

**data-jdbc**, **data-jpa**, **hibernate-jpa**
> Database access options.

**postgres**, **mysql**, **h2**
> Database drivers.

**security-jwt**, **security-oauth2**
> Security features.

**kafka**, **rabbitmq**, **nats**
> Messaging integration.

**graalvm**
> Native image support.

**openapi**
> OpenAPI/Swagger documentation.

**graphql**
> GraphQL support.

# DESCRIPTION

**mn** is the Micronaut CLI for scaffolding applications and generating code. Micronaut is a JVM framework for building cloud-native microservices.

**create-app** generates a project with build files, application class, and configuration. Features add dependencies and configuration automatically.

Micronaut uses compile-time dependency injection—no reflection at runtime. This enables fast startup and low memory, especially with GraalVM native images.

Code generators (**create-controller**, **create-bean**, etc.) add classes following Micronaut conventions. Generated code includes annotations for injection, HTTP routing, and testing.

Interactive mode provides tab completion for commands and features. Use **feature-diff** to see what a feature adds to the project.

# CAVEATS

Compile-time DI requires annotation processors configured correctly. Some features may conflict. Native image requires GraalVM and additional configuration. Generator creates files in conventional locations.

# HISTORY

Micronaut was created by **Graeme Rocher** (creator of Grails) at **Object Computing, Inc.** and released in **2018**. It was designed to address startup time and memory issues in traditional frameworks like Spring. Micronaut pioneered compile-time DI in the Java ecosystem. Version 4.0 (2023) brought modular architecture. The framework is popular for serverless and Kubernetes deployments.

# SEE ALSO

[gradle](/man/gradle)(1), [maven](/man/maven)(1), [quarkus](/man/quarkus)(1), [spring-boot](/man/spring-boot)(1)
