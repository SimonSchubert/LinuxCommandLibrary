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

**qpdldecode** decodes Samsung QPDL print format. Printer data extraction.

The tool converts QPDL to images. Part of splix.

qpdldecode extracts print data.

# CAVEATS

Samsung printer specific. Part of splix driver.

# HISTORY

qpdldecode is part of **splix** Samsung printer drivers.

# SEE ALSO

[splix](/man/splix)(1), [cups](/man/cups)(1)

