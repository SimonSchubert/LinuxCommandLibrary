# TAGLINE

in Fish shell opens files with default applications

# TLDR

**Open file**

```open [file]```

**Open URL**

```open [https://example.com]```

**Open directory**

```open [directory]```

**Open current directory**

```open .```

# SYNOPSIS

**open** [_file_...]

# PARAMETERS

_FILE_
> File, directory, or URL to open.

# DESCRIPTION

**open** in Fish shell opens files with default applications. Cross-platform wrapper.

The function handles different operating systems. Part of Fish shell.

# CAVEATS

Fish shell function. Uses xdg-open on Linux, open on macOS.

# HISTORY

open.fish provides a **cross-platform open** function for Fish shell.

# SEE ALSO

[open](/man/open)(1), [xdg-open](/man/xdg-open)(1), [fish](/man/fish)(1)

