# TLDR

**Start Unicode terminal**

```uxterm```

**Start with specific geometry**

```uxterm -geometry [80x24]```

**Start with specific font**

```uxterm -fn [fixed]```

**Start with custom title**

```uxterm -T "[My Terminal]"```

**Start and run command**

```uxterm -e [bash]```

# SYNOPSIS

**uxterm** [_xterm-options_]

# PARAMETERS

All xterm options are passed through. Common options include:

**-geometry** _WxH+X+Y_
> Set window size and position.

**-fn** _font_
> Set terminal font.

**-fb** _font_
> Set bold font.

**-fg** _color_
> Set foreground color.

**-bg** _color_
> Set background color.

**-T** _title_
> Set window title.

**-e** _command_
> Run command in terminal.

**-hold**
> Keep window open after command exits.

# DESCRIPTION

**uxterm** is a wrapper script that launches xterm with Unicode (UTF-8) support enabled. It sets the UXTerm resource class and enables UTF-8 mode, making it suitable for displaying international characters and symbols.

The wrapper uses the system locale to determine character encoding. If no locale is set, it defaults to en_US. The locale utility verifies system support for the selected locale before starting.

All command-line arguments pass directly to xterm. The -class and -u8 options should not be specified as they are set by the wrapper. Font configuration uses ISO 10646-1 encoded fonts.

# CAVEATS

Requires locale with UTF-8 support. Needs appropriate Unicode fonts installed (xfonts-base on Debian). Results may be unexpected if locale doesn't support UTF-8. X11 only.

# HISTORY

**uxterm** was created as part of xterm to simplify running the terminal with proper Unicode support. It emerged as Unicode became standard and users needed reliable UTF-8 display without manually configuring xterm's complex options.

# SEE ALSO

[xterm](/man/xterm)(1), [locale](/man/locale)(1), [koi8rxterm](/man/koi8rxterm)(1)
