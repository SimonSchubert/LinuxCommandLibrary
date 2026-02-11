# TAGLINE

Toggle SteamOS filesystem write protection

# TLDR

**Disable** read-only mode (make filesystem writable)

```sudo steamos-readonly disable```

**Enable** read-only mode

```sudo steamos-readonly enable```

# SYNOPSIS

**steamos-readonly** _enable_|_disable_

# COMMANDS

**enable**
> Set filesystem to read-only mode

**disable**
> Set filesystem to writable mode

# DESCRIPTION

**steamos-readonly** controls the read-only status of the SteamOS root filesystem on the Steam Deck. By default, SteamOS uses an immutable root filesystem to maintain system integrity and simplify updates. This command allows temporarily disabling that protection for system modifications.

Disabling read-only mode allows installing packages, modifying configuration files, and making other system-level changes that would otherwise be blocked.

# CAVEATS

Changes to the filesystem may be overwritten by system updates. Disabling read-only mode can affect system stability if misused. Should be re-enabled after making changes. Consider using Flatpak or other containerized solutions when possible. Requires root privileges.

# HISTORY

**steamos-readonly** is part of **SteamOS 3.0**, developed by **Valve** for the **Steam Deck** released in **February 2022**. The immutable filesystem design is inspired by other modern Linux distributions like Fedora Silverblue, providing reliability while allowing advanced users to opt-out when needed.

# SEE ALSO

[steamos-devmode](/man/steamos-devmode)(1), [btrfs](/man/btrfs)(8), [mount](/man/mount)(8)
