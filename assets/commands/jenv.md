# TAGLINE

manages multiple Java JDK installations and sets JAVA_HOME automatically

# TLDR

**Add a JDK**

```jenv add [/path/to/java/home]```

**List installed versions**

```jenv versions```

**Show current version**

```jenv version```

**Set global Java version**

```jenv global [11.0.20]```

**Set local version for directory**

```jenv local [17.0.1]```

**Set version for current shell**

```jenv shell [11.0.20]```

**Enable a plugin**

```jenv enable-plugin [export]```

**Check configuration**

```jenv doctor```

# SYNOPSIS

**jenv** _command_ [_arguments_]

# SUBCOMMANDS

**add** _path_
> Add a JDK installation.

**versions**
> List available versions.

**version**
> Show current active version.

**global** _version_
> Set global default version.

**local** _version_
> Set directory-specific version.

**shell** _version_
> Set version for current shell.

**enable-plugin** _name_
> Enable a plugin.

**disable-plugin** _name_
> Disable a plugin.

**doctor**
> Verify configuration.

# DESCRIPTION

**jenv** manages multiple Java JDK installations and sets JAVA_HOME automatically. It does not install JDKs itself. Version priority: shell > local > global. Use the **export** plugin for JAVA_HOME support. Creates **.java-version** files for local versions.

# SEE ALSO

[java](/man/java)(1), [sdkman](/man/sdkman)(1)

