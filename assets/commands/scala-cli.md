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

**--scala** _version_
> Scala version.

**--dep** _dependency_
> Add dependency.

**-O** _option_
> Scala compiler option.

# DESCRIPTION

**scala-cli** is the modern Scala command line tool. Runs scripts, compiles projects, manages dependencies, and creates executables. Designed for both learning and production Scala development.

# SEE ALSO

[sbt](/man/sbt)(1), [scala](/man/scala)(1)

