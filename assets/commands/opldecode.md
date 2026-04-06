# TAGLINE

Decode a Raster Object (OPL) stream into human readable form

# TLDR

**Decode an OPL stream from a file**

```opldecode < [file.opl]```

**Decode with hex file offsets displayed**

```opldecode -h < [file.opl]```

**Decode and save decompressed planes as PBM files**

```opldecode -d [basename] < [file.opl]```

**Decode with debug output**

```opldecode -D [2] < [file.opl]```

# SYNOPSIS

**opldecode** [_options_] < _opl-file_

# PARAMETERS

**-d** _basename_
> Basename of .pbm file for saving decompressed planes.

**-h**
> Print hex file offsets.

**-o**
> Print file offsets.

**-D** _level_
> Set debug level (default: 0).

# DESCRIPTION

**opldecode** decodes a Raster Object (OPL) stream into human readable form. The OPL stream is the printer language used by some Konica Minolta printers, such as the magicolor 2480 MF. The decoded output shows configuration details like resolution, media settings, and raster object compression.

Part of the **foo2zjs** printer driver suite.

# CAVEATS

Input is read from standard input, not as a filename argument. Only useful for debugging printer streams from specific Konica Minolta hardware.

# SEE ALSO

[foo2zjs](/man/foo2zjs)(1), [zjsdecode](/man/zjsdecode)(1), [foo2lava](/man/foo2lava)(1), [gs](/man/gs)(1)

