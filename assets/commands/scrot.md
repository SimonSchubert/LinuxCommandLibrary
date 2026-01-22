# TLDR

Capture a **screenshot** and save with current date as filename

```scrot```

Capture a screenshot and save as **capture.png**

```scrot capture.png```

Capture a screenshot **interactively** (select region/window)

```scrot -s```

Capture screenshot interactively **without exiting** on keyboard input

```scrot -is```

Capture screenshot with **colored selection line**

```scrot -s -l color=[x11_color]```

Capture the **currently focused window**

```scrot -u```

Display a **countdown** of 10 seconds before taking screenshot

```scrot -c -d 10```

# SYNOPSIS

**scrot** [_options_] [_file_]

# PARAMETERS

**-s**, **--select**
> Interactively select a window or rectangle with mouse

**-u**, **--focused**
> Capture the currently focused window

**-b**, **--border**
> Include window border with -u

**-d**, **--delay** _sec_
> Wait _sec_ seconds before taking shot

**-c**, **--count**
> Display countdown when using delay

**-q**, **--quality** _num_
> Image quality (1-100) for JPEG

**-t**, **--thumb** _num_
> Generate thumbnail of specified percentage

**-e**, **--exec** _cmd_
> Execute command on saved image

**-l**, **--line** _style_
> Set line style for selection (color, width, etc.)

**-i**, **--ignorekeyboard**
> Don't exit selection mode on keyboard input

**-p**, **--pointer**
> Include mouse pointer in screenshot

**-o**, **--overwrite**
> Overwrite file if it exists

# DESCRIPTION

**scrot** (SCReenshot) is a simple command-line screen capture utility for X11. It can capture the entire screen, specific windows, or user-selected regions. Screenshots are saved as PNG, JPEG, or GIF files.

The tool supports delayed captures, thumbnails, and executing commands on the resulting image (useful for automatic uploading or editing). Special format strings allow dynamic filenames based on date, time, and dimensions.

# CAVEATS

X11 only; for Wayland use **grim** with **slurp**. Selection mode may not work with all window managers. Some compositors may cause issues with window captures.

# HISTORY

Originally written by Tom Gilbert, who also created **feh**. A simple, focused screenshot tool that has been widely used in Linux desktop environments, often integrated with keyboard shortcuts for quick captures.

# SEE ALSO

[maim](/man/maim)(1), [grim](/man/grim)(1), [import](/man/import)(1), [flameshot](/man/flameshot)(1)
