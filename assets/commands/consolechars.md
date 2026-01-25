# TLDR

**Load a console font**

```consolechars -f [font_name]```

**Load a font from specific file**

```consolechars -f [/usr/share/consolefonts/Lat2-Terminus16.psf.gz]```

**Load a Unicode mapping**

```consolechars -m [8859-1]```

**Load font with specific height**

```consolechars -H [16]```

**Show current font information**

```consolechars -i```

**Reset to default font**

```consolechars -d```

# SYNOPSIS

**consolechars** [_options_]

# PARAMETERS

**-f**, **--font** _font_
> Load console font from file or by name.

**-m**, **--acm** _map_
> Load application charset map (ACM).

**-u**, **--sfm** _map_
> Load screen font map (SFM/Unicode map).

**-H**, **--height** _n_
> Force font height (8, 14, 16, etc.).

**-d**, **--default**
> Load default font.

**-i**, **--info**
> Display current font information.

**-v**, **--verbose**
> Verbose output.

**-h**, **--help**
> Display help.

# DESCRIPTION

**consolechars** loads fonts and character maps for the Linux virtual console (text-mode terminals). It allows changing the appearance of text on the console, supporting various character encodings and Unicode.

Console fonts are bitmap fonts in PSF (PC Screen Font) format stored in **/usr/share/consolefonts/** or **/usr/share/kbd/consolefonts/**. Character maps translate between application character sets and the screen font.

The tool is typically used in system initialization scripts to set console appearance before graphical environments load. It's particularly useful for non-Latin scripts and accessibility (larger fonts).

# CAVEATS

Only affects Linux virtual consoles (tty1-tty6), not terminal emulators in graphical environments. Font changes don't persist across reboots without configuration. Available fonts depend on installed console-data or kbd packages. Maximum font size is limited by video mode.

# HISTORY

**consolechars** is part of the **console-tools** package, which was developed for Debian in the late **1990s** to manage Linux console configuration. It served as an alternative to the **kbd** package's **setfont** utility. While **setfont** from kbd has become more common on many distributions, consolechars remains available on Debian-based systems.

# SEE ALSO

[setfont](/man/setfont)(8), [showconsolefont](/man/showconsolefont)(1), [loadkeys](/man/loadkeys)(1), [vconsole.conf](/man/vconsole.conf)(5)
