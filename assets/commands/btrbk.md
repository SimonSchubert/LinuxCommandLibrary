# TAGLINE

Backup tool for btrfs snapshots and subvolumes

# TLDR

Print **statistics** about subvolumes and snapshots

```sudo btrbk stats```

**List** configured subvolumes and snapshots

```sudo btrbk list```

Print what would happen in a **dry run**

```sudo btrbk -v dryrun```

**Run backup** routines with progress

```sudo btrbk --progress -v run```

Only create **snapshots** for configured subvolumes

```sudo btrbk snapshot```

**Resume** incomplete backups

```sudo btrbk resume```

Use a specific **config** file

```sudo btrbk -c [/path/to/btrbk.conf] run```

# SYNOPSIS

**btrbk** [_options_] _command_ [_filter_]

# DESCRIPTION

**btrbk** is a backup tool for btrfs filesystems that creates and manages snapshots and remote backups. It uses btrfs send/receive for efficient incremental backups and supports complex retention policies.

Configuration is defined in **/etc/btrbk/btrbk.conf**, specifying source subvolumes, snapshot locations, and backup targets including remote hosts via SSH.

# SUBCOMMANDS

**run**
> Create snapshots and run backup routines

**snapshot**
> Only create snapshots (no backups)

**resume**
> Resume incomplete backups

**dryrun**
> Show what would be done without making changes

**stats**
> Display statistics

**list**
> List configured items

**prune**
> Delete outdated backups and snapshots according to retention policy

**clean**
> Delete incomplete (garbled) backups

**archive** _source_ _target_
> Consolidate backups into a single target directory

# PARAMETERS

**-v**, **--verbose**
> Increase verbosity

**-q**, **--quiet**
> Suppress non-error output

**--progress**
> Show progress during send/receive transfers

**-n**, **--dry-run**
> Same as dryrun command

**-c** _file_
> Use alternate configuration file

**-p**, **--preserve**
> Preserve all snapshots and backups (no cleanup)

**-t**, **--table**
> Print output in table format

**-l**, **--loglevel** _level_
> Set log verbosity level

**-h**, **--help**
> Print synopsis and list of commands

# CONFIGURATION

**/etc/btrbk/btrbk.conf**
> Main configuration file defining source subvolumes, snapshot locations, backup targets, and retention policies.

# CAVEATS

Only works with btrfs filesystems. Remote backups require SSH access and btrfs on the remote host. Retention policies should be tested with dryrun first.

# SEE ALSO

[btrfs](/man/btrfs)(8), [btrfs-send](/man/btrfs-send)(8), [snapper](/man/snapper)(8)
