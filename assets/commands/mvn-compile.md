# TAGLINE

compile the main source code of a Maven project

# TLDR

**Compile** the project

```mvn compile```

**Activate a profile** during compilation

```mvn compile -P [profile_name]```

**Compile without** running tests later in the lifecycle

```mvn compile -DskipTests```

**Compile in offline** mode (no network)

```mvn compile -o```

**Force update** of dependencies

```mvn compile -U```

**Run with a specific** JDK toolchain

```mvn compile -Dmaven.compiler.release=[17]```

**Quiet compile**

```mvn compile -q```

**Compile a specific module** in a multi-module build

```mvn -pl [module/path] -am compile```

# SYNOPSIS

**mvn compile** [_options_]

# PARAMETERS

**-P** _profile_
> Activate one or more comma-separated Maven profiles.

**-DskipTests**
> Skip test compilation in subsequent phases. Tests are still compiled if **mvn test** runs without this flag.

**-Dmaven.compiler.release** _N_
> Set the **--release** flag passed to javac, controlling the target JDK API level.

**-o**, **--offline**
> Run in offline mode; never reach out to remote repositories.

**-U**, **--update-snapshots**
> Force updates of snapshot dependencies and plugins.

**-pl** _MODULES_
> Restrict the reactor build to a comma-separated list of modules.

**-am**, **--also-make**
> Together with **-pl**, also build dependencies of the selected modules.

**-q**, **--quiet**
> Print only errors and the final result.

**-X**, **--debug**
> Enable verbose debug output (full stack traces, effective POM).

**-T** _N_
> Build in parallel using _N_ threads (or **1C** for one per core).

# DESCRIPTION

**mvn compile** runs the **compile** phase of the Maven default lifecycle, executing all phases that come before it (validate, initialize, generate-sources, process-resources, ...) and finally invoking **maven-compiler-plugin** to compile **src/main/java** into **target/classes**. Resources from **src/main/resources** are copied during the **process-resources** phase, so they are available on the classpath after **compile** completes.

The compiler version and target language level are governed by the **maven-compiler-plugin** configuration in **pom.xml** or by the **maven.compiler.source**, **maven.compiler.target**, and **maven.compiler.release** properties. Use **-T** for parallel multi-module builds, and **-pl/-am** to compile only the relevant module of a large reactor.

# CAVEATS

Test sources in **src/test/java** are compiled in a separate phase (**test-compile**) and are not produced by **mvn compile** alone. Generated sources from annotation processors are written to **target/generated-sources/annotations** and must be on the source path for IDE awareness.

# INSTALL

```dnf: sudo dnf install maven```

```pacman: sudo pacman -S maven```

```apk: sudo apk add maven```

```zypper: sudo zypper install maven```

```brew: brew install maven```

```nix: nix profile install nixpkgs#maven```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[mvn](/man/mvn)(1), [mvn-package](/man/mvn-package)(1), [mvn-install](/man/mvn-install)(1), [javac](/man/javac)(1)
