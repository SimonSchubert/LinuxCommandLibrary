# TAGLINE

text editor for GNOME desktop environment

# TLDR

**Open** a text file

```gedit [path/to/file]```

Open **multiple** text files

```gedit [file1] [file2] ...```

Open a text file with a **specific encoding**

```gedit --encoding UTF-8 [path/to/file]```

Display a list of **supported encodings**

```gedit --list-encodings```

# SYNOPSIS

**gedit** [_options_] [_file_...]

# PARAMETERS

**--encoding** _ENCODING_
> Set the character encoding for opening files

**--list-encodings**
> Display list of supported character encodings

**-s**, **--standalone**
> Run gedit in standalone mode (separate process)

**-w**, **--wait**
> Open files and wait until closed before returning

**--new-window**
> Create a new top-level window

**--new-document**
> Create a new document in an existing instance

**+LINE**
> Open file at specified line number

**+LINE:COLUMN**
> Open file at specified line and column

# CONFIGURATION

**~/.config/gedit/gedit.ini**
> User preferences including editor settings, colors, and enabled plugins.

# DESCRIPTION

**gedit** is the default text editor for the GNOME desktop environment. It provides a clean, simple interface for editing text files with features like syntax highlighting for programming languages, spell checking, search and replace, and plugin support.

gedit supports tabbed editing for multiple files, automatic file backup, configurable fonts and colors, and integration with GNOME's file manager. It can handle various character encodings and line ending formats.

Plugins extend functionality with features like code snippets, bracket matching, file browser panel, and external tool integration.

# CAVEATS

As a GTK application, gedit may have slow startup times without the GNOME environment fully loaded. Heavy files may impact performance. The plugin ecosystem varies in quality and maintenance.

# HISTORY

gedit was created in **1998** as part of the GNOME project. It was designed to be a simple yet capable text editor following GNOME's human interface guidelines. The editor has evolved through multiple GNOME versions while maintaining its focus on simplicity and usability.

# SEE ALSO

[nano](/man/nano)(1), [vim](/man/vim)(1), [kate](/man/kate)(1), [gnome-text-editor](/man/gnome-text-editor)(1)
