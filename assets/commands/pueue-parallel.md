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

**pueue parallel** [_options_] [_amount_]

# PARAMETERS

**amount**
> Number of parallel tasks (0 = unlimited).

**--group**, **-g** _name_
> Target specific group.

# DESCRIPTION

**pueue parallel** sets how many tasks can run simultaneously in the pueue task queue. This controls concurrency for the default or specified group.

# EXAMPLES

```bash
# Allow 4 parallel tasks
pueue parallel 4

# Sequential execution
pueue parallel 1

# Unlimited parallelism
pueue parallel 0

# Set for specific group
pueue parallel --group downloads 2

# Check current setting
pueue status
```

# USE CASES

```bash
# CPU-bound tasks (match cores)
pueue parallel $(nproc)

# I/O-bound tasks (more parallelism)
pueue parallel 10

# Memory-intensive (limit)
pueue parallel 2
```

# CAVEATS

Setting affects new task scheduling. Running tasks continue. 0 means no limit.

# HISTORY

pueue parallel is part of **pueue** by **Arne Beer**, providing task queue management with parallelism control.

# SEE ALSO

[pueue](/man/pueue)(1), [pueue-add](/man/pueue-add)(1), [pueue-group](/man/pueue-group)(1)
