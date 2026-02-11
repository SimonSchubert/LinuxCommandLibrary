# TAGLINE

Statistical computing and graphics language

# TLDR

**Start R interpreter**

```R```

**Run script**

```R --file=[script.R]```

**Execute and print**

```Rscript -e "[print(1+1)]"```

**Run script silently**

```R --slave --file=[script.R]```

**No save on exit**

```R --no-save```

# SYNOPSIS

**R** [_options_] [_file_]

# PARAMETERS

_FILE_
> R script to run.

**--file** _FILE_
> Execute script.

**--slave**
> Silent mode.

**--no-save**
> Don't save workspace.

**--vanilla**
> No init files.

**-e** _EXPR_
> Execute expression.

# DESCRIPTION

**R** is a language and interactive environment for statistical computing, data analysis, and graphics. It provides a wide variety of statistical techniques including linear and nonlinear modeling, time-series analysis, classification, and clustering, along with a powerful system for producing publication-quality plots and visualizations.

The interactive console supports exploratory data analysis with immediate feedback, while scripts can be executed non-interactively via **--file** or through the companion **Rscript** command. R's package ecosystem on CRAN offers thousands of contributed libraries extending its capabilities across fields from bioinformatics to econometrics. The workspace system saves objects between sessions, though **--no-save** and **--vanilla** flags allow clean stateless execution for reproducible workflows.

# CAVEATS

Separate from Rscript. Interactive by default.

# HISTORY

R was created by **Ross Ihaka and Robert Gentleman** at University of Auckland.

# SEE ALSO

[Rscript](/man/Rscript)(1), [python](/man/python)(1)

