# TAGLINE

text editor for GNOME desktop environment

# TLDR

Open a file

```gedit [path/to/file]```

Open **several files** in tabs

```gedit [path/to/file1] [path/to/file2]```

Jump straight to a **line number**

```gedit +[42] [path/to/file]```

Jump to a **line and column**

```gedit +[42]:[8] [path/to/file]```

Force a **character encoding** when the guess is wrong

```gedit --encoding [ISO-8859-1] [path/to/file]```

See which **encodings** it knows about

```gedit --list-encodings```

Open in a **new window** rather than a tab

```gedit --new-window [path/to/file]```

Start with an **empty document**

```gedit --new-document```

**Block until the file is closed**, which is what git expects of an editor

```gedit --wait [path/to/file]```

Read the text from a **pipe**

```[command] | gedit -```

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

# INSTALL

```apt: sudo apt install gedit```

```dnf: sudo dnf install gedit```

```pacman: sudo pacman -S gedit```

```apk: sudo apk add gedit```

```zypper: sudo zypper install gedit```

```brew: brew install gedit```

```nix: nix profile install nixpkgs#gedit```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[nano](/man/nano)(1), [vim](/man/vim)(1), [kate](/man/kate)(1)
