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

**showmount** queries NFS mount information. It shows exported filesystems and current mounts.

Export listing shows available shares. Includes access permissions and allowed hosts.

Directory listing shows what's mounted. Currently active NFS mounts displayed.

All mounts shows host and directory pairs. Useful for auditing NFS usage.

Without host, queries localhost. Shows local NFS server configuration.

# CAVEATS

Requires rpcbind/portmapper. Firewalls may block queries. NFSv4 may not report all info.

# HISTORY

**showmount** is part of NFS utilities dating to original NFS implementations. It provides essential information for NFS administration.

# SEE ALSO

[mount](/man/mount)(8), [exports](/man/exports)(5), [nfsd](/man/nfsd)(8)
