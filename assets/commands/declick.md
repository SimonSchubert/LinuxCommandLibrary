# TAGLINE

Compile APIs, MCP servers, and databases into agent-ready CLIs

# TLDR

**Install** the global CLI (needs Node 24 or newer)

```npm i -g declick```

**Wire** declick into local agent clients (PATH, MCP adapters, rules)

```declick setup```

**Compile** an OpenAPI spec into a named adapter

```declick add [https://petstore3.swagger.io/api/v3/openapi.json] --name [petstore]```

**List** an adapter's verbs

```declick run [petstore] describe```

**Call** a verb and keep only named fields

```declick run [petstore] [get-user-by-name] [user1] --fields [username,email]```

**Preview** a mutating call without sending it

```declick run [petstore] [get-pet-by-id] [7] --dry-run```

**Filter** a list before it reaches the model

```declick run [shop] [list-pets] --where [status=sold] --limit [20]```

**Compile** a SQLite database into list/get/insert verbs

```declick add sqlite:[path/to/data.db] --name [db]```

**Check** Node, PATH, engines, and agent integration

```declick doctor```

# SYNOPSIS

**declick** _command_ [_options_] [_args_]

# PARAMETERS

**setup**
> Put **~/.declick/bin** on PATH, adopt the agent's MCP servers as adapters, write a rules block to **CLAUDE.md** or **AGENTS.md**, and (Claude Code) install a PreToolUse hook. **--dry-run** prints the plan; **--revert** restores a byte-exact snapshot.

**add** _source_ **--name** _n_
> Compile a source into **~/.declick/**_n_ (manifest, launcher, SKILL.md). Sources include OpenAPI/Swagger URLs or files, Postman/Insomnia collections, HAR captures, GraphQL schemas, **mcp:**_command_, **sqlite:**_path_, **cli:**_binary_, **web:**_url_, **app:**_window_ (Windows), and **compose:**_chain.json_. **--verbs** / **--tag** subset a large spec; **--engine** overrides detection; **--force** overwrites a name collision; **--dry-run** compiles and lints without writing.

**run** _name_ _verb_ [_args_]
> Invoke a compiled verb without putting the adapter on PATH. Once **~/.declick/bin** is on PATH, the short form _name_ _verb_ [_args_] is equivalent.

**describe** _name_
> Print the adapter surface (verbs, required args, base URL). Pages itself over about 2000 characters. **--full**, **--verb** _v_, **--grep** _text_, **--offset** _N_, **--limit** _N_ narrow the listing.

**list**
> Every adapter: engine, source, verb names, auth keys, last run, last error.

**engines**
> Built-in engines. **--source** _x_ reports which engine a source would use before anything is written.

**doctor**
> Node version, home, PATH, skill dirs, vault, deskclaw, Claude CLI, governance, engine readiness, and whether **setup** has run. Exit 1 only when Node is too old.

**path** **--install**
> Put **~/.declick/bin** on PATH for new shells. **--dry-run** previews without writing.

**daemon** [**start** | **stop** | **status**]
> Keep stdio MCP servers warm between runs. HTTP MCP adapters never use it.

**defaults** _name_
> Per-adapter flag defaults in **~/.declick/**_name_**/defaults.json**. **--set** _k=v_, **--unset** _k_, **--clear**, optional **--verb** _v_.

**policy**
> Inspect **~/.declick/policy.json**. **--check** _adapter_ _verb_ shows which rule wins; **--example** prints a starter file.

**auth** _name_
> Report which required env keys are present (process environment, then **~/.creds/vault.env**) and from where. Exit 4 when any is missing.

**lint** _name_ / **build** _name_ / **skill** [_name_]
> Check the contract, recompile from the stored source, or regenerate SKILL.md. **skill --print** writes one skill to stdout.

**remove** _name_ [_verb_]
> Delete an adapter (manifest, launcher, skill) or one desktop verb.

**export** _name_ / **import** [_file_|**-**]
> Round-trip a JSON bundle of manifest plus recipes. **declick export** _n_ **| declick import -** rebuilds on another machine.

**compose** _name_
> Print a compose chain. **--steps** _file_ compiles a chain of existing adapter verbs into one verb.

**audit**
> Read **~/.declick/audit.jsonl** newest first. **--adapter** _n_, **--since** _10m_, **--failed**, **--sum**.

**ui**
> Local page at **http://127.0.0.1:4870** (loopback only). **--open**, **--port** _N_, **--allow-authoring**.

**uninstall** **--yes**
> Revert setup if it ran, delete **~/.declick**, and print the **npm rm -g declick** line. Refuses without **--yes**.

**--json**
> Envelope on stdout. Default when stdout is not a TTY. Success: **{ok:true, data, meta}**. Failure: **{ok:false, error, exit}**. **--json false** forces text.

**--fields** _a,b_
> Project named fields (dotted paths allowed). A list that matches nothing is exit 1.

**--limit** _N_
> Cap list output (default 50). Must be a positive integer.

**--where** _k=v_
> Filter a list before **--fields** and **--limit**. Repeatable. Operators: **=**, **!=**, **~** (regex), **>**, **>=**, **<**, **<=**, **=*** (present).

**--rows** _path_
> Unwrap a dotted array field inside a response object.

