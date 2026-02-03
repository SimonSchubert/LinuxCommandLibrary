# TLDR

**Package an environment** into a tarball

```conda package```

**Package with specific name**

```conda package --name [env_name]```

# SYNOPSIS

**conda** **package** [_options_]

# PARAMETERS

**-n**, **--name** _name_
> Name of environment to package.

**-p**, **--prefix** _path_
> Path to environment to package.

# DESCRIPTION

**conda package** creates a tarball of a conda environment for distribution or archival. This allows sharing complete environment states.

# CAVEATS

Large environments may produce very large archives. Consider using environment.yml exports for more portable sharing.

# SEE ALSO

[conda](/man/conda)(1), [conda-env](/man/conda-env)(1)
