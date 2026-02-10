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

**mrd** [_options_] _msdosdirectory_

# PARAMETERS

_MSDOSDIRECTORY_
> MS-DOS directory to remove.

**-v**
> Verbose mode.

**--help**
> Display help information.

# DESCRIPTION

**mrd** removes directories from MS-DOS filesystems. It's part of the mtools package.

The tool deletes directories on FAT drives. Works without mounting the filesystem.

# CAVEATS

Part of mtools. Directory must be empty. MS-DOS/FAT filesystems only.

# HISTORY

mrd is part of **mtools**, providing MS-DOS filesystem access on Unix systems since 1992.

# SEE ALSO

[mdir](/man/mdir)(1), [mmd](/man/mmd)(1), [mcopy](/man/mcopy)(1)

