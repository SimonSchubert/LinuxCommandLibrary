# TLDR

**Run pipeline**

```nextflow run [pipeline.nf]```

**Run with parameters**

```nextflow run [pipeline.nf] --input [data.txt]```

**Run from GitHub**

```nextflow run [user/repo]```

**Resume failed run**

```nextflow run [pipeline.nf] -resume```

**Run with Docker**

```nextflow run [pipeline.nf] -with-docker```

**Show pipeline info**

```nextflow info [pipeline]```

**List runs**

```nextflow log```

# SYNOPSIS

**nextflow** [_command_] [_options_]

# PARAMETERS

_COMMAND_
> Nextflow command.

**run** _PIPELINE_
> Execute pipeline.

**-resume**
> Resume from checkpoint.

**-with-docker**
> Run in Docker containers.

**info**
> Show pipeline info.

**log**
> Show execution history.

**--help**
> Display help information.

# DESCRIPTION

**nextflow** is a workflow orchestration tool. It runs data-driven computational pipelines.

The tool handles parallel execution. Supports cloud and HPC deployments.

nextflow is scientific workflow manager.

# CAVEATS

Java-based. Requires Java 11+. Bioinformatics focused but general purpose.

# HISTORY

Nextflow was created at **CRG Barcelona** for scalable, reproducible scientific workflows.

# SEE ALSO

[snakemake](/man/snakemake)(1), [cwl-runner](/man/cwl-runner)(1), [luigi](/man/luigi)(1)

