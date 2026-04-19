# TAGLINE

Set pueue task concurrency level

# TLDR

**Set parallel tasks**

```pueue parallel [4]```

**Set for specific group**

```pueue parallel --group [group_name] [2]```

**Unlimited parallel**

```pueue parallel 0```

**Single task at a time**

```pueue parallel 1```

# SYNOPSIS

**pueue parallel** [**-g** _group_] [_amount_]

# PARAMETERS

_amount_
> Number of tasks allowed to run in parallel in the target group. A value of **0** means unlimited. Omit _amount_ to query the current value.

**-g**, **--group** _NAME_
> Apply the setting to the named group instead of the **default** group.

# DESCRIPTION

**pueue parallel** sets how many tasks can run simultaneously in a pueue group. Each group has its own independent parallelism limit. If no _amount_ is given, pueue prints the group's current value.

Changes only affect scheduling of new tasks — already-running tasks are never stopped when the limit is lowered.

# CAVEATS

Setting 0 disables the concurrency limit entirely. Use **pueue group** to list groups and **pueue status** to view current limits.

# HISTORY

pueue parallel is part of **pueue** by **Arne Beer**, providing task queue management with parallelism control.

# SEE ALSO

[pueue](/man/pueue)(1), [pueue-add](/man/pueue-add)(1), [pueue-group](/man/pueue-group)(1), [pueue-status](/man/pueue-status)(1)
