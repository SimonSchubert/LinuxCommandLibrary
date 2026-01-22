# TLDR

Capture **full screen** screenshot

```i3-scrot```

Capture **active window**

```i3-scrot --window```

Capture **selected region**

```i3-scrot --select```

Capture full screen to **clipboard**

```i3-scrot --desk-to-clipboard```

Capture active window to **clipboard**

```i3-scrot --window-to-clipboard```

Capture selection to **clipboard**

```i3-scrot --select-to-clipboard```

Capture window with **delay** (seconds)

```i3-scrot --window [5]```

# SYNOPSIS

**i3-scrot** [_options_] [_delay_]

# PARAMETERS

**--window**
> Capture the currently active window

**--select**
> Capture a user-selected rectangular region

**--desk-to-clipboard**
> Capture full screen and copy to clipboard

**--window-to-clipboard**
> Capture active window and copy to clipboard

**--select-to-clipboard**
> Capture selection and copy to clipboard

# DESCRIPTION

**i3-scrot** is a wrapper script around the scrot screenshot utility, designed for use with the i3 window manager. It provides convenient options for common screenshot operations.

Screenshots are saved to **~/Pictures** by default. The save location and other settings can be changed in **~/.config/i3-scrot.conf**.

# CAVEATS

Requires scrot and xclip to be installed. Designed for i3/Manjaro but works with other X11 window managers. Does not work with Wayland; use grim or hyprshot instead.

# HISTORY

i3-scrot was developed by Manjaro Linux as part of their i3 edition, providing convenient screenshot functionality integrated with the i3 window manager workflow.

# SEE ALSO

[scrot](/man/scrot)(1), [xclip](/man/xclip)(1), [i3](/man/i3)(1)
