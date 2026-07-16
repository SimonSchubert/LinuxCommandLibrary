# TAGLINE

bring job to foreground

# TLDR

**Resume** the current job in the foreground

```fg```

**Resume** job number 1

```fg %[1]```

**Resume** the job whose command starts with a string

```fg %[vim]```

**Resume** the job whose command contains a string

```fg %?[config]```

**Resume** the previous job

```fg %-```

# SYNOPSIS

**fg** [_jobspec_]

# PARAMETERS

_jobspec_
> The job to resume. Defaults to the current job when omitted.

**%N**
> Job number N.

**%string**
> The job whose command line starts with _string_.

**%?string**
> The job whose command line contains _string_.

**%%** or **%+**
> The current job: the one most recently suspended or backgrounded.

**%-**
> The previous job.

# DESCRIPTION

**fg** resumes a suspended or background job, brings it into the foreground and makes it the terminal's controlling process, so it receives your keystrokes and signals again. The shell waits for the job to finish or stop before printing another prompt.

Jobs reach the background either by suspending a running command with **Ctrl+Z**, or by starting it with a trailing **&**. **jobs** lists them with their numbers and status; **fg** picks one back up and **bg** restarts one in the background instead. With no argument, **fg** resumes the current job, the one marked **+** in the **jobs** output.

The **%** prefix is a job specification, not a process ID. It is interpreted by the shell against its own job table, which is why job numbers are meaningful only inside the shell that started them.

The exit status of **fg** is that of the resumed command, or non-zero if job control is disabled or the job does not exist.

# CAVEATS

**fg** requires job control, which is enabled by default in interactive shells but not in scripts. In a non-interactive shell it fails with "no job control"; **set -m** can enable it if the shell supports doing so.

Job numbers are reused as jobs finish, so a **%N** that was correct a moment ago can refer to a different job later. Prefer **%string** in anything you type from memory.

A backgrounded job keeps running and can still write to your terminal, interleaving its output with your prompt. A job stopped by **Ctrl+Z** is genuinely paused (**SIGTSTP**) and makes no progress until it is resumed.

If a background job tries to read from the terminal it is stopped with **SIGTTIN**, showing as "stopped (tty input)"; bring it forward with **fg** to let it read.

Jobs removed from the table with **disown** can no longer be reached by **fg**.

# HISTORY

Job control originated in the **C shell** at Berkeley around **1980**, and was later adopted by **ksh**, **bash** and other Bourne shell derivatives. **fg** is standardized by **POSIX** as part of the optional User Portability Utilities job control feature. It is necessarily a shell builtin, since only the shell knows its own job table.

# SEE ALSO

[bg](/man/bg)(1), [jobs](/man/jobs)(1), [disown](/man/disown)(1), [wait](/man/wait)(1), [kill](/man/kill)(1), [nohup](/man/nohup)(1), [bash](/man/bash)(1)

# RESOURCES

```[Documentation](https://www.gnu.org/software/bash/manual/bash.html#Job-Control-Builtins)```

<!-- verified: 2026-07-16 -->
