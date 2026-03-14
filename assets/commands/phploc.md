# TAGLINE

measures PHP project size and complexity

# TLDR

**Measure project size**

```phploc [src/]```

**Output as CSV**

```phploc --log-csv [stats.csv] [src/]```

**Exclude a directory**

```phploc --exclude [vendor] [.]```

**Count tests**

```phploc --count-tests [src/]```

**Analyze specific file suffixes**

```phploc --suffix [php] --suffix [inc] [src/]```

**Exclude multiple directories**

```phploc --exclude [vendor] --exclude [tests] [src/]```

# SYNOPSIS

**phploc** [_options_] _directories_...

# PARAMETERS

_DIRECTORIES_
> One or more directories to analyze.

**--log-csv** _FILE_
> Write results in CSV format to file.

**--log-xml** _FILE_
> Write results in XML format to file.

**--exclude** _DIR_
> Exclude directory from analysis. Can be specified multiple times.

**--suffix** _SUFFIX_
> File suffix to include (default: php). Can be specified multiple times.

**--count-tests**
> Include test-related metrics in the output.

**--names** _NAMES_
> Comma-separated list of file names to include.

**--names-exclude** _NAMES_
> Comma-separated list of file names to exclude.

**--help**
> Display help information.

**--version**
> Display version information.

# DESCRIPTION

**phploc** measures the size and complexity of a PHP project. It reports metrics including lines of code (LOC), comment lines, non-comment lines, number of classes, methods, functions, interfaces, traits, namespaces, constants, and cyclomatic complexity.

The tool scans directories recursively for PHP files and generates a summary of structural metrics. It is part of the PHP QA toolchain created by Sebastian Bergmann.

# CAVEATS

Phploc has been **archived** by its author and is no longer actively maintained. It analyzes directories recursively by default. Only files with the `.php` suffix are scanned unless changed with `--suffix`.

# HISTORY

PHPLOC was created by **Sebastian Bergmann**, also known for PHPUnit, as part of the PHP quality assurance toolkit.

# SEE ALSO

[cloc](/man/cloc)(1), [phpmd](/man/phpmd)(1), [phpcs](/man/phpcs)(1), [sloccount](/man/sloccount)(1)

