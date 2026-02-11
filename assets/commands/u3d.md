# TAGLINE

Unity Editor version manager

# TLDR

**List installed versions**

```u3d list```

**Install Unity version**

```u3d install [2022.3.0f1]```

**Run Unity**

```u3d run -u [2022.3.0f1]```

**Available versions**

```u3d available```

**Uninstall version**

```u3d uninstall [2022.3.0f1]```

# SYNOPSIS

**u3d** _command_ [_-u version_] [_options_]

# PARAMETERS

**list**
> Installed versions.

**install**
> Install version.

**available**
> Show available.

**run**
> Run Unity.

**uninstall**
> Remove version.

**-u** _VERSION_
> Unity version.

# DESCRIPTION

**u3d** is a command-line tool for managing multiple Unity Editor installations side by side. It can list available versions, install specific releases, and launch Unity with a particular version, making it straightforward to work on projects requiring different Unity versions.

The tool is especially useful in CI/CD environments where Unity builds need to run headlessly. It handles license activation, version discovery, and build execution from the command line. Cross-platform support covers macOS, Linux, and Windows.

# CAVEATS

Unity-specific. Large downloads. License required.

# HISTORY

**u3d** was created for managing Unity Editor installations, especially useful in CI/CD environments.

# SEE ALSO

[unity](/man/unity)(1), [brew](/man/brew)(1)
