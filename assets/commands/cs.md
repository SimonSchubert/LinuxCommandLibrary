# TAGLINE

Scala artifact fetcher and application launcher

# TLDR

**Install a Scala application**

```cs install [scala]```

**Launch an application** by artifact coordinates

```cs launch [org.scalameta::metals:latest.stable]```

**Resolve dependencies** for an artifact

```cs resolve [org.typelevel::cats-core:2.9.0]```

**Fetch JARs** for dependencies

```cs fetch [com.lihaoyi::ammonite:2.5.9]```

**Update installed applications**

```cs update```

**List installed applications**

```cs list```

**Setup Coursier** (install default apps)

```cs setup```

# SYNOPSIS

**cs** _command_ [_options_] [_arguments_]

# PARAMETERS

**install** _APP_
> Install an application from the default channels.

**launch** _COORDS_
> Launch an application by Maven coordinates.

**resolve** _COORDS_
> Resolve and display dependency tree.

**fetch** _COORDS_
> Download artifacts for dependencies.

**update**
> Update all installed applications.

**list**
> List installed applications.

**setup**
> Initial setup, installing common Scala tools.

**uninstall** _APP_
> Remove an installed application.

**java**
> Manage Java installations.

**--channel** _URL_
> Add a custom application channel.

**-r** _REPO_
> Add a custom Maven repository.

# DESCRIPTION

**Coursier** (cs) is a Scala artifact fetcher and application launcher. It resolves Maven and Ivy dependencies, downloads artifacts, and can launch JVM applications directly from their coordinates without manual installation.

The tool provides fast, parallel downloads with caching. It can install and manage Scala ecosystem tools like sbt, scala, ammonite, and scalafmt. The setup command configures a complete Scala development environment.

Coursier handles complex dependency resolution, including version conflict resolution and exclusions. It integrates with the Scala ecosystem as the recommended way to install Scala tooling and is used by sbt for dependency management.

# CAVEATS

Requires Java Runtime Environment. First runs download dependencies which takes time. Application channels may have varying update frequencies. Large dependency trees can consume significant disk space in the cache.

# HISTORY

Coursier was created by Alexandre Archambault and first released around **2015**. It became the official installation method for Scala tools in **2020**. The tool addresses Java/Scala's dependency management complexity with fast, reliable artifact resolution.

# SEE ALSO

[scala](/man/scala)(1), [sbt](/man/sbt)(1), [java](/man/java)(1), [mvn](/man/mvn)(1)
