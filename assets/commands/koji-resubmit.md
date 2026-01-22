# TLDR

**Resubmit** a failed task

```koji resubmit [task_id]```

Resubmit **without waiting**

```koji resubmit [task_id] --nowait```

Resubmit in **quiet** mode

```koji resubmit [task_id] --quiet```

Display **help**

```koji resubmit --help```

# SYNOPSIS

**koji resubmit** [_options_] _task_id_

# DESCRIPTION

**koji resubmit** retries a cancelled or failed task using the same parameters as the original task. This is useful for transient failures such as network issues or temporary resource exhaustion.

# PARAMETERS

**task_id**
> The ID of the task to resubmit

**--nowait**
> Do not wait for task completion

**--quiet**
> Do not print task information

**-h, --help**
> Display help information

# CAVEATS

Only failed or cancelled tasks can be resubmitted. Tasks that failed due to source issues will likely fail again without fixing the underlying problem.

# SEE ALSO

[koji](/man/koji)(1), [koji-cancel](/man/koji-cancel)(1), [koji-build](/man/koji-build)(1)
