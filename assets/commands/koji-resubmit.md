# TAGLINE

retries a cancelled or failed task using the same parameters as the original

# TLDR

**Resubmit** a failed task

```koji resubmit [task_id]```

Resubmit **without waiting**

```koji resubmit [task_id] --nowait```

**Wait** for the task, even when running in the background

```koji resubmit [task_id] --wait```

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

**--wait**
> Wait on the task, even if running in the background

**--nowait**, **--nowatch**
> Do not wait for task completion

**--quiet**
> Do not print task information

**-h, --help**
> Display help information

# CAVEATS

Only failed or cancelled top-level tasks can be resubmitted, and only by the task owner or an admin. Tasks that failed due to source issues will likely fail again without fixing the underlying problem.

# SEE ALSO

[koji](/man/koji)(1), [koji-cancel](/man/koji-cancel)(1), [koji-build](/man/koji-build)(1)

# RESOURCES

```[Source code](https://github.com/koji-project/koji)```

```[Homepage](https://koji.build)```

```[Documentation](https://docs.pagure.org/koji/)```

<!-- verified: 2026-11-09 -->
