# TAGLINE

Production process manager for Node.js

# TLDR

**Start application**

```pm2 start [app.js]```

**Start with name**

```pm2 start [app.js] --name "[app_name]"```

**List processes**

```pm2 list```

**Stop process**

```pm2 stop [name|id]```

**Restart process**

```pm2 restart [name|id]```

**View logs**

```pm2 logs```

**Monitor processes**

```pm2 monit```

# SYNOPSIS

**pm2** [_command_] [_options_]

# PARAMETERS

**start** _APP_
> Start application.

**stop** _ID_
> Stop process.

**restart** _ID_
> Restart process.

**list**
> List processes.

**logs**
> View logs.

**monit**
> Monitor dashboard.

**--name** _NAME_
> Process name.

# DESCRIPTION

**pm2** is a production process manager for Node.js applications. It keeps applications running continuously with automatic restart on crashes, built-in load balancing via cluster mode, and centralized log management.

The tool provides a monitoring dashboard (**monit**), process listing, log viewing, and startup script generation for system boot persistence. It can manage multiple applications simultaneously, each with independent configurations for instances, environment variables, and restart strategies.

# CONFIGURATION

**ecosystem.config.js**
> Application configuration file defining processes, environment variables, and deployment settings.

**~/.pm2/**
> PM2 home directory containing logs, process database, and module data.

**PM2_HOME**
> Environment variable to override the default PM2 home directory.

# CAVEATS

Node.js specific. Requires npm install. Daemon-based.

# HISTORY

PM2 was created for **production Node.js** process management.

# SEE ALSO

[node](/man/node)(1), [forever](/man/forever)(1), [nodemon](/man/nodemon)(1)

