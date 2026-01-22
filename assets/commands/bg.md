# TLDR

**Resume** stopped job in background

```bg```

**Resume** specific job

```bg [%1]```

# SYNOPSIS

**bg** [_job-spec_]

# DESCRIPTION

**bg** resumes suspended jobs in the background. It's a bash built-in command that continues execution of jobs that were stopped (typically with Ctrl+Z) while allowing continued use of the terminal.

The command is part of bash job control functionality.

# PARAMETERS

_job-spec_
> Job identifier (%1, %2, etc.)

If no job specified, bg operates on the most recently stopped job.

# JOB SPECIFICATIONS

**%n**
> Job number n

**%string**
> Job whose command begins with string

**%?string**
> Job whose command contains string

**%%** or **%+**
> Current job

**%-**
> Previous job

# WORKFLOW

```bash
# Start long-running command
./long_process

# Suspend with Ctrl+Z
[Ctrl+Z]

# Resume in background
bg

# Or resume specific job
bg %1

# List jobs
jobs

# Bring to foreground
fg %1
```

# CAVEATS

Only works with job control enabled shells. Backgrounded jobs may stop if they try to read from terminal. Output still goes to terminal unless redirected. Jobs terminate when shell exits unless using nohup or disown.

# HISTORY

**bg** has been part of job control in Unix shells since the C shell (csh) introduced the feature in the late **1970s**.

# SEE ALSO

[fg](/man/fg)(1), [jobs](/man/jobs)(1), [disown](/man/disown)(1)
