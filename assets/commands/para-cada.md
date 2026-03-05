# TAGLINE

Automate repetitive file-based tasks using glob expressions

# TLDR

**Run a command for each matching file**

```para-cada [glob_pattern] -- [command]```

**Preview operations with dry run**

```para-cada --dry-run [glob_pattern] -- [command]```

# SYNOPSIS

**para-cada** [_options_] _glob_pattern_ **--** _command_

# DESCRIPTION

**para-cada** is a CLI tool that automates repetitive file-based tasks using simple commands with glob expressions. It supports batch processing, Python-based filtering, concurrent execution, dry-run previews, and plugin support for advanced operations.

# HISTORY

**para-cada** was created by **gergelyk** and is written in **Python**.

# SEE ALSO

[find](/man/find)(1), [xargs](/man/xargs)(1), [fd](/man/fd)(1)
