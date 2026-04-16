# TAGLINE

Lightweight Wayland notification daemon

# TLDR

Start the **notification daemon**

```mako```

Start with a **custom config file**

```mako --config [path/to/config]```

Set **max visible** notifications

```mako --max-visible=5```

Set **default timeout** in milliseconds (0 disables)

```mako --default-timeout=2000```

**Group** notifications by app name

```mako --group-by=app-name```

Anchor notifications to a **screen position**

```mako --anchor=top-right```

# SYNOPSIS

**mako** [_options_]

# DESCRIPTION

**mako** is a lightweight notification daemon for Wayland compositors implementing the **org.freedesktop.Notifications** D-Bus specification. It is designed for use with **sway** and other wlroots-based compositors.

Any option accepted in the configuration file can also be provided on the command line using **--key=value**. The running daemon is controlled at runtime using **makoctl**.

# PARAMETERS

**-c** _FILE_, **--config** _FILE_
> Use the specified configuration file instead of the default

**-h**, **--help**
> Display help and exit

**--key=value**
> Any config-file style option (for example **--max-visible=5**, **--default-timeout=2000**, **--group-by=app-name**, **--sort=-time**, **--anchor=top-right**). See **mako(5)** for the full list.

# CAVEATS

Wayland only; requires a compositor that supports the **wlr-layer-shell** protocol. Configuration file location is **$XDG_CONFIG_HOME/mako/config** (usually **~/.config/mako/config**). Control a running instance with **makoctl**. For the full list of configuration keys and criteria, see **mako(5)**.

# SEE ALSO

[makoctl](/man/makoctl)(1), [dunst](/man/dunst)(1)
