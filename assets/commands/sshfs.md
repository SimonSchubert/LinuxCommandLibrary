# TLDR

**Mount a remote directory** over SSH

```sshfs [user]@[host]:[remote/path] [local/mountpoint]```

**Mount using a specific SSH port**

```sshfs [user]@[host]:[remote/path] [local/mountpoint] -p [2222]```

**Mount with SSH key authentication**

```sshfs -o IdentityFile=[~/.ssh/key] [user]@[host]:[path] [mountpoint]```

**Mount allowing other users** access to the mount

```sshfs -o allow_other [user]@[host]:[path] [mountpoint]```

**Unmount the remote filesystem**

```fusermount -u [mountpoint]```

**Mount with reconnection** on connection drop

```sshfs -o reconnect [user]@[host]:[path] [mountpoint]```

# SYNOPSIS

**sshfs** [_-o options_] [_user@_]_host_:[_dir_] _mountpoint_

# PARAMETERS

**-o** _options_
> Mount options (comma-separated)

**-p** _port_
> SSH port to connect to

**-C**
> Enable compression

**-F** _ssh_config_
> SSH config file to use

**-1**
> Use SSH protocol version 1

**-o IdentityFile=**_file_
> Path to SSH private key

**-o allow_other**
> Allow other users to access the mount

**-o allow_root**
> Allow root to access the mount

**-o reconnect**
> Reconnect to server on connection drop

**-o ServerAliveInterval=**_seconds_
> Send keepalive messages to prevent timeout

**-o StrictHostKeyChecking=no**
> Don't verify host key (use with caution)

**-o cache=yes**
> Enable caching (improves performance)

**-o kernel_cache**
> Enable kernel caching

**-f**
> Run in foreground (for debugging)

**-d**
> Debug mode

# DESCRIPTION

**sshfs** is a filesystem client based on FUSE (Filesystem in Userspace) that allows you to mount remote directories over an SSH connection. Once mounted, the remote filesystem can be accessed like any local directory, using standard file operations.

The tool uses the SSH protocol for secure data transfer, leveraging existing SSH configurations including authentication keys, proxy settings, and host configurations from **~/.ssh/config**. This makes it an excellent alternative to NFS or Samba for accessing remote files when SSH access is already available.

SSHFS is particularly useful for development workflows, allowing local editors and tools to work on remote files transparently. It handles disconnections gracefully and can automatically reconnect when network connectivity is restored.

# CAVEATS

Performance is slower than native filesystems or NFS due to SSH encryption overhead. The **allow_other** option requires **user_allow_other** to be set in **/etc/fuse.conf**. On macOS, requires macFUSE to be installed. Network latency directly impacts file operation speed. Large file transfers may be slower than **scp** or **rsync** due to the filesystem abstraction overhead.

# HISTORY

**sshfs** was created by **Miklos Szeredi** and first released in **2004** as one of the first FUSE-based filesystems. It demonstrated the power of userspace filesystems and became a model for many other FUSE implementations. The project has been actively maintained and widely adopted across Unix-like systems. On Linux, it became part of the standard FUSE toolkit, while macOS users rely on macFUSE (formerly OSXFUSE) for compatibility.

# SEE ALSO

[ssh](/man/ssh)(1), [fusermount](/man/fusermount)(1), [mount](/man/mount)(8), [scp](/man/scp)(1), [rsync](/man/rsync)(1)
