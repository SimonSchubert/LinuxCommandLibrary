# TAGLINE

Manage archives in various formats with a unified interface

# TLDR

**Extract** any archive

```atool -x [archive.tar.gz]```

**List** archive contents

```atool -l [archive.zip]```

**Create** archive

```atool -c [output.tar.gz] [files]```

**Add** files to archive

```atool -a [archive.tar.gz] [newfiles]```

**Extract** to specific directory

```atool -X [/path/to/dir] [archive.zip]```

# SYNOPSIS

**atool** [_-x_|_-l_|_-c_|_-a_] [_options_] _archive_ [_files_]

# DESCRIPTION

**atool** is a wrapper script that manages archives in various formats. It automatically detects archive types and uses the appropriate tool (tar, unzip, rar, etc.), providing a consistent interface regardless of format.

The tool simplifies working with mixed archive formats without memorizing different tools' syntax.

# PARAMETERS

**-x**, **--extract**
> Extract archive

**-l**, **--list**
> List contents

**-c**, **--create**
> Create archive

**-a**, **--add**
> Add files to archive

**-X** _dir_, **--extract-to=**_dir_
> Extract to specific directory

**-e**, **--each**
> Execute command for each listed file

**-f**, **--force**
> Force overwrite

**-D**, **--subdir**
> Always extract to subdirectory

# SUPPORTED FORMATS

- tar (gzip, bzip2, xz, lzma, zstd)
- zip
- rar
- 7z
- ar
- cpio
- And more through backend tools

# CONFIGURATION

**~/.atoolrc**
> User configuration file for default options and format preferences.

# CAVEATS

Requires appropriate backend tools installed (tar, unzip, unrar, 7z, etc.). Archive format detection based on extension. Some rare formats may not be supported.

# HISTORY

**atool** was created to provide a unified interface for the many archive formats found on Unix systems, reducing cognitive overhead.

# SEE ALSO

[tar](/man/tar)(1), [unzip](/man/unzip)(1), [7z](/man/7z)(1)
