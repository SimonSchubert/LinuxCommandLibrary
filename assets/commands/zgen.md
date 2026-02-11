# TAGLINE

Lightweight Zsh plugin manager

# TLDR

**Load Oh My Zsh**

```zgen oh-my-zsh```

**Load Oh My Zsh plugin**

```zgen oh-my-zsh plugins/[git]```

**Load plugin from GitHub**

```zgen load [zsh-users/zsh-autosuggestions]```

**Load theme**

```zgen oh-my-zsh themes/[robbyrussell]```

**Save configuration and generate init script**

```zgen save```

**Update all plugins**

```zgen update```

**Reset and regenerate**

```zgen reset```

# SYNOPSIS

**zgen** _command_ [_arguments_]

# SUBCOMMANDS

**oh-my-zsh** [_plugin_or_theme_]
> Load Oh My Zsh or specific component

**load** _repo_ [_file_]
> Load plugin from GitHub repository

**save**
> Save current configuration to init script

**update**
> Update all plugins

**reset**
> Delete generated init script (regenerates on next load)

**list**
> List loaded plugins

**selfupdate**
> Update zgen itself

**clone** _repo_
> Clone repository without loading

# DESCRIPTION

**zgen** is a lightweight plugin manager for Zsh. It generates a static init script from your plugin configuration, making shell startup fast because plugins don't need to be loaded dynamically each time.

The typical workflow:
1. Define plugins in **.zshrc** using zgen commands
2. Run **zgen save** to generate the init script
3. Subsequent shell starts load the pre-generated script

zgen supports Oh My Zsh, Prezto, and any GitHub-hosted Zsh plugin. It handles cloning repositories and sourcing the appropriate files.

Configuration example in .zshrc:
```
source "${HOME}/.zgen/zgen.zsh"
if ! zgen saved; then
  zgen oh-my-zsh
  zgen oh-my-zsh plugins/git
  zgen load zsh-users/zsh-syntax-highlighting
  zgen save
fi
```

# CAVEATS

After changing plugins in .zshrc, run **zgen reset** and restart the shell to regenerate the init script.

zgen development is less active. Consider **zinit** or **sheldon** for actively maintained alternatives.

Plugin updates require manual **zgen update**. No automatic update mechanism.

# SEE ALSO

[zsh](/man/zsh)(1), [zplug](/man/zplug)(1), [antigen](/man/antigen)(1)
