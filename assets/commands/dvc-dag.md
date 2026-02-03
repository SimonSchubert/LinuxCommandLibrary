# TLDR

**Show pipeline DAG**

```dvc dag```

**Output as dot format**

```dvc dag --dot```

**Show specific stage**

```dvc dag [stage_name]```

**Show full graph**

```dvc dag --full```

# SYNOPSIS

**dvc** **dag** [_options_] [_target_]

# PARAMETERS

**--dot**
> Output in Graphviz DOT format.

**--full**
> Show full graph including deps.

**-o**, **--out** _file_
> Output to file.

# DESCRIPTION

**dvc dag** visualizes the pipeline as a directed acyclic graph. Shows dependencies between stages in DVC pipelines.

# SEE ALSO

[dvc-run](/man/dvc-run)(1), [dvc-repro](/man/dvc-repro)(1)

