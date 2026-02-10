# TAGLINE

receives logical replication changes

# TLDR

**Start logical replication**

```pg_recvlogical -d [database] -S [slot] --start -f -```

**Create slot**

```pg_recvlogical -d [database] -S [slot] --create-slot -P [plugin]```

**Drop slot**

```pg_recvlogical -d [database] -S [slot] --drop-slot```

# SYNOPSIS

**pg_recvlogical** [_options_]

# PARAMETERS

**-d**, **--dbname** _name_
> Database name.

**-S**, **--slot** _name_
> Replication slot.

**--start**
> Start replication.

**--create-slot**
> Create slot.

**--drop-slot**
> Drop slot.

**-P**, **--plugin** _name_
> Output plugin.

**-f**, **--file** _file_
> Output file (- for stdout).

# DESCRIPTION

**pg_recvlogical** receives logical replication changes. Streams decoded changes from logical replication slot. Useful for change data capture and debugging.

# SEE ALSO

[pg_receivewal](/man/pg_receivewal)(1)

