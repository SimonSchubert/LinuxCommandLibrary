# TLDR

**Display CHD file information**

```chdman info -i [path/to/image.chd]```

**Verify CHD file integrity**

```chdman verify -i [path/to/image.chd]```

**Create CHD from CD image (bin/cue)**

```chdman createcd -i [path/to/image.cue] -o [path/to/output.chd]```

**Create CHD from raw hard disk image**

```chdman createhd -i [path/to/image.img] -o [path/to/output.chd]```

**Extract CD image from CHD**

```chdman extractcd -i [path/to/image.chd] -o [path/to/output.cue]```

**Extract raw hard disk image from CHD**

```chdman extracthd -i [path/to/image.chd] -o [path/to/output.img]```

**Copy CHD with different compression**

```chdman copy -i [path/to/input.chd] -o [path/to/output.chd] -c [lzma,zlib,huff,flac]```

# SYNOPSIS

**chdman** _command_ [**-i** _input_] [**-o** _output_] [**-c** _compression_] [_options..._]

# DESCRIPTION

**chdman** is the MAME Compressed Hunks of Data (CHD) manager. CHD is a lossless compression format designed for disk images used by MAME and other emulators, supporting hard disks, CD-ROMs, LaserDiscs, and GD-ROMs.

The format provides efficient compression while maintaining perfect data integrity, making it ideal for archiving game media. CHD supports delta compression against parent images to reduce storage for similar versions.

# PARAMETERS

**info**
> Display CHD header information

**verify**
> Validate MD5/SHA1 checksums

**createcd**
> Create CHD from CD image (cue/bin, toc/bin, gdi)

**createhd**
> Create CHD from raw hard disk image

**createraw**
> Create CHD from raw data file

**createld**
> Create CHD from LaserDisc image

**extractcd**
> Extract CD image from CHD

**extracthd**
> Extract hard disk image from CHD

**copy**
> Copy CHD with optional recompression

**-i** _file_
> Input file

**-o** _file_
> Output file

**-c** _algorithms_
> Compression: none, or up to four comma-separated algorithms (default: lzma,zlib,huff,flac)

**--outputparent** _file_
> Create delta CHD storing only differences from parent

# CAVEATS

Hunk size must be between 16 bytes and 1 MiB. CHD format is supported by emulators for 3DO, Dreamcast, PlayStation, Saturn, Mega CD, Neo-Geo CD, PC Engine CD, and other platforms.

# HISTORY

CHD was developed as part of the **MAME** (Multiple Arcade Machine Emulator) project to provide efficient, lossless compression for disk images while preserving exact data for accurate emulation.

# SEE ALSO

[mame](/man/mame)(6)
