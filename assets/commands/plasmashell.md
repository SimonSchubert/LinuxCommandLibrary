# TAGLINE

KDE Plasma desktop shell and panels

# TLDR

**Restart** plasmashell via systemd

```systemctl restart --user plasma-plasmashell```

Restart plasmashell **without systemd**

```plasmashell --replace & disown```

Display **help**

```plasmashell -h```

Display help including **Qt options**

```plasmashell --help-all```

# SYNOPSIS

**plasmashell** [**--replace**] [**-h**|**--help**] [**--help-all**]

# PARAMETERS

**--replace**
> Replace currently running plasmashell instance

**-h, --help**
> Display help information

**--help-all**
> Display help including Qt options

# DESCRIPTION

**plasmashell** is the KDE Plasma desktop shell, providing the desktop, panels, system tray, and widgets. It's the core visual component of the Plasma desktop environment.

The shell is normally started automatically by the Plasma session. Manual restart may be needed after crashes or to apply certain configuration changes.

# CAVEATS

Killing plasmashell removes desktop and panels. Use --replace for graceful restart. Systemd method preferred on modern systems. Background process should be disowned from terminal.

# HISTORY

**plasmashell** is the successor to plasma-desktop from KDE 4. It was rewritten for KDE Plasma 5 using Qt 5 and the KDE Frameworks 5, providing improved performance and modern features.

# SEE ALSO

[kwin](/man/kwin)(1), [startplasma-wayland](/man/startplasma-wayland)(1), [startplasma-x11](/man/startplasma-x11)(1)
