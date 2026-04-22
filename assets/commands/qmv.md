# TAGLINE

rename files by editing their names in a text editor

# TLDR

**Rename files** listed in an editor (dual-column, default)

```qmv [files]```

**Rename everything** in the current directory

```qmv *```

**Pick a specific editor** for this run

```qmv -e [vim] [files]```

**Use single-column format** (source and destination on alternating lines)

```qmv -f sc [files]```

**Use destination-only format**

```qmv -f do [files]```

**Dry run**: show what would happen without renaming

```qmv --dummy [files]```

**Verbose output**

```qmv -v [files]```

# SYNOPSIS

**qmv** [_options_] [_files_...]

# PARAMETERS

**-f**, **--format=**_FORMAT_
> Edit format to use: `dc` (dual-column, default), `sc` (single-column), or `do` (destination-only).

**-o**, **--options=**_OPTIONS_
> Pass comma-separated options to the selected edit format (e.g. `swap`, `blank`, `autowidth`). Use `--options=help` for a list.

**-e**, **--editor=**_PROGRAM_
> Text editor to open the file list in. Falls back to `$VISUAL`, `$EDITOR`, then a built-in default.

**--command=**_COMMAND_
> Use _COMMAND_ to perform renames instead of `mv`.

**--ls=**_PROGRAM_
> Path to the `ls` program used to list directory contents.

**-i**, **--interactive**
> Start in command mode rather than invoking the editor immediately.

**-v**, **--verbose**
> Print each rename as it is performed.

**--dummy**
> Do everything as usual except the actual renames (dry run).

**--help**
> Show option summary.

**--version**
> Show version information.

# FORMATS

**dc** — Dual-column (default): source on the left, destination on the right. Only edit the right side.
**sc** — Single-column: alternating lines of source and destination.
**do** — Destination-only: one destination per line; relies on file order matching the source list.

# DESCRIPTION

**qmv** (quick move) opens a list of filenames in a text editor so you can batch-rename by editing the destination column. When the editor exits, qmv compares the edited file with the original and applies each change as a rename. This lets you use familiar editor features — search and replace, macros, multi-cursor — for bulk renames.

qmv detects potential conflicts (cycles, collisions) and resolves them via intermediate renames. If a destination exists, you are prompted before overwriting.

# CAVEATS

Part of the **renameutils** package. Editor must be text-based. Do not edit the source column in the default `dc` format — only the destination side. Renames inside directories not listed will not be applied.

# HISTORY

**qmv** is part of the **renameutils** package created by **Oskar Liljeblad** and released under the GPL. The companion tool **qcp** performs the same workflow for copying files.

# SEE ALSO

[qcp](/man/qcp)(1), [rename](/man/rename)(1), [mmv](/man/mmv)(1), [vidir](/man/vidir)(1), [mv](/man/mv)(1)
