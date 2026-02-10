# TAGLINE

netExec NFS module

# TLDR

**Enumerate NFS shares**

```nxc nfs [target]```

**List shares with access**

```nxc nfs [target] --shares```

**Check read access**

```nxc nfs [target] --enum-shares```

**Scan multiple targets**

```nxc nfs [targets.txt]```

# SYNOPSIS

**nxc** **nfs** [_target_] [_options_]

# PARAMETERS

_TARGET_
> NFS server address.

**--shares**
> Enumerate NFS exports.

**--enum-shares**
> Detailed share enumeration.

**-p** _PORT_
> NFS port (default: 2049).

**--help**
> Display help information.

# DESCRIPTION

**nxc nfs** is the NetExec NFS module. Enumerates NFS server exports.

The tool identifies accessible shares. Part of NetExec suite.

# CAVEATS

Security tool. Authorized use only. Part of NetExec.

# HISTORY

nxc nfs provides **NFS enumeration** capabilities within the NetExec framework.

# SEE ALSO

[nxc](/man/nxc)(1), [showmount](/man/showmount)(1), [nfsstat](/man/nfsstat)(1)

