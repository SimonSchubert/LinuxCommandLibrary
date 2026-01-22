# TLDR

**List available JDK** distributions

```cs java --available```

**Install a specific JDK** version

```cs java --jvm [adopt:11] --setup```

**Set default Java** version

```cs java --jvm [graalvm-java17] --setup```

**Show current Java** configuration

```cs java --env```

**List installed JDKs**

```cs java --installed```

**Install and use** a specific distribution

```cs java --jvm [temurin:21]```

# SYNOPSIS

**cs java** [_options_]

# PARAMETERS

**--available**
> List all available JDK distributions and versions.

**--jvm** _JVM_
> Specify JDK distribution and version (e.g., adopt:11, temurin:21).

**--setup**
> Configure the specified JDK as the default.

**--env**
> Print environment variables for the current Java setup.

**--installed**
> List locally installed JDK versions.

**--update**
> Update to the latest patch version.

**--home**
> Print the JAVA_HOME path for specified JVM.

# DESCRIPTION

**cs java** is Coursier's Java version manager, providing easy installation and switching between different JDK distributions and versions. It supports numerous distributions including AdoptOpenJDK, Temurin, GraalVM, Corretto, and Zulu.

The command downloads and manages JDK installations automatically, configuring environment variables to use the selected version. Multiple versions can be installed simultaneously with easy switching between them.

This tool simplifies Java development environment setup, particularly useful for testing across Java versions or using distribution-specific features like GraalVM's native compilation.

# CAVEATS

The **--setup** option modifies shell configuration files. Some distributions may not be available for all platforms. Large JDK downloads require adequate disk space and network bandwidth. Environment changes require shell restart to take effect.

# HISTORY

cs java was added to Coursier to provide comprehensive JDK management, complementing its Scala tooling capabilities. It follows the pattern of version managers like sdkman and jabba, integrated into the Coursier ecosystem.

# SEE ALSO

[cs](/man/cs)(1), [java](/man/java)(1), [sdk](/man/sdk)(1), [update-java-alternatives](/man/update-java-alternatives)(1)
