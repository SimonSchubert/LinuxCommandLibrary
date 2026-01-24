# TLDR

**List installed versions**

```rbenv versions```

**List available versions**

```rbenv install -l```

**Install Ruby version**

```rbenv install [3.2.0]```

**Set global version**

```rbenv global [3.2.0]```

**Set local version**

```rbenv local [3.2.0]```

**Show current version**

```rbenv version```

**Rehash shims**

```rbenv rehash```

# SYNOPSIS

**rbenv** _command_ [_args_...]

# DESCRIPTION

**rbenv** manages multiple Ruby installations. It allows switching between Ruby versions globally, per-project, or per-shell, without modifying system Ruby.

The tool uses shims to intercept Ruby commands and route them to the appropriate version based on context.

# PARAMETERS

**versions**
> List installed versions.

**version**
> Show current version.

**install** _version_
> Install Ruby version.

**uninstall** _version_
> Remove Ruby version.

**global** _version_
> Set global default.

**local** _version_
> Set directory version.

**shell** _version_
> Set shell version.

**rehash**
> Rebuild shims.

**which** _name_
> Show executable path.

# CAVEATS

Requires ruby-build plugin for install. Shims need rehashing after gem installs. Per-project version via .ruby-version file.

# HISTORY

**rbenv** was created by **Sam Stephenson** in **2011** as a simpler alternative to RVM. It focuses on doing one thing well - version switching - without modifying shells or managing gemsets.

# SEE ALSO

[ruby](/man/ruby)(1), [gem](/man/gem)(1), [rvm](/man/rvm)(1), [asdf](/man/asdf)(1)
