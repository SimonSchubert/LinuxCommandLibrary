# TLDR

**List all pipelines** in a project

```az pipelines list --project [MyProject]```

**Show details** of a pipeline

```az pipelines show --name [MyPipeline] --project [MyProject]```

**Create a new pipeline**

```az pipelines create --name [MyPipeline] --repository [MyRepo] --branch [main] --yml-path [azure-pipelines.yml]```

**Run a pipeline**

```az pipelines run --name [MyPipeline] --project [MyProject]```

**Delete a pipeline**

```az pipelines delete --id [pipeline-id] --project [MyProject]```

**List pipeline runs**

```az pipelines runs list --pipeline-id [id] --project [MyProject]```

**Show details** of a pipeline run

```az pipelines runs show --id [run-id] --project [MyProject]```

# SYNOPSIS

**az** **pipelines** _subcommand_ [_options_]

# SUBCOMMANDS

**list**
> List pipelines.

**show**
> Show pipeline details.

**create**
> Create a pipeline.

**delete**
> Delete a pipeline.

**run**
> Queue a pipeline run.

**update**
> Update a pipeline.

**runs list**
> List pipeline runs.

**runs show**
> Show details of a pipeline run.

**variable**
> Manage pipeline variables.

**variable-group**
> Manage variable groups.

**folder**
> Manage pipeline folders.

**agent**
> Manage pipeline agents.

**pool**
> Manage agent pools.

**queue**
> Manage agent queues.

# DESCRIPTION

**az pipelines** manages Azure Pipelines, the CI/CD service in Azure DevOps. It provides commands to create, run, and manage build and release pipelines, as well as agents, pools, and variables.

This is part of the Azure DevOps CLI extension and works with Azure DevOps Services.

# CAVEATS

Requires the Azure DevOps CLI extension (**az extension add --name azure-devops**). Only works with Azure DevOps Services, not Azure DevOps Server. Configure defaults with **az devops configure**.

# SEE ALSO

[az-devops](/man/az-devops)(1), [az-repos](/man/az-repos)(1), [az](/man/az)(1)
