# TAGLINE

environment health checker

# TLDR

**Check environment health**

```conda doctor```

**Check a specific environment**

```conda doctor --name [env_name]```

# SYNOPSIS

**conda** **doctor** [_options_]

# PARAMETERS

**-n**, **--name** _name_
> Name of environment to check.

**-p**, **--prefix** _path_
> Path to environment to check.

# CONFIGURATION

**~/.condarc**
> User-level conda configuration for channels, package settings, and solver options.

**/opt/conda/.condarc**
> System-wide conda configuration.

# DESCRIPTION

**conda doctor** runs diagnostic checks on a conda environment to detect potential issues such as corrupted packages, missing files, or inconsistent package states. It verifies environment integrity by checking package metadata, file checksums, and dependency consistency.

This command is particularly useful when environments behave unexpectedly, packages fail to import, or after manual modifications to environment directories. It can identify problems that may not be obvious from package listings alone.

# SEE ALSO

[conda](/man/conda)(1), [conda-info](/man/conda-info)(1)
