# TAGLINE

creates compressed filesystem trees

# TLDR

**Compress directory tree**

```mkzftree [input/] [output/]```

**Set compression level**

```mkzftree -z [9] [input/] [output/]```

**Force overwrite**

```mkzftree -f [input/] [output/]```

**Verbose output**

```mkzftree -v [input/] [output/]```

**Parallelize**

```mkzftree -p [4] [input/] [output/]```

# SYNOPSIS

**mkzftree** [_options_] _input_ _output_

# PARAMETERS

_INPUT_
> Source directory.

_OUTPUT_
> Destination directory.

**-z** _LEVEL_
> Compression level (1-9).

**-f**
> Force overwrite.

**-v**
> Verbose output.

**-p** _JOBS_
> Parallel jobs.

**--help**
> Display help information.

# DESCRIPTION

**mkzftree** creates compressed directory trees suitable for use with transparent decompression on ISO 9660 (zisofs) filesystems. Files in the output tree are individually compressed using zlib, and the directory structure is preserved.

The compressed trees are designed to be used with **mkisofs** (or **genisoimage**) with the `-z` option to create ISO images where files are transparently decompressed at read time on Linux systems with zisofs support.

# CAVEATS

Part of **zisofs-tools**. Transparent decompression requires Linux kernel zisofs support. Only useful for ISO 9660 filesystem creation; not a general-purpose compression tool.

# HISTORY

mkzftree is part of **zisofs-tools** for creating transparent compression on ISO9660 filesystems.

# SEE ALSO

[mkisofs](/man/mkisofs)(1), [genisoimage](/man/genisoimage)(1)

