# TAGLINE

Gradle version-pinning wrapper generator

# TLDR

**Generate wrapper**

```gradle wrapper```

**Specify Gradle version**

```gradle wrapper --gradle-version [9.4.0]```

**Use distribution type (bin or all)**

```gradle wrapper --distribution-type [all]```

**Upgrade wrapper version using existing wrapper**

```./gradlew wrapper --gradle-version [9.4.0]```

**Specify distribution with SHA-256 verification**

```gradle wrapper --gradle-version [9.4.0] --gradle-distribution-sha256-sum [checksum]```

**Run project build with wrapper**

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

**--gradle-distribution-sha256-sum** _HASH_
> SHA-256 checksum for distribution verification.

**--help**
> Display help information.

# DESCRIPTION

**gradle wrapper** generates the Gradle Wrapper, enabling projects to use a specific Gradle version without requiring a global installation. Users run **./gradlew** instead of **gradle**, and the wrapper downloads and uses the specified version automatically.

This ensures consistent builds across different machines and CI systems by pinning the exact Gradle version in source control.

# CONFIGURATION

**gradle/wrapper/gradle-wrapper.properties**
> Specifies the Gradle distribution URL, version, and checksum for the wrapper.

# CAVEATS

Wrapper files should be committed. First run downloads Gradle. Use https distribution URLs.

# HISTORY

The Gradle Wrapper was introduced to solve version consistency problems, becoming the recommended way to run Gradle builds.

# SEE ALSO

[gradle](/man/gradle)(1)
