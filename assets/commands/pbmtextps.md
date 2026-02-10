# TAGLINE

renders text as PBM bitmap using PostScript fonts via Ghostscript

# TLDR

**Render text using PostScript fonts**

```pbmtextps -font [Times-Roman] "[Hello World]" > [output.pbm]```

**Render with specific size**

```pbmtextps -fontsize [48] "[text]" > [output.pbm]```

# SYNOPSIS

**pbmtextps** [_options_] _text_

# PARAMETERS

**-font** _name_
> PostScript font name.

**-fontsize** _n_
> Font size in points.

**-resolution** _n_
> Output resolution in DPI.

# DESCRIPTION

**pbmtextps** renders text as PBM bitmap using PostScript fonts via Ghostscript. Provides high-quality text rendering with any PostScript font. Part of Netpbm toolkit.

# SEE ALSO

[pbmtext](/man/pbmtext)(1), [ppmlabel](/man/ppmlabel)(1)

