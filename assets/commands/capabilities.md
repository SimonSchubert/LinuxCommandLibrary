# TAGLINE

Manage Linux process privilege capabilities

# TLDR

**View capabilities of an executable**

```getcap [/path/to/binary]```

**View capabilities recursively**

```getcap -r [/path/to/directory]```

**Set a capability on an executable**

```sudo setcap [cap_net_bind_service=+ep] [/path/to/binary]```

**Remove all capabilities from an executable**

```sudo setcap -r [/path/to/binary]```

**View current process capabilities**

```cat /proc/self/status | grep Cap```

**Decode capability hex values**

```capsh --decode=[hex_value]```

**List all capabilities**

```capsh --print```

# SYNOPSIS

**getcap** [_options_] _file_...

**setcap** _capabilities_ _file_

**capsh** [_options_]

# PARAMETERS

**getcap -r** _directory_
> Recursively search for files with capabilities.

**getcap -v**
> Verbose output.

**setcap** _cap=flags_ _file_
> Set capability (flags: e=effective, p=permitted, i=inheritable).

**setcap -r** _file_
> Remove all capabilities.

**capsh --print**
> Print current capabilities.

**capsh --decode** _hex_
> Decode capability bitmask.

**capsh --drop** _cap_
> Drop a capability from the bounding set.

# COMMON CAPABILITIES

**cap_net_bind_service**: Bind to ports below 1024
**cap_net_raw**: Use raw sockets
**cap_net_admin**: Network administration
**cap_sys_admin**: System administration
**cap_sys_ptrace**: Trace processes
**cap_dac_override**: Bypass file permissions
**cap_setuid/cap_setgid**: Change UID/GID
**cap_chown**: Change file ownership
**cap_kill**: Send signals to any process

# DESCRIPTION

**Linux capabilities** divide the privileges traditionally held by root into distinct units that can be independently granted to executables. Instead of running an entire program as root, specific capabilities allow granting only the permissions needed.

For example, a web server that needs to bind to port 80 can be given only **cap_net_bind_service** instead of full root access. This follows the principle of least privilege, limiting damage from security vulnerabilities.

Capabilities exist at three levels: **permitted** (maximum capabilities available), **effective** (currently active), and **inheritable** (passed to child processes). File capabilities are stored in extended attributes.

# CAVEATS

Capabilities are only effective on Linux. Not all filesystems support capability extended attributes. Some applications check for UID 0 explicitly rather than capabilities. Capability inheritance rules are complex and easy to misconfigure. Docker and containers handle capabilities separately from the host.

# HISTORY

POSIX capabilities were proposed in the POSIX.1e draft standard in the **1990s**, though the standard was never finalized. Linux implemented capabilities starting in kernel **2.2** (1999), with significant improvements in **2.6.24** (2008) adding file capabilities. The feature has become increasingly important for containerization and security-conscious system administration.

# SEE ALSO

[getcap](/man/getcap)(8), [setcap](/man/setcap)(8), [capsh](/man/capsh)(1), [capabilities](/man/capabilities)(7)
