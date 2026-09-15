# TAGLINE

Plan, run, and verify coding-agent tasks from a goal

# TLDR

**Open the terminal UI** (chat on the left, plan on the right)

```ordewell```

**Plan a goal** using a coding agent you already have installed (no API key)

```AI_PROVIDER=claude-code ordewell plan --goal "[Add rate limiting to the public API]"```

**Execute** the last generated plan

```ordewell run```

**Inspect** recent sessions, or one session in detail

```ordewell status```

```ordewell status --session-id [session-id]```

**Pick the planner** (Claude Code, Codex, OpenCode, or an API provider)

```ordewell planner [claude-code]```

**Reassign a task's runner** before anything runs

```ordewell task-runner [2] [opencode]```

**Start the local API server** in the background

```ordewell web --daemon```

**Print the installed version**

```ordewell --version```

# SYNOPSIS

**ordewell** [_command_] [_options_]

**ordewell** **plan** **--goal** _text_ [_--runner_ _id_] [_--workspace_ _path_] [_--no-chat_]

**ordewell** **run** [_--session-id_ _id_]

# PARAMETERS

**--help**, **-h**
> Print usage. Every slash command in the TUI is also a CLI subcommand of the same name.

**--version**, **-v**, **version**
> Print the installed version as a bare string.

**--workspace** _path_
> Workspace directory (default: current directory). The directory must already look like a project (a `.git`, `.ordewell`, or similar marker), or the TUI will ask to initialize it.

**--port** _N_
> Daemon port. Default is **ORDEWELL_PORT**, else **3742**. The CLI, TUI, and VS Code extension are clients of this local HTTP + WebSocket server.

**--session-id** _id_
> Session to act on (default: last planned session in this workspace).

**--goal** _text_
> Required for **plan**. Plain-language description of the work.

**--runner** _id_
> Runner to consider when planning (repeatable). Built-in ids: **claude-code**, **codex**, **opencode**. Default is every enabled runner.

**--no-chat**
> One-shot plan; skip the planner dialogue.

**--json**
> JSON output for **status** and **sessions**.

**--daemon**
> For **web**: run the API server in the background instead of the foreground.

**--server**
> For **stop**: stop the background server daemon rather than a running plan.

# COMMANDS

**tui**
> Full-screen terminal UI (the default when stdin is a TTY and no command is given). Requires **tmux**.

**plan**
> Research the workspace read-only and produce a typed plan of tasks. Nothing executes until **run**.

**run**
> Execute the last generated plan (or **--session-id**). Independent tasks run in parallel.

**approve**
> Sign off a plan paused for review and continue it.

**stop**
> Stop execution of the last session, or **--server** to stop the daemon.

**status**
> List recent sessions, or show one session in full with **--session-id**.

**sessions** **list**|**load**|**delete**
> Manage named sessions stored under `.ordewell/sessions/`.

**add-task** **--title** _text_
> Add a task to the current plan (**--type** ai|user, **--depends-on** _id_, **--prompt** _text_).

**remove-task** _id_
> Remove a task. _id_ is an order number or a task ID.

**complete** _id_
> Mark a task complete so dependents can run (alias: **mark-complete**).

**uncomplete** _id_
> Mark a completed task not done.

**skip** _id_
> Skip a task (marks it complete so dependents can run).

**force-start** _id_
> Start a task now, ignoring dependencies.

**run-task** _id_
> Run only one task.

**retry** _id_
> Re-run a failed task.

**cancel** _id_
> Kill a running task.

**terminal** _id_
> Attach a real terminal to a task's runner (a tmux window).

**task-runner** _id_ [_runner_]
> Set a task's executor. Changing the runner re-derives its model, thinking effort, and mode. Omit the value to list options.

**task-model** _id_ [_model_]
> Set a task's executor model.

**task-effort** _id_ [_level_]
> Set a task's thinking effort (`default` to clear).

**task-mode** _id_ [_mode_]
> Set a task's runner mode.

**task-deps** _id_ [_a,b_|**none**]
> Set which earlier tasks a task waits for.

**planner** [_provider_]
> Choose who plans: an API provider, or a coding-agent CLI (**claude-code**, **codex**, **opencode**) on a subscription you already hold.

**model** [**set** _id_]
> Show or set the planner model. Applies without a restart.

**planner-effort** [_level_]
> Thinking effort for a coding-agent planner.

**key** [**set** _provider_ _key_]
> Show which providers have a key, or store one in `.env` (never echoed back).

**runners** [_id_ **on**|**off**]
> Enable or disable runners.

**allowlist** **set**|**clear**|**show**
> Limit which models a runner may use.

**auto** [**on**|**off**]
> Autonomous permission mode for new sessions.

**refresh**
> Re-discover runners and model catalogs.

**models**
> List every provider's catalog (works without a server).

**tdd** [**on**|**off**]
> Toggle Test-Driven Development mode, which augments tasks with red-green-refactor instructions.

**verify** [**on**|**off**]
> Toggle verification mode, which appends a final evidence-based task that runs the full test suite.

