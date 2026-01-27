# TLDR

**Start KDE Plasma** on Wayland from console

```startplasma-wayland```

**Start with DBus session** wrapper (if needed)

```dbus-run-session startplasma-wayland```

**Start using the recommended wrapper script**

```/usr/lib/plasma-dbus-run-session-if-needed startplasma-wayland```

**Start with explicit session type**

```XDG_SESSION_TYPE=wayland startplasma-wayland```

# SYNOPSIS

**startplasma-wayland** [_options_]

# DESCRIPTION

**startplasma-wayland** starts the KDE Plasma desktop environment using the Wayland display protocol. It initializes the KWin Wayland compositor, Plasma shell, and associated desktop services.

This command is typically invoked automatically by display managers (SDDM, GDM) when selecting the "Plasma (Wayland)" session, but can also be started manually from a virtual console (TTY) for debugging or minimal setups.

Wayland provides improved security, better HiDPI support, and smoother graphics compared to X11. Legacy X11 applications run through XWayland compatibility layer automatically.

# CAVEATS

Starting from a console may require the DBus session wrapper depending on your system configuration. Some X11-only features like global keyboard shortcuts from certain applications may not work. Screen recording and remote desktop require portal support. GPU drivers must have proper Wayland support. Not all applications support Wayland natively; they run via XWayland.

# HISTORY

**startplasma-wayland** was introduced as KDE Plasma gained Wayland support. KDE began Wayland development in **2014** with the KWin compositor, reaching production-ready status around KDE Plasma 5.20 in **2020**. Plasma 6, released in **2024**, made Wayland the default session. The command replaced older X11-only startup methods as part of KDE's transition to Wayland.

# SEE ALSO

[startplasma-x11](/man/startplasma-x11)(1), [kwin_wayland](/man/kwin_wayland)(1), [plasmashell](/man/plasmashell)(1), [dbus-run-session](/man/dbus-run-session)(1)
