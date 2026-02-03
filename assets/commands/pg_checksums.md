# TLDR

**Enable checksums**

```pg_checksums -e -D [data_dir]```

**Disable checksums**

```pg_checksums -d -D [data_dir]```

**Verify checksums**

```pg_checksums -c -D [data_dir]```

# SYNOPSIS

**pg_checksums** [_options_] [**-D**] _datadir_

# PARAMETERS

**-D**, **--pgdata** _dir_
> Data directory.

**-c**, **--check**
> Verify checksums.

**-e**, **--enable**
> Enable checksums.

**-d**, **--disable**
> Disable checksums.

**-v**, **--verbose**
> Verbose output.

**-P**, **--progress**
> Show progress.

# DESCRIPTION

**pg_checksums** enables, disables, or verifies data checksums. Checksums detect data corruption. Server must be stopped before running. Enable for production databases.

# CAVEATS

Server must be stopped before enabling or disabling checksums.

# SEE ALSO

[pg_amcheck](/man/pg_amcheck)(1), [initdb](/man/initdb)(1)

