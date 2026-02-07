# TAGLINE

multi-container Docker orchestration

# TLDR

**Start** services

```docker-compose up```

**Start** in background

```docker-compose up -d```

**Stop** services

```docker-compose down```

**View** logs

```docker-compose logs```

**Build** services

```docker-compose build```

**List** containers

```docker-compose ps```

# SYNOPSIS

**docker-compose** [_options_] _command_

# DESCRIPTION

**docker-compose** is a tool for defining and running multi-container Docker applications using YAML configuration files. Instead of managing multiple docker run commands with complex flags, Compose lets you declare your entire application stack in a single docker-compose.yml file.

The tool handles service orchestration, networking, volume management, and dependencies between containers. It automatically creates isolated networks for your application, manages startup order through depends_on directives, and provides convenient commands for viewing logs, executing commands, and managing the entire application lifecycle.

Docker Compose is essential for local development environments where applications require multiple services (web server, database, cache, queue). It ensures consistency across development teams and simplifies the transition from development to production. Modern Docker includes Compose V2 as a native plugin (docker compose) replacing the standalone docker-compose command.

# PARAMETERS

**up** [**-d**]
> Create and start containers

**down**
> Stop and remove containers, networks

**build**
> Build or rebuild services

**start**
> Start services

**stop**
> Stop services

**restart**
> Restart services

**ps**
> List containers

**logs** [**-f**]
> View output from containers

**exec** _service_ _command_
> Execute command in running container

**pull**
> Pull service images

**config**
> Validate and view compose file

# DOCKER-COMPOSE.YML

```yaml
version: '3.8'

services:
  web:
    build: .
    ports:
      - "3000:3000"
    environment:
      - DATABASE_URL=postgres://db/myapp
    depends_on:
      - db
    volumes:
      - .:/app

  db:
    image: postgres:15
    environment:
      POSTGRES_DB: myapp
      POSTGRES_PASSWORD: secret
    volumes:
      - pgdata:/var/lib/postgresql/data

volumes:
  pgdata:
```

# WORKFLOW

```bash
# Start all services
docker-compose up

# Start in background
docker-compose up -d

# View logs
docker-compose logs -f

# Stop services
docker-compose down

# Rebuild and start
docker-compose up --build

# Execute command
docker-compose exec web bash

# Run one-off command
docker-compose run web npm test

# Scale service
docker-compose up --scale worker=3
```

# COMMON OPERATIONS

```bash
# Check status
docker-compose ps

# Pull latest images
docker-compose pull

# View configuration
docker-compose config

# Remove volumes
docker-compose down -v

# Restart single service
docker-compose restart web

# View logs for service
docker-compose logs -f web

# Execute in service
docker-compose exec db psql -U postgres
```

# FEATURES

- Multi-container orchestration
- Network isolation
- Volume management
- Environment variable handling
- Service dependencies
- Health checks
- Resource limits

# FILE LOCATIONS

Default file names (in order):
1. docker-compose.override.yml
2. docker-compose.yml

Custom file:
```bash
docker-compose -f custom-compose.yml up
```

# CONFIGURATION

**docker-compose.yml**
> Main configuration file defining services, networks, volumes, and their relationships. Placed in project root directory.

**docker-compose.override.yml**
> Optional override file automatically loaded alongside docker-compose.yml for local customizations without modifying the main file.

**.env**
> Environment variables file automatically loaded by Docker Compose to populate variable substitutions in compose files.

# CAVEATS

Not for production orchestration (use Kubernetes). File format versions matter. Environment variables need proper quoting. Network isolation can complicate debugging. Volume permissions issues. Compose V2 (docker compose) vs V1 (docker-compose) differences.

# HISTORY

**docker-compose** was created by Orchard Labs (acquired by Docker) around **2014** as Fig, becoming Docker Compose and integral to Docker development workflows.

# SEE ALSO

[docker](/man/docker)(1), [kubernetes](/man/kubernetes)(1), [podman-compose](/man/podman-compose)(1)
