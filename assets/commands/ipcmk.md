# TAGLINE

creates System V IPC resources

# TLDR

Create a **shared memory** segment

```ipcmk -M [segment_size_in_bytes]```

Create a **semaphore** set

```ipcmk -S [element_size]```

Create a **message queue**

```ipcmk -Q```

Create shared memory with specific **permissions**

```ipcmk -M [segment_size] -p [0644]```

# SYNOPSIS

**ipcmk** [_options_]

# PARAMETERS

**-M**, **--shmem** _SIZE_
> Create shared memory segment of specified size in bytes

**-S**, **--semaphore** _COUNT_
> Create semaphore set with specified number of elements

**-Q**, **--queue**
> Create message queue

**-p**, **--mode** _MODE_
> Set permissions (octal, default 0644)

# DESCRIPTION

**ipcmk** creates System V IPC (Inter-Process Communication) resources. These resources allow processes to communicate and synchronize: shared memory enables direct data sharing, semaphores coordinate access to resources, and message queues enable asynchronous messaging.

Created resources are identified by a key and ID, which can be viewed with ipcs and removed with ipcrm. Resources persist until explicitly removed or system reboot.

# CAVEATS

System V IPC has kernel limits on the number and size of resources. Resources are not automatically cleaned up when creating processes exit. Modern applications often prefer POSIX IPC or other mechanisms.

# HISTORY

System V IPC was introduced in AT&T UNIX System V in the early **1980s**. While older than POSIX alternatives, it remains widely used and supported across Unix-like systems.

# SEE ALSO

[ipcs](/man/ipcs)(1), [ipcrm](/man/ipcrm)(1), [lsipc](/man/lsipc)(1)
