# TAGLINE

Command-line interface for the Ghost publishing platform

# TLDR

**Start Ghost in development**

```ghost start```

**Start in production**

```ghost start --production```

**Stop Ghost**

```ghost stop```

**Restart Ghost**

```ghost restart```

**Check status**

```ghost status```

**Install Ghost**

```ghost install```

**Update Ghost**

```ghost update```

# SYNOPSIS

**ghost** _command_ [_options_]

# SUBCOMMANDS

**install**
> Install Ghost.

**start**
> Start Ghost.

**stop**
> Stop Ghost.

**restart**
> Restart Ghost.

**status**
> Show status.

**update**
> Update Ghost.

**setup**
> Configure Ghost.

**config**
> View/set configuration.

**log**
> View logs.

**doctor**
> Check installation.

# PARAMETERS

**--production**
> Run in production mode.

**-d**, **--dir** _path_
> Installation directory.

# DESCRIPTION

**ghost** is the command-line interface for Ghost, a modern open-source publishing platform built on Node.js. It provides complete lifecycle management for Ghost installations, including initial setup, updates, configuration, and process management.

The CLI automates database setup, SSL certificate installation, systemd service configuration, and nginx proxy setup. It handles migrations during updates and provides diagnostic tools through the doctor command.

# CONFIGURATION

**config.production.json**
> Production environment configuration for database, URL, mail, and server settings.

**config.development.json**
> Development environment configuration.

# SEE ALSO

[node](/man/node)(1), [npm](/man/npm)(1)
