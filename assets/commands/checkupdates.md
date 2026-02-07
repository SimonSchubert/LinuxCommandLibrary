# TAGLINE

safely check for Arch Linux package updates

# TLDR

Synchronize database and **list pending updates**

```checkupdates```

List pending updates **without syncing** the database

```checkupdates -n```

Display updates only if **different from last check**

```checkupdates -c```

List updates and **download packages** to cache

```checkupdates -d```

Use a **specific pacman database**

```CHECKUPDATES_DB=[path/to/directory] checkupdates```

# SYNOPSIS

**checkupdates** [_options_]

# DESCRIPTION

**checkupdates** safely checks for pending updates in Arch Linux without requiring root privileges. It creates a temporary copy of the sync database to check for updates, avoiding any modifications to the system.

Part of the pacman-contrib package, it provides a safe way to check updates that can be used in scripts and status bars.

# PARAMETERS

**-n, --nosync**
> Don't synchronize the database, use cached data

**-c, --change**
> Only display if updates differ from last check

**-d, --download**
> Download packages to pacman cache while checking

**-h, --help**
> Display help message

# ENVIRONMENT

**CHECKUPDATES_DB**
> Path to use for the temporary database

# CAVEATS

Arch Linux specific. Requires network access for database synchronization unless using --nosync. The temporary database is stored in a user-writable location.

# SEE ALSO

[pacman](/man/pacman)(8), [paru](/man/paru)(1), [yay](/man/yay)(1)
