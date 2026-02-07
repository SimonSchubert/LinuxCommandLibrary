# TAGLINE

environment renaming utility

# TLDR

**Rename an environment**

```conda rename -n [old_name] [new_name]```

# SYNOPSIS

**conda** **rename** [_options_] _new_name_

# PARAMETERS

**-n**, **--name** _name_
> Current name of environment to rename.

**-p**, **--prefix** _path_
> Current path of environment to rename.

# CONFIGURATION

**~/.condarc**
> User-level conda configuration for channels, package settings, and solver options.

**/opt/conda/.condarc**
> System-wide conda configuration.

# DESCRIPTION

**conda rename** changes the name of an existing conda environment. This is done by cloning the environment to the new name and removing the old one.

# CAVEATS

The environment must be deactivated before renaming.

# SEE ALSO

[conda](/man/conda)(1), [conda-create](/man/conda-create)(1)
