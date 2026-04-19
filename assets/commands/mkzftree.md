# TAGLINE

creates compressed filesystem trees

# TLDR

**Compress directory tree**

```mkzftree [input/] [output/]```

**Set compression level** (1-9, default 9)

```mkzftree -z [6] [input/] [output/]```

**Force** compression of every file (even if larger after compression)

```mkzftree -f [input/] [output/]```

**Verbose output**

```mkzftree -v [input/] [output/]```

**Parallelize** compression with N threads

```mkzftree -p [4] [input/] [output/]```

**Uncompress** a zisofs tree back to plain files

```mkzftree -u [input/] [output/]```

# SYNOPSIS

**mkzftree** [_options_] _input_ _output_

# PARAMETERS

_INPUT_
> Source directory (or file with **-F**).

_OUTPUT_
> Destination directory/file.

**-z**, **--level** _LEVEL_
> Compression level 1-9 (default: 9). Lower is faster, higher compresses more.

**-f**, **--force**
> Always compress, even if the result is larger than the original.

**-u**, **--uncompress**
> Uncompress a previously compressed tree.

**-p**, **--parallelism** _N_
> Number of parallel compression threads.

**-F**, **--file**
> Treat INPUT as a single file rather than a directory tree.

**-x**, **--one-filesystem**
> Do not cross filesystem boundaries; create directory stubs at mount points.

**-X**, **--strict-one-filesystem**
> Do not cross filesystem boundaries and do not create stubs.

**-l**, **--local**
> Do not recurse into subdirectories (still creates the directories).

**-s**, **--sloppy**
> Relax preservation of file modes, times, and ownership.

**-v**, **--verbose**
> Increase verbosity.

**-q**, **--quiet**
> Suppress all messages including errors.

**-h**, **--help**
> Display help information.

**-w**, **--version**
> Display version information.

# DESCRIPTION

**mkzftree** creates compressed directory trees suitable for use with transparent decompression on ISO 9660 (zisofs) filesystems. Files in the output tree are individually compressed using zlib, and the directory structure is preserved.

The compressed trees are designed to be used with **mkisofs** (or **genisoimage**) with the `-z` option to create ISO images where files are transparently decompressed at read time on Linux systems with zisofs support.

# CAVEATS

Part of **zisofs-tools**. Transparent decompression requires Linux kernel zisofs support. Only useful for ISO 9660 filesystem creation; not a general-purpose compression tool.

# HISTORY

mkzftree is part of **zisofs-tools** for creating transparent compression on ISO9660 filesystems.

# SEE ALSO

[mkisofs](/man/mkisofs)(1), [genisoimage](/man/genisoimage)(1)

