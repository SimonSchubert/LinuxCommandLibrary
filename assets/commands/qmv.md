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

**qmv** (quick move) renames files using a text editor. Edit filenames in your preferred editor.

The file list opens in an editor. Modify destination names and save.

Dual column format shows source and target. Clear visualization of the rename.

After saving, renames are executed. Only changed lines result in renames.

Complex renames are easy with editor features. Search and replace, macros, and multi-cursor.

# CAVEATS

Part of renameutils package. Editor must be text-based. Conflicts handled interactively.

# HISTORY

**qmv** is part of the **renameutils** package created by **Oskar Liljeblad**. It provides intuitive file renaming using familiar editor interfaces.

# SEE ALSO

[qcp](/man/qcp)(1), [rename](/man/rename)(1), [mmv](/man/mmv)(1), [vidir](/man/vidir)(1)
