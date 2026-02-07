# TAGLINE

run JVM applications from Maven coordinates

# TLDR

**Launch an application** by Maven coordinates

```cs launch [org.scalameta::metals:latest.stable]```

**Launch with arguments** passed to the application

```cs launch [com.lihaoyi::ammonite:2.5.9] -- [--help]```

**Launch with a specific main** class

```cs launch [org.example::app:1.0] -M [com.example.Main]```

**Launch from custom repository**

```cs launch -r [https://repo.example.com/maven] [org.example::app:1.0]```

**Launch with extra JVM** options

```cs launch [app:version] --java-opt [-Xmx2G]```

**Launch and fork** to background

```cs launch --fork [app:version]```

# SYNOPSIS

**cs launch** [_options_] _coordinates_ [-- _app-args_]

# PARAMETERS

_COORDINATES_
> Maven coordinates (groupId::artifactId:version for Scala, groupId:artifactId:version for Java).

**-M** _CLASS_, **--main-class** _CLASS_
> Specify the main class to run.

**-r** _URL_, **--repository** _URL_
> Add a custom Maven repository.

**--java-opt** _OPT_
> JVM options passed to the launched application.

**--fork**
> Fork the process and return immediately.

**--standalone**
> Include all dependencies in classpath.

**--**
> Separator between cs options and application arguments.

**-q**, **--quiet**
> Suppress coursier output.

# DESCRIPTION

**cs launch** runs JVM applications directly from their Maven coordinates without prior installation. It resolves dependencies, downloads artifacts, and executes the application in a single command.

This enables trying applications without installing them, running specific versions for testing, or scripting application execution. Dependencies are cached, so subsequent launches of the same version are fast.

The command supports both Scala (using :: for cross-versioning) and Java artifacts. It can launch any artifact with a main class defined in its manifest or explicitly specified.

# CAVEATS

First launch downloads dependencies which takes time. Network connectivity required for new artifacts. Large applications with many dependencies consume significant cache space. Some applications may require specific JVM versions.

# HISTORY

cs launch is part of Coursier, created by Alexandre Archambault. The launch functionality enables the "run without install" workflow popularized by tools like npx, applied to the JVM ecosystem.

# SEE ALSO

[cs](/man/cs)(1), [cs-resolve](/man/cs-resolve)(1), [java](/man/java)(1), [scala](/man/scala)(1)
