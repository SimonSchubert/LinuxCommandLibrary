# TAGLINE

decode an OAKT printer stream into human readable form

# TLDR

**Decode an OAKT printer stream from a file**

```oakdecode < [file.prn]```

**Decode and save decompressed planes as PBM files**

```oakdecode -d [basename] < [file.prn]```

**Decode and save raw planes as JBIG files**

```oakdecode -r [basename] < [file.prn]```

**Decode with file offsets shown in output**

```oakdecode -o < [file.prn]```

**Decode without displaying image records**

```oakdecode -i < [file.prn]```

# SYNOPSIS

**oakdecode** [_options_] <_OAKT-file_

# PARAMETERS

**-d** _BASENAME_
> Save decompressed planes as .pbm files with specified basename.

**-r** _BASENAME_
> Save raw planes as .jbg files with specified basename.

**-i**
> Suppress display of image records in output.

**-o**
> Include file offsets in the output.

**-D** _LEVEL_
> Set debug verbosity level (default: 0).

# DESCRIPTION

**oakdecode** decodes an OAKT printer stream into human readable form. It is designed for printers that use the OAKT printer language, such as the HP Color LaserJet 1500. The tool reads the printer stream from standard input and outputs decoded records showing page setup, compression information, and image data in a readable format.

The tool is part of the foo2oak printer driver suite and is primarily used for debugging and analyzing OAKT format print jobs.

# CAVEATS

Reads from standard input only. Specific to the OAKT printer language used by certain HP Color LaserJet models.

# SEE ALSO

[foo2oak](/man/foo2oak)(1), [foo2oak-wrapper](/man/foo2oak-wrapper)(1)