**web**
> Start the local API server on **127.0.0.1:3742** (JSON + WebSocket, not a browser dashboard). Every other command starts it on demand.

**setup**
> Interactive first-run setup wizard.

**plugins** **list**|**install**|**remove**|**create**
> Manage runner plugins. **create** scaffolds a `manifest.json`; **install** accepts `github:user/repo` (also GitLab, Bitbucket, Codeberg).

# DESCRIPTION

**ordewell** turns one goal into an ordered plan of coding-agent tasks, then executes and verifies them. Each task carries its own runner, model, thinking effort, and mode. You can rewrite any of those — add or remove tasks, rewire dependencies — without losing completed work or asking the planner to regenerate the whole plan.

Planning is a conversation, not a hidden internal state. The planner researches the workspace **read-only**: reads run in parallel, anything reaching outside the workspace asks once, and commands that would write are refused. Its final message *is* the plan. Claude Code, Codex, or OpenCode can be the planner on the subscription you already hold; alternatively, any of about twenty-five API providers (OpenRouter, Anthropic, OpenAI, Gemini, xAI, Groq, DeepSeek, and others) or an OpenAI-compatible local server can plan. Mutation always stays with the runners.

A task completes only when its unique **completion marker** appears in the runner's output. Exit code is kept as diagnostic evidence. The model is never the tie-breaker.

Bare `ordewell` on a TTY opens the TUI. Piped or scripted invocations without a command print help instead, because the TUI needs a real terminal. `tab` swaps the chat and plan panes; `/help` lists the rest. A separate VS Code extension (`ordewell.ordewell`) shares the same core and does not need the npm CLI.

# CONFIGURATION

Keys typed into **ordewell key set** or `/key` are masked on screen and written to `.env`. Each settings command pushes to the running server *before* writing the file, so a refused connection cannot leave a setting the daemon never saw.

**AI_PROVIDER**
> Force the planner backend. `claude-code`, `codex`, and `opencode` plan with that CLI and need no API key. Otherwise auto-detected from whichever `*_API_KEY` is set.

**OPENROUTER_API_KEY**, **ANTHROPIC_API_KEY**, **GEMINI_API_KEY**, …
> One provider key if you want an API planner rather than a coding agent. Run **ordewell key** for the full list of variable names. Anything else that speaks the OpenAI API works via **OPENAI_COMPATIBLE_BASE_URL**.

**ORCHESTRATOR_MODEL**
> Planner model. Default: `deepseek/deepseek-v4-flash`. With a coding-agent planner it must be one of that agent's own model ids.

**ORDEWELL_PLANNER_EFFORT**
> Thinking effort for a coding-agent planner (`low`, `high`, `adaptive`, …). Ignored by vendor planners, whose effort is baked into the model id.

**ORDEWELL_MAX_PARALLEL**
> Max concurrent AI task sessions (1–5, default 3). The dependency graph is always respected.

**ORDEWELL_PORT**
> Daemon port CLI commands target (default 3742).

**ORDEWELL_AUTONOMOUS_MODE**
> Approval posture for new sessions (see **ordewell auto**).

**ORDEWELL_RESEARCH_ENABLED**
> `true` (default) or `false`.

**ORDEWELL_TUI_MOUSE**
> Set `false` (or run `/mouse off`) to give the terminal its own drag-to-select back. Capturing the mouse is what disables it.

**OPENROUTER_BASE_URL**
> Default: `https://openrouter.ai/api/v1`.

Sessions auto-save to `.ordewell/sessions/` inside the workspace. The last-session pointer is `<workspace>/.ordewell/last-session.json`, not a machine-global file. VS Code mirrors these settings under `ordewell.*`.

# CAVEATS

Requires **Node.js 20** or newer. The TUI needs **tmux** on every platform — it is what backs each task's live terminal. On Windows, run the TUI under WSL; the CLI, API server, and VS Code extension run natively.

At least one coding agent (Claude Code, Codex, or OpenCode) must be installed to execute tasks. Planning without an API key uses that same agent in a read-only harness.

The local daemon binds **127.0.0.1**. A workspace without a project marker is refused rather than treated as a confinement boundary. Plugin installs run third-party manifests; only install plugins you trust.

Versions before **0.4.9** had disclosed issues around command classification, credential redaction, an unauthenticated daemon attack chain, and plugin-install code execution. Upgrade, and rotate any secrets that may have been read into a pre-0.4.9 session file.

# HISTORY

Ordewell is written by **Alessandro Costanzo Ciano** and released under the **Apache License 2.0** (the name and logos are not covered by that licence). First public release was **0.4.0** on **31 July 2026**. The npm package is `@ordewell/cli` (also published as the unscoped name `ordewell`).

# SEE ALSO

[claude](/man/claude)(1), [codex](/man/codex)(1), [opencode](/man/opencode)(1), [aider](/man/aider)(1), [tmux](/man/tmux)(1), [npm](/man/npm)(1)

# RESOURCES

```[Source code](https://github.com/ordewell/ordewell)```

```[Homepage](https://ordewell.ai)```

```[Documentation](https://ordewell.ai/docs.html)```

<!-- verified: 2026-09-15 -->
