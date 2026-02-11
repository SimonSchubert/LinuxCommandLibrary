# TAGLINE

Paste data from Wayland clipboard

# TLDR

**Paste** the contents of the clipboard

```wl-paste```

Paste from the **primary** clipboard (highlighted text)

```wl-paste --primary```

**Write** clipboard contents to a file

```wl-paste > [path/to/file]```

**Pipe** clipboard contents to a command

```wl-paste | [command]```

# SYNOPSIS

**wl-paste** [_options_]

# PARAMETERS

**-p**, **--primary**
> Use the primary selection instead of clipboard

**-n**, **--no-newline**
> Do not append newline character

**-t**, **--type** _mime-type_
> Request specific MIME type

**-l**, **--list-types**
> List available MIME types

**-s**, **--seat** _seat_
> Pick the seat to work with

**-w**, **--watch** _command_ [_args_...]
> Run command each time clipboard changes

**-v**, **--version**
> Display version information

**-h**, **--help**
> Display help message

# DESCRIPTION

**wl-paste** retrieves data from the Wayland clipboard and writes it to stdout. It can request specific MIME types for clipboard data, supporting both text and binary content like images.

The primary selection (text selected with mouse) can be accessed with **--primary**, enabling middle-click paste functionality. The watch mode allows monitoring clipboard changes.

# CAVEATS

Only works under Wayland; use **xclip** or **xsel** for X11. MIME type availability depends on what the copying application provides. Some applications may not populate the primary selection.

# HISTORY

Part of **wl-clipboard**, written by Sergey Bugaev for Wayland-native clipboard access. Provides the paste counterpart to wl-copy, implementing the Wayland data-device protocol for clipboard reading.

# SEE ALSO

[wl-copy](/man/wl-copy)(1), [xclip](/man/xclip)(1), [xsel](/man/xsel)(1)
