# TLDR

**Create new project** (via start.spring.io)

```spring init --dependencies=[web,data-jpa,postgresql] [myapp]```

**Create with specific options**

```spring init --build=[gradle] --java-version=[17] --name=[myapp] [myapp]```

**Run Spring Boot application**

```./mvnw spring-boot:run```

**Run with Gradle**

```./gradlew bootRun```

**Package as JAR**

```./mvnw package```

**Build native image**

```./mvnw -Pnative native:compile```

**List available dependencies**

```spring init --list```

**Show version**

```spring --version```

# SYNOPSIS

**spring** _command_ [_options_] [_args_...]

**./mvnw** spring-boot:_goal_

**./gradlew** boot_Task_

# SPRING CLI COMMANDS

**init** [_options_] [_location_]
> Create new project from start.spring.io.

**shell**
> Start interactive shell.

**version**
> Show CLI version.

**help** [_command_]
> Display help.

# INIT OPTIONS

**-d**, **--dependencies** _list_
> Project dependencies.

**-b**, **--build** _type_
> Build system: maven, gradle.

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
> Packaging: jar, war.

**--boot-version** _version_
> Spring Boot version.

**--list**
> List available options.

# MAVEN/GRADLE GOALS

**spring-boot:run** / **bootRun**
> Run application.

**spring-boot:build-image** / **bootBuildImage**
> Build container image.

**package** / **bootJar**
> Create executable JAR.

**spring-boot:start** / **bootStart**
> Start application in background.

**spring-boot:stop** / **bootStop**
> Stop background application.

# DESCRIPTION

**spring** CLI and Spring Boot Maven/Gradle plugins manage Spring Boot applications. The CLI scaffolds new projects; plugins handle building and running.

**spring init** fetches project templates from start.spring.io with selected dependencies. Dependencies like web, data-jpa, security add starters that auto-configure functionality.

Running applications during development uses **bootRun** (Gradle) or **spring-boot:run** (Maven). DevTools enables hot reload when included as dependency.

**bootJar** / **package** creates an executable JAR with embedded server. Run with **java -jar app.jar**. **bootBuildImage** creates OCI container images without Dockerfile.

Native image support via GraalVM compiles to native executables with **-Pnative** profile. Requires GraalVM and produces fast-startup binaries.

# CAVEATS

CLI primarily for project creation; Maven/Gradle for ongoing development. Auto-configuration may conflict with custom config. Native image requires additional metadata. DevTools should be excluded from production.

# HISTORY

Spring Boot was created by **Pivotal** (now VMware) team led by **Phil Webb** and released in **2014**. It simplified Spring Framework development with convention over configuration. Spring Boot 2.0 (2018) updated to Spring Framework 5. Version 3.0 (2022) required Java 17 and added native compilation support. Spring Boot is the most widely used Java application framework.

# SEE ALSO

[mvn](/man/mvn)(1), [gradle](/man/gradle)(1), [micronaut](/man/micronaut)(1), [quarkus](/man/quarkus)(1)
