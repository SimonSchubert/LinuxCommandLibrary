# TAGLINE

Local memory of successful coding-agent tasks, served back as short pointers

# TLDR

**Create** the local data directory

```musclememory init```

**Start** the background service

```musclememory start```

**Show** whether it is up

```musclememory status```

**Connect** the Claude agent in this project

```musclememory connect [claude]```

**Print** the dashboard link instead of opening a browser

```musclememory dashboard --no-browser```

**Export** a ready skill for Claude

```musclememory export [my-skill] --to [claude]```

# SYNOPSIS

**musclememory** _command_ [_options_]

# COMMANDS

**init** [**--port** _N_] [**--namespace** _NAME_]
> Create **~/.musclememory**. The default port is **8080** and the default namespace is **default**.

**start**
> Start the local service in the background.

**stop**
> Stop that service.

**status**
> Print whether the service is running.

**connect** _AGENT_ [**--project** _DIR_] [**--browser**]
> Attach an agent to the current project (default **.**). _AGENT_ is **claude**, **codex**, **cursor**, or **cleanslate**. **--browser** opens the dashboard.

**dashboard** [**--no-browser**]
> Open the sign-in page. **--no-browser** prints the link.

**export** _SKILL_ **--to** _codex_|_claude_
> Write a ready skill as a skill file for that agent.

**serve** [**--host** _ADDR_] [**--port** _N_]
> Serve the REST API and Streamable HTTP on this process. The default bind is **127.0.0.1:8080**.

**stdio** [**--migrate**] [**--url** _URL_] [**--config** _FILE_]
> Speak the Model Context Protocol on standard input and output. A local server uses the API key in the environment. **--url** or **--config** talks to a gateway instead, and **--migrate** is rejected in that mode.

**browser** **--config** _FILE_
> MCP server for the browser tools. Optional **--show**, **--no-skills**, and **--log** _PATH_.

**doctor**
> Print JSON with the database revision, the embedding provider, and the guidance token budget.

**key** [**--tenant** _ID_] [**--namespace** _NAME_] [**--label** _TEXT_] [**--permissions** _LIST_]
> Mint an API key and print it once. Tenant and namespace default to the local config. The default label is **agent** and the default permissions are **read,write**.

**migrate**
> Apply database migrations from settings.

**reindex** **--namespace** _NAME_
> Rebuild the index for one namespace. This needs the API key in the environment.

**purge**
> Delete expired execution traces.

**hooks** _ACTION_ **--config** _JSON_
> Agent hook entrypoint. _ACTION_ is **install**, **receive**, **list**, **flush**, **repair**, **attest**, **reconcile**, **learn**, or **purge**. **--config** is required and must not embed an API key. **--client** is **claude**, **codex**, **cursor**, or **all** (default **claude**; **all** is only valid for **install**). **--project** defaults to **.**. **attest**, **reconcile**, and **learn** require **--run**. **reconcile** also requires **--receipts**. **--older-days** defaults to **7** and must be at least **1**.

# DESCRIPTION

**musclememory** records what a coding agent did and, after a task really succeeds, keeps a short pointer for the next similar task: which files changed, how to check the result, and what to avoid. The agent still decides what to edit. The console script is **musclememory** (package **thewariend-musclememory**). It needs Python 3.12 or newer.

**init**, **start**, **stop**, **status**, **connect**, **dashboard**, and **export** are the local workflow. They talk to a service under **~/.musclememory**. **serve** is that HTTP service in the foreground. **stdio** and **browser** are MCP servers for agents that speak the protocol directly.

A ready skill can be exported for Claude or Codex. New skills stay pending until they are approved. Set this to approve them without a prompt:

```
MM_AUTO_APPROVE=true musclememory start
```

**reindex** and the gateway form of **stdio** read the API key from the environment:

```
MM_API_KEY=... musclememory reindex --namespace default
```

# CAVEATS

A command is required. **key** prints the secret once; it is not shown again. **hooks --config** is a JSON blob of settings, not a place to paste an API key. **stdio --migrate** only applies to the local server. **hooks** **--client all** is only accepted for **install**.

# HISTORY

**musclememory** is published by TheWariend. It is written in Python and licensed under Apache-2.0.

# SEE ALSO

[claude](/man/claude)(1), [codex](/man/codex)(1)

# RESOURCES

```[Source code](https://github.com/TheWariend/MuscleMemory)```

```[Homepage](https://thewariend.com/musclememory)```

```[Documentation](https://github.com/TheWariend/MuscleMemory/blob/main/docs/how-it-works.md)```

<!-- verified: 2026-10-27 -->
