# TAGLINE

extracts AFM from PFB

# TLDR

**Convert PFB to AFM**

```pf2afm [font.pfb] > [font.afm]```

**Process multiple fonts**

```for f in *.pfb; do pf2afm "$f" > "${f%.pfb}.afm"; done```

# SYNOPSIS

**pf2afm** _font_

# PARAMETERS

_FONT_
> PostScript Type 1 font file (.pfb or .pfa) from which metrics are extracted.

# DESCRIPTION

**pf2afm** extracts Adobe Font Metric (AFM) data from a PostScript Type 1 font binary (.pfb) or ASCII (.pfa) file. It writes the generated AFM content to standard output, which is typically redirected to a .afm file.

The utility is a small wrapper that invokes Ghostscript with the internal **pf2afm.ps** script. It is helpful when only a font's binary form is available but AFM metrics are required by TeX, Ghostscript, or other typesetting tools.

# CAVEATS

Part of Ghostscript. PostScript Type 1 fonts. Metric extraction only.

# HISTORY

pf2afm is part of **Ghostscript** for extracting font metrics.

# INSTALL

```apt: sudo apt install ghostscript```

```dnf: sudo dnf install ghostscript```

```pacman: sudo pacman -S ghostscript```

```apk: sudo apk add ghostscript```

```zypper: sudo zypper install ghostscript```

```brew: brew install ghostscript```

```nix: nix profile install nixpkgs#ghostscript```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[gs](/man/gs)(1), [printafm](/man/printafm)(1), [afm2tfm](/man/afm2tfm)(1)

