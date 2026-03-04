# TAGLINE

Modern dotfile manager with Git integration

# TLDR

**Initialize** a new dotstate repository

```dotstate init [directory]```

**Add** a file to dotstate tracking

```dotstate add [path/to/file]```

**Sync** dotfiles to current system

```dotstate sync```

**Track** and commit changes

```dotstate commit -m "message"```

# SYNOPSIS

**dotstate** [_command_] [_options_] [_arguments_]

# PARAMETERS

**-c, --config** _FILE_
> Configuration file path

**-d, --dotfiles** _DIR_
> Dotfiles repository directory

**-v, --verbose**
> Enable verbose output

**--dry-run**
> Show what would be done without making changes

**-h, --help**
> Display help and exit

**--version**
> Display version and exit

# DESCRIPTION

**dotstate** is a modern dotfile manager that uses Git for version control while providing a simplified interface for common dotfile operations. It helps users manage configuration files across multiple machines by tracking them in a Git repository.

The tool provides commands for initializing a dotfiles repo, adding files to tracking, synchronizing configurations between systems, and handling platform-specific files. It maintains a clean separation between the actual dotfiles in the home directory and the repository.

# COMMANDS

**init** [_DIRECTORY_]
> Initialize a new dotstate repository

**add** _FILE_
> Add a file to dotstate tracking

**remove** _FILE_
> Remove a file from tracking

**sync**
> Synchronize dotfiles to current system

**status**
> Show repository status

**commit** [_-m_ _MESSAGE_]
> Commit changes to repository

**push**
> Push changes to remote

**pull**
> Pull changes from remote

**list**
> List all tracked files

# CAVEATS

Requires Git to be installed and configured. May overwrite existing files during sync - backups recommended. Platform-specific configurations need manual handling. Symbolic link handling varies by operating system.

# HISTORY

**dotstate** was created as a modern alternative to traditional dotfile managers, focusing on simplicity and Git integration. It aims to provide the power of version control without the complexity of manual Git operations.

# SEE ALSO

[git](/man/git)(1), [stow](/man/stow)(1), [chezmoi](/man/chezmoi)(1), [yadm](/man/yadm)(1)