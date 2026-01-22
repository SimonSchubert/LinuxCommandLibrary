# TLDR

**Submit** script with defaults

```qsub [script.sh]```

Set **walltime** limit

```qsub -l walltime=[1]:[30]:[00] [script.sh]```

Request **nodes and cores**

```qsub -l nodes=[2]:ppn=[4] [script.sh]```

Submit to specific **queue**

```qsub -q [queue_name] [script.sh]```

# SYNOPSIS

**qsub** [**-l** _resources_] [**-q** _queue_] [**-N** _name_] [**-o** _output_] _script_

# PARAMETERS

**-l _resource_=_value_**
> Request resource (walltime, nodes, mem, etc.)

**-q _queue_**
> Submit to specific queue

**-N _name_**
> Job name

**-o _path_**
> Standard output file path

**-e _path_**
> Standard error file path

**-j oe**
> Join stdout and stderr

**-M _email_**
> Email address for notifications

**-m _events_**
> Email on events (b=begin, e=end, a=abort)

# DESCRIPTION

**qsub** submits batch jobs to TORQUE or PBS (Portable Batch System) queue managers. It's used in high-performance computing clusters to schedule jobs for execution when resources become available.

Jobs are scripts that specify resource requirements and commands to execute. The queue manager allocates nodes, CPUs, and memory according to the request.

# CAVEATS

Resource limits vary by queue and cluster configuration. Jobs may wait in queue for available resources. Exceeding walltime kills the job. Environment variables may not be inherited.

# HISTORY

**qsub** originated with PBS (Portable Batch System) developed at NASA. TORQUE is an open-source derivative. Similar commands exist in Slurm (sbatch) and other job schedulers.

# SEE ALSO

[qstat](/man/qstat)(1), [qdel](/man/qdel)(1), [pbsnodes](/man/pbsnodes)(1), [sbatch](/man/sbatch)(1)
