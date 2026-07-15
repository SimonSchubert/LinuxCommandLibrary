# TAGLINE

scan font files and directories

# TLDR

**Scan directory for** fonts

```fc-scan [/usr/share/fonts]```

**Scan single font**

```fc-scan [font.ttf]```

**Output specific format**

```fc-scan --format '%{family}: %{file}\n' [directory]```

# SYNOPSIS

**fc-scan** [_options_] _files_...

# PARAMETERS

_FILES_
> Font files or directories to scan. Directories are scanned recursively.

**-f**, **--format** _FORMAT_
> Output format string.

**-V**, **--version**
> Show the program version and exit.

**-h**, **--help**
> Display help information.

# DESCRIPTION

**fc-scan** scans font files and directories, displaying font information in fontconfig format. Unlike fc-query which examines single files, fc-scan can process directories and multiple files.

The tool outputs font patterns that fontconfig uses for font matching. Custom format strings extract specific properties. When given a directory, it scans the entire tree recursively.

fc-scan is useful for inventorying fonts, finding duplicates, or generating font lists for documentation.

# CAVEATS

Does not update system font cache. Large directories may take time. Format string syntax can be complex.

# HISTORY

fc-scan is part of **fontconfig**, providing batch font scanning capabilities. It complements fc-query for examining fonts without affecting the system font configuration.

# SEE ALSO

[fc-query](/man/fc-query)(1), [fc-list](/man/fc-list)(1), [fc-cache](/man/fc-cache)(1)

# RESOURCES

```[Source code](https://gitlab.freedesktop.org/fontconfig/fontconfig)```

```[Homepage](https://www.freedesktop.org/wiki/Software/fontconfig/)```

<!-- verified: 2026-07-15 -->
