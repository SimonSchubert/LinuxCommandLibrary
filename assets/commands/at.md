# TAGLINE

Schedule commands to execute at a specified time

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

**at** [_-q queue_] [_-f file_] [_-mMlv_] _timespec_

**at** [_-q queue_] [_-f file_] [_-mMkv_] [_-t time_]

**at** _-c_ _job_ ...

**at** [_-rd_] _job_ ...

# DESCRIPTION

**at** executes commands at a specified time. Commands are read from standard input or a file and executed later. Results are sent to the user's mail. The **atd** daemon must be running for jobs to execute.

# PARAMETERS

**-f file**
> Read commands from file instead of standard input

**-l**
> List all queued jobs (alias for atq)

**-c job**
> Print (cat) the commands of the specified job to standard output

**-m**
> Send mail to the user when the job completes, even if there was no output

**-M**
> Never send mail to the user

**-q queue**
> Use the specified queue. A queue is a single letter (a-z, A-Z); queues with higher letters run with increased niceness. The "=" queue is reserved for currently running jobs.

**-t time**
> Run the job at the given time, in the format [[CC]YY]MMDDhhmm[.ss]

**-r job**, **-d job**
> Delete the specified job (alias for atrm)

**-b**
> Alias for batch

**-v**
> Show the time the job will be executed before reading it

# CONFIGURATION

**/etc/at.allow**
> If this file exists, only users listed in it can schedule jobs with at.

**/etc/at.deny**
> Users listed in this file are denied access to at. Ignored if at.allow exists.

# CAVEATS

Requires the **atd** daemon to be running. Time can be specified in various formats: HH:MM, midnight, noon, teatime (4pm), or relative times like "now + 5 minutes".

# HISTORY

Part of the traditional Unix job scheduling system, available since early Unix in the **1970s**. The modern Linux **at** package was mostly written by Thomas Koenig and has since been maintained by various Debian contributors.

# INSTALL

```apt: sudo apt install at```

```dnf: sudo dnf install at```

```pacman: sudo pacman -S at```

```apk: sudo apk add at```

```zypper: sudo zypper install at```

```nix: nix profile install nixpkgs#at```

<!-- packages: 2026-07-22 -->
# SEE ALSO

[atq](/man/atq)(1), [atrm](/man/atrm)(1), [cron](/man/cron)(8), [batch](/man/batch)(1)

# RESOURCES

```[Source code](https://salsa.debian.org/debian/at)```

<!-- verified: 2026-06-17 -->
