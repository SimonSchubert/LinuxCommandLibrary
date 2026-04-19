# TAGLINE

Extract whole tarballs from .tar.lrz files

# TLDR

**Extract a .tar.lrz archive** into a directory

```lrzuntar [archive.tar.lrz]```

**Extract to a specific output directory**

```lrzuntar -O [output_directory] [archive.tar.lrz]```

# SYNOPSIS

**lrzuntar** [_options_] _directory.tar.lrz_

# DESCRIPTION

**lrzuntar** extracts whole tarballs from `.tar.lrz` files created by lrztar. It is identical to running `lrztar -d` and accepts the same options as lrzip for controlling decompression behavior.

# PARAMETERS

**-O** _directory_
> Specify output directory for extracted files.

**-f**
> Force overwrite of existing files.

**-v**
> Verbose output.

**-q**
> Quiet operation.

**-h**
> Display help.

# SEE ALSO

[lrztar](/man/lrztar)(1), [lrzip](/man/lrzip)(1), [lrunzip](/man/lrunzip)(1), [tar](/man/tar)(1)
