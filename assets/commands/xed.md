# TAGLINE

Cinnamon desktop text editor

# TLDR

**Start** editor

```xed```

**Open** files

```xed [path/to/file1 path/to/file2 ...]```

Open with **encoding**

```xed --encoding [WINDOWS-1252] [path/to/file]```

List **encodings**

```xed --list-encodings```

Go to **line** number

```xed +[10] [path/to/file]```

# SYNOPSIS

**xed** [_OPTIONS_] [_FILE..._]

# PARAMETERS

**--encoding** _ENCODING_
> Open files using specific character encoding

**--list-encodings**
> Print all supported encodings

**+**_LINE_
> Go to specified line number

**--new-window**
> Open in new window

**--new-document**
> Open new document

# DESCRIPTION

**xed** is the default text editor for the Cinnamon desktop environment. It is based on gedit and provides syntax highlighting, tabs, spell checking, and plugin support.

The editor supports multiple character encodings and can convert between them.

# CAVEATS

Designed for Cinnamon desktop. May require GTK libraries on other environments. Plugins require Python.

# SEE ALSO

[gedit](/man/gedit)(1), [pluma](/man/pluma)(1), [nano](/man/nano)(1)
