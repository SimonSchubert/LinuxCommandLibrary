# TAGLINE

reset dconf keys to default values

# TLDR

**Reset** a specific key

```dconf reset /[path/to/key]```

Reset an entire **directory**

```dconf reset -f /[path/to/directory]/```

# SYNOPSIS

**dconf reset** [_options_] _path_

# DESCRIPTION

**dconf reset** removes keys from the dconf database, effectively resetting them to their default values. The defaults are typically defined by application GSettings schemas, and removing the user's stored value causes the application to fall back to these defaults.

When resetting a single key, only that specific setting is removed. Using the -f flag with a directory path removes all keys under that directory tree, which is useful for completely resetting a configuration section or entire application settings.

This operation is immediate and cannot be undone through dconf itself. Consider using "dconf dump" before resetting to create a backup if you might need to restore the previous values. The reset operation is commonly used when troubleshooting application behavior or returning to a known-good configuration state.

# PARAMETERS

**-f**
> Force reset of entire directory tree

_path_
> Key or directory to reset

# CAVEATS

Resetting removes the stored value; the application will use its schema default. Use -f carefully as it resets all keys in a directory tree. Cannot be undone.

# SEE ALSO

[dconf](/man/dconf)(1), [dconf-write](/man/dconf-write)(1), [gsettings](/man/gsettings)(1)
