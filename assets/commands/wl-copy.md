# TAGLINE

Copy data to Wayland clipboard

# TLDR

**Copy text** to the clipboard

```wl-copy "[text]"```

**Pipe** command output to the clipboard

```ls | wl-copy```

Copy for **only one paste** then clear

```wl-copy --paste-once "[text]"```

Copy an **image**

```wl-copy < [path/to/image]```

**Clear** the clipboard

```wl-copy --clear```

# SYNOPSIS

**wl-copy** [_options_] [_text_]

# PARAMETERS

**-o**, **--paste-once**
> Only serve one paste request then exit

**-c**, **--clear**
> Clear the clipboard instead of copying

**-p**, **--primary**
> Use the primary selection instead of clipboard

**-n**, **--trim-newline**
> Do not append newline character

**-t**, **--type** _mime-type_
> Set the MIME type for the content

**-s**, **--seat** _seat_
> Pick the seat to work with

**-f**, **--foreground**
> Stay in foreground instead of forking

**-v**, **--version**
> Display version information

**-h**, **--help**
> Display help message

# DESCRIPTION

**wl-copy** copies data to the Wayland clipboard. It can copy text from arguments or read binary data from stdin, automatically handling MIME types. The tool forks into the background by default to keep the clipboard contents available.

Data can be piped into wl-copy for copying command output or file contents. It supports both the regular clipboard and the primary selection (for middle-click paste).

# CAVEATS

Only works under Wayland; use **xclip** or **xsel** for X11. The process must stay running (or fork) to serve paste requests. Clipboard contents are lost when wl-copy exits in foreground mode.

# HISTORY

Part of **wl-clipboard**, written by Sergey Bugaev for Wayland-native clipboard access. Provides equivalent functionality to X11 tools like xclip and xsel but uses the Wayland clipboard protocol.

# SEE ALSO

[wl-paste](/man/wl-paste)(1), [xclip](/man/xclip)(1), [xsel](/man/xsel)(1)
