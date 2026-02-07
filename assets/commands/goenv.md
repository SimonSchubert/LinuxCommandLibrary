# TAGLINE

Go version manager

# TLDR

**List available Go versions**

```goenv install -l```

**Install a Go version**

```goenv install [1.21.0]```

**List installed versions**

```goenv versions```

**Set global Go version**

```goenv global [1.21.0]```

**Set local version for directory**

```goenv local [1.21.0]```

**Show current version**

```goenv version```

**Uninstall a version**

```goenv uninstall [1.21.0]```

# SYNOPSIS

**goenv** _command_ [_args_]

# SUBCOMMANDS

**install** _version_
> Install a Go version.

**uninstall** _version_
> Uninstall a Go version.

**versions**
> List installed versions.

**version**
> Show current active version.

**global** _version_
> Set global default version.

**local** _version_
> Set directory-specific version.

**rehash**
> Rebuild shim executables.

**init**
> Configure shell environment.

# PARAMETERS

**-l**, **--list**
> List available versions for install.

# DESCRIPTION

**goenv** is a Go version manager inspired by rbenv and pyenv. It allows installing multiple Go versions side by side and switching between them per-project or globally.

Version selection is managed through **.go-version** files and shims that intercept Go commands, routing them to the appropriate version.

# CONFIGURATION

**~/.goenv/version**
> Global Go version setting.

**.go-version**
> Per-directory Go version override file.

**GOENV_ROOT**
> Environment variable specifying the goenv installation directory (default ~/.goenv).

# SEE ALSO

[go](/man/go)(1), [pyenv](/man/pyenv)(1), [rbenv](/man/rbenv)(1)
