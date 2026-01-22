# TLDR

**Generate HTML report**

```genhtml [coverage.info] -o [html_output]```

**Add title**

```genhtml --title "[Coverage Report]" [coverage.info] -o [html_output]```

**Show branch coverage**

```genhtml --branch-coverage [coverage.info] -o [html_output]```

**Prefix path**

```genhtml --prefix [/src] [coverage.info] -o [html_output]```

# SYNOPSIS

**genhtml** [_options_] _tracefile_...

# PARAMETERS

_TRACEFILE_
> lcov coverage data file.

**-o** _DIR_, **--output-directory** _DIR_
> Output directory.

**--title** _TEXT_
> Report title.

**--branch-coverage**
> Include branch coverage.

**--prefix** _PATH_
> Remove source prefix.

**--legend**
> Include coverage legend.

**--help**
> Display help information.

# DESCRIPTION

**genhtml** creates HTML coverage reports from lcov trace files. It generates navigable reports showing line, function, and branch coverage with source highlighting.

The tool processes coverage data to produce visual reports for reviewing test coverage. Multiple trace files can be combined into a single report.

genhtml is the visualization component of the lcov coverage toolkit.

# CAVEATS

Requires lcov trace files. Large codebases produce large reports. Browser needed for viewing.

# HISTORY

genhtml is part of **lcov**, the Linux Test Project coverage tool. It provides HTML visualization for coverage data collected by lcov from gcov.

# SEE ALSO

[lcov](/man/lcov)(1), [gcov](/man/gcov)(1)
