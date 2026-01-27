# TLDR

**Run a workflow** from a Snakefile

```snakemake```

**Dry run** to show planned execution without running

```snakemake -n```

**Run with a specific number of cores**

```snakemake --cores [4]```

**Build a specific target**

```snakemake [target_file]```

**Show the execution plan** with shell commands

```snakemake -n -p```

**Generate a DAG visualization** of the workflow

```snakemake --dag | dot -Tpng > dag.png```

**Run with a specific Snakefile**

```snakemake --snakefile [path/to/Snakefile]```

**Force re-execution** of all rules

```snakemake --forceall```

# SYNOPSIS

**snakemake** [_options_] [_targets_]

# PARAMETERS

**-n**, **--dry-run**
> Show the execution plan without actually running any jobs.

**-p**, **--printshellcmds**
> Print shell commands that will be executed.

**--cores**, **-c** _N_
> Use at most N CPU cores in parallel. If N is omitted, uses all available cores.

**-s**, **--snakefile** _FILE_
> Specify the Snakefile. Default: Snakefile in current directory.

**-d**, **--directory** _DIR_
> Execute workflow in the specified directory.

**--forceall**, **-F**
> Force re-execution of all rules.

**--forcerun**, **-R** _rules_
> Force re-execution of specific rules.

**--until**, **-U** _rules_
> Run only until the specified rules.

**--dag**
> Output the directed acyclic graph of jobs in DOT format.

**--rulegraph**
> Output the dependency graph of rules in DOT format.

**--config** _key=value_
> Set or override config values.

**--configfile** _FILE_
> Specify a config file in YAML or JSON format.

**--profile** _PROFILE_
> Use a workflow profile for execution settings.

**--cluster** _CMD_
> Execute jobs on a cluster using the given submit command.

**--use-conda**
> Use conda environments defined in rules.

**--use-singularity**
> Use Singularity containers defined in rules.

**-q**, **--quiet**
> Suppress output except warnings and errors.

**--help**
> Display help information.

# DESCRIPTION

**Snakemake** is a workflow management system for creating reproducible and scalable data analyses. Workflows are defined using a Python-based domain-specific language in files called "Snakefiles" that describe rules for transforming input files into output files.

Snakemake automatically determines the execution order by building a directed acyclic graph (DAG) of jobs based on file dependencies. It only re-executes rules when input files are newer than outputs, avoiding redundant computations. Workflows can seamlessly scale from single workstations to clusters and cloud environments without modification.

The tool is particularly popular in bioinformatics and data science for its ability to handle complex pipelines with many interdependent steps. It supports conda environments, containers (Docker/Singularity), and various cluster execution backends.

# CAVEATS

Requires Python 3.7+. The Snakefile must be valid Python syntax. When using **--cores** without a number, all available cores are used which may impact system responsiveness. Cluster execution requires appropriate configuration for the target scheduler. Conda and container integration require those tools to be installed separately.

# HISTORY

**Snakemake** was created by Johannes Köster and first published in **2012** in the journal Bioinformatics. The name is a play on "make" (the build automation tool) and Python ("snake"). It was designed to address the reproducibility challenges in computational biology workflows. The project has grown significantly, with hundreds of citations per year and integration with major bioinformatics communities. Development continues actively with regular releases.

# SEE ALSO

[make](/man/make)(1), [nextflow](/man/nextflow)(1), [cwltool](/man/cwltool)(1), [dvc](/man/dvc)(1)
