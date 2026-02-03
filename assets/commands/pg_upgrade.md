# TLDR

**Upgrade cluster**

```pg_upgrade -b [old_bindir] -B [new_bindir] -d [old_datadir] -D [new_datadir]```

**Check compatibility**

```pg_upgrade -c -b [old_bin] -B [new_bin] -d [old_data] -D [new_data]```

**Upgrade with link mode**

```pg_upgrade -k -b [old_bin] -B [new_bin] -d [old_data] -D [new_data]```

# SYNOPSIS

**pg_upgrade** [_options_]

# PARAMETERS

**-b**, **--old-bindir** _dir_
> Old PostgreSQL binaries.

**-B**, **--new-bindir** _dir_
> New PostgreSQL binaries.

**-d**, **--old-datadir** _dir_
> Old data directory.

**-D**, **--new-datadir** _dir_
> New data directory.

**-c**, **--check**
> Check only, don't upgrade.

**-k**, **--link**
> Use hard links (faster).

# DESCRIPTION

**pg_upgrade** upgrades PostgreSQL to a new major version in place. Faster than dump/restore for large databases. Preserves data files when possible.

# SEE ALSO

[pg_dump](/man/pg_dump)(1), [pg_restore](/man/pg_restore)(1)

