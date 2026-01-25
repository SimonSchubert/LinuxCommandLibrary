# TLDR

**Run a CWL workflow**

```cwl-runner [workflow.cwl] [inputs.yml]```

**Run with specific input values**

```cwl-runner [workflow.cwl] --[input_name] [value]```

**Run with Docker disabled**

```cwl-runner --no-container [workflow.cwl] [inputs.yml]```

**Run with custom output directory**

```cwl-runner --outdir [/path/to/output] [workflow.cwl] [inputs.yml]```

**Validate a CWL document**

```cwl-runner --validate [workflow.cwl]```

**Run in parallel**

```cwl-runner --parallel [workflow.cwl] [inputs.yml]```

# SYNOPSIS

**cwl-runner** [_options_] _workflow.cwl_ [_inputs_]

# PARAMETERS

**--validate**
> Validate the CWL document without running.

**--outdir** _path_
> Output directory for results.

**--no-container**
> Disable Docker/container execution.

**--parallel**
> Run workflow steps in parallel.

**--cachedir** _path_
> Directory for caching intermediate results.

**--tmpdir-prefix** _path_
> Prefix for temporary directories.

**--debug**
> Enable debug output.

**--quiet**
> Only print warnings and errors.

**--strict**
> Strict validation mode.

**--leave-tmpdir**
> Don't delete temporary directories.

# DESCRIPTION

**cwl-runner** executes workflows defined in Common Workflow Language (CWL), a specification for describing analysis workflows in data-intensive sciences. CWL workflows are portable across different execution environments.

The runner takes a CWL document and input parameters, resolves dependencies, and executes tools in the correct order. Steps can be run in containers (Docker/Singularity) for reproducibility, or natively if tools are installed locally.

Input parameters can be specified in a YAML/JSON file or as command-line arguments. Outputs are placed in the specified output directory with a manifest describing the results.

# INPUT FILE EXAMPLE

```yaml
# inputs.yml
fastq_file:
  class: File
  path: /data/sample.fastq
reference:
  class: File
  path: /data/reference.fa
threads: 8
```

# CAVEATS

Default implementation (cwltool) may have performance limitations for large workflows. Some advanced features require specific runners (toil-cwl-runner, arvados-cwl-runner). Container requirements need Docker or Singularity installed. File paths in inputs must be accessible to the runner.

# HISTORY

Common Workflow Language was developed by a community effort starting in **2014**, with the specification reaching **v1.0** in **2016**. Led by **Peter Amstutz** and **Michael Crusoe**, CWL emerged from the need for portable, reproducible workflows in bioinformatics. **cwltool** is the reference implementation. CWL has been adopted by many scientific platforms and is now a standard for sharing computational pipelines.

# SEE ALSO

[cwltool](/man/cwltool)(1), [snakemake](/man/snakemake)(1), [nextflow](/man/nextflow)(1), [toil](/man/toil)(1)
