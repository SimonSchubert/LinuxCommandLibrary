# TAGLINE

Get and set repository or global options

# TLDR

**Set user name**

```git config --global user.name "[Name]"```

**Set user email**

```git config --global user.email "[email@example.com]"```

**Get a value**

```git config user.name```

**Set the default branch name** for new repositories

```git config --global init.defaultBranch main```

**Create a command alias**

```git config --global alias.co checkout```

**Remove a setting**

```git config --global --unset [key]```

**List all settings** and their origins

```git config --list --show-origin```

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

**--get** _NAME_
> Get the value for a given key (default behavior when only name is provided).

**--get-all** _NAME_
> Get all values for a multi-valued key.

**--unset** _NAME_
> Remove a setting.

**--show-origin**
> Show the file where each config value comes from.

**--help**
> Display help information.

# DESCRIPTION

**git config** manages Git configuration variables that control all aspects of Git's behavior, from user identity and commit settings to advanced options like merge strategies, credential helpers, and performance tuning. Configuration is stored in INI-style text files at three hierarchical levels.

System-level configuration (/etc/gitconfig) applies to all users on the system and requires administrator privileges to modify. Global configuration (~/.gitconfig or ~/.config/git/config) applies to the current user across all repositories. Local configuration (.git/config) applies only to the specific repository. Settings at lower levels override higher levels, allowing project-specific customization.

Common configuration tasks include setting user identity (user.name and user.email, required for commits), defining command aliases (alias.*), configuring merge and diff tools (merge.tool, diff.tool), setting default branch names (init.defaultBranch), and managing credentials (credential.helper).

# CONFIGURATION

**~/.gitconfig** or **~/.config/git/config**
> Global user-level configuration file (--global).

**.git/config**
> Repository-specific configuration file (--local).

**/etc/gitconfig**
> System-wide configuration file (--system).

# CAVEATS

Local settings override global, and global overrides system. When a key is set at multiple levels, the most specific scope wins. Some settings like **core.autocrlf** can cause unexpected behavior if set inconsistently across scopes. Credential helpers vary by platform and may require separate installation.

# HISTORY

git config is a core **Git** command from initial release, providing the configuration system that controls all git behavior.

# SEE ALSO

[git](/man/git)(1), [git-credential](/man/git-credential)(1), [git-init](/man/git-init)(1), [git-commit](/man/git-commit)(1)
