# TAGLINE

Enable SteamOS developer mode

# TLDR

**Enable** developer mode

```sudo steamos-devmode enable```

Enable **without confirmation**

```sudo steamos-devmode enable --no-prompt```

Check developer mode **status**

```sudo steamos-devmode status```

# SYNOPSIS

**steamos-devmode** _command_ [_OPTIONS_]

# COMMANDS

**enable**
> Enable developer mode

**status**
> Check if developer mode is enabled

# PARAMETERS

**--no-prompt**
> Skip confirmation prompt when enabling

# DESCRIPTION

**steamos-devmode** enables developer mode on SteamOS (Steam Deck), which disables read-only filesystem protections and initializes the pacman package manager. This allows installing additional software, modifying system files, and customizing the operating system.

Developer mode is intended for advanced users who want to use the Steam Deck as a full Linux desktop, install development tools, or customize the system beyond the default configuration.

# CAVEATS

Disables read-only protections that prevent system modifications. System updates may overwrite changes made in developer mode. Not intended for regular users. May affect system stability if used improperly. Requires root privileges.

# HISTORY

**steamos-devmode** is part of **SteamOS 3.0**, developed by **Valve** for the **Steam Deck** released in **February 2022**. SteamOS 3.0 is based on Arch Linux and uses an immutable filesystem by default. Developer mode was provided to allow power users to modify the system while maintaining the option for a locked-down console experience.

# SEE ALSO

[steamos-readonly](/man/steamos-readonly)(1), [pacman](/man/pacman)(8), [steamos-add-to-steam](/man/steamos-add-to-steam)(1)
