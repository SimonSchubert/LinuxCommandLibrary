# TAGLINE

Microsoft terminal-based text editor

# TLDR

**Launch** the editor with an empty buffer

```msedit```

**Open** a file

```msedit [path/to/file]```

**Open** a file at a specific **line number**

```msedit [path/to/file]:[line]```

**Open** a file at a specific **line and column**

```msedit [path/to/file]:[line]:[column]```

**Open multiple files** in tabs

```msedit [file1] [file2] [file3]```

# SYNOPSIS

**msedit** [_OPTIONS_] [_FILE_[:_LINE_[:_COLUMN_]]]...

# PARAMETERS

**-h**, **--help**
> Print help information

**-v**, **--version**
> Print version information

# DESCRIPTION

**msedit** is a lightweight, modeless, terminal-based text editor developed by **Microsoft** and written in **Rust**. It draws inspiration from the classic MS-DOS Editor but provides a modern interface with input controls similar to VS Code. Unlike modal editors like Vim, editing is immediate with no mode switching required. It features a menu bar, status bar, mouse support, UTF-8 handling, LF/CRLF conversion, and a localized UI supporting multiple languages. The binary is less than 250 KB.

On Linux the executable is named **msedit** to avoid conflicts with existing **edit** commands. On Windows it is simply **edit**.

# KEYBOARD SHORTCUTS

```
Ctrl+S       Save file
Ctrl+Shift+S Save As
Ctrl+O       Open file
Ctrl+F       Find
Ctrl+R       Find & Replace
F3           Next search result
Ctrl+P       Switch between tabs
Ctrl+G       Go to line/column
Ctrl+Z       Undo
Ctrl+Y       Redo
Ctrl+C       Copy
Ctrl+V       Paste
Ctrl+Q       Quit
Ctrl+W       Close tab
Alt+Z        Toggle word wrap
Alt+F / F10  Focus menu bar
```

# CAVEATS

On Linux, the executable name varies between **edit** (from GitHub binary) and **msedit** (from distro packages) depending on installation method. Has an optional dependency on **ICU** for Search and Replace functionality. Requires a **Rust nightly toolchain** to build from source. As a relatively new tool (2025), it lacks the plugin ecosystem of established editors.

# HISTORY

Microsoft Edit was announced at **Build 2025** in May 2025 and simultaneously open-sourced under the **MIT license**. It was created because 64-bit versions of Windows lacked a default CLI text editor. The project has gained significant community interest with over 13,000 GitHub stars. It will ship pre-installed with future Windows 11 builds.

# SEE ALSO

[nano](/man/nano)(1), [vim](/man/vim)(1), [emacs](/man/emacs)(1), [micro](/man/micro)(1)
