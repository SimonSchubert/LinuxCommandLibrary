# TAGLINE

portable archive file manager that provides a unified interface for numerous

# TLDR

**Extract** an archive

```patool extract [path/to/archive]```

**Create** an archive

```patool create [path/to/archive] [files...]```

**List** contents of archive

```patool list [path/to/archive]```

**Compare** two archives

```patool diff [archive1] [archive2]```

**Search** for string in archive

```patool search [pattern] [path/to/archive]```

**Test** archive integrity

```patool test [path/to/archive]```

# SYNOPSIS

**patool** [**extract**|**create**|**list**|**diff**|**search**|**test**|**repack**] [_options_] _archive_ [_files_...]

# COMMANDS

**extract**
> Extract files from archive

**create**
> Create new archive from files

**list**
> List archive contents

**diff**
> Compare contents of two archives

**search**
> Search for pattern in archive contents

**test**
> Test archive integrity

**repack**
> Convert archive to different format

# PARAMETERS

**-v, --verbose**
> Verbose output

**-n, --non-interactive**
> Non-interactive mode

**--outdir _dir_**
> Extract to specified directory

# DESCRIPTION

**patool** is a portable archive file manager that provides a unified interface for numerous archive formats. It automatically detects archive types and uses the appropriate backend tool for each format.

Supported formats include zip, tar, gzip, bzip2, xz, 7z, rar, lzma, and many others. The tool abstracts away format-specific commands, allowing consistent operations across all archive types.

# CAVEATS

Requires backend tools for each archive format (unzip, tar, 7z, etc.). Some formats have limited support depending on available tools. Creating certain formats may require specific utilities.

# HISTORY

**patool** was created by **Bastian Kleineidam** to simplify archive handling. Written in Python, it serves as a wrapper around various archiving tools, providing a consistent interface regardless of the underlying format.

# SEE ALSO

[tar](/man/tar)(1), [unzip](/man/unzip)(1), [7z](/man/7z)(1), [unrar](/man/unrar)(1)
