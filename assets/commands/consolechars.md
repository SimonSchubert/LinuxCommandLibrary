# TAGLINE

console font and character map loader

# TLDR

**Load a console font**

```consolechars -f [font_name]```

**Load a font from specific file**

```consolechars -f [/usr/share/consolefonts/Lat2-Terminus16.psf.gz]```

**Load an application charset map**

```consolechars -m [8859-1]```

**Load a default font with specific height**

```consolechars -d -H [16]```

**Save the current font to a file**

```consolechars -F [path/to/old_font.psf]```

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

**-H**, **--char-height** _n_
> Select font height (1 to 31) when loading a codepage file or a default font.

**-d**, **--default-font**
> Load default font.

**-M**, **--old-acm** _file_
> Save the previous ACM to a file.

**-U**, **--old-sfm** _file_
> Save the current SFM to a file.

**-F**, **--old-font** _file_
> Save the old font to a file.

**-k**, **--sfm-fallback** _file_
> Use a file as SFM fallback table. Can be repeated.

**--force-no-sfm**
> Do not load the SFM built into a font.

**-1**, **--g1**
> Activate the G1 charset instead of G0.

**--tty** _device_
> Use the given console device instead of guessing.

**-n**, **--no-act**
> Do not change the console state or write files. Implies **--verbose**.

**-v**, **--verbose**
> Verbose output.

**-V**, **--version**
> Display version.

**-h**, **--help**
> Display help.

# DESCRIPTION

**consolechars** loads fonts and character maps for the Linux virtual console (text-mode terminals). It allows changing the appearance of text on the console, supporting various character encodings and Unicode.

Console fonts are bitmap fonts, typically in PSF (PC Screen Font) format, stored in **/usr/share/consolefonts/**. Character maps, stored in **/usr/share/consoletrans/**, translate between application character sets and the screen font.

The tool is typically used in system initialization scripts to set console appearance before graphical environments load. It's particularly useful for non-Latin scripts and accessibility (larger fonts).

# CAVEATS

Only affects Linux virtual consoles (tty1-tty6), not terminal emulators in graphical environments. Font changes don't persist across reboots without configuration. Available fonts depend on installed console-data or kbd packages. Maximum font size is limited by video mode. The **console-tools** package has been removed from Debian, so current systems should use **setfont** from **kbd** instead.

# HISTORY

**consolechars** is part of the **Linux Console Tools** (**console-tools**), a late **1990s** alternative to the **kbd** package. It was originally called **setfont** and was renamed in version 1997.10.28 so its options could change while staying compatible with kbd. Debian removed **console-tools** in **2013**.

# SEE ALSO

[setfont](/man/setfont)(8), [showconsolefont](/man/showconsolefont)(1), [loadkeys](/man/loadkeys)(1)

# RESOURCES

```[Homepage](https://lct.sourceforge.net/)```

<!-- verified: 2026-11-09 -->
