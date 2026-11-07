# TAGLINE

Run Waymark workflows against Postgres

# TLDR

Start a worker, with the built-in web app on port 24119

```export WAYMARK_DATABASE_URL=postgresql://postgres:postgres@localhost:5432/waymark
export WAYMARK_HTTP_ENABLED=true
uv run waymark-executor```

Build the Rust binary from a checkout

```cargo build --bin waymark-executor```

# SYNOPSIS

**waymark-executor**

# DESCRIPTION

**waymark-executor** is the Waymark node: the process that pulls workflow runs and actions from Postgres and executes them. Your application enqueues work. It does not run that work inside the web server. The binary is a Rust program (`cargo build --bin waymark-executor`). From the Python project, `uv run waymark-executor` starts the same program.

Set the database URL in the environment before starting. Set the HTTP flag to serve the built-in web app, which listens on port 24119 and shows each workflow instance, its calls, and node load. The web app is compiled into the binary, so a from-source build also needs Node.js and npm.

Workflows are ordinary async Python. Actions are the steps that can fail and be retried. The executor is what actually runs them, including sleeps that must survive a restart.

The Python package also declares a console script named **waymark-worker**. The command this project tells you to run is **waymark-executor**.

# CONFIGURATION

Database URL environment variable

> Postgres URL for the Waymark database. The usual local value is `postgresql://postgres:postgres@localhost:5432/waymark`

HTTP environment variable

> When set to true, the process also serves the web app at `http://localhost:24119`

# CAVEATS

Nothing runs until a worker is up and can see the same database the application writes to. Scheduling and retries are not performed by the Python process that called `Workflow.run`.

The name **waymark** is not the binary. Do not expect a `waymark` command on `PATH` after install.

# HISTORY

Waymark is Pierce Freeman's durable workflow runtime for Python, with a Rust executor and a web app compiled into that binary. The source repository is piercefreeman/waymark. The project site is waymark.sh.

# SEE ALSO

[cargo](/man/cargo)(1), [python3](/man/python3)(1)

# RESOURCES

```[Source code](https://github.com/piercefreeman/waymark)```

```[Homepage](https://waymark.sh)```

```[Documentation](https://waymark.sh/guides/webapp)```

<!-- verified: 2026-11-07 -->
