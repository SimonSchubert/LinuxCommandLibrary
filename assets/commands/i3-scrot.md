# TAGLINE

Wrapper script around scrot for the i3 window manager

# TLDR

Capture **full screen** screenshot

```i3-scrot```

Capture the **active window**

```i3-scrot --window```

Capture a **selected region**

```i3-scrot --select```

Capture full screen and copy to **clipboard**

```i3-scrot --xclip --desk```

Capture active window and copy to **clipboard**

```i3-scrot --xclip --window```

Capture selection and copy to **clipboard**

```i3-scrot --xclip --select```

Capture full screen with a **delay** in seconds

```i3-scrot --desk [5]```

# SYNOPSIS

**i3-scrot** [_options_] [_delay_]

# PARAMETERS

**-d**, **--desk**
> Capture the full screen (default action).

**-w**, **--window**
> Capture the currently active window.

**-s**, **--select**
> Capture a user-selected rectangular region.

**-x**, **--xclip**
> Copy the screenshot to the clipboard instead of only saving to file.

**-h**, **--help**
> Display help information.

# DESCRIPTION

**i3-scrot** is a wrapper script around the scrot screenshot utility, designed for use with the i3 window manager. It provides convenient options for common screenshot operations and sends desktop notifications on completion.

Screenshots are saved to **~/Pictures** by default. The save location and other settings can be changed in **~/.config/i3-scrot.conf**. The default action without any flags is full screen capture.

# CAVEATS

Requires scrot and xclip to be installed. Designed for i3/Manjaro but works with other X11 window managers. Does not work with Wayland; use grim or hyprshot instead.

# HISTORY

i3-scrot was developed by Manjaro Linux as part of their i3 edition, providing convenient screenshot functionality integrated with the i3 window manager workflow.

# SEE ALSO

[scrot](/man/scrot)(1), [xclip](/man/xclip)(1), [i3](/man/i3)(1), [maim](/man/maim)(1), [grim](/man/grim)(1)
