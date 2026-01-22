# TLDR

**Compile Kotlin file**

```kotlinc [file.kt] -include-runtime -d [output.jar]```

**Compile to class files**

```kotlinc [file.kt] -d [output_dir]```

**Compile multiple files**

```kotlinc [file1.kt] [file2.kt] -d [output.jar]```

**Add classpath**

```kotlinc -cp [lib.jar] [file.kt] -d [output.jar]```

**Compile with JVM target**

```kotlinc -jvm-target [17] [file.kt] -d [output.jar]```

# SYNOPSIS

**kotlinc** [_options_] _files_

# PARAMETERS

_FILES_
> Kotlin source files (.kt).

**-d** _OUTPUT_
> Output JAR or directory.

**-include-runtime**
> Include Kotlin runtime.

**-cp** _PATH_
> Classpath.

**-jvm-target** _VERSION_
> Target JVM version.

**-no-stdlib**
> Don't include stdlib.

**--help**
> Display help information.

# DESCRIPTION

**kotlinc** is the Kotlin compiler. It compiles Kotlin source files to JVM bytecode.

The compiler produces JAR files or class directories. It supports Java interop and various JVM targets.

kotlinc compiles Kotlin code.

# CAVEATS

Requires JVM. Slow startup. Consider Gradle for projects.

# HISTORY

kotlinc is the official compiler for **Kotlin**, created by **JetBrains** as a modern JVM language.

# SEE ALSO

[kotlin](/man/kotlin)(1), [javac](/man/javac)(1), [gradle](/man/gradle)(1)
