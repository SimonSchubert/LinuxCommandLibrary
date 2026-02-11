# TAGLINE

Display Adobe Font Metrics information

# TLDR

**Display AFM font metrics**

```printafm [font.afm]```

**Show specific font info**

```printafm [Times-Roman]```

# SYNOPSIS

**printafm** [_font_]

# PARAMETERS

_FONT_
> AFM font file or name.

# DESCRIPTION

**printafm** displays detailed metrics from Adobe Font Metrics (AFM) files, including character widths, bounding boxes, kerning pairs, and other typographic properties. AFM files accompany PostScript Type 1 fonts and describe their dimensions for use in page layout and typesetting.

This Ghostscript utility is useful for inspecting font properties when debugging PostScript or PDF rendering, or when developing applications that need to calculate text dimensions for layout purposes.

# CAVEATS

Requires AFM files. Part of Ghostscript suite.

# HISTORY

printafm is part of **Ghostscript** for font metrics display.

# SEE ALSO

[gs](/man/gs)(1), [fc-list](/man/fc-list)(1)

