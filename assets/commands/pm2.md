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

**pm2** is Node.js process manager. Production process management.

The tool handles clustering, logs, and monitoring. Auto-restart on crash.

pm2 manages Node.js apps.

# CAVEATS

Node.js specific. Requires npm install. Daemon-based.

# HISTORY

PM2 was created for **production Node.js** process management.

# SEE ALSO

[node](/man/node)(1), [forever](/man/forever)(1), [nodemon](/man/nodemon)(1)

