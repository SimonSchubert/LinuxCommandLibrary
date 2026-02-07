# TAGLINE

mailbox-style file locking utility

# TLDR

**Create a lockfile**

```dotlockfile [file.lock]```

**Create with retry**

```dotlockfile -r [5] [file.lock]```

**Remove a lockfile**

```dotlockfile -u [file.lock]```

**Lock with PID** checking

```dotlockfile -p [file.lock]```

**Try lock once** (no wait)

```dotlockfile -r [0] [file.lock]```

**Lock with timeout** in seconds

```dotlockfile -r [10] -l [file.lock]```

# SYNOPSIS

**dotlockfile** [_options_] _lockfile_

# PARAMETERS

_LOCKFILE_
> Path to lockfile to create/remove.

**-r** _RETRIES_
> Number of retries (0 = try once, -1 = infinite).

**-u**, **--unlock**
> Remove the lockfile.

**-p**, **--use-pid**
> Write PID to lockfile.

**-l**
> Lock (default action).

**-c**, **--check**
> Check if lock is stale.

**--help**
> Display help information.

# DESCRIPTION

**dotlockfile** creates lockfiles using the mailbox locking convention (name.lock). It provides atomic file locking for scripts and applications that need to serialize access to resources.

The tool handles retry logic, stale lock detection, and PID tracking. With -p, it writes the process ID to the lockfile enabling detection of dead lock holders.

dotlockfile is commonly used in shell scripts to prevent concurrent access to files or ensure only one instance of a script runs at a time.

# CAVEATS

Lockfiles on network filesystems may not be reliable. Must manually remove locks on script exit. Stale lock detection requires -p option. Not suitable for high-contention scenarios.

# HISTORY

dotlockfile implements the traditional Unix lockfile convention, widely used for mailbox locking. It's part of the **liblockfile** package providing standardized file locking utilities.

# SEE ALSO

[flock](/man/flock)(1), [lockfile](/man/lockfile)(1)
