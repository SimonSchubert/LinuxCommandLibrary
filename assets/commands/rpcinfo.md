# TAGLINE

Query RPC service registrations

# TLDR

Show **full table** of all RPC services on localhost

```rpcinfo```

Show **concise table** of RPC services

```rpcinfo -s localhost```

Display **statistics** of rpcbind operations

```rpcinfo -m```

Display **entries** for service and version on remote host

```rpcinfo -l remote_nfs_server mountd 2```

**Delete** registration for service version

```rpcinfo -d mountd 1```

# SYNOPSIS

**rpcinfo** [_options_] [_host_]

# PARAMETERS

**-s** _host_
> Show concise table of services

**-m**
> Display rpcbind statistics

**-l** _host_ _program_ _version_
> List entries for service

**-d** _program_ _version_
> Delete service registration

# DESCRIPTION

**rpcinfo** queries RPC servers and reports registered services. It's used to diagnose RPC connectivity and view available network services like NFS.

The tool provides information about program numbers, versions, protocols, and ports for registered RPC services.

# CAVEATS

Requires rpcbind to be running. Some operations require root privileges.

# HISTORY

Part of standard Unix network utilities for RPC service management. Essential for NFS troubleshooting and configuration.

# SEE ALSO

[rpcbind](/man/rpcbind)(8), [nfsstat](/man/nfsstat)(8), [showmount](/man/showmount)(8)
