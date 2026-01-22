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

**mkzftree** creates compressed filesystem trees. It's used for creating zisofs images.

The tool compresses files transparently for ISO images. Used with mkisofs.

mkzftree creates compressed trees.

# CAVEATS

Part of zisofs-tools. For ISO creation. Linux specific.

# HISTORY

mkzftree is part of **zisofs-tools** for creating transparent compression on ISO9660 filesystems.

# SEE ALSO

[mkisofs](/man/mkisofs)(1), [genisoimage](/man/genisoimage)(1), [zisofs](/man/zisofs)(8)

