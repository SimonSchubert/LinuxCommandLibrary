# TLDR

**Extract archive**

```dtrx [archive.tar.gz]```

**Extract multiple archives**

```dtrx [*.tar.gz]```

**Extract to specific** directory

```dtrx -o [output_dir] [archive.tar.gz]```

**Extract flat** (no subdirectory)

```dtrx -f [archive.tar.gz]```

**List archive contents**

```dtrx -l [archive.tar.gz]```

**Extract with metadata** preserved

```dtrx -m [archive.tar.gz]```

# SYNOPSIS

**dtrx** [_options_] _archive_...

# PARAMETERS

_ARCHIVE_
> Archive file(s) to extract.

**-o**, **--output** _DIR_
> Output directory.

**-f**, **--flat**
> Extract flat without directory.

**-l**, **--list**
> List contents only.

**-m**, **--metadata**
> Preserve ownership/permissions.

**-r**, **--recursive**
> Extract nested archives.

**-n**, **--noninteractive**
> Never prompt.

**--help**
> Display help information.

# DESCRIPTION

**dtrx** (Do The Right Extraction) intelligently extracts archives regardless of format. It automatically handles tar, zip, rar, 7z, and many other formats, creating sensibly-named directories for contents.

The tool solves common extraction problems: archives that extract many files into the current directory, nested archives, and varying archive formats. It always creates a single directory for the archive contents.

dtrx supports recursive extraction, automatically handling archives within archives.

# CAVEATS

Requires appropriate extraction tools installed for each format. Some formats may need additional packages. Encrypted archives need passwords.

# HISTORY

dtrx was created by **Brett Smith** to provide hassle-free archive extraction. It addresses the frustration of archives that behave differently, always doing "the right thing" regardless of format.

# SEE ALSO

[tar](/man/tar)(1), [unzip](/man/unzip)(1), [7z](/man/7z)(1), [atool](/man/atool)(1)
