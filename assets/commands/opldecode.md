# TLDR

**Decode OPL file**

```opldecode [file.opl]```

**Decode with output**

```opldecode [file.opl] -o [output]```

**Show file info**

```opldecode -i [file.opl]```

# SYNOPSIS

**opldecode** [_options_] _file_

# PARAMETERS

_FILE_
> OPL format file.

**-o** _OUTPUT_
> Output file.

**-i**
> Show information.

**--help**
> Display help information.

# DESCRIPTION

**opldecode** decodes OPL printer format. Converts to standard formats.

The tool handles OPL proprietary format. Part of foo2zjs printer tools.

opldecode converts OPL files.

# CAVEATS

Printer-specific format. Part of foo2zjs suite.

# HISTORY

opldecode was created to **decode OPL printer data** for foo2zjs drivers.

# SEE ALSO

[foo2zjs](/man/foo2zjs)(1), [gs](/man/gs)(1)

