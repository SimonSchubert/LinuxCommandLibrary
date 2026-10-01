# TAGLINE

CLI for a self-hosted orchestrator of AI coding-agent sessions

# TLDR

**Log in** to an engrams host with a browser device flow

```engrams auth login```

Point the CLI at a **local orchestrator**

```engrams --url [http://localhost:8787] auth status```

Start a **task from a profile** (prints the primary session id)

```engrams task create --profile [name] --prompt "[List /workspace]"```

Boot a **session from a raw image** (admin path, no profile)

```engrams session create --image [localhost:5001/demo:warm-1] --harness [claude] --prompt "[List /workspace]"```

**Tail** a session's live event log (Ctrl-C to stop)

```engrams session logs [session_id]```

Push a **follow-up prompt** (resumes an Idle session)

```engrams session prompt [session_id] "[continue]"```

Run a **shell command** inside the session sandbox

```engrams session exec [session_id] "[uname -a]"```

Print **JSON** instead of tables

```engrams --json session list```

# SYNOPSIS

**engrams** [**--url** _url_] [**--json**] [_command_] [_subcommand_] [_options_]

# DESCRIPTION

**engrams** is the product CLI for **engrams**, a self-hosted orchestrator that runs each AI coding agent in its own microVM, snapshots the VM when the agent goes idle, and restores it on the next prompt. The binary talks only to the orchestrator over Connect RPC on `/rpc` plus the SSE event and better-auth HTTP routes. It never dials the coordinator.

Auth follows the **gh** model. **ENGRAMS_API_KEY** (sent as `x-api-key`, never stored) wins for CI. Otherwise **engrams auth login** runs RFC 8628 device authorization, opens the dashboard `/device` page, and stores a durable user-owned `engk_…` key in **~/.config/engrams/hosts.json** (mode 0600, keyed by host URL).

Default output is human-readable tables. **--json** prints pretty JSON on stdout and nothing else. Errors go to stderr as `engrams: …` with exit status 1. **session exec** mirrors the remote command's exit status.

The usual product create is **engrams task create --profile**. That compiles a profile (image, skills, network policy, integration grants) server-side and attributes the session to the caller. **engrams session create** is the admin escape hatch: a raw enabled image URI, optional harness, and allow-all egress.

The CLI lives in the `cli/` tree of the engrams repository. `bun run build` compiles a single self-contained binary to `cli/dist/engrams`. The npm package name is **engrams-cli** and is marked private. Source version is **0.10.0**. License is AGPL-3.0-only.

# PARAMETERS

**--url** _url_
> Orchestrator base URL. Overrides **ENGRAMS_URL**. Default `https://engrams.cortex.io`. Trailing slashes are stripped.

**--json**
> Pretty-print JSON on stdout instead of the human table or one-line view.

**-V**, **--version**
> Print the CLI version.

**auth**
> Log in, log out, or show identity for the active host. Subcommands: **login**, **logout**, **status**. **login** refuses to run while **ENGRAMS_API_KEY** is set, because that variable would shadow a stored key.

**task**
> Profile-based agent runs. **create** requires **--profile** _name-or-id_ and accepts **--prompt**, **--title**, **--harness**, **--model**, **--effort**, and **--mode** (session mode for the initial prompt, for example `plan`). Without **--json**, **create** prints the primary session id. **list**, **get** _id_, **delete** _id_ (deletes the task and tears down its sessions).

**session**
> Direct session operations. **create** requires **--image** _uri_ and accepts **--harness**, **--prompt**, and **--dev-vm** (no harness; interact with **exec**). **list**, **get** _id_, **delete** _id_. **exec** _id_ _cmd_ runs a shell command in the sandbox (**--timeout-secs** _n_). **logs** _id_ tails the SSE event stream (**--since** _idx_). **log** _id_ prints the conversation timeline (**--limit** _n_, **--from-start**). **resume** _id_ restores an Idle session from its hot snapshot. **prompt** _id_ _text_ sends a prompt and auto-resumes Idle.

**image**
> Enabled images that sessions may boot. **list**, **enable** (requires **--uri**; first enable also needs **--name** and **--vcpus**; optional **--description**, **--workdir**, **--memory-mib**, **--disk-gib**, **--swap-mib**, repeatable **--env** _KEY=VALUE_, **--no-wait**), **config** (always JSON), **update**, **disable**, **refresh** (**--recapture**), **jobs**, **job** _id_, **poll-job** _id_, **retry-job** _id_.

**registry**
> Docker registry credentials, envelope-encrypted server-side. **add** (requires **--host**; **--auth-kind** `static` or `gcp-workload-identity`; **--username**, **--password-file**, **--password-stdin**, **--impersonate-sa**), **list** (never returns passwords), **rm** _host_.

**host**
> Fleet hosts (alias **hosts**). **list**, **get** _id_, **drain** _id_, **uncordon** _id_, **evacuate** _session-id_, **delete** _id_ (refused while sessions are still bound).

**profile**
> Read-only launchable profiles. **list**, **get** _id_.

**apikey**
> Admin global service-account keys (your login key is **auth**). **create** requires **--name** and accepts **--role** (`admin` or `user`, default `user`) and **--expires-at** (ISO-8601; empty means never). The plaintext is printed once, alone, on stdout. **list**, **revoke** _id_.

**admin**
> Explicit triggers for background work. **flush** _session-id_ forces a chunked-disk flush. **evict-idle** _session-id_ runs idle eviction now. **gc** reports blob GC (**--apply** to delete, **--grace-secs** _n_).

# CONFIGURATION

**ENGRAMS_URL**
> Orchestrator base URL when **--url** is omitted. Default `https://engrams.cortex.io`. Local `just dev` uses `http://localhost:8787`.

**ENGRAMS_API_KEY**
> API key for CI and scripts. Sent as `x-api-key` and never written to disk. Shadows a stored login for the same host.

**~/.config/engrams/hosts.json**
> Per-host credentials written by **engrams auth login**. Path is `$XDG_CONFIG_HOME/engrams/hosts.json` when that variable is set. File mode 0600. Keys are normalized host URLs. Each value holds `apiKey`, `keyId`, and optional `user` (email at login time).

# CAVEATS

The CLI is a client. A reachable orchestrator, an API key or completed **auth login**, and at least one enabled image (or a launchable profile) are required before **task** or **session** commands do useful work.

**session create** is gated as an admin path and sets allow-all egress. Everyday agent runs should go through **task create --profile**.

The `cli` package is private. There is no public npm install of **engrams**. Build from a clone with Bun (`cd cli && bun install && bun run build`). Wire formats and APIs are 0.x and change.

Production isolation is Firecracker on Linux with KVM. A macOS backend on Apple Virtualization exists for development. Other machines may run sessions as plain subprocesses with no isolation.

This command is **engrams** (plural). Several unrelated agent-memory tools ship a binary named **engram**.

# HISTORY

**engrams** is developed by **Cortex Applications, Inc.** The current TypeScript CLI (Commander, compiled with Bun) replaced a retired Rust **engram-cli** that spoke the coordinator's app-gRPC directly. The product CLI speaks only the orchestrator. The repository is licensed AGPL-3.0; crates a custom harness links are Apache-2.0.

# SEE ALSO

[gh](/man/gh)(1), [bun](/man/bun)(1), [docker](/man/docker)(1), [claude](/man/claude)(1), [codex](/man/codex)(1), [just](/man/just)(1), [kubectl](/man/kubectl)(1), [helm](/man/helm)(1)

# RESOURCES

```[Source code](https://github.com/cortexapps/engrams)```

<!-- verified: 2026-10-01 -->
