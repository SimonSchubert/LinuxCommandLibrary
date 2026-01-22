# TLDR

**Create** web app

```az webapp create --resource-group [MyRG] --plan [MyPlan] --name [MyApp]```

**List** web apps

```az webapp list```

**Deploy** from local git

```az webapp deployment source config-local-git --name [MyApp] --resource-group [MyRG]```

**Browse** web app

```az webapp browse --name [MyApp] --resource-group [MyRG]```

**Show** logs

```az webapp log tail --name [MyApp] --resource-group [MyRG]```

**Restart** web app

```az webapp restart --name [MyApp] --resource-group [MyRG]```

# SYNOPSIS

**az webapp** _command_ [_options_]

# DESCRIPTION

**az webapp** manages Azure App Service web applications. It provides commands for creating, deploying, configuring, and monitoring web apps across multiple platforms including .NET, Node.js, Python, PHP, and Java.

The command group enables full web application lifecycle management without using the portal.

# PARAMETERS

**create**
> Create web app

**list**
> List web apps

**delete**
> Delete web app

**restart**
> Restart web app

**stop**
> Stop web app

**start**
> Start web app

**show**
> Show web app details

**browse**
> Open web app in browser

**--resource-group**, **-g** _name_
> Resource group name

**--name**, **-n** _name_
> Web app name

**--plan**, **-p** _name_
> App Service plan

**--runtime**
> Runtime stack (e.g., "NODE:18-lts", "PYTHON:3.11")

# COMMON OPERATIONS

```bash
# Create Python web app
az webapp create -g MyRG -p MyPlan -n MyApp --runtime "PYTHON:3.11"

# Deploy from zip
az webapp deployment source config-zip -g MyRG -n MyApp --src app.zip

# Set environment variables
az webapp config appsettings set -g MyRG -n MyApp --settings KEY=VALUE

# Enable logging
az webapp log config -g MyRG -n MyApp --application-logging filesystem --level information

# Stream logs
az webapp log tail -g MyRG -n MyApp
```

# CAVEATS

Web app names must be globally unique (used in azurewebsites.net URL). Deployment slots require higher tier plans. Some runtimes not available in all regions. Costs vary by App Service plan tier.

# HISTORY

**az webapp** has been part of Azure CLI since version 2.0 in **2017**, replacing the older Azure CLI for managing App Service web apps.

# SEE ALSO

[az](/man/az)(1), [az-functionapp](/man/az-functionapp)(1), [az-appservice](/man/az-appservice)(1)
