# TAGLINE

Manage multiple runtime versions with a single tool

# TLDR

**Install** a plugin

```asdf plugin add [nodejs]```

**List** all plugins

```asdf plugin list```

**Install** a version

```asdf install [nodejs] [18.0.0]```

Set **local** version in the current directory (0.16+)

```asdf set [nodejs] [18.0.0]```

Set **global** version in your home directory (0.16+)

```asdf set -u [nodejs] [18.0.0]```

List **installed** versions

```asdf list [nodejs]```

# SYNOPSIS

**asdf** _command_ [_plugin_] [_version_]

# DESCRIPTION

**asdf** is a universal version manager supporting multiple languages and tools through plugins. It provides a single interface for managing versions of Node.js, Python, Ruby, Go, and dozens of other tools.

Versions are recorded in a .tool-versions file, which can live in your home directory (global default) or any project directory (per-project override).

Note: the 0.16 release rewrote asdf in Go and removed the separate **global** and **local** commands, replacing both with **set**. Older 0.15.x and earlier installs still use **asdf global** and **asdf local**.

# PARAMETERS

**plugin add** _name_
> Install plugin

**plugin list**
> List installed plugins

**install** _plugin_ _version_
> Install specific version

**uninstall** _plugin_ _version_
> Remove version

**set** [_-u_|_--home_] [_-p_|_--parent_] _plugin_ _version_
> Write the version to a .tool-versions file (0.16+). Defaults to the current directory; **-u** targets the home directory (global), **-p** the nearest parent directory. Replaces the old **global**/**local** commands.

**global** _plugin_ _version_
> Set global default (removed in 0.16; use **set -u**).

**local** _plugin_ _version_
> Set project version (removed in 0.16; use **set**).

**list** _plugin_
> List installed versions

**list all** _plugin_
> List all available versions

**latest** _plugin_
> Show the newest stable version available

**current** [_plugin_]
> Show current versions

**which** _command_
> Show the path to the executable that would run

**reshim** [_plugin_] [_version_]
> Rebuild shims

# CONFIGURATION

**~/.asdfrc**
> User configuration file for asdf settings like legacy version file support.

**.tool-versions**
> Per-project file specifying tool versions. Placed in the project root directory.

**~/.tool-versions**
> Global default tool versions used when no project-level file is found.

# CAVEATS

Requires plugins for each tool. Shell initialization needed (~/.bashrc or ~/.zshrc). Shims may need rebuilding after installing new executables.

# HISTORY

**asdf** was created by @HashNuke around **2014** to provide a single version manager replacing language-specific tools like nvm, rbenv, and pyenv. Originally a Bash/shim project, it was rewritten in Go for the **0.16** release in early 2025.

# SEE ALSO

[nvm](/man/nvm)(1), [rbenv](/man/rbenv)(1), [pyenv](/man/pyenv)(1), [mise](/man/mise)(1), [direnv](/man/direnv)(1)

# RESOURCES

```[Source code](https://github.com/asdf-vm/asdf)```

```[Homepage](https://asdf-vm.com)```

<!-- verified: 2026-06-17 -->
