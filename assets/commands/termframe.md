# TAGLINE

Terminal output SVG screenshot tool

# TLDR

**Capture command output as SVG**

```termframe -o [output.svg] -- ls --color=always```

**Auto-detect terminal size**

```termframe --width auto --height auto -o [out.svg] -- [command]```

**Use a specific color theme**

```termframe --theme "[Solarized Dark]" -o [out.svg] -- [command]```

# SYNOPSIS

**termframe** [_options_] **-o** _output.svg_ **--** _command_

# PARAMETERS

**-o** _FILE_
> Output SVG file path.

**--width** _VALUE_
> Terminal width (number or auto).

**--height** _VALUE_
> Terminal height (number or auto).

**--theme** _NAME_
> Color theme from iTerm2-Color-Schemes.

# DESCRIPTION

**termframe** is a non-interactive terminal emulator that executes a command, renders its output in a virtual terminal session, and exports the result as an SVG file. It supports full color ranges (16, 256, truecolor), text styles, font embedding, and dark/light mode.

# HISTORY

**termframe** was created by **Pavel Ivanov** (pamburus) and is written in **Rust**.

# SEE ALSO

[silicon](/man/silicon)(1), [termtosvg](/man/termtosvg)(1), [t-rec](/man/t-rec)(1)
