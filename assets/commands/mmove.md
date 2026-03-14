# TAGLINE

moves/renames files on MS-DOS filesystems

# TLDR

**Move/rename a file on an MS-DOS disk**

```mmove [a:oldname] [a:newname]```

**Move a file to a directory on the disk**

```mmove [a:file.txt] [a:dir/]```

**Move multiple files matching a wildcard**

```mmove [a:*.txt] [a:backup/]```

**Move with verbose output**

```mmove -v [a:file] [a:newfile]```

# SYNOPSIS

**mmove** [_options_] _source_ _target_

# PARAMETERS

_SOURCE_
> Source file(s) on an MS-DOS filesystem. Drive letter prefix (e.g., a:) specifies the device.

_TARGET_
> Target filename or directory.

**-v**
> Verbose output.

**-D** _conflict_handling_
> Specify what to do on filename conflicts: o (overwrite), r (rename), s (skip), a (autorename).

# DESCRIPTION

**mmove** moves or renames files on MS-DOS (FAT) filesystems without needing to mount them first. It is part of the **mtools** package, which provides a set of utilities to access FAT filesystems from Unix.

Source and target must be on the same MS-DOS filesystem. Cross-device moves are not supported -- use **mcopy** and **mdel** instead.

# CAVEATS

Only works on FAT filesystems. Cannot move files between different drives. Drive mappings are configured in **/etc/mtools.conf** or **~/.mtoolsrc**.

# SEE ALSO

[mcopy](/man/mcopy)(1), [mdel](/man/mdel)(1), [mren](/man/mren)(1)
