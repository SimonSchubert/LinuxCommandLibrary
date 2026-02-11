# TAGLINE

Alter process scheduling priority

# TLDR

**Set** the absolute priority of a running process

```renice --priority [3] -p [pid]```

**Increase** the priority of a running process (requires root)

```sudo renice --relative [-4] -p [pid]```

**Decrease** the priority of all processes owned by a user

```renice --relative [4] -u [user]```

**Set** the priority of all processes in a process group

```sudo renice [-5] -g [process_group]```

# SYNOPSIS

**renice** [**-n**] _priority_ [**-g**|**-p**|**-u**] _identifier_...

# PARAMETERS

**-n, --priority _priority_**
> Specify the scheduling priority to set

**--relative**
> Change priority relative to current value

**-p, --pid**
> Interpret arguments as process IDs (default)

**-u, --user**
> Interpret arguments as usernames or UIDs

**-g, --pgrp**
> Interpret arguments as process group IDs

# DESCRIPTION

**renice** alters the scheduling priority (niceness) of running processes. Niceness values range from **-20** (highest priority, most favorable to the process) to **19** (lowest priority, least favorable).

Regular users can only increase niceness (lower priority) of their own processes. The superuser can decrease niceness (raise priority) and modify any process.

# CAVEATS

Lowering niceness (increasing priority) requires root privileges. The actual scheduling effect depends on the system's scheduler and load. Setting extreme priorities can impact system responsiveness.

# HISTORY

The **renice** command originated in 4.0BSD and has been a standard Unix utility since. It complements the **nice** command, which sets priority when launching new processes.

# SEE ALSO

[nice](/man/nice)(1), [top](/man/top)(1), [ps](/man/ps)(1), [ionice](/man/ionice)(1)
