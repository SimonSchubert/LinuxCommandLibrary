# TAGLINE

displays WAL file contents in human-readable format

# TLDR

**Dump WAL file**

```pg_waldump [walfile]```

**Dump with record details**

```pg_waldump -r [record_type] [walfile]```

**Dump range**

```pg_waldump -s [start_lsn] -e [end_lsn] [walfile]```

# SYNOPSIS

**pg_waldump** [_options_] [_startseg_] [_endseg_]

# PARAMETERS

**-p**, **--path** _dir_
> WAL directory.

**-r**, **--rmgr** _name_
> Filter by resource manager.

**-s**, **--start** _lsn_
> Start LSN.

**-e**, **--end** _lsn_
> End LSN.

**-n**, **--limit** _n_
> Limit records.

# DESCRIPTION

**pg_waldump** displays WAL file contents in human-readable format. Shows transaction details and operations. Useful for debugging and understanding WAL activity.

# SEE ALSO

[pg_walsummary](/man/pg_walsummary)(1), [pg_receivewal](/man/pg_receivewal)(1)

