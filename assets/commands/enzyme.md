# TAGLINE

Local-first index and search for Markdown knowledge bases

# TLDR

Install **agent instructions** for Claude Code in this notes folder

```enzyme install claude```

Propose a **`.enzyme` program** from the current directory (prints the path)

```enzyme compile -v```

Build the **local index and catalysts**

```enzyme init --quiet```

Show **what was indexed** and any problems

```enzyme doctor```

Search notes by **wording and meaning**

```enzyme catalyze -n [10] "[why we keep rewriting the auth layer]"```

Show the **petri map** of entities and catalyst questions

```enzyme petri -n [2]```

Refresh the index after **new notes**

```enzyme refresh```

Index an **Apple Notes** workspace from its SQLite store

```enzyme --workspace apple-notes compile --preset apple-notes [$HOME/Library/Group Containers/group.com.apple.notes/NoteStore.sqlite]```

```enzyme --workspace apple-notes init```

Sign in to **memory.enzyme.garden** (needed after the first vault)

```enzyme login```

Print the **CLI version**

```enzyme --version```

# SYNOPSIS

**enzyme** [**-p**|**--vault** _PATH_] [**--workspace** _NAME_] [**-v**] _command_ [_options_]

# DESCRIPTION

**enzyme** is the Enzyme CLI: a local-first compile step for Markdown knowledge bases (Obsidian vaults, meeting notes, agent memory). It reads how notes are already organized (folders, tags, links, and dates), writes a short editable **`.enzyme` program**, and builds a local index so a coding agent can retrieve related passages and cite them.

The invoked binary is **enzyme** (Cargo `[[bin]]` in crate `enzyme-cli`). Workspace package version **0.13.1**. Search runs on the machine. Catalyst generation (questions about what you decided, changed, or left open) may call Enzyme's hosted service or a local GGUF model.

A typical Markdown setup is **compile** (propose settings), **init** (build the index), **doctor** (report what was indexed), then **petri** (map) and **catalyze** (search). **refresh** picks up later notes. **install** writes agent skills and instruction markers for **claude**, **codex**, **hermes**, or **openclaw**.

Named workspaces live under `~/.enzyme/workspaces/` plus the workspace name (override the home with **ENZYME-HOME**). **--workspace** / **--collection** selects one and cannot be combined with **-p** / **--vault**. Without either, the vault is the current directory; legacy vault data is `vault/.enzyme/` (database `enzyme.db`, log `enzyme.log`).

# PARAMETERS

**-p**, **--vault** _PATH_
> Vault directory. Defaults to the current directory. Global. Conflicts with **--workspace**

**--workspace** _NAME_, **--collection** _NAME_
> Named workspace declared under the Enzyme home. _NAME_ is a single filesystem component (no slashes). Global. Conflicts with **--vault**

**-v**, **--verbose**
> Raise log verbosity. Repeatable. Default is warnings only; once is info, twice is debug, three times is trace. Global. **enzyme compile -v** prints the generated program

**--version**
> Print the package version and exit

**--help**
> Print clap help for the CLI or a subcommand

# COMMANDS

**compile**
> Generate and save a readable **`.enzyme` program**. **--preset** is `arena`, `apple-notes`, or a path to a `.enzyme.in` template; remaining arguments are the preset source (Are.na channel URL, Apple Notes database path). **--output** writes a new file and never overwrites an existing one. **--dry-run** prints without saving. **--json** emits the program and the inventory it was selected from. **--packet** prints selection questions and evidence as JSON for an agent to answer; local only, saves nothing; conflicts with **--preset**, **--output**, **--dry-run**, and **--json**. **--color** is `auto` (default), `always`, or `never`. Markdown compile may call a model; source presets do not

**init**
> Build or update the vault index and catalysts. **-q** / **--quiet** suppresses human output (for agents). **--json-progress** writes JSONL progress on stderr. **--force** / **--regenerate** discards the existing index and regenerates every entity's catalysts. **--stage** stops after a pipeline stage (for example `index`). **--min-top-catalysts** raises the ceiling for the largest entity. **--lock-timeout** _SECS_ waits for another init/refresh of this workspace (default **1800**; **0** fails immediately). **--llm** is documented under Catalyst generation

**refresh**
> Incrementally refresh the index. Same **-q**, **--min-top-catalysts**, and **--llm** as **init**. **--full** / **--force** starts a complete catalyst rebase (still built detached). **--lock-timeout** defaults to **1800**, or **5** with **--quiet**

