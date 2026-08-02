# TAGLINE

CLI for accountable multi-agent AI teams with a local web console

# TLDR

**Install** with pipx and initialize

```pipx install banksia```

```banksia init```

**Start** the local controller and open the console

```banksia serve```

**Show** status (also the default with no subcommand)

```banksia```

```banksia status```

**Configure** a Task provider

```banksia setup```

```banksia providers list```

**Optional PostgreSQL** install path

```pipx install "banksia[postgres]"```

```banksia init --database-url [postgresql+asyncpg://…]```

# SYNOPSIS

**banksia** [**--debug**] [**-V**|**--version**] [_subcommand_] [_options_]

# DESCRIPTION

**banksia** is a command-line application and local runtime for building and running **accountable AI teams** on complex work. Workflows define a responsibility tree (not a fixed script). Managers can replan, parallelize, or iterate; progress and the lead's final Result are durable controller state, with deliverables kept as ordinary workspace files.

The package ships a visual **Console** (browser UI). After **banksia init** and **banksia serve**, open **http://127.0.0.1:18125/** (default). Initialization can configure a Task provider and an optional conversational **Operator** that uses the same controller operations as the UI. Default storage is **SQLite**; PostgreSQL is optional via **banksia[postgres]**.

Managed providers include Codex and Claude. Requires **Python 3.12+**; Linux and macOS are supported (native Windows is not; WSL2 uses the Linux path). Install with **pipx install banksia**.

# PARAMETERS

**(no subcommand)** / **status**
> Print controller status (default when no subcommand is given).

**init** [**--data-dir** _dir_] [**--database-url** _url_] [**--workspace** _dir_] [**--host** _addr_] [**--port** _n_] [**--log-level** _level_] [**--force**] [**--skip-db-upgrade**] [**--non-interactive**] …
> Initialize local controller state; optionally configure Task provider and Operator.

**serve**
> Start the local API/controller process that serves the Console and runtime.

**setup**
> Guided provider setup for Task work.

**providers** **list**|**status**|**check**|**configure**|**identity**|**set-default** …
> Inspect and configure LLM/providers.

**operator** **setup**|**status**|**disable** …
> Manage the conversational Operator agent.

**config** **show**|**path** …
> Show configuration or its path.

**workflow** **import**|**export** …
> Import or export Workflow definitions.

**task** **start** …
> Start a Task/run from the CLI.

**--debug**
> Include a traceback when a command fails.

**-V**, **--version**
> Print package version.

# CONFIGURATION

**Local data directory** (set during **init** / **--data-dir**)
> Controller state, SQLite database by default, and runtime files.

**--database-url**
> SQLAlchemy URL for PostgreSQL (e.g. **postgresql+asyncpg://…**). Requires the **postgres** extra.

**--host** / **--port**
> Bind address for the local API (default loopback and project default port **18125**).

**Default workspace**
> Directory visible to Task members for files and managed actions.

# CAVEATS

Intended for a trusted local machine; the controller binds to loopback by default. Task members in a run share one provider-visible workspace. Console assets under **console/** use a Sustainable Use License (not pure MIT). Not a multi-tenant hosted service. Provider CLIs/SDKs and API credentials must be available for real runs.

# HISTORY

**Banksia** is an open-source accountable multi-agent runtime (MIT for the core; Console derived material under Sustainable Use License). Upstream: **github.com/ringlochid/banksia**. Distributed on PyPI as **banksia**.

# SEE ALSO

[pipx](/man/pipx)(1), [claude](/man/claude)(1), [codex](/man/codex)(1), [uvicorn](/man/uvicorn)(1)

# RESOURCES

```[Source code](https://github.com/ringlochid/banksia)```

```[Documentation](https://github.com/ringlochid/banksia/tree/main/docs)```

<!-- verified: 2026-08-02 -->
