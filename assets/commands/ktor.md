# TAGLINE

CLI for Ktor, a Kotlin framework for building asynchronous servers

# TLDR

**Create a new project** (interactive)

```ktor new```

**Create with specific plugins**

```ktor new --plugins [routing,content-negotiation,ktor-serialization]```

**Create with custom name**

```ktor new --name [myapp]```

**Generate with Gradle Kotlin DSL**

```ktor new --build-system gradle-kotlin```

**List available plugins**

```ktor plugins list```

**Search for plugins**

```ktor plugins search [auth]```

**Show version**

```ktor --version```

# SYNOPSIS

**ktor** _command_ [_options_]

# COMMANDS

**new**
> Create new Ktor project.

**plugins** list|search
> Browse available plugins.

**--version**
> Display CLI version.

**--help**
> Display help information.

# NEW OPTIONS

**--name** _name_
> Project name.

**--package** _package_
> Base package name.

**--plugins** _list_
> Comma-separated plugin list.

**--build-system** _type_
> Build system: gradle-kotlin, gradle-groovy, maven.

**--engine** _engine_
> Server engine: netty, jetty, tomcat, cio.

**--configuration** _type_
> Configuration method: hocon, yaml.

**--ktor-version** _version_
> Ktor version.

**--kotlin-version** _version_
> Kotlin version.

**--output** _path_
> Output directory.

**--interactive**
> Interactive mode.

# PLUGINS

**routing**
> HTTP routing.

**content-negotiation**
> Content type negotiation.

**ktor-serialization-kotlinx-json**
> JSON serialization.

**auth**, **auth-jwt**
> Authentication support.

**call-logging**
> Request logging.

**websockets**
> WebSocket support.

**cors**
> Cross-origin resource sharing.

**sessions**
> Session management.

**status-pages**
> Error handling.

# DESCRIPTION

**ktor** is the CLI for Ktor, a Kotlin framework for building asynchronous servers and clients. It scaffolds new projects with selected features.

**ktor new** generates a project with build files, application configuration, and plugin setup. Plugins add functionality like authentication, serialization, and WebSockets.

Ktor applications configure features in Application.kt using DSL. Plugins are installed in modules: **install(ContentNegotiation)**, **install(Authentication)**, etc.

The framework runs on multiple engines: Netty, Jetty, Tomcat, or CIO (Kotlin coroutines). Choose based on requirements—Netty is default for production.

Configuration via HOCON (application.conf) or YAML specifies ports, hosts, and plugin settings. Environment variables override configuration values.

# CAVEATS

Requires Kotlin knowledge. Plugin compatibility may vary across Ktor versions. CIO engine has limited features compared to Netty. Some plugins require additional configuration.

# HISTORY

Ktor was created by **JetBrains** and first released in **2017**. It was designed as a native Kotlin framework leveraging coroutines for asynchronous programming. Unlike Spring, Ktor is lightweight with explicit configuration. Version 2.0 (2022) brought significant API changes. Ktor is popular for microservices and API development in Kotlin projects.

# SEE ALSO

[gradle](/man/gradle)(1), [kotlin](/man/kotlin)(1), [micronaut](/man/micronaut)(1), [spring-boot](/man/spring-boot)(1)
