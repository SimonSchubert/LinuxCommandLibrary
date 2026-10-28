# TAGLINE

Plimsoll sandbox daemon that runs untrusted code behind a stated isolation tier

# TLDR

Print the **environment-variable** reference

```plimsolld -h```

Start a **loopback** daemon with the in-process wasm provider

```SANDBOX_PROVIDER=wasm PLIMSOLL_ADDR=127.0.0.1:8746 PLIMSOLL_CLIENTS_FILE=[clients.json] PLIMSOLL_LOG_FORMAT=text plimsolld```

Same, but run **JavaScript in a container**

```SANDBOX_PROVIDER=docker PLIMSOLL_ADDR=127.0.0.1:8746 PLIMSOLL_CLIENTS_FILE=[clients.json] plimsolld```

Raise the wall to **gVisor** (`runsc`)

```SANDBOX_PROVIDER=docker SANDBOX_DOCKER_RUNTIME=runsc PLIMSOLL_ADDR=127.0.0.1:8746 PLIMSOLL_CLIENTS_FILE=[clients.json] plimsolld```

**Install** the daemon from the module

```go install github.com/plimsollmark/plimsoll/cmd/plimsolld@latest```

# SYNOPSIS

**plimsolld** [**-h**]

# DESCRIPTION

**plimsolld** is the Plimsoll sandbox server. It serves **SandboxService** over Connect (cleartext HTTP/2 "h2c" and HTTP/1.1, or HTTP/1.1 plus HTTP/2 over TLS when **PLIMSOLL_TLS_CERT** is set). Callers send code; the daemon runs it behind one **isolation tier** and puts that tier on every result. A request may set a **floor**; if the provider is weaker, the daemon returns **ErrInsufficientIsolation** and **nothing runs**.

The process takes **no arguments**. Every setting is an environment variable. **plimsolld -h** prints the full list; a test requires every variable the package reads to appear there. **SANDBOX_PROVIDER** selects the backend. Unset, the provider is **disabled** and no code runs. Authenticated callers need the `code:run` scope. A real provider refuses to start without **PLIMSOLL_TOKEN** or **PLIMSOLL_CLIENTS_FILE** unless **PLIMSOLL_INSECURE=1**.

Install with `go install github.com/plimsollmark/plimsoll/cmd/plimsolld@latest`. There are no prebuilt binaries and no daemon container image. Build from a clone with `go build ./cmd/plimsolld`. Manage caller registries with **plimsoll-clients**. Sign and replay run records with **plimsoll-attest**.

# CONFIGURATION

**SANDBOX_PROVIDER**
> Backend: `wasm` (QuickJS on wazero, tier **process**), `docker` (container or **kernel** with `runsc`), `e2b` (Firecracker, tier **vm**), or unset/**disabled**. Default is disabled

**PLIMSOLL_ADDR**
> RPC listen address. Default **:8746** (every interface). Use `127.0.0.1:8746` for loopback only

**PLIMSOLL_METRICS_ADDR**
> `GET /metrics` listener. Default **127.0.0.1:9464**. `off` disables it. No authentication; labels name grant profiles

**PLIMSOLL_GUARD_ADDR**
> Egress-guard listener. Required when **E2B_GUARD_URL** or **SANDBOX_DOCKERCLOUD_GUARD_URL** is set; refused otherwise. Never shares **PLIMSOLL_ADDR**

**PLIMSOLL_LOG_FORMAT**
> `json` (default) or `text`

**PLIMSOLL_CLIENTS_FILE**
> JSON caller registry (fingerprints only). Takes precedence over **PLIMSOLL_TOKEN**. Written by **plimsoll-clients**. A running daemon does not reload it; restart after edits

**PLIMSOLL_TOKEN**
> One shared bearer granting `code:run` (at least 32 characters)

**PLIMSOLL_INSECURE**
> `1` allows a real provider with auth off. Development only; never expose that listener

**PLIMSOLL_TLS_CERT** / **PLIMSOLL_TLS_KEY**
> PEM certificate and key. When set, every listener serves TLS

**PLIMSOLL_HARDENED**
> `1` enforces production policy at startup (vm or verified kernel isolation, multi-client auth, TLS on non-loopback listeners, pinned images, resource envelope, rate limits). Any violation refuses to serve

**PLIMSOLL_GRANTS_FILE**
> JSON capability profiles a caller may select as `grant_profile`

**SANDBOX_MIN_ISOLATION**
> Refuse to start unless the provider meets `vm`, `kernel`, `container`, or `process`

**SANDBOX_DOCKER_IMAGE** / **SANDBOX_DOCKER_PROJECT_IMAGE** / **SANDBOX_DOCKER_MODULE_IMAGE**
> Snippet image (default `node:22-alpine`), project image (default `plimsoll/sandbox:latest`), and simulation worker image. Build project images with `make docker-images`

**SANDBOX_DOCKER_RUNTIME**
> `runsc` for gVisor (tier **kernel**). Empty uses runc (tier **container**)

**SANDBOX_MAX_CONCURRENT** / **SANDBOX_PER_KEY_CONCURRENT** / **SANDBOX_RATE_PER_MIN** / **SANDBOX_RATE_BURST**
> Global in-flight cap (default **8**), per-caller cap (default half of that), per-caller runs per minute (default **30**; `0` disables), and token-bucket burst (default equals the rate)

**SANDBOX_MEMORY_MB** / **SANDBOX_CPUS** / **SANDBOX_PIDS** / **SANDBOX_DISK_MB** / **SANDBOX_TOTAL_MEMORY_MB**
> Per-run envelope and optional host memory budget

**SANDBOX_MAX_SESSIONS**
> Open sessions at once. Default **0** (sessions off). A session keeps one sandbox for many calls

# CAVEATS

**process** isolation is not a wall: do not use **wasm** for hostile code. **container** under runc shares the host kernel. **kernel** with gVisor is evidence from configuration and startup checks, not hardware attestation. Default **PLIMSOLL_ADDR** listens on every interface. Metrics have no auth. An empty clients file is refused. Changing the registry does not cancel work already admitted. Output streams are truncated at the provider limit (default **64 KiB**) with flags on the result, not a marker in the bytes. Needs **Go 1.26.9** or newer to build.

# HISTORY

**Plimsoll** is an Apache-2.0 project from **plimsollmark**. The name is the load line painted on a ship's hull: every result states the isolation tier the run actually got.

# SEE ALSO

[plimsoll-mcp](/man/plimsoll-mcp)(1), [plimsoll-clients](/man/plimsoll-clients)(1), [plimsoll-attest](/man/plimsoll-attest)(1), [plimsoll-specgen](/man/plimsoll-specgen)(1), [prospector-report](/man/prospector-report)(1), [go](/man/go)(1), [docker](/man/docker)(1)

# RESOURCES

```[Source code](https://github.com/plimsollmark/plimsoll)```

```[Documentation](https://github.com/plimsollmark/plimsoll/blob/main/docs/getting-started.md)```

<!-- verified: 2026-10-12 -->
