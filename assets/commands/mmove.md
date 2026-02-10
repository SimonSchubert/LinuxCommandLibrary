# TAGLINE

moves/renames files on MS-DOS filesystems

# TLDR

**Move file on MS-DOS disk**

```mmove [a:oldname] [a:newname]```

**Move to directory**

```mmove [a:file.txt] [a:dir/]```

**Move multiple files**

```mmove [a:*.txt] [a:backup/]```

**Verbose output**

```mmove -v [a:file] [a:newfile]```

# SYNOPSIS

**mmove** [_options_] _source_ _target_

# PARAMETERS

_SOURCE_
> Source file on MS-DOS disk.

_TARGET_
> Target location.

**-v**
> Verbose output.

**--help**
> Display help information.

# DESCRIPTION

**mmove** moves/renames files on MS-DOS filesystems. It's part of mtools.

The tool works on FAT filesystems without mounting. Like mv for DOS disks.

# CAVEATS

Part of mtools. FAT filesystem only. Same disk only.

# HISTORY

mmove is part of **mtools**, providing file moving functionality for MS-DOS filesystems on Unix.

# SEE ALSO

[mcopy](/man/mcopy)(1), [mdel](/man/mdel)(1), [mren](/man/mren)(1)

