# TLDR

**Generate wrapper**

```gradle wrapper```

**Specify Gradle version**

```gradle wrapper --gradle-version [8.5]```

**Use distribution type**

```gradle wrapper --distribution-type [all]```

**Run with wrapper**

```./gradlew build```

# SYNOPSIS

**gradle wrapper** [_options_]

# PARAMETERS

**--gradle-version** _VERSION_
> Gradle version to use.

**--distribution-type** _TYPE_
> bin or all (includes sources).

**--gradle-distribution-url** _URL_
> Custom distribution URL.

**--help**
> Display help information.

# DESCRIPTION

**gradle wrapper** generates the Gradle Wrapper, enabling projects to use a specific Gradle version without requiring installation. Users run ./gradlew instead of gradle.

The wrapper downloads and uses the specified Gradle version automatically. This ensures consistent builds across different machines and CI systems.

gradle wrapper provides reproducible Gradle builds.

# CAVEATS

Wrapper files should be committed. First run downloads Gradle. Use https distribution URLs.

# HISTORY

The Gradle Wrapper was introduced to solve version consistency problems, becoming the recommended way to run Gradle builds.

# SEE ALSO

[gradle](/man/gradle)(1)
