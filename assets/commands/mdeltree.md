# TAGLINE

deletes directories from MS-DOS filesystems

# TLDR

**Delete directory tree**

```mdeltree [a:dirname]```

**Delete multiple directories**

```mdeltree [a:dir1] [a:dir2]```

**Verbose output**

```mdeltree -v [a:dirname]```

# SYNOPSIS

**mdeltree** [_options_] _directories_

# PARAMETERS

_DIRECTORIES_
> Directories to delete on MS-DOS disk.

**-v**
> Verbose output.

**--help**
> Display help information.

# DESCRIPTION

**mdeltree** deletes directories from MS-DOS filesystems. It removes directories and all contents.

The tool is part of mtools. It's the MS-DOS equivalent of rm -rf for FAT filesystems.

# CAVEATS

Part of mtools. FAT filesystem only. Recursively deletes all contents.

# HISTORY

mdeltree is part of **mtools**, providing MS-DOS deltree functionality on Unix systems.

# SEE ALSO

[mdel](/man/mdel)(1), [mmd](/man/mmd)(1), [mcopy](/man/mcopy)(1)