**catalyze** _QUERY_
> Rank notes by keyword and meaning. Each result notes the connecting catalyst. **-n** / **--limit** defaults to **10**. **--candidates** _N_ lists up to _N_ further hybrid matches (path, date, snippet). **--routing** is `hybrid` (default) or `catalysts`. **--target** _DIR_ prepares and searches that directory instead of the vault and always routes through catalysts. **--json** always emits the JSON envelope, including when stdout is a terminal

**search** _QUERY_
> Read-only search of the index: catalyst, direct, and exact-phrase hits. **-n** / **--limit** is the maximum per mode (default **10**). **--phrase** is the literal phrase (defaults to the query). **--json** emits the `enzyme.search.v1` envelope

**petri**
> Show top entities and their catalyst questions. **-n** is how many entities to show (default **15**; **0** means all). **--query** ranks entities and catalysts by relevance. **--catalyst-budget** is the maximum catalysts per entity in query mode (default **3**). In a terminal this draws a tree; piped, it emits JSON

**status**
> Show vault status and configuration. **--json** emits `enzyme.status.v1`

**doctor**
> Report diagnostic facts. Read-only; never writes. **--json** emits structured JSON

**install** [_TARGET_]
> Install or update this workspace's agent integration. _TARGET_ is `claude`, `codex`, `hermes` (default), or `openclaw`. **--source** is `auto` (fetch GitHub copy, fall back to packaged; default), `remote`, or `local`. Claude and Codex skills go under the vault (`.claude/skills` or `.agents/skills`). Hermes and OpenClaw skills go under **~/.hermes** / **~/.openclaw** (or **HERMES-HOME** / **OPENCLAW-HOME**)

**login**
> Sign in to memory.enzyme.garden. **--no-open** does not launch a browser. **--json** emits JSONL events for agent-mediated login. The first vault on a machine can **init** without login; refresh, publishing, account credits, and further vaults require this

**logout**
> Sign out of memory.enzyme.garden

**update**
> Check for and install Enzyme binary updates. **--check** only reports, as JSON

**mcp**
> Start an MCP server on stdio

**serve**
> Start the HTTP API for the explore UI. **--port** defaults to **8765**

**model install** [_NAME_]
> Download a GGUF into **~/.enzyme/models**. Default name is `catalyst-135m-v3`. **--url** downloads a GGUF directly; **--sha256** is the expected checksum for that URL

**model list**
> List installed and available models. **--json** emits `enzyme.models.v1`

**model use** _NAME_
> Select an installed model and require local catalyst generation

**model auto**
> Return to automatic selection (local when installed, otherwise hosted)

**model disable**
> Disable local catalyst generation and use Enzyme hosted

**model status**
> Show the configured and effective catalyst-generation mode

**model verify** [_NAME_]
> Verify an installed model's file and registry checksum (defaults to the selected model)

**model rm** _NAME_
> Remove an installed model

**workspace plan** _NAME_ **--desired** _FILE_
> Plan replacing workspace _NAME_'s program with the text in _FILE_ (`-` is stdin). Never writes the program; may finish an interrupted apply first. **--json** prints the plan; **--out** also saves it

**workspace apply --plan** _FILE_
> Apply a saved plan. Refuses stale or altered plans; replays already-applied ones. **--json** prints the receipt. After a write, index with **enzyme refresh --workspace** _NAME_

**workspace recover**
> Complete interrupted applies. **--discard** drops journals whose program was edited mid-apply, leaving the program as it is. **--json** prints the outcome

**spec compile** _FILE_
> Parse and resolve a source file (no vault access, no model). **--instructions** or **--normalized** change the printout; default is the resolved plan as JSON

**spec profiles**
> Export built-in profile definitions. **--json** emits `enzyme.profiles.v1`

**spec inspect** _VAULT_
> Print the effective runtime config. **--instructions** prints the compiled agent policy instead

**spec plan** [_FILE_]
> Preview what a program would do on an indexed vault (read-only, no model). Global **-p** / **--workspace** select the vault. **--json**, **--limit** _N_, **--prompts** _DIR_, **--local** (local-model prompts)

**spec migrate**
> Migrate `config.toml` to `configs/*.enzyme`, keeping a timestamped backup. **--home** overrides the Enzyme home

**spec serve**
> Serve the syntax playground (Rust parser only). **--bind** defaults to `127.0.0.1`, **--port** to **4178**

**ingest**
> Ingest structured data into the Enzyme database. **-q** / **--quiet** emits JSON instead of human output

