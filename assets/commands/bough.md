# TAGLINE

Terminal coding agent that acts by running one JavaScript program per turn

# TLDR

**Start the terminal UI** in a git checkout

```bough```

**Resume** the most recent session

```bough -c```

Run **headless** (stdin in, events out) with no API key, using the echo provider

```printf 'say hello\n' | bough --headless --set llm.plugin=llm-echo```

Start the **web control room**

```bough serve```

Override the **model plugin** for this run

```bough --set llm.plugin=llm-openrouter```

Show the live **plugin row** table

```bough rows```

Print **version**

```bough --version```

# SYNOPSIS

**bough** [_options_]

**bough** _command_ [_args_]

# PARAMETERS

**-c**, **--continue**
> Resume the most recent session.

**-r**, **--resume** [_id_]
> Resume a session by id, or pick from a list.

**--headless**
> Read prompts from stdin and print events on stdout. **--json** emits machine-readable events.

**--set** _key_=_value_
> Override a plugin-row field for this run (for example **llm.plugin=llm-echo** or **llm.model=...**).

**--project** _slug_
> Start a project session whose shell runs in that project's container (macOS / Apple container today).

**--local**
> Local session (default): file tools may write only inside the git checkout **bough** was started in.

**--config** _path_
> Config file (otherwise **./bough.yml**, else **~/.bough/bough.yml**, else the embedded default).

**--web** [_addr_]
> Browser UI (alternative to **bough serve**).

**--verbose**
> Kernel, MCP, and config diagnostics on stderr (also **BOUGH_VERBOSE=1**).

**--version**
> Print **bough** and the version.

**--help**
> Flags, subcommands, and config locations.

# COMMANDS

**serve**
> Web control room for sessions. First visit walks through an API key and a folder.

**rows**
> Print the live plugin-row state table and exit.

**log** [_file_]
> Pretty-print the latest session history. **--raw** prints JSONL.

**sessions**
> List sessions, newest first.

**search** _query_
> Find sessions by content. Prefixes **repo:**, **branch:**, and **since:** narrow results.

**mcp list** | **tools** | **status** | **call**
> Inspect and invoke configured MCP servers.

**wiki install** | **run** | **pending** | **digest** | **check**
> Compile session logs into a local markdown wiki under **~/.bough/wiki**.

**update**
> Pull/rebuild the binary in place and bounce a running web session.

**restart**
> Restart a recorded **--web** session.

# DESCRIPTION

**bough** is a terminal coding agent. Each model turn is one JavaScript program, not a list of single tool calls. The program runs in-process; **tools.view**, **tools.patch**, **tools.bash**, **tools.spawn**, and every MCP tool are ordinary functions, so a patch and the tests that check it can be one step, and the model can branch on results in code.

The provider, loop, tools, TUI, web UI, MCP, hooks, and skills are rows in **bough.yml**. Saving that file mid-session remounts only what changed. Sessions are append-only JSONL under **~/.bough/history**. There is no telemetry; the binary talks to the LLM provider you configure, the MCP servers you add, the public models.dev price list, and GitHub when you run **bough update**.

Started inside a git checkout, file tools may write only under that checkout. Started anywhere else, the session is read-only. Skills use the same **SKILL.md** layout as Claude Code (**~/.claude/skills** and **./.claude/skills**). API keys go in **~/.bough/env** (**ANTHROPIC_API_KEY**, **OPENAI_API_KEY**, **OPENROUTER_API_KEY**, or **CEREBRAS_API_KEY**).

# CONFIGURATION

**./bough.yml** or **~/.bough/bough.yml**
> Plugin rows. Each row has **id**, **plugin**, and optional **config**. Example: set **id: llm** to **plugin: llm-openrouter** and **config.model**.

**~/.bough/env**
> Environment file for provider API keys.

**~/.bough/init.js**
> Startup script that can add tools, commands, and providers.

**~/.bough/hooks/**_event_**/**
> JavaScript hooks for **session-start**, **user-prompt-submit**, **pre-code-exec**, **post-result**, and **stop**. Re-read on every fire.

**~/.bough/history/**
> Append-only session logs.

# CAVEATS

macOS and Linux only; no Windows build. **tools.bash** is not sandboxed: it runs as you, with your files, credentials, and network. File tools refuse paths outside the checkout (including via symlinks), but the shell is not similarly confined. Project-session containers currently need macOS. Local sessions have no per-turn file checkpoints, so rewinding the conversation does not undo edits; use git. Headless unknown subcommands exit 2; a turn error exits 1.

# HISTORY

**bough** is a one-person project by Andrey Lukin, written in Go, licensed Apache-2.0. The name is the word for a tree branch (pronounced like "now", **/baʊ/**): a conversation can fork and the old line stays as a branch.

# SEE ALSO

[claude](/man/claude)(1), [opencode](/man/opencode)(1), [aider](/man/aider)(1), [git](/man/git)(1)

# RESOURCES

```[Source code](https://github.com/andreylukin/bough)```

```[Documentation](https://github.com/andreylukin/bough/blob/main/README.md)```

<!-- verified: 2026-09-15 -->
