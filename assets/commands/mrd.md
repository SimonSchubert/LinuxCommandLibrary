# TAGLINE

removes directories from MS-DOS filesystems

# TLDR

**Remove directory from mtools disk**

```mrd [a:/dirname]```

**Remove from specific drive**

```mrd [b:/path/to/dir]```

**Verbose output**

```mrd -v [a:/dirname]```

# SYNOPSIS

**mrd** [**-v**] _msdosdirectory_ [_msdosdirectories..._]

# PARAMETERS

_MSDOSDIRECTORY_
> MS-DOS directory to remove.

**-v**
> Verbose mode.

**-V**
> Display the version of mtools.

# DESCRIPTION

**mrd** removes directories from MS-DOS filesystems. It's part of the mtools package. An error occurs if the directory does not exist or is not empty. Multiple directories can be specified on the command line.

The tool deletes directories on FAT drives. Works without mounting the filesystem.

# CAVEATS

Part of mtools. Directory must be empty. MS-DOS/FAT filesystems only.

# HISTORY

mrd is part of **mtools**, providing MS-DOS filesystem access on Unix systems since 1992.

# SEE ALSO

[mmd](/man/mmd)(1), [mcopy](/man/mcopy)(1), [mdel](/man/mdel)(1)

