# TLDR

**Start Traefik** with default configuration

```traefik```

**Start with a specific config file**

```traefik --configFile=[traefik.yml]```

**Enable Docker provider**

```traefik --providers.docker```

**Enable Docker with specific endpoint**

```traefik --providers.docker.endpoint=unix:///var/run/docker.sock```

**Set entrypoint** for HTTP traffic

```traefik --entrypoints.web.address=:80```

**Enable the API dashboard**

```traefik --api.dashboard=true```

**Check health status**

```traefik healthcheck```

**Display help**

```traefik --help```

# SYNOPSIS

**traefik** [_command_] [_options_]

# PARAMETERS

**--configFile** _file_
> Load configuration from specified file (traefik.yml, traefik.toml).

**--providers.docker**
> Enable Docker provider for automatic service discovery.

**--providers.docker.endpoint** _endpoint_
> Docker daemon endpoint (e.g., unix:///var/run/docker.sock).

**--providers.file.filename** _file_
> Enable file provider with configuration file.

**--entrypoints.**_name_**.address** _address_
> Define entrypoint address (e.g., :80, :443).

**--api.dashboard**
> Enable the web dashboard.

**--api.insecure**
> Allow insecure access to API (for development).

**--log.level** _level_
> Log level: DEBUG, INFO, WARN, ERROR.

**--accesslog**
> Enable access logging.

**--certificatesresolvers.**_name_**.acme.email** _email_
> Email for Let's Encrypt certificates.

**healthcheck**
> Check Traefik health via /ping endpoint.

**version**
> Display version information.

**--help**
> Display help message.

# DESCRIPTION

**Traefik** is a modern HTTP reverse proxy and load balancer designed for microservices. It automatically discovers services through providers like Docker, Kubernetes, and Consul, and configures routing rules dynamically.

Key features include automatic HTTPS with Let's Encrypt, load balancing, circuit breakers, rate limiting, and metrics. Configuration can be provided via files (YAML, TOML), environment variables, or command-line flags.

The web dashboard provides real-time visibility into routers, services, and middlewares. Traefik integrates natively with container orchestrators and service meshes.

# CAVEATS

The API dashboard should not be exposed publicly without authentication. For Docker provider, Traefik needs access to the Docker socket, which has security implications. Let's Encrypt rate limits apply when using ACME for certificates.

# HISTORY

Traefik was created by **Emile Vauge** and first released in **2015** by **Traefik Labs** (formerly Containous). It was designed specifically for the cloud-native era and microservices architectures. Traefik 2.0, released in **2019**, introduced a new routing architecture with routers, services, and middlewares. It has become one of the most popular reverse proxies for container environments.

# SEE ALSO

[nginx](/man/nginx)(1), [caddy](/man/caddy)(1), [haproxy](/man/haproxy)(1), [docker](/man/docker)(1)
