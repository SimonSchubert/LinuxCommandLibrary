# TAGLINE

Automate repetitive file-based tasks using glob expressions

# TLDR

**Run a command for each matching file**

```para-cada [glob_pattern] -- [command]```

**Preview operations** without executing (dry run)

```para-cada --dry-run [glob_pattern] -- [command]```

**Extract all .tgz archives** in current directory

```para-cada '*.tgz' -- tar xzf {}```

# SYNOPSIS

**para-cada** [_options_] _glob_pattern_ **--** _command_

# PARAMETERS

**--dry-run**
> Preview operations without executing them.

**--help**
> Display help information.

# DESCRIPTION

**para-cada** ("for each" in Spanish) is a CLI tool that automates repetitive file-based tasks. It executes a command for each file matching a glob expression, replacing **{}** with the matched filename. It supports batch processing, Python-based filtering and transformation of values, concurrent execution, dry-run previews, and plugin support for advanced operations.

# CAVEATS

Requires Python. The glob pattern should be quoted to prevent shell expansion. Limited to file-based operations with glob matching.

# HISTORY

**para-cada** was created by **gergelyk** and is written in **Python**. Available via PyPI with **pip install para-cada**.

# SEE ALSO

[find](/man/find)(1), [xargs](/man/xargs)(1), [fd](/man/fd)(1)
