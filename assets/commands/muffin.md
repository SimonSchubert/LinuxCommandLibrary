# TAGLINE

Cinnamon desktop window manager and compositor

# TLDR

**Start Muffin window manager**

```muffin```

**Replace running window manager**

```muffin --replace```

**Connect to a specific X display**

```muffin --display=[display]```

**Display version**

```muffin --version```

# SYNOPSIS

**muffin** [_options_]

# PARAMETERS

**--replace**
> Replace an already-running window manager with Muffin.

**--display**=_DISPLAY_
> Connect to the specified X display.

**--sm-client-id**=_ID_
> Specify a session management client ID.

**--sm-disable**
> Disable session management.

**--sm-save-file**=_FILENAME_
> Load a previously saved session from file.

**--version**
> Show version information.

**-?**, **--help**
> Display help information.

# DESCRIPTION

**muffin** is a Clutter-based compositing window manager for the Cinnamon desktop environment. It is a fork of GNOME's Mutter, aimed at nontechnical users and designed to integrate closely with the Cinnamon desktop.

Muffin handles window placement, compositing, and basic window management. It uses GTK and intentionally omits some features found in traditional Unix window managers.

# CAVEATS

Cinnamon desktop specific. Requires X11 compositing support. GPU acceleration recommended. Does not support Wayland.

# HISTORY

muffin was forked from **GNOME's Mutter** for use with the Linux Mint Cinnamon desktop environment. It is maintained as part of the Cinnamon project.

# SEE ALSO

[mutter](/man/mutter)(1), [cinnamon](/man/cinnamon)(1), [kwin](/man/kwin)(1), [openbox](/man/openbox)(1)

