# TLDR

Show **all IPC** facilities

```lsipc```

Show **shared memory** segments

```lsipc --shmems```

Show **message queues**

```lsipc --queues```

Show **semaphore** sets

```lsipc --semaphores```

Show details for **specific ID**

```lsipc --shmems --id [resource_id]```

Output as **JSON**

```lsipc --json```

# SYNOPSIS

**lsipc** [_options_]

# DESCRIPTION

**lsipc** displays information about System V IPC (Inter-Process Communication) facilities including shared memory segments, message queues, and semaphore sets currently active on the system.

# PARAMETERS

**--shmems, -m**
> Show shared memory segments

**--queues, -q**
> Show message queues

**--semaphores, -s**
> Show semaphore sets

**-i, --id ID**
> Show details for specific resource ID

**-o, --output COLUMNS**
> Select output columns

**-J, --json**
> JSON output format

**-r, --raw**
> Raw output without formatting

**--notruncate**
> Don't truncate output

# SEE ALSO

[ipcs](/man/ipcs)(1), [ipcrm](/man/ipcrm)(1), [ipcmk](/man/ipcmk)(1)
