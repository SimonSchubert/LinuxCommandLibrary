# TAGLINE

MATE desktop text editor

# TLDR

**Start** the editor

```pluma```

**Open** specific files

```pluma [file1] [file2]```

Open with specific **encoding**

```pluma --encoding [WINDOWS-1252] [file]```

List supported **encodings**

```pluma --list-encodings```

Open and go to **line number**

```pluma +[10] [file]```

# SYNOPSIS

**pluma** [**--encoding** _encoding_] [**+**_line_] [_files_...]

# PARAMETERS

**--encoding _encoding_**
> Character encoding to use

**--list-encodings**
> List all supported encodings

**+_line_**
> Open file at specific line number

**--new-window**
> Open in new window

**--new-document**
> Open new document in existing window

# DESCRIPTION

**pluma** is the default text editor for the MATE desktop environment. It's a fork of gedit 2, providing a simple yet capable editor for programming and text editing.

The editor supports syntax highlighting, plugins, multiple document tabs, and external tool integration. It's designed to be easy to use while remaining powerful.

# CAVEATS

Requires GTK+ libraries. Plugin system extends functionality. Some gedit 2 plugins compatible. Encoding detection may fail for some files.

# HISTORY

**pluma** was created as part of the **MATE** desktop project, which forked GNOME 2 components when GNOME 3 was released. The name comes from Latin/Portuguese for "feather" (pen).

# SEE ALSO

[gedit](/man/gedit)(1), [nano](/man/nano)(1), [vim](/man/vim)(1)
