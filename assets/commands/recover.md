# TAGLINE

alias for **restore** — extract files from a dump(8) backup

# TLDR

This command is commonly an alias/symlink for **restore**. See the full documentation:

```tldr restore```

**Interactive restore** from a dump file

```recover -if [backup.dump]```

**List the table of contents** of a dump archive

```recover -tf [backup.dump]```

**Full filesystem restore** (to the current directory)

```recover -rf [backup.dump]```

**Extract specific files**

```recover -xvf [backup.dump] [path/to/file]```

**Compare archive with filesystem**

```recover -Cf [backup.dump]```

# SYNOPSIS

**recover** [**-irtxCR**] [_options_] [_files_]

# DESCRIPTION

**recover** is an alternative name/symlink for the **restore** utility used by the **dump/restore** ext2/3/4 backup system. It reads a backup archive produced by `dump(8)` and writes the selected files back to disk. Interactive mode (`-i`) gives you a tiny shell for browsing the archive: `ls`, `cd`, `pwd`, `add`, `delete`, `extract`, `quit`.

On some systems (notably **NSR/NetWorker**), `recover` refers instead to a very different tool — the client-side restore interface for the Legato/EMC NetWorker backup server. The flags and behavior below describe the dump/restore lineage; for NetWorker, consult `recover(8)` on that system.

# PARAMETERS

**-i**
> Interactive restore: browse the archive and pick files.

**-r**
> Restore an entire filesystem. Run in an empty, freshly created filesystem.

**-R**
> Resume a previously interrupted `-r` restore.

**-t**
> Print the table of contents of the archive.

**-x**
> Extract the named files (or the whole archive if no names given).

**-C**
> Compare archive contents with the filesystem.

**-f** _file_
> Archive file or device (e.g. `/dev/nst0` or `backup.dump`). Use `-` for stdin.

**-v**
> Verbose: print each file as it is processed.

**-N**
> Do everything except actually writing files to disk (dry run).

**-y**
> Do not ask whether to abort on tape errors; always try to continue.

**-h**
> Do not recurse into directory hierarchies when extracting.

**-m**
> Extract by inode number instead of name.

**-s** _n_
> Skip to the _n_th dump file on a multi-file tape.

**-b** _size_
> Block size (in kilobytes) for reads.

# INTERACTIVE COMMANDS

`ls` [_dir_] — list entries
`cd` _dir_ — change directory within the archive
`pwd` — print current archive directory
`add` _name_ — mark for extraction
`delete` _name_ — unmark
`extract` — extract marked files
`setmodes` — set owners/permissions on extracted directories
`verbose` — toggle verbose output
`quit` — exit

# CAVEATS

Only understands archives created by `dump(8)`; `tar`, `cpio`, `rsync` archives require their own restore tools. Full (`-r`) restores must run in an empty filesystem. Restores preserve inode numbers, so restoring onto a live tree can overwrite or interleave files.

`recover` may not exist on your system; use `restore` directly if it is missing. On NetWorker systems, `recover` is a different program entirely.

# SEE ALSO

[dump](/man/dump)(8), [tar](/man/tar)(1), [rsync](/man/rsync)(1), [dd](/man/dd)(1), [extundelete](/man/extundelete)(1)
