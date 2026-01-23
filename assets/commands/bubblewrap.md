# TLDR

**Run a command** in a minimal sandbox

```bwrap --ro-bind /usr /usr --symlink usr/lib64 /lib64 --proc /proc --dev /dev --unshare-pid [command]```

**Create isolated home directory**

```bwrap --ro-bind / / --bind [/tmp/fakehome] /home/user --unshare-all [command]```

**Run with network isolation**

```bwrap --ro-bind /usr /usr --unshare-net [command]```

**Mount tmpfs** for temporary storage

```bwrap --ro-bind / / --tmpfs /tmp --unshare-all [command]```

**Bind mount current directory** read-write

```bwrap --ro-bind / / --bind $(pwd) $(pwd) --chdir $(pwd) [command]```

**Run as fake root** (user namespace)

```bwrap --ro-bind / / --unshare-user --uid 0 --gid 0 [command]```

# SYNOPSIS

**bwrap** [_options_] [**--**] _command_ [_arguments_]

# DESCRIPTION

**bubblewrap** (bwrap) is an unprivileged sandboxing tool that uses Linux namespaces to create isolated environments. Unlike traditional containers, it can run without root privileges by using user namespaces.

The tool creates a new mount namespace with only explicitly specified bindings from the host. This allows fine-grained control over what the sandboxed process can access. It can also isolate network, PID, IPC, and user namespaces.

Bubblewrap is used as the foundation for Flatpak's sandboxing and can be used directly for custom application isolation. It focuses on security and minimalism.

# PARAMETERS

**--ro-bind** _src_ _dest_
> Read-only bind mount from src to dest.

**--bind** _src_ _dest_
> Read-write bind mount.

**--dev-bind** _src_ _dest_
> Bind mount with device access.

**--tmpfs** _dest_
> Mount tmpfs at destination.

**--proc** _dest_
> Mount procfs at destination.

**--dev** _dest_
> Create new devtmpfs at destination.

**--symlink** _src_ _dest_
> Create symbolic link.

**--unshare-all**
> Unshare all possible namespaces.

**--unshare-user**
> Create new user namespace.

**--unshare-pid**
> Create new PID namespace.

**--unshare-net**
> Create new network namespace.

**--unshare-ipc**
> Create new IPC namespace.

**--uid** _uid_
> Set user ID in sandbox.

**--gid** _gid_
> Set group ID in sandbox.

**--chdir** _dir_
> Change to directory before running.

**--die-with-parent**
> Kill sandbox when parent exits.

**--new-session**
> Create new terminal session.

# CAVEATS

Requires kernel support for user namespaces (may be disabled on some systems). Not all system calls can be sandboxed without seccomp. Complex setups may require careful mount ordering. Some applications may not function correctly in restricted environments.

# HISTORY

**Bubblewrap** was created by **Alexander Larsson** at **Red Hat** in **2016** as a minimal, unprivileged sandboxing tool. It was extracted from the Flatpak project to provide a standalone sandboxing solution. The design focuses on being simple, secure, and usable without root privileges, making it suitable for desktop application isolation.

# SEE ALSO

[flatpak](/man/flatpak)(1), [unshare](/man/unshare)(1), [firejail](/man/firejail)(1), [namespaces](/man/namespaces)(7)
