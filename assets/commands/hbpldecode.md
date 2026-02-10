# TAGLINE

decodes HP Business Inkjet Printer Language files

# TLDR

**Decode HBP file**

```hbpldecode [input.hbp]```

**Decode to file**

```hbpldecode [input.hbp] > [output.pbm]```

**Verbose output**

```hbpldecode -v [input.hbp]```

# SYNOPSIS

**hbpldecode** [_options_] _file_

# PARAMETERS

_FILE_
> HBP file to decode.

**-v**
> Verbose mode.

**-h**
> Display help.

# DESCRIPTION

**hbpldecode** decodes HP Business Inkjet Printer Language files. It extracts image data from printer spool files.

The tool is part of foo2hbpl printer driver suite. It's useful for analyzing printer data and extracting embedded images.

# CAVEATS

Specific to HP printers. Part of foo2hbpl package. Limited file format support.

# HISTORY

hbpldecode was developed as part of **foo2hbpl** for Linux printing support of HP Business Inkjet printers.

# SEE ALSO

[foo2hbpl](/man/foo2hbpl)(1), [hbpltops](/man/hbpltops)(1)
