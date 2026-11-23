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

**Stop all server threads** (closes open connections)

```sudo rpc.nfsd 0```

**Show the running thread count**

```cat /proc/fs/nfsd/threads```

# SYNOPSIS

**rpc.nfsd** [_options_] [_nprocs_]

# PARAMETERS

**nprocs**
> Number of server threads (default: 8). If the server is already running, only this value is applied and the thread count is adjusted; **0** stops all threads.

**-d**, **--debug**
> Debug mode.

**-H**, **--host** _addr_
> Specify a particular hostname or address to accept NFS requests on. Can be repeated. By default, all known network addresses are used.

**-p**, **--port** _port_
> Specify a different port to listen on for NFS requests (default: 2049).

**-r**, **--rdma**
> Accept NFS requests over RDMA on the standard port (nfsrdma, 20049).

**--rdma=**_port_
> Accept RDMA requests on an alternate port (number or name from /etc/services).

**-N**, **--no-nfs-version** _ver_
> Disable a specific NFS version (e.g., 3, 4, 4.1, 4.2).

**-V**, **--nfs-version** _ver_
> Enable a specific NFS version.

**-s**, **--syslog**
> Log error messages to syslog instead of stderr.

**-t**, **--tcp**
> Listen on a TCP socket (default).

**-T**, **--no-tcp**
> Disable TCP connections from clients.

**-u**, **--udp**
> Listen on a UDP socket.

**-U**, **--no-udp**
> Disable UDP connections from clients (default).

**-L** _seconds_, **--lease-time** _seconds_
> Set the NFSv4 lease time (10 to 3600 seconds).

**-G** _seconds_, **--grace-time** _seconds_
> Set the NFSv4/NLM grace period for reclaiming state.

**-S** _scope_, **--scope** _scope_
> Set the NFSv4.1+ server scope identifier.

# DESCRIPTION

**nfsd** (NFS server daemon) handles NFS requests from clients. On Linux the server itself runs in the kernel as the **nfsd** module; the user-space **rpc.nfsd** program only tells the kernel which sockets to listen on, which NFS versions (3, 4.0, 4.1, 4.2) to offer, and how many kernel threads to start. **rpc.mountd** provides the separate mount service that NFSv3 clients need.

The number of threads determines how many concurrent requests can be handled. Use **nfsstat** to judge whether the thread count needs tuning.

# CONFIGURATION

```
/etc/exports              # Exported filesystems
/etc/nfs.conf             # NFS configuration
/etc/default/nfs-kernel-server  # Debian (legacy)
```

Most command-line options can also be set in the **[nfsd]** section of _/etc/nfs.conf_, which the systemd units read:

```
[nfsd]
threads=16
host=192.168.1.10
vers3=n
vers4.2=y
lease-time=90
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

[exports](/man/exports)(5), [showmount](/man/showmount)(8), [rpcbind](/man/rpcbind)(8), [nfsstat](/man/nfsstat)(8), [mount](/man/mount)(8)

# RESOURCES

```[Source code](https://git.linux-nfs.org/cgit/steved/nfs-utils.git)```

```[Homepage](https://wiki.linux-nfs.org/wiki/index.php/Main_Page)```

```[Documentation](https://docs.kernel.org/filesystems/nfs/index.html)```

<!-- verified: 2026-11-23 -->
