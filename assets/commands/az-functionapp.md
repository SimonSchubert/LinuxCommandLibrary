# TLDR

**List all function apps**

```az functionapp list```

**Create a function app** (consumption plan)

```az functionapp create --resource-group [rg_name] --consumption-plan-location [eastus] --runtime [node] --functions-version [4] --name [app_name] --storage-account [storage_name]```

**Create a function app** on an App Service plan

```az functionapp create --resource-group [rg_name] --plan [plan_name] --runtime [python] --runtime-version [3.11] --functions-version [4] --name [app_name] --storage-account [storage_name]```

**Show function app details**

```az functionapp show --name [app_name] --resource-group [rg_name]```

**Deploy code** from a zip file

```az functionapp deployment source config-zip --name [app_name] --resource-group [rg_name] --src [function.zip]```

**Restart a function app**

```az functionapp restart --name [app_name] --resource-group [rg_name]```

**View application settings**

```az functionapp config appsettings list --name [app_name] --resource-group [rg_name]```

**Set an application setting**

```az functionapp config appsettings set --name [app_name] --resource-group [rg_name] --settings "[KEY=value]"```

# SYNOPSIS

**az functionapp** _subcommand_ [_options_]

# DESCRIPTION

**az functionapp** is a subcommand of the Azure CLI that manages Azure Functions apps. Azure Functions is a serverless compute service that runs event-triggered code without managing infrastructure.

Function apps host one or more functions that share configuration, deployment, and scaling. They can run on consumption plans (pay per execution, auto-scale), premium plans (pre-warmed instances, VNet integration), or dedicated App Service plans.

Supported runtimes include .NET, Node.js, Python, Java, PowerShell, and custom handlers. Functions can be triggered by HTTP requests, timers, queues, blobs, Event Grid, and other Azure services.

# PARAMETERS

**list**
> List all function apps.

**create**
> Create a new function app.

**delete**
> Remove a function app.

**show**
> Get function app details.

**restart**
> Restart the function app.

**start**
> Start a stopped function app.

**stop**
> Stop a running function app.

**deployment source config-zip**
> Deploy from zip file.

**config appsettings list**
> List application settings.

**config appsettings set**
> Set application settings.

**function list**
> List functions in the app.

**--name** _name_
> Function app name (globally unique).

**--resource-group** _rg_
> Resource group name.

**--consumption-plan-location** _location_
> Region for consumption plan.

**--plan** _plan_
> App Service plan name.

**--runtime** _runtime_
> Language runtime (node, python, dotnet, java, powershell).

**--runtime-version** _version_
> Runtime version.

**--functions-version** _version_
> Azure Functions runtime version (4).

**--storage-account** _storage_
> Storage account for function state.

# CAVEATS

Function app names must be globally unique. Consumption plan has cold start latency. Storage account is required for triggers and state. Some features like VNet integration require Premium or App Service plans. Linux consumption plan has limited region availability. Functions version 4 requires runtime-specific version compatibility.

# HISTORY

**Azure Functions** launched in **March 2016** as Microsoft's serverless compute platform, inspired by AWS Lambda. **Durable Functions** for stateful workflows was added in **2017**. **Premium plan** was introduced in **2019** for enterprise scenarios. **Functions 4.0** with .NET 6 support released in **November 2021**. The service has expanded to support containers, Kubernetes via KEDA, and Azure Arc for hybrid deployments.

# SEE ALSO

[az](/man/az)(1), [az-appservice](/man/az-appservice)(1), [az-storage](/man/az-storage)(1), [func](/man/func)(1)
