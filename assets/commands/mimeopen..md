# TLDR

**Open file with default app**

```mimeopen [file.pdf]```

**Choose application**

```mimeopen -a [file.pdf]```

**Open with specific app**

```mimeopen -d [file.pdf]```

**Ask every time**

```mimeopen --ask [file.pdf]```

**No forking**

```mimeopen -n [file.pdf]```

# SYNOPSIS

**mimeopen** [_options_] _file_

# PARAMETERS

_FILE_
> File to open.

**-a**
> Choose from all applications.

**-d**
> Set default application.

**--ask**
> Always ask.

**-n**
> No fork (wait for app).

**--help**
> Display help information.

# DESCRIPTION

**mimeopen** opens files with their associated applications. It uses MIME types to determine handlers.

The tool is part of perl-file-mimeinfo. It respects XDG MIME associations.

mimeopen opens files by MIME type.

# CAVEATS

Part of perl-file-mimeinfo. Uses XDG MIME database. Desktop integration varies.

# HISTORY

mimeopen provides MIME-based file opening following **XDG** (X Desktop Group) specifications.

# SEE ALSO

[xdg-open](/man/xdg-open)(1), [mimetype](/man/mimetype)(1), [file](/man/file)(1)

