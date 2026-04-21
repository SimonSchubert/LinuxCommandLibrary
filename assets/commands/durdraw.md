# TAGLINE

ASCII/ANSI art editor with animation support

# TLDR

**Launch** the ASCII/ANSI art editor

```durdraw```

**Open a file** (.dur or ASCII/ANSI) for editing

```durdraw [filename.dur]```

**Create a new canvas** with specific dimensions

```durdraw -W [80] -H [25]```

**Use the maximum canvas size** that fits the terminal

```durdraw -m```

**Play a .dur animation** and exit

```durdraw -p [animation.dur]```

**Loop an animation** a fixed number of times

```durdraw -p -x [3] [animation.dur]```

**Force 16- or 256-color mode**

```durdraw --256color```

**Export loaded art to .ansi** and exit

```durdraw --export-ansi [input.dur]```

# SYNOPSIS

**durdraw** [_options_] [_filename_]

# PARAMETERS

_FILENAME_
> A .dur, ASCII, or ANSI file to load.

**-p**, **--play**
> Play .dur file(s) then exit.

**-x**, **--times** _N_
> Play _N_ times (requires **-p**).

**--startup**
> Show the startup screen.

**-w**, **--wait**
> Pause on the startup screen.

**--256color**
> Force 256-color mode.

**--16color**
> Force 16-color mode.

**-b**, **--blackbg**
> Use a black background instead of the terminal default.

**-W**, **--width** _N_
> Set canvas width.

**-H**, **--height** _N_
> Set canvas height.

**-m**, **--max**
> Use the largest canvas that fits the terminal.

**--nomouse**
> Disable mouse support.

**--cursor** _STYLE_
> Cursor style: block, underscore, or pipe.

**--notheme**
> Disable theme support.

**--theme** _FILE_
> Load a custom theme file.

**--cp437**
> Use Code Page 437 encoding (beta).

**--export-ansi**
> Export loaded art to an .ansi file and exit.

**-u**, **--undosize** _N_
> Number of undo history states (default: 100).

**-V**, **--version**
> Show version and exit.

**-h**, **--help**
> Display help and exit.

# DESCRIPTION

**durdraw** is a versatile curses-based ASCII, ANSI, and Unicode art editor for drawing in Linux, Unix, and macOS terminals. It supports 16- and 256-color palettes, CP437 and Unicode, customizable themes, mouse input, and frame-by-frame animation with adjustable delay.

Files are saved in durdraw's native JSON-based `.dur` format, which preserves animation frames and metadata. Static art can be exported to `.ansi` for sharing on traditional ANSI art boards. Animations can be played back in the terminal with **durdraw -p** or the **durview** companion tool.

# KEYBINDINGS

**Arrow keys**
> Move cursor

**Space**
> Draw with selected brush

**Tab**
> Switch between foreground/background color

**c**
> Color picker mode

**b**
> Brush selection

**f**
> Flood fill

**Ctrl+S**
> Save file

**Ctrl+Q**
> Quit

**PgUp/PgDn**
> Navigate animation frames

**F5**
> Play/preview animation

# CAVEATS

Requires terminal with proper ANSI support. Animation playback depends on terminal capabilities. Large animations may consume significant memory. Some export formats require additional dependencies.

# HISTORY

**durdraw** was created by Sam "cmang" Foster as a modern successor to DOS-era ANSI editors like TheDraw and ACiDDraw, bringing terminal art creation to Linux, Unix, and macOS with features such as 256-color support, Unicode, and frame animation.

# SEE ALSO

[gimp](/man/gimp)(1), [imagemagick](/man/imagemagick)(1)