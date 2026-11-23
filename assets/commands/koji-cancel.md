# TAGLINE

cancels one or more active tasks running on the Koji build system

# TLDR

Cancel a **task by ID**

```koji cancel [task_id]```

Cancel **multiple tasks**

```koji cancel [task_id1] [task_id2]```

Cancel a **build** by NVR

```koji cancel [package-1.0-1.fc38]```

Cancel a task **without its subtasks**

```koji cancel --justone [task_id]```

Cancel the **entire task tree** the task belongs to (admin only)

```koji cancel --full [task_id]```

Full cancellation starting from a **subtask** (admin only)

```koji cancel --full --force [subtask_id]```

# SYNOPSIS

**koji cancel** [_options_] _task_id_|_build_ [_task_id_|_build_...]

# DESCRIPTION

**koji cancel** cancels one or more active tasks running on the Koji build system. Integer arguments are treated as task IDs, anything else is parsed as a build NVR (name-version-release). By default, canceling a task also cancels all of its subtasks; canceling a build cancels its build task and marks the build as canceled. Tasks must still be active (free, open, or assigned) for this command to succeed.

# PARAMETERS

**task_id** | **build**
> Numeric task ID or build NVR (can specify multiple).

**--justone**
> Do not cancel subtasks; only the given task is canceled.

**--full**
> Full cancellation (admin only): cancel the whole task tree starting from its top-level parent.

**--force**
> With **--full**, allow a subtask ID to be given instead of requiring the top-level task.

**-h, --help**
> Display help information.

# CAVEATS

Only tasks owned by the user or tasks the user has permission to cancel can be stopped (admins can cancel any task). Completed tasks cannot be canceled. **--justone** and **--full** apply to task IDs only, not to builds.

# SEE ALSO

[koji](/man/koji)(1), [koji-build](/man/koji-build)(1), [koji-resubmit](/man/koji-resubmit)(1)

# RESOURCES

```[Source code](https://forge.fedoraproject.org/koji/koji)```

```[Homepage](https://koji.build)```

<!-- verified: 2026-11-23 -->
