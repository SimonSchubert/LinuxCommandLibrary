# TLDR

**List packages** in current environment

```conda list```

**List packages** in specific environment

```conda list -n [env_name]```

**List packages matching pattern**

```conda list [pattern]```

**Show as revisions**

```conda list --revisions```

**Export to file**

```conda list --export > [packages.txt]```

# SYNOPSIS

**conda** **list** [_options_] [_regex_]

# PARAMETERS

**-n**, **--name** _name_
> List packages in named environment.

**--export**
> Output in format for conda create --file.

**--revisions**
> List revision history.

**--json**
> Output in JSON format.

# DESCRIPTION

**conda list** displays packages installed in a conda environment. By default shows packages in the current active environment.

Use regex patterns to filter the list.

# SEE ALSO

[conda](/man/conda)(1), [conda-search](/man/conda-search)(1), [conda-info](/man/conda-info)(1)
