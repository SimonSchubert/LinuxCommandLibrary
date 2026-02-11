# TAGLINE

UUID generation daemon service

# TLDR

Generate **random** UUID

```uuidd -r```

Generate **bulk** random UUIDs

```uuidd -r -n [number_of_uuids]```

Generate **time-based** UUID

```uuidd -t```

# SYNOPSIS

**uuidd** [_OPTIONS_]

# PARAMETERS

**-r, --random**
> Generate random-based UUID

**-t, --time**
> Generate time-based UUID

**-n, --uuids** _N_
> Generate N UUIDs in bulk

**-d, --daemon**
> Run as a daemon

**-p, --pid** _FILE_
> Write PID to file

# DESCRIPTION

**uuidd** is a daemon for generating UUIDs (Universally Unique Identifiers). It provides a central service for generating UUIDs to ensure uniqueness across multiple processes and prevent clock issues with time-based UUIDs.

The daemon can generate both random (version 4) and time-based (version 1) UUIDs.

# CAVEATS

Time-based UUIDs expose MAC address. Running as daemon requires appropriate permissions. Part of util-linux package.

# SEE ALSO

[uuid](/man/uuid)(1), [uuidgen](/man/uuidgen)(1), [uuidparse](/man/uuidparse)(1)
