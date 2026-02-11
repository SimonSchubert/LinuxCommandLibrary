# TAGLINE

Run R scripts non-interactively

# TLDR

**Run R script**

```Rscript [script.R]```

**Run with arguments**

```Rscript [script.R] [arg1] [arg2]```

**Run expression**

```Rscript -e "[print('hello')]"```

**Vanilla mode (no init)**

```Rscript --vanilla [script.R]```

**Set library path**

```Rscript --default-packages=[ggplot2,dplyr] [script.R]```

# SYNOPSIS

**Rscript** [_--vanilla_] [_-e expr_] [_options_] [_script_] [_args_]

# PARAMETERS

**-e** _EXPR_
> Execute expression.

**--vanilla**
> No saved data or init.

**--default-packages** _PKGS_
> Load packages.

**--verbose**
> Verbose startup.

**--no-init-file**
> Skip .Rprofile.

**--save**
> Save workspace.

# DESCRIPTION

**Rscript** is the non-interactive command-line interface for running R scripts and expressions. It is designed for scripting and automation, providing direct execution of R code files with proper exit codes and shebang support (#!/usr/bin/env Rscript) for use as executable scripts.

The **-e** flag evaluates inline R expressions, useful for one-liners and pipeline integration. Command-line arguments passed after the script name are accessible within R via **commandArgs()**. The **--vanilla** flag suppresses loading of saved workspaces and startup files for clean, reproducible execution.

Rscript is faster and more convenient than the older **R CMD BATCH** approach, as it writes output directly to stdout/stderr and returns meaningful exit codes for integration with shell scripts and CI/CD pipelines.

# CAVEATS

Requires R installation. Package dependencies manual. Memory limits apply.

# HISTORY

**Rscript** was introduced in R 2.5.0 as a simpler alternative to R CMD BATCH for running R scripts from the command line.

# SEE ALSO

[R](/man/R)(1), [littler](/man/littler)(1), [python](/man/python)(1)
