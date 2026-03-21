# TAGLINE

Linux process privilege capabilities system

# TLDR

**View capabilities of an executable**

```getcap [/path/to/binary]```

**View capabilities recursively in a directory**

```getcap -r [/path/to/directory]```

**Set a capability on an executable**

```sudo setcap cap_net_bind_service=+ep [/path/to/binary]```

**Remove all capabilities from an executable**

```sudo setcap -r [/path/to/binary]```

**View current process capabilities**

```grep Cap /proc/self/status```

**Decode capability hex values**

```capsh --decode=[hex_value]```

**Print current shell capabilities**

```capsh --print```

# SYNOPSIS

**getcap** [_options_] _file_...

**setcap** _capabilities_ _file_

**capsh** [_options_]

# PARAMETERS

**getcap -r** _directory_
> Recursively search for files with capabilities.

**getcap -v**
> Verbose output, display all searched files even without capabilities.

**setcap** _cap=flags_ _file_
> Set capability (flags: e=effective, p=permitted, i=inheritable). Use + to add, - to remove.

**setcap -r** _file_
> Remove all capabilities from a file.

**setcap -q**
> Quiet mode, suppress warnings.

**capsh --print**
> Print current capabilities and securebits.

**capsh --decode** _hex_
> Decode capability bitmask into human-readable names.

**capsh --drop** _cap_
> Drop a capability from the bounding set.

**capsh --caps**=_cap-set_
> Set the prevailing process capabilities.

**capsh --keep**=_0|1_
> Set the keep-capabilities flag (0=off, 1=on).

# COMMON CAPABILITIES

**cap_net_bind_service**: Bind to ports below 1024
**cap_net_raw**: Use raw sockets (e.g., ping)
**cap_net_admin**: Network administration (interfaces, firewall, routing)
**cap_sys_admin**: Broad system administration (mount, sethostname, etc.)
**cap_sys_ptrace**: Trace arbitrary processes with ptrace
**cap_dac_override**: Bypass file read, write, and execute permission checks
**cap_setuid/cap_setgid**: Change UID/GID of a process
**cap_chown**: Change file ownership arbitrarily
**cap_kill**: Send signals to any process
**cap_fowner**: Bypass permission checks on operations that require file owner

# DESCRIPTION

**Linux capabilities** divide the privileges traditionally held by root into distinct units that can be independently granted to executables. Starting with kernel 2.2, instead of running an entire program as root, specific capabilities allow granting only the permissions needed.

For example, a web server that needs to bind to port 80 can be given only **cap_net_bind_service** instead of full root access. This follows the principle of least privilege, limiting damage from security vulnerabilities.

Capabilities exist in three sets per thread: **permitted** (maximum capabilities available), **effective** (currently active for permission checks), and **inheritable** (preserved across execve). File capabilities are stored in extended attributes and control which capabilities are gained when a binary is executed.

The **libcap** library provides user-space tools and APIs for managing capabilities, including **getcap**, **setcap**, and **capsh**.

# CAVEATS

Capabilities are Linux-specific and not portable to other Unix systems. Not all filesystems support capability extended attributes (e.g., NFS, FAT). Some applications check for UID 0 explicitly rather than capabilities. Capability inheritance rules are complex and easy to misconfigure. Docker and containers manage capabilities separately via their runtime configuration. **cap_sys_admin** is intentionally overloaded and grants a wide range of privileges.

# HISTORY

POSIX capabilities were proposed in the POSIX.1e draft standard in the **1990s**, though the standard was never finalized. Linux implemented capabilities starting in kernel **2.2** (1999), with significant improvements in **2.6.24** (2008) adding file capabilities. The feature has become increasingly important for containerization and security-conscious system administration.

# SEE ALSO

[getcap](/man/getcap)(8), [setcap](/man/setcap)(8), [capsh](/man/capsh)(1)
