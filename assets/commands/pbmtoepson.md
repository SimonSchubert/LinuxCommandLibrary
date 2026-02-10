# TAGLINE

converts PBM bitmaps to Epson printer control codes for direct printing

# TLDR

**Convert PBM to Epson printer format**

```pbmtoepson [input.pbm] | lpr```

**Specify protocol**

```pbmtoepson -protocol [escp] [input.pbm] > [output.escp]```

# SYNOPSIS

**pbmtoepson** [_options_] [_file_]

# PARAMETERS

**-protocol** _type_
> Output protocol (escp, escp9).

**-dpi** _n_
> Print resolution.

# DESCRIPTION

**pbmtoepson** converts PBM bitmaps to Epson printer control codes for direct printing. Supports ESC/P and ESC/P 9-pin protocols. Part of Netpbm toolkit.

# SEE ALSO

[pbmtoescp2](/man/pbmtoescp2)(1), [pbmtolj](/man/pbmtolj)(1)

