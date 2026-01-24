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

**rip** is a safer rm alternative. Files go to a "graveyard" instead of permanent deletion.

The graveyard stores deleted files. Original paths are preserved for restoration.

Seance lists what's been deleted. Shows path and deletion time.

Unbury restores files to original location. Specific files or last deleted.

Decompose permanently removes graveyard contents. Use when sure files aren't needed.

# CAVEATS

Graveyard uses disk space. Large deletes may fill storage. Not secure delete.

# HISTORY

**rip** (Rm ImProved) provides a safety net for file deletion. It gives users a chance to recover accidentally deleted files.

# SEE ALSO

[rm](/man/rm)(1), [trash-cli](/man/trash-cli)(1), [safe-rm](/man/safe-rm)(1)
