# TAGLINE

Switch SteamOS between gaming and desktop

# TLDR

Switch to **desktop** mode

```steamos-session-select plasma```

Switch to **gamemode**

```steamos-session-select```

Switch to **Wayland** desktop

```steamos-session-select plasma-wayland```

**Persistent** Wayland desktop (boot default)

```steamos-session-select plasma-wayland-persistent```

**Persistent** X11 desktop (boot default)

```steamos-session-select plasma-x11-persistent```

# SYNOPSIS

**steamos-session-select** [_SESSION_]

# SESSIONS

**plasma**
> KDE Plasma desktop mode

**plasma-wayland**
> KDE Plasma desktop on Wayland

**plasma-x11-persistent**
> X11 desktop, set as boot default

**plasma-wayland-persistent**
> Wayland desktop, set as boot default

(no argument)
> Return to gamemode (removes persistent desktop selection)

# DESCRIPTION

**steamos-session-select** switches between SteamOS sessions, allowing users to change from the gaming interface to the KDE Plasma desktop environment and back. Sessions with `-persistent` suffix make the device boot to that session by default.

This is the command-line equivalent of the session switching available in the Steam Deck's power menu.

# CAVEATS

Session changes take effect after the current session ends. Persistent sessions change the boot default until changed again. Gamemode is the default session on fresh installations.

# HISTORY

**steamos-session-select** is part of the **SteamOS** utilities developed by **Valve**. The dual-session design allows the Steam Deck to function as both a gaming console and a full Linux desktop.

# SEE ALSO

[steamos-devmode](/man/steamos-devmode)(1)
