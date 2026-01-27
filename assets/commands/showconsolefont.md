# TLDR

**Display the current console font** in a table

```showconsolefont```

**Show only font information** without the glyph table

```showconsolefont --info```

**Display font from a specific console device**

```showconsolefont --console=[/dev/tty1]```

**Display with verbose output**

```showconsolefont --verbose```

# SYNOPSIS

**showconsolefont** [**-C** _console_] [**-v**] [**-V**] [**-h**] [**-i**]

# PARAMETERS

**-i**, **--info**
> Don't print the font table, just show ROWSxCOLSxCOUNT and exit.

**-C**, **--console=**_DEV_
> Specify the console device to be used. The argument is a pathname (e.g., /dev/tty1).

**-v**, **--verbose**
> Be more verbose. Provides additional information about the font, such as whether it is a Unicode font.

**-V**, **--version**
> Print version number.

**-h**, **--help**
> Print usage message.

# DESCRIPTION

**showconsolefont** outputs the current EGA/VGA console screen font to standard output. It displays a table of glyphs (characters) in the currently loaded font, allowing you to see all available characters.

The command is useful for troubleshooting font rendering issues on the Linux console, verifying that a specific font is loaded after using **setfont**, or determining font characteristics for scripting purposes. With the **--info** option, it outputs just the font dimensions and character count without displaying the full glyph table.

# CAVEATS

This command only works on the Linux console (virtual terminals), not in terminal emulators running under X11 or Wayland. Requires access to the console device, which may need appropriate permissions. On systems using framebuffer consoles, the output represents the currently loaded PSF (PC Screen Font) file.

# HISTORY

**showconsolefont** is part of the **kbd** project, a collection of tools for managing Linux keyboard and console fonts. The kbd project provides utilities that have been essential for Linux console configuration since the early days of Linux. These tools evolved from earlier console utilities and continue to be maintained for use on virtual terminals.

# SEE ALSO

[setfont](/man/setfont)(8), [consolechars](/man/consolechars)(8), [loadkeys](/man/loadkeys)(1), [dumpkeys](/man/dumpkeys)(1)
