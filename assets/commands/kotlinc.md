# TAGLINE

kotlin compiler

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

**kotlinc** is the command-line Kotlin compiler that translates Kotlin source files (.kt) into JVM bytecode. It can produce either standalone JAR files with the Kotlin runtime bundled via the `-include-runtime` flag, or output class files to a directory for integration with existing build pipelines.

The compiler supports full interoperability with Java, allowing Kotlin code to call Java libraries and vice versa. It accepts a target JVM version through the `-jvm-target` option, supports adding external dependencies via the classpath, and can compile multiple source files together. For larger projects, build tools like Gradle or Maven are typically preferred, but kotlinc is useful for quick compilation tasks, learning, and scripting workflows.

# CAVEATS

Requires JVM. Slow startup. Consider Gradle for projects.

# HISTORY

kotlinc is the official compiler for **Kotlin**, created by **JetBrains** as a modern JVM language.

# SEE ALSO

[kotlin](/man/kotlin)(1), [javac](/man/javac)(1), [gradle](/man/gradle)(1)
