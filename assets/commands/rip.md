# TAGLINE

Safely delete files with undo support

# TLDR

**Delete file safely**

```rip [file.txt]```

**Delete multiple files**

```rip [file1.txt] [file2.txt]```

**Delete directory**

```rip [directory/]```

**List deleted files**

```rip --seance```

**Restore last deleted**

```rip --unbury```

**Restore specific file**

```rip --unbury [filename]```

**Permanently delete graveyard**

```rip --decompose```

# SYNOPSIS

**rip** [_--seance_] [_--unbury_] [_--decompose_] [_options_] [_files_]

# PARAMETERS

**-s**, **--seance**
> List buried files.

**-u**, **--unbury** _FILE_
> Restore file.

**-d**, **--decompose**
> Permanently delete.

**--graveyard** _DIR_
> Custom graveyard path.

**-i**, **--inspect**
> Inspect before delete.

# DESCRIPTION

**rip** (Rm ImProved) is a safer alternative to rm that moves deleted files to a "graveyard" directory instead of permanently removing them. The graveyard preserves the original filesystem path structure, making it straightforward to restore files to their exact original locations when needed.

The **--seance** command lists all files currently in the graveyard along with their original paths and deletion timestamps. The **--unbury** command restores files, either the most recently deleted item or a specific named file. When graveyard contents are no longer needed, **--decompose** permanently removes them to reclaim disk space.

The graveyard location defaults to /tmp/graveyard-$USER but can be customized with the **--graveyard** flag. The tool handles directories recursively and provides an **--inspect** option to preview files before deletion.

# CAVEATS

Graveyard uses disk space. Large deletes may fill storage. Not secure delete.

# HISTORY

**rip** (Rm ImProved) provides a safety net for file deletion. It gives users a chance to recover accidentally deleted files.

# SEE ALSO

[rm](/man/rm)(1), [trash-cli](/man/trash-cli)(1), [safe-rm](/man/safe-rm)(1)
