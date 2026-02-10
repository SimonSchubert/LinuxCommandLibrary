# TAGLINE

displays statistics about NFS activity

# TLDR

**Show all NFS statistics**

```nfsstat```

**Show server statistics**

```nfsstat -s```

**Show client statistics**

```nfsstat -c```

**Show specific NFS version**

```nfsstat -3```

**Show RPC statistics**

```nfsstat -r```

**Show mounted filesystems**

```nfsstat -m```

**Zero statistics**

```sudo nfsstat -z```

# SYNOPSIS

**nfsstat** [_options_]

# PARAMETERS

**-s**, **--server**
> Server statistics only.

**-c**, **--client**
> Client statistics only.

**-n**, **--nfs**
> NFS statistics only.

**-r**, **--rpc**
> RPC statistics only.

**-2**, **-3**, **-4**
> NFS version (v2, v3, v4).

**-m**, **--mounts**
> Show mount information.

**-z**, **--zero**
> Zero statistics.

# DESCRIPTION

**nfsstat** displays statistics about NFS (Network File System) activity. It shows RPC and NFS statistics for both client and server operations.

Statistics include operation counts, errors, and cache performance.

# OUTPUT SECTIONS

```
Server RPC stats - Server RPC activity
Client RPC stats - Client RPC activity
Server NFS stats - NFS operations served
Client NFS stats - NFS operations made
```

# EXAMPLE OUTPUT

```
Server nfs v3:
null         getattr      setattr      lookup
1000         50000        1000         25000
```

# CAVEATS

Statistics reset on reboot. Requires NFS kernel modules. May need root for some options.

# HISTORY

nfsstat has been part of NFS tools since the early implementations at **Sun Microsystems** in the 1980s.

# SEE ALSO

[nfsd](/man/nfsd)(8), [mountstats](/man/mountstats)(8), [showmount](/man/showmount)(8), [rpcinfo](/man/rpcinfo)(8)
