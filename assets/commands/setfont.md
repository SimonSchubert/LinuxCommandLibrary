# TAGLINE

Load console screen fonts for Linux TTYs

# TLDR

**Change** the terminal font

```setfont [font].gz```

Change font by specifying a **full path**

```setfont /usr/share/kbd/consolefonts/[font.psf.gz]```

**Double** the font size

```setfont -d```

**Reset** to the default font

```setfont```

**Save** the current font before changing

```setfont -o [saved_font] [new_font]```

Set font for a **specific console**

```setfont -C /dev/tty2 [font]```

# SYNOPSIS

**setfont** [_OPTIONS_] [_font.new_...] [**-m** _cmap_] [**-u** _umap_] [**-C** _console_]

# PARAMETERS

**-d, --double**
> Double the font size for high-density displays

**-h** _N_, **--font-height** _N_
> Override font height (useful for partial fonts)

**-o** _file_
> Save previous font to the specified file

**-O** _file_
> Save previous font and Unicode map together

**-om** _file_
> Store current console mapping table

**-ou** _file_
> Save current Unicode mapping to file

**-m** _file_, **--consolemap** _file_
> Load console map or Unicode console map

**-u** _file_, **--unicodemap** _file_
> Load Unicode mapping table for the font

**-C** _device_, **--console** _device_
> Set font on the specified console device

**-f, --force**
> Force loading Unicode map even if empty

**-R, --reset**
> Restore console to bootup defaults

**-v, --verbose**
> Enable verbose output

**-V, --version**
> Print version information

# DESCRIPTION

**setfont** loads console screen fonts into the EGA/VGA character generator for Linux virtual terminals (TTYs). It can load PSF (PC Screen Font) files and optionally associate Unicode mapping tables for proper character display.

Fonts are typically stored in **/usr/share/kbd/consolefonts/** and come in various sizes (8x8, 8x14, 8x16). The command operates on the current console by default but can target specific TTYs with **-C**. When called without arguments, it loads a default 8x8 font.

# CAVEATS

Only works on Linux virtual consoles (TTYs), not in terminal emulators like xterm or GNOME Terminal. Requires appropriate permissions (typically root) to modify console settings. Font changes do not persist across reboots; configure in **/etc/vconsole.conf** for systemd systems or appropriate init scripts.

# HISTORY

**setfont** is part of the **kbd** (keyboard and console utilities) package, which has been a standard Linux component since the early **1990s**. The PSF font format was developed specifically for Linux console fonts. The command evolved from earlier utilities like **loadfont** and integrates Unicode support added in Linux **2.0** era.

# SEE ALSO

[showconsolefont](/man/showconsolefont)(8), [loadkeys](/man/loadkeys)(1), [consolechars](/man/consolechars)(8), [vconsole.conf](/man/vconsole.conf)(5)
