# TLDR

**Install dotfiles with config**

```dotbot -c [install.conf.yaml]```

**Specify dotfiles directory**

```dotbot -d [~/dotfiles] -c [install.conf.yaml]```

**Run with verbose output**

```dotbot -v -c [install.conf.yaml]```

**Use specific plugin**

```dotbot -p [plugin.py] -c [install.conf.yaml]```

# SYNOPSIS

**dotbot** [_options_] **-c** _config_

# PARAMETERS

**-c**, **--config-file** _file_
> Configuration file (YAML or JSON).

**-d**, **--base-directory** _dir_
> Base directory for dotfiles.

**-p**, **--plugin** _plugin_
> Load plugin module.

**-v**, **--verbose**
> Enable verbose output.

**-Q**, **--super-quiet**
> Suppress almost all output.

**--no-color**
> Disable colored output.

**--version**
> Show version.

# DESCRIPTION

**Dotbot** is a tool for bootstrapping dotfiles. It automates the process of setting up a new machine by creating symlinks, running shell commands, and performing other configuration tasks defined in a YAML or JSON file.

Configuration files define directives like **link** (create symlinks), **shell** (run commands), **create** (make directories), and **clean** (remove broken symlinks). Dotbot is typically included as a git submodule in dotfiles repositories.

# CONFIGURATION EXAMPLE

```yaml
- link:
    ~/.bashrc: bashrc
    ~/.vimrc: vimrc
    ~/.config/nvim: nvim

- shell:
    - [git submodule update --init, Installing submodules]
    - command: ./install-packages.sh
      description: Installing packages

- create:
    - ~/.local/bin
    - ~/.config
```

# CAVEATS

Requires Python 3. Symlink creation may require appropriate permissions. Existing files at link destinations are not overwritten by default. Plugin system allows extensions but adds complexity.

# HISTORY

Dotbot was created by **Anish Athalye** in **2014** as a simple, self-contained tool for dotfiles management. It was designed to be included as a git submodule, making dotfiles repositories self-bootstrapping without external dependencies beyond Python.

# SEE ALSO

[stow](/man/stow)(1), [chezmoi](/man/chezmoi)(1), [yadm](/man/yadm)(1), [ln](/man/ln)(1)
