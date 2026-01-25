# TLDR

**Start NFS server**

```sudo systemctl start nfs-server```

**Enable at boot**

```sudo systemctl enable nfs-server```

**Restart NFS services**

```sudo systemctl restart nfs-server```

**Check status**

```sudo systemctl status nfs-server```

**Manually start nfsd**

```sudo rpc.nfsd [8]```

# SYNOPSIS

**rpc.nfsd** [_options_] [_nprocs_]

# PARAMETERS

**nprocs**
> Number of server threads.

**-d**, **--debug**
> Debug mode.

**-p**, **--port** _port_
> NFS port.

**-N**, **--no-nfs-version** _ver_
> Disable NFS version.

**-V**, **--nfs-version** _ver_
> Enable NFS version.

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

Requires rpcbind. Firewall must allow NFS ports. NFSv4 uses single port (2049). Security through exports and Kerberos.

# HISTORY

NFS was developed at **Sun Microsystems** by a team led by **Russel Sandberg** in **1984**, becoming a foundational Unix network protocol.

# SEE ALSO

[exportfs](/man/exportfs)(8), [showmount](/man/showmount)(8), [mount.nfs](/man/mount.nfs)(8), [rpcbind](/man/rpcbind)(8)
