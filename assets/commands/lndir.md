# TLDR

Create **shadow directory** of symlinks

```lndir [path/to/source]```

# SYNOPSIS

**lndir** [_options_] _fromdir_ [_todir_]

# DESCRIPTION

**lndir** creates a shadow directory tree consisting of symbolic links to another directory tree. This is useful for building software in a separate directory while keeping the source tree clean.

# PARAMETERS

**fromdir**
> Source directory to link from

**todir**
> Destination directory (defaults to current directory)

**-silent**
> Suppress diagnostic messages

**-ignorelinks**
> Ignore symbolic links in source

# CAVEATS

Originally developed for X Window System builds. Does not follow symbolic links in the source directory by default.

# SEE ALSO

[ln](/man/ln)(1), [cp](/man/cp)(1)
