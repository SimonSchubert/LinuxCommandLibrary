# TAGLINE

safely locks and unlocks the ALPM (pacman) database from scripts

# TLDR

**Lock** the database

```sudo paclock```

Write the **lock file path** to stdout (without locking)

```paclock --print```

**Unlock** the database

```sudo paclock --unlock```

**Run a command** with the database locked

```sudo paclock --run -- [paccache --dryrun --verbose]```

Lock and unlock with an explicit **identity key**

```sudo paclock --key [myapp:host:123] && sudo paclock --key [myapp:host:123] --unlock```

Display **help**

```paclock --help```

# SYNOPSIS

**paclock** [_options_]

# PARAMETERS

**--lock**
> Lock the database (default)

**--unlock**
> Unlock the database; by default only if locked with the same key

**--run** _command_...
> Run a command with the database locked; on non-zero exit the lock is left in place

**--fail-ok**
> With **--run**, unlock even if the command fails (for read-only operations)

**--print**
> Write the lock file path to stdout and exit without modifying it

**--key** _identity_
> Identifier written to the lock file (default: _hostname_:_pid_)

**--no-check-keys**
> Skip the identity key check before unlocking

**--enoent-ok**
> Do not treat a missing lock file as an error when unlocking

**--lockfile** _path_
> Use alternate lock file path

**--config** _file_
> Use alternate pacman configuration file

**--root** _path_
> Use alternate installation root

**--sysroot** _path_
> Use alternate system root (see pacutils-sysroot(7))

**--help**
> Display help information

**--version**
> Display version information

# DESCRIPTION

**paclock** manages the libalpm database lock file (normally **/var/lib/pacman/db.lck**) used by pacman to prevent simultaneous package management operations. It writes an identity key into the lock file so that a script only removes a lock it created itself, which makes it safe for scripts that need exclusive database access.

The lock file prevents multiple pacman processes from modifying the package database concurrently, which could cause corruption. Normally pacman handles locking automatically, but paclock provides direct control when needed.

# CAVEATS

Requires root privileges to modify the lock file. Because the default key includes the caller's PID, a separate **--unlock** call fails unless the same **--key** (or **--no-check-keys**) is given; scripts should pass explicit **--lockfile** and **--key** values each time. Unlocking while pacman is running can corrupt the database.

# HISTORY

Part of **pacutils**, a collection of utilities for pacman by Andrew Gregory. Provides explicit lock management for advanced use cases and recovery from stale lock files left by crashed pacman processes.

# INSTALL

```pacman: sudo pacman -S pacutils```

<!-- packages: 2026-11-07 -->

# SEE ALSO

[pacman](/man/pacman)(8), [pactrans](/man/pactrans)(8), [flock](/man/flock)(1)

# RESOURCES

```[Source code](https://github.com/andrewgregory/pacutils)```

<!-- verified: 2026-11-07 -->
