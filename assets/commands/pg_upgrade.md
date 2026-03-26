# TAGLINE

upgrades PostgreSQL to a new major version in place

# TLDR

**Upgrade cluster**

```pg_upgrade -b [old_bindir] -B [new_bindir] -d [old_datadir] -D [new_datadir]```

**Check compatibility without upgrading**

```pg_upgrade --check -b [old_bindir] -B [new_bindir] -d [old_datadir] -D [new_datadir]```

**Upgrade with hard links for speed**

```pg_upgrade --link -b [old_bindir] -B [new_bindir] -d [old_datadir] -D [new_datadir]```

**Upgrade with file cloning (reflinks, near-instant)**

```pg_upgrade --clone -b [old_bindir] -B [new_bindir] -d [old_datadir] -D [new_datadir]```

**Upgrade using parallel jobs**

```pg_upgrade -j [4] -b [old_bindir] -B [new_bindir] -d [old_datadir] -D [new_datadir]```

# SYNOPSIS

**pg_upgrade** [_options_]

# PARAMETERS

**-b**, **--old-bindir** _dir_
> Old PostgreSQL executable directory.

**-B**, **--new-bindir** _dir_
> New PostgreSQL executable directory. Defaults to the directory where pg_upgrade resides.

**-d**, **--old-datadir** _dir_
> Old database cluster configuration directory.

**-D**, **--new-datadir** _dir_
> New database cluster configuration directory.

**-c**, **--check**
> Check clusters only, don't change any data.

**-k**, **--link**
> Use hard links instead of copying files to the new cluster.

**--clone**
> Use efficient file cloning (reflinks) instead of copying. Near-instant on supported filesystems (Btrfs, XFS, macOS APFS).

**--copy**
> Copy files to the new cluster. This is the default.

**-j**, **--jobs** _njobs_
> Number of simultaneous processes for copying/linking files and dumping/restoring schemas in parallel.

**-p**, **--old-port** _port_
> The old cluster port number.

**-P**, **--new-port** _port_
> The new cluster port number.

**-U**, **--username** _name_
> Cluster's install user name.

**-r**, **--retain**
> Retain SQL and log files even after successful completion.

**-s**, **--socketdir** _dir_
> Directory for postmaster sockets during upgrade. Default is current working directory.

**-N**, **--no-sync**
> Do not wait for files to be written safely to disk.

**-v**, **--verbose**
> Enable verbose internal logging.

**-o**, **--old-options** _options_
> Options passed directly to the old postgres command.

**-O**, **--new-options** _options_
> Options passed directly to the new postgres command.

# DESCRIPTION

**pg_upgrade** upgrades PostgreSQL to a new major version in place. Faster than dump/restore for large databases. Preserves data files when possible. Always run with **--check** first to verify compatibility before performing the actual upgrade.

# SEE ALSO

[pg_dump](/man/pg_dump)(1), [pg_restore](/man/pg_restore)(1), [pg_ctl](/man/pg_ctl)(1), [pg_dumpall](/man/pg_dumpall)(1)

