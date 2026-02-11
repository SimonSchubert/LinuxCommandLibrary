# TAGLINE

Manage Slurm cluster event triggers

# TLDR

**Register** a trigger for system events

```strigger --set --primary_slurmctld_failure -p [path/to/script]```

Register trigger for **job completion**

```strigger --set -j [job_id] -f -p "[path/to/script] [args]"```

**View** active triggers

```strigger --get```

View triggers for **specific job**

```strigger --get -j [job_id]```

**Clear** a trigger

```strigger --clear [trigger_id]```

Register **permanent** trigger

```strigger --set --down --flags=PERM -p [path/to/script]```

# SYNOPSIS

**strigger** **--set** [_OPTIONS_...]
**strigger** **--get** [_OPTIONS_...]
**strigger** **--clear** [_OPTIONS_...]

# PARAMETERS

**--set**
> Register a new trigger

**--get**
> Display registered triggers

**--clear**
> Remove a trigger

**-j, --jobid** _id_
> Target specific job

**--node** _name_
> Target specific node

**-p, --program** _path_
> Script to execute when trigger fires

**--offset** _seconds_
> Timing adjustment (negative = before event)

**--flags** _flags_
> Trigger flags (PERM = permanent)

**-u, --user** _name_
> Filter by trigger creator

**-v, --verbose**
> Detailed output

**-q, --quiet**
> Suppress non-critical errors

# EVENT TYPES

**Node events**: --down, --up, --drained, --draining, --idle, --fail
**Job events**: --fini, --time
**System events**: --primary_slurmctld_failure, --primary_slurmdbd_failure, --reconfig

# DESCRIPTION

**strigger** manages event triggers in Slurm that automatically execute scripts when specific events occur. Triggers can respond to node state changes, job completions, system failures, and other cluster events. The daemon checks triggers approximately every 15 seconds.

Triggered programs execute on the slurmctld node with a 5-minute timeout. By default, triggers are removed after execution unless marked permanent with **--flags=PERM**.

# CAVEATS

Only SlurmUser (typically root) can set triggers. Programs run on slurmctld node, not compute nodes. Triggers must be re-registered after execution unless permanent. Scripts must be executable and accessible from slurmctld host.

# HISTORY

**strigger** is part of **Slurm**, developed at **Lawrence Livermore National Laboratory** starting in **2002**. Event triggers allow automated responses to cluster events for monitoring, alerting, and workflow automation. Slurm is now maintained by **SchedMD**.

# SEE ALSO

[scontrol](/man/scontrol)(1), [slurmctld](/man/slurmctld)(8), [slurm.conf](/man/slurm.conf)(5)
