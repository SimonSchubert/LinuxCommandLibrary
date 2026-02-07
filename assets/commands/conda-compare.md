# TAGLINE

compare environments against specification files

# TLDR

**Compare two environments**

```conda compare [env_name] [environment.yml]```

**Compare current environment** with a spec file

```conda compare [environment.yml]```

# SYNOPSIS

**conda** **compare** [_env_name_] _file_

# DESCRIPTION

**conda compare** analyzes the difference between an installed conda environment and an environment specification file (typically environment.yml), reporting discrepancies in package versions, missing packages, or extra packages not specified in the file. This is valuable for environment validation and drift detection.

Over time, conda environments can drift from their original specifications through manual package installations, updates, or dependency resolution changes. The compare command helps identify when an environment no longer matches its documented specification, which can be critical for reproducibility in scientific computing and data science workflows where environment consistency is essential.

The tool is particularly useful in collaborative settings where environment.yml files are version controlled and shared among team members. By comparing the current environment against the canonical specification, developers can verify they're working in the correct environment state or identify when an environment needs to be rebuilt from the specification to ensure consistency across the team.

# SEE ALSO

[conda](/man/conda)(1), [conda-env](/man/conda-env)(1), [conda-list](/man/conda-list)(1)
