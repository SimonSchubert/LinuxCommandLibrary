# TAGLINE

TUI package searcher for Arch Linux repositories and AUR

# TLDR

**Launch the package search TUI**

```pacsea```

**Preview operations without making changes**

```pacsea --dry-run```

# SYNOPSIS

**pacsea** [_options_]

# PARAMETERS

**--dry-run**
> Preview operations without making actual changes.

# DESCRIPTION

**pacsea** is a terminal user interface for searching, inspecting, and queuing packages from both official Arch Linux repositories and the AUR. It features keyboard-first navigation, a package preflight review modal, and an integrated news feed for Arch advisories and updates.

# CAVEATS

Only works on Arch Linux and Arch-based distributions. Requires an AUR helper such as paru or yay for AUR package installation.

# HISTORY

**pacsea** was created by **Firstp1ck** and is written in **Rust**.

# SEE ALSO

[pacman](/man/pacman)(8), [pacseek](/man/pacseek)(1), [paru](/man/paru)(1), [yay](/man/yay)(1)
