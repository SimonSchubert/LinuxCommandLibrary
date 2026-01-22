# TLDR

**Show image information**

```pnmfile [image.pnm]```

**Show info for multiple files**

```pnmfile [file1.pnm] [file2.pnm]```

**Machine-readable output**

```pnmfile -machine [image.pnm]```

# SYNOPSIS

**pnmfile** [_options_] [_files_]

# PARAMETERS

_FILES_
> Input PNM files.

**-machine**
> Machine-readable output format.

# DESCRIPTION

**pnmfile** displays information about PNM images. Shows dimensions and type.

The tool reports image format. Identifies PBM, PGM, PPM types.

pnmfile describes images.

# CAVEATS

Only reads PNM format files. Part of Netpbm suite.

# HISTORY

pnmfile was created as part of **Netpbm** for image inspection.

# SEE ALSO

[pamfile](/man/pamfile)(1), [file](/man/file)(1), [identify](/man/identify)(1)

