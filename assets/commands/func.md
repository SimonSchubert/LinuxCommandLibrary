# TAGLINE

Azure Functions development CLI

# TLDR

**Create new function**

```func new```

**Start local server**

```func start```

**Deploy to Azure**

```func azure functionapp publish [appname]```

**Create function from** template

```func new --template "[HTTP trigger]" --name [MyFunction]```

**List templates**

```func templates list```

# SYNOPSIS

**func** _command_ [_options_]

# PARAMETERS

_COMMAND_
> Operation: new, start, deploy, init, etc.

**new**
> Create new function.

**start**
> Start local Functions host.

**init**
> Initialize function project.

**azure functionapp publish** _NAME_
> Deploy to Azure.

**templates list**
> Show available templates.

**--help**
> Display help information.

# CONFIGURATION

**local.settings.json**
> Local development settings for runtime, connections, and app settings.

**host.json**
> Global configuration for all functions in a function app.

# DESCRIPTION

**func** is the Azure Functions Core Tools CLI for developing serverless functions locally. It creates, runs, and deploys Azure Functions across multiple languages.

The tool provides local development with debugging support, mimicking the Azure environment. It handles project scaffolding, dependency management, and deployment workflows.

func supports JavaScript, Python, C#, Java, and other languages for Azure Functions development.

# CAVEATS

Requires Azure account for deployment. Local emulator has limitations. Language support varies by version.

# HISTORY

func is part of **Azure Functions Core Tools** from Microsoft, enabling local development of serverless functions for the Azure platform.

# SEE ALSO

[az](/man/az)(1), [dotnet](/man/dotnet)(1)
