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

Show the status of a **specific job**

```jobs %[1]```

Run a command with job specs **replaced by process IDs**

```jobs -x [kill -CONT] %[1]```

# SYNOPSIS

**jobs** [**-lnprs**] [_jobspec_ ...]

**jobs** **-x** _command_ [_args_]

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

**-x** _command_
> Replace each jobspec in command with the process group ID, then execute it

# DESCRIPTION

**jobs** is a shell builtin that displays the status of jobs started in the current shell session. Jobs are processes started with & (background) or suspended with Ctrl+Z.

Each job has a job number (shown in brackets) that can be used with fg, bg, and kill using the %n syntax. The + marks the current job and - the previous job. Other job specs include %+, %- and %_string_ for a job whose command starts with that string.

# CAVEATS

Shell builtin, so behavior varies between shells. POSIX specifies only **-l** and **-p**. **-n**, **-r**, **-s** and **-x** are extensions that vary by shell. Jobs belong to the current shell session and are not visible to other shells.

# HISTORY

Job control was first implemented in the C shell by **Jim Kulp** at IIASA in Austria, using features of the **4.1BSD** kernel, and was adopted by other shells including Bash.

# SEE ALSO

[fg](/man/fg)(1), [bg](/man/bg)(1), [disown](/man/disown)(1), [kill](/man/kill)(1), [wait](/man/wait)(1)
