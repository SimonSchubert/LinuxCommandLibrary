# TLDR

Create **self-extracting** binary

```cat $(which unzipsfx) [path/to/archive.zip] > [filename] && chmod 755 [filename]```

**Extract** self-extracting binary

```./[path/to/binary]```

**Test** for errors

```./[path/to/binary] -t```

**Print** file content without extracting

```./[path/to/binary] -c [path/to/file]```

Show **comments**

```./[path/to/binary] -z```

# SYNOPSIS

**unzipsfx** is typically concatenated with a ZIP archive

# PARAMETERS

**-t**
> Test archive for errors

**-c** _FILE_
> Print file content without extraction

**-z**
> Print archive comments

# DESCRIPTION

**unzipsfx** creates self-extracting compressed binary files by prepending self-extracting stubs to ZIP archives. The resulting executable can extract itself without requiring unzip to be installed.

The stub is typically concatenated with a ZIP archive using cat, then made executable.

# CAVEATS

Self-extracting binaries are platform-specific. The stub adds size overhead to the archive. Some systems may block execution of self-extracting archives.

# SEE ALSO

[zip](/man/zip)(1), [unzip](/man/unzip)(1)
