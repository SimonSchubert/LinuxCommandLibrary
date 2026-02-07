# TAGLINE

remove DVC initialization from project

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

**dvc destroy** completely removes DVC initialization from a project, effectively uninstalling DVC from the repository. It deletes the .dvc directory (containing cache, configuration, and internal state) along with all .dvc metadata files throughout the project.

Importantly, the actual data files tracked by DVC are preserved. Only the DVC tracking infrastructure is removed. This means your large datasets and model files remain in the workspace, they simply lose their version control status.

This command is irreversible and should be used with caution. Before destroying, ensure you've pushed important data to remote storage if you might need to restore DVC tracking later. After destroying, .gitignore entries added by DVC remain and may need manual cleanup.

# CAVEATS

This operation is irreversible. Make sure to backup any data or push to remote storage before destroying.

# SEE ALSO

[dvc-init](/man/dvc-init)(1)