**--dry-run**
> Print what a mutating verb or write command would do; set **meta.dryRun: true**.

**--each** _file_
> Run the verb once per NDJSON/JSON-array item (**-** for stdin). One envelope; exit is 0 only when every item succeeded.

**--cache** _seconds_
> Answer a read-only verb from a stored response younger than this. Exit 1 on a mutating verb.

**--max-bytes** _N_
> Ceiling on **data** bytes (default 8192, **0** off). Over the cap: **meta.truncated** and **meta.capped**, exit still 0.

**--no-defaults**
> Ignore **~/.declick/**_name_**/defaults.json** for this call.

**--header** _'K: V'_, **--base-url** _url_, **--body** _@file_, **--retry** _N_, **--timeout** _ms_, **--verbose**, **--curl**
> HTTP request flags on openapi, postman, and har verbs.

**commands** / **version** / **--help**
> Command surface as data, build version, or one command's flags and examples.

# DESCRIPTION

**declick** compiles an API spec, MCP server, database, CLI, web page, or (on Windows) desktop window into a named shell adapter. Each adapter exposes **verbs** that return one JSON envelope and one of five exit codes, so an agent can call tools through the shell instead of carrying a full MCP tool listing on every turn.

Every engine, and declick itself, honors the same output contract: **describe** for a compact surface, **--json** for a stable envelope, **--fields** / **--limit** / **--where** to cut the payload before it reaches a model, and **--dry-run** on mutating verbs. **declick add** writes **~/.declick/**_name_**/manifest.json**, a two-line launcher under **~/.declick/bin**, and a **SKILL.md** into agent skill directories that already exist (**~/.claude/skills**, and **~/.codex/skills**, **~/.hermes/skills**, **~/.openclaw/skills**, **~/.agents/skills** when present).

The ten built-in engines (zero runtime npm dependencies, Node 24+) are **openapi**, **postman**, **har**, **graphql**, **mcp**, **sqlite**, **cli**, **web**, **desktop**, and **compose**. Auth is never stored in a manifest: required names are read from the process environment, then **~/.creds/vault.env**. Optional DashClaw governance and a local **policy.json** can block mutating verbs with exit 3.

# EXIT CODES

**0**
> Success.

**1**
> Error (bad flags, invalid input, Node too old, unreadable policy).

**2**
> Not found (adapter, verb, window, or element).

**3**
> Blocked (local policy, DashClaw guard, unarmed deskclaw, or STOP).

**4**
> Auth needed (required env key missing).

# CONFIGURATION

**~/.declick/**
> Default home (**DECLICK_HOME**). Adapters, launchers, cache, audit log, daemon socket, and setup snapshots.

**~/.declick/**_name_**/manifest.json**
> Compiled contract. Regenerated by **declick build**; do not edit by hand.

**~/.declick/**_name_**/defaults.json**
> Optional per-adapter / per-verb flag defaults. Survives **build**; deleted with **remove**.

**~/.declick/policy.json**
> Local allow/warn/block rules (globs on adapter and verb). First match wins. Invalid JSON fails closed (every run exits 1). **DECLICK_POLICY** moves the path.

**~/.declick/audit.jsonl**
> One JSON line per verb invocation. **DECLICK_AUDIT=off** disables it.

**~/.declick/bin/**
> Generated adapter launchers. **declick path --install** (and **setup**) put this directory on PATH.

**DECLICK_MAX_BYTES**, **DECLICK_CACHE**, **DECLICK_DEFAULTS**, **DECLICK_TIMEOUT_MS**, **DECLICK_DAEMON_IDLE_MS**
> Output cap, response cache, defaults, HTTP/MCP timeout, and daemon idle (ms). See **declick doctor** and the upstream reference for the full list.

**DASHCLAW_API_KEY**, **DASHCLAW_URL**
> Optional remote guard for mutating verbs. No key means verbs run and the envelope records **governance.enabled: false**.

# CAVEATS

Requires **Node 24 or newer**; an older runtime exits 1 with one line naming the version it found. Published on npm as **declick**; distro packages are uncommon.

Releases after **0.3.0** use the **Elastic License 2.0** (use and modify; do not offer it as a managed service). 0.3.0 on npm was MIT.

The **desktop** engine shells out to deskclaw and is Windows-only; **declick engines** reports it as not ready on other platforms. **author** / **repair** need the Claude Code CLI on PATH. **declick ui** binds loopback only and is a local control page, not a public server.

# HISTORY

**declick** is a Node CLI by **ucsandman**, first published on GitHub in **September 2026** (npm package **declick**, homepage **declick.dev**). It compiles OpenAPI, MCP, SQLite, and related sources into shell verbs with a shared output contract aimed at coding agents. Version **0.6.x** added compose chains, a warm MCP daemon, local policy, and agent **setup** / **uninstall**.

# SEE ALSO

[curl](/man/curl)(1), [openapi-generator](/man/openapi-generator)(1), [sqlite3](/man/sqlite3)(1), [jq](/man/jq)(1), [npm](/man/npm)(1), [claude](/man/claude)(1)

# RESOURCES

```[Source code](https://github.com/ucsandman/declick)```

```[Homepage](https://declick.dev)```

```[Documentation](https://github.com/ucsandman/declick/blob/main/docs/REFERENCE.md)```

<!-- verified: 2026-09-05 -->
