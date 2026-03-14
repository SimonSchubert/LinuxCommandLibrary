# TAGLINE

CLI for Heroku platform-as-a-service

# TLDR

**Login**

```heroku login```

**Create app**

```heroku create [app-name]```

**Deploy via Git**

```git push heroku main```

**View logs**

```heroku logs --tail```

**Open app**

```heroku open```

**Run command on dyno**

```heroku run [bash]```

**Scale dynos**

```heroku ps:scale web=[2]```

**Set environment variable**

```heroku config:set [KEY]=[VALUE] -a [app-name]```

**List apps**

```heroku apps```

# SYNOPSIS

**heroku** _command_ [_options_]

# PARAMETERS

_COMMAND_
> Subcommand to execute.

**login**
> Authenticate with Heroku.

**create**
> Create new application.

**logs**
> View application logs.

**run**
> Run one-off command.

**ps**
> Process management.

**config**
> Manage environment variables.

**addons**
> Manage add-ons.

**apps**
> Manage applications.

**-a**, **--app** _APP_
> Target application name.

**-r**, **--remote** _REMOTE_
> Git remote of app to use.

**--help**
> Display help information.

# DESCRIPTION

**heroku** is the CLI for Heroku platform-as-a-service. It manages applications, addons, and infrastructure on Heroku cloud.

The tool handles deployment, scaling, logging, and configuration. It integrates with Git for deployments and supports multiple languages.

# CAVEATS

Requires Heroku account. Some features require payment. Rate limits apply.

# HISTORY

Heroku was originally launched in **2007** for Ruby applications and was acquired by **Salesforce** in **2010**. The CLI tool provides command-line management of the platform.

# SEE ALSO

[git](/man/git)(1), [docker](/man/docker)(1), [flyctl](/man/flyctl)(1)
