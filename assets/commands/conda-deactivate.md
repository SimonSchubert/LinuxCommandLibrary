# TAGLINE

deactivate the current conda environment

# TLDR

**Deactivate the current environment**

```conda deactivate```

# SYNOPSIS

**conda** **deactivate**

# DESCRIPTION

**conda deactivate** exits the currently active conda environment, reversing the shell modifications made by conda activate. This restores the PATH and environment variables to their previous state, either returning to the base conda environment or, if environments were nested through multiple activation calls, returning to the previously active environment.

The deactivation process removes the current environment's bin directory from PATH, unsets environment-specific variables like CONDA_PREFIX, and executes any deactivation scripts that packages may have installed. The shell prompt is typically updated to remove the environment name indicator, providing visual confirmation that the environment has been deactivated.

Unlike some environment management systems that require explicit cleanup, conda deactivate is safe to call at any time and handles the state management internally. If no environment is currently active beyond the base environment, deactivating simply returns to a non-conda shell state. Conda supports nested environments, so multiple activate calls can be unwound with corresponding deactivate calls, though this is an advanced usage pattern.

# SEE ALSO

[conda](/man/conda)(1), [conda-activate](/man/conda-activate)(1)
