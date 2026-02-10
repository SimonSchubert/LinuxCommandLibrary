# TAGLINE

terminal user interface for managing Wi-Fi networks

# TLDR

Launch in **station mode**

```impala```

Launch in **Access Point** mode

```impala -m ap```

**Navigate** between sections

```Tab / Shift+Tab```

**Select** a network

```Space```

Show **hotkeys**

```?```

# SYNOPSIS

**impala** [_options_]

# DESCRIPTION

**impala** is a terminal user interface (TUI) for managing Wi-Fi networks. It provides an interactive way to scan, connect, and manage wireless connections without using the command line directly.

# PARAMETERS

**-m, --mode MODE**
> Set operating mode: "station" (default) or "ap" (Access Point)

**-h, --help**
> Display help information

**-V, --version**
> Display version information

# CAVEATS

Requires appropriate wireless interface and permissions. Access Point mode requires a compatible wireless adapter that supports AP mode. Uses iwd (iNet Wireless Daemon) as the backend.

# HISTORY

**impala** was created to provide a user-friendly TUI for wireless network management, making it easier to manage Wi-Fi connections in terminal environments.

# SEE ALSO

[iwctl](/man/iwctl)(1), [nmtui](/man/nmtui)(1), [nmcli](/man/nmcli)(1), [wpa_cli](/man/wpa_cli)(8)
