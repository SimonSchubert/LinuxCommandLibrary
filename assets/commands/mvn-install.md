# TAGLINE

Build project and install artifact to local Maven repository

# TLDR

**Install to local repository**

```mvn install```

**Install skipping tests**

```mvn install -DskipTests```

**Clean and install** (remove target/ first)

```mvn clean install```

**Install with a specific profile**

```mvn install -P [profile]```

**Install in offline mode** (no network access)

```mvn install -o```

**Install with debug output**

```mvn install -X```

**Install with parallel builds** using multiple threads

```mvn install -T [4]```

# SYNOPSIS

**mvn install** [_options_]

# PARAMETERS

**-DskipTests**
> Skip test execution but still compile tests.

**-Dmaven.test.skip=true**
> Skip test compilation and execution entirely.

**-P** _profile_
> Activate a build profile defined in pom.xml.

**-pl** _modules_
> Build only specified modules (comma-separated).

**-am**
> Also build required upstream modules (use with -pl).

**-o**
> Work offline, use only locally cached dependencies.

**-U**
> Force update of snapshot dependencies from remote repositories.

**-T** _threads_
> Number of threads for parallel module builds (e.g., 4 or 1C for one thread per CPU core).

**-X**
> Enable debug output for troubleshooting.

**-e**
> Show full stack traces on errors.

**-q**
> Quiet output, only show errors.

**-f** _file_
> Use an alternative POM file.

# DESCRIPTION

**mvn install** is a Maven build lifecycle phase that builds the project and installs the resulting artifact (JAR, WAR, etc.) to the local Maven repository at ~/.m2/repository. This makes the artifact available as a dependency for other local projects.

Running `mvn install` executes all preceding lifecycle phases in order: validate, compile, test, package, verify, and finally install. Each phase runs its bound plugin goals.

The local repository acts as a cache for both locally built artifacts and dependencies downloaded from remote repositories. Installing an artifact locally is a prerequisite for other local projects to depend on it during development.

# CAVEATS

The install phase runs all tests by default; use -DskipTests to skip. The local repository (~/.m2/repository) can grow large over time. Snapshot versions are not automatically updated unless -U is used. Multi-module projects install all modules by default.

# SEE ALSO

[mvn](/man/mvn)(1), [mvn-package](/man/mvn-package)(1), [mvn-deploy](/man/mvn-deploy)(1), [gradle](/man/gradle)(1)

