# TAGLINE

Standalone Preloop control plane for local GitHub Actions

# TLDR

**Serve** the control plane on loopback port 8080

```preloop-server serve```

Listen on **another address** and keep state in a chosen directory

```preloop-server serve --listen [127.0.0.1:9090] --state-dir [~/.preloop]```

Store runs in **Postgres**

```preloop-server serve --store [postgres://localhost/preloop]```

Write a **self-signed** certificate pair for TLS

```preloop-server cert --output [./certs]```

Serve **HTTPS** with that pair

```preloop-server serve --tls-cert [certs/cert.pem] --tls-key [certs/key.pem]```

Turn on the **cron scheduler** for schedule workflows

```preloop-server serve --enable-scheduler```

# SYNOPSIS

**preloop-server** **serve** [_options_]

**preloop-server** **cert** [**--output** _dir_]

# DESCRIPTION

**preloop-server** is the standalone control-plane binary for **Preloop**, a local GitHub Actions engine. It accepts workflow runs over the **actions/runner** protocol and stores them. The official GitHub runner and the companion **preloop-runner** binary can register against it.

It is not **preloop serve**. That CLI command embeds this same server library and also starts the microVM pool. This binary calls **serve** with no runner pool and no GitHub funnel, so it does not boot job microVMs by itself. Install scripts from the Preloop repo place **preloop**, **preloop-server**, and **preloop-runner** together in **~/.local/bin**.

**serve** is the long-running process. **cert** writes **cert.pem** and **key.pem** (no OpenSSL required) and prints the **serve** flags that use them. Logs follow **RUST_LOG**, which defaults to **info**. **PRELOOP_LOG_FORMAT** selects **pretty**, **json**, or **auto**.

The control-plane crate is **FSL-1.1-MIT** (source-available, converts to MIT two years after each release). The rest of the Preloop tree is MIT.

# COMMANDS

**serve**
> Bind the control plane and keep running. Default listen address is **127.0.0.1:8080**. Default state directory is **.preloop** in the current working directory. **--store** is a sqlite URL, a bare filesystem path, or a postgres URL. When omitted, the store URL is read from **PRELOOP_STORE_URL**, then SQLite under the state directory. **--record-flows** _file_ appends NDJSON of recorded HTTP flows. **--tls-cert** and **--tls-key** are PEM paths and must be set together. **--tls-self-signed** makes an ephemeral certificate for local development and cannot be combined with **--tls-cert**. **--enable-test-api** turns on privileged simulation endpoints and is loopback only; **--test-api-token** is the bearer for those endpoints and requires the test API. **--oidc-issuer** is the issuer URL for tokens this server mints. **--enable-scheduler** runs the cron scheduler for schedule-triggered workflows. **--unix-socket** _path_ also listens on a Unix socket (or **PRELOOP_UNIX_SOCKET**)

**cert**
> Write a persistent self-signed **cert.pem** and **key.pem**. **--output** is the directory (default **.**). The command creates the directory if needed

# PARAMETERS

**--listen** _addr_
> TCP address for **serve**. Default **127.0.0.1:8080**

**--state-dir** _dir_
> State directory. Default **.preloop**

**--store** _url_
> Durable store. Also **PRELOOP_STORE_URL**

**--record-flows** _file_
> NDJSON file of recorded flows

**--tls-cert** _file_ / **--tls-key** _file_
> PEM certificate and private key. Each requires the other

**--tls-self-signed**
> Ephemeral self-signed certificate. Local development. Conflicts with **--tls-cert**

**--enable-test-api**
> Privileged local simulation endpoints. Loopback only

**--test-api-token** _token_
> Bearer for those endpoints. Requires **--enable-test-api**

**--oidc-issuer** _url_
> OIDC issuer URL for minted tokens

**--enable-scheduler**
> Cron scheduler for schedule-triggered workflows

**--unix-socket** _path_
> Extra Unix domain socket. Also **PRELOOP_UNIX_SOCKET**

**--output** _dir_
> Directory for **cert**. Default **.**

# ENVIRONMENT

**RUST_LOG**
> Log filter. Defaults to **info** when unset

**PRELOOP_LOG_FORMAT**
> **pretty**, **json**, or **auto**

**PRELOOP_STORE_URL**
> Default for **--store**

**PRELOOP_UNIX_SOCKET**
> Default for **--unix-socket**

**PRELOOP_REQUIRE_JOB_ASSIGNMENTS**
> When **1**, **true**, or **yes**, the server requires job assignments. Default is off

# CAVEATS

This process does not start the microVM pool. A workflow that needs an isolated job VM still needs **preloop serve**, or a runner registered against this server. The default port is **8080**; the **preloop** CLI expects an engine on **127.0.0.1:9090** unless **PRELOOP_URL** says otherwise. The default state directory is relative to the working directory, not **~/.preloop**. **--enable-test-api** must stay on loopback. The control-plane licence forbids offering this binary as a hosted CI service that competes with Preloop.

# HISTORY

**preloop-server** is the Cargo bin of crate **preloop-runner-server** in **preloopdev/preloop**. The **preloop** CLI links that crate in-process for **preloop serve** rather than executing this binary.

# SEE ALSO

[preloop](/man/preloop)(1), [preloop-runner](/man/preloop-runner)(1), [runner-watch](/man/runner-watch)(1), [act](/man/act)(1), [gh](/man/gh)(1), [git](/man/git)(1)

# RESOURCES

```[Source code](https://github.com/preloopdev/preloop)```

```[Documentation](https://docs.preloop.dev/control-plane/operate/deploy)```

```[Homepage](https://preloop.dev)```

<!-- verified: 2026-10-28 -->
