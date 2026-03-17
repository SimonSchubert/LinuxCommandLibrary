# TAGLINE

Manage conda environments

# TLDR

**List all environments**

```conda env list```

**Export the current environment to a YAML file**

```conda env export > [environment.yml]```

**Export only explicitly installed packages**

```conda env export --from-history > [environment.yml]```

**Create an environment from a YAML file**

```conda env create -f [environment.yml]```

**Create an environment with a specific name from a file**

```conda env create -n [env_name] -f [environment.yml]```

**Remove an environment**

```conda env remove --name [env_name]```

**Update an environment from a YAML file**

```conda env update -f [environment.yml]```

# SYNOPSIS

**conda** **env** _subcommand_ [_options_]

# PARAMETERS

**list**
> List all conda environments.

**create**
> Create an environment from a YAML specification file.

**export**
> Export an environment definition to YAML.

**remove**
> Remove an environment entirely.

**update**
> Update an existing environment from a YAML file.

**config**
> Configure environment-specific variables.

**-n** _NAME_, **--name** _NAME_
> Name of the environment to operate on.

**-f** _FILE_, **--file** _FILE_
> Path to the environment YAML file.

**--from-history**
> (export) Only include packages explicitly installed by the user.

**--no-builds**
> (export) Remove build specification from exported dependencies.

# DESCRIPTION

**conda env** manages conda environments including creation from specification files, export, and removal. The **environment.yml** format allows reproducible environment definitions that can include conda packages, pip packages, and channel specifications.

Use **export --from-history** to create cross-platform environment files that only list explicitly requested packages rather than all resolved dependencies.

# CAVEATS

The **--from-history** flag only works with structured formats (YAML, JSON), not with explicit or requirements formats. Environment files may not be portable across platforms unless **--from-history** or **--no-builds** is used during export.

# SEE ALSO

[conda](/man/conda)(1), [conda-create](/man/conda-create)(1), [conda-activate](/man/conda-activate)(1), [conda-install](/man/conda-install)(1), [conda-list](/man/conda-list)(1)
