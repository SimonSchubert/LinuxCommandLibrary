# TAGLINE

extracts AFM from PFB

# TLDR

**Convert PFB to AFM**

```pf2afm [font.pfb] > [font.afm]```

**Process multiple fonts**

```for f in *.pfb; do pf2afm "$f" > "${f%.pfb}.afm"; done```

# SYNOPSIS

**pf2afm** [_options_] _font_

# PARAMETERS

_FONT_
> PostScript font file (.pfb).

# DESCRIPTION

**pf2afm** extracts AFM from PFB. Generates Adobe Font Metrics.

The tool creates metric files. Part of Ghostscript.

# CAVEATS

Part of Ghostscript. PostScript Type 1 fonts. Metric extraction only.

# HISTORY

pf2afm is part of **Ghostscript** for extracting font metrics.

# SEE ALSO

[gs](/man/gs)(1), [printafm](/man/printafm)(1), [afm2tfm](/man/afm2tfm)(1)

