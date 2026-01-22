# TLDR

**Submit** a basic interactive job

```srun --pty /bin/bash```

**Submit** an interactive job with custom resources

```srun --ntasks-per-node [num_cores] --mem-per-cpu [memory_MB] --pty /bin/bash```

**Connect** to a worker node with a running job

```srun --jobid [job_id] --pty /bin/bash```

# SYNOPSIS

**srun** [_options_] _executable_ [_arguments_]

# PARAMETERS

**--pty**
> Execute in pseudo-terminal mode (for interactive use)

**--jobid _id_**
> Connect to existing job allocation

**-n, --ntasks**
> Number of tasks to launch

**--ntasks-per-node**
> Number of tasks per node

**--mem-per-cpu _MB_**
> Memory required per CPU in MB

**-p, --partition _name_**
> Request specific partition

**-N, --nodes _count_**
> Number of nodes required

**-t, --time _time_**
> Time limit for job

**-J, --job-name _name_**
> Job name

# DESCRIPTION

**srun** submits a job for execution or initiates job steps in real time. For interactive work, it creates an interactive session on compute nodes. It can also be used within batch scripts to launch parallel tasks.

The command handles resource allocation automatically, requesting nodes from the scheduler and launching the specified program across allocated resources.

# CAVEATS

Interactive jobs (**--pty**) may wait in queue for resources. Resource requests must fit within partition limits. Connection to existing jobs requires appropriate permissions.

# SEE ALSO

[sbatch](/man/sbatch)(1), [squeue](/man/squeue)(1), [salloc](/man/salloc)(1), [scontrol](/man/scontrol)(1)
