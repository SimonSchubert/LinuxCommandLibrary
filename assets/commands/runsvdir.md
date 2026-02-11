# TAGLINE

Start and monitor runit service directory

# TLDR

**Start supervising services**

```runsvdir [/etc/service]```

**With logging**

```runsvdir -P [/etc/service] log```

**Set scan interval**

```SVDIR=[/etc/service] runsvdir```

# SYNOPSIS

**runsvdir** [_-P_] _dir_ [_log_]

# PARAMETERS

**-P**
> Set child process group.

_dir_
> Service directory.

_log_
> Log command.

# DESCRIPTION

**runsvdir** supervises a directory of services. It starts runsv for each subdirectory.

Scanning detects new and removed services. Services appear/disappear dynamically.

Each subdirectory becomes a supervised service. The directory must contain a run script.

Symlinks work for service enabling. Point from service directory to actual service.

The -P flag sets process groups. Enables signal delivery to all service processes.

# SERVICE MANAGEMENT

- Create symlink in dir: service starts
- Remove symlink: service stops
- sv command controls individual services

# CONFIGURATION

**SVDIR**
> Environment variable specifying the service directory path, used as the default when no directory argument is given.

# CAVEATS

Usually started by runit init. Continuous scanning uses resources. Permissions must be correct.

# HISTORY

**runsvdir** is the service directory supervisor in **runit**. It watches for service directories and manages runsv processes for each.

# SEE ALSO

[runit](/man/runit)(8), [runsv](/man/runsv)(8), [sv](/man/sv)(8), [runsvchdir](/man/runsvchdir)(8)
