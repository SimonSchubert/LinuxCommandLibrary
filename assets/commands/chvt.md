# TAGLINE

Switch the foreground virtual terminal

# TLDR

Change to a **specific TTY**

```sudo chvt [3]```

# SYNOPSIS

**chvt** _N_

# DESCRIPTION

**chvt** changes the foreground virtual terminal to terminal N. Virtual terminals (VTs) are the text consoles accessible via Ctrl+Alt+F1 through F7 on most Linux systems.

This is equivalent to pressing Ctrl+Alt+FN but can be done programmatically or when keyboard shortcuts are unavailable.

# PARAMETERS

_N_
> The virtual terminal number to switch to (typically 1-7)

# CAVEATS

Requires root privileges. The target VT must exist. On systems with graphical desktop, VT7 or VT1 is typically the X/Wayland session. Available VTs depend on system configuration.

# INSTALL

```apt: sudo apt install kbd```

```dnf: sudo dnf install kbd```

```pacman: sudo pacman -S kbd```

```apk: sudo apk add kbd```

```zypper: sudo zypper install kbd```

```nix: nix profile install nixpkgs#kbd```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[fgconsole](/man/fgconsole)(1), [deallocvt](/man/deallocvt)(1)
