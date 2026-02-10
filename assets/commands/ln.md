# TAGLINE

creates links between files

# TLDR

**Create symbolic link**

```ln -s [target] [linkname]```

**Create hard link**

```ln [target] [linkname]```

**Create symbolic link (force overwrite)**

```ln -sf [target] [linkname]```

**Create link in directory**

```ln -s [target] [directory/]```

**Create relative symbolic link**

```ln -sr [target] [linkname]```

**Verbose output**

```ln -sv [target] [linkname]```

# SYNOPSIS

**ln** [_options_] _target_ _linkname_

# PARAMETERS

_TARGET_
> File or directory to link to.

_LINKNAME_
> Name for the link.

**-s**
> Create symbolic (soft) link.

**-f**
> Force, overwrite existing.

**-r**
> Create relative symbolic link.

**-v**
> Verbose output.

**-n**
> Don't dereference symlinks.

**--help**
> Display help information.

# DESCRIPTION

**ln** creates links between files. Hard links share the same inode; symbolic links are references.

Symbolic links can span filesystems and link to directories. Hard links cannot.

# CAVEATS

Hard links cannot cross filesystems. Symbolic links can break if target moves. Directory hard links not allowed.

# HISTORY

ln is a traditional **Unix** command dating back to the original Unix system for creating links between files.

# SEE ALSO

[link](/man/link)(1), [unlink](/man/unlink)(1), [readlink](/man/readlink)(1), [symlink](/man/symlink)(7)

