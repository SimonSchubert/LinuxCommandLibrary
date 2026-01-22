# TLDR

**Bring last job to** foreground

```fg```

**Bring specific job** to foreground

```fg %[1]```

**Resume by job** name

```fg %[vim]```

# SYNOPSIS

**fg** [_jobspec_]

# PARAMETERS

_JOBSPEC_
> Job identifier: %N, %string, %%, %+, %-.

**%N**
> Job number N.

**%STRING**
> Job whose command starts with string.

**%%** or **%+**
> Current job.

**%-**
> Previous job.

# DESCRIPTION

**fg** resumes a suspended or background job in the foreground. It's a shell builtin used with job control to manage processes started from the shell.

Jobs are typically suspended with Ctrl+Z or started in background with &. fg brings them back to interactive foreground execution. Without arguments, it resumes the most recent job.

fg works with the shell's job table, which tracks child processes for job control.

# CAVEATS

Only works in interactive shells with job control. Job numbers change as jobs complete. Background processes may have continued running.

# HISTORY

fg is part of **POSIX job control** introduced in the C shell and later adopted by Bourne shell derivatives. It enables managing multiple processes from a single terminal.

# SEE ALSO

[bg](/man/bg)(1), [jobs](/man/jobs)(1), [kill](/man/kill)(1)
