# TLDR

**Unfreeze a stage**

```dvc unfreeze [stage_name]```

**Unfreeze all stages in file**

```dvc unfreeze [dvc.yaml]```

# SYNOPSIS

**dvc** **unfreeze** [_options_] _targets_...

# DESCRIPTION

**dvc unfreeze** unfreezes previously frozen pipeline stages, allowing them to be executed again during dvc repro.

# SEE ALSO

[dvc-freeze](/man/dvc-freeze)(1), [dvc-repro](/man/dvc-repro)(1)

