# TAGLINE

Dotfile manager with a TUI and Git sync

# TLDR

**Open the TUI** to set up and manage dotfiles

```dotstate```

**Add** a file to sync

```dotstate add [path/to/file]```

**Sync** with the remote: commit, pull and push

```dotstate sync```

**Sync** with a custom commit message

```dotstate sync -m "[message]"```

**List** all synced files

```dotstate list```

**Activate** symlinks after cloning on a new machine

```dotstate activate```

**Switch** to another profile

```dotstate profile switch [work]```

**Install** missing packages for the profile

```dotstate packages install```

**Diagnose and fix** problems

```dotstate doctor --fix```

# SYNOPSIS

**dotstate** [_command_] [_options_]

# PARAMETERS

**--no-colors**
> Disable colors in the TUI (also respects **NO_COLOR**)

**--skill**
> Print the built-in agent skill (SKILL.md) and exit

**--install**
> With **--skill**: install the skill to ~/.claude/skills/dotstate/SKILL.md

**-h**, **--help**
> Display help and exit

**-V**, **--version**
> Display version and exit

# COMMANDS

**sync** [**-m** _message_]
> Commit, pull with rebase, and push

**list** [**-v**]
> List all synced files

**add** _path_ [**--common**] [**-y**]
> Add a file to sync. **--common** shares it across all profiles

**remove** _path_ [**--common**] [**-y**]
> Remove a file from sync. The path is relative to the home directory

**activate**
> Activate the symlinks, restoring app state after deactivation

**deactivate**
> Deactivate the symlinks and restore the original files

**profile** [**current** | **list** | **switch** _name_]
> Show, list or switch profiles

**packages** **list** | **add** | **remove** | **check** | **install**
> Manage the CLI tools tracked for a profile

**doctor** [**--fix**] [**-v**] [**--json**]
> Run diagnostics and optionally fix issues

**upgrade** [**--check**]
> Check for updates and optionally upgrade

**logs** | **config** | **repository**
> Show the location of the logs, configuration file or repository

**omarchy** **--install** | **--uninstall**
> Add or remove a floating launcher app entry on Omarchy

**completions** [_shell_]
> Generate shell completions

**help** [_command_]
> Show help for a command

# DESCRIPTION

**dotstate** is a terminal-based dotfile manager written in Rust. Files are stored in a Git repository (by default **~/.config/dotstate/storage**) and linked into place with automatically managed symlinks, with backups taken before file operations. It needs no Git knowledge: setup can create a GitHub repository for you or use your own on any Git host.

Profiles keep separate configurations for contexts such as work, personal, or an operating system. A profile can extend a parent and override only what differs, and common files are shared across all profiles. Packages can be tracked per profile through managers such as Homebrew, Cargo, npm and pip.

# CONFIGURATION

**~/.config/dotstate/config.toml**
> Main configuration, including update checks, the theme and the keymap preset (Standard, Vim or Emacs).

# CAVEATS

Requires Git. Run the TUI once to set up a repository before relying on the sync commands.

# SEE ALSO

[git](/man/git)(1), [stow](/man/stow)(1), [chezmoi](/man/chezmoi)(1), [yadm](/man/yadm)(1)

# RESOURCES

```[Homepage](https://dotstate.serkan.dev/)```

```[Source code](https://github.com/serkanyersen/dotstate)```

<!-- verified: 2026-11-09 -->
