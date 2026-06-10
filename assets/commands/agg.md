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
> Font size in pixels (default: 16).

**--font-family** _name_
> Comma-separated list of font families to use.

**--font-dir** _dir_
> Additional directory to scan for fonts.

**--line-height** _factor_
> Line height as a multiple of the font size (default: 1.4).

**--speed** _factor_
> Playback speed multiplier (default: 1).

**--theme** _name_
> Color theme (asciinema, dracula, github-dark, github-light, gruvbox-dark, kanagawa, monokai, nord, solarized-dark, solarized-light). Default: dracula.

**--cols** _n_
> Override terminal width in columns (default: from the recording).

**--rows** _n_
> Override terminal height in rows (default: from the recording).

**--fps-cap** _n_
> Maximum frames per second (default: 30).

**--renderer** _type_
> Rendering backend: swash (default) or resvg.

**--idle-time-limit** _seconds_
> Limit idle time between frames to this many seconds (default: 5).

**--no-loop**
> Disable looping; play the animation only once.

**--last-frame-duration** _seconds_
> How long to hold the last frame (default: 3).

# CAVEATS

Large or long recordings produce large GIF files. Consider adjusting speed or idle-time-limit to reduce file size. Font rendering quality depends on available system fonts.

# HISTORY

**agg** was created as a Rust-based alternative to other asciinema-to-GIF tools, providing better performance and rendering quality. It's maintained as part of the asciinema ecosystem.

# SEE ALSO

[asciinema](/man/asciinema)(1), [ffmpeg](/man/ffmpeg)(1)

# RESOURCES

```[Source code](https://github.com/asciinema/agg)```

```[Documentation](https://docs.asciinema.org/manual/agg/)```

<!-- verified: 2026-06-11 -->
