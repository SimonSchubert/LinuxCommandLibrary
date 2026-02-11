# TAGLINE

Submit batch jobs to the Slurm scheduler

# TLDR

**Submit** batch job

```sbatch [job.sh]```

Submit with **custom name**

```sbatch --job-name=[myjob] [job.sh]```

Set **time limit**

```sbatch --time=[00:30:00] [job.sh]```

Request **multiple nodes**

```sbatch --nodes=[3] [job.sh]```

# SYNOPSIS

**sbatch** [**--job-name** _name_] [**--time** _limit_] [**--nodes** _n_] [**--cpus-per-task** _n_] [_script_]

# PARAMETERS

**--job-name _name_**
> Job name

**--time _time_**
> Time limit (HH:MM:SS)

**--nodes _n_**
> Number of nodes

**--ntasks _n_**
> Number of tasks

**--cpus-per-task _n_**
> CPUs per task

**--mem _size_**
> Memory per node

**--partition _name_**
> Partition/queue to use

**--output _file_**
> Output file (%j for job ID)

**--error _file_**
> Error file

**--mail-type _type_**
> Email notifications (BEGIN, END, FAIL)

# DESCRIPTION

**sbatch** submits batch job scripts to the SLURM workload manager. Jobs are queued and executed when requested resources become available on the cluster.

Job scripts contain SLURM directives (lines starting with #SBATCH) specifying resource requirements, followed by commands to execute. SLURM handles job scheduling and resource allocation.

# CAVEATS

Resource requests affect queue wait time. Exceeding time limit kills job. Environment may differ from submission shell. Check partition limits with sinfo.

# HISTORY

**sbatch** is part of **SLURM** (Simple Linux Utility for Resource Management), developed at Lawrence Livermore National Laboratory. SLURM is now the most widely used HPC job scheduler.

# SEE ALSO

[squeue](/man/squeue)(1), [scancel](/man/scancel)(1), [sinfo](/man/sinfo)(1), [srun](/man/srun)(1)
