# TAGLINE

Convert PNM images to PCL-XL printer format

# TLDR

**Convert PNM to PCL-XL format**

```pnmtopclxl [input.pnm] > [output.pclxl]```

**Specify paper size** (A4)

```pnmtopclxl -format=a4 [input.pnm] > [output.pclxl]```

**High-resolution output, multiple copies**

```pnmtopclxl -dpi=600 -copies=2 [input.pnm] > [output.pclxl]```

**Duplex printing**

```pnmtopclxl -duplex=vertical [input.pnm] > [output.pclxl]```

# SYNOPSIS

**pnmtopclxl** [_options_] [_pnmfile_]

# PARAMETERS

**-format=**_PAPER_
> Paper size: **letter**, **legal**, **a3**-**a6**, **jb4**-**jb6**, **exec**, **ledger**, **b5envelope**, **c5envelope**, **com10envelope**, **monarchenvelope**, **dlenvelope**, **jpostcard**, **jdoublepostcard**.

**-dpi=**_N_
> Print resolution in dots per inch.

**-xoffs=**_N_, **-yoffs=**_N_
> Horizontal/vertical offset (in dots) of the image on the page.

**-center**
> Center the image on the page.

**-duplex=**_vertical_|_horizontal_
> Enable duplex printing with the given binding edge.

**-feeder=**_N_
> Numeric media source (input tray).

**-copies=**_N_
> Number of copies to print.

**-rendergray**
> Force grayscale rendering.

**-colorok**
> Allow color output even on printers that report no color support.

**-jobsetup=**_FILE_
> Prepend the contents of _FILE_ as a PCL-XL job-setup prologue.

**-embedded**
> Emit only the image stream, omitting the PCL-XL job wrapper (for embedding in larger jobs).

# DESCRIPTION

**pnmtopclxl** converts PNM images into **PCL-XL** (also known as PCL 6) printer language, the native format of modern HP LaserJet printers. Part of the **Netpbm** toolkit. Options accept either a single or double hyphen and use **=** or whitespace to separate the value.

# SEE ALSO

[pbmtolj](/man/pbmtolj)(1), [pnmtops](/man/pnmtops)(1)

