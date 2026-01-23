# TLDR

**Create a resource group deployment** from a template

```az deployment group create --resource-group [rg_name] --template-file [template.json]```

**Deploy with parameters file**

```az deployment group create --resource-group [rg_name] --template-file [template.json] --parameters [parameters.json]```

**Deploy a Bicep file**

```az deployment group create --resource-group [rg_name] --template-file [main.bicep]```

**Validate a deployment** without executing

```az deployment group validate --resource-group [rg_name] --template-file [template.json]```

**Show deployment details**

```az deployment group show --resource-group [rg_name] --name [deployment_name]```

**List deployments** in a resource group

```az deployment group list --resource-group [rg_name]```

**Delete a deployment**

```az deployment group delete --resource-group [rg_name] --name [deployment_name]```

**Deploy at subscription scope**

```az deployment sub create --location [eastus] --template-file [template.json]```

# SYNOPSIS

**az deployment** _scope_ _subcommand_ [_options_]

# DESCRIPTION

**az deployment** is a subcommand of the Azure CLI that manages Azure Resource Manager (ARM) deployments. It deploys infrastructure as code using ARM templates (JSON) or Bicep files to create and update Azure resources.

Deployments can target different scopes: resource group, subscription, management group, or tenant. The template defines resources to create, their properties, and dependencies. Parameters allow customization without modifying templates.

Deployment modes include incremental (add/update resources) and complete (remove resources not in template). What-if operations preview changes before deployment.

# PARAMETERS

**group create**
> Deploy at resource group scope.

**group validate**
> Validate template without deploying.

**group show**
> Show deployment details.

**group list**
> List deployments in a resource group.

**group delete**
> Remove deployment history entry.

**group what-if**
> Preview deployment changes.

**sub create**
> Deploy at subscription scope.

**mg create**
> Deploy at management group scope.

**tenant create**
> Deploy at tenant scope.

**--resource-group** _rg_
> Target resource group.

**--template-file** _file_
> Path to ARM template or Bicep file.

**--template-uri** _uri_
> URL to template file.

**--parameters** _params_
> Parameter values (file path or inline).

**--name** _name_
> Deployment name.

**--mode** _mode_
> Incremental or Complete.

**--location** _region_
> Required for subscription-scope deployments.

**--confirm-with-what-if**
> Show what-if and prompt before deploying.

# CAVEATS

Complete mode deletes resources not in the template; use with caution. Deployment history is limited to 800 entries per resource group (auto-deleted oldest). Template file size limit is 4 MB. Nested templates require linked deployments or template specs for larger infrastructures. Bicep files are compiled to ARM JSON before deployment.

# HISTORY

**Azure Resource Manager** templates launched in **2014** as Azure's infrastructure as code solution. The deployment commands evolved through several CLI versions. **What-if** preview functionality was added in **2020**. **Bicep**, a domain-specific language that compiles to ARM templates, reached version 1.0 in **May 2021** and has become the recommended authoring experience. Template specs for versioned, shareable templates were introduced in **2020**.

# SEE ALSO

[az](/man/az)(1), [az-group](/man/az-group)(1), [az-bicep](/man/az-bicep)(1), [az-resource](/man/az-resource)(1)
