# TAGLINE

Framework for managing Bash plugins, aliases, and themes.

# TLDR

**Enable** plugin

```bash-it enable plugin [git]```

**Disable** plugin

```bash-it disable plugin [git]```

**Enable** alias

```bash-it enable alias [git]```

**Show** available plugins

```bash-it show plugins```

**Search** for component

```bash-it search [docker]```

**Update** Bash-it

```bash-it update```

# SYNOPSIS

**bash-it** _command_ [_type_] [_name_]

# DESCRIPTION

**bash-it** is a collection of community bash commands and scripts for bash 3.2+. It provides a framework for managing bash aliases, completions, plugins, and themes, similar to oh-my-zsh but for bash.

The tool helps organize and enable/disable bash customizations modularly.

# PARAMETERS

**enable** _type_ _name_
> Enable alias, plugin, or completion

**disable** _type_ _name_
> Disable alias, plugin, or completion

**show** _type_
> Show available or enabled items

**search** _term_
> Search for components

**update**
> Update Bash-it framework

**reload**
> Reload bash profile

**doctor**
> Run diagnostics

# COMPONENT TYPES

**aliases**
> Command shortcuts

**plugins**
> Additional functionality

**completions**
> Tab completion scripts

**themes**
> Prompt themes

# FEATURES

- Modular plugin system
- Theme support
- Git integration
- Auto-completion
- Aliases for common commands
- Easy enable/disable

# WORKFLOW

```bash
# Enable git plugin and aliases
bash-it enable plugin git
bash-it enable alias git

# Set theme
bash-it enable theme bobby

# Show enabled plugins
bash-it show plugins

# Update
bash-it update
```

# CONFIGURATION

**~/.bash_it/**
> Main Bash-it installation directory containing all plugins, aliases, completions, and themes.

**~/.bash_it/custom/**
> User custom scripts, aliases, and plugins loaded automatically.

**~/.bashrc**
> Must source the Bash-it loader script to activate the framework.

# CAVEATS

Requires manual installation and configuration. Can slow shell startup if too many plugins enabled. May conflict with existing bash configuration. Plugins quality varies.

# HISTORY

**Bash-it** was created by Bobby Brito around **2010** as a bash equivalent to oh-my-zsh, providing modular bash customization.

# SEE ALSO

[bash](/man/bash)(1), [oh-my-zsh](/man/oh-my-zsh)(1), [bash](/man/bash)(1)
