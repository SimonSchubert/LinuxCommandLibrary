# TAGLINE

lightweight screenshot utility for X11

# TLDR

**Capture** full screenshot

```maim [path/to/screenshot.png]```

Capture **selected region**

```maim --select [path/to/screenshot.png]```

Capture to **clipboard**

```maim --select | xclip -selection clipboard -target image/png```

Capture **active window**

```maim --window $(xdotool getactivewindow) [path/to/screenshot.png]```

Capture with a **delay** of 5 seconds

```maim --delay 5 [path/to/screenshot.png]```

Capture as **JPEG** with quality setting

```maim --format jpg --quality 7 [path/to/screenshot.jpg]```

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
> Output format (png, jpg, bmp, webp). Auto-detected from filename, defaults to png.

**-m, --quality QUALITY**
> Compression quality (1-10). For lossy formats, lower means smaller file size and lower quality.

**-B, --capturebackground**
> Capture content beneath the specified window as well.

**-q, --quiet**
> Disable any unnecessary stderr output.

**-k, --nokeyboard**
> Disable the ability to cancel selections with the keyboard.

**-l, --highlight**
> Highlight the selection instead of outlining it.

# CAVEATS

X11 only, does not work with Wayland. Region selection requires slop. Window capture often used with xdotool.

# SEE ALSO

[scrot](/man/scrot)(1), [import](/man/import)(1), [grim](/man/grim)(1), [flameshot](/man/flameshot)(1), [slop](/man/slop)(1), [xdotool](/man/xdotool)(1), [xclip](/man/xclip)(1)
