# TLDR

**Create new project**

```quarkus create app [com.example:myapp]```

**Start development mode**

```quarkus dev```

**Build native executable**

```quarkus build --native```

**Add extension**

```quarkus extension add [resteasy-reactive]```

**List extensions**

```quarkus extension list```

**Search extensions**

```quarkus extension search [jdbc]```

**Build JAR**

```quarkus build```

**Run tests**

```quarkus test```

# SYNOPSIS

**quarkus** [_create_] [_dev_] [_build_] [_extension_] [_options_] [_args_]

# PARAMETERS

**create app** _NAME_
> Create new application.

**create cli**
> Create CLI application.

**dev**
> Development mode with live reload.

**build**
> Build application.

**build --native**
> Build native executable.

**test**
> Run tests.

**extension add** _EXT_
> Add extension.

**extension list**
> List project extensions.

**extension search** _QUERY_
> Search available extensions.

**deploy**
> Deploy application.

**image build**
> Build container image.

**--help**
> Show help.

**--version**
> Show version.

# DESCRIPTION

**quarkus** is the CLI for Quarkus, a Kubernetes-native Java framework. It creates, builds, and runs Quarkus applications.

Development mode provides live reload. Code changes trigger automatic restart. Dev services spin up databases and other dependencies automatically.

Native compilation uses GraalVM to produce standalone executables. These start in milliseconds and use less memory than traditional Java.

Extensions add functionality: REST APIs, database access, messaging, security, and more. The extension catalog covers most enterprise needs.

Container image building integrates with Docker, Podman, and Kubernetes. Images can use JVM or native mode.

The framework targets microservices and serverless deployments where fast startup and low memory are critical.

# CAVEATS

Native compilation takes time and memory. Some Java libraries don't work in native mode. GraalVM required for native builds.

# HISTORY

**Quarkus** was released by **Red Hat** in **2019** as a "supersonic, subatomic Java" framework. It was designed from the ground up for container and Kubernetes deployments, addressing Java's traditional weaknesses in startup time and memory.

# SEE ALSO

[mvn](/man/mvn)(1), [gradle](/man/gradle)(1), [java](/man/java)(1), [docker](/man/docker)(1)
