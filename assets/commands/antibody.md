# TLDR

**Bundle** plugins

```antibody bundle < [plugins.txt]```

Bundle a **single plugin**

```antibody bundle [zsh-users/zsh-autosuggestions]```

**Update** all plugins

```antibody update```

**List** installed plugins

```antibody list```

**Initialize** in zshrc

```source <(antibody init)```

# SYNOPSIS

**antibody** _command_ [_options_]

# DESCRIPTION

**antibody** is a fast shell plugin manager written in Go. It downloads and loads Zsh plugins from GitHub or other sources, similar to Antigen but with faster performance.

Plugins are specified in a text file with one repository per line. Antibody bundles them into shell code that can be sourced in your .zshrc.

# PARAMETERS

**bundle** [_plugin_]
> Download and print source commands for plugins

**update**
> Update all installed plugins

**list**
> List installed plugins

**init**
> Output initialization code

**purge** _plugin_
> Remove a plugin

**home**
> Print antibody home directory

# USAGE

Typical setup in .zshrc:
```
source <(antibody init)
antibody bundle < ~/.zsh_plugins.txt
```

Or for faster startup:
```
antibody bundle < ~/.zsh_plugins.txt > ~/.zsh_plugins.sh
source ~/.zsh_plugins.sh
```

# CAVEATS

Plugin updates require running antibody update; they don't auto-update. Static loading (generated file) is faster but requires regeneration after changes.

# HISTORY

**antibody** was created as a faster alternative to Antigen, the popular Zsh plugin manager, using Go for improved performance.

# SEE ALSO

[zsh](/man/zsh)(1), [antigen](/man/antigen)(1), [zinit](/man/zinit)(1)
