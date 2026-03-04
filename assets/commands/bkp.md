# TAGLINE

simple utility for creating backups of files and directories

# TLDR

Create a **backup** of a file

```bkp [path/to/file]```

Create a **backup** of a directory

```bkp [path/to/directory]```

Create a **TAR archive** backup with a message

```bkp -a -m "[initial version]" [path/to/file]```

**Restore** a file from a backup

```bkp -r [path/to/file.b01]```

Restore a backup and **delete** the backup file afterwards

```bkp -r -d [path/to/file.b01]```

View **metadata** of an archive backup

```bkp -i [path/to/file.b01]```

Create a backup and **delete** the original

```bkp -d [path/to/file]```

Create a backup, answering **yes** to all prompts

```bkp -y [path/to/file]```

# SYNOPSIS

**bkp** [_options_] [_paths_...]

# PARAMETERS

**-r**, **--restore**
> Restore resources from backup(s).

**-d**, **--delete**
> Delete the source file or directory after the operation.

**-a**, **--archive**
> Create a TAR archive instead of a simple copy.

**-y**, **--yes**
> Answer yes to all confirmation prompts.

**-m** _TEXT_, **--message** _TEXT_
> Message to be included in the archive metadata. Requires **-a**.

**-M**, **--message-edit**
> Open a text editor to compose the message. Requires **-a**.

**-i**, **--info**
> Read and display metadata from an archive backup.

**--version**
> Print version information.

**--help**
> Show usage information and exit.

# DESCRIPTION

**bkp** is a Python-based command-line utility that creates sequentially numbered backups of files and directories. Running **bkp** on a file **foo** produces **foo.b01**, and subsequent invocations produce **foo.b02**, **foo.b03**, and so on. Backup files are always created in the same directory as the source.

Two backup modes are supported. By default, **bkp** creates a simple file copy (or directory tree copy). With the **-a** flag, it produces a TAR archive that can embed metadata including the author (current user), timestamp, and an optional commit message.

The **-r** flag restores a backup to its original name by stripping the **.bNN** suffix. If the original file already exists, the user is prompted for confirmation unless **-y** is specified. The **-d** flag can be combined with either backup or restore to remove the source after the operation completes.

Archive metadata can be inspected with **-i**, which displays the author, creation time, and any message stored in the archive.

Multiple paths can be specified in a single invocation, and each will be processed in sequence.

# CONFIGURATION

**EDITOR**
> Environment variable used to determine which text editor to open when the **-M** flag is given. Defaults to **vi** if not set.

# CAVEATS

The **-m** and **-M** options are only valid in combination with **-a**. Using them without **-a** produces an error.

Backup numbering is determined by scanning existing files in the same directory. If backup files are manually renamed or removed, numbering may produce unexpected results.

The tool is primarily tested on Linux. Behavior on other platforms may vary.

The author disclaims responsibility for any data loss resulting from use of this utility.

# SEE ALSO

[cp](/man/cp)(1), [tar](/man/tar)(1), [rsync](/man/rsync)(1), [mv](/man/mv)(1)
