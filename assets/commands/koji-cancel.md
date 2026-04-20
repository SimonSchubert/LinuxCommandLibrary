# TAGLINE

cancels one or more active tasks running on the Koji build system

# TLDR

Cancel a **task by ID**

```koji cancel [task_id]```

Cancel **multiple tasks**

```koji cancel [task_id1] [task_id2]```

Cancel a **build** by NVR or build ID

```koji cancel [package-1.0-1.fc38]```

Cancel **entire task tree** (task and all descendants)

```koji cancel --full [task_id]```

**Force** cancellation on non-owned tasks (admin only)

```koji cancel --force [task_id]```

# SYNOPSIS

**koji cancel** [_options_] _task_id_ [_task_id_...]

# DESCRIPTION

**koji cancel** cancels one or more active tasks running on the Koji build system. Tasks must be in a cancelable state (pending or running) for this command to succeed.

# PARAMETERS

**task_id**
> Numeric task ID, or build NVR / build ID (can specify multiple).

**--justone**
> Cancel only the task itself, not its descendant subtasks.

**--full**
> Cancel the task and all of its descendants (full task tree).

**--force**
> Allow an admin to cancel a task owned by another user.

**-h, --help**
> Display help information.

# CAVEATS

Only tasks owned by the user or tasks the user has permission to cancel can be stopped. Completed tasks cannot be canceled.

# SEE ALSO

[koji](/man/koji)(1), [koji-build](/man/koji-build)(1)
