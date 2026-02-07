# TAGLINE

Convert terminal recordings to animated GIFs

# TLDR

**Convert** asciinema recording to GIF

```agg [recording.cast] [output.gif]```

Set **font size**

```agg --font-size [20] [recording.cast] [output.gif]```

Set **playback speed**

```agg --speed [2] [recording.cast] [output.gif]```

Use **custom theme**

```agg --theme [monokai] [recording.cast] [output.gif]```

Set output **dimensions**

```agg --cols [80] --rows [24] [recording.cast] [output.gif]```

# SYNOPSIS

**agg** [_options_] _input.cast_ _output.gif_

# DESCRIPTION

**agg** (asciinema gif generator) converts asciinema terminal recordings to animated GIF files. It renders terminal sessions including colors, cursor, and all formatting into a high-quality GIF suitable for documentation or sharing.

The tool is written in Rust and provides options for customizing output appearance including themes, fonts, dimensions, and playback speed.

# PARAMETERS

**--font-size** _size_
> Font size in pixels (default: 14)

**--font-family** _name_
> Font family name

**--speed** _factor_
> Playback speed multiplier

**--theme** _name_
> Color theme (asciinema, dracula, monokai, solarized-dark, solarized-light)

**--cols** _n_
> Terminal width in columns

**--rows** _n_
> Terminal height in rows

**--fps** _n_
> Frames per second (default: variable)

**--renderer** _type_
> Renderer: fontdue or resvg

**--idle-time-limit** _seconds_
> Maximum idle time between frames

# CAVEATS

Large or long recordings produce large GIF files. Consider adjusting speed or idle-time-limit to reduce file size. Font rendering quality depends on available system fonts.

# HISTORY

**agg** was created as a Rust-based alternative to other asciinema-to-GIF tools, providing better performance and rendering quality. It's maintained as part of the asciinema ecosystem.

# SEE ALSO

[asciinema](/man/asciinema)(1), [gif](/man/gif)(1), [ffmpeg](/man/ffmpeg)(1)
