# TAGLINE

TUI for managing BibLaTeX databases with Vim-like keybindings

# TLDR

Browse entries in a **bibliography file**

```bibiman [path/to/references.bib]```

Open **multiple bibliography files** simultaneously

```bibiman [file1.bib] [file2.bib]```

Recursively load all **.bib files** from a directory

```bibiman [path/to/directory]```

Use a **custom configuration** file

```bibiman -c [path/to/bibiman.toml] [path/to/file.bib]```

Load **only CLI-specified files**, ignoring the config

```bibiman -C [path/to/file.bib]```

Enable colors optimized for **light terminal** backgrounds

```bibiman --light-terminal [path/to/file.bib]```

**Set a custom PDF directory** for matching PDFs to entries

```bibiman --pdf-path [path/to/pdfs] [path/to/file.bib]```

**Format citekeys** in a bibliography file

```bibiman format-citekeys [path/to/file.bib]```

# SYNOPSIS

**bibiman** [**-h**|**--help**] [**-v**|**--version**] [**-c** _path_] [**-l** _path_] [**--pdf-path** _path_] [**--light-terminal**] [**-C**] [_file_|_directory_]...

**bibiman** **format-citekeys** [_options_] _file_

# PARAMETERS

**-h**, **--help**
> Display help information and exit

**-v**, **--version**
> Print the installed version and exit

**-c**, **--config-file** _path_
> Specify a custom configuration file location

**-l**, **--log-file** _path_
> Specify a custom log file location

**--pdf-path** _path_
> Set the directory path for PDF file discovery during the session

**--light-terminal**
> Enable color scheme optimized for light terminal backgrounds

**-C**, **--cli-only**
> Load only files specified on the command line, ignoring any files defined in the configuration

**format-citekeys**
> Subcommand to reformat citekeys in a bibliography file using pattern syntax

# DESCRIPTION

**bibiman** is a terminal user interface for managing BibLaTeX bibliographic databases as part of a terminal-based scientific workflow. Written in Rust, it provides fast, keyboard-driven interaction with .bib files.

The interface uses Vim-like keybindings for navigation: **j**/**k** or arrow keys to move between entries, **Ctrl-d**/**Ctrl-u** to jump by five entries, **g**/**G** to jump to the first or last entry, and **h**/**l** to select columns. Pressing **?** opens a help popup with the full keybinding reference.

Entries can be searched with **/** or **Ctrl-f** for fuzzy search across all fields, or **Alt-/** to search a specific field. Fuzzy matching is provided by the nucleo-matcher engine. Special prefixes modify matching behavior: **^** anchors to the beginning, **$** anchors to the end, and **'** forces literal matching. Pressing **TAB** switches between entry and keyword views, allowing filtering by keywords.

Pressing **e** opens the current entry in a terminal editor at the correct line. The editor is determined by the config file, then the **VISUAL** environment variable, then **EDITOR**, falling back to **vi**. Pressing **y** copies the citekey to the system clipboard, **o** opens an associated PDF, URL, or DOI link, and **n** creates or opens a note file linked to the entry. Entries can be added via DOI lookup with **a**.

Sorting is available by pressing **s** to cycle through author, title, and year columns, or **S** to restore the original file position order. A custom column can display additional metadata such as journal title, publisher, institution, series, or publication type.

Multiple .bib files can be loaded in a single session by passing several file arguments or a directory path. When a directory is given, bibiman recursively searches for all .bib files within it. PDF files are matched to entries either through the BibTeX **file** field or by matching the citekey against filenames in the configured PDF directory.

The **format-citekeys** subcommand provides batch citekey reformatting via the command line using a configurable pattern syntax, without launching the TUI.

# CONFIGURATION

The configuration file is located at **$XDG_CONFIG_HOME/bibiman/bibiman.toml** (typically ~/.config/bibiman/bibiman.toml).

```[general]
bibfiles = ["/path/to/references.bib"]
editor = { command = "vim", args = [] }
pdf_opener = "xdg-open"
url_opener = "xdg-open"
pdf_path = "/path/to/pdfs"
note_path = "/path/to/notes"
note_extensions = ["md", "txt"]
custom_column = "pubtype"
clipboard = "wayland"```

The **editor** field accepts either a simple string or a table with **command** and **args** keys. The **custom_column** field controls what extra metadata appears in the entry list and can be set to **journaltitle**, **organization**, **institution**, **series**, **publisher**, or **pubtype**. The **clipboard** field selects the clipboard provider: **wayland**, **x-clip**, **x-sel**, **pasteboard**, **tmux**, or **win32-yank**.

Colors are configured in a **[colors]** section using ANSI color names, 256-color indices, or hex codes for elements such as **main_text_color**, **highlight_text_color**, **entry_color**, **keyword_color**, and **popup_bg_color**.

Citekey formatting rules are defined in a **[citekey_formatter]** section with options for **fields**, **ascii_only**, and **case**.

# CAVEATS

Citekeys cannot contain the special characters **/ | # * \ " ' ; !** as these interfere with note file creation and other operations. The editor must support the **+line** argument syntax for jumping to a specific line. Windows support for opening PDF files and URLs is untested. LaTeX macros are hidden in the display for readability but are preserved in the underlying .bib file.

# HISTORY

**bibiman** was created by **lukeflo** and first published to crates.io as version 0.7.0 in **November 2024**. The first official Codeberg release (v0.15.0) followed in **October 2025**. The project is written in Rust without AI-generated code, licensed under GPL-3.0-or-later, and hosted on Codeberg. As of early 2026, development remains active with version 0.19.3 released in January 2026 and over 376 commits in the repository.

# SEE ALSO

[biber](/man/biber)(1), [bibtex](/man/bibtex)(1), [papis](/man/papis)(1), [latex](/man/latex)(1)
