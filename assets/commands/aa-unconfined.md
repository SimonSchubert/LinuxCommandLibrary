# TLDR

List **unconfined processes** using the ss command (default)

```sudo aa-unconfined```

Use **netstat** instead of ss to detect open network sockets

```sudo aa-unconfined --with-netstat```

Show all processes with TCP/UDP ports and **no profiles** (paranoid mode)

```sudo aa-unconfined --paranoid```

# SYNOPSIS

**aa-unconfined** [_--paranoid_] [_--with-ss_ | _--with-netstat_]

# DESCRIPTION

**aa-unconfined** identifies processes that listen on network sockets but lack AppArmor security profiles. It accomplishes this by checking processes with open TCP or UDP connections against loaded kernel AppArmor policies.

This tool is useful for identifying services that may benefit from AppArmor confinement.

# PARAMETERS

**--paranoid**
> Examines all processes from the /proc filesystem that have active TCP or UDP ports without AppArmor confinement

**--with-ss**
> Uses the ss(8) utility to identify network socket listeners (default)

**--with-netstat**
> Uses the netstat(8) command for network socket discovery instead of ss

**-h, --help**
> Display help information

# CAVEATS

The tool must run with **root privileges** and has limitations: it cannot reliably handle deleted executables, may miss processes started before profile loading, and is susceptible to race conditions. It only monitors TCP and UDP protocols.

# HISTORY

Part of the **AppArmor** utilities package for managing application security profiles on Linux systems.

# SEE ALSO

[aa-status](/man/aa-status)(8), [aa-genprof](/man/aa-genprof)(8), [ss](/man/ss)(8), [netstat](/man/netstat)(8), [apparmor](/man/apparmor)(7)
