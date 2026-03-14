# TAGLINE

Oh My Zsh management CLI

# TLDR

**Update Oh My Zsh**

```omz update```

**List all available plugins**

```omz plugin list```

**Enable a plugin**

```omz plugin enable [plugin_name]```

**Disable a plugin**

```omz plugin disable [plugin_name]```

**List available themes**

```omz theme list```

**Set a theme**

```omz theme set [theme_name]```

**Show the current theme**

```omz theme use [theme_name]```

**Show changelog**

```omz changelog```

**Reload the Zsh configuration**

```omz reload```

# SYNOPSIS

**omz** _command_ [_subcommand_] [_args_]

# PARAMETERS

**update**
> Update Oh My Zsh to the latest version.

**plugin list**
> List all available plugins.

**plugin enable** _NAME_
> Enable a plugin by adding it to the plugins array in .zshrc.

**plugin disable** _NAME_
> Disable a plugin by removing it from the plugins array in .zshrc.

**plugin info** _NAME_
> Show information about a plugin.

**theme list**
> List all available themes.

**theme set** _NAME_
> Set theme in .zshrc.

**theme use** _NAME_
> Load a theme temporarily for the current session.

**changelog**
> Show recent changes and release notes.

**reload**
> Reload the current Zsh session with updated configuration.

**--help**
> Display help information.

# DESCRIPTION

**omz** is the command-line management utility for the Oh My Zsh framework. It provides commands to update the framework, manage plugins and themes, and reload configuration. Changes to plugins and themes are persisted by modifying the `.zshrc` file.

# CAVEATS

Requires Oh My Zsh to be installed. Only works with the Zsh shell. Plugin/theme changes modify ~/.zshrc directly. The `theme use` command only applies for the current session; use `theme set` for persistence.

# SEE ALSO

[zsh](/man/zsh)(1), [oh-my-zsh](/man/oh-my-zsh)(1)

