# TAGLINE

Manage pueue task execution groups

# TLDR

**List groups**

```pueue group```

**Create group**

```pueue group add [name]```

**Remove group**

```pueue group remove [name]```

**Set parallel tasks**

```pueue parallel [N] --group [name]```

# SYNOPSIS

**pueue group** [_subcommand_] [_options_]

# PARAMETERS

**add** _NAME_
> Create group.

**remove** _NAME_
> Delete group.

# DESCRIPTION

**pueue group** manages task execution groups, which allow organizing tasks into separate queues with independent parallelism settings. Groups can be created with **add** and removed with **remove**. Each group runs its tasks independently, so a CPU-bound group can be limited to one task while an I/O-bound group runs many in parallel.

# CAVEATS

Default group exists. Part of pueue.

# HISTORY

pueue group provides **task grouping** functionality.

# SEE ALSO

[pueue](/man/pueue)(1), [pueue-parallel](/man/pueue-parallel)(1)

