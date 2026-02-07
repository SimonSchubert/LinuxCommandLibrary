# TAGLINE

visualize DVC pipeline dependencies

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

**dvc dag** generates a visual representation of your DVC pipeline's structure as a directed acyclic graph (DAG). It shows how pipeline stages depend on each other and the flow of data through your machine learning workflow.

Each node in the graph represents a pipeline stage (data processing, training, evaluation, etc.), and edges show dependencies between stages. This visualization helps understand pipeline structure, identify bottlenecks, and debug execution order issues.

The default output is ASCII art suitable for terminal viewing. The --dot option exports to Graphviz DOT format, which can be rendered to images using tools like Graphviz or online viewers. This is useful for documentation and sharing pipeline architecture with team members.

# SEE ALSO

[dvc-run](/man/dvc-run)(1), [dvc-repro](/man/dvc-repro)(1)

