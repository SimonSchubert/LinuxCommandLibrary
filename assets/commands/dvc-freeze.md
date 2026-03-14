# TAGLINE

Prevent automatic pipeline stage re-execution

# TLDR

**Freeze a stage**

```dvc freeze [stage_name]```

**Freeze multiple stages**

```dvc freeze [stage1] [stage2]```

**Freeze with verbose output**

```dvc freeze -v [stage_name]```

# SYNOPSIS

**dvc** **freeze** [_-h_] [_-q_] [_-v_] _targets_...

# PARAMETERS

_targets_
> Stage names or .dvc files to freeze.

**-h**, **--help**
> Show help message and exit.

**-q**, **--quiet**
> Do not write anything to standard output.

**-v**, **--verbose**
> Display detailed tracing information.

# DESCRIPTION

**dvc freeze** freezes pipeline stages so they are considered unchanged by **dvc status** and not re-executed during **dvc repro**. Frozen stages will not regenerate outputs even if their dependencies have changed, even with **--force**.

Freezing is useful to avoid re-running expensive upstream stages while iterating on downstream stages in a pipeline.

# CAVEATS

Frozen stages will not be reproduced even when dependencies change. Use **dvc unfreeze** to restore normal behavior. The freeze state is stored in the DVC lock file.

# SEE ALSO

[dvc-unfreeze](/man/dvc-unfreeze)(1)

