# TAGLINE

Query NFS server export information

# TLDR

**Show exports**

```showmount -e [server]```

**Show mounted directories**

```showmount -d [server]```

**Show all mounts**

```showmount -a [server]```

**Show local exports**

```showmount -e```

**No header output**

```showmount --no-headers -e [server]```

# SYNOPSIS

**showmount** [_-e_] [_-d_] [_-a_] [_options_] [_host_]

# PARAMETERS

**-e**, **--exports**
> Show exports.

**-d**, **--directories**
> Show mounted directories.

**-a**, **--all**
> Show all mount points.

**--no-headers**
> Suppress headers.

**--version**
> Show version.

# DESCRIPTION

**showmount** queries an NFS server's mount daemon to display information about exported filesystems and active mounts. The **-e** option lists all exported directories along with their access permissions and allowed client hosts, which is the most common usage for discovering available NFS shares.

The **-d** option shows only directories that are currently mounted by clients, while **-a** displays all active mount points as host:directory pairs, useful for auditing NFS usage and identifying connected clients. Without a host argument, the command queries the local machine's NFS server.

# CAVEATS

Requires rpcbind/portmapper. Firewalls may block queries. NFSv4 may not report all info.

# HISTORY

**showmount** is part of NFS utilities dating to original NFS implementations. It provides essential information for NFS administration.

# SEE ALSO

[mount](/man/mount)(8), [exports](/man/exports)(5), [nfsd](/man/nfsd)(8)
