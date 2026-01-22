# TLDR

Run command in new **network namespace**

```unshare -n command```

Run command in new **mount and PID** namespaces

```unshare -m --pid --fork command```

Run shell in **isolated network** namespace

```unshare -n /bin/bash```

Create new **user namespace** with root mapping

```unshare -r command```

Run in all **new namespaces**

```unshare --mount --uts --ipc --net --pid --fork command```

# SYNOPSIS

**unshare** [_options_] [_program_ [_arguments_]]

# DESCRIPTION

**unshare** creates new namespaces and then executes the specified program within them. If no program is specified, it runs the shell. Namespaces provide isolation for system resources.

# NAMESPACE OPTIONS

**-m, --mount[=file]**
> Create new mount namespace

**-u, --uts[=file]**
> Create new UTS (hostname) namespace

**-i, --ipc[=file]**
> Create new IPC namespace

**-n, --net[=file]**
> Create new network namespace

**-p, --pid[=file]**
> Create new PID namespace

**-U, --user[=file]**
> Create new user namespace

**-C, --cgroup[=file]**
> Create new cgroup namespace

**-T, --time[=file]**
> Create new time namespace

# PARAMETERS

**-f, --fork**
> Fork before executing (required for PID namespace)

**-r, --map-root-user**
> Map current user to root in user namespace

**--map-user=UID**
> Map to specified UID in user namespace

**--map-group=GID**
> Map to specified GID in user namespace

**-R, --root=DIR**
> Set root directory

**-w, --wd=DIR**
> Set working directory

**--propagation private|shared|slave|unchanged**
> Set mount propagation

**--mount-proc[=DIR]**
> Mount /proc in new mount namespace

**--keep-caps**
> Keep capabilities when switching user

# CAVEATS

PID namespaces require **--fork** or the first process becomes PID 1 and may have unexpected behavior. User namespaces require appropriate kernel support and may have security restrictions.

# HISTORY

**unshare** is part of **util-linux**. It uses the unshare(2) system call to create new namespaces, which are the foundation of container technologies like Docker.

# SEE ALSO

[nsenter](/man/nsenter)(1), [clone](/man/clone)(2), [namespaces](/man/namespaces)(7), [lsns](/man/lsns)(8)
