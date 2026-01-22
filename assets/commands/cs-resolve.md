# TLDR

**Resolve dependencies** for an artifact

```cs resolve [org.typelevel::cats-core:2.9.0]```

**Show dependency tree**

```cs resolve -t [org.apache.spark::spark-sql:3.4.0]```

**Resolve with exclusions**

```cs resolve [app:version] --exclude [org.slf4j:*]```

**Resolve from custom repository**

```cs resolve -r [https://repo.example.com/maven] [org.example::app:1.0]```

**Check for conflicts**

```cs resolve --conflicts [app:version]```

**Output as JSON**

```cs resolve --json [app:version]```

# SYNOPSIS

**cs resolve** [_options_] _coordinates_...

# PARAMETERS

_COORDINATES_
> Maven coordinates to resolve (can specify multiple).

**-t**, **--tree**
> Display dependency tree instead of flat list.

**-r** _URL_, **--repository** _URL_
> Add a custom Maven repository.

**--exclude** _PATTERN_
> Exclude artifacts matching pattern (groupId:artifactId).

**--conflicts**
> Show version conflicts in dependencies.

**--json**
> Output resolution result as JSON.

**--reverse**
> Show reverse dependencies (what depends on what).

**--what-depends-on** _COORDS_
> Show what depends on specific artifact.

**-q**, **--quiet**
> Suppress progress output.

# DESCRIPTION

**cs resolve** performs Maven/Ivy dependency resolution, showing all transitive dependencies for given artifacts. It's useful for understanding dependency trees, finding version conflicts, and debugging classpath issues.

The command resolves but doesn't download artifacts, making it fast for exploring dependencies. Tree view shows the dependency hierarchy, while flat view lists all resolved artifacts with their versions.

Conflict detection helps identify situations where different versions of the same library are requested. The reverse dependency feature helps understand why a particular library is included.

# CAVEATS

Resolution accuracy depends on POM/ivy.xml completeness. Some artifacts have optional dependencies that may be missed. Cross-version artifacts (Scala) require appropriate notation (::). Network required for repository metadata.

# HISTORY

cs resolve is part of Coursier's dependency management capabilities. Resolution is the core operation that powers both launching applications and fetching artifacts, extracted as a standalone command for analysis and debugging.

# SEE ALSO

[cs](/man/cs)(1), [cs-fetch](/man/cs-fetch)(1), [mvn](/man/mvn)(1), [gradle](/man/gradle)(1)
