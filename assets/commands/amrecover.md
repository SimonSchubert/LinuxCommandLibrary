# TLDR

**Start recovery session** with a configuration

```amrecover [config_name]```

**Connect to a specific index server**

```amrecover -s [index_server] [config_name]```

**Specify tape server and device**

```amrecover -t [tape_server] -d [/dev/nst0] [config_name]```

**Recover files for a different host**

```amrecover -h [hostname] [config_name]```

**Common interactive session workflow**

```
sethost [hostname]
setdisk [/home]
setdate [2024-01-15]
cd [path/to/restore]
add [filename]
extract
```

# SYNOPSIS

**amrecover** [**-C** _config_] [**-s** _index-server_] [**-t** _tape-server_] [**-d** _tape-device_] [**-h** _hostname_]

# PARAMETERS

**-C** _config_
> Amanda configuration name to use

**-s** _index-server_
> Host running the index daemon

**-t** _tape-server_
> Host running the tape server daemon

**-d** _tape-device_
> Tape device to use on the tape server

**-h** _hostname_
> Hostname to restore; defaults to current system hostname

# INTERACTIVE COMMANDS

**sethost** _hostname_
> Set the host to browse and restore from

**setdisk** _diskname_
> Set the disk (filesystem) to browse

**setdate** _YYYY-MM-DD_
> Set the date to view the backup state

**cd** _directory_
> Change directory within the backup

**ls**
> List contents of current backup directory with dates

**add** _pattern_
> Add files or directories to restore list (supports wildcards)

**delete** _pattern_
> Remove items from restore list

**list**
> Display current restore list

**clear**
> Clear the restore list

**extract**
> Begin extraction of files in restore list

**history**
> Show backup history for current host and disk

**lcd** _directory_
> Change local working directory

**lpwd**
> Display local working directory

**quit**
> Exit amrecover

# DESCRIPTION

**amrecover** is an interactive tool for browsing Amanda backup indexes and restoring files. It provides an FTP-like interface for navigating through backup snapshots, selecting files for recovery, and extracting them from tape or other backup media.

The tool connects to the Amanda index server to browse the backup catalog and determine which tapes contain the desired files. Users build a restore list by navigating directories and adding files, then initiate extraction which contacts the tape server to retrieve the data.

For in-place restores, run amrecover from the root of the backed-up filesystem or use **lcd** to change to that directory before extraction. Otherwise, a directory tree replicating the backup structure will be created in the current directory.

The GNU readline library provides command history and editing when available.

# CAVEATS

Requires running amrecover from the appropriate directory for in-place restores. The index server and tape server must be accessible over the network. For client-encrypted or client-custom-compressed backups, use **amrestore** instead. Authentication must be properly configured between client and servers.

# HISTORY

Amanda (Advanced Maryland Automatic Network Disk Archiver) was developed at the **University of Maryland** starting in **1991**. The amrecover tool provides the primary user interface for file-level recovery, designed to make restores accessible without requiring direct tape manipulation. It has evolved to support various storage backends beyond traditional tape.

# SEE ALSO

[amcheck](/man/amcheck)(8), [amdump](/man/amdump)(8), [amrestore](/man/amrestore)(8), [amfetchdump](/man/amfetchdump)(8), [amanda](/man/amanda)(8)
