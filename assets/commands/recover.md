# TLDR

**Restore files from a dump archive** interactively

```restore -i -f [backup.dump]```

**List contents of a dump archive**

```restore -t -f [backup.dump]```

**Restore a full filesystem** from backup

```restore -r -f [backup.dump]```

**Restore specific files** from backup

```restore -x -f [backup.dump] [path/to/file]```

**Compare backup with current filesystem**

```restore -C -f [backup.dump]```

# SYNOPSIS

**restore** [**-itrxCvf**] [_file_] [_args_]

# PARAMETERS

**-i**
> Interactive restore mode; browse and select files

**-t**
> List table of contents of backup archive

**-r**
> Restore entire filesystem (for full restores)

**-x**
> Extract specified files from backup

**-C**
> Compare backup with filesystem; report differences

**-f** _file_
> Specify backup file or device (required)

**-v**
> Verbose mode; show files as they are restored

**-h**
> Extract files by inode number from directory hierarchy

**-m**
> Extract by inode numbers only

**-s** _n_
> Skip to tape volume n when restoring multi-volume backup

**-b** _size_
> Set block size for tape reads

# DESCRIPTION

**restore** reads backup archives created by the **dump** command and restores files to the filesystem. It supports both full filesystem restoration and selective file extraction.

In interactive mode (**-i**), restore provides a shell-like interface to browse the backup contents, mark files for extraction with **add**, and restore selected files with **extract**. Commands include **ls**, **cd**, **pwd**, **add**, **delete**, **extract**, and **quit**.

The dump/restore system is one of the oldest Unix backup solutions, specifically designed for ext2/ext3/ext4 filesystems. It understands filesystem structure and can perform incremental backups efficiently.

# INTERACTIVE COMMANDS

**ls** [_dir_]: List directory contents
**cd** _dir_: Change directory in backup
**pwd**: Print current directory
**add** _name_: Mark file for extraction
**delete** _name_: Unmark file
**extract**: Extract marked files
**quit**: Exit restore

# CAVEATS

The restore command works with dump archives, not general-purpose backup formats. Other backup tools (tar, rsync) require their own restore procedures.

Restoring to the original location may overwrite existing files. Consider restoring to an alternate directory first, then moving files as needed.

Full filesystem restores (**-r**) should be performed on an empty filesystem. The target filesystem should be formatted before restoration.

# SEE ALSO

[dump](/man/dump)(8), [tar](/man/tar)(1), [rsync](/man/rsync)(1), [dd](/man/dd)(1), [extundelete](/man/extundelete)(1)
