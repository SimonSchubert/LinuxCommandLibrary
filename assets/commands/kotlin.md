# TAGLINE

runs Kotlin scripts and provides a REPL

# TLDR

**Run Kotlin script**

```kotlin [script.kts]```

**Run with arguments**

```kotlin [script.kts] [arg1] [arg2]```

**REPL mode**

```kotlin```

**Execute expression**

```kotlin -e "println(\"Hello\")"```

**Include classpath**

```kotlin -cp [lib.jar] [script.kts]```

# SYNOPSIS

**kotlin** [_options_] _script_ [_args_...]

# PARAMETERS

_SCRIPT_
> Kotlin script file (.kts).

**-e** _EXPR_
> Evaluate expression.

**-cp** _PATH_
> Classpath.

**-J** _ARG_
> Pass argument to JVM.

**--help**
> Display help information.

# DESCRIPTION

**kotlin** is the Kotlin runtime command that executes Kotlin scripts (.kts files) directly on the JVM without requiring a separate compilation step. It also provides an interactive Read-Eval-Print Loop (REPL) when invoked with no arguments, allowing you to experiment with Kotlin expressions and statements interactively.

The tool can evaluate single expressions from the command line using the `-e` flag, run script files with command-line arguments, and include additional JARs on the classpath for access to external libraries. Since Kotlin scripts run on the JVM, they have full access to the Java standard library and any Java or Kotlin libraries added to the classpath, making it suitable for automation tasks, quick prototyping, and build scripting.

# CAVEATS

Requires JVM. Scripts use .kts extension. Slower startup than compiled code.

# HISTORY

Kotlin was created by **JetBrains** in 2011. The kotlin command runs scripts and provides the REPL.

# SEE ALSO

[kotlinc](/man/kotlinc)(1), [java](/man/java)(1), [gradle](/man/gradle)(1)
