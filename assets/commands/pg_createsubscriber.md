# TAGLINE

converts a physical standby to logical replication subscriber

# TLDR

**Convert a stopped standby into a logical subscriber**

```pg_createsubscriber -d [dbname] -D [standby_data_dir] -P "[host=primary dbname=app]"```

**Preview the actions without changing anything**

```pg_createsubscriber --dry-run -d [dbname] -D [standby_data_dir] -P "[host=primary dbname=app]"```

**Convert several databases at once**

```pg_createsubscriber -d [db1] -d [db2] -D [standby_data_dir] -P "[host=primary]"```

# SYNOPSIS

**pg_createsubscriber** [_options_] **-D** _datadir_ **-P** _conninfo_ **-d** _dbname_

# PARAMETERS

**-d**, **--database** _name_
> Database to set up logical replication for. Repeat for multiple databases.

**-D**, **--pgdata** _dir_
> Data directory of the target (standby) server. The server must be stopped.

**-P**, **--publisher-server** _conninfo_
> Connection string for the source (publisher) server.

**-p**, **--subscriber-port** _port_
> Port that the target subscriber server listens on while being configured.

**-U**, **--subscriber-username** _name_
> User name used to connect to the target subscriber.

**-s**, **--socketdir** _dir_
> Directory for the target server's postmaster sockets (default: current directory).

**--publication** _name_
> Publication name to create on the publisher. Repeat to match multiple databases.

**--subscription** _name_
> Subscription name to create on the subscriber. Repeat to match multiple databases.

**--replication-slot** _name_
> Replication slot name used by the logical replication. Repeat to match multiple databases.

**-t**, **--recovery-timeout** _seconds_
> Maximum time to wait for the standby to catch up before failing.

**-n**, **--dry-run**
> Show what would be done without making any changes.

**-v**, **--verbose**
> Enable verbose output (repeat for more detail).

# DESCRIPTION

**pg_createsubscriber** converts a physical standby into a logical replication subscriber. It transforms an existing streaming-replication standby into a node that subscribes to publications on the original primary, avoiding a fresh initial data copy.

The target standby must be stopped before running the tool. Internally it uses **pg_ctl** to start and stop the target server while it creates the publication, subscription, and replication slot. When several `--database`, `--publication`, `--subscription`, or `--replication-slot` options are given, their counts and order must correspond. Introduced in PostgreSQL 17.

# CAVEATS

The target server must be a running-then-stopped physical standby, not in use during conversion. The number of `--publication`, `--subscription`, and `--replication-slot` values, when specified, must match the number of `--database` values. Always test with `--dry-run` first.

# SEE ALSO

[pg_basebackup](/man/pg_basebackup)(1)

