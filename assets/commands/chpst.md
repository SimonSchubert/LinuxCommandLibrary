# TLDR

**Run command as different user**

```chpst -u [user] [command]```

**Run with specific user and group**

```chpst -u [user:group] [command]```

**Limit memory usage**

```chpst -m [50000000] [command]```

**Set environment from directory**

```chpst -e [/etc/service/myapp/env] [command]```

**Change to directory before running**

```chpst -/ [/var/lib/app] [command]```

**Limit number of open files**

```chpst -o [1000] [command]```

**Set nice level**

```chpst -n [10] [command]```

# SYNOPSIS

**chpst** [_options_] _command_

# PARAMETERS

**-u** _user[:group]_
> Set UID and GID before running command.

**-e** _directory_
> Set environment variables from files in directory.

**-m** _bytes_
> Limit data segment, stack, and locked memory.

**-d** _bytes_
> Limit data segment size.

**-o** _n_
> Limit number of open file descriptors.

**-p** _n_
> Limit number of processes.

**-f** _bytes_
> Limit output file size.

**-c** _bytes_
> Limit core dump size.

**-n** _inc_
> Adjust nice level.

**-/** _dir_
> Change root directory (chroot).

**-l** _lock_
> Create exclusive lock file.

**-L** _lock_
> Wait for exclusive lock file.

**-v**
> Verbose output.

# DESCRIPTION

**chpst** (change process state) runs a command with modified process attributes. It is part of the **runit** service supervision suite and provides a standardized way to set user, limits, and environment for service processes.

The tool consolidates several common process modifications: changing user/group identity, setting resource limits, loading environment from files, and obtaining locks. This simplifies service run scripts that would otherwise need multiple commands.

Environment directories (used with **-e**) contain files named for environment variables, with file contents as values. This pattern is common in runit and daemontools service management.

# CAVEATS

Changing user requires root privileges. Resource limits are per-process; child processes inherit but have their own limits. The chroot option requires a complete root filesystem at the target. Lock files must be on a filesystem supporting locks.

# HISTORY

**chpst** was created by **Gerrit Pape** as part of **runit**, a Unix init scheme with service supervision, released in the early **2000s**. It was inspired by similar tools from **daemontools** (setuidgid, softlimit, envdir) but combines their functionality into a single command. The tool remains popular for its simplicity and is used beyond runit in various service management contexts.

# SEE ALSO

[runsv](/man/runsv)(8), [runsvdir](/man/runsvdir)(8), [sv](/man/sv)(8), [setuidgid](/man/setuidgid)(8)
