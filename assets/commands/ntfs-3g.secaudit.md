# TAGLINE

NTFS security data auditing tool

# TLDR

**Audit all security data** on a volume recursively

```sudo ntfs-3g.secaudit -ar [/dev/sda1]```

**Display permissions** for files in a directory

```sudo ntfs-3g.secaudit [/dev/sda1] [/path/to/directory]```

**Recursively display permissions** in a directory

```sudo ntfs-3g.secaudit -r [/dev/sda1] [/path/to/directory]```

**Backup ACLs** from a volume and directory to a file

```sudo ntfs-3g.secaudit -b [/dev/sda1] [/path] > [backup.txt]```

**Restore ACLs** from a backup file

```sudo ntfs-3g.secaudit -s [/dev/sda1] < [backup.txt]```

**Get a user mapping proposal**

```ntfs-3g.secaudit -u [/mnt/windows/path/to/file]```

**Set permissions** on a file

```sudo ntfs-3g.secaudit [/dev/sda1] [644] [/path/to/file]```

**Recursively set permissions** in a directory

```sudo ntfs-3g.secaudit -r [/dev/sda1] [644] [/path/to/directory]```

# SYNOPSIS

**ntfs-3g.secaudit** **-a**[**rv**] _volume_
**ntfs-3g.secaudit** **-b**[**v**] _volume_ [_directory_]
**ntfs-3g.secaudit** **-s**[**ev**] _volume_ [_backup-file_]
**ntfs-3g.secaudit** **-r**[**v**] _volume_ _directory_
**ntfs-3g.secaudit** **-u**[**v**] _mounted-file_
**ntfs-3g.secaudit** **-h** _file_
**ntfs-3g.secaudit** [**-v**] _volume_ _file_
**ntfs-3g.secaudit** [**-v**] _mounted-file_
**ntfs-3g.secaudit** _volume_ _perms_ _file_
**ntfs-3g.secaudit** **-r**[**v**] _volume_ _perms_ _directory_

# PARAMETERS

**-a**
> Audit all global security data on the volume. Combine with -r to also scan all files and directories.

**-b**
> Recursively extract NTFS ACLs to standard output for backup purposes.

**-s**
> Set NTFS ACLs from a backup file or standard input. Combine with -e to also restore extra parameters (Windows attrib).

**-e**
> Used with -s to set extra backed-up parameters.

**-r**
> Recurse into subdirectories, displaying or setting permissions. With -a, also scans files and checks their relations to global security data.

**-u**
> Display a proposed user mapping file based on Windows ownership of a mounted file.

**-h _file_**
> Display hexadecimal security descriptors from a saved file in human-readable form.

**-v**
> Verbose output. Use twice for very verbose output.

# DESCRIPTION

**ntfs-3g.secaudit** displays the ownership and permissions of files on an NTFS file system and checks their consistency. It can audit security data, backup and restore ACLs, and propose user mappings. When a volume is given it must be unmounted and the command must be run as root. It can also set permissions, given as an octal mode or a POSIX ACL.

# CAVEATS

Current ntfs-3g releases install this tool as **ntfssecaudit**; **ntfs-3g.secaudit** is the older name. Operations on a volume need root and an unmounted volume, while the _mounted-file_ forms do not. Volumes from before NTFS 3.0 have no global security data to audit. Output should be redirected to a file for large directory operations. Returns 0 on success and 1 when errors are detected.

# HISTORY

**ntfs-3g.secaudit** is part of the **ntfs-3g** project, providing security audit and ACL management functionality for NTFS filesystems on Linux.

# SEE ALSO

[ntfs-3g](/man/ntfs-3g)(8), [ntfs-3g.usermap](/man/ntfs-3g.usermap)(8)

# RESOURCES

```[Source code](https://github.com/tuxera/ntfs-3g)```

```[Documentation](https://github.com/tuxera/ntfs-3g/wiki)```

<!-- verified: 2026-11-09 -->
