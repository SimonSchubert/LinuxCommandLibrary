# TAGLINE

Decode a LAVAFLOW stream into human readable form

# TLDR

**Decode a LAVAFLOW stream file**

```lavadecode < [path/to/file.lava]```

**Decode and print file offsets**

```lavadecode -o < [path/to/file.lava]```

**Decode and print hex file offsets**

```lavadecode -h < [path/to/file.lava]```

**Decode and save decompressed planes to .pbm files**

```lavadecode -d [basename] < [path/to/file.lava]```

**Decode with debug output**

```lavadecode -D [level] < [path/to/file.lava]```

# SYNOPSIS

**lavadecode** [_options_] <_lavaflow-file_

# PARAMETERS

**-d** _basename_
> Basename of .pbm file for saving decompressed planes.

**-h**
> Print hex file offsets.

**-o**
> Print file offsets.

**-D** _level_
> Set debug level (default 0).

# DESCRIPTION

**lavadecode** decodes a LAVAFLOW stream into human readable form. LAVAFLOW is a printer language used by some Konica Minolta printers, such as the magicolor 2530 DL.

It is part of the **foo2zjs** suite of printer drivers and is used to inspect streams created by **foo2lava**.

# CAVEATS

Only handles LAVAFLOW printer streams. Input is read from stdin via redirection.

# SEE ALSO

[foo2lava](/man/foo2lava)(1), [foo2lava-wrapper](/man/foo2lava-wrapper)(1)
