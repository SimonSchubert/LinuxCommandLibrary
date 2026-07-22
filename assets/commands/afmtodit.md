# TAGLINE

Adobe font metrics to groff font description converter

# TLDR

**Convert** AFM file to groff font

```afmtodit [font.afm] [textmap] [fontname]```

Generate **italic corrections** (in thousandths of an em)

```afmtodit -i [50] [font.afm] [textmap] [fontname]```

Convert with **encoding** file

```afmtodit -e [encoding.enc] [font.afm] [textmap] [fontname]```

# SYNOPSIS

**afmtodit** [_-ckmnsvx_] [_-a n_] [_-d desc_] [_-e enc_] [_-f name_] [_-i n_] [_-o out_] _afm-file_ _map-file_ _font_

# DESCRIPTION

**afmtodit** converts Adobe Font Metrics (AFM) files to font description files suitable for use with the groff typesetting system. It creates the font metrics files that groff's PostScript driver needs to properly position and space characters when typesetting documents.

The tool maps PostScript glyph names to groff character names using a user-supplied map file, and includes kerning pairs and ligature information in the output by default. It also computes a slant parameter (from the AFM ItalicAngle or the **-a** option) that groff uses when positioning accents over italic glyphs.

# PARAMETERS

**-a** _n_
> Slant value written to the font file, used by groff to position accents (default: negative ItalicAngle from the AFM file).

**-c**
> Include identifying comments for the PostScript font in the output.

**-d** _file_
> Use an alternate device description (DESC) file instead of the default.

**-e** _file_
> Reencode the PostScript font using the given encoding file.

**-f** _name_
> Internal name of the groff font.

**-i** _n_
> Generate italic and subscript corrections from _n_ (in thousandths of an em).

**-k**
> Omit kerning data; use only for monospaced (constant-width) fonts.

**-m**
> Prevent negative left italic correction values.

**-n**
> Do not output a ligatures command; use for monospaced fonts.

**-o** _file_
> Output file name

**-s**
> Mark the font as special.

**-v**
> Print version information and exit.

**-x**
> Do not use the built-in Adobe Glyph List.

# CAVEATS

Requires valid AFM files from the font vendor. The text map file must correctly map PostScript glyph names. Output is specific to groff's PostScript driver.

# HISTORY

**afmtodit** is part of GNU groff, developed since **1989**. It enables the use of PostScript fonts in groff documents, extending the typesetting system beyond its original font set.

# INSTALL

```apt: sudo apt install groff```

```dnf: sudo dnf install groff```

```pacman: sudo pacman -S groff```

```apk: sudo apk add groff```

```zypper: sudo zypper install groff```

```brew: brew install groff```

```nix: nix profile install nixpkgs#groff```

<!-- packages: 2026-07-22 -->
# SEE ALSO

[groff](/man/groff)(1), [addftinfo](/man/addftinfo)(1)

# RESOURCES

```[Source code](https://git.savannah.gnu.org/cgit/groff.git)```

```[Homepage](https://www.gnu.org/software/groff/)```

```[Documentation](https://www.gnu.org/software/groff/manual/)```

<!-- verified: 2026-06-11 -->
