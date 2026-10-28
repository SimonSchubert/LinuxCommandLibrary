# TAGLINE

MCP server that runs code in a Plimsoll sandbox

# TLDR

Serve tools on **stdio** for a local daemon

```PLIMSOLL_URL=http://127.0.0.1:8746 PLIMSOLL_TOKEN=[token] plimsoll-mcp```

Print the **name and version**

```plimsoll-mcp --version```

Ask a running remote server for **status** (one JSON object)

```PLIMSOLL_MCP_STATE_DIR=[/var/lib/plimsoll-mcp] plimsoll-mcp status```

Listen for **remote HTTPS** clients on loopback

```plimsoll-mcp serve-http```

Print a one-use **owner enrollment** code

```plimsoll-mcp enroll-http```

**Build** the binary from its module

```go install github.com/plimsollmark/plimsoll/clients/mcp/cmd/plimsoll-mcp@latest```

# SYNOPSIS

**plimsoll-mcp** [**--version**]

**plimsoll-mcp** [_command_]

# DESCRIPTION

**plimsoll-mcp** is the Model Context Protocol server for **plimsolld**. An agent host (Claude Code, Codex, Claude Desktop, and others) starts it and calls its tools. Each tool runs through Plimsoll's checked Go client. The server never embeds the daemon: it needs a **plimsolld** it can reach, and it uses its own caller credential.

With no argument it speaks MCP on stdin and stdout. Diagnostics go to stderr so they do not mix with the protocol stream. It serves the MCP revision dated 2026-07-28 and the 2025 revisions (Go SDK 1.8.0). **--version** and **-version** print the server name (**plimsoll**) and version (**0.1.0** in the current source).

The tools are **run_code** (Python or JavaScript, optional files, optional sandbox handle), **open_sandbox**, **close_sandbox**, **get_record**, and **server_info**. A sandbox handle is random and is not the daemon's session id. A failed program is a result that carries the exit code. A refusal before any code is sent is a tool error whose **ran** field is **no**. A call that may have run without a checked answer is **maybe** and must not be retried.

**get_record** keeps the last **256** checked records in memory (at most **64 KiB** each, **16 MiB** in all) until the process exits. Signed receipts, when configured, are written beside that and are checked with **plimsoll-attest**.

One argument selects an operator command instead of stdio. **status**, **disable**, **enable**, **enroll**, and **reset-owner** print one JSON object and give up after **7** seconds. **serve-http** and **enroll-http** bind a loopback HTTP listener for the optional single-owner remote mode.

The module is **github.com/plimsollmark/plimsoll/clients/mcp** and needs **Go 1.26**. From a checkout of **clients/mcp**, **go build -o plimsoll-mcp ./cmd/plimsoll-mcp** produces the same binary. An npm launcher (**@plimsollmark/mcp**) exists for published releases; install that package and point the host at the installed path rather than **npx** from an untrusted project directory.

# COMMANDS

**status**, **disable**, **enable**, **enroll**, **reset-owner**
> Local operator commands against the remote server's state directory (**PLIMSOLL_MCP_STATE_DIR**). Each prints one JSON object on stdout. A running server is preferred over a stale control socket; a lost response is not retried, because the change may already have landed

**serve-http**
> Dedicated HTTP listener for hosted clients. Default bind is **127.0.0.1:8750** (**PLIMSOLL_MCP_LISTEN**), and it must be a literal loopback address. **PLIMSOLL_MCP_PUBLIC_URL** is one fixed HTTPS origin. Execution stays off until **PLIMSOLL_MCP_EXECUTION** is **enabled**. This mode requires an authenticated daemon caller, a **kernel** or **vm** isolation floor, signed receipts, and a sandbox cap of at least **2**. It refuses an insecure daemon transport

**enroll-http**
> Same listener, enrollment only. Prints the owner enrollment URL and a one-use local code that expires in **five** minutes. OAuth and tools are unavailable in this mode. A daemon URL is not required

# CONFIGURATION

Stdio and **serve-http** read the daemon client from the environment. An empty value counts as unset. A value that is still a host placeholder (**${...}**) is an error. Cleartext HTTP is accepted only to loopback unless **PLIMSOLL_INSECURE_HTTP** is **1**.

