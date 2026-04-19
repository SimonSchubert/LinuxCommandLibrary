# TAGLINE

converts PBM bitmaps to Encapsulated PostScript Interchange format

# TLDR

**Convert PBM to EPSI format**

```pbmtoepsi [input.pbm] > [output.epsi]```

**Output only bounding box comments** (no image data)

```pbmtoepsi -bbonly [input.pbm] > [output.epsi]```

**Specify output resolution** in dots per inch

```pbmtoepsi -dpi [300] [input.pbm] > [output.epsi]```

# SYNOPSIS

**pbmtoepsi** [_-dpi N[xN]_] [_-bbonly_] [_pbmfile_]

# PARAMETERS

**-bbonly**
> Create only a bounding box comment; do not include the image preview.

**-dpi** _N[xN]_
> Output device resolution in dots per inch (default 72). Use "NxM" to specify horizontal and vertical resolutions separately.

**-quiet**
> Suppress informational messages (common libnetpbm option).

# DESCRIPTION

**pbmtoepsi** converts PBM bitmaps to Encapsulated PostScript Interchange (EPSI) format. EPSI includes a low-resolution preview bitmap that non-PostScript applications can display while keeping a full-resolution PostScript representation for printing. Part of the Netpbm toolkit.

# SEE ALSO

[pnmtops](/man/pnmtops)(1), [pbmtoepson](/man/pbmtoepson)(1)

