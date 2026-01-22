# TLDR

**Rename file on MS-DOS disk**

```mren [a:/oldname.txt] [a:/newname.txt]```

**Rename directory**

```mren [a:/olddir] [a:/newdir]```

**Verbose output**

```mren -v [a:/old] [a:/new]```

# SYNOPSIS

**mren** [_options_] _source_ _target_

# PARAMETERS

_SOURCE_
> Original MS-DOS file/directory name.

_TARGET_
> New MS-DOS file/directory name.

**-v**
> Verbose mode.

**--help**
> Display help information.

# DESCRIPTION

**mren** renames files and directories on MS-DOS filesystems. It's part of the mtools package.

The tool works directly on FAT disks. Does not require mounting the filesystem.

mren is mtools file renamer.

# CAVEATS

Part of mtools. MS-DOS naming conventions apply. 8.3 filename limits on older systems.

# HISTORY

mren is part of **mtools**, the MS-DOS filesystem utilities collection for Unix systems.

# SEE ALSO

[mcopy](/man/mcopy)(1), [mmove](/man/mmove)(1), [mdir](/man/mdir)(1)

