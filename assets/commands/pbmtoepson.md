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

**-protocol** _TYPE_
> Output protocol: **escp** (newer ESC/P) or **escp9** (older 9-pin ESC/P). Default is escp.

**-dpi** _N_
> Horizontal print density in dots per inch. Allowed values: 60, 72, 80, 90, 120, 144, 240.

**-adjacent**
> Force adjacent dot printing.

**-nonadjacent**
> Force non-adjacent dot printing.

# DESCRIPTION

**pbmtoepson** reads a PBM image as input and produces a stream of Epson printer graphics as output. Supports ESC/P and ESC/P 9-pin protocols. For the newer ESC/P2 protocol, use **pbmtoescp2** instead. Part of the Netpbm toolkit.

# SEE ALSO

[pbmtoescp2](/man/pbmtoescp2)(1), [pbmtolj](/man/pbmtolj)(1)

