# TLDR

**List all environments**

```conda env list```

**Export environment** to YAML file

```conda env export > [environment.yml]```

**Create environment** from file

```conda env create -f [environment.yml]```

**Remove an environment**

```conda env remove --name [env_name]```

**Update environment** from file

```conda env update -f [environment.yml]```

# SYNOPSIS

**conda** **env** _subcommand_ [_options_]

# SUBCOMMANDS

**list**
> List all conda environments.

**create**
> Create an environment from a YAML file.

**export**
> Export environment to YAML.

**remove**
> Remove an environment.

**update**
> Update environment from YAML file.

**config**
> Configure environment variables.

# DESCRIPTION

**conda env** manages conda environments including creation from specification files, export, and removal. The environment.yml format allows reproducible environment definitions.

# SEE ALSO

[conda](/man/conda)(1), [conda-create](/man/conda-create)(1), [conda-activate](/man/conda-activate)(1)
