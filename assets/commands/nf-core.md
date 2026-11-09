# TAGLINE

CLI for the nf-core community collection of Nextflow pipelines

# TLDR

**List all available nf-core pipelines**

```nf-core pipelines list```

**Download a pipeline for offline use**

```nf-core pipelines download [pipeline-name]```

**Launch a pipeline interactively**

```nf-core pipelines launch [pipeline-name]```

**Create a new pipeline from template**

```nf-core pipelines create```

**Lint a pipeline for best practices**

```nf-core pipelines lint```

**Lint a pipeline parameter schema**

```nf-core pipelines schema lint```

**Install a module into a pipeline**

```nf-core modules install [tool]```

# SYNOPSIS

**nf-core** [_options_] _command_ [_subcommand_] [_args_]

# COMMANDS

**pipelines list**
> List available nf-core pipelines with stars, releases, and descriptions.

**pipelines download**
> Download a pipeline and its container images for offline use.

**pipelines launch**
> Interactively configure and launch a pipeline run.

**pipelines create**
> Create a new pipeline from the nf-core template.

**pipelines lint**
> Check pipeline code against nf-core best practices.

**pipelines schema**
> Manage pipeline parameter schema files.

**pipelines create-params-file**
> Build a parameter file for a pipeline.

**pipelines sync**
> Sync a pipeline's TEMPLATE branch with the nf-core template.

**pipelines bump-version**
> Update the version number in a pipeline.

**modules**
> Manage Nextflow DSL2 modules.

**subworkflows**
> Manage Nextflow DSL2 subworkflows.

# PARAMETERS

**-h**, **--help**
> Display help information.

**--version**
> Show version.

**-v**, **--verbose**
> Print verbose output to the console.

**--hide-progress**
> Do not show progress bars.

**-l**, **--log-file** _FILE_
> Save a verbose log to a file.

# DESCRIPTION

**nf-core** is the command-line interface for the nf-core community, which curates a collection of high-quality bioinformatics pipelines built with Nextflow. The tool helps users find, download, launch, and develop pipelines following community best practices.

The **download** command fetches pipelines along with their Singularity or Docker container images for use in offline or air-gapped environments. The **launch** command provides an interactive interface for setting pipeline parameters, generating a params file, and starting a run.

For pipeline developers, **create** scaffolds a new pipeline from the nf-core template with CI, documentation, and testing built in. The **lint** command validates that a pipeline follows nf-core guidelines for code quality, documentation, and reproducibility.

# CAVEATS

Requires Python 3.10 or later. Nextflow must be installed separately to actually run pipelines. Pipeline downloads can be large when including container images. Internet access is required for listing and downloading pipelines.

# HISTORY

nf-core was established in **2018** as a community effort to create a curated set of Nextflow pipelines following best practices for reproducibility and portability. The project was published in **Nature Biotechnology** in 2020. It has grown to include over 100 pipelines covering genomics, proteomics, imaging, and other bioinformatics domains.

# SEE ALSO

[nextflow](/man/nextflow)(1), [conda](/man/conda)(1), [docker](/man/docker)(1)

# RESOURCES

```[Source code](https://github.com/nf-core/tools)```

```[Homepage](https://nf-co.re)```

```[Documentation](https://nf-co.re/docs/nf-core-tools)```

<!-- verified: 2026-11-09 -->
