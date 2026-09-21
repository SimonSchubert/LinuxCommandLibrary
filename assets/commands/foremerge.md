# TAGLINE

Coordination layer that warns coding agents about conflicting plans before they edit

# TLDR

Install the **release binary** (macOS and Linux)

```curl -fsSL https://foremerge.com/install.sh | sh```

**Initialize** coordination state in the current Git repository

```foremerge init```

Install skills and **MCP entries** for Codex, Claude Code, and Cursor

```foremerge setup all```

Register the **test command** agents may ask Foremerge to run

```foremerge checks set test -- cargo test --all-targets```

Check Git, the store, and **client wiring**

```foremerge doctor --client all```

See what **every agent** is doing

```foremerge status```

**Publish intent** before editing, with a semantic scope and operation

```foremerge intent publish --agent [agent_id] --task [task] --summary "[Replace PaymentService with StripePaymentService]" --scope symbol:PaymentService=replace```

**Preflight** a plan against intents already on the shared list

```foremerge conflicts check --intent "[Add PayPal support to PaymentService]" --scope symbol:PaymentService=extend```

Ask **who is changing** one scope

```foremerge work query --scope symbol:PaymentService```

Print a **JSON envelope** for scripts

```foremerge --json status```

Create an **isolated worktree** on a new branch

```foremerge worktree create --branch [agent/paypal] --path [../payments-paypal] --base HEAD```

# SYNOPSIS

**foremerge** [**--json**] [**--database** _path_] [**--cwd** _path_] _command_ [_arguments_]

# PARAMETERS

**--json**

> Print a stable JSON success or error envelope on stdout. This flag is global.

**--database** _path_

> Use this SQLite file instead of the default under Git's common directory. **FOREMERGE_DB** sets the same path.

**--cwd** _path_

> Resolve Git and runtime state from _path_. The default is the current directory.

# COMMANDS

**init**

> Create the shared store under the repository's Git common directory, and a bearer token for the local HTTP API. Tracked files stay untouched.

**setup** [_codex_|_claude_|_cursor_|_all_]

> Install the native skill and MCP entry for one client, or for all three. **--skip-mcp** writes skills only. **--force** replaces a Foremerge-managed skill or MCP entry that differs from the one this binary would write.

**doctor** [**--client** _name_]

> Check Git, SQLite, shared storage, MCP, and optional client integration.

**status**

> Show one snapshot of registered agents and their work.

**agent register** **--name** _name_ [**--model** _id_] [**--worktree** _path_] [**--no-worktree**]

> Record an agent. **agent list** prints id, name, model, worktree, and status.

**intent publish** **--agent** _id_ **--task** _task_ **--summary** _text_ [**--scope** _KIND:KEY[=OPERATION]_ ...]

> Announce planned work and return conflicts plus related work. **intent show** _id_ reads one intent back.

**work claim** **--agent** _id_ **--intent** _id_ **--scope** _KIND:KEY_ [**--reason** _text_]

> Take an advisory lease on a scope. Overlap warns and still succeeds. **work start** _intent_ **--agent** _id_ marks implementation in progress. **work query** **--scope** _KIND:KEY_ lists who holds that scope. **work watch** prints semantic events as they arrive. **work discard** keeps the audit trail and releases the claim.

**conflicts check** [**--intent** _text_ | **--intent-id** _id_] [**--scope** _KIND:KEY[=OPERATION]_ ...]

> Run the deterministic preflight. **conflicts list** shows persisted findings. **conflicts resolve** records an agreed outcome.

**assess record** **--agent** _id_ **--intent** _id_ **--related-intent-id** _id_ **--verdict** _verdict_ **--rationale** _text_ **--action** _action_

> Store what this agent concluded. Verdicts are **conflicts**, **compatible**, **duplicate**, or **depends_on**. Actions are **proceeding**, **rescoping**, **waiting**, or **abandoning**.

**changeset publish** **--agent** _id_ **--intent** _id_ **--summary** _text_

