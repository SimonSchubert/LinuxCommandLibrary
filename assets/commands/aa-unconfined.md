# TAGLINE

Find network-listening processes without AppArmor profiles

# TLDR

**List unconfined processes** with open network sockets (using ss by default)

```sudo aa-unconfined```

**Use netstat** instead of ss to detect open network sockets

```sudo aa-unconfined --with-netstat```

**Show all processes** from /proc with TCP/UDP ports without confinement

```sudo aa-unconfined --paranoid```

**Show only server processes** (those with listening sockets)

```sudo aa-unconfined --show=server```

# SYNOPSIS

**aa-unconfined** [_--paranoid_] [_--with-ss_ | _--with-netstat_]

# DESCRIPTION

**aa-unconfined** identifies processes that listen on network sockets but lack AppArmor security profiles. It accomplishes this by checking processes with open TCP or UDP connections against loaded kernel AppArmor policies.

This tool is useful for identifying services that may benefit from AppArmor confinement.

# PARAMETERS

**--paranoid**
> Examines all processes from the /proc filesystem that have active TCP or UDP ports without AppArmor confinement. Equivalent to --show=all.

**--show=**_MODE_
> Determines the set of processes displayed: all (all processes), network (processes with any sockets), server (processes with listening sockets), client (processes with non-listening sockets).

**--with-ss**
> Uses the ss(8) utility to identify network socket listeners (default).

**--with-netstat**
> Uses the netstat(8) command for network socket discovery instead of ss. Used as fallback when ss is not available.

**-h**, **--help**
> Display help information.

# CAVEATS

The tool must run with **root privileges** and has limitations: it cannot reliably handle deleted executables, may miss processes started before profile loading, and is susceptible to race conditions. It only monitors TCP and UDP protocols.

# HISTORY

Part of the **AppArmor** utilities package for managing application security profiles on Linux systems.

# SEE ALSO

[aa-status](/man/aa-status)(8), [aa-genprof](/man/aa-genprof)(8), [ss](/man/ss)(8), [netstat](/man/netstat)(8), [apparmor](/man/apparmor)(7)
