# TAGLINE

Submit batch jobs to IBM Spectrum LSF

# TLDR

**Submit** a script file as a job

```bsub [path/to/script.sh]```

Submit a job to a **specific queue**

```bsub -q [queue_name] make all```

Submit a job with **name and output redirection**

```bsub -J [job_name] --output [path/to/output.log] --error [path/to/error.log] [path/to/script.sh]```

Request **CPU cores and memory**

```bsub -n 8 -M 16G cargo build --release```

Run an **interactive shell**

```bsub -I bash```

Submit with a **runtime limit**

```bsub -W 45 [path/to/script.sh]```

# SYNOPSIS

**bsub** [_options_] _command_ [_arguments_]

# DESCRIPTION

**bsub** submits batch jobs to IBM Spectrum LSF (Load Sharing Facility), a workload management platform for distributed HPC environments. It schedules jobs to run on cluster nodes based on resource requirements and availability.

Jobs can be commands, scripts, or interactive sessions. The scheduler matches job requirements with available resources.

# PARAMETERS

**-q** _queue_
> Submit to a specific queue

**-J** _name_
> Assign a name to the job

**-n** _cores_
> Number of CPU cores required

**-M** _memory_
> Memory limit (e.g., 16G, 4096M)

**-W** _minutes_
> Runtime limit in minutes

**-I**
> Run interactively

**-o, --output** _file_
> Standard output file

**-e, --error** _file_
> Standard error file

**-R** _resource_
> Resource requirements string

# CAVEATS

Available queues and resource limits depend on cluster configuration. Jobs may wait in queue until resources become available. Interactive jobs (-I) hold the terminal until completion.

# SEE ALSO

[bjobs](/man/bjobs)(1), [bkill](/man/bkill)(1), [bhist](/man/bhist)(1), [slurm](/man/slurm)(1)