> Record a candidate linked to the current Git fingerprint. **changeset validate** _id_ **--** _command_ runs that command as Foremerge-owned evidence. **changeset accept** pins a clean, validated ref at **refs/foremerge/accepted/**_id_. **changeset commit** records the commit that actually landed after ordinary Git integration.

**checks set** _name_ **--** _command_

> Store a trusted argv check that MCP agents may request by name. **checks policy** _strict_|_advisory_ controls acceptance when Foremerge itself verified nothing. **checks list** and **checks remove** manage the set.

**worktree create** **--branch** _name_ **--path** _path_ [**--base** _rev_]

> Create a branch in a new Git worktree. The default base is **HEAD**.

**coordinate send** **--from** _id_ **--to** _id_ **--message** _text_

> Append a durable message. **coordinate inbox** reads one agent's messages.

**daemon** [**--bind** _addr_] [**--no-auth**]

> Serve the JSON API. The default bind is **127.0.0.1:47811**. **mcp** serves the same tools over stdio. **request** _GET_|_POST_ _path_ calls the local API with the stored token.

**ledger reset** [**--from** _backup_] **--yes**

> Move the current ledger aside and start empty, or restore a backup. Without **--yes** it only reports what it would do.

**graph**

> Export the current semantic dependency graph.

**events list** [**--after-seq** _n_]

> Read the append-only event log. **events audit** checks the hash chain.

# DESCRIPTION

**foremerge** is a local coordination protocol for coding agents working in separate Git worktrees. Each agent publishes what it is about to change, such as a symbol, API, schema, config key, or similar scope, and Foremerge compares those declarations before either side writes code. Git still stores the commits. Foremerge stores the shared plan in SQLite under the repository's Git common directory, so linked worktrees see the same list.

The same program is also installed as **fmg**. Usage and errors use whichever name launched the process. **fmg status** and **foremerge status** call the same code.

A scope looks like **symbol:PaymentService** or **symbol:PaymentService=replace**. Scope kinds are **symbol**, **api**, **schema**, **config**, **infra**, **test**, **migration**, **env**, **file**, **component**, **contract**, and **domain**. Operations are **add**, **extend**, **modify**, **replace**, **remove**, **rename**, and **migrate**. Only an operation the agent declared can become a **HIGH** finding. An omitted operation is inferred and stays below that severity.

The usual path is **intent publish**, **work claim**, **work start**, then implementation on an isolated branch, **changeset publish**, **changeset validate**, **changeset accept**, ordinary Git integration, and **changeset commit**. Agent-reported test lines are provenance. Acceptance uses a command Foremerge ran against that candidate's Git fingerprint.

**foremerge setup** wires Codex, Claude Code, and Cursor. **foremerge mcp** exposes the same lifecycle over stdio, so those clients can call it without the HTTP daemon. The daemon is for harnesses that prefer HTTP. It binds loopback only, and **foremerge request** will send the bearer token only to a loopback HTTP address.

# CONFIGURATION

The default database is **<git-common-dir>/foremerge/state.sqlite3**. **--database** and **FOREMERGE_DB** override it. Agents share awareness only when they open the same file.

**foremerge init** creates that database and a private token file for the API. **FOREMERGE_URL** (default **http://127.0.0.1:47811**) tells **foremerge request** where the daemon is.

**setup** writes skill files and MCP configuration for the selected clients. A skill you edited, or a differing Foremerge MCP entry, is left in place unless you pass **--force**.

Named checks and validation-exclusion rules live in that same private store. **validation-exclusions set** **--path** _path_ lists generated, untracked output a validation run may leave behind. Tracked changes are never excludable.

# CAVEATS

Version 0.5.0 of the repository is a pre-1.0, local-first release. Public schemas can still change. The crate published on crates.io can lag the Git repository; a checksum-verified release binary tracks the project's releases.

Findings are advisory. A claim warns on overlap and both agents continue. Detection uses fixed rules on the scopes and operations you declared. Two different names for one concept can miss each other, and compatible work can still produce a warning.

The store is one SQLite file on the machine that holds the Git common directory. Coordination between machines is outside this version. A network filesystem does not turn that file into a distributed lock service.

**changeset validate** and named checks run as ordinary local processes with your permissions. Passing validation means that recorded command passed for that recorded fingerprint. A later edit makes the attempt non-authoritative. **--allow-high-conflicts** and **--allow-unverified** are visible overrides and require **--override-reason**.

# HISTORY

Foremerge was first published in **August 2026** (GitHub repository created 2026-08-21, crates.io crate published 2026-08-25). It is written in **Rust** (rust-version 1.85 in the repository) and released under the **Apache License 2.0**.

# SEE ALSO

[fmg](/man/fmg)(1), [git](/man/git)(1), [jq](/man/jq)(1), [sqlite3](/man/sqlite3)(1)

# RESOURCES

```[Source code](https://github.com/naw103/foremerge)```

```[Homepage](https://foremerge.com)```

```[Documentation](https://github.com/naw103/foremerge/tree/main/docs)```

<!-- verified: 2026-09-21 -->
