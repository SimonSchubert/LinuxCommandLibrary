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

# DESCRIPTION

**conda doctor** runs diagnostic checks on a conda environment to detect potential issues such as corrupted packages, missing files, or inconsistent states.

Useful for troubleshooting environment problems.

# SEE ALSO

[conda](/man/conda)(1), [conda-info](/man/conda-info)(1)
