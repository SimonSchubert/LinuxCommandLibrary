# TAGLINE

Extensible archive format tool

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

**xar** (eXtensible ARchive) creates and extracts archives using a format developed by Apple, primarily used for macOS installer packages. The format uses an XML-based table of contents that supports rich metadata and multiple compression algorithms per file.

The archive format also includes signature support for code signing and integrity verification. While primarily associated with macOS, xar is available on Linux for working with macOS package files and other XAR archives.

# CAVEATS

macOS oriented. Less common on Linux. XML overhead.

# HISTORY

**xar** (eXtensible ARchive) was developed by **Apple** for macOS installer packages.

# SEE ALSO

[tar](/man/tar)(1), [pkgutil](/man/pkgutil)(1), [ar](/man/ar)(1)
