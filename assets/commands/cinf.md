# TAGLINE

Inspect Linux namespaces and cgroups from the CLI

# TLDR

**List all namespaces** (needs root)

```sudo cinf```

**Inspect a namespace** by id

```sudo cinf --namespace [4026532193]```

**Show namespaces for a PID**

```sudo cinf --pid [27681]```

**Inspect a process cgroup hierarchy**

```sudo cinf --cgroup [27681:3]```

**Debug mode**

```sudo DEBUG=true cinf```

# SYNOPSIS

**cinf** [**--namespace** *id*] [**--pid** *pid*] [**--cgroup** *pid:hierarchy*]

# DESCRIPTION

**cinf** (container info) is a command-line tool to view Linux namespaces and cgroups. It is useful for low-level container debugging: listing namespace IDs with process counts, users, and command lines; drilling into a namespace; listing namespaces for a PID; and inspecting cgroup control files for a process.

Typically run as root (**sudo**) so all namespaces are visible. Install from GitHub release tarballs or build with Go.

# PARAMETERS

*(no args)*

> List all namespaces with type, process count, users, and sample command.

**--namespace** *id*

> Detail a specific namespace.

**--pid** *pid*

> List namespaces for a process.

**--cgroup** *pid:hierarchy*

> Inspect a cgroup hierarchy for a process (interactive/top-like modes exist for monitoring control files; see walkthrough).

**DEBUG=true**

> Environment variable for verbose debug messages.

# CAVEATS

Linux-only. Without sufficient privileges many namespaces are hidden. Kernel cgroup v1 vs v2 layout affects **--cgroup** paths; confirm against your host. Companion walkthrough is in the upstream repo.

# SEE ALSO

[lsns](/man/lsns)(1), [nsenter](/man/nsenter)(1), [unshare](/man/unshare)(1), [systemd-cgls](/man/systemd-cgls)(1)

# RESOURCES

```[Source code](https://github.com/mhausenblas/cinf)```

<!-- verified: 2026-07-19 -->
