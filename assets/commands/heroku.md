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
> Environment variables.

**-a**, **--app** _APP_
> Target application.

**--help**
> Display help information.

# DESCRIPTION

**heroku** is the CLI for Heroku platform-as-a-service. It manages applications, addons, and infrastructure on Heroku cloud.

The tool handles deployment, scaling, logging, and configuration. It integrates with Git for deployments and supports multiple languages.

# CAVEATS

Requires Heroku account. Some features require payment. Rate limits apply.

# HISTORY

Heroku CLI was developed by **Salesforce** to manage applications on the Heroku platform, first launched in **2007**.

# SEE ALSO

[git](/man/git)(1), [docker](/man/docker)(1), [flyctl](/man/flyctl)(1)
