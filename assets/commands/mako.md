# TLDR

Start **notification daemon**

```mako```

Start with **custom config**

```mako --config [path/to/config]```

Set **max visible** notifications

```mako --max-visible 5```

Set **default timeout** (milliseconds)

```mako --default-timeout 2000```

**Group** notifications by app

```mako --group-by app_name```

Display **help**

```mako --help```

# SYNOPSIS

**mako** [_options_]

# DESCRIPTION

**mako** is a lightweight notification daemon for Wayland compositors implementing the freedesktop.org notification specification. It is designed for use with sway and other wlroots-based compositors.

# PARAMETERS

**-c, --config FILE**
> Use custom configuration file

**--max-visible N**
> Maximum notifications shown at once

**--default-timeout MS**
> Default notification timeout (0 to disable)

**--group-by FIELD**
> Group notifications by field (app_name, summary, etc.)

**--sort CRITERIA**
> Sort notifications (-time, +time, -priority, +priority)

**--anchor POSITION**
> Screen anchor (top-right, bottom-left, etc.)

**-h, --help**
> Display help information

# CAVEATS

Wayland only. Control running daemon with makoctl. Configuration file location: ~/.config/mako/config

# SEE ALSO

[makoctl](/man/makoctl)(1), [dunst](/man/dunst)(1), [swaync](/man/swaync)(1)
