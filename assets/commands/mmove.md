# TAGLINE

move or rename an MS-DOS file or subdirectory

# TLDR

**Move/rename a file on an MS-DOS disk**

```mmove a:oldname a:newname```

**Move a file to a directory on the disk**

```mmove a:[file.txt] a:[dir]/```

**Move multiple files matching a wildcard**

```mmove a:*.[txt] a:[backup]/```

**Move a subdirectory**

```mmove a:[olddir] a:[newdir]```

**Move with verbose output**

```mmove -v a:[file] a:[newfile]```

# SYNOPSIS

**mmove** [**-v**] [**-D** _clash_option_] _source_ [_sources_...] _target_

# PARAMETERS

_SOURCE_
> Source file(s) or subdirectories on an MS-DOS filesystem. Drive letter prefix (e.g., a:) specifies the device.

_TARGET_
> Target filename or directory.

**-v**
> Verbose mode. Print the name of each file as it is moved.

**-D** _clash_option_
> Specify what to do on filename conflicts. Lowercase is for the primary (long) name, uppercase for the secondary (short) name: o/O (overwrite), r/R (rename), s/S (skip), a/A (autorename).

# DESCRIPTION

**mmove** moves or renames files and subdirectories on MS-DOS (FAT) filesystems without needing to mount them first. Unlike the MS-DOS MOVE command, mmove can also move subdirectories. It is part of the **mtools** package, which provides a set of utilities to access FAT filesystems from Unix.

Source and target must be on the same MS-DOS filesystem. Cross-device moves are not supported -- use **mcopy** and **mdel** instead.

# CAVEATS

Only works on FAT filesystems. Cannot move files between different drives. Drive mappings are configured in **/etc/mtools.conf** or **~/.mtoolsrc**.

# SEE ALSO

[mcopy](/man/mcopy)(1), [mdel](/man/mdel)(1), [mren](/man/mren)(1), [mmd](/man/mmd)(1)
