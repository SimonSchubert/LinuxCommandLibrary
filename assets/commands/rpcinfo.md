# TAGLINE

Query RPC service registrations

# TLDR

**Show full table** of all RPC services on localhost

```rpcinfo```

**Probe portmapper** and list all registered programs

```rpcinfo -p [hostname]```

**Show concise table** of RPC services

```rpcinfo -s [hostname]```

**Display rpcbind statistics**

```rpcinfo -m```

**List entries for a specific service and version** on a remote host

```rpcinfo -l [hostname] [mountd] [2]```

**Check if a service is available** via TCP

```rpcinfo -t [hostname] [nfs]```

**Delete registration** for a service version (requires root)

```rpcinfo -d [mountd] [1]```

# SYNOPSIS

**rpcinfo** [_options_] [_host_]

# PARAMETERS

**-p** _host_
> Probe the portmapper on host and list all registered RPC programs.

**-s** _host_
> Show concise table of all registered services.

**-m**
> Display rpcbind operation statistics.

**-l** _host_ _program_ _version_
> List all entries matching the given program and version.

**-t** _host_ _program_ [_version_]
> Probe the service via TCP using an RPC call to procedure 0.

**-u** _host_ _program_ [_version_]
> Probe the service via UDP using an RPC call to procedure 0.

**-b** _program_ _version_
> Make an RPC broadcast and report all responding hosts.

**-d** _program_ _version_ [_transport_]
> Delete registration for the specified program and version. If transport is specified, unregister only on that transport, otherwise on all transports (root only).

**-a** _serv_address_ **-T** _transport_ _program_ [_version_]
> Ping procedure 0 of the specified program at the given universal address on the specified transport.

**-T** _transport_
> Specify the transport to use (e.g., tcp, udp).

**-n** _portnum_
> Use portnum instead of the portmapper-assigned port for -t and -u probes.

# DESCRIPTION

**rpcinfo** queries RPC servers and reports registered services. It is primarily used to diagnose RPC connectivity issues and view available network services like NFS, mountd, and other RPC-based services.

The tool provides information about program numbers, versions, protocols, and ports for registered RPC services. It can probe specific services to check availability, broadcast to discover services on the network, and manage service registrations.

# CAVEATS

Requires rpcbind to be running on the target host. The **-d** option requires root privileges. The **-b** broadcast option requires network broadcast support.

# HISTORY

Part of standard Unix network utilities for RPC service management. Essential for NFS troubleshooting and configuration.

# SEE ALSO

[rpcbind](/man/rpcbind)(8), [nfsstat](/man/nfsstat)(8), [showmount](/man/showmount)(8)
