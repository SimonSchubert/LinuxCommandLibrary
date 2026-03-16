# TAGLINE

UUID generation daemon service

# TLDR

**Run uuidd** as a daemon

```uuidd -d```

**Request** a random UUID from the running daemon

```uuidd -r```

**Request bulk** random UUIDs from the running daemon

```uuidd -r -n [number_of_uuids]```

**Request** a time-based UUID from the running daemon

```uuidd -t```

**Kill** a running uuidd daemon

```uuidd -k```

**Run** with a timeout, exiting after inactivity

```uuidd -d -T [seconds]```

# SYNOPSIS

**uuidd** [_OPTIONS_]

# PARAMETERS

**-d, --debug**
> Run in debugging mode (prevents daemonizing)

**-F, --no-fork**
> Do not daemonize using a double-fork

**-k, --kill**
> Kill a currently running uuidd daemon

**-n, --uuids** _N_
> Request bulk response of N UUIDs

**-P, --no-pid**
> Do not create a pid file

**-p, --pid** _FILE_
> Specify pathname for the pid file

**-q, --quiet**
> Suppress some failure messages

**-r, --random**
> Test by requesting a random-based UUID

**-s, --socket** _PATH_
> Use specified pathname for the unix-domain socket

**-S, --socket-activation**
> Expect socket from calling process (implies --no-fork and --no-pid)

**-t, --time**
> Test by requesting a time-based UUID

**-T, --timeout** _N_
> Exit after N seconds of inactivity

**-C, --cont-clock** [_N_]
> Activate continuous clock handling for time-based UUIDs; default offset is 2 hours

# DESCRIPTION

**uuidd** is a daemon used by the UUID library to generate universally unique identifiers (UUIDs), especially time-based UUIDs, in a secure and guaranteed-unique fashion even when many threads on different CPUs request UUIDs simultaneously.

The daemon can generate both random (version 4) and time-based (version 1) UUIDs. Part of the **util-linux** package.

# CAVEATS

Time-based UUIDs may expose MAC address information. Running as a daemon requires appropriate permissions. The -r and -t flags are test/request operations that connect to a running daemon rather than generating UUIDs directly.

# SEE ALSO

[uuid](/man/uuid)(1), [uuidgen](/man/uuidgen)(1), [uuidparse](/man/uuidparse)(1)
