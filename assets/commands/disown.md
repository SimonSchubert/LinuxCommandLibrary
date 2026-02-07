# TAGLINE

remove jobs from shell job table

# TLDR

**Disown the most recent** background job

```disown```

**Disown a specific job** by job spec

```disown %[1]```

**Disown all background** jobs

```disown -a```

**Disown running jobs** only

```disown -r```

**Disown and suppress** SIGHUP

```disown -h %[1]```

# SYNOPSIS

**disown** [_options_] [_jobspec_...]

# PARAMETERS

_JOBSPEC_
> Job specification (e.g., %1, %2) to disown.

**-a**
> Disown all jobs.

**-r**
> Disown only running jobs.

**-h**
> Mark jobs so they don't receive SIGHUP on shell exit.

# DESCRIPTION

**disown** is a shell builtin that removes jobs from the shell's job table, preventing them from receiving the SIGHUP signal when the shell terminates. This allows background processes to continue running after logout.

Without arguments, disown affects the current job. Job specifications (like %1) can target specific jobs. The -h option keeps jobs in the table but marks them to not receive SIGHUP, useful when you want to monitor jobs but prevent termination.

disown is commonly used when a long-running process was started without nohup and needs to survive shell exit. It works with both bash and zsh shells.

# CAVEATS

Process must already be backgrounded before disown. Output may still go to terminal if not redirected. Cannot re-own a disowned job. Shell-specific implementation varies.

# HISTORY

disown is a shell builtin found in **bash**, **zsh**, and **ksh**. It complements the nohup command by providing a way to detach already-running jobs from the shell session.

# SEE ALSO

[nohup](/man/nohup)(1), [bg](/man/bg)(1), [fg](/man/fg)(1), [jobs](/man/jobs)(1)
