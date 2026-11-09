# TAGLINE

Color picker for the terminal

# TLDR

**Launch the interactive color picker**

```termpicker```

Start with an **initial color**

```termpicker -c "[#b7416e]"```

**Print the copied color** to stdout and exit

```termpicker --oneshot```

Use custom **preview text**

```termpicker -t "[Sample text]"```

# SYNOPSIS

**termpicker** [_options_]

# PARAMETERS

**-c, --color** _COLOR_
> Initial color.

**-1, --oneshot**
> Print the copied color to stdout and exit.

**-t, --sample-text** _TEXT_
> Text used to preview colors as foreground and background. An empty string disables the preview. Also read from **TERMPICKER_PREVIEW_STRING**.

**--bg, --background-sample** _COLOR_
> Background color used when previewing the target color as text.

**--fg, --foreground-sample** _COLOR_
> Text color used when previewing the target color as a background.

**-l, --log-file** _FILE_
> Log file. Also read from **TERMPICKER_LOG_FILE**.

**--log-level** _LEVEL_
> Log level: debug, info, warn, or error. Also read from **TERMPICKER_LOG_LEVEL**.

**--help**
> Show help.

**--version**
> Show version.

# DESCRIPTION

**termpicker** is a simple color picker designed for truecolor terminals. It lets you create colors using sliders for RGB, HSL, and CMYK, seamlessly convert between color formats, and copy the result to your clipboard in formats including RGB, HEX, HSL, CMYK, OKLCH, and ANSI truecolor.

Keybindings are vim-like and modal, shown in the UI, and their descriptions can be expanded by pressing the **?** key.

# CAVEATS

Requires a terminal with truecolor support. Clipboard copying depends on system clipboard integration.

# HISTORY

**termpicker** was created by **Benjamin Chausse** (ChausseBenjamin) and is written in **Go**.

# SEE ALSO

[pastel](/man/pastel)(1), [sttr](/man/sttr)(1)

# RESOURCES

```[Source code](https://github.com/ChausseBenjamin/termpicker)```

<!-- verified: 2026-11-09 -->
