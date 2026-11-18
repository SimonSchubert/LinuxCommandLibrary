# TAGLINE

Terminal coding agent with a local session and a non-interactive mode

# TLDR

**Start** an interactive session in this repository

```agav```

Ask one question and **print the final answer**

```agav -P "what does this project do?"```

Run a task **without a terminal UI**, for scripts and CI

```agav run "List the files in this repository and explain its structure. Do not modify anything."```

Pick a **provider and model**

```agav --provider ollama --model [llama3.2]```

**Resume** the session picker, or one session by id prefix

```agav --resume```

```agav --resume [session-id]```

**Cap** how many model and tool iterations one prompt may take

```agav --max-turns [20]```

**Update** the installed release

```agav update```

# SYNOPSIS

**agav** [_options_] [_PROMPT_]

**agav** **run** _PROMPT_ [_options_]

**agav** **-P** | **--print** _PROMPT_ [_options_]

**agav** **update** [_VERSION_]

**agav** **job** **tick** | **daemon** ...

**agav** **agents** **list** | **install** | **remove** | **enable** | **disable** ...

**agav** **skills** **list** | **add** | **remove** | **enable** | **disable** | **clear** ...

**agav** **sessions** **delete** | **rm** _ID_

**agav** **login** [_options_]

**agav** **logout**

# DESCRIPTION

**agav** is a terminal coding agent. With no subcommand it opens an interactive session: it can read the repository, edit files, and run commands, subject to the permission mode. **run** does the same work without the interactive UI. **-P** / **--print** asks once and prints a final response. Piping text into **agav -P** feeds that text as the prompt.

The upstream install is a self-contained binary from **https://agav.dev/install.sh** (or the Windows installers). A release can also be downloaded from the GitHub releases page. **agav update** replaces the installed release. Set the no-update environment variable to **1** to skip the automatic update check; the name is **AGAV** then **NO** then **UPDATE**, joined with underscores.

Provider and model, when you did not pass flags, come from the resumed session, otherwise from the last session, otherwise from **~/.agav/config.json**. On Windows that directory is under the user profile. **--provider** without **--model** keeps the saved model only when it belongs to that provider.

Credentials are environment variables read by the provider: Anthropic, OpenAI, OpenRouter, NVIDIA NIM, DeepSeek, Gemini, a Vertex AI service-account file, or Ollama. **--openai-api chat** selects the Chat Completions API for OpenAI-compatible servers that do not implement the Responses API. The default for OpenAI is **responses**.

Tool confirmation defaults to asking. **--auto-accept** / **-y** skips ordinary confirmations. **--deny-writes** blocks writes. **--permission** takes a JSON tool policy and applies to **agav run** (the interactive **/permission** command is a separate session mode). Shell commands can be sandboxed with Seatbelt or Bubblewrap. **--sandbox-network deny** blocks their network. **--sandbox-required** refuses the run command and run tests tools (each name is two words joined with an underscore) when the OS sandbox is unavailable.

The project is experimental. The license is Apache 2.0.

# COMMANDS

**run** _PROMPT_
> Non-interactive agent. **--max-turns** limits model and tool iterations for that prompt.

**update** [_VERSION_]
> Install another release of the binary.

**job tick**
> Evaluate due background-job schedules once. **--install** registers an OS entry that ticks every minute, **--status** reports it (exit **3** when missing), **--uninstall** removes the entry and keeps job state.

**job daemon start** | **stop** | **status**
> A foreground daemon that ticks every 15 seconds. **status** exits **0** when it is running and **3** when it is not.

**agents list** | **install** _URL-OR-PATH_ | **remove** _NAME_ | **enable** _NAME_ | **disable** _NAME_
> Installed agents. **install** accepts a local directory or a GitHub URL and defaults to a global destination. **--alias** renames on install. **--destination** is **global** or **project**. **agents** alone is **list**.

**skills list** | **add** _URL-OR-PATH_ | **remove** _NAME_ | **disable** _NAME_ | **enable** _NAME_ | **clear**
> Skills. Bundled skills can be disabled but not removed. Enabled state is stored under **~/.agav/skills/registry.json** and applies on the next start. **skills** alone is **list**.

