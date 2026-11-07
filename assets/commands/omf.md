# TAGLINE

oh My Fish, a Fish shell framework

# TLDR

**Install package**

```omf install [package]```

**List installed packages**

```omf list```

**Update Oh My Fish**

```omf update```

**Search packages**

```omf search [query]```

**Remove package**

```omf remove [package]```

**Change theme**

```omf theme [theme_name]```

**Reload Oh My Fish and plugins**

```omf reload```

**Troubleshoot the installation**

```omf doctor```

# SYNOPSIS

**omf** [_command_] [_options_]

# PARAMETERS

**install** _PACKAGE_
> Install package/theme.

**list**
> List installed packages.

**update**
> Update framework.

**search** _QUERY_
> Search packages.

**remove** _PACKAGE_
> Uninstall package.

**theme** _NAME_
> Change theme.

**reload**
> Restart the shell to reload Oh My Fish and plugins.

**new** _plugin_|_theme_ _NAME_
> Scaffold a new plugin or theme.

**channel** [_stable_|_dev_]
> Get or set the update channel.

**doctor**
> Troubleshoot common problems.

**destroy**
> Uninstall Oh My Fish.

**--help**
> Display help information.

# DESCRIPTION

**omf** is the command-line interface for Oh My Fish, a plugin and theme framework for the Fish shell. It installs, lists, updates, and removes community packages and themes, and can scaffold new ones.

The tool extends Fish shell functionality through a repository-based package system.

# CAVEATS

Requires the Fish shell. The project is officially unmaintained: some themes and packages may be broken, and newer Fish plugin managers such as [fisher](/man/fisher)(1) are generally preferred for new setups. May conflict with other frameworks.

# HISTORY

Oh My Fish was created as a **package manager** and framework for the Fish shell. Its maintainers have marked the project as unmaintained.

# SEE ALSO

[fish](/man/fish)(1), [fisher](/man/fisher)(1)

# RESOURCES

```[Source code](https://github.com/oh-my-fish/oh-my-fish)```

<!-- verified: 2026-11-07 -->

