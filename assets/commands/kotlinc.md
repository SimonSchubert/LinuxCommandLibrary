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

**Run a compiled JAR** that includes the runtime

```java -jar [output.jar]```

**Evaluate a script**

```kotlinc -script [script.kts]```

**Start the REPL**

```kotlinc -Xrepl```

# SYNOPSIS

**kotlinc** [_options_] _files_

# PARAMETERS

_FILES_
> Kotlin source files (.kt).

**-d** _OUTPUT_
> Output directory, ZIP, or JAR.

**-include-runtime**
> Include the Kotlin runtime in the resulting JAR.

**-cp** _PATH_, **-classpath** _PATH_
> Search for class files in these paths, separated by `:` on Linux and macOS.

**-jvm-target** _VERSION_
> Target JVM bytecode version: 1.8, 9, 10, up to 26 (default: 1.8).

**-no-stdlib**
> Don't automatically include kotlin-stdlib.jar and kotlin-reflect.jar in the classpath.

**-no-reflect**
> Don't automatically include kotlin-reflect.jar in the classpath.

**-no-jdk**
> Don't automatically add the Java runtime to the classpath.

**-jdk-home** _path_
> Use a custom JDK home directory instead of the default JAVA_HOME.

**-language-version** _version_
> Kotlin language version to compile against. Up to the latest three stable versions are accepted.

**-api-version** _version_
> Restrict usage to Kotlin APIs of this version; cannot be higher than **-language-version**.

**-module-name** _name_
> Name for the generated .kotlin_module file.

**-java-parameters**
> Generate metadata for Java 1.8 reflection on method parameters.

**-opt-in** _annotation_
> Enable APIs that require opt-in, by fully qualified annotation name.

**-progressive**
> Apply deprecations and bug fixes for unstable code immediately.

**-P** plugin:_id_:_option_=_value_
> Pass an option to a compiler plugin.

**-script**
> Evaluate the first .kts script among the arguments.

**-Xrepl**
> Start the Kotlin REPL.

**-X**
> Show advanced, unstable options and exit.

**-nowarn**
> Suppress all compiler warnings.

**-Werror**
> Treat all warnings as compilation errors.

**-verbose**
> Enable verbose logging output with compilation details.

**-version**
> Display the compiler version.

**-help**, **-h**
> Display usage information.

# DESCRIPTION

**kotlinc** is the command-line Kotlin compiler that translates Kotlin source files (.kt) into JVM bytecode. It can produce either standalone JAR files with the Kotlin runtime bundled via the `-include-runtime` flag, or output class files to a directory for integration with existing build pipelines.

The compiler supports full interoperability with Java, allowing Kotlin code to call Java libraries and vice versa. It accepts a target JVM version through the `-jvm-target` option, supports adding external dependencies via the classpath, and can compile multiple source files together. For larger projects, build tools like Gradle or Maven are typically preferred, but kotlinc is useful for quick compilation tasks, learning, and scripting workflows.

# CAVEATS

Requires JVM. Slow startup. Consider Gradle for projects.

# HISTORY

kotlinc is the official compiler for **Kotlin**, created by **JetBrains** as a modern JVM language.

# SEE ALSO

[kotlin](/man/kotlin)(1), [javac](/man/javac)(1), [gradle](/man/gradle)(1)

# RESOURCES

```[Source code](https://github.com/JetBrains/kotlin)```

```[Homepage](https://kotlinlang.org)```

```[Documentation](https://kotlinlang.org/docs/compiler-reference.html)```

<!-- verified: 2026-11-09 -->
