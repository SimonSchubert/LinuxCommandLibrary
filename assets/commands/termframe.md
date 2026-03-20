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

**-o**, **--output** _FILE_
> Output SVG file path.

**-W**, **--width** _VALUE_
> Terminal width (number, auto, or range like 80..120).

**-H**, **--height** _VALUE_
> Terminal height (number, auto, or range like 24..50).

**--theme** _NAME_
> Color theme from iTerm2-Color-Schemes.

**--title** _TEXT_
> Set window title.

**--font-size** _SIZE_
> Adjust font size.

**--padding** _VALUE_
> Configure window padding.

**--window-style** _STYLE_
> Window style (e.g., macos, compact).

**--shell** _SHELL_
> Specify shell to use.

**--config** _FILE_
> Override configuration file path (use - to disable defaults).

# DESCRIPTION

**termframe** is a non-interactive terminal emulator that executes a command, renders its output in a virtual terminal session, and exports the result as an SVG file. It supports full color ranges (16, 256, truecolor), text styles, font embedding, and dark/light mode.

# HISTORY

**termframe** was created by **Pavel Ivanov** (pamburus) and is written in **Rust**.

# SEE ALSO

[silicon](/man/silicon)(1), [t-rec](/man/t-rec)(1)
