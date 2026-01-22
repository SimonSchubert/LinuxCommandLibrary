# TLDR

**Install** a plugin

```asdf plugin add [nodejs]```

**List** all plugins

```asdf plugin list```

**Install** a version

```asdf install [nodejs] [18.0.0]```

Set **global** version

```asdf global [nodejs] [18.0.0]```

Set **local** version (project)

```asdf local [nodejs] [18.0.0]```

List **installed** versions

```asdf list [nodejs]```

# SYNOPSIS

**asdf** _command_ [_plugin_] [_version_]

# DESCRIPTION

**asdf** is a universal version manager supporting multiple languages and tools through plugins. It provides a single interface for managing versions of Node.js, Python, Ruby, Go, and dozens of other tools.

Versions can be set globally, per-project (.tool-versions file), or per-shell session.

# PARAMETERS

**plugin add** _name_
> Install plugin

**plugin list**
> List installed plugins

**install** _plugin_ _version_
> Install specific version

**uninstall** _plugin_ _version_
> Remove version

**global** _plugin_ _version_
> Set global default

**local** _plugin_ _version_
> Set project version

**list** _plugin_
> List installed versions

**list all** _plugin_
> List all available versions

**current**
> Show current versions

**reshim** _plugin_
> Rebuild shims

# CAVEATS

Requires plugins for each tool. Shell initialization needed (~/.bashrc or ~/.zshrc). Shims may need rebuilding after installing new executables.

# HISTORY

**asdf** was created by @HashNuke to provide a single version manager replacing language-specific tools like nvm, rbenv, and pyenv. Released around **2014**.

# SEE ALSO

[nvm](/man/nvm)(1), [rbenv](/man/rbenv)(1), [pyenv](/man/pyenv)(1)
