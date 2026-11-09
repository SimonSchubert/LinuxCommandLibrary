# TAGLINE

Lightweight Zsh plugin manager

# TLDR

**Load Oh My Zsh**

```zgen oh-my-zsh```

**Load Oh My Zsh plugin**

```zgen oh-my-zsh plugins/[git]```

**Load plugin from GitHub**

```zgen load [zsh-users/zsh-autosuggestions]```

**Load a subdirectory** of a repository on a specific branch

```zgen load [zsh-users/zsh-completions] [src] [master]```

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

**prezto** [_module_] [_option_ _values_]
> Load Prezto, a module, or set a module option

**pmodule** _repo_ [_branch_]
> Load a repository as a Prezto module

**load** _repo_ [_location_] [_branch_]
> Load a plugin from GitHub, a git URL or a local repository

**loadall**
> Load several plugins, one per line, from stdin

**save**
> Generate the static init script

**saved**
> Return 0 if an init script exists

**update**
> Pull updates for every plugin and remove the init script

**reset**
> Delete generated init script (regenerates on next load). Plugins stay on disk

**list**
> Print the generated init script

**selfupdate**
> Update zgen itself

**clone** _repo_ [_branch_]
> Clone repository without loading

# DESCRIPTION

**zgen** is a lightweight plugin manager for Zsh. It generates a static init script from your plugin configuration, making shell startup fast because plugins don't need to be loaded dynamically each time.

The typical workflow:
1. Define plugins in **.zshrc** using zgen commands
2. Run **zgen save** to generate the init script
3. Subsequent shell starts load the pre-generated script

zgen supports Oh My Zsh, Prezto, and any git-hosted Zsh plugin. It handles cloning repositories and sourcing the appropriate files.

Set **ZGEN_RESET_ON_CHANGE** to a list of files, and zgen resets automatically when any of them changes.

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

zgen's last commit was in 2021. **zgenom** is an actively maintained fork, and **zinit** is an alternative.

Plugin updates require manual **zgen update**. No automatic update mechanism.

# SEE ALSO

[zsh](/man/zsh)(1), [zplug](/man/zplug)(1), [antigen](/man/antigen)(1), [zinit](/man/zinit)(1)

# RESOURCES

```[Source code](https://github.com/tarjoilija/zgen)```

<!-- verified: 2026-11-09 -->
