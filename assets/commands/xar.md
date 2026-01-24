# TLDR

**Create archive**

```xar -cf [archive.xar] [files]```

**Extract archive**

```xar -xf [archive.xar]```

**List contents**

```xar -tf [archive.xar]```

**Verbose extraction**

```xar -xvf [archive.xar]```

**Extract to directory**

```xar -xf [archive.xar] -C [directory]```

# SYNOPSIS

**xar** [_-c_] [_-x_] [_-t_] [_-f archive_] [_options_] [_files_]

# PARAMETERS

**-c**
> Create archive.

**-x**
> Extract archive.

**-t**
> List contents.

**-f** _FILE_
> Archive file.

**-v**
> Verbose.

**-C** _DIR_
> Target directory.

# DESCRIPTION

**xar** creates XAR archives. It's extensible archive format.

Apple-developed. macOS packages.

XML table of contents. Metadata rich.

Compression options. Multiple algorithms.

Signature support. Code signing.

# CAVEATS

macOS oriented. Less common on Linux. XML overhead.

# HISTORY

**xar** (eXtensible ARchive) was developed by **Apple** for macOS installer packages.

# SEE ALSO

[tar](/man/tar)(1), [pkgutil](/man/pkgutil)(1), [ar](/man/ar)(1)
