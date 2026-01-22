# TLDR

**Lock** the database

```sudo paclock```

Write the **lock file path** to stdout (without locking)

```paclock --print```

**Unlock** the database

```sudo paclock --unlock```

Display **help**

```paclock --help```

# SYNOPSIS

**paclock** [_options_]

# PARAMETERS

**--unlock**
> Remove the database lock instead of creating it

**--print**
> Print lock file path without taking any action

**--run** _command_
> Run command with the database locked, then unlock

**--config** _file_
> Use alternate pacman configuration file

**--dbpath** _path_
> Use alternate database path

**--root** _path_
> Use alternate installation root

**--help**
> Display help information

**--version**
> Display version information

# DESCRIPTION

**paclock** manages the libalpm database lock file used by pacman to prevent simultaneous package management operations. It allows manually locking or unlocking the database, which is useful for scripts that need exclusive database access or for recovering from stale locks.

The lock file prevents multiple pacman processes from modifying the package database concurrently, which could cause corruption. Normally pacman handles locking automatically, but paclock provides direct control when needed.

# CAVEATS

Requires root privileges to modify the lock file. Manually unlocking while pacman is running can cause database corruption. Use with caution; prefer letting pacman manage locks automatically unless troubleshooting specific issues.

# HISTORY

Part of **pacutils**, a collection of utilities for pacman by Andrew Gregory. Provides explicit lock management for advanced use cases and recovery from stale lock files left by crashed pacman processes.

# SEE ALSO

[pacman](/man/pacman)(8), [pactrans](/man/pactrans)(8), [flock](/man/flock)(1)
