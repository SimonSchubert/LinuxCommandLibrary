# TAGLINE

displays information about System V IPC facilities including shared memory

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

# INSTALL

```apt: sudo apt install util-linux```

```dnf: sudo dnf install util-linux```

```pacman: sudo pacman -S util-linux```

```apk: sudo apk add util-linux-misc```

```zypper: sudo zypper install util-linux```

```brew: brew install util-linux```

```nix: nix profile install nixpkgs#util-linux```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[ipcs](/man/ipcs)(1), [ipcrm](/man/ipcrm)(1), [ipcmk](/man/ipcmk)(1)
