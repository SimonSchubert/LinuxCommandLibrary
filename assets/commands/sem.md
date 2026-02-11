# TAGLINE

Counting semaphore for parallel job control

# TLDR

**Run a command** with default semaphore (mutex, one at a time)

```sem [command]```

**Run up to 4 jobs** in parallel with a named semaphore

```sem -j 4 --id [myid] [command]```

**Run command in foreground** and wait for completion

```sem --fg [command]```

**Wait for all commands** in a semaphore to complete

```sem --id [myid] --wait```

**Run jobs matching CPU core count** plus 2

```sem -j +2 [command]```

**Set a timeout** to acquire semaphore

```sem --semaphore-timeout [10] [command]```

**Parallel compression** of log files

```for i in *.log; do sem -j+0 gzip $i; done; sem --wait```

# SYNOPSIS

**sem** [**--fg**] [**--id** _id_] [**--semaphore-timeout** _secs_] [**-j** _num_] [**--wait**] _command_

# PARAMETERS

**--bg**
> Run command in background. This is the default behavior. sem will not wait for the command to complete before exiting.

**--fg**
> Run command in foreground. sem waits for the semaphore to be available, runs the command, waits for it to complete, then exits.

**-j** _N_
> Allow up to N commands to run in parallel. Default is 1 (mutex mode). Use **-j+N** to add N to CPU core count, **-j-N** to subtract, or **-jN%** to use N% of cores.

**--id** _name_, **--semaphorename** _name_
> Use name as the semaphore identifier. Default is the name of the controlling tty. Commands with the same id share the same semaphore.

**--semaphore-timeout** _secs_
> If secs > 0: force semaphore acquisition after timeout. If secs < 0: exit if semaphore not available within timeout.

**--wait**
> Wait for all commands in this semaphore to complete before exiting.

**--pipe**
> Pass standard input to the command.

**--help**
> Display help information.

**--version**
> Display version information.

# DESCRIPTION

**sem** is an alias for **GNU parallel --semaphore**. It acts as a counting semaphore for executing shell commands in parallel with controlled concurrency. When the maximum number of parallel jobs is reached, sem waits for one to complete before starting the next command.

sem is useful for limiting concurrent access to resources, parallelizing loops in shell scripts while preventing system overload, and implementing mutual exclusion for processes that cannot run simultaneously. The semaphore state is stored in **~/.parallel/semaphores/**.

Unlike GNU parallel, sem does not parse the command arguments for job construction; it simply executes the provided command when the semaphore permits.

# CAVEATS

The semaphore identifier defaults to the controlling tty, so commands run from different terminals will use different semaphores unless **--id** is specified. Stale semaphores may remain in **~/.parallel/semaphores/** if processes are killed abnormally. Requires Perl and several Perl modules (Getopt::Long, Symbol, Fcntl).

# HISTORY

**sem** is part of GNU Parallel, created and maintained by Ole Tange. GNU Parallel was first released in **2010** as a tool for executing jobs in parallel using multiple CPU cores. The semaphore functionality (sem) was included to provide a simple way to limit concurrent execution of shell commands. The project is developed under the GNU Project and continues active maintenance.

# SEE ALSO

[parallel](/man/parallel)(1), [xargs](/man/xargs)(1), [flock](/man/flock)(1), [nohup](/man/nohup)(1)
