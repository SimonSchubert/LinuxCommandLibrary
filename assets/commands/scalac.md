# TLDR

**Compile a Scala source file**

```scalac [Hello.scala]```

**Compile multiple files** to a specific directory

```scalac -d [classes/] [*.scala]```

**Compile with classpath** dependencies

```scalac -classpath [lib/*] [Source.scala]```

**Compile with verbose output**

```scalac -verbose [Source.scala]```

**Compile with additional warnings**

```scalac -Xlint [Source.scala]```

**Treat warnings as errors**

```scalac -Werror [Source.scala]```

**Show compiler version**

```scalac -version```

# SYNOPSIS

**scalac** [_options_] [_source files_]

# PARAMETERS

**-d** _directory|jar_
> Specify where to place generated class files

**-classpath** _path_
> Specify where to find user class files (colon-separated on Unix)

**-bootclasspath** _path_
> Override location of bootstrap class files

**-sourcepath** _path_
> Specify where to find input source files

**-verbose**
> Output messages about what the compiler is doing

**-deprecation**
> Emit warning and location for usages of deprecated APIs

**-unchecked**
> Enable additional warnings for type erasure

**-Werror**
> Fail compilation if there are any warnings

**-Xlint**
> Enable recommended additional warnings

**-version**
> Print product version and exit

**-help**
> Print synopsis of standard options

# DESCRIPTION

**scalac** is the compiler for the Scala programming language. It reads Scala source files (.scala) and compiles them into Java bytecode class files that run on the JVM.

By default, class files are placed in the same directory as their source files. Use **-d** to specify an alternate output directory or JAR file. The compiler integrates with Java classes via the classpath mechanism.

Options are categorized by prefix: **-W** for warnings, **-V** for verbose output, **-X** for extended options, and **-Y** for private/experimental options.

# CAVEATS

The JAVA_HOME environment variable must point to a valid JDK installation. JAVA_OPTS can pass additional options to the underlying JVM. Scala 3 uses a different compiler with some incompatible options.

# HISTORY

Scala was designed by **Martin Odersky** starting in **2001** at EPFL, with the first public release in **2004**. The name stands for "scalable language." Scala 3 (Dotty) was released in **2021** with significant language improvements.

# SEE ALSO

[scala](/man/scala)(1), [javac](/man/javac)(1), [sbt](/man/sbt)(1), [java](/man/java)(1)
