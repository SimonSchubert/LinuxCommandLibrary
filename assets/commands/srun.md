# TAGLINE

Run parallel jobs under Slurm

# TLDR

**Submit** a basic interactive job

```srun --pty /bin/bash```

**Submit** an interactive job with custom resources

```srun --ntasks-per-node [num_cores] --mem-per-cpu [memory_MB] --pty /bin/bash```

**Run** a job on a specific partition with a time limit

```srun -p [partition_name] -t [HH:MM:SS] [command]```

**Run** a job requesting GPUs

```srun --gpus=[num_gpus] --pty /bin/bash```

**Run** a parallel job with multiple tasks and CPUs per task

```srun -n [num_tasks] -c [cpus_per_task] [command]```

**Connect** to a worker node with a running job

```srun --jobid [job_id] --pty /bin/bash```

# SYNOPSIS

**srun** [_options_] _executable_ [_arguments_]

# PARAMETERS

**--pty**
> Execute in pseudo-terminal mode (for interactive use)

**--jobid _id_**
> Initiate a job step under an already allocated job

**-n, --ntasks _number_**
> Number of tasks to run

**--ntasks-per-node _ntasks_**
> Number of tasks to invoke on each node

**-c, --cpus-per-task _ncpus_**
> Number of CPUs allocated per task

**--mem _size[units]_**
> Memory required per node (default units: MB; supports K, M, G, T)

**--mem-per-cpu _size[units]_**
> Minimum memory required per usable allocated CPU

**-p, --partition _name_**
> Request specific partition for resource allocation

**-N, --nodes _min[-max]_**
> Number of nodes required (optionally a range)

**-t, --time _time_**
> Time limit for job (format: HH:MM:SS or days-HH:MM:SS)

**-J, --job-name _name_**
> Specify a name for the job

**-G, --gpus _[type:]number_**
> Total number of GPUs required for the job

**--gres _list_**
> Comma-delimited list of generic consumable resources (e.g., gpu:2)

**-w, --nodelist _node_list_**
> Request a specific list of hosts

**-x, --exclude _host_list_**
> Exclude specific hosts from the allocation

**-o, --output _filename_**
> Redirect standard output to specified file

**-e, --error _filename_**
> Redirect standard error to specified file

**-D, --chdir _path_**
> Change to specified directory before execution

**--exclusive**
> Job cannot share nodes with other running jobs

**--export _{ALL|NONE|variables}_**
> Control which environment variables are propagated to the job

**--mpi _type_**
> Identify the type of MPI to be used

# DESCRIPTION

**srun** submits a job for execution or initiates job steps in real time. For interactive work, it creates an interactive session on compute nodes. It can also be used within batch scripts to launch parallel tasks.

The command handles resource allocation automatically, requesting nodes from the scheduler and launching the specified program across allocated resources.

# CAVEATS

Interactive jobs (**--pty**) may wait in queue for resources. Resource requests must fit within partition limits. Connection to existing jobs requires appropriate permissions.

# SEE ALSO

[sbatch](/man/sbatch)(1), [squeue](/man/squeue)(1), [salloc](/man/salloc)(1), [scontrol](/man/scontrol)(1), [scancel](/man/scancel)(1), [sinfo](/man/sinfo)(1)
