# TAGLINE

converts PBM bitmaps to Encapsulated PostScript Interchange format

# TLDR

**Convert PBM to EPSI format**

```pbmtoepsi [input.pbm] > [output.epsi]```

**Specify bounding box**

```pbmtoepsi -bbonly [input.pbm] > [output.epsi]```

# SYNOPSIS

**pbmtoepsi** [_options_] [_file_]

# PARAMETERS

**-bbonly**
> Output only bounding box comments.

# DESCRIPTION

**pbmtoepsi** converts PBM bitmaps to Encapsulated PostScript Interchange (EPSI) format. EPSI includes a preview bitmap for non-PostScript applications. Part of Netpbm toolkit.

# SEE ALSO

[pnmtops](/man/pnmtops)(1), [pbmtoepson](/man/pbmtoepson)(1)

