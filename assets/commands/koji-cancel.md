# TAGLINE

cancels one or more active tasks running on the Koji build system

# TLDR

Cancel a **task by ID**

```koji cancel [task_id]```

Cancel **multiple tasks**

```koji cancel [task_id1] [task_id2]```

Cancel with **verbose output**

```koji cancel --verbose [task_id]```

Display **help**

```koji cancel --help```

# SYNOPSIS

**koji cancel** [_options_] _task_id_ [_task_id_...]

# DESCRIPTION

**koji cancel** cancels one or more active tasks running on the Koji build system. Tasks must be in a cancelable state (pending or running) for this command to succeed.

# PARAMETERS

**task_id**
> The ID of the task to cancel (can specify multiple)

**--verbose**
> Show verbose output during cancellation

**--force**
> Force cancellation even if task appears complete

**-h, --help**
> Display help information

# CAVEATS

Only tasks owned by the user or tasks the user has permission to cancel can be stopped. Completed tasks cannot be canceled.

# SEE ALSO

[koji](/man/koji)(1), [koji-build](/man/koji-build)(1)
