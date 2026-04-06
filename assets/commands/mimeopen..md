# TAGLINE

open files by mimetype

# TLDR

**Open file with default application**

```mimeopen [file.pdf]```

**Ask which application** to use (does not change default)

```mimeopen --ask [file.pdf]```

**Set the default application** for the file's MIME type

```mimeopen -d [file.pdf]```

**Open without asking**, using default or first known handler

```mimeopen --no-ask [file.pdf]```

**Determine MIME type by file content only** (ignore extension)

```mimeopen -M [file]```

**Enable debug output** showing mimetype determination

```mimeopen -D [file]```

# SYNOPSIS

**mimeopen** [_options_] [**-**] _files_

# PARAMETERS

**-a**, **--ask**
> Prompt to choose an application from known handlers. Does not change the default application.

**-d**, **--ask-default**
> Let the user choose a new default program for given files.

**-n**, **--no-ask**
> Do not ask the user which program to use. Choose the default program or the first program known to handle the file mimetype. Does not set the default application.

**-M**, **--magic-only**
> Do not check for extensions, globs, or inode type, only look at the content of the file.

**--database** _mimedir:mimedir:..._
> Force the program to look in these directories for the shared mime-info database.

**-D**, **--debug**
> Print debug information about how the mimetype was determined.

**-h**, **--help**
> Display help information.

**-u**, **--usage**
> Display usage information.

**-v**, **--version**
> Print program version.

# DESCRIPTION

**mimeopen** tries to determine the mimetype of a file and open it with the default desktop application. If no default application is configured, the user is presented with a terminal menu to choose one.

The tool is part of the **File::MimeInfo** Perl module (perl-file-mimeinfo package). It reads and respects XDG MIME associations configured in `~/.config/mimeapps.list` and system defaults.

# CAVEATS

Part of perl-file-mimeinfo. Uses the shared MIME info database following freedesktop.org standards. Desktop integration may vary depending on the environment.

# SEE ALSO

[xdg-open](/man/xdg-open)(1), [mimetype](/man/mimetype)(1), [file](/man/file)(1)

