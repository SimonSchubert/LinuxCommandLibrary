# TAGLINE

ASCII/ANSI art editor with animation support

# TLDR

**Launch** the ASCII art editor

```durdraw```

**Open** a file for editing

```durdraw [filename.ans]```

**Create** a new file with specific dimensions

```durdraw -w 80 -h 25 [filename.ans]```

**Play** an animation file

```durdraw -p [animation.ans]```

# SYNOPSIS

**durdraw** [_options_] [_filename_]

# PARAMETERS

**-w, --width** _N_
> Set canvas width (default: 80)

**-h, --height** _N_
> Set canvas height (default: 25)

**-p, --play**
> Play animation mode

**-f, --fps** _N_
> Set animation frames per second

**--export** _FORMAT_
> Export format: png, gif, txt

**--no-mouse**
> Disable mouse support

**--ascii-only**
> Restrict to ASCII characters only

**-v, --version**
> Display version and exit

**--help**
> Display help and exit

# DESCRIPTION

**durdraw** is a terminal-based ASCII and ANSI art editor with animation support. It allows users to create text-based artwork with color support, save in various formats, and create frame-by-frame animations.

The editor provides a retro computing aesthetic with modern features like mouse support, color picker, brush tools, and layer management. It's popular in the ASCII art community for creating both static and animated artworks.

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

**durdraw** was developed as a modern ASCII/ANSI art editor combining the nostalgia of DOS-based art programs with contemporary features. It has become popular in the ANSI art scene for its animation capabilities.

# SEE ALSO

[pablodraw](/man/pablodraw)(1), [asciio](/man/asciio)(1), [gimp](/man/gimp)(1), [imagemagick](/man/imagemagick)(1)