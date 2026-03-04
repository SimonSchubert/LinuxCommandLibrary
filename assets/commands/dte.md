# TAGLINE

Small configurable terminal text editor

# TLDR

**Open** a file for editing

```dte [filename]```

**Open** multiple files

```dte [file1] [file2]```

**Open** file at specific line

```dte +[line_number] [filename]```

**Open** file in read-only mode

```dte -R [filename]```

# SYNOPSIS

**dte** [_options_] [_files_]

# PARAMETERS

**+**_N_
> Start at line N

**-R, --read-only**
> Open in read-only mode

**-c, --config** _FILE_
> Use specified configuration file

**-h, --help**
> Display help and exit

**-V, --version**
> Display version and exit

# DESCRIPTION

**dte** is a small, fast, and configurable terminal text editor designed to be lightweight yet powerful. It features syntax highlighting for many languages, multiple buffers, split windows, and a clean command interface similar to vi/vim but with different key bindings.

The editor is written in C with minimal dependencies, making it suitable for resource-constrained environments. It supports macros, regular expression search, and customizable key bindings through configuration files.

# KEYBINDINGS

**Ctrl+S**
> Save file

**Ctrl+Q**
> Quit

**Ctrl+F**
> Search

**Ctrl+G**
> Go to line

**Ctrl+W**
> Close buffer

**Ctrl+N**
> New file

**Ctrl+O**
> Open file

**Ctrl+Z**
> Suspend editor

**Tab**
> Indent/Autocomplete

**Shift+Tab**
> Unindent

# CONFIGURATION

Configuration file location:
- ~/.dterc
- ~/.config/dte/dterc

Example configuration:

```
set auto-indent true
set tab-width 4
set show-line-numbers true
```

# CAVEATS

Different key bindings than vi/vim may require adjustment period. Some advanced features require compilation with specific options. Terminal compatibility varies. No built-in scripting language like Vimscript or Emacs Lisp.

# HISTORY

**dte** was created by Craig Barnes as a lightweight alternative to larger editors. It aims to provide essential editing features in a small footprint while remaining easy to configure and extend.

# SEE ALSO

[vim](/man/vim)(1), [nano](/man/nano)(1), [micro](/man/micro)(1), [kakoune](/man/kakoune)(1)