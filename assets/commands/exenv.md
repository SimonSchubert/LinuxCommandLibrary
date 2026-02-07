# TAGLINE

Elixir version manager

# TLDR

**List installed versions**

```exenv versions```

**List available versions**

```exenv install --list```

**Install a version**

```exenv install [1.14.0]```

**Set global version**

```exenv global [1.14.0]```

**Set local version**

```exenv local [1.14.0]```

**Show current version**

```exenv version```

**Rehash shims**

```exenv rehash```

# SYNOPSIS

**exenv** _command_ [_args_]

# SUBCOMMANDS

**versions**
> List installed versions.

**version**
> Show current version.

**install**
> Install a version.

**uninstall**
> Uninstall a version.

**global**
> Set global version.

**local**
> Set directory-local version.

**shell**
> Set shell-specific version.

**rehash**
> Rehash exenv shims.

**which**
> Show path to executable.

# DESCRIPTION

**exenv** manages multiple Elixir versions. Allows switching between versions per-project or globally. Similar to rbenv for Ruby.

# CONFIGURATION

**~/.exenv/version**
> Global default Elixir version.

**.elixir-version**
> Directory-local Elixir version file.

# SEE ALSO

[elixir](/man/elixir)(1), [mix](/man/mix)(1)
