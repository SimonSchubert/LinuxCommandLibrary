# TAGLINE

Decode Samsung QPDL printer data format

# TLDR

**Decode QPDL printer format**

```qpdldecode [input.qpdl] > [output.pbm]```

**Show file info**

```qpdldecode -i [input.qpdl]```

# SYNOPSIS

**qpdldecode** [_options_] [_file_]

# PARAMETERS

_FILE_
> Input QPDL file.

**-i**
> Show information only.

# DESCRIPTION

**qpdldecode** decodes data in Samsung's proprietary QPDL (Quick Page Description Language) print format, converting it to standard image formats like PBM for analysis or reprocessing. It is distributed as part of the SpliX driver package for Samsung laser printers.

The tool can also display metadata about QPDL files without converting them, using the **-i** flag to show page count, resolution, and other format details.

# CAVEATS

Samsung printer specific. Part of splix driver.

# HISTORY

qpdldecode is part of **splix** Samsung printer drivers.

# SEE ALSO

[splix](/man/splix)(1), [cups](/man/cups)(1)

