# TAGLINE

NetExec NFS protocol module

# TLDR

**Detect NFS servers and supported versions**

```nxc nfs [target]```

**List exported shares**

```nxc nfs [target] --shares```

**Recursively enumerate accessible shares** (default depth 3)

```nxc nfs [target] --enum-shares [5]```

**List files in a share**

```nxc nfs [target] --share [/export] --ls [/]```

**Print a remote file**

```nxc nfs [target] --share [/export] --cat [/path/to/file]```

**Download a file**

```nxc nfs [target] --share [/export] --get-file [remote_file] [local_file]```

**Upload a file**

```nxc nfs [target] --share [/export] --put-file [local_file] [remote_file]```

# SYNOPSIS

**nxc** **nfs** _target_ [_options_]

# PARAMETERS

_target_
> IP, hostname, CIDR range, IP range or file containing targets.

**--port** _port_
> NFS portmapper port (default 111).

**--nfs-timeout** _seconds_
> Connection timeout (default 5).

**--share** _share_
> Share to operate on for **--ls**, **--cat**, **--get-file** and **--put-file**.

**--shares**
> List NFS exports and their access permissions.

**--enum-shares** [_depth_]
> Authenticate and recursively enumerate exposed shares (default depth 3).

**--ls** [_path_]
> List files in the share (default **/**).

**--cat** _file_
> Display the contents of a file.

**--get-file** _remote_ _local_
> Download a remote file.

**--put-file** _local_ _remote_
> Upload a file (created with mode 777).

**--chmod** _permissions_ _file_
> Change permissions of a remote file.

# DESCRIPTION

**nxc nfs** is the NFS protocol module of NetExec. It queries the portmapper and mount daemon to find exports, checks which ones are readable or writable, and can browse, read, download and upload files. It also detects misconfigurations such as **no_root_squash** and exports that allow escaping to the root file system.

# CAVEATS

Only use against systems you are authorized to test. NFS access control relies on client IP and UID, so results depend on where you scan from. Uploads create world-writable files on the target.

# SEE ALSO

[nxc](/man/nxc)(1), [netexec](/man/netexec)(1), [showmount](/man/showmount)(8), [nfsstat](/man/nfsstat)(8)

# RESOURCES

```[Source code](https://github.com/Pennyw0rth/NetExec)```

```[Documentation](https://www.netexec.wiki/nfs-protocol/)```

<!-- verified: 2026-11-07 -->
