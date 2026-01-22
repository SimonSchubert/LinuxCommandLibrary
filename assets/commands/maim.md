# TLDR

**Capture** full screenshot

```maim [path/to/screenshot.png]```

Capture **selected region**

```maim --select [path/to/screenshot.png]```

Capture to **clipboard**

```maim --select | xclip -selection clipboard -target image/png```

Capture **active window**

```maim --window $(xdotool getactivewindow) [path/to/screenshot.png]```

# SYNOPSIS

**maim** [_options_] [_file_]

# DESCRIPTION

**maim** (make image) is a lightweight screenshot utility for X11. It can capture the entire screen, a selected region, or a specific window, saving in various formats.

# PARAMETERS

**-s, --select**
> Interactively select region to capture

**-i, --window ID**
> Capture specific window by ID

**-d, --delay SECONDS**
> Delay before capture

**-u, --hidecursor**
> Hide cursor in screenshot

**-g, --geometry WxH+X+Y**
> Set capture geometry

**-f, --format FORMAT**
> Output format (png, jpg, bmp)

**-m, --quality QUALITY**
> JPEG quality (1-100)

# CAVEATS

X11 only, does not work with Wayland. Region selection requires slop. Window capture often used with xdotool.

# SEE ALSO

[scrot](/man/scrot)(1), [import](/man/import)(1), [grim](/man/grim)(1), [flameshot](/man/flameshot)(1)
