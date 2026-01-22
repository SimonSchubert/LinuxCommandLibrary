# TLDR

**Regenerate** all autotools files

```autoreconf```

Regenerate with **install** of missing files

```autoreconf --install```

**Force** regeneration

```autoreconf --force --install```

Regenerate **verbosely**

```autoreconf --install --verbose```

# SYNOPSIS

**autoreconf** [_-f_] [_-i_] [_-v_] [_options_]

# DESCRIPTION

**autoreconf** runs autoconf, autoheader, automake, and related tools in the correct order. It's the recommended way to regenerate configure scripts and related files in autotools projects.

The tool automatically determines which programs to run based on project configuration.

# PARAMETERS

**-i**, **--install**
> Add missing auxiliary files

**-f**, **--force**
> Force regeneration even if files are current

**-v**, **--verbose**
> Verbose output

**-s**, **--symlink**
> Use symlinks instead of copies for auxiliary files

**-W** _category_
> Warning level

**--no-recursive**
> Don't recurse into subdirectories

# WORKFLOW

Typical usage when building from git:
```bash
autoreconf --install
./configure
make
```

# CAVEATS

Requires autoconf, automake, and related tools installed. Can be slow on large projects. Modern alternatives (CMake, Meson) are often easier.

# HISTORY

**autoreconf** was added to autoconf to simplify the complex process of regenerating autotools files in the correct order.

# SEE ALSO

[autoconf](/man/autoconf)(1), [automake](/man/automake)(1), [libtoolize](/man/libtoolize)(1)
