# TLDR

**Start rpcbind**

```sudo rpcbind```

**Start in foreground**

```sudo rpcbind -f```

**Debug mode**

```sudo rpcbind -d```

**Check status**

```rpcinfo -p```

# SYNOPSIS

**rpcbind** [_options_]

# PARAMETERS

**-d**
> Debug mode.

**-f**
> Foreground.

**-w**
> Warm start (restore state).

**-l**
> Logging.

**-h** _host_
> Bind to host.

**-i** _interface_
> Bind to interface.

# DESCRIPTION

**rpcbind** is the RPC port mapper daemon. It converts RPC program numbers to network addresses, enabling clients to find RPC services. Required for NFS and NIS.

Replacement for the older portmap daemon.

# EXAMPLES

```bash
# Start service
sudo systemctl start rpcbind

# Check registered programs
rpcinfo -p

# Check specific host
rpcinfo -p hostname

# List NFS services
rpcinfo -p | grep nfs

# Debug mode
sudo rpcbind -df
```

# RPC INFO

```bash
# List all registered programs
rpcinfo -p localhost

# Test specific program
rpcinfo -u localhost nfs

# Show statistics
rpcinfo -m
```

# CAVEATS

Required for NFS. Security concerns - limit access with firewall. Port 111 TCP/UDP.

# HISTORY

rpcbind replaces the older **portmap** from Sun RPC, providing improved security and IPv6 support.

# SEE ALSO

[rpcinfo](/man/rpcinfo)(8), [nfs](/man/nfs)(5), [mount.nfs](/man/mount.nfs)(8)
