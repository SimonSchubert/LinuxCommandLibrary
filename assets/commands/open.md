# TAGLINE

opens files and URLs on macOS

# TLDR

**Open file with default app**

```open [file]```

**Open URL in browser**

```open [https://example.com]```

**Open with specific app**

```open -a [Safari] [file.html]```

**Open directory in Finder**

```open [directory]```

**Open current directory**

```open .```

**Reveal in Finder**

```open -R [file]```

# SYNOPSIS

**open** [_options_] [_file_...]

# PARAMETERS

_FILE_
> File or URL to open.

**-a** _APP_
> Open with application.

**-e**
> Open in TextEdit.

**-t**
> Open in default text editor.

**-R**
> Reveal in Finder.

**-n**
> Open new instance.

**--help**
> Display help information.

# DESCRIPTION

**open** opens files and URLs on macOS. Uses default or specified applications.

The command launches applications with files. macOS specific utility.

# CAVEATS

macOS specific. Use xdg-open on Linux. Application names case-sensitive.

# HISTORY

open has been part of **macOS** for launching files with associated applications.

# SEE ALSO

[xdg-open](/man/xdg-open)(1), [start](/man/start)(1)

