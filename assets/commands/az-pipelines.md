# TAGLINE

Manage Azure DevOps CI/CD pipelines

# TLDR

**List all pipelines** in a project

```az pipelines list --project [MyProject]```

**Show details** of a pipeline

```az pipelines show --name [MyPipeline] --project [MyProject]```

**Create a new YAML pipeline**

```az pipelines create --name [MyPipeline] --repository [MyRepo] --branch [main] --yml-path [azure-pipelines.yml]```

**Run a pipeline** (queue a run)

```az pipelines run --name [MyPipeline] --project [MyProject]```

**Run a pipeline** with parameters and variables

```az pipelines run --name [MyPipeline] --parameters [env=prod] --variables [tag=v1]```

**Delete a pipeline**

```az pipelines delete --id [pipeline_id] --project [MyProject]```

**List pipeline runs**

```az pipelines runs list --project [MyProject]```

**Show details** of a pipeline run

```az pipelines runs show --id [run_id] --project [MyProject]```

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
> Queue (run) a pipeline.

**update**
> Update a pipeline.

**runs**
> Manage pipeline runs (list, show, artifact, tag).

**build**
> Manage builds and build definitions.

**release**
> Manage releases and release definitions.

**variable**
> Manage pipeline variables.

**variable-group**
> Manage variable groups.

**folder**
> Manage folders for organizing pipelines.

**agent**
> Manage agents.

**pool**
> Manage agent pools.

**queue**
> Manage agent queues.

# PARAMETERS

**--org**, **--organization**
> Azure DevOps organization URL, for example `https://dev.azure.com/MyOrg/`. Required unless set as a default with **az devops configure -d organization=URL** or detected from local git config.

**--project**, **-p**
> Name or ID of the project. Required unless set as a default with **az devops configure -d project=NAME**.

**--detect**
> Automatically detect the organization from local git context. Accepts **true** or **false**.

# DESCRIPTION

**az pipelines** manages Azure Pipelines, the CI/CD service in Azure DevOps. It provides commands to create, run, and manage YAML pipelines, builds, and releases, as well as agents, pools, queues, variables, and variable groups.

This command group is part of the **azure-devops** extension and works with Azure DevOps Services.

# CAVEATS

Part of the **azure-devops** extension (Azure CLI 2.30.0 or higher). The extension installs automatically the first time an **az pipelines** command runs, or install it manually with **az extension add --name azure-devops**. Set persistent defaults with **az devops configure -d organization=URL project=NAME** to avoid repeating **--org** and **--project**.

# INSTALL

```dnf: sudo dnf install azure-cli```

```pacman: sudo pacman -S azure-cli```

```zypper: sudo zypper install azure-cli```

```brew: brew install azure-cli```

```nix: nix profile install nixpkgs#azure-cli```

<!-- packages: 2026-07-22 -->
# SEE ALSO

[azure-cli](/man/azure-cli)(1), [az-devops](/man/az-devops)(1), [az-repos](/man/az-repos)(1), [git](/man/git)(1)

# RESOURCES

```[Source code](https://github.com/Azure/azure-devops-cli-extension)```

```[Documentation](https://learn.microsoft.com/en-us/cli/azure/pipelines)```

```[Homepage](https://learn.microsoft.com/en-us/cli/azure/)```

<!-- verified: 2026-06-19 -->
