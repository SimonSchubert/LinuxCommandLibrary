# TAGLINE

Attach to a running Slurm job step

# TLDR

**Attach** to a job step

```sattach jobid.stepid```

Attach with **input filter** for specific task

```sattach --input-filter 0 jobid.stepid```

Attach with **output filter** for specific task

```sattach --output-filter 0 jobid.stepid```

Attach with **error filter** for specific task

```sattach --error-filter 0 jobid.stepid```

# SYNOPSIS

**sattach** [_options_] _jobid.stepid_

# DESCRIPTION

**sattach** attaches to a Slurm job step's input/output streams, allowing you to interact with a running job. It redirects the stdout, stderr, and stdin of a Slurm job step to the current terminal.

# PARAMETERS

**jobid.stepid**
> The job ID and step ID to attach to (format: jobid.stepid)

**--input-filter TASK**
> Use the current console's input as stdin to the specified task

**--output-filter TASK**
> Only redirect stdout of the specified task

**--error-filter TASK**
> Only redirect stderr of the specified task

**-l, --label**
> Prepend task number to lines of output

**-Q, --quiet**
> Suppress informational messages

**-v, --verbose**
> Increase verbosity of messages

# CAVEATS

Only the job owner can attach to a job step. The job must be in a running state. Not all MPI implementations support attachment.

# HISTORY

**sattach** is part of the **Slurm** workload manager, providing job scheduling and resource management for HPC clusters.

# SEE ALSO

[srun](/man/srun)(1), [sbatch](/man/sbatch)(1), [squeue](/man/squeue)(1), [scontrol](/man/scontrol)(1)
