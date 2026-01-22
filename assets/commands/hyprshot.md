# TLDR

Select and screenshot a **region**

```hyprshot -m region```

Select and screenshot a **specific window**

```hyprshot -m window```

Select and screenshot a **specific output**

```hyprshot -m output```

Screenshot the **active window**

```hyprshot -m active -m window```

**Freeze** the screen and screenshot selected region

```hyprshot -z -m region```

Screenshot to a specific **output directory**

```hyprshot -o [path/to/directory] -m window```

Screenshot to **clipboard only**

```hyprshot --clipboard -m output```

# SYNOPSIS

**hyprshot** [_options_] **-m** _mode_

# PARAMETERS

**-m**, **--mode** _MODE_
> Screenshot mode: region, window, output, active

**-o**, **--output-folder** _DIR_
> Save screenshots to specified directory

**-f**, **--filename** _NAME_
> Set output filename

**--clipboard**
> Copy to clipboard only (don't save to file)

**-z**, **--freeze**
> Freeze screen while selecting

**-s**, **--silent**
> Don't send notification after screenshot

**-r**, **--raw**
> Output raw image data to stdout

**-d**, **--delay** _SECONDS_
> Wait before taking screenshot

# DESCRIPTION

**hyprshot** is a screenshot utility designed specifically for the Hyprland Wayland compositor. It provides interactive selection for regions, windows, and outputs with clipboard integration.

Modes:
- **region** - Select a rectangular area
- **window** - Select a specific window
- **output** - Select a monitor/output
- **active** - Combined with window/output for current focus

Screenshots are saved to **~/Pictures/Screenshots** by default. The tool uses slurp for region selection and grim for capture.

# CAVEATS

Requires Hyprland, grim, slurp, and wl-clipboard. The freeze option may not work on all systems. Window selection depends on Hyprland's client list.

# HISTORY

hyprshot was created by Gustash as a convenient wrapper around screenshot tools for Hyprland users. It provides a streamlined interface compared to manually combining grim and slurp.

# SEE ALSO

[hyprctl](/man/hyprctl)(1), [grim](/man/grim)(1), [slurp](/man/slurp)(1), [wl-copy](/man/wl-copy)(1)
