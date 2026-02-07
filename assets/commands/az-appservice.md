# TAGLINE

Manage Azure App Service plans and environments

# TLDR

**List all App Service plans**

```az appservice plan list```

**Show an App Service plan** details

```az appservice plan show --name [plan_name] --resource-group [rg_name]```

**Create an App Service plan**

```az appservice plan create --name [plan_name] --resource-group [rg_name] --sku [B1] --is-linux```

**Scale an App Service plan** tier

```az appservice plan update --name [plan_name] --resource-group [rg_name] --sku [S1]```

**Delete an App Service plan**

```az appservice plan delete --name [plan_name] --resource-group [rg_name]```

**List available locations** for App Service

```az appservice list-locations --sku [S1]```

**Show ASE (App Service Environment)** details

```az appservice ase show --name [ase_name] --resource-group [rg_name]```

# SYNOPSIS

**az appservice** _subcommand_ [_options_]

# DESCRIPTION

**az appservice** is a subcommand of the Azure CLI that manages Azure App Service plans and environments. App Service plans define the compute resources and pricing tier for hosting web apps, API apps, mobile backends, and function apps.

Plans determine the region, number of VM instances, instance size, and pricing tier (Free, Shared, Basic, Standard, Premium, Isolated). Multiple apps can share the same plan, sharing the allocated compute resources.

App Service Environments (ASE) provide fully isolated, dedicated environments for running App Service apps at high scale, with direct VNet integration and private endpoints.

# PARAMETERS

**plan list**
> List all App Service plans.

**plan show**
> Get details of a plan.

**plan create**
> Create a new App Service plan.

**plan update**
> Modify plan settings or scale tier.

**plan delete**
> Remove an App Service plan.

**list-locations**
> List regions supporting App Service.

**ase list**
> List App Service Environments.

**ase show**
> Get ASE details.

**ase create**
> Create an App Service Environment.

**--name** _name_
> Plan or ASE name.

**--resource-group** _rg_
> Resource group containing the resource.

**--sku** _sku_
> Pricing tier (F1, D1, B1, B2, B3, S1, S2, S3, P1v2, P2v2, P3v2, etc.).

**--is-linux**
> Create a Linux plan.

**--number-of-workers** _count_
> Number of instances to allocate.

**--location** _region_
> Azure region.

# CAVEATS

Deleting a plan fails if it still contains apps. Free and Shared tiers cannot scale out. Linux and Windows apps cannot share the same plan. App Service plans in different tiers have different feature availability (custom domains, SSL, deployment slots). Scaling operations may take several minutes.

# HISTORY

**Azure App Service** evolved from **Azure Web Sites**, which launched in **June 2012** as Microsoft's first PaaS web hosting service. It was renamed to **Azure App Service** in **March 2015** when it unified Web Apps, Mobile Apps, Logic Apps, and API Apps. **App Service on Linux** was introduced in **2017**. **App Service Environment v3** launched in **2021** with improved performance and simplified networking.

# SEE ALSO

[az](/man/az)(1), [az-webapp](/man/az-webapp)(1), [az-functionapp](/man/az-functionapp)(1), [az-group](/man/az-group)(1)
