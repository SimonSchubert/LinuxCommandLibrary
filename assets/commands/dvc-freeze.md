# TAGLINE

prevent automatic pipeline stage re-execution

# TLDR

**Freeze a stage**

```dvc freeze [stage_name]```

**Freeze pipeline file**

```dvc freeze [dvc.yaml]```

# SYNOPSIS

**dvc** **freeze** [_options_] _targets_...

# DESCRIPTION

**dvc freeze** freezes pipeline stages so they are not executed during dvc repro. Useful for stages that should not be automatically re-run.

# SEE ALSO

[dvc-unfreeze](/man/dvc-unfreeze)(1), [dvc-repro](/man/dvc-repro)(1)

