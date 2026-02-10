# TAGLINE

shell builtin that displays the status of jobs started in the current shell

# TLDR

View **jobs** spawned by current shell

```jobs```

List jobs with **process IDs**

```jobs -l```

Display jobs with **changed status**

```jobs -n```

Display only **process IDs**

```jobs -p```

Display **running** processes

```jobs -r```

Display **stopped** processes

```jobs -s```

# SYNOPSIS

**jobs** [_options_] [_jobspec_]

# PARAMETERS

**-l**
> List process IDs in addition to normal information

**-n**
> Display only jobs with status changed since last notification

**-p**
> Display only process IDs

**-r**
> Display only running jobs

**-s**
> Display only stopped jobs

# DESCRIPTION

**jobs** is a shell builtin that displays the status of jobs started in the current shell session. Jobs are processes started with & (background) or suspended with Ctrl+Z.

Each job has a job number (shown in brackets) that can be used with fg, bg, and kill commands using the %n syntax. The + indicates the current job, and - indicates the previous job.

# CAVEATS

Shell builtin - behavior may vary between shells. Options -n, -r, -s are Bash-specific. Jobs are specific to the current shell session and not visible to other shells.

# HISTORY

Job control was introduced in the C shell (csh) in the late **1970s** and adopted by other shells including Bash. It allows users to manage multiple processes within a single terminal session.

# SEE ALSO

[fg](/man/fg)(1), [bg](/man/bg)(1), [disown](/man/disown)(1), [kill](/man/kill)(1)
