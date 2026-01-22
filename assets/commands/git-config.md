# TLDR

**Set user name**

```git config --global user.name "[Name]"```

**Set user email**

```git config --global user.email "[email@example.com]"```

**Get a value**

```git config user.name```

**List all settings**

```git config --list```

**Edit config file**

```git config --global --edit```

# SYNOPSIS

**git config** [_options_] _name_ [_value_]

# PARAMETERS

_NAME_
> Configuration key.

_VALUE_
> Value to set.

**--global**
> User-level config (~/.gitconfig).

**--local**
> Repository config (.git/config).

**--system**
> System-wide config.

**--list**, **-l**
> List all variables.

**--edit**, **-e**
> Open config in editor.

**--unset** _NAME_
> Remove a setting.

**--help**
> Display help information.

# DESCRIPTION

**git config** gets and sets repository or global options. Configuration controls git behavior including user identity, aliases, colors, merge tools, and remote settings.

Configuration exists at three levels: system, global (user), and local (repository). Local settings override global, which override system. The command supports reading, writing, and listing values.

git config is essential for customizing git's behavior.

# CAVEATS

Scope matters for settings. Credentials need special handling. Some settings require restart.

# HISTORY

git config is a core **Git** command from initial release, providing the configuration system that controls all git behavior.

# SEE ALSO

[git](/man/git)(1), [git-credential](/man/git-credential)(1)