**embed-entries**
> Embed structured entries without creating an Enzyme database. **-i** / **--input** is a JSON file (array, `{"entries": [...]}`, or `{"entry": ...}`); stdin if omitted

**benchmark** _QUERIES_
> Benchmark retrieval. _QUERIES_ is JSONL or plain text, one query per line. **-n** / **--limit** defaults to **10**. **--conditions** is a comma list: `ese_direct`, `ese_catalysts`, `arctic_direct`, `arctic_catalysts` (default: all)

**dump-prompts**
> Dump catalyst prompts to JSONL. **-o** / **--output** defaults to `prompts.jsonl`. **--min-top-catalysts** as on **init**

# CATALYST GENERATION

**init** and **refresh** take **--llm** _MODE_:

**env**
> OpenAI-compatible endpoint from **OPENAI-API-KEY** (required), **OPENAI-BASE-URL** (default `https://api.openai.com/v1`), and **OPENAI-MODEL** (default `gpt-4o-mini`). Never Enzyme auth. **--use-env-llm** is an alias

**local**
> The selected model in **~/.enzyme/models**. Fails (exit **3**) if none is installed

**hosted**
> Enzyme hosted generation

**none**
> Index, embed, and select only; no catalyst generation or network

Omit **--llm** to use the persisted **enzyme model** preference (an installed local model when selected or available), otherwise hosted. Without **--llm** and without any hosted or env key, catalyst generation is skipped and local search still works. Default **init** uses Enzyme's hosted bootstrap and ignores inherited OpenAI variables so it does not spend a personal key.

Markdown **compile** is an OpenRouter Decisions call. It reuses the hosted lease from **login**. Catalyst generation uses **OPENAI-MODEL**; Decisions uses **ENZYME-JEV-MODEL** (default `typesafe/jev-1.13`).

# CONFIGURATION

**~/.enzyme**
> Enzyme home when **ENZYME-HOME** is unset. Holds `config.toml`, `models/`, workspace programs in `configs/`, named workspace data in `workspaces/`, and apply journals under `configs/.enzyme-apply/`

**_vault_/.enzyme/**
> Legacy per-vault data: `enzyme.db`, `enzyme.log`, `refresh.lock`, `workspace.lock`. Named workspaces store the same files under `~/.enzyme/workspaces/`

**`.enzyme` program**
> Readable settings compiled by **enzyme compile**. Declares `workspace`, `source markdown` / `source sqlite`, and `learn questions from` readings with a profile (`operational`, `decision_trace`, `resonance_trace`, `reflective`, `relational`, `preference_evidence`, or default `tension_trace`)

**OPENAI-API-KEY**, **OPENAI-BASE-URL**, **OPENAI-MODEL**
> Used only with **--llm env**. **OPENAI-BASE-URL** `https://openrouter.ai/api/v1` takes precedence for Markdown compile

# CAVEATS

Exit codes: **0** success (including warnings), **1** index or runtime failure, **2** usage (bad flags or workspace name), **3** configuration (unreadable program, undeclared workspace, missing **--llm env** / **local** prerequisites), **4** workspace busy (lock held past **--lock-timeout**), **5** **init** indexed but catalysts failed their quality gate.

Concurrent **init** / **refresh** on one workspace wait on `workspace.lock`, bounded by **--lock-timeout**. A detached catalyst worker may hold `refresh.lock` separately.

On FUSE mounts, the SQLite database is mirrored under `/tmp/enzyme/` because FUSE cannot support SQLite's `xDelete`.

**scan** is a hidden command still used by the SQLite source skill (`enzyme scan --workspace` _NAME_); prefer **compile** for setup.

This is Enzyme Labs' knowledge CLI, not the LLVM Enzyme automatic-differentiation plugin.

# HISTORY

**Enzyme** is developed by Enzyme Labs (Joshua Pham). The public tree is a Rust workspace (`enzyme-cli`, `enzyme-core`, `enzyme-api`) under Business Source License **1.1**, version **0.13.1** as of **2026-10-24**. Releases and `install.sh` are published on GitHub.

# SEE ALSO

[rg](/man/rg)(1), [grep](/man/grep)(1), [jq](/man/jq)(1), [claude](/man/claude)(1), [codex](/man/codex)(1), [obsidian](/man/obsidian)(1), [sqlite3](/man/sqlite3)(1), [llm](/man/llm)(1)

# RESOURCES

```[Source code](https://github.com/byenzyme/enzyme)```

```[Homepage](https://byenzyme.com)```

```[Documentation](https://github.com/byenzyme/enzyme/blob/main/README.md)```

<!-- verified: 2026-10-24 -->
