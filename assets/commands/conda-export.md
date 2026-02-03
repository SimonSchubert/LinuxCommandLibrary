# TLDR

**Export current environment**

```conda export > [environment.yml]```

**Export without builds**

```conda export --no-builds > [environment.yml]```

**Export from history** only

```conda export --from-history > [environment.yml]```

# SYNOPSIS

**conda** **export** [_options_]

# PARAMETERS

**--no-builds**
> Exclude build strings from output.

**--from-history**
> Only include packages explicitly requested.

**-n**, **--name** _name_
> Name of environment to export.

# DESCRIPTION

**conda export** outputs the current environment specification in YAML format. This can be used to recreate the environment on another system.

Use **--from-history** for more portable exports that don't include transitive dependencies.

# SEE ALSO

[conda](/man/conda)(1), [conda-env](/man/conda-env)(1), [conda-list](/man/conda-list)(1)
