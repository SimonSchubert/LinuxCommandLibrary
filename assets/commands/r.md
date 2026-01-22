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

**R** is statistical computing language. Data analysis and graphics.

The tool provides interactive environment. Statistical programming.

R analyzes data.

# CAVEATS

Separate from Rscript. Interactive by default.

# HISTORY

R was created by **Ross Ihaka and Robert Gentleman** at University of Auckland.

# SEE ALSO

[Rscript](/man/Rscript)(1), [python](/man/python)(1)

