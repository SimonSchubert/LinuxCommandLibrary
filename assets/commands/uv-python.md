# TAGLINE

Manage Python version installations

# TLDR

**List available Python versions**

```uv python list```

**Install Python version**

```uv python install [version]```

**Uninstall Python version**

```uv python uninstall [version]```

**Find Python executable**

```uv python find [version]```

**Pin Python version**

```uv python pin [version]```

# SYNOPSIS

**uv** **python** _command_ [_options_]

# PARAMETERS

**list**
> Show available versions.

**install** _version_
> Install Python version.

**uninstall** _version_
> Remove Python version.

**find** _version_
> Find Python executable.

**pin** _version_
> Set project Python version.

**dir**
> Show Python install directory.

# DESCRIPTION

**uv python** manages Python installations. Download, install, and switch between Python versions. Provides hermetic Python management without system Python.

# SEE ALSO

[uv](/man/uv)(1), [pyenv](/man/pyenv)(1)

