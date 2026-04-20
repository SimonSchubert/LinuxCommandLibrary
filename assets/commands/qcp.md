# TAGLINE

Copy files by editing the destination filenames in a text editor

# TLDR

**Edit filenames** and copy matching files in the current directory

```qcp```

**Copy specific files**, editing their destination names in $EDITOR

```qcp [*.txt]```

**Use dual-column format** (source and destination on the same line)

```qcp --format=dual [*.jpg]```

**Preview what would happen** without actually copying

```qcp --dummy [*.log]```

**Recursive listing** like `ls -R`

```qcp -R [src/]```

# SYNOPSIS

**qcp** [_options_] [_file_...]

# PARAMETERS

**-f**, **--format=**_FORMAT_
> Edit format: **destination** (default, edit only the new name), **dual** (two columns with source on the left), or **single** (single column, shared source/destination).

**-o**, **--options=**_OPTIONS_
> Comma-separated format options (e.g. **source-comments**, **autodetect**).

**-i**, **--interactive**
> Drop into a command-mode prompt after editing instead of applying immediately.

**-e**, **--editor=**_PROGRAM_
> Override the editor (defaults to **$VISUAL**, then **$EDITOR**, then **vi**).

**--ls=**_PROGRAM_
> Use an alternative **ls** implementation to generate the file list.

**--dummy**
> Print the operations that would be performed but do not copy anything.

**-v**, **--verbose**
> Show each copy as it is performed.

**--help**, **--version**
> Display help or version information.

Many **ls**-style flags are passed through: **-a**, **-A**, **-B**, **-d**, **-r**, **-R**, **-S**, **-t**, **-u**, **-U**, **-X**, **--sort=**_WORD_, **--time=**_WORD_.

# DESCRIPTION

**qcp** (quick copy) opens a temporary buffer in **$EDITOR** listing the files you supplied (or the contents of the current directory if none are given) and lets you type the destination names in place. When you save and exit, **qcp** copies each source to the edited destination.

It is the copy-oriented sibling of **qmv**, the rename utility from the **renameutils** package by Oskar Liljeblad. Because all edits happen in a text editor, common editor features — search and replace, multi-cursor editing, macros — become powerful batch-copy primitives.

# CAVEATS

Part of the **renameutils** package. Not related to any "quick copy" progress-bar utility; **qcp** does not display transfer progress. Existing destination files are overwritten without prompting by default — use **--dummy** first if you are unsure.

# SEE ALSO

[qmv](/man/qmv)(1), [cp](/man/cp)(1), [mv](/man/mv)(1), [rsync](/man/rsync)(1)
