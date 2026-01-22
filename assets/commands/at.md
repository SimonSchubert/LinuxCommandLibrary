# TLDR

Create commands interactively and execute them in **5 minutes**

```at now + 5 minutes```

Execute commands from stdin at a **specific time**

```echo "command" | at 1000```

Execute commands from a **file** at a specific time

```at -f [path/to/file] 9:30 PM Tue```

**List** all queued jobs

```at -l```

**View** a specified job

```at -c [job_number]```

**Remove** a job from the queue

```atrm [job_number]```

# SYNOPSIS

**at** [_-f file_] [_-l_] [_-c job_] [_-m_] [_-q queue_] _time_

# DESCRIPTION

**at** executes commands at a specified time. Commands are read from standard input or a file and executed later. Results are sent to the user's mail. The **atd** daemon must be running for jobs to execute.

# PARAMETERS

**-f file**
> Read commands from file instead of standard input

**-l**
> List all queued jobs (alias for atq)

**-c job**
> Print the commands of the specified job

**-m**
> Send mail to the user even if there was no output

**-q queue**
> Use the specified queue (a-z, A-Z)

**-d job**
> Delete a job (alias for atrm)

**-v**
> Show the time the job will be executed

# CAVEATS

Requires the **atd** daemon to be running. Time can be specified in various formats: HH:MM, midnight, noon, teatime (4pm), or relative times like "now + 5 minutes".

# HISTORY

Part of the traditional Unix job scheduling system. The **at** command has been available since early Unix systems in the **1970s**.

# SEE ALSO

[atq](/man/atq)(1), [atrm](/man/atrm)(1), [cron](/man/cron)(8), [batch](/man/batch)(1)
