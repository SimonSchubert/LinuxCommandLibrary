# TAGLINE

runs a program with namespaces of another process

# TLDR

Run command in **all namespaces** of a process

```nsenter -t 1234 -a command```

Enter **mount namespace** of a process

```nsenter -t 1234 --mount command```

Enter **network namespace** of a process

```nsenter -t 1234 --net command```

Enter **PID namespace** of a process

```nsenter -t 1234 --pid command```

Enter **multiple namespaces** (UTS, time, IPC)

```nsenter -t 1234 -u -T -i -- command```

Enter namespace via **procfs reference**

```nsenter --net=/proc/1234/ns/net command```

# SYNOPSIS

**nsenter** [_options_] [_program_ [_arguments_]]

# DESCRIPTION

**nsenter** runs a program with namespaces of another process. It is particularly useful for entering Docker containers, debugging processes in different namespaces, or working with chroot jails. If no program is specified, it runs the default shell.

# PARAMETERS

**-t, --target pid**
> Specify source process for namespace contexts

**-a, --all**
> Enter all namespaces of the target process

**-m, --mount[=file]**
> Enter mount namespace

**-u, --uts[=file]**
> Enter UTS (hostname/domainname) namespace

**-i, --ipc[=file]**
> Enter IPC namespace

**-n, --net[=file]**
> Enter network namespace

**-p, --pid[=file]**
> Enter PID namespace

**-U, --user[=file]**
> Enter user namespace

**-C, --cgroup[=file]**
> Enter cgroup namespace

**-T, --time[=file]**
> Enter time namespace

**-S, --setuid uid**
> Set user ID in entered namespace

**-G, --setgid gid**
> Set group ID in entered namespace

**-F, --no-fork**
> Do not fork before executing the program

**-w, --wd[=directory]**
> Set working directory

**-r, --root[=directory]**
> Set root directory

# CAVEATS

Entering a PID namespace causes nsenter to fork by default. Use **--no-fork** to disable this behavior. Appropriate privileges are required to enter namespaces owned by other users.

# HISTORY

**nsenter** is part of the **util-linux** package. It uses the setns(2) system call introduced in Linux 3.0 to enter existing namespaces.

# SEE ALSO

[unshare](/man/unshare)(1), [clone](/man/clone)(2), [setns](/man/setns)(2), [namespaces](/man/namespaces)(7)
