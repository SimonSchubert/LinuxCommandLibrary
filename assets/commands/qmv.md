# TAGLINE

Rename files using a text editor

# TLDR

**Rename files in editor**

```qmv [files]```

**Rename all files in directory**

```qmv *```

**Use specific editor**

```EDITOR=[vim] qmv [files]```

**Dual column format**

```qmv -f do [files]```

**Destination only format**

```qmv -f dc [files]```

**Verbose output**

```qmv -v [files]```

# SYNOPSIS

**qmv** [_-f format_] [_-v_] [_options_] [_files_]

# PARAMETERS

**-f**, **--format** _FORMAT_
> Column format.

**-v**, **--verbose**
> Verbose output.

**-o**, **--options** _OPTS_
> Editor options.

**-e**, **--editor** _CMD_
> Editor command.

**--help**
> Show help.

# FORMATS

**do** - Dual column, original and destination
**dc** - Destination column only
**so** - Single column, original only

# DESCRIPTION

**qmv** (quick move) opens a list of filenames in a text editor, allowing you to rename files by editing their names directly. After saving and closing the editor, all modified filenames are applied as rename operations, making it easy to perform batch renames using familiar editor features like search-and-replace, macros, and multi-cursor editing.

The default dual-column format shows original and destination names side by side for clear visualization of changes. Alternative formats show destination names only or original names only. Only lines that differ between source and destination trigger actual renames, so unchanged files are left untouched.

# CAVEATS

Part of renameutils package. Editor must be text-based. Conflicts handled interactively.

# HISTORY

**qmv** is part of the **renameutils** package created by **Oskar Liljeblad**. It provides intuitive file renaming using familiar editor interfaces.

# SEE ALSO

[qcp](/man/qcp)(1), [rename](/man/rename)(1), [mmv](/man/mmv)(1), [vidir](/man/vidir)(1)
