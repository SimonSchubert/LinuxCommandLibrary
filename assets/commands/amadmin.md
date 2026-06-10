# TAGLINE

Administrative interface for Amanda backup management

# TLDR

Dump the full internal **configuration** representation

```amadmin [config_name] config```

Show when each disk was last dumped and the next planned **level**

```amadmin [config_name] info [hostname]```

Force a **new full backup** of a host on the next run

```amadmin [config_name] force [hostname]```

**Remove** a host or disk from the configuration database

```amadmin [config_name] delete [hostname]```

Show how backups are **balanced** across run days

```amadmin [config_name] balance```

List the **disks** in the configuration

```amadmin [config_name] disklist```

# SYNOPSIS

**amadmin** _config_ _command_ [_args_]

# DESCRIPTION

**amadmin** is the administrative interface for Amanda (Advanced Maryland Automatic Network Disk Archiver), an open-source backup solution. It performs interactive maintenance on a backup configuration: forcing full dumps, inspecting the backup database, and querying where past dumps were stored.

The first argument is always the configuration name, followed by a subcommand. **amadmin** operates on Amanda's own database and schedule; it does not run backups itself (use **amdump**) or label volumes (use **amlabel**).

# PARAMETERS

**config**
> Dump the full internal representation of the configuration in text format

**info** [_host_ [_disk_]]
> Show the current information Amanda has recorded for hosts and disks

**disklist** [_host_ [_disk_]]
> List the disklist entries Amanda will back up

**force** _host_ [_disk_]
> Force a full backup of the host or disk on the next run

**unforce** _host_ [_disk_]
> Undo a previous force request

**delete** _host_ [_disk_]
> Remove a host or disk from the Amanda database (does not change the disklist file)

**balance** [**--days** _num_]
> Show how full backups are balanced across the run cycle

**find** [_host_ [_disk_]]
> Show which volumes hold the dumps for the given hosts and disks

# CONFIGURATION

**/etc/amanda/<config>/amanda.conf**
> Main Amanda configuration file defining backup schedules, tape types, and holding disks.

**/etc/amanda/<config>/disklist**
> Lists hosts and disks to be backed up for a given configuration.

# CAVEATS

Requires Amanda to be properly installed and configured. Some operations require appropriate permissions. Changes affect the next scheduled backup run.

# HISTORY

**Amanda** was developed at the University of Maryland starting in **1991**. It became one of the most widely used open-source backup solutions for Unix systems, with amadmin providing its administrative interface.

# SEE ALSO

[amcheck](/man/amcheck)(8), [amdump](/man/amdump)(8), [amrecover](/man/amrecover)(8)

# RESOURCES

```[Source code](https://github.com/zmanda/amanda)```

```[Homepage](https://www.amanda.org/)```

```[Documentation](https://manpages.ubuntu.com/manpages/noble/man8/amadmin.8.html)```

<!-- verified: 2026-06-11 -->
