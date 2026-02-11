# TAGLINE

Wait for background processes to complete

# TLDR

**Wait for all background jobs** to complete

```wait```

**Wait for a specific job** by PID

```wait [pid]```

**Wait for multiple PIDs**

```wait [pid1] [pid2]```

**Wait for a job** by job spec

```wait %1```

**Get exit status** of waited process

```command & wait $!; echo "Exit status: $?"```

# SYNOPSIS

**wait** [_pid_|_jobspec_...]

# PARAMETERS

_pid_
> Process ID to wait for

_jobspec_
> Job specification (e.g., %1, %+, %-)

Without arguments, wait for all background processes.

# DESCRIPTION

**wait** is a shell builtin that pauses execution until specified background processes complete. It returns the exit status of the waited-for process.

When given a PID, wait blocks until that process terminates. With a job specification (%1, %2, etc.), it waits for that specific job. Without arguments, it waits for all child processes.

This is essential for scripts that spawn background processes and need to synchronize their completion or check their exit status.

The special variable **$!** contains the PID of the last background process, commonly used with wait: **command & pid=$!; wait $pid**

# EXAMPLES

```bash
# Run commands in parallel, then wait
command1 &
command2 &
command3 &
wait  # Wait for all three

# Wait and check exit status
long_task &
pid=$!
wait $pid
if [ $? -eq 0 ]; then
    echo "Success"
fi
```

# CAVEATS

Wait only works with child processes of the current shell. You cannot wait for arbitrary processes started by other shells or users.

In bash, **wait -n** (wait for any single job) is useful for processing results as jobs complete, but this option isn't available in all shells.

Exit status is only available immediately after wait returns. Calling wait again on the same PID may return different results.

# SEE ALSO

[jobs](/man/jobs)(1), [bg](/man/bg)(1), [fg](/man/fg)(1), [kill](/man/kill)(1), [bash](/man/bash)(1)
