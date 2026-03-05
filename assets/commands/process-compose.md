# TAGLINE

Scheduler and orchestrator for non-containerized applications

# TLDR

**Start all processes defined in process-compose.yaml**

```process-compose```

**Start with a specific config file**

```process-compose -f [path/to/config.yaml]```

**Run in headless mode with API**

```process-compose --tui=false```

# SYNOPSIS

**process-compose** [_options_] [_command_]

# DESCRIPTION

**process-compose** is a simple and flexible scheduler and orchestrator for managing non-containerized applications. Its configuration syntax follows the docker-compose style using YAML. It offers a TUI and CLI mode, process recovery policies, dependency management, per-process environment variables, log caching, scheduled processes (cron and interval-based), namespace support, process replicas, REST API with token authentication, and themes.

# HISTORY

**process-compose** was created by **F1bonacc1** and is written in **Go**.

# SEE ALSO

[docker-compose](/man/docker-compose)(1), [supervisord](/man/supervisord)(1), [mprocs](/man/mprocs)(1)
