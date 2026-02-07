# TAGLINE

convert fonts to GRUB PF2 format

# TLDR

**Convert font to GRUB format**

```grub-mkfont -o [output.pf2] [input.ttf]```

**Specify font size**

```grub-mkfont -s [16] -o [font16.pf2] [input.ttf]```

**Include specific characters**

```grub-mkfont --range=[0x0-0xff] -o [font.pf2] [input.ttf]```

**Verbose conversion**

```grub-mkfont -v -o [output.pf2] [input.ttf]```

# SYNOPSIS

**grub-mkfont** [_options_] _font-file_

# PARAMETERS

_FONT-FILE_
> Input font (TTF, OTF, PF2).

**-o**, **--output** _FILE_
> Output PF2 file.

**-s**, **--size** _N_
> Font size in pixels.

**-i**, **--index** _N_
> Face index for TTC.

**--range** _RANGE_
> Unicode range to include.

**-v**, **--verbose**
> Verbose output.

**--help**
> Display help information.

# DESCRIPTION

**grub-mkfont** converts fonts to GRUB's PF2 bitmap format, enabling custom fonts in the GRUB boot menu. The tool accepts TrueType, OpenType, and other font formats.

It can generate fonts at specific sizes and with specific character ranges, allowing fine control over which glyphs are included in the output.

# CAVEATS

Part of GRUB package. Larger fonts increase boot time. Limited to bitmap conversion.

# HISTORY

grub-mkfont was developed as part of **GNU GRUB 2** to support graphical boot menus with custom fonts.

# SEE ALSO

[grub](/man/grub)(8), [grub-mkconfig](/man/grub-mkconfig)(8), [fc-list](/man/fc-list)(1)
