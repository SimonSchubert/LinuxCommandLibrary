# TAGLINE

runs commands with file locking

# TLDR

**Run with lock**

```lckdo [/var/lock/mylock] [command]```

**Wait for lock**

```lckdo -W [lockfile] [command]```

**Fail if locked**

```lckdo -n [lockfile] [command]```

**With timeout**

```lckdo -w [10] [lockfile] [command]```

# SYNOPSIS

**lckdo** [_options_] _lockfile_ _command_

# PARAMETERS

_LOCKFILE_
> Lock file path.

_COMMAND_
> Command to execute.

**-n**
> Non-blocking (fail if locked).

**-W**
> Wait forever for lock.

**-w** _SECONDS_
> Wait timeout.

**--help**
> Display help information.

# DESCRIPTION

**lckdo** executes a command while holding an exclusive file lock, ensuring that only one instance of the command runs at a time. This is particularly valuable for cron jobs and scheduled tasks where overlapping executions could cause data corruption or resource contention.

The tool acquires an exclusive lock on the specified lock file before running the command, and releases it when the command completes. By default it waits for the lock to become available, but you can use -n to fail immediately if the lock is held, or -w to set a timeout. Note that lckdo is deprecated in favor of `flock`, which provides the same functionality and is available as part of the standard util-linux package.

# CAVEATS

Deprecated in favor of flock. Part of moreutils. Lock file must be writable.

# HISTORY

lckdo was part of **moreutils** for running commands under file locks, now replaced by flock.

# SEE ALSO

[flock](/man/flock)(1), [lockfile](/man/lockfile)(1), [chronic](/man/chronic)(1)
