# TAGLINE

Manage Azure DevOps Git repositories and pull requests

# TLDR

**List all repositories** in a project

```az repos list --project [MyProject]```

**Show details** of a repository

```az repos show --repository [MyRepo] --project [MyProject]```

**Create a new repository**

```az repos create --name [MyRepo] --project [MyProject]```

**Get the clone URL** of a repository

```az repos show --repository [MyRepo] --project [MyProject] --query remoteUrl```

**Delete a repository**

```az repos delete --id [repo_id] --project [MyProject]```

**List pull requests**

```az repos pr list --project [MyProject]```

**Create a pull request**

```az repos pr create --repository [MyRepo] --source-branch [feature] --target-branch [main] --title [My PR]```

**Show pull request details**

```az repos pr show --id [pr_id]```

**Complete (merge) a pull request**

```az repos pr update --id [pr_id] --status completed```

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
> Get the details of a pull request.

**pr update**
> Update a pull request (set title, description, status; complete by setting --status completed).

**pr checkout**
> Check out the PR source branch locally.

**pr set-vote**
> Vote on a pull request (approve, reject, and so on).

**pr reviewer**
> Add, list, or remove pull request reviewers.

**pr work-item**
> Link or unlink work items to a pull request.

**policy**
> Manage branch policies (approver-count, build, comment-required, and more).

**ref**
> Manage Git references (create, delete, list, lock, unlock).

**import create**
> Create a Git import request.

# PARAMETERS

**--org**, **--organization**
> Azure DevOps organization URL, for example `https://dev.azure.com/MyOrg/`. Required unless set as a default with **az devops configure -d organization=URL** or detected from local git config.

**--project**, **-p**
> Name or ID of the project. Required unless set as a default with **az devops configure -d project=NAME**.

**--repository**, **-r**
> Name or ID of the repository.

**--detect**
> Automatically detect the organization from local git context. Accepts **true** or **false**.

# DESCRIPTION

**az repos** manages Azure Repos, the Git repository hosting service in Azure DevOps. It provides commands for managing repositories, pull requests, references, branch policies, and repository imports.

This command group is part of the **azure-devops** extension and works with Azure DevOps Services.

# CAVEATS

Part of the **azure-devops** extension (Azure CLI 2.30.0 or higher). The extension installs automatically the first time an **az repos** command runs, or install it manually with **az extension add --name azure-devops**. Set persistent defaults with **az devops configure -d organization=URL project=NAME** to avoid repeating **--org** and **--project**.

# SEE ALSO

[azure-cli](/man/azure-cli)(1), [az-devops](/man/az-devops)(1), [az-pipelines](/man/az-pipelines)(1), [git](/man/git)(1)

# RESOURCES

```[Source code](https://github.com/Azure/azure-devops-cli-extension)```

```[Documentation](https://learn.microsoft.com/en-us/cli/azure/repos)```

```[Homepage](https://learn.microsoft.com/en-us/cli/azure/)```

<!-- verified: 2026-06-19 -->
