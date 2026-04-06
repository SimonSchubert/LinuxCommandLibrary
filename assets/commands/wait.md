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

**Wait for any single job** to complete (Bash 4.3+)

```wait -n```

**Wait for any job and store its PID** in a variable (Bash 5.1+)

```wait -n -p completed_pid [pid1] [pid2]```

**Get exit status** of waited process

```command & wait $!; echo "Exit status: $?"```

# SYNOPSIS

**wait** [**-fn**] [**-p** _varname_] [_pid_|_jobspec_ ...]

# PARAMETERS

_pid_
> Process ID to wait for.

_jobspec_
> Job specification (e.g., %1, %+, %-).

**-n**
> Wait for any single job from the specified list (or all background jobs if none listed) to complete, and return its exit status. Available since Bash 4.3.

**-f**
> Force wait for each process to actually terminate before returning, rather than returning when the job status changes (e.g., when stopped). Requires job control to be enabled.

**-p** _varname_
> Assign the PID or job ID of the completed job to the variable _varname_. Most useful with **-n** to identify which job finished. Available since Bash 5.1.

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

# Process jobs as they complete (Bash 4.3+)
job1 & job2 & job3 &
while wait -n; do
    echo "A job completed successfully"
done

# Identify which job finished (Bash 5.1+)
cmd1 & pids+=($!)
cmd2 & pids+=($!)
wait -n -p finished "${pids[@]}"
echo "PID $finished exited with status $?"
```

# CAVEATS

Wait only works with child processes of the current shell. You cannot wait for arbitrary processes started by other shells or users.

The **-n** option (wait for any single job) is a Bash extension not available in all POSIX shells. The **-p** option requires Bash 5.1 or later.

If no arguments are given and no child processes exist, wait returns 0. If a specified PID does not exist, wait returns 127.

# SEE ALSO

[jobs](/man/jobs)(1), [bg](/man/bg)(1), [fg](/man/fg)(1), [kill](/man/kill)(1), [bash](/man/bash)(1), [disown](/man/disown)(1)
