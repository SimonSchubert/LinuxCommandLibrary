# TLDR

**Start REPL**

```scala```

**Run script**

```scala [script.scala]```

**Run with classpath**

```scala -cp [lib.jar] [script.scala]```

**Evaluate expression**

```scala -e "println(1 + 2)"```

**Run compiled class**

```scala [ClassName]```

**With specific JVM memory**

```scala -J-Xmx[2g] [script.scala]```

**Run in explain mode**

```scala -explain [script.scala]```

# SYNOPSIS

**scala** [_-cp classpath_] [_-e expr_] [_options_] [_script_] [_args_]

# PARAMETERS

**-cp** _PATH_
> Set classpath.

**-e** _EXPR_
> Evaluate expression.

**-J** _FLAG_
> Pass flag to JVM.

**-deprecation**
> Show deprecation warnings.

**-explain**
> Explain errors in detail.

**-feature**
> Show feature warnings.

**-help**
> Show help.

**-print-lines**
> Show line numbers.

**-source** _VERSION_
> Source compatibility version.

**-version**
> Show version.

**-X**
> Show advanced options.

**-Y**
> Show private options.

# DESCRIPTION

**scala** runs Scala programs and provides an interactive REPL. Scala combines object-oriented and functional programming on the JVM.

The REPL evaluates expressions and shows results with types. Tab completion helps explore APIs. :help shows REPL commands.

Scripts run directly without compilation. The Scala 3 runner can execute .scala files as scripts with dependencies.

Classpath specifies libraries and compiled classes. Maven coordinates can specify dependencies in Scala 3.

Compiler explanations help understand complex error messages. The explain mode provides detailed reasoning.

The language supports type inference, pattern matching, implicits, and higher-order functions. It interoperates with Java seamlessly.

# CAVEATS

Scala 3 differs significantly from Scala 2. JVM startup adds latency. Memory usage can be high. Some features have learning curve.

# HISTORY

**Scala** was designed by **Martin Odersky** at **EPFL** in Switzerland, with version 1.0 released in **2004**. Scala 3 (Dotty), released in **2021**, brought significant language improvements.

# SEE ALSO

[scalac](/man/scalac)(1), [sbt](/man/sbt)(1), [java](/man/java)(1), [kotlin](/man/kotlin)(1)
