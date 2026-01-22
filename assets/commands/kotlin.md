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

**kotlin** runs Kotlin scripts and provides a REPL. It executes .kts files directly without separate compilation.

The tool supports scripting use cases. It can run expressions and interact with the JVM ecosystem.

kotlin runs Kotlin scripts.

# CAVEATS

Requires JVM. Scripts use .kts extension. Slower startup than compiled code.

# HISTORY

Kotlin was created by **JetBrains** in 2011. The kotlin command runs scripts and provides the REPL.

# SEE ALSO

[kotlinc](/man/kotlinc)(1), [java](/man/java)(1), [gradle](/man/gradle)(1)
