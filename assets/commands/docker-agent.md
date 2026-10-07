# TAGLINE

Run YAML-defined AI agents from the Docker CLI

# TLDR

**Chat** with the default agent

```docker-agent run```

Run a **config file**

```docker-agent run [agent.yaml]```

Run **headless** and print only the final answer

```docker-agent run --exec --last [agent.yaml] "[Summarise this repository]"```

**Create** a new agent interactively

```docker-agent new```

Set up a **model** (API key, Docker Model Runner, or custom endpoint)

```docker-agent setup```

Check **credentials and models**

```docker-agent doctor```

Push an agent to an **OCI registry**

```docker-agent share push [./agent.yaml] [docker.io/user/my-agent:latest]```

Print the **version**

```docker-agent version```

# SYNOPSIS

**docker-agent** _command_ [_options_] [_args_]

**docker agent** _command_ [_options_] [_args_]

# DESCRIPTION

**docker-agent** builds, runs, and shares AI agents from a YAML or HCL config. It is a standalone Go binary and a **docker** CLI plugin: symlink it to `~/.docker/cli-plugins/docker-agent` and invoke it as **docker agent**. Docker Desktop **4.63+** ships the plugin. Homebrew formula **docker-agent**. GitHub Releases provide binaries. Current line is **v1.149.0** (Apache-2.0, Docker Engineering).

`docker-agent run` without a config uses `docker-agent.yaml`, `docker-agent.yml`, or `docker-agent.hcl` in the current directory when present; otherwise a built-in default agent. Configs name agents, models, and toolsets (files, shell, git, MCP, RAG, and others). Multi-agent teams delegate work. Agents can be pushed to any OCI registry.

Needs at least one model: an API key (`OPENAI_API_KEY`, `ANTHROPIC_API_KEY`, `GOOGLE_API_KEY`, …), **Docker Model Runner** for local models, or a custom OpenAI-compatible endpoint. `docker-agent setup` walks through those paths. Session state defaults to `<data-dir>/session.db` (`~/.cagent/session.db` unless **--data-dir** or **DOCKER_AGENT_DATA_DIR**). User config lives under `~/.config/cagent/`.

The same binary exposes HTTP, MCP, A2A, ACP, and OpenAI-compatible chat servers, a Kanban TUI (**board**, needs **tmux** and **git**), evals, and session diffs.

# COMMANDS

**run** [_config_] [_message_...]
> Interactive TUI. **--exec** is headless (stdout). **-a**, **--agent** _name_ selects an agent. **--model** _ref_ overrides models (`provider/model`, or `agent=provider/model`, comma-separated). **--safety** _mode_ is `strict`, `balanced`, `restricted`, or `autonomous` (**--yolo** is the autonomous alias). **--session** _id_ resumes (relative refs: `-1` newest). **-s**, **--session-db** _path_. **--last** (with **--exec**) prints only the final answer. **--json** is NDJSON events, or with **--last** a JSON value. **--sandbox** / **--cloud** run in sbx. **-w**, **--worktree** [_name_] isolates a git worktree. **--worktree-pr** _n_ checks out a GitHub PR (needs **gh**). **--working-dir** _path_. **--lean** is a non-alternate-screen TUI. **--dry-run** validates without running

**new**
> Generate an agent config interactively. **--model**, **--max-iterations**

**getting-started** (alias **tour**)
> Short interactive tour in the chat UI. Needs a TTY

**setup**
> Interactive model setup: cloud provider, Docker Model Runner, custom endpoint, or Claude Code harness. Offered automatically when a run has no model unless **DOCKER_AGENT_NO_SETUP=1**

**doctor** [_agent-file_|_registry-ref_]
> Diagnose credentials, Docker Model Runner, and `auto` model selection. Secrets are never printed. Non-zero when an agent could not run. **--json**, **--env-from-file**, **--models-gateway**

**models**
> List models you can use with **--model**. Aliases **models list**, **models ls**. **-p**, **--provider**, **--all**, **--format json**

**toolsets**
> List built-in toolset types for `toolsets:` in YAML. **--format** `table`|`json`

**serve api** _file_|_dir_|_ref_
> HTTP control plane. **-l**, **--listen** default `127.0.0.1:8080`

**serve mcp** _config_
> Expose agents as MCP tools (stdio, or **--http**)

**serve a2a** _config_
> Agent-to-Agent protocol server

**serve acp** _config_
> Agent Client Protocol over stdio

**serve chat** _config_
> OpenAI-compatible `/v1/chat/completions` and `/v1/models`

**board**
> Kanban TUI: each card is an agent in a tmux session on a git worktree. Needs **tmux** and **git**

**share push** _file_ _ref_ / **share pull** _ref_
> Publish or fetch an agent as an OCI image

**sessions diff** _a_ _b_
> Compare two recorded sessions at the first diverging tool-call

**eval** _agent_ [_eval-dir_]
> Run recorded-session evals. **-c** concurrency, **--only**, **--repeat**, **--keep-containers**, **--container-runtime**

**alias**
> **ls** / **list**, **add**, **rm**. A `default` alias is what bare **docker-agent** runs

**sandbox**
> Shared settings for **--sandbox** runs

**debug tool** _config_ _tool_ [_JSON_]
> Call a tool directly, outside the LLM loop

**version**
> Print version and commit

# CONFIGURATION

**docker-agent.yaml** / **.yml** / **.hcl**
> Agent file in the working directory used by **run** when no config argument is given

**~/.config/cagent/config.yaml**
> User settings (theme, board projects, providers). Flavors, hooks, and `.agentsignore` are documented with the config

**~/.config/cagent/.env**
> Provider API keys stored by **setup**

**~/.cagent/session.db**
> Default SQLite session store. Override with **--data-dir**, **-s**, or **DOCKER_AGENT_DATA_DIR**

**OPENAI_API_KEY** / **ANTHROPIC_API_KEY** / **GOOGLE_API_KEY** / …
> Provider credentials from the environment

**DOCKER_AGENT_MODELS_GATEWAY**
> Models gateway URL (also **--models-gateway**)

**DOCKER_AGENT_NO_SETUP**
> Set to `1` to skip the interactive setup offer

# CAVEATS

A model provider or Docker Model Runner is required. **--exec --last** declines pending tool approvals; set **--safety** for unattended runs. **--worktree** needs a git checkout and cannot combine with **--remote** or **--sandbox**. **board** needs **tmux** and **git**. Anonymous usage telemetry is on by default (see the telemetry docs). Paths still use the historical **cagent** directory names.

# HISTORY

**Docker Agent** is an Apache-2.0 Go project from Docker Engineering. The plugin name is **docker-agent**; data and config still live under **cagent** paths. **v1.149.0** was released in **October 2026**.

# INSTALL

```brew: brew install docker-agent```

<!-- packages: 2026-10-07 -->

# SEE ALSO

[docker](/man/docker)(1), [docker-compose](/man/docker-compose)(1), [claude](/man/claude)(1), [codex](/man/codex)(1), [opencode](/man/opencode)(1), [ollama](/man/ollama)(1), [tmux](/man/tmux)(1), [git](/man/git)(1)

# RESOURCES

```[Source code](https://github.com/docker/docker-agent)```

```[Documentation](https://docker.github.io/docker-agent/)```

<!-- verified: 2026-10-07 -->
