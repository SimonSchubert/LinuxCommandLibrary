# TAGLINE

removes System V IPC resources

# TLDR

Delete shared memory segment by **ID**

```ipcrm -m [shmem_id]```

Delete shared memory segment by **key**

```ipcrm -M [shmem_key]```

Delete message queue by **ID**

```ipcrm -q [queue_id]```

Delete message queue by **key**

```ipcrm -Q [queue_key]```

Delete semaphore by **ID**

```ipcrm -s [semaphore_id]```

Delete semaphore by **key**

```ipcrm -S [semaphore_key]```

Delete **all** IPC resources

```ipcrm -a```

# SYNOPSIS

**ipcrm** [_options_]

# PARAMETERS

**-m**, **--shmem-id** _ID_
> Remove shared memory segment by ID

**-M**, **--shmem-key** _KEY_
> Remove shared memory segment by key

**-q**, **--queue-id** _ID_
> Remove message queue by ID

**-Q**, **--queue-key** _KEY_
> Remove message queue by key

**-s**, **--semaphore-id** _ID_
> Remove semaphore set by ID

**-S**, **--semaphore-key** _KEY_
> Remove semaphore set by key

**-a**, **--all**
> Remove all IPC resources

# DESCRIPTION

**ipcrm** removes System V IPC resources (shared memory segments, message queues, and semaphores). Resources can be identified by either their numeric ID or key value.

Use ipcs to list existing resources and their IDs/keys before removal. Resources should be removed when no longer needed to free system resources.

# CAVEATS

Removing resources while processes are still using them can cause those processes to fail. Requires appropriate permissions (owner or root). The -a option removes all accessible resources.

# HISTORY

ipcrm has been part of Unix systems since System V IPC was introduced in the early **1980s**. It provides essential cleanup functionality for IPC resources that persist beyond process lifetime.

# SEE ALSO

[ipcs](/man/ipcs)(1), [ipcmk](/man/ipcmk)(1), [lsipc](/man/lsipc)(1)
