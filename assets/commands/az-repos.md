# TAGLINE

Manage Azure DevOps Git repositories and pull requests

# TLDR

**List all repositories** in a project

```az repos list --project [MyProject]```

**Show details** of a repository

```az repos show --repository [MyRepo] --project [MyProject]```

**Create a new repository**

```az repos create --name [MyRepo] --project [MyProject]```

**Clone a repository** URL

```az repos show --repository [MyRepo] --project [MyProject] --query remoteUrl```

**Delete a repository**

```az repos delete --id [repo-id] --project [MyProject]```

**List pull requests**

```az repos pr list --project [MyProject]```

**Create a pull request**

```az repos pr create --source-branch [feature] --target-branch [main] --title [My PR] --project [MyProject]```

**Show pull request details**

```az repos pr show --id [pr-id]```

# SYNOPSIS

**az** **repos** _subcommand_ [_options_]

# SUBCOMMANDS

**list**
> List repositories.

**show**
> Show repository details.

**create**
> Create a repository.

**delete**
> Delete a repository.

**update**
> Update a repository.

**pr list**
> List pull requests.

**pr create**
> Create a pull request.

**pr show**
> Show pull request details.

**pr update**
> Update a pull request.

**pr complete**
> Complete a pull request.

**policy**
> Manage branch policies.

**ref**
> Manage Git references.

**import**
> Import a repository.

# DESCRIPTION

**az repos** manages Azure Repos, the Git repository hosting service in Azure DevOps. It provides commands for managing repositories, pull requests, branches, and policies.

This is part of the Azure DevOps CLI extension and works with Azure DevOps Services.

# CAVEATS

Requires the Azure DevOps CLI extension (**az extension add --name azure-devops**). Only works with Azure DevOps Services, not Azure DevOps Server. Configure defaults with **az devops configure**.

# SEE ALSO

[az-devops](/man/az-devops)(1), [az-pipelines](/man/az-pipelines)(1), [git](/man/git)(1)