**PLIMSOLL_URL**
> Required for stdio and **serve-http**. The **plimsolld** base URL, such as **http://127.0.0.1:8746**

**PLIMSOLL_TOKEN**
> Caller token with the **code:run** scope. Omit only for an open development daemon. **serve-http** requires it

**PLIMSOLL_MIN_ISOLATION**
> Weakest tier a run accepts: **vm**, **kernel** (default), **container**, or **process**. **serve-http** allows only **kernel** or **vm**

**PLIMSOLL_SOFTWARE_IDENTITY**
> Comma-separated image identities the daemon and this client both check. One identity is an exact pin; several are an approved set

**PLIMSOLL_TIMEOUT_MS**
> Run budget inside the sandbox, whole milliseconds from **1000** to **3600000**. Default **50000**

**PLIMSOLL_CALL_TIMEOUT_MS**
> Whole tool call, from **1000** to **7200000**. Default **80000**. Must be at least **10** seconds above the run budget

**PLIMSOLL_SANDBOX_LIFETIME_MS**
> Lifetime asked of the daemon for each sandbox, from **60000** to **43200000**. Default **1800000** (30 minutes)

**PLIMSOLL_LANGUAGES**
> **python** and/or **javascript**, once each. Default is both, and the first is the default language

**PLIMSOLL_MAX_SANDBOXES**
> Open handles at once, **1** to **16**. Default **3**. **serve-http** requires at least **2**

**PLIMSOLL_MAX_OUTPUT_BYTES**
> Bytes of stdout and of stderr returned to the model, **1000** to **1000000**. Default **16000**

**PLIMSOLL_SIGNING_KEY_FILE** / **PLIMSOLL_RECEIPTS_DIR**
> Set both, or neither, to turn on signed receipts. The key is an Ed25519 pair from **plimsoll-attest keygen**. The directory is created owner-only. Receipts are refused on Windows

**PLIMSOLL_RECEIPTS_MAX_MB**
> Cap on that directory, **1** to **1000000**. Default **1024**. A call past the cap is refused before anything runs. Nothing is deleted for you

**PLIMSOLL_INSECURE_HTTP**
> **1** allows cleartext HTTP to a non-loopback host. **serve-http** refuses this

**PLIMSOLL_MCP_LISTEN**
> Loopback address for **serve-http** and **enroll-http**. Default **127.0.0.1:8750**

**PLIMSOLL_MCP_PUBLIC_URL**
> Fixed HTTPS origin for remote mode, with no path, user info, query, or fragment

**PLIMSOLL_MCP_STATE_DIR**
> Absolute owner-only directory for remote mode and the operator commands

**PLIMSOLL_MCP_EXECUTION**
> **disabled** (default) or **enabled**. Remote tools stay off until this is **enabled**

**PLIMSOLL_MCP_VISITOR_HEADER**
> Header a reverse proxy sets to the visitor address, for per-visitor limits. Empty means no per-visitor limit

# CAVEATS

The isolation tier is the daemon's configuration and startup checks, not hardware attestation. A sandbox has no network, and no file comes back except as stdout and stderr. A **maybe** result is never retried. Receipt signing is not available on Windows. **serve-http** is stricter than stdio: kernel or VM floor, receipts, an authenticated caller, and no insecure daemon transport. Do not launch the published npm package with **npx** from a project directory you do not trust. Exit **2** is bad usage or configuration. Exit **1** is a failed command or a server error. On a signal the process cancels calls and closes sandboxes within **5** seconds; a host may kill it sooner, which is why the sandbox lifetime exists.

# HISTORY

Part of **Plimsoll** (**plimsollmark/plimsoll**), Apache-2.0. The binary lives at **clients/mcp/cmd/plimsoll-mcp**, in its own Go module so the MCP SDK stays out of the daemon.

# SEE ALSO

[plimsolld](/man/plimsolld)(1), [plimsoll-attest](/man/plimsoll-attest)(1), [plimsoll-clients](/man/plimsoll-clients)(1), [plimsoll-specgen](/man/plimsoll-specgen)(1), [go](/man/go)(1)

# RESOURCES

```[Source code](https://github.com/plimsollmark/plimsoll)```

```[Documentation](https://github.com/plimsollmark/plimsoll/blob/main/clients/mcp/README.md)```

<!-- verified: 2026-10-28 -->
