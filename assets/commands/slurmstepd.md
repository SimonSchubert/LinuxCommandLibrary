# TLDR

Start the daemon (typically **invoked automatically**)

```slurmstepd```

# SYNOPSIS

**slurmstepd**

# DESCRIPTION

**slurmstepd** is the Slurm job step manager daemon. It is automatically spawned by **slurmd** when a job step launches and terminates when the job step completes. The daemon should not be manually invoked by users or administrators.

The daemon manages I/O streams (stdin, stdout, stderr) for job steps, tracks accounting information including CPU time, memory usage, and I/O statistics, and processes signals directed at job steps. Each job step within a multi-step job has its own slurmstepd process.

# SIGNALS

**SIGINT, SIGTERM, SIGQUIT**
> Trigger graceful shutdown

**SIGPROF**
> Log connection manager status (debug level info or higher)

**SIGTSTP, SIGPIPE, SIGUSR1, SIGUSR2, SIGALRM, SIGHUP**
> Explicitly ignored

# CAVEATS

Should never be manually started; it is spawned automatically by slurmd. Multiple slurmstepd processes may run simultaneously for multi-step jobs. Killing slurmstepd directly may leave job steps in inconsistent states; use **scancel** instead.

# HISTORY

**slurmstepd** is part of **Slurm** (Simple Linux Utility for Resource Management), developed at **Lawrence Livermore National Laboratory** starting in **2002**. The step daemon architecture allows efficient management of complex jobs with multiple steps, each with potentially different resource requirements. Slurm is maintained by **SchedMD**.

# SEE ALSO

[slurmd](/man/slurmd)(8), [srun](/man/srun)(1), [scancel](/man/scancel)(1), [sstat](/man/sstat)(1)
