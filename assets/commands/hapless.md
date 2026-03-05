# TAGLINE

Run and manage background processes

# TLDR

**Run a command in the background**

```hap run [command]```

**List all tracked processes**

```hap```

**Show status of a specific process**

```hap status [id]```

**Show logs of a process**

```hap logs [id]```

**Show live log output** of a process

```hap logs -f [id]```

**Pause a running process**

```hap pause [id]```

**Resume a paused process**

```hap resume [id]```

# SYNOPSIS

**hap** _command_ [_options_] [_arguments_]

# DESCRIPTION

**hapless** is a lightweight command-line utility for running and managing background processes. It wraps commands to track their status during and after execution, without requiring a daemon process or configuration files. Simply prefix any command with **hap run** to launch it in the background with automatic logging and status tracking.

The tool provides a convenient overview of all tracked processes with their current status, exit codes, and runtime. Logs for both stdout and stderr are automatically captured and can be reviewed at any time.

# PARAMETERS

**run** _command_
> Run a command in the background

**status** _id_
> Show status of a specific process

**logs** _id_
> Show logs of a process (-f for follow mode)

**pause** _id_
> Pause a running process

**resume** _id_
> Resume a paused process

**kill** _id_
> Terminate a process

**clean**
> Remove completed processes from the list

# CAVEATS

Does not persist across system reboots. Process tracking relies on PID files stored locally. Interactive commands that require terminal input are not supported in the background.

# HISTORY

**hapless** was created by **Misha Behersky** (bmwant) and is written in **Python**. It was designed to be a simpler alternative to tools like **screen**, **tmux**, or **nohup** for basic background process management, with the goal of requiring zero configuration.

# SEE ALSO

[nohup](/man/nohup)(1), [screen](/man/screen)(1), [tmux](/man/tmux)(1), [bg](/man/bg)(1)
