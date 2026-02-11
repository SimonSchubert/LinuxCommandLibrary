# TAGLINE

Manage parallel SDK versions for JVM languages

# TLDR

**List all available candidates** (Java, Scala, Kotlin, etc.)

```sdk list```

**List available versions** of a candidate

```sdk list java```

**Install the latest stable version** of a candidate

```sdk install java```

**Install a specific version**

```sdk install java [21.0.4-tem]```

**Switch to a version** for the current shell session

```sdk use java [17.0.12-tem]```

**Set a version as default** for all shells

```sdk default java [21.0.4-tem]```

**Show currently active versions**

```sdk current```

**Upgrade outdated candidates**

```sdk upgrade```

# SYNOPSIS

**sdk** _command_ [_candidate_] [_version_]

# COMMANDS

**install** _candidate_ [_version_]
> Install a candidate version; latest stable if version omitted

**uninstall** _candidate_ _version_
> Remove an installed version

**list** [_candidate_]
> List available candidates or versions of a specific candidate

**use** _candidate_ _version_
> Switch version for current terminal session only

**default** _candidate_ _version_
> Set version as default for all future shells

**current** [_candidate_]
> Show active version of a candidate or all candidates

**upgrade** [_candidate_]
> Upgrade outdated versions

**version**
> Display SDKMAN version information

**home** _candidate_ _version_
> Return absolute installation path for a version

**env** [**init**|**install**|**clear**]
> Manage project-specific .sdkmanrc configuration

**offline** [**enable**|**disable**]
> Toggle offline mode

**selfupdate** [**force**]
> Update SDKMAN itself

**update**
> Refresh candidate metadata cache

**flush** [**tmp**|**broadcast**|**archives**|**version**]
> Clear local cache and state

**config**
> Open SDKMAN configuration file

# DESCRIPTION

**SDKMAN** (Software Development Kit Manager) is a tool for managing parallel versions of multiple SDKs on Unix-based systems. It simplifies installing, switching, and removing development kits for the JVM ecosystem.

Supported candidates include **Java** (multiple distributions like Temurin, Zulu, GraalVM), **Scala**, **Kotlin**, **Groovy**, **Maven**, **Gradle**, **Ant**, **sbt**, **Spring Boot**, **Spark**, and many more. SDKMAN automatically manages **JAVA_HOME** and **PATH** environment variables.

Project-specific versions can be configured using **.sdkmanrc** files. With **sdkman_auto_env=true** in the config, SDKMAN automatically switches versions when entering a project directory.

# CONFIGURATION

**~/.sdkman/etc/config**
> SDKMAN configuration file controlling auto-answer, auto-env, color, and other settings.

**.sdkmanrc**
> Per-project file specifying required SDK versions. SDKMAN automatically switches versions when entering the directory if **sdkman_auto_env=true** is set.

**SDKMAN_DIR**
> Environment variable overriding the default SDKMAN installation directory (~/.sdkman).

# CAVEATS

SDKMAN requires **curl**, **zip**, and **unzip** to be installed. It modifies shell configuration files during installation. The **use** command only affects the current shell; use **default** for persistent changes across sessions.

# HISTORY

SDKMAN was originally created as **GVM** (Groovy enVironment Manager) by **Marco Vermeulen** around **2012**. It was later renamed to SDKMAN to reflect its broader support for multiple SDK candidates beyond Groovy. The tool draws inspiration from version managers like **RVM** (Ruby), **nvm** (Node.js), and **pyenv** (Python).

# SEE ALSO

[java](/man/java)(1), [javac](/man/javac)(1), [gradle](/man/gradle)(1), [mvn](/man/mvn)(1), [sbt](/man/sbt)(1)
