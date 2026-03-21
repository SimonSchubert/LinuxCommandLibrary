# TAGLINE

Manage Azure DevOps organizations and projects

# TLDR

**Configure default organization** and project

```az devops configure --defaults organization=[https://dev.azure.com/contoso] project=[ContosoWebApp]```

**List team projects** in the organization

```az devops project list```

**Show details** of a project

```az devops project show --project [MyProject]```

**Create a new project**

```az devops project create --name [MyProject] --org [https://dev.azure.com/contoso]```

**Delete a project**

```az devops project delete --id [project-id] --yes```

**Open a project** in the web browser

```az devops project show --project [MyProject] --open```

**Login to Azure DevOps** with a personal access token

```az devops login --organization [https://dev.azure.com/contoso]```

**Logout from Azure DevOps**

```az devops logout```

**Invoke a DevOps REST API** endpoint directly

```az devops invoke --area core --resource projects --api-version 6.0```

# SYNOPSIS

**az** **devops** _subcommand_ [_options_]

# SUBCOMMANDS

**configure**
> Configure Azure DevOps CLI or view configuration.

**project list**
> List team projects.

**project show**
> Show project details.

**project create**
> Create a team project.

**project delete**
> Delete a team project.

**admin**
> Manage administration operations.

**extension**
> Manage extensions.

**security**
> Manage security related operations.

**service-endpoint**
> Manage service endpoints/connections.

**team**
> Manage teams.

**user**
> Manage users.

**wiki**
> Manage wikis.

**login**
> Set credentials for a particular organization.

**logout**
> Clear credentials for a particular organization.

**invoke**
> Invoke a request for any DevOps REST API.

# DESCRIPTION

**az devops** manages Azure DevOps organization level operations. It provides CLI access to manage projects, teams, users, security, and extensions within Azure DevOps Services.

Related command groups include **az pipelines** for CI/CD pipelines, **az boards** for work items, **az repos** for Git repositories, and **az artifacts** for package feeds.

# CAVEATS

Requires the Azure DevOps CLI extension to be installed with **az extension add --name azure-devops**. Only available for Azure DevOps Services (cloud), not Azure DevOps Server (on-premises). Requires Azure CLI v2.0.69 or later.

# SEE ALSO

[az](/man/az)(1), [az-pipelines](/man/az-pipelines)(1), [az-repos](/man/az-repos)(1)
