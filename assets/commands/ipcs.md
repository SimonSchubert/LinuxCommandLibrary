# TLDR

Show **all** active IPC facilities

```ipcs```

Show active shared **memory** segments

```ipcs --shmems```

Show active message **queues**

```ipcs --queues```

Show active **semaphores**

```ipcs --semaphores```

Show details for **specific resource** by ID

```ipcs --shmems -i [resource_id]```

Show system **limits**

```ipcs -l```

Show **summary** of current usage

```ipcs -u```

Show **creator/owner** information

```ipcs -c```

Show **last access times**

```ipcs -t```

# SYNOPSIS

**ipcs** [_options_]

# PARAMETERS

**--shmems**
> Show shared memory segments

**--queues**
> Show message queues

**--semaphores**
> Show semaphore sets

**-i**, **--id** _ID_
> Show details for specific resource

**-l**, **--limits**
> Show system limits

**-u**, **--summary**
> Show usage summary

**-c**, **--creator**
> Show creator and owner UIDs/PIDs

**-p**, **--pid**
> Show PIDs of last operators

**-t**, **--time**
> Show last access times

**--human**
> Show sizes in human-readable format

# DESCRIPTION

**ipcs** displays information about System V IPC resources: shared memory segments, message queues, and semaphore arrays. It shows resource IDs, keys, owners, permissions, and sizes.

This is essential for monitoring IPC resource usage and identifying orphaned resources that should be cleaned up with ipcrm.

# CAVEATS

Only shows System V IPC, not POSIX IPC resources. User can only see resources they have permission to access (root sees all). Large numbers of resources may indicate a leak.

# HISTORY

ipcs has been a standard Unix utility since System V IPC was introduced in the early **1980s**. It remains the primary tool for inspecting System V IPC resources.

# SEE ALSO

[ipcmk](/man/ipcmk)(1), [ipcrm](/man/ipcrm)(1), [lsipc](/man/lsipc)(1)
