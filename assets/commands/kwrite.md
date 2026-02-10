# TAGLINE

simple text editor from the KDE project

# TLDR

**Open** a text file

```kwrite [path/to/file]```

Open **multiple** files

```kwrite [file1] [file2]```

Open with specific **encoding**

```kwrite --encoding [UTF-8] [path/to/file]```

Open and navigate to specific **line and column**

```kwrite --line [line_number] --column [column_number] [path/to/file]```

# SYNOPSIS

**kwrite** [_options_] [_file_...]

# PARAMETERS

**--encoding** _ENCODING_
> Open file with specified character encoding

**--line** _LINE_
> Navigate to specified line number

**--column** _COLUMN_
> Navigate to specified column number

**--stdin**
> Read document from stdin

**-h**, **--help**
> Display help message

# DESCRIPTION

**kwrite** is a simple text editor from the KDE project. It provides syntax highlighting for many programming languages, code folding, and integration with KDE services.

KWrite shares the same editor component (KTextEditor) as Kate, making it a lightweight single-document alternative when full IDE features aren't needed.

# CAVEATS

Requires KDE libraries. For a more feature-rich editor with multiple documents and sessions, use kate instead. Some features depend on KDE version.

# HISTORY

KWrite has been part of KDE since the early versions, providing a simple but capable text editor for the KDE desktop environment.

# SEE ALSO

[kate](/man/kate)(1), [gedit](/man/gedit)(1), [nano](/man/nano)(1)
