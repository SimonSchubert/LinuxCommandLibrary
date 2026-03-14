# TAGLINE

Modern Scala command-line runner and build tool

# TLDR

**Run Scala script**

```scala-cli [script.sc]```

**Run Scala file**

```scala-cli run [Main.scala]```

**Start REPL**

```scala-cli repl```

**Compile to JAR**

```scala-cli package [src/] -o [app.jar]```

**Run tests**

```scala-cli test [src/]```

**Add a dependency and run**

```scala-cli run --dep [com.lihaoyi::os-lib:0.9.1] [script.scala]```

**Watch for changes and re-run**

```scala-cli run --watch [Main.scala]```

# SYNOPSIS

**scala-cli** [_command_] [_options_] [_inputs_...]

# PARAMETERS

**run**
> Run Scala code.

**repl**
> Start interactive REPL.

**compile**
> Compile sources.

**package**
> Create JAR or native image.

**test**
> Run tests.

**fmt**
> Format code.

**-S** _version_, **--scala** _version_
> Set Scala version (e.g., 3.3, 2.13).

**--dep** _dependency_
> Add dependency (e.g., com.lihaoyi::os-lib:0.9.1).

**-O** _option_
> Scala compiler option.

**-w**, **--watch**
> Watch sources and re-run on changes.

**setup-ide**
> Generate IDE configuration files (BSP).

**publish**
> Publish library to Maven repository.

**--native**
> Compile to Scala Native binary.

**--js**
> Compile to Scala.js JavaScript.

# DESCRIPTION

**scala-cli** is the modern Scala command line tool, adopted as the official `scala` command since Scala 3.5. It runs scripts, compiles projects, manages dependencies, and creates executables. Designed for both learning and production Scala development.

Scala-CLI supports using directives (comments like `//> using dep`) within source files to declare dependencies, Scala versions, and compiler options without a separate build file. This makes it ideal for scripts and small projects.

# CAVEATS

For large multi-module projects, a dedicated build tool like sbt or Mill is more appropriate. Using directives in source files are a Scala-CLI feature and not standard Scala.

# SEE ALSO

[sbt](/man/sbt)(1), [scala](/man/scala)(1), [gradle](/man/gradle)(1)

