# TAGLINE

GNOME window manager

# TLDR

**Start Mutter**

```mutter```

**Replace running window manager**

```mutter --replace```

**Run in wayland mode**

```mutter --wayland```

**Run in nested mode**

```mutter --nested```

**Display version**

```mutter --version```

# SYNOPSIS

**mutter** [_options_]

# PARAMETERS

**--replace**
> Replace running window manager.

**--wayland**
> Run as Wayland compositor.

**--nested**
> Run nested in another session.

**--version**
> Show version information.

**--help**
> Display help information.

# DESCRIPTION

**mutter** is the GNOME window manager. It handles window management and compositing.

The tool supports both X11 and Wayland. Core component of GNOME Shell.

# CAVEATS

GNOME specific. Requires GPU compositing. Usually run via GNOME Shell.

# HISTORY

Mutter is derived from **Metacity** and became the standard GNOME window manager with GNOME 3.

# SEE ALSO

[gnome-shell](/man/gnome-shell)(1), [muffin](/man/muffin)(1), [metacity](/man/metacity)(1)

