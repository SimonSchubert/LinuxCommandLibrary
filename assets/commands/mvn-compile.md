# TAGLINE

compiles main source code in a Maven project

# TLDR

**Compile project**

```mvn compile```

**Compile with specific profile**

```mvn compile -P [profile]```

**Compile skipping tests**

```mvn compile -DskipTests```

**Compile offline**

```mvn compile -o```

# SYNOPSIS

**mvn compile** [_options_]

# PARAMETERS

**-P** _profile_
> Activate profile.

**-DskipTests**
> Skip test compilation.

**-o**
> Work offline.

**-q**
> Quiet mode.

**-X**
> Debug mode.

# DESCRIPTION

**mvn compile** compiles main source code in a Maven project. Executes the compile phase of the Maven lifecycle. Compiles src/main/java to target/classes.

# SEE ALSO

[mvn](/man/mvn)(1), [mvn-package](/man/mvn-package)(1), [mvn-install](/man/mvn-install)(1)

