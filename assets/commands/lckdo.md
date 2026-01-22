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

**lckdo** runs commands with file locking. It prevents concurrent execution of the same task.

The tool is useful for cron jobs. It ensures only one instance runs at a time.

lckdo runs with exclusive lock.

# CAVEATS

Deprecated in favor of flock. Part of moreutils. Lock file must be writable.

# HISTORY

lckdo was part of **moreutils** for running commands under file locks, now replaced by flock.

# SEE ALSO

[flock](/man/flock)(1), [lockfile](/man/lockfile)(1), [chronic](/man/chronic)(1)
