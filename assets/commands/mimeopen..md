# TAGLINE

opens files with their associated applications

# TLDR

**Open file with default app**

```mimeopen [file.pdf]```

**Ask which application** to use

```mimeopen --ask [file.pdf]```

**Set the default application** for the MIME type

```mimeopen -d [file.pdf]```

**Show the MIME type** without opening

```mimeopen --no-ask [file.pdf]```

**No forking**

```mimeopen -n [file.pdf]```

# SYNOPSIS

**mimeopen** [_options_] _file_

# PARAMETERS

_FILE_
> File to open.

**--ask**
> Prompt to choose an application from known handlers.

**-d**
> Set the default application for this MIME type.

**-n**
> No fork; wait for the application to exit.

**--no-ask**
> Print the MIME type without opening the file.

**--help**
> Display help information.

# DESCRIPTION

**mimeopen** opens files with their associated applications using MIME types to determine the appropriate handler. It queries the XDG MIME database to find registered applications for the file's type.

The tool is part of the **File::MimeInfo** Perl module (perl-file-mimeinfo package). It reads and respects XDG MIME associations configured in `~/.config/mimeapps.list` and system defaults.

# CAVEATS

Part of perl-file-mimeinfo. Uses XDG MIME database. Desktop integration varies.

# HISTORY

mimeopen provides MIME-based file opening following **XDG** (X Desktop Group) specifications.

# SEE ALSO

[xdg-open](/man/xdg-open)(1), [mimetype](/man/mimetype)(1), [file](/man/file)(1)

