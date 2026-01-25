# TLDR

**View current exports**

```exportfs -v```

**Reload exports configuration**

```sudo exportfs -ra```

**Export directory temporarily**

```sudo exportfs -o [rw,sync] [client:/path]```

**Unexport directory**

```sudo exportfs -u [client:/path]```

# SYNOPSIS

**/etc/exports** - NFS exports configuration

**exportfs** [_options_] [_client:/path_]

# PARAMETERS

**exportfs -r**
> Re-export all directories.

**exportfs -a**
> Export all entries in /etc/exports.

**exportfs -u** _client:/path_
> Unexport directory.

**exportfs -v**
> Verbose; show current exports.

# EXPORTS FILE FORMAT

```
/path      client(options)
/home      192.168.1.0/24(rw,sync)
/data      *(ro,async)
/shared    @group(rw,no_root_squash)
```

# OPTIONS

**rw** / **ro**
> Read-write or read-only access.

**sync** / **async**
> Synchronous or asynchronous writes.

**no_root_squash**
> Don't map root to anonymous user.

**root_squash**
> Map root to anonymous user (default).

**all_squash**
> Map all users to anonymous.

**subtree_check** / **no_subtree_check**
> Subtree checking.

**secure** / **insecure**
> Require ports < 1024.

# DESCRIPTION

**/etc/exports** defines which directories are shared via NFS (Network File System). Each line specifies a path and which clients can access it with what options.

The **exportfs** command manages the export table at runtime, reading from /etc/exports and updating the kernel's export table without restarting NFS services.

# CAVEATS

Changes to /etc/exports require `exportfs -ra` to take effect. Security relies on IP-based access control by default. Consider Kerberos for authenticated NFS. Permission mapping between client and server must be considered.

# SEE ALSO

[nfs](/man/nfs)(5), [exportfs](/man/exportfs)(8), [nfsd](/man/nfsd)(8), [mountd](/man/mountd)(8)
