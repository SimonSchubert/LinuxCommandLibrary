# TLDR

**Restart failed task**

```pueue restart [task_id]```

**Restart with new arguments**

```pueue restart --edit [task_id]```

**Restart all failed tasks**

```pueue restart --all-failed```

**Restart in place**

```pueue restart --in-place [task_id]```

# SYNOPSIS

**pueue** **restart** [_options_] _task_ids_...

# PARAMETERS

**--edit**
> Edit command before restart.

**--in-place**
> Restart in same task slot.

**--all-failed**
> Restart all failed tasks.

**--stashed**
> Restart as stashed.

**-g**, **--group** _name_
> Filter by group.

# DESCRIPTION

**pueue restart** re-queues failed or completed tasks for execution. Can modify the command before restarting. Useful for retrying failed operations with modifications.

# SEE ALSO

[pueue](/man/pueue)(1), [pueue-start](/man/pueue-start)(1)

