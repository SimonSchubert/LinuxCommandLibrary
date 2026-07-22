# TAGLINE

shell integration setup

# TLDR

**Initialize conda** for the current shell

```conda init```

**Initialize for specific shell**

```conda init [bash|zsh|fish|powershell]```

**Initialize for all shells**

```conda init --all```

**Reverse initialization**

```conda init --reverse```

# SYNOPSIS

**conda** **init** [_options_] [_shells..._]

# PARAMETERS

**--all**
> Initialize for all available shells.

**--reverse**
> Undo shell initialization.

**-d**, **--dry-run**
> Show what would be done without making changes.

# CONFIGURATION

**~/.condarc**
> User-level conda configuration for channels, package settings, and solver options.

**/opt/conda/.condarc**
> System-wide conda configuration.

# DESCRIPTION

**conda init** sets up shell integration for conda, modifying shell configuration files to enable the **conda activate** command and automatic base environment activation.

This must be run once after conda installation for full functionality.

# CAVEATS

Requires restarting the shell or sourcing the configuration file after running.

# INSTALL

```dnf: sudo dnf install conda```

```nix: nix profile install nixpkgs#conda```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[conda](/man/conda)(1), [conda-activate](/man/conda-activate)(1)

# RESOURCES

```[Source code](https://github.com/conda/conda)```

```[Documentation](https://docs.conda.io/projects/conda/en/stable/commands/init.html)```

<!-- verified: 2026-06-22 -->