**sessions delete** _ID_, **sessions rm** _ID_
> Delete one saved session by exact id or a unique prefix. An ambiguous prefix is rejected.

**login**, **logout**
> Enroll with an organization control plane, or drop the cached policy. **--auth-code**, **--device**, **--oidc**, and **--saml** force a flow. **--control-plane** sets the plane's URL. Interactive login and device login also need **--issuer** and **--client-id**. **logout** removes the cached policy under **~/.agav/enterprise/**. Restart **agav** afterward.

# PARAMETERS

**--provider** _NAME_, **-p** _NAME_
> **anthropic**, **openai**, **openrouter**, **nvidia**, **deepseek**, **gemini**, **vertex-ai**, or **ollama**.

**--model** _ID_, **-m** _ID_
> Model id for that provider.

**--effort** _LEVEL_
> **minimal**, **low**, **medium**, **high**, or **max**.

**--print**, **-P**
> Print one final response and exit.

**--stream**
> Stream that print-mode response.

**--output-schema** _JSON-OR-@FILE_
> Check print-mode output against a JSON Schema.

**--max-turns** _N_
> Agent iterations per prompt, in interactive, print, and run modes. Decimal digits only, at least 1. Overrides **maxIterations** for this session. The budget resets on each new interactive prompt and is shared with subagents and tool calls.

**--config** _KEY=VALUE_, **-c** _KEY=VALUE_
> Override one config value for this session. Repeatable; the later value wins. Dotted paths set a nested field. Booleans and numbers are coerced; objects and arrays are JSON. Unknown keys fail immediately. Dedicated flags win over **-c**. **login**, **logout**, **job**, **mcp**, and **workflows** reject **-c** because they run before a session exists.

**--resume** [_ID_], **-r** [_ID_]
> Open the session picker, or resume the session whose id starts with _ID_.

**--name** _TITLE_
> Initial name of a new interactive session. Rejected with **-P** or **run**.

**--auto-accept**, **-y**
> Skip ordinary tool confirmations.

**--deny-writes**
> Block write operations.

**--search**
> Enable the web search tool for this session.

**--provider-idle-timeout** _MS_
> Idle timeout, in milliseconds, while waiting for provider stream events. A positive integer up to 2147483647, or **disabled** / **off**. Tool runs and confirmation prompts do not count.

**--ollama-host**, **--ollama-port**, **--ollama-endpoint**, **--ollama-api-key**
> Ollama address. **--ollama-endpoint** is a full base URL and replaces host plus port.

**--openai-api** _responses|chat_
> OpenAI wire protocol. Default: **responses**.

**--sandbox-network** _deny|allow_
> Network policy for sandboxed shell commands. Default: **allow**. **--sandbox-no-network** and **--sandbox-allow-network** are aliases.

**--sandbox-required**
> Refuse shell and test execution when no OS sandbox is available.

**--permission** _JSON_
> Tool policy for **agav run**.

**--version**, **-v**
> Print the version.

**--help**, **-h**
> Print help.

# CONFIGURATION

**~/.agav/config.json**
> User configuration. **-c** overrides one key for a single process and is not written back. An organization policy outranks both the file and **-c** on fields it enforces.

**~/.agav/skills/registry.json**
> Which skills are enabled.

**~/.agav/enterprise/**
> Cached organization policy and a short-lived gateway credential after **login**. Owner-only.

# CAVEATS

**agav** is under active development. Flags and on-disk layout can change between releases.

**-c** cannot point **login** at a control plane. Use **--control-plane**.

**--permission** is the JSON policy for **run**. It is separate from the interactive permission mode.

A background tick or daemon reads the global config and runs only when background jobs are enabled there.

SAML login is never chosen automatically. Pass **--saml**. It needs a local browser and does not take **--issuer** or **--client-id**.

# SEE ALSO

[ollama](/man/ollama)(1), [curl](/man/curl)(1), [git](/man/git)(1)

# RESOURCES

```[Source code](https://github.com/prapaa-ai/agav)```

```[Homepage](https://agav.dev)```

```[Documentation](https://docs.agav.dev/reference/cli)```

<!-- verified: 2026-11-18 -->
