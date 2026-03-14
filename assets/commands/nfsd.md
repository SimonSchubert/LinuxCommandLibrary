# TAGLINE

handles NFS requests from clients

# TLDR

**Start NFS server**

```sudo systemctl start nfs-server```

**Enable at boot**

```sudo systemctl enable nfs-server```

**Start with a specific number of threads**

```sudo rpc.nfsd [16]```

**Disable NFS version 3**

```sudo rpc.nfsd -N 3```

**Check NFS server status**

```sudo systemctl status nfs-server```

**Start with specific port and RDMA support**

```sudo rpc.nfsd -p [2049] -r```

# SYNOPSIS

**rpc.nfsd** [_options_] [_nprocs_]

# PARAMETERS

**nprocs**
> Number of server threads (default: 8).

**-d**, **--debug**
> Debug mode.

**-H**, **--host** _addr_
> Specify a particular hostname or address to accept NFS requests on. By default, all known network addresses are used.

**-p**, **--port** _port_
> Specify a different port to listen on for NFS requests (default: 2049).

**-r**, **--rdma** [_port_]
> Enable RDMA transport on the specified port (default: 20049).

**-N**, **--no-nfs-version** _ver_
> Disable a specific NFS version (e.g., 3, 4, 4.1, 4.2).

**-V**, **--nfs-version** _ver_
> Enable a specific NFS version.

**-s**, **--syslog**
> Log error messages to syslog instead of stderr.

**-T**, **--no-tcp**
> Disable TCP connections from clients.

**-U**, **--no-udp**
> Disable UDP connections from clients.

# DESCRIPTION

**nfsd** (NFS server daemon) handles NFS requests from clients. It implements the NFS protocol to share filesystems over the network.

The number of threads determines how many concurrent requests can be handled.

# CONFIGURATION

```
/etc/exports              - Exported filesystems
/etc/nfs.conf            - NFS configuration
/etc/default/nfs-kernel-server  # Debian
```

# EXPORTS FORMAT

```
# /etc/exports
/home       192.168.1.0/24(rw,sync,no_root_squash)
/data       *(ro,sync)
```

# CAVEATS

Requires rpcbind (except for NFSv4-only configurations). Firewall must allow NFS ports. NFSv4 uses a single port (2049). Security is managed through /etc/exports and optionally Kerberos authentication. The default of 8 threads should be tuned based on workload.

# HISTORY

NFS was developed at **Sun Microsystems** by a team led by **Russel Sandberg** in **1984**, becoming a foundational Unix network protocol.

# SEE ALSO

[showmount](/man/showmount)(8), [rpcbind](/man/rpcbind)(8), [nfsstat](/man/nfsstat)(8)
