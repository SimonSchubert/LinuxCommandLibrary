# TLDR

**Start a quickstart all-in-one** Concourse instance

```concourse quickstart --add-local-user [admin]:[password] --main-team-local-user [admin]```

**Start the web node** with PostgreSQL

```concourse web --postgres-host [localhost] --postgres-user [concourse] --postgres-password [password]```

**Start a worker node**

```concourse worker --work-dir [/var/lib/concourse/worker] --tsa-host [127.0.0.1:2222]```

**Generate encryption keys** for secure communication

```concourse generate-key -t rsa -f [/path/to/session_signing_key]```

**Run database migrations**

```concourse migrate --postgres-host [localhost] --postgres-user [concourse]```

**Retire a worker** gracefully

```concourse retire-worker --name [worker-name]```

**Display help** for a command

```concourse [web|worker|quickstart] --help```

# SYNOPSIS

**concourse** _COMMAND_ [_OPTIONS_]

# COMMANDS

**quickstart**
> Start an all-in-one Concourse instance with web and worker components.

**web**
> Start the Concourse web node (ATC/TSA).

**worker**
> Start a Concourse worker node.

**migrate**
> Run database migrations.

**generate-key**
> Generate encryption keys for Concourse components.

**land-worker**
> Safely drain and stop a worker.

**retire-worker**
> Remove a worker from the cluster.

# PARAMETERS

**--add-local-user** _USER_:_PASSWORD_
> Add a local user for authentication.

**--main-team-local-user** _USER_
> Grant main team access to a local user.

**--postgres-host** _HOST_
> PostgreSQL server hostname.

**--postgres-user** _USER_
> PostgreSQL username.

**--postgres-password** _PASSWORD_
> PostgreSQL password.

**--external-url** _URL_
> Externally reachable URL of the Concourse web UI.

**--work-dir** _PATH_
> Directory for worker to store container data.

**--tsa-host** _HOST_:_PORT_
> TSA host for worker registration (default: 127.0.0.1:2222).

**--runtime** _RUNTIME_
> Container runtime to use (guardian or containerd).

**--help**
> Display help for the command.

# DESCRIPTION

**Concourse** is a container-based continuous integration system. The concourse CLI is used to run and manage Concourse server components including the web node (ATC for scheduling, TSA for worker registration) and worker nodes (for running pipeline tasks).

All configuration is defined via flags or environment variables. Each flag has a corresponding env var with the format **CONCOURSE_FLAG_NAME** (uppercase, underscores instead of dashes).

For typical usage, the **quickstart** command provides an all-in-one setup suitable for development. Production deployments typically run separate web and worker processes, often on different machines.

Users interact with Concourse through the **fly** CLI, not the concourse command directly.

# CAVEATS

The quickstart command is intended for development and testing, not production. Production deployments require separate web and worker nodes with proper security configuration including TLS certificates and key management. Worker nodes need sufficient disk space and container runtime permissions.

# HISTORY

Concourse was created at Pivotal (now VMware Tanzu) and first released in **2014**. It was designed as a "pipeline-based" CI/CD system where everything is configured as code. Unlike traditional CI systems, Concourse has no plugins—all functionality comes from resources (versioned artifacts) and tasks (scripts in containers). The project was open-sourced and continues active development on GitHub.

# SEE ALSO

[fly](/man/fly)(1), [docker](/man/docker)(1), [podman](/man/podman)(1), [jenkins](/man/jenkins)(1)
