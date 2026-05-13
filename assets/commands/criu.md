# TAGLINE

Checkpoint and restore running processes in userspace

# TLDR

**Check** that the kernel supports checkpoint/restore

```criu check```

**Checkpoint** a running process tree into an image directory

```sudo criu dump -t [pid] -D [path/to/image_dir] --shell-job```

**Checkpoint** a process while leaving it running, including TCP sockets

```sudo criu dump -t [pid] -D [path/to/image_dir] --tcp-established --leave-running```

**Restore** a process tree from an image directory

```sudo criu restore -D [path/to/image_dir] --shell-job```

**Restore** detached (do not become the parent of the restored tree)

```sudo criu restore -D [path/to/image_dir] -d```

**Serve memory pages** over the network for live migration

```sudo criu page-server -D [path/to/image_dir] --port [1234]```

# SYNOPSIS

**criu** _command_ [_option_ ...]

# PARAMETERS

**-t**, **--tree** _pid_
> PID of the root task to dump.

**-D**, **--images-dir** _dir_
> Directory where image files are stored or read from.

**-W**, **--work-dir** _dir_
> Directory for log and working files (defaults to the images directory).

**-v**[_n_], **--verbosity**
> Set verbosity level (repeatable).

**-R**, **--leave-running**
> Leave the task running after a successful dump.

**-s**, **--leave-stopped**
> Leave the tasks stopped after dump (useful for live migration).

**--tcp-established**
> Checkpoint and restore established TCP connections.

**--shell-job**
> Allow checkpoint/restore of shell jobs (controlling terminal handling).

**--manage-cgroups**
> Save and restore cgroup configuration with the process.

**-d**, **--restore-detached**
> Detach from the restored process tree on success.

**--display-stats**
> Print dump or restore statistics on completion.

# DESCRIPTION

**criu** ("Checkpoint and Restore In Userspace") freezes a running Linux application — or an entire container — and serializes its complete state to a set of image files. Memory, open file descriptors, pipes, sockets, namespaces, and cgroup membership are all captured. A later **criu restore** recreates equivalent processes from those images, optionally on a different host, so the application resumes execution where it left off.

The bulk of the work happens in userspace. CRIU seizes a process tree via **ptrace**, injects a small "parasite" code module (libcompel) to read the process's address space, and writes everything out to the configured image directory. Restore reverses the procedure: it rebuilds namespaces, recreates file descriptors, maps memory, and finally returns control to the original program counter.

CRIU is the foundation for live migration in **OpenVZ**, **LXC/LXD**, and **Podman**, and is used by **runc** and **Kubernetes** to snapshot and migrate containers. It also enables faster cold starts by warming up an application and resuming from the checkpoint on demand.

# CAVEATS

CRIU is Linux-only and typically requires **CAP_SYS_ADMIN** (root). Not every kernel resource is checkpointable: GPU contexts, some netfilter state, and certain external resources may need plugins or are unsupported. Restoring a process generally needs the same PID available, which usually means restoring inside a fresh PID namespace. Always run **criu check** first to confirm that your kernel exposes the required interfaces.

# HISTORY

CRIU was started in **2011** by **Pavel Emelyanov** of the OpenVZ / Virtuozzo team, with the first public release in **July 2012**. By Linux kernel **3.11** (September 2013) the required syscalls and interfaces had been merged upstream, allowing CRIU to run on stock kernels. It is now maintained by the **checkpoint-restore** community on GitHub and continues to receive regular releases.

# SEE ALSO

[runc](/man/runc)(8), [ptrace](/man/ptrace)(2), [setns](/man/setns)(2), [lxc-checkpoint](/man/lxc-checkpoint)(1)
