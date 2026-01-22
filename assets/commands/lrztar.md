# TLDR

**Archive and compress** directory

```lrztar [path/to/directory]```

Compress with **ZPAQ** (extreme)

```lrztar --zpaq [path/to/directory]```

Specify **output file**

```lrztar -o [path/to/output] [path/to/directory]```

Set **thread count**

```lrztar --threads 8 [path/to/directory]```

**Force** overwrite existing

```lrztar --force [path/to/directory]```

# SYNOPSIS

**lrztar** [_options_] _directory_

# DESCRIPTION

**lrztar** is a wrapper for lrzip that simplifies compression of directories. It first creates a tar archive, then compresses it using lrzip's long-range compression algorithms.

# PARAMETERS

**-z, --zpaq**
> Use ZPAQ compression (extreme, slow)

**-o, --outfile FILE**
> Specify output filename

**-p, --threads N**
> Number of processor threads

**-f, --force**
> Force overwrite existing files

**-v, --verbose**
> Verbose output

# CAVEATS

Output filename defaults to directory name with .tar.lrz extension. ZPAQ provides best compression but is very slow.

# SEE ALSO

[lrzip](/man/lrzip)(1), [lrzuntar](/man/lrzuntar)(1), [tar](/man/tar)(1)
