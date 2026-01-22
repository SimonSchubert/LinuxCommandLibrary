# TLDR

**Convert** AFM file to groff font

```afmtodit [font.afm] [textmap] [fontname]```

Include **kerning** information

```afmtodit -k [font.afm] [textmap] [fontname]```

Convert with **encoding** file

```afmtodit -e [encoding.enc] [font.afm] [textmap] [fontname]```

# SYNOPSIS

**afmtodit** [_-ckmnsvx_] [_-a n_] [_-d desc_] [_-e enc_] [_-f name_] [_-i n_] [_-o out_] _afm-file_ _map-file_ _font_

# DESCRIPTION

**afmtodit** converts Adobe Font Metrics (AFM) files to font description files suitable for use with groff. It creates the font metrics files that groff's PostScript driver uses to typeset documents.

The tool maps PostScript glyph names to groff character names using a map file, and can include kerning pairs and ligature information in the output.

# PARAMETERS

**-a** _n_
> Slant angle for synthetic oblique fonts

**-c**
> Include unnamed characters

**-d** _file_
> DESC file for device resolution

**-e** _file_
> Encoding file specifying character order

**-f** _name_
> Internal font name

**-i** _n_
> Italic correction values

**-k**
> Include kerning information

**-m**
> Prevent font name guessing

**-n**
> No ligatures

**-o** _file_
> Output file name

**-s**
> Treat as special font

**-v**
> Print version

# CAVEATS

Requires valid AFM files from the font vendor. The text map file must correctly map PostScript glyph names. Output is specific to groff's PostScript driver.

# HISTORY

**afmtodit** is part of GNU groff, developed since **1989**. It enables the use of PostScript fonts in groff documents, extending the typesetting system beyond its original font set.

# SEE ALSO

[groff](/man/groff)(1), [addftinfo](/man/addftinfo)(1), [pfbtops](/man/pfbtops)(1)
