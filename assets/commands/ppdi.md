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

**ppdi** imports PPD files into CUPS driver format. Part of CUPS.

The tool converts PPD to drv format. Reverse of ppdc.

ppdi imports PPD files.

# CAVEATS

CUPS specific. Creates driver source files.

# HISTORY

ppdi is part of **CUPS** for PPD file importing.

# SEE ALSO

[ppdc](/man/ppdc)(1), [ppdhtml](/man/ppdhtml)(1), [cups](/man/cups)(1)

