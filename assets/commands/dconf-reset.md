# TLDR

**Reset** a specific key

```dconf reset /[path/to/key]```

Reset an entire **directory**

```dconf reset -f /[path/to/directory]/```

# SYNOPSIS

**dconf reset** [_options_] _path_

# DESCRIPTION

**dconf reset** removes keys from the dconf database, effectively resetting them to their default values. The defaults are typically defined by application schemas.

# PARAMETERS

**-f**
> Force reset of entire directory tree

_path_
> Key or directory to reset

# CAVEATS

Resetting removes the stored value; the application will use its schema default. Use -f carefully as it resets all keys in a directory tree. Cannot be undone.

# SEE ALSO

[dconf](/man/dconf)(1), [dconf-write](/man/dconf-write)(1), [gsettings](/man/gsettings)(1)
