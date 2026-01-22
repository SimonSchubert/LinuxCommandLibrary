# TLDR

**Login to Railway**

```railway login```

**Initialize a new project**

```railway init```

**Link to an existing Railway project**

```railway link```

**Deploy the current directory**

```railway up```

**Run a command with Railway environment variables**

```railway run [command]```

**Open a shell with Railway environment variables**

```railway shell```

**View project logs**

```railway logs```

**Open the project in the Railway dashboard**

```railway open```

# SYNOPSIS

**railway** _command_ [_options_]

# PARAMETERS

**login**
> Authenticate with Railway

**logout**
> Log out of Railway

**init**
> Create a new Railway project

**link**
> Link current directory to an existing Railway project

**up**
> Deploy the current directory to Railway

**run** _command_
> Run a local command with Railway environment variables injected

**shell**
> Open a new shell with Railway environment variables

**logs**
> View deployment logs

**open**
> Open the project in the Railway web dashboard

**status**
> Show the status of the linked project

**variables**
> Manage environment variables

**service**
> Manage services within a project

**volume**
> Manage persistent volumes

**domain**
> Manage custom domains

**ssh**
> Open an SSH session to a deployed service

**--help**, **-h**
> Display help information

**--version**, **-v**
> Display version number

# DESCRIPTION

**railway** is the command-line interface for Railway, a cloud platform for deploying and hosting applications. It enables developers to deploy code, manage environment variables, and interact with Railway projects directly from the terminal.

The CLI supports zero-configuration deployments by automatically detecting project types and configuring build settings. It integrates with git workflows and can deploy from local directories or connected repositories.

A key feature is the ability to run local development with production environment variables using **railway run**, ensuring consistency between development and deployed environments.

# CAVEATS

Requires a Railway account and authentication via **railway login** before most commands work.

Projects must be linked with **railway link** or initialized with **railway init** before deployment commands can be used in a directory.

Free tier has resource limitations. Check Railway's pricing documentation for deployment limits and usage quotas.

# HISTORY

Railway was founded in **2020** as a modern alternative to traditional Platform-as-a-Service providers. The CLI was developed alongside the platform to provide a developer-friendly deployment experience with minimal configuration. The tool is open source and actively maintained on GitHub.

# SEE ALSO

[docker](/man/docker)(1), [heroku](/man/heroku)(1), [fly](/man/fly)(1), [vercel](/man/vercel)(1)
