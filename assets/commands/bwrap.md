# TAGLINE

Create lightweight unprivileged sandboxes

# TLDR

Run a program in a **read-only environment**

```bwrap --ro-bind / / [/bin/bash]```

Give access to **devices, process info, and tmpfs**

```bwrap --dev-bind /dev /dev --proc /proc --ro-bind / / --tmpfs /tmp [/bin/bash]```

**Run with no network access**

```bwrap --unshare-net --ro-bind / / --dev /dev --proc /proc [/bin/bash]```

**Run isolated process** that dies when parent exits

```bwrap --unshare-all --die-with-parent --ro-bind / / --dev /dev --proc /proc [command]```

# SYNOPSIS

**bwrap** [_options_] _command_ [_arguments_]

# DESCRIPTION

**bwrap** (bubblewrap) creates lightweight sandboxes using Linux namespaces. It provides unprivileged containers for running applications with restricted access to the filesystem, network, and other system resources.

The tool is commonly used by Flatpak and other sandboxing systems to isolate applications from the host system.

# PARAMETERS

**--ro-bind** _src_ _dest_
> Bind mount source read-only at destination

**--bind** _src_ _dest_
> Bind mount source read-write at destination

**--dev-bind** _src_ _dest_
> Bind mount source with device access

**--proc** _dest_
> Mount procfs at destination

**--tmpfs** _dest_
> Mount tmpfs at destination

**--unshare-pid**
> Create new PID namespace

**--unshare-net**
> Create new network namespace

**--unshare-user**
> Create new user namespace

**--unshare-all**
> Unshare all available namespaces

**--unshare-ipc**
> Create new IPC namespace

**--unshare-uts**
> Create new UTS namespace

**--unshare-cgroup**
> Create new cgroup namespace

**--symlink** _SRC_ _DEST_
> Create a symbolic link

**--dev** _DEST_
> Mount new devtmpfs at destination

**--dir** _DEST_
> Create a directory

**--setenv** _VAR_ _VALUE_
> Set environment variable

**--unsetenv** _VAR_
> Remove environment variable

**--chdir** _DIR_
> Change working directory

**--hostname** _HOSTNAME_
> Set custom hostname (requires --unshare-uts)

**--die-with-parent**
> Kill sandbox when parent process dies

**--new-session**
> Create new terminal session via setsid()

**--cap-add** _CAP_
> Add Linux capability

**--cap-drop** _CAP_
> Drop Linux capability

**--seccomp** _FD_
> Load seccomp rules from file descriptor

# CAVEATS

Requires user namespaces to be enabled in the kernel. Not a complete security boundary; some attack vectors may still exist. Complex sandboxing requires careful bind mount configuration.

# SEE ALSO

[firejail](/man/firejail)(1), [flatpak](/man/flatpak)(1), [unshare](/man/unshare)(1)
