# TAGLINE

Import PPD files into CUPS driver format

# TLDR

**Import PPD files**

```ppdi [file.ppd]```

**Import to specific directory**

```ppdi -d [output_dir] [file.ppd]```

**Import multiple files**

```ppdi [file1.ppd] [file2.ppd]```

# SYNOPSIS

**ppdi** [_options_] _files_

# PARAMETERS

_FILES_
> Input PPD files.

**-d** _DIR_
> Output directory.

**-o** _FILE_
> Output file name.

# DESCRIPTION

**ppdi** imports existing PPD (PostScript Printer Description) files into the CUPS driver source format (.drv). This is the reverse operation of **ppdc**, allowing administrators to convert standalone PPD files into the compact driver source format for easier maintenance and distribution.

The imported driver source files can then be edited to add new printer models or modify options, and recompiled with ppdc. This workflow simplifies managing large collections of printer definitions by consolidating them into shared driver source files.

# CAVEATS

CUPS specific. Creates driver source files.

# HISTORY

ppdi is part of **CUPS** for PPD file importing.

# SEE ALSO

[ppdc](/man/ppdc)(1), [ppdhtml](/man/ppdhtml)(1), [cups](/man/cups)(1)

