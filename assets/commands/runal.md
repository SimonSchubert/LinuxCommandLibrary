# TAGLINE

Creative coding environment for the terminal

# TLDR

**Run a creative coding sketch**

```runal [sketch.js]```

**Export animation as a GIF**

```runal --export gif [sketch.js]```

**Run with a custom canvas size**

```runal --width [80] --height [40] [sketch.js]```

# SYNOPSIS

**runal** [_options_] _script_

# PARAMETERS

**--export** _FORMAT_
> Export output to a file. Supported formats: png, gif, mp4.

**--width** _COLUMNS_
> Set canvas width in columns.

**--height** _ROWS_
> Set canvas height in rows.

# DESCRIPTION

**runal** is a text-based creative coding environment similar to Processing or p5.js, but rendering everything as text in the terminal. It can be programmed with JavaScript or used as a Go package. It supports 2D shapes, trigonometry, colors, and can export to PNG, GIF, or MP4.

# HISTORY

**runal** was created by **Xavier Godart** (emprcl) and is written in **Go**.

# SEE ALSO

[figlet](/man/figlet)(1), [terminaltexteffects](/man/terminaltexteffects)(1), [t-rec](/man/t-rec)(1)
