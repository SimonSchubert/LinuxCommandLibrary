# TAGLINE

Customizable TUI display and login manager

# TLDR

**Start the display manager**

```lemurs```

# SYNOPSIS

**lemurs** [_options_]

# DESCRIPTION

**lemurs** is a terminal-based display and login manager for Linux and BSD systems. It uses PAM (Pluggable Authentication Modules) for authentication and can serve as the front-end for TTY, X11, or Wayland sessions. It works both with and without systemd.

Session environments are configured by placing scripts in **/etc/lemurs/wms** for X11 xinitrc scripts and **/etc/lemurs/wayland** for Wayland compositor scripts.

# CONFIGURATION

**/etc/lemurs/config.toml**
> Main configuration file for customizing the login screen appearance and behavior.

**/etc/lemurs/wms/**
> Directory for X11 session scripts.

**/etc/lemurs/wayland/**
> Directory for Wayland session scripts.

# CAVEATS

Requires PAM for authentication. Session scripts must be executable. Some desktop environments may require additional configuration to work with a TUI-based display manager.

# HISTORY

**lemurs** was created by **coastalwhite** and is written in **Rust**. It is available in the Arch Linux extra repository.

# SEE ALSO

[ly](/man/ly)(1), [lightdm](/man/lightdm)(1), [startx](/man/startx)(1)
