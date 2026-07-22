# TAGLINE

Manage Azure App Service web applications

# TLDR

**Create** web app

```az webapp create --resource-group [MyRG] --plan [MyPlan] --name [MyApp]```

**List** web apps

```az webapp list```

**Deploy** an artifact (zip, war, jar, static file)

```az webapp deploy --name [MyApp] --resource-group [MyRG] --src-path [app.zip]```

**Enable** local git deployment

```az webapp deployment source config-local-git --name [MyApp] --resource-group [MyRG]```

**Browse** web app

```az webapp browse --name [MyApp] --resource-group [MyRG]```

**List** available runtime stacks

```az webapp list-runtimes --os-type [linux]```

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

**deploy**
> Deploy an artifact (zip, war, jar, static file) to the app

**ssh**
> Open an interactive SSH session to a Linux web app

**list-runtimes**
> List supported runtime stacks

**up**
> Create and deploy from the current local directory (deprecated; prefer create + deploy)

**--resource-group**, **-g** _name_
> Resource group name

**--name**, **-n** _name_
> Web app name (globally unique)

**--plan**, **-p** _name_
> App Service plan name or resource ID

**--runtime**, **-r** _stack_
> Runtime stack (e.g., "NODE:20LTS", "PYTHON:3.12", "JAVA:21-java21"). Run `az webapp list-runtimes` for current values.

**--deployment-container-image-name**, **-i** _image_
> Container image to deploy (e.g., myregistry.azurecr.io/image:tag)

# COMMON OPERATIONS

```bash
# Create Python web app
az webapp create -g MyRG -p MyPlan -n MyApp --runtime "PYTHON:3.12"

# Deploy from a zip artifact
az webapp deploy -g MyRG -n MyApp --src-path app.zip --type zip

# Set environment variables
az webapp config appsettings set -g MyRG -n MyApp --settings KEY=VALUE

# Enable logging
az webapp log config -g MyRG -n MyApp --application-logging filesystem --level information

# Stream logs
az webapp log tail -g MyRG -n MyApp
```

# CAVEATS

Web app names must be globally unique (used in the azurewebsites.net URL). Basic (SCM/publish-profile) authentication is disabled by default on new apps; enable it with `--basic-auth Enabled` or `az webapp auth` if your deployment tool needs it. Deployment slots require Standard tier or higher. Some runtimes are not available in all regions. Costs vary by App Service plan tier. `az webapp up` is deprecated; prefer `az webapp create` followed by `az webapp deploy`.

# HISTORY

**az webapp** has been part of Azure CLI since version 2.0 in **2017**, replacing the older Azure CLI for managing App Service web apps.

# INSTALL

```dnf: sudo dnf install azure-cli```

```pacman: sudo pacman -S azure-cli```

```zypper: sudo zypper install azure-cli```

```brew: brew install azure-cli```

```nix: nix profile install nixpkgs#azure-cli```

<!-- packages: 2026-07-22 -->
# SEE ALSO

[az](/man/az)(1), [azure-cli](/man/azure-cli)(1), [az-functionapp](/man/az-functionapp)(1), [az-appservice](/man/az-appservice)(1)

# RESOURCES

```[Documentation](https://learn.microsoft.com/en-us/cli/azure/webapp)```

```[Homepage](https://learn.microsoft.com/en-us/cli/azure/)```

```[Source code](https://github.com/Azure/azure-cli)```

<!-- verified: 2026-06-19 -->
