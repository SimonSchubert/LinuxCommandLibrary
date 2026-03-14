# TAGLINE

micro GNU Emacs-style editor

# TLDR

**Open a file**

```mg [file.txt]```

**Open a file at a specific line**

```mg +[10] [file.txt]```

**Open in read-only mode**

```mg -R [file.txt]```

**Open multiple files** (switch with C-x b)

```mg [file1.txt] [file2.txt]```

# SYNOPSIS

**mg** [_options_] [_files_]

# PARAMETERS

_FILES_
> Files to edit.

**+** _LINE_
> Start at specified line number.

**-R**
> Read-only (view) mode.

**-n**
> Turn off backup file generation.

**-f** _mode_
> Run the given mode at startup (e.g., -f auto-fill-mode).

# DESCRIPTION

**mg** is a micro GNU Emacs-style editor. It provides basic Emacs keybindings in a lightweight package, making it ideal for quick edits on minimal systems.

Common keybindings: **C-x C-s** (save), **C-x C-c** (quit), **C-x C-f** (open file), **C-s** (incremental search), **C-x b** (switch buffer), **C-x k** (kill buffer), **C-space** (set mark), **C-w** (cut region), **M-w** (copy region), **C-y** (paste), **C-x u** (undo).

mg is the default editor on OpenBSD and is available on other BSD and Linux systems.

# CAVEATS

Much more limited than GNU Emacs. No Emacs Lisp extension support, no syntax highlighting, no Unicode support. Intended for basic text editing only.

# HISTORY

mg was originally named **MicroGNUEmacs** (later shortened to **mg**), created in **1986** by Dave Conroy for systems where full GNU Emacs was too large. It was subsequently maintained by various contributors and is now part of the OpenBSD base system.

# SEE ALSO

[emacs](/man/emacs)(1), [nano](/man/nano)(1), [vi](/man/vi)(1)
