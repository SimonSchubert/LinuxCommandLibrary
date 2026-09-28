# TAGLINE

analyzes Java class dependencies

# TLDR

**Analyze package-level dependencies** of a JAR

```jdeps [app.jar]```

**Print a dependency summary** (one line per JAR/module)

```jdeps -s [app.jar]```

**Show class-level dependencies**

```jdeps -verbose:class [app.jar]```

**Check for JDK internal API usage**

```jdeps --jdk-internals [app.jar]```

**Print the JDK modules needed**, ready for **jlink --add-modules**

```jdeps --print-module-deps --ignore-missing-deps --class-path '[lib/*]' [app.jar]```

**Generate module-info.java** for a JAR

```jdeps --generate-module-info [output_dir] [app.jar]```

**Find dependencies on a specific package**

```jdeps -p [com.example] [app.jar]```

**Analyze a multi-release JAR** for a given Java version

```jdeps --multi-release [17] [app.jar]```

**Write DOT graph files** for visualization

```jdeps --dot-output [output_dir] [app.jar]```

# SYNOPSIS

**jdeps** [_options_] _path_...

# PARAMETERS

_PATH_
> A .class file, a directory of classes, or a JAR file.

**-s**, **-summary**
> Print dependency summary only.

**-v**, **-verbose**
> Print all class-level dependencies (same as **-verbose:class -filter:none**).

**-verbose:package**, **-verbose:class**
> Print package-level (default) or class-level dependencies.

**-cp**, **--class-path** _path_
> Where to find dependent class files.

**--module-path** _path_
> Module path.

**--multi-release** _VERSION_
> Version to use when processing multi-release JARs (integer >= 9, or **base**).

**--jdk-internals**
> Find class-level dependencies on JDK internal APIs. Cannot be combined with **-p**, **-e** or **-s**.

**-p**, **--package** _PACKAGE_
> Find dependencies matching the given package (repeatable).

**-e**, **--regex** _REGEX_
> Find dependencies matching the given pattern.

**--require** _MODULE_
> Find dependencies on the given module.

**-include** _REGEX_
> Restrict analysis to classes matching the pattern.

**-R**, **--recursive**
> Recursively traverse all run-time dependencies.

**--api-only**
> Only consider dependencies from public API signatures.

**--list-deps**, **--list-reduced-deps**
> List module dependencies (the reduced form omits implied reads edges).

**--print-module-deps**
> Print a comma-separated list of module dependencies, suitable for **jlink --add-modules**.

**--ignore-missing-deps**
> Ignore missing dependencies instead of failing.

**--missing-deps**
> Find missing dependencies.

**--generate-module-info** _DIR_
> Generate module-info.java for the given JARs under _DIR_.

**--generate-open-module** _DIR_
> Like **--generate-module-info**, but generate open modules.

**--check** _MODULE_[,...]
> Analyze the given modules, print their descriptors and unused qualified exports.

**--dot-output** _DIR_
> Write DOT files for graph visualization.

**-q**, **-quiet**
> Suppress warning messages.

**--help**
> Display help information.

# DESCRIPTION

**jdeps** is the Java class dependency analyzer. It shows the package-level or class-level dependencies of Java class files, and which JARs and JDK modules they rely on.

The tool helps with migrating to the Java module system and with building minimal runtimes: **--print-module-deps** feeds directly into **jlink**, and **--jdk-internals** flags use of internal JDK APIs that are inaccessible under strong encapsulation (JDK 16+) or may be removed.

# CAVEATS

Part of the JDK. Analyzes compiled class files, not source. Dependencies reached through reflection, **ServiceLoader** or string class names are not detected. Libraries missing from **--class-path** cause errors for module-level options unless **--ignore-missing-deps** is used.

# HISTORY

jdeps was added in **JDK 8** to help developers understand dependencies and prepare for the Java module system introduced in JDK 9, which added the module-related options.

# SEE ALSO

[javap](/man/javap)(1), [java](/man/java)(1), [jar](/man/jar)(1), [javac](/man/javac)(1)

# RESOURCES

```[Source code](https://github.com/openjdk/jdk)```

```[Homepage](https://openjdk.org/)```

```[Documentation](https://docs.oracle.com/en/java/javase/25/docs/specs/man/jdeps.html)```

<!-- verified: 2026-09-29 -->
