# TLDR

**List pipelines**

```glab pipeline list```

**View pipeline**

```glab pipeline view [id]```

**Run pipeline**

```glab pipeline run```

**Run with variables**

```glab pipeline run --variables [KEY:VALUE]```

**Show CI status**

```glab pipeline ci status```

**View jobs**

```glab pipeline ci view```

# SYNOPSIS

**glab** **pipeline** _command_ [_options_]

# SUBCOMMANDS

**list**
> List pipelines.

**view**
> View pipeline details.

**run**
> Trigger pipeline.

**status**
> Show pipeline status.

**delete**
> Delete pipeline.

**ci**
> CI-related commands.

# PARAMETERS

**--variables** _vars_
> Pipeline variables.

**--branch** _branch_
> Branch to run on.

# DESCRIPTION

**glab pipeline** manages GitLab CI/CD pipelines. View, trigger, and monitor pipelines from the command line.

# SEE ALSO

[glab](/man/glab)(1), [gitlab-ci](/man/gitlab-ci)(1)

