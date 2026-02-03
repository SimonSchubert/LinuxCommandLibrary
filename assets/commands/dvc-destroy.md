# TLDR

**Remove DVC from project**

```dvc destroy```

**Force destroy without confirmation**

```dvc destroy -f```

# SYNOPSIS

**dvc** **destroy** [_options_]

# PARAMETERS

**-f**, **--force**
> Force destroy without confirmation.

# DESCRIPTION

**dvc destroy** removes DVC from a project by deleting the .dvc directory and all .dvc files. Does not remove the tracked data files.

# CAVEATS

This operation is irreversible. Make sure to backup any data or push to remote storage before destroying.

# SEE ALSO

[dvc-init](/man/dvc-init)(1)

