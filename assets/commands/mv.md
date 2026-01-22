# TLDR

**Move file**

```mv [source] [destination]```

**Rename file**

```mv [oldname.txt] [newname.txt]```

**Move multiple files to directory**

```mv [file1] [file2] [directory/]```

**Move with confirmation**

```mv -i [source] [destination]```

**Force overwrite**

```mv -f [source] [destination]```

**Verbose output**

```mv -v [source] [destination]```

**Don't overwrite existing**

```mv -n [source] [destination]```

# SYNOPSIS

**mv** [_options_] _source_ _destination_

# PARAMETERS

_SOURCE_
> File or directory to move.

_DESTINATION_
> Target location.

**-i**
> Prompt before overwrite.

**-f**
> Force, no prompts.

**-n**
> No clobber, don't overwrite.

**-v**
> Verbose mode.

**--help**
> Display help information.

# DESCRIPTION

**mv** moves and renames files and directories. It's a core Unix utility.

The tool relocates files in the filesystem. Also used for renaming within same directory.

mv moves and renames files.

# CAVEATS

Overwrites by default. Atomic within same filesystem. Different behavior across filesystems.

# HISTORY

mv is one of the original **Unix** commands, present since Version 1 AT&T Unix in 1971.

# SEE ALSO

[cp](/man/cp)(1), [rm](/man/rm)(1), [rename](/man/rename)(1)

