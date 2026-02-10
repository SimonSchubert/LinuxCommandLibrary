# TAGLINE

builds the project and creates a distributable package

# TLDR

**Build package**

```mvn package```

**Build skipping tests**

```mvn package -DskipTests```

**Build with profile**

```mvn package -P [production]```

**Build clean package**

```mvn clean package```

# SYNOPSIS

**mvn package** [_options_]

# PARAMETERS

**-DskipTests**
> Skip test execution.

**-Dmaven.test.skip**
> Skip test compilation and execution.

**-P** _profile_
> Activate profile.

**-o**
> Work offline.

**-T** _threads_
> Parallel builds.

# DESCRIPTION

**mvn package** builds the project and creates a distributable package (JAR, WAR, etc.). Executes compile, test, and package phases. Output goes to target/ directory.

# SEE ALSO

[mvn](/man/mvn)(1), [mvn-install](/man/mvn-install)(1), [mvn-compile](/man/mvn-compile)(1)

