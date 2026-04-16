# TAGLINE

Data-driven workflow orchestration for scalable scientific pipelines

# TLDR

**Run pipeline**

```nextflow run [pipeline.nf]```

**Run with parameters**

```nextflow run [pipeline.nf] --input [data.txt]```

**Run pipeline from GitHub**

```nextflow run [user/repo]```

**Resume failed run from checkpoint**

```nextflow run [pipeline.nf] -resume```

**Run with Docker containers**

```nextflow run [pipeline.nf] -with-docker```

**Run with a specific config profile**

```nextflow run [pipeline.nf] -profile [docker]```

**Generate execution report and timeline**

```nextflow run [pipeline.nf] -with-report -with-timeline```

**Show pipeline info**

```nextflow info [pipeline]```

**List previous runs**

```nextflow log```

**Clean up cached work directories**

```nextflow clean -f```

# SYNOPSIS

**nextflow** [_options_] _command_ [_arguments_]

# PARAMETERS

**run** _PIPELINE_
> Execute a pipeline project (local path, script, or GitHub repo).

**pull** _PROJECT_
> Download or update a remote project.

**info** [_PROJECT_]
> Show system or pipeline info.

**log**
> Show history of executions.

**clean**
> Clean up work directories from past executions.

**drop** _PROJECT_
> Delete a local project cache.

**list**
> List downloaded pipeline projects.

**-resume** [_SESSION_]
> Resume execution from cached results; optionally specify session ID.

**-with-docker** [_IMAGE_]
> Enable Docker container execution.

**-with-podman** [_IMAGE_]
> Enable Podman container execution.

**-with-singularity** [_IMAGE_]
> Enable Singularity container execution.

**-with-conda** [_ENV_]
> Enable Conda environment management.

**-profile** _NAME_
> Select a configuration profile defined in nextflow.config.

**-c** _FILE_, **-config** _FILE_
> Use an alternative configuration file.

**-params-file** _FILE_
> Load pipeline parameters from JSON/YAML file.

**-w** _DIR_, **-work-dir** _DIR_
> Directory for intermediate task files (default: ./work).

**-with-report** [_FILE_]
> Generate an HTML execution report.

**-with-timeline** [_FILE_]
> Generate a timeline HTML file.

**-with-trace** [_FILE_]
> Generate an execution trace file.

**-with-dag** [_FILE_]
> Generate a workflow DAG diagram.

**-bg**
> Run in background.

**-r** _REV_
> Use a specific Git revision/branch/tag.

**-h**, **-help**
> Display help information.

# DESCRIPTION

**nextflow** is a reactive workflow framework and DSL for writing data-intensive computational pipelines. It enables the rapid composition of parallel and distributed pipelines using isolated processes connected by dataflow channels.

Nextflow abstracts execution from pipeline logic, allowing the same workflow to run locally, on HPC clusters (SLURM, SGE, PBS, LSF), or on cloud platforms (AWS Batch, Azure Batch, Google Cloud, Kubernetes). It provides built-in support for containers (Docker, Singularity, Podman) and package managers (Conda), and uses content-addressable caching to enable safe resumption of failed runs.

# CAVEATS

Requires Java 11 or later. Workflow scripts use a Groovy-based DSL (DSL2 is the current standard). The **work** directory can grow large across runs; use `nextflow clean` to reclaim space. Pipelines pulled from GitHub are cached in `~/.nextflow/assets/`.

# HISTORY

Nextflow was created by **Paolo Di Tommaso** at the **Centre for Genomic Regulation (CRG)** in Barcelona, with initial public release in **2013**. It was designed for reproducible, scalable scientific workflows, initially in bioinformatics. The project is now maintained by **Seqera Labs** and underpins the **nf-core** community of curated pipelines.

# SEE ALSO

[snakemake](/man/snakemake)(1), [cwl-runner](/man/cwl-runner)(1), [luigi](/man/luigi)(1)

