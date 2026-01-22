# TLDR

Run command with **file lock**

```flock /tmp/lock.lock command```

Run with **non-blocking** lock (fail if locked)

```flock -n /tmp/lock.lock command```

Run with **timeout** of 10 seconds

```flock -w 10 /tmp/lock.lock command```

Run with **custom exit code** on lock failure

```flock -n -E 42 /tmp/lock.lock command```

Execute **shell command** with lock

```flock /tmp/lock.lock -c "command1 && command2"```

Use **shared** (read) lock

```flock -s /tmp/lock.lock command```

# SYNOPSIS

**flock** [_options_] _file_|_directory_ _command_ [_arguments_]

**flock** [_options_] _file_|_directory_ **-c** _command_

**flock** [_options_] _number_

# DESCRIPTION

**flock** manages file locks from shell scripts. It executes a command while holding a lock on a specified file or directory, creating the lock file if needed. By default, the command waits indefinitely for the lock to become available. This is useful for ensuring only one instance of a command runs at a time.

# PARAMETERS

**-c, --command**
> Execute a single command string via the shell

**-e, -x, --exclusive**
> Obtain an exclusive (write) lock (default)

**-s, --shared**
> Obtain a shared (read) lock

**-n, --nb, --nonblock**
> Fail immediately if the lock is not available

**-w, --wait, --timeout SECONDS**
> Fail if the lock is not acquired within specified seconds

**-o, --close**
> Close the file descriptor before executing the command

**-u, --unlock**
> Manually drop the lock

**-E, --conflict-exit-code NUM**
> Exit code when lock fails with -n or timeout (default: 1)

**-F, --no-fork**
> Do not fork before executing the command

**--verbose**
> Report how long the lock took to acquire

# CAVEATS

**flock** does not detect deadlock situations. File locking has limited support on certain network filesystems like NFS and CIFS. When the -n or -w option is used and the lock cannot be acquired, flock exits with the code specified by -E (default 1).

# HISTORY

**flock** is part of the **util-linux** package, providing shell-level access to the flock(2) system call.

# SEE ALSO

[flock](/man/flock)(2), [lockfile](/man/lockfile)(1)
