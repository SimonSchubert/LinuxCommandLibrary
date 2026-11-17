# TAGLINE

Serve a local-first task manager from one binary

# TLDR

Run the **published image** and open port 8080

```docker run -d -p 8080:8080 -v opentodo-data:/data ghcr.io/opentodoapp/opentodo:stable```

Require a **setup code** before the first account exists

```OPENTODO_SETUP_CODE=required docker run -d -p 8080:8080 -v opentodo-data:/data ghcr.io/opentodoapp/opentodo:stable```

Tell the server its **public URL**

```OPENTODO_BASE_URL=https://todo.example.com docker run -d -p 8080:8080 -v opentodo-data:/data ghcr.io/opentodoapp/opentodo:stable```

Run a **release binary**. It listens on port 8080 and stores data in `./data`

```./opentodo```

Build from a checkout and run it

```make build && ./bin/opentodo```

# SYNOPSIS

**opentodo**

# DESCRIPTION

**opentodo** is the OpenTodo server: one Go binary plus SQLite. It serves the web app, the REST API, and sync on port 8080. The first visit creates an account when no setup code is required.

The container image is `ghcr.io/opentodoapp/opentodo`, published for `linux/amd64` and `linux/arm64`. Tag `stable` tracks the latest release, `1` tracks the 1.x line, and `latest` tracks the main branch. Data in the example above is the Docker volume `opentodo-data`, mounted at `/data`.

A release binary is named `opentodo` plus the OS and architecture. It keeps its data in `./data` next to the process. Building from source needs Go 1.26 or newer and Node.js 22 or newer: `make build` writes `./bin/opentodo`.

The server does not include the [ot](/man/ot)(1) client. Install that separately.

Nothing is required to start. Further settings are environment variables documented in the project's configuration reference. Two that the install guide names:

```OPENTODO_SETUP_CODE```

Set to `required` so a server that is reachable from the network cannot be claimed by the first visitor.

```OPENTODO_BASE_URL```

Public URL when the server sits behind a reverse proxy.

# CAVEATS

An open port with no setup code lets the first visitor create the owner account. Set a setup code before publishing the port. The process can read and write its data directory. The image is not a distro package.

# SEE ALSO

[ot](/man/ot)(1), [docker](/man/docker)(1), [curl](/man/curl)(1)

# RESOURCES

```[Source code](https://github.com/OpenTodoApp/OpenTodo)```

```[Homepage](https://open-todo.app)```

```[Documentation](https://open-todo.app/docs/)```

<!-- verified: 2026-11-17 -->
