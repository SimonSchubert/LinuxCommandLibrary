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

**Rscript** runs R scripts. It's for non-interactive execution.

Shebang compatible. Add #!/usr/bin/env Rscript.

Command arguments accessible. Via commandArgs().

Faster than R CMD BATCH. Direct execution.

Returns proper exit codes. Scripting friendly.

# CAVEATS

Requires R installation. Package dependencies manual. Memory limits apply.

# HISTORY

**Rscript** was introduced in R 2.5.0 as a simpler alternative to R CMD BATCH for running R scripts from the command line.

# SEE ALSO

[R](/man/R)(1), [littler](/man/littler)(1), [python](/man/python)(1)
