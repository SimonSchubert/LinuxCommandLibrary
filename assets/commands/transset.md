# TAGLINE

Set X11 window transparency

# TLDR

**Set window transparency by clicking**

```transset [0.8]```

**Set transparency for specific window ID**

```transset -i [0x1400003] [0.75]```

**Toggle transparency on clicked window**

```transset -t```

**Increase transparency of clicked window**

```transset --inc [0.1]```

**Decrease transparency of clicked window**

```transset --dec [0.1]```

**Apply to all windows**

```transset -a [0.9]```

# SYNOPSIS

**transset** [_options_] [_opacity_]

# PARAMETERS

**-i**, **--id** _id_
> Select window by X window ID.

**-n**, **--name** _name_
> Select window by name.

**-t**, **--toggle**
> Toggle between current opacity and fully opaque.

**--inc** _value_
> Increase opacity by specified amount.

**--dec** _value_
> Decrease opacity by specified amount.

**-a**, **--all**
> Apply to all windows.

**-p**, **--point**
> Select window under pointer (default).

**-v**, **--verbose**
> Print verbose output.

**--version**
> Display version.

# DESCRIPTION

**transset** sets window transparency in X11 by modifying the _NET_WM_WINDOW_OPACITY property on windows. The opacity value ranges from 0 (fully transparent) to 1 (fully opaque), with 0.75 as the default.

The tool requires a compositing window manager (such as picom, xcompmgr, KWin, or Mutter) to actually render the transparency. Without a compositor, the property is set but no visual effect occurs.

By default, transset enters interactive mode where clicking on a window sets its transparency. Window ID or name options allow non-interactive scripted use.

# CAVEATS

Requires a running compositing manager for visible effects. X11 only; does not work on Wayland. Some applications may not respect transparency settings. Window IDs change between sessions.

# HISTORY

**transset** was developed as part of the X.Org project to demonstrate and utilize the COMPOSITE extension. The transset-df variant by Daniel Forchheimer added command-line options for scripted use without interactive clicking.

# SEE ALSO

[xwininfo](/man/xwininfo)(1), [picom](/man/picom)(1), [xcompmgr](/man/xcompmgr)(1), [xprop](/man/xprop)(1)
