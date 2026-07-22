# TAGLINE

stop the GNOME Display Manager service

# TLDR

**Stop GNOME Display Manager**

```sudo gdm-stop```

# SYNOPSIS

**gdm-stop**

# DESCRIPTION

**gdm-stop** stops the GNOME Display Manager service entirely, terminating all graphical sessions and shutting down the graphical login interface. The system returns to text console mode (TTY), making this useful for troubleshooting graphics issues, performing system maintenance, or switching to a different display manager.

All logged-in users will be forcibly logged out when GDM stops. On systemd-based systems, this is typically a wrapper for `systemctl stop gdm`. After stopping GDM, you can start it again with `systemctl start gdm` or access text consoles directly.

# CAVEATS

Stopping GDM will terminate all graphical sessions. Save your work before running this command.

# INSTALL

```dnf: sudo dnf install gdm```

```pacman: sudo pacman -S gdm```

```apk: sudo apk add gdm```

```zypper: sudo zypper install gdm```

```nix: nix profile install nixpkgs#gdm```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[gdm-restart](/man/gdm-restart)(1), [gdm](/man/gdm)(8), [systemctl](/man/systemctl)(1)

