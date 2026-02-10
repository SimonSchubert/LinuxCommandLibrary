# TAGLINE

manages APK overlay files on diskless Alpine Linux systems

# TLDR

**Commit** changes to persistent storage

```lbu commit```

**List** files that would be saved

```lbu status```

Display **changes** in tracked files

```lbu diff```

**Include** a file or directory in overlay

```lbu include [path/to/file_or_directory]```

**Exclude** a file from overlay

```lbu exclude [path/to/file_or_directory]```

List **manually included/excluded** files

```lbu include -l```

List **backups** (previous overlays)

```lbu list-backup```

**Revert** to a backup overlay

```lbu revert [overlay_filename.tar.gz]```

# SYNOPSIS

**lbu** _command_ [_arguments_]

# PARAMETERS

**ci**, **commit**
> Save changes to persistent storage

**st**, **status**
> List files that would be committed

**diff**
> Show changes in tracked files

**inc**, **include** _PATH_
> Add file/directory to overlay

**ex**, **exclude** _PATH_
> Remove file/directory from overlay

**lb**, **list-backup**
> List available backups

**revert** _FILE_
> Restore a backup overlay

# DESCRIPTION

**lbu** (Local Backup Utility) manages APK overlay files on diskless Alpine Linux systems. In diskless mode, the root filesystem runs from RAM, and lbu saves configuration changes to persistent storage.

By default, only /etc is included in the overlay. Other files can be manually included. Changes are not persistent until committed with lbu commit.

# CAVEATS

Specific to Alpine Linux diskless installations. Changes in RAM are lost on reboot if not committed. Overlay storage must be properly configured.

# HISTORY

lbu is part of Alpine Linux's approach to running diskless systems, allowing customizations to be preserved across reboots while keeping the base system read-only.

# SEE ALSO

[apk](/man/apk)(1), [setup-alpine](/man/setup-alpine)(8)
