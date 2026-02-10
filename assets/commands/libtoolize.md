# TAGLINE

prepares a package for using libtool by copying necessary auxiliary files into

# TLDR

Initialize project for **libtool** with copy and force

```libtoolize --copy --force```

# SYNOPSIS

**libtoolize** [_options_]

# DESCRIPTION

**libtoolize** prepares a package for using libtool by copying necessary auxiliary files (ltmain.sh, config.guess, etc.) into the project directory. It integrates libtool seamlessly into autotools-based build systems.

# PARAMETERS

**-c, --copy**
> Copy files instead of creating symbolic links

**-f, --force**
> Overwrite existing files

**-i, --install**
> Install libtool support files

**-n, --dry-run**
> Show what would be done without doing it

**--automake**
> Work silently with automake

**--ltdl**
> Install libltdl support files

# CAVEATS

Should be run before autoreconf or aclocal when setting up autotools projects. Creates or modifies m4 macro files.

# SEE ALSO

[libtool](/man/libtool)(1), [autoreconf](/man/autoreconf)(1), [automake](/man/automake)(1)
