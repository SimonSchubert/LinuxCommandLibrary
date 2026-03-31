# TAGLINE

Display information about PNM image files

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
> Machine-readable output format, printing type, width, height, depth, and maxval as space-separated values.

# DESCRIPTION

**pnmfile** displays information about PNM image files including the format type (PBM, PGM, or PPM), dimensions (width and height), maximum sample value, and whether the file uses ASCII (plain) or binary (raw) encoding.

The **-machine** flag outputs in a parseable format suitable for scripting. Part of the Netpbm toolkit; superseded by **pamfile**, which also handles PAM format files.

# CAVEATS

Only reads PNM format files (PBM, PGM, PPM). For PAM files, use **pamfile** instead.

# HISTORY

**pnmfile** was created as part of the **Netpbm** toolkit for image inspection. It has been largely superseded by **pamfile**.

# SEE ALSO

[pamfile](/man/pamfile)(1), [file](/man/file)(1), [identify](/man/identify)(1), [pnmtopng](/man/pnmtopng)(1), [pnmtojpeg](/man/pnmtojpeg)(1)

