# TLDR

**Measure project size**

```phploc [src/]```

**Output as CSV**

```phploc --log-csv [stats.csv] [src/]```

**Exclude directory**

```phploc --exclude [vendor] [.]```

**Count tests**

```phploc --count-tests [src/]```

# SYNOPSIS

**phploc** [_options_] [_directories_...]

# PARAMETERS

_DIRECTORIES_
> Directories to analyze.

**--log-csv** _FILE_
> CSV output.

**--log-xml** _FILE_
> XML output.

**--exclude** _DIR_
> Exclude directory.

**--count-tests**
> Include test metrics.

**--help**
> Display help.

# DESCRIPTION

**phploc** measures PHP project size. Lines of code and complexity.

The tool provides code metrics. Part of PHP QA tools.

phploc counts PHP lines.

# CAVEATS

Directory-based analysis. Recursive by default.

# HISTORY

PHPLOC was created for **measuring PHP codebase size** and complexity.

# SEE ALSO

[cloc](/man/cloc)(1), [phpmd](/man/phpmd)(1), [phpcs](/man/phpcs)(1)

