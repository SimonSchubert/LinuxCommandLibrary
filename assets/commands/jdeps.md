# TAGLINE

analyzes Java class dependencies

# TLDR

**Analyze class dependencies**

```jdeps [class.jar]```

**Show package-level dependencies**

```jdeps -s [class.jar]```

**Check for JDK internal API usage**

```jdeps --jdk-internals [class.jar]```

**Generate module-info**

```jdeps --generate-module-info [dir] [class.jar]```

**Analyze specific package**

```jdeps -p [com.example] [class.jar]```

**Multi-release JAR analysis**

```jdeps --multi-release [17] [class.jar]```

# SYNOPSIS

**jdeps** [_options_] _path_...

# PARAMETERS

_PATH_
> JAR file or class directory.

**-s**, **--summary**
> Summary level output.

**--jdk-internals**
> Check for internal API use.

**--generate-module-info** _DIR_
> Generate module-info.java.

**-p** _PACKAGE_
> Analyze specific package.

**--multi-release** _VERSION_
> Analyze multi-release JAR.

**--help**
> Display help information.

# DESCRIPTION

**jdeps** analyzes Java class dependencies. It shows which packages and modules a JAR depends on.

The tool helps with Java module migration. It identifies use of internal JDK APIs that may break in future versions.

# CAVEATS

Part of JDK. Requires class files not source. Output format may vary.

# HISTORY

jdeps was added in **JDK 8** to help developers understand dependencies and prepare for the Java module system in JDK 9.

# SEE ALSO

[javap](/man/javap)(1), [java](/man/java)(1), [jar](/man/jar)(1)
