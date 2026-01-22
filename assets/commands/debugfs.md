# TLDR

Open filesystem in **read-only** mode

```debugfs [/dev/sdXN]```

Open filesystem in **read-write** mode

```debugfs -w [/dev/sdXN]```

Read commands from **file**

```debugfs -f [path/to/cmd_file] [/dev/sdXN]```

View **filesystem stats** (interactive)

```stats```

**Close** the filesystem (interactive)

```close -a```

**List** available commands (interactive)

```lr```

# SYNOPSIS

**debugfs** [_options_] [_device_]

# DESCRIPTION

**debugfs** is an interactive debugger for ext2/ext3/ext4 filesystems. It allows direct manipulation of filesystem structures, which is useful for data recovery, analysis, and troubleshooting.

Can be used to recover deleted files, examine inodes, and manually fix filesystem issues.

# PARAMETERS

**-w**
> Open in read-write mode

**-f** _file_
> Read commands from file

**-R** _command_
> Execute single command and exit

**-c**
> Open filesystem as catastrophic mode (for corrupted filesystems)

# INTERACTIVE COMMANDS

**stats**
> Show filesystem statistics

**ls** _dir_
> List directory

**cat** _file_
> Display file contents

**lsdel**
> List deleted inodes

**dump** _inode_ _file_
> Dump inode to file

# CAVEATS

Requires root privileges. Use with extreme caution in write mode. Unmount filesystem before making changes. Improper use can cause data loss.

# SEE ALSO

[e2fsck](/man/e2fsck)(8), [dumpe2fs](/man/dumpe2fs)(8), [tune2fs](/man/tune2fs)(8)
