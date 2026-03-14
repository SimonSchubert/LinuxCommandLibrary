# TAGLINE

Spring Boot application framework CLI

# TLDR

**Create new project** (via start.spring.io)

```spring init --dependencies=[web,data-jpa,postgresql] [myapp]```

**Create with specific options**

```spring init --build=[gradle] --java-version=[17] --packaging=[war] [myapp.zip]```

**List available dependencies and options**

```spring init --list```

**Encode a password** using bcrypt

```spring encodepassword [password]```

**Run Spring Boot application** with Maven wrapper

```./mvnw spring-boot:run```

**Run with Gradle** wrapper

```./gradlew bootRun```

**Package as executable JAR**

```./mvnw package```

**Show CLI version**

```spring --version```

# SYNOPSIS

**spring** _command_ [_options_] [_args_...]

**./mvnw** spring-boot:_goal_

**./gradlew** boot_Task_

# SPRING CLI COMMANDS

**init** [_options_] [_location_]
> Create new project from start.spring.io.

**encodepassword** [_options_] _password_
> Encode a password for use with Spring Security.

**shell**
> Start interactive shell.

**version**
> Show CLI version.

**help** [_command_]
> Display help.

# INIT OPTIONS

**-d**, **--dependencies** _list_
> Comma-separated list of dependency identifiers.

**-b**, **--build** _type_
> Build system: maven (default), gradle.

**-j**, **--java-version** _version_
> Java version: 17, 21.

**-l**, **--language** _lang_
> Language: java, kotlin, groovy.

**-n**, **--name** _name_
> Project name.

**-g**, **--group-id** _group_
> Maven group ID.

**-a**, **--artifact-id** _artifact_
> Maven artifact ID.

**-p**, **--packaging** _type_
> Packaging: jar (default), war.

**-v**, **--version** _version_
> Project version (e.g. '0.0.1-SNAPSHOT').

**--boot-version** _version_
> Spring Boot version.

**-x**, **--extract**
> Extract the project archive.

**-f**, **--force**
> Force overwrite of existing files.

**--list**
> List available options and dependencies.

# MAVEN/GRADLE GOALS

**spring-boot:run** / **bootRun**
> Run application.

**spring-boot:build-image** / **bootBuildImage**
> Build OCI container image.

**package** / **bootJar**
> Create executable JAR.

**spring-boot:start** / **bootStart**
> Start application in background.

**spring-boot:stop** / **bootStop**
> Stop background application.

# DESCRIPTION

**spring** CLI and Spring Boot Maven/Gradle plugins manage Spring Boot applications. The CLI scaffolds new projects and encodes passwords; plugins handle building and running. The **run** command was removed in Spring Boot 3.0.

**spring init** fetches project templates from start.spring.io with selected dependencies. Dependencies like web, data-jpa, security add starters that auto-configure functionality.

Running applications during development uses **bootRun** (Gradle) or **spring-boot:run** (Maven). DevTools enables hot reload when included as dependency.

**bootJar** / **package** creates an executable JAR with embedded server. Run with **java -jar app.jar**. **bootBuildImage** creates OCI container images without Dockerfile.

Native image support via GraalVM compiles to native executables with **-Pnative** profile. Requires GraalVM and produces fast-startup binaries.

# CAVEATS

The **spring run** command was removed in Spring Boot 3.0; use Maven/Gradle plugins to run applications. CLI is primarily for project creation. Auto-configuration may conflict with custom config. Native image requires additional metadata. DevTools should be excluded from production.

# HISTORY

Spring Boot was created by **Pivotal** (now VMware) team led by **Phil Webb** and released in **2014**. It simplified Spring Framework development with convention over configuration. Spring Boot 2.0 (2018) updated to Spring Framework 5. Version 3.0 (2022) required Java 17, removed the CLI **run** command, and added native compilation support. Spring Boot is the most widely used Java application framework.

# SEE ALSO

[mvn](/man/mvn)(1), [gradle](/man/gradle)(1), [quarkus](/man/quarkus)(1)
