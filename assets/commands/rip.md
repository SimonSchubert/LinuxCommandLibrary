# TAGLINE

a safe and ergonomic alternative to rm

# TLDR

**Delete file safely**

```rip [file.txt]```

**Delete multiple files and directories**

```rip [file1.txt] [file2.txt] [directory/]```

**Inspect file info before deleting** (shows size and first few lines)

```rip -i [file.txt]```

**List files deleted from the current directory**

```rip --seance```

**Restore the last deleted file**

```rip --unbury```

**Restore a specific file** from the graveyard

```rip --unbury [filename]```

**Restore all files listed by seance** (combine -s and -u)

```rip -su```

**Permanently delete all files** in the graveyard

```rip --decompose```

**Use a custom graveyard directory**

```rip --graveyard [path/to/graveyard] [file.txt]```

# SYNOPSIS

**rip** [_FLAGS_] [_OPTIONS_] [_TARGET..._]

# PARAMETERS

**-d**, **--decompose**
> Permanently delete (unlink) the entire graveyard.

**-i**, **--inspect**
> Print info about TARGET before prompting for action.

**-s**, **--seance**
> Print files that were sent under the current directory.

**-u**, **--unbury** _target_
> Undo the last removal by the current user, or specify file(s) in the graveyard.

**--graveyard** _graveyard_
> Set directory where deleted files go to rest.

**-h**, **--help**
> Print help information.

**-V**, **--version**
> Print version information.

# DESCRIPTION

**rip** (Rm ImProved) is a safer alternative to rm that moves deleted files to a "graveyard" directory instead of permanently removing them. The graveyard preserves the original filesystem path structure, making it straightforward to restore files to their exact original locations when needed.

The **--seance** flag lists files deleted from under the current directory. The **--unbury** flag restores files, either the most recently deleted item or a specific named file. Combining **-s** and **-u** restores everything listed by seance. When graveyard contents are no longer needed, **--decompose** permanently removes them to reclaim disk space.

The graveyard location defaults to /tmp/graveyard-$USER but can be customized with the **--graveyard** flag. No data is overwritten; if files sharing the same path are deleted, they are renamed as numbered backups. The **--inspect** option shows size and first few lines of a file, or total size and first few entries of a directory, before prompting for deletion.

# CAVEATS

The graveyard uses disk space. Large deletes may fill /tmp storage. This is not a secure delete tool; files in the graveyard can be read by anyone with access.

# SEE ALSO

[rm](/man/rm)(1), [trash-cli](/man/trash-cli)(1), [safe-rm](/man/safe-rm)(1)
