# TAGLINE

Scala build tool for JVM projects

# TLDR

**Start an interactive sbt shell** in the current project

```sbt```

**Compile the project**

```sbt compile```

**Run the main class** of the project

```sbt run```

**Run all tests**

```sbt test```

**Run a specific test class**

```sbt "testOnly [com.example.MySpec]"```

**Continuously compile** on file changes

```sbt ~compile```

**Clean and rebuild** the project

```sbt clean compile```

**Package the project** into a JAR file

```sbt package```

# SYNOPSIS

**sbt** [_options_] [_command_...]

# PARAMETERS

**-h**, **--help**
> Display help information

**-v**, **--verbose**
> Enable verbose logging

**--debug**
> Enable debug logging

**-no-colors**
> Disable ANSI color codes in output

**--batch**
> Disable interactive mode

**--sbt-version** _version_
> Use specified sbt version

**--java-home** _path_
> Specify alternate Java installation directory

**-Dkey=val**
> Pass system property to the JVM

**-J-Xfoo**
> Pass JVM option directly (e.g., -J-Xmx2048M)

**-mem** _MB_
> Set memory allocation (e.g., -mem 2048)

# DESCRIPTION

**sbt** (Scala Build Tool) is the standard build tool for Scala projects. It handles compilation, testing, dependency management, packaging, and publishing. sbt uses a build definition written in Scala itself, typically in **build.sbt**.

sbt operates in two modes: **batch mode** where commands are passed as arguments and sbt exits after execution, and **interactive mode** where sbt starts a shell for continuous interaction. The interactive shell provides faster feedback since the JVM stays running between commands.

Key features include **incremental compilation** (only recompiling changed files), **continuous execution** using the **~** prefix (e.g., ~test runs tests on every file save), and **cross-building** for multiple Scala versions using **+** prefix.

# COMMON COMMANDS

**compile**
> Compile main sources

**test**
> Run all tests

**run**
> Run the main class

**console**
> Start Scala REPL with project classpath

**clean**
> Delete generated files (target directory)

**reload**
> Reload build definition

**update**
> Resolve and download dependencies

**package**
> Create JAR file from compiled classes

**publish**
> Publish artifacts to configured repository

**publishLocal**
> Publish artifacts to local Ivy repository

# CAVEATS

sbt can be memory-intensive; large projects may require increasing heap size via **SBT_OPTS** or **.jvmopts**. The first run downloads dependencies and may be slow. Build definitions have their own learning curve with settings, tasks, and scopes.

# HISTORY

sbt was created by **Mark Harrah** in **2008** and has become the de facto build tool for Scala projects. It was originally called "Simple Build Tool" but the name was later de-emphasized. The project is now maintained by **Lightbend** (formerly Typesafe) and the Scala community. Version 1.0 was released in **2017**, bringing significant improvements to build semantics and performance.

# SEE ALSO

[scala](/man/scala)(1), [scalac](/man/scalac)(1), [gradle](/man/gradle)(1), [maven](/man/maven)(1)
