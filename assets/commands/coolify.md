# TLDR

**Install Coolify** on a server

```curl -fsSL https://get.coolify.io | bash```

**Start Coolify** services

```coolify start```

**Stop Coolify** services

```coolify stop```

**Restart Coolify** services

```coolify restart```

**Check Coolify status**

```coolify status```

**Update Coolify** to latest version

```coolify upgrade```

**View Coolify logs**

```coolify logs```

# SYNOPSIS

**coolify** _command_ [_options_]

# PARAMETERS

**start**
> Start all Coolify services and containers.

**stop**
> Stop all Coolify services.

**restart**
> Restart all Coolify services.

**status**
> Show current status of Coolify services.

**upgrade**
> Upgrade Coolify to the latest version.

**logs**
> Display logs from Coolify services.

**backup**
> Create a backup of Coolify configuration and data.

**restore**
> Restore Coolify from a backup.

**--help**
> Display help information.

# DESCRIPTION

**Coolify** is an open-source, self-hostable alternative to Heroku, Netlify, and Vercel. It provides a platform for deploying applications, databases, and services on your own infrastructure with minimal configuration.

The platform supports multiple deployment methods including Git-based deployments, Docker images, and docker-compose files. It handles SSL certificates automatically via Let's Encrypt, provides built-in monitoring, and supports popular databases like PostgreSQL, MySQL, MongoDB, and Redis.

Coolify is designed for developers and teams who want the convenience of PaaS platforms while maintaining control over their infrastructure and data. It runs on Docker and can be installed on any Linux server with minimal requirements.

# CAVEATS

Requires Docker and Docker Compose installed on the host system. Initial installation needs root access. Resource requirements depend on the number of applications deployed. Some advanced features may require additional configuration.

# HISTORY

Coolify was created by Andras Bacsai as an open-source PaaS solution. Development began around **2021**, inspired by the need for self-hosted alternatives to commercial platforms. It has grown to support various application types and gained popularity in the self-hosting community.

# SEE ALSO

[docker](/man/docker)(1), [docker-compose](/man/docker-compose)(1), [dokku](/man/dokku)(1)
