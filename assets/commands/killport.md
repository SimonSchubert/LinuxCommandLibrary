# TAGLINE

Kill processes listening on specified TCP/UDP ports

# TLDR

**Kill** whatever is using a port

```killport [8080]```

**Kill** multiple ports

```killport [3000] [8000] [5432]```

**Dry-run** (show what would be killed)

```killport -n [8080]```

**Also signal Docker containers** bound to the port

```killport -s [8080]```

# SYNOPSIS

**killport** [*options*] *port*...

# DESCRIPTION

**killport** finds processes (and optionally containers) bound to given port numbers and terminates them. It is a small convenience tool for the common “port already in use” failure during local development, written in Rust and available via **cargo**, Homebrew, and release binaries.

# PARAMETERS

*port*...

> One or more port numbers to free.

**-n**, **--dry-run**

> Print matching processes without killing (flag name may be **--dry-run** depending on version; see **killport --help**).

**-s**, **--signal** *signal* / container-related flags

> Control signal used and whether containers are targeted—consult **killport --help** for the installed version.

**-h**, **--help** / **-V**, **--version**

> Help and version.

# CAVEATS

Requires permission to signal the target processes (often root for privileged ports or other users' PIDs). Killing the wrong process can disrupt services—prefer dry-run when unsure.

# SEE ALSO

[lsof](/man/lsof)(1), [fuser](/man/fuser)(1), [ss](/man/ss)(8), [kill](/man/kill)(1)

# RESOURCES

```[Source code](https://github.com/jkfran/killport)```

<!-- verified: 2026-07-19 -->
