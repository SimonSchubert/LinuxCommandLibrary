# TAGLINE

Open-source agent runtime harness with TUI and CLI

# TLDR

**Open** the interactive terminal UI

```tura```

**Start** the TUI with an initial prompt

```tura "[Inspect this repository]"```

**Run** a non-interactive gateway-backed prompt

```tura run "[Fix the failing test and verify it]"```

**Run** a one-shot prompt via the direct Rust CLI

```tura exec "[Summarize the architecture]"```

**List** configured LLM providers

```tura provider list```

**List** sessions

```tura session list --json```

**Resume** the latest session with a follow-up

```tura resume --last "[Continue and verify the fix]"```

# SYNOPSIS

**tura** [_global_options_] [_prompt_ | _command_ [_args_...]]

# PARAMETERS

**--gateway-url** _URL_
> Use an explicit gateway instead of auto-starting or discovering one.

**--cwd** _PATH_
> Workspace directory sent to the gateway. Defaults to the current directory.

**--initial-session** _ID_
> Open the TUI on a specific session. Also read from **TURA_TUI_INITIAL_SESSION_ID**.

**--json**
> Request JSON output where the selected command supports it.

**--verbose**
> Print gateway request diagnostics to stderr.

**--plain** / **--rich**
> Force plain/safe terminal rendering or rich rendering.

**--lang** **en**|**zh-CN**, **--language** **en**|**zh-CN**
> Set CLI display language.

With no subcommand, **tura** opens the interactive TUI. If the first argument is not a known command, remaining text is treated as the initial TUI prompt.

# COMMANDS

**run** [_options_] _"prompt"_
> Gateway-backed non-interactive prompt: create or reuse a session, stream until the turn completes, print the result. Options include **-m**/**--model**, **-a**/**--agent**, **--session**, **--output** text|json|ndjson, **--timeout**, **--stream**/**--no-stream**, **--bash**/**--zsh**/**--shel**.

**exec** [_options_] _"prompt"_
> Direct Rust CLI one-shot runner (**tura_exec**). Reads prompt from stdin if omitted. Options include **-C**/**--cwd**, **-m**/**--model**, **-a**/**--agent**, **--json**, **--quiet**, **--sandbox**, **--goal**, **--bash**/**--zsh**/**--shll**.

**bash** | **zsh** | **shel** _"prompt"_
> Aliases for **run** with the **command_run** shell surface forced.

**session** **list**|**show**|**update**|**abort** ...
> Inspect and modify gateway sessions. **list** supports **--all** and **--json**.

**resume** [_SESSION_ID_ | **--last**] [_prompt_...]
> Show a session, or append a follow-up prompt.

**config** **get**|**set**|**model-tier** ...
> Read or patch workspace session config and model tiers.

**provider** **list**|**status**|**login**|**set-auth**|**logout** ...
> List providers and manage local authentication (OAuth or API key). Credentials are not bundled; configure a provider before prompt commands.

**agent** **list**|**show**|**create**|**update**|**delete**|**model** ...
> Work with the gateway agent registry (default agent id often **balanced**).

**persona** **list**|**show**|**create**|**update**|**delete** ...
> Work with the gateway persona registry.

**project** **current**|**list**|**create**|**default** ...
> Inspect or create gateway workspaces.

**file** **list**|**read**|**open**|**reveal** ...
> Operate on files in the selected workspace via the gateway.

**command** **list**|**run** ...
> List or execute registered gateway commands (not arbitrary shell).

**inspect** **status**|**path**|**sessions**|**messages** ...
> Diagnostics for gateway and session state.

**completion** **bash**|**zsh**|**fish**
> Print shell completion snippets.

**gateway** _METHOD_ _PATH_ [**-d** _JSON_]
> Send one raw HTTP request through the CLI gateway client.

**register-cli** | **unregister-cli** | **doctor-cli-path**
> npm package-entry helpers to register or check the release binary on **PATH**.

Related binaries: **tura_gateway** (local HTTP/SSE gateway), **tura_gui** (desktop client), **tura_exec**, **tura_router**, **tura_session_db** (runtime plumbing).

# DESCRIPTION

**tura** is an open-source agent runtime harness designed to complete long-horizon coding tasks with fewer model turns and tokens than typical tool-calling loops. Instead of exposing many fine-grained tools per step, it emphasizes a macro **command_run** tool so related shell, patch, build, and test actions can run in one structured turn, plus runtime context management tied to task state.

The primary entry point is the **tura** command: with no arguments it launches a terminal UI; **tura run** and **tura exec** provide non-interactive paths for scripts and CI-style prompts. A local gateway process coordinates sessions, agents, and providers. Install via npm (**tura-ai**) or from source with the project's install scripts; on first launch, configure an LLM provider and model before sending prompts.

Published benchmarks compare Tura agent configurations against other coding agents on long-horizon tasks; results and methodology are documented upstream. License is AGPL-3.0-or-later.

# CAVEATS

Requires a configured LLM provider; installation alone does not supply credentials. Behavior and available models depend on which providers you authenticate. Some subcommands need a running or auto-started gateway. Companion binaries (**tura_gateway**, **tura_gui**, router/session DB tools) are for service and desktop use, not everyday prompt entry. Spelling of shell surfaces differs slightly between TypeScript (**shel**) and Rust (**shll**) frontends.

# HISTORY

Developed by **Tura-AI** as an open-source agent harness with TUI, CLI, and optional GUI, emphasizing macro command execution and context control. Distributed on npm as **tura-ai** and on GitHub as **Tura-AI/tura**.

# SEE ALSO

[codex](/man/codex)(1), [aider](/man/aider)(1), [opencode](/man/opencode)(1), [npm](/man/npm)(1)

# RESOURCES

```[Source code](https://github.com/Tura-AI/tura)```

```[Homepage](https://turaai.net/)```

```[Documentation](https://github.com/Tura-AI/tura/blob/main/docs/SUMMARY.md)```

<!-- verified: 2026-08-09 -->
