# TAGLINE

CLI for Woodpecker CI servers and local pipeline execution

# TLDR

**Set up** a server context (opens the UI to issue a token if **--token** is omitted)

```woodpecker-cli setup --server [https://ci.example.com]```

**Lint** the project's workflow files (`.woodpecker/`, `.woodpecker.yaml`, or `.woodpecker.yml`)

```woodpecker-cli lint```

**Lint** a specific workflow file and treat warnings as errors

```woodpecker-cli lint --strict [.woodpecker/test.yaml]```

**Run** a workflow locally (auto-detects a backend)

```woodpecker-cli exec [.woodpecker/test.yaml]```

Run every YAML file in a **workflow directory**

```woodpecker-cli exec [.woodpecker/]```

Force the **Docker** backend

```woodpecker-cli exec --backend-engine docker [.woodpecker/test.yaml]```

Pass **environment variables** into a local run

```woodpecker-cli exec --env [GOFLAGS=-mod=readonly] [.woodpecker/test.yaml]```

Pass **secrets** into a local run (values are not pulled from the server)

```woodpecker-cli exec --secrets [deploy_token="$DEPLOY_TOKEN"] [.woodpecker/deploy.yaml]```

Load secrets from a **YAML file**

```woodpecker-cli exec --secrets-file [.woodpecker/local-secrets.yaml] [.woodpecker/deploy.yaml]```

**List** repositories registered on the server

```woodpecker-cli repo ls```

Show **pipeline history** for a repository

```woodpecker-cli pipeline ls [owner/repo]```

Show the **latest pipeline** for a repository

```woodpecker-cli pipeline last [owner/repo]```

Show a **specific pipeline** (omit the number to use the latest)

```woodpecker-cli pipeline show [owner/repo] [42]```

**Start** a pipeline and inject extra step environment

```woodpecker-cli pipeline start [owner/repo] [42] -p [KEY=value]```

Add a **repository secret**

```woodpecker-cli repo secret add --repo [owner/repo] --name [deploy_token] --value [$DEPLOY_TOKEN]```

Switch the **current context**

```woodpecker-cli context use [production]```

**Update** the CLI binary to the latest release

```woodpecker-cli update```

# SYNOPSIS

**woodpecker-cli** [_global-options_] _command_ [_command-options_] [_arguments_]

# DESCRIPTION

**woodpecker-cli** is the official command-line client for **Woodpecker CI**, a container-based continuous integration engine. It talks to a Woodpecker server over its HTTP API (list and trigger pipelines, manage repositories, secrets, registries, and users) and can also compile and run workflow files on the local machine without a server.

Workflows live in **.woodpecker.yaml**, **.woodpecker.yml**, or a **.woodpecker/** directory of YAML files. **lint** and **exec** search that default order when no path is given. **exec** auto-detects a backend (**docker**, **kubernetes**, or **local**); Docker needs a running daemon, while **local** runs step commands on the host and does not reproduce the container image environment.

Server commands need a server URL and an authentication token. **woodpecker-cli setup** writes a named context and stores the token in the operating-system keyring. Flags and environment variables override stored context values.

# COMMANDS

**setup** [_server_]
> Create a named context (default **default**), save the server URL, and store the token in the keyring. If **--token** is omitted, the CLI opens the Woodpecker UI to issue one. **--context** / **--ctx** names the context.

**context**, **ctx**
> Manage named server contexts: **list** / **ls**, **use**, **delete** / **rm**, **rename**.

**lint** [_path_...]
> Lint workflow YAML. With no path, uses the project's default config. **--strict** treats warnings as errors.

**exec** [_path_...]
> Compile and run workflows from the local checkout (or **--repo-path**). **--backend-engine** selects **docker**, **kubernetes**, **local**, or auto-detect. **--env** _KEY=value_ sets pipeline environment. **--secrets** and **--secrets-file** supply secrets (not downloaded from the server). **--pipeline-event**, **--commit-branch**, **--commit-sha**, **--repo**, and related flags override CI metadata. **--metadata-file** replays metadata downloaded from the UI (same CLI/server version only). Default timeout is **1h**.

**info**
> Show the authenticated user.

**repo**
> Manage repositories: **ls**, **show**, **add**, **rm**, **sync**, **update**, **chown**, **repair**, plus **secret**, **registry**, and **cron** subcommands. **repo ls --all** includes inactive repos; **--org** filters by organization.

**pipeline**
> Manage pipelines for a repository identified by id or **owner/name**: **ls**, **show**, **last**, **create**, **start**, **stop**, **approve**, **decline**, **deploy**, **ps**, **queue**, **purge**, and **log show** / **log purge**. **pipeline ls** accepts **--branch**, **--event**, **--status**, **--limit** (default 25), **--before**, and **--after** (RFC3339).

**org**
> Manage organization **secret** and **registry** entries. **--organization** / **--org** takes an id or full name.

**admin**
> Server administration: **log-level**, global **secret** and **registry**, **user**, and **org ls**. Requires an admin token.

**update**
> Replace the CLI binary with the latest release. **--force** reinstalls even when already current.

# PARAMETERS

**-s**, **--server** _url_
> Woodpecker server address. Overrides the current context. Environment: **WOODPECKER_SERVER**.

**-t**, **--token** _token_
> Server authentication token. Overrides the keyring entry for the current context. Environment: **WOODPECKER_TOKEN**. Prefer **setup** or the environment variable so the token is not visible in process listings.

**-c**, **--config** _file_
> Path to the **legacy** `config.json` file. Environment: **WOODPECKER_CONFIG**. Does not select a named context.

**--log-level** _level_
> Log level (default **info**). Environment: **WOODPECKER_LOG_LEVEL**.

**--log-file** _path_
> Log destination. **stdout** and **stderr** are accepted; default is **stderr**.

**--pretty**
> Pretty-print debug output.

**--nocolor**
> Disable color in pretty debug output.

**--disable-update-check**
> Skip the CLI update check.

**--skip-verify**
> Skip TLS verification of the server certificate.

**--socks-proxy** _addr_
> SOCKS proxy for server requests. **--socks-proxy-off** ignores it.

# CONFIGURATION

**~/.config/woodpecker/contexts.json**
> Named contexts on Linux and other Unix systems (`XDG_CONFIG_HOME` overrides the base). macOS uses `~/Library/Application Support/woodpecker/contexts.json`. Each entry stores **name**, **server_url**, and **log_level**. **current_context** must name one of those entries. Tokens are **not** written here; they live in the OS keyring, keyed by server URL.

**~/.config/woodpecker/config.json**
> Legacy single-server file used when no current context can be loaded. Accepts **server_url** and **log_level**. **--config** / **WOODPECKER_CONFIG** point at this file, not at `contexts.json`.

**.woodpecker/**, **.woodpecker.yaml**, **.woodpecker.yml**
> Default workflow locations, searched in that order by **lint** and **exec**.

Precedence for connection settings: command-line flags, then **WOODPECKER_SERVER** / **WOODPECKER_TOKEN** / **WOODPECKER_LOG_LEVEL**, then the current context (or legacy config).

# CAVEATS

Server commands fail without a reachable server and a valid token. Tokens in argv appear in process listings and shell history; use **setup** (keyring) or **WOODPECKER_TOKEN**.

**exec --backend-engine docker** needs a Docker daemon. **local** runs commands on the host and does not match container images, users, or packages used on agents.

Secrets used by **exec** must be passed with **--secrets** or **--secrets-file**; they are not fetched from the server. Keep local secret files out of version control.

**--metadata-file** is not a stable API. Replay only with the same Woodpecker version that produced the file.

Match CLI and server versions. **--skip-verify** disables TLS verification.

The npm package **@woodpecker.co/cli** is a different product (command name **woodpecker**). This binary is **woodpecker-cli** from Woodpecker CI.

# HISTORY

Woodpecker CI was forked from **Drone 0.8** by **@laszlocph** in **April 2019** after Drone's license change, and renamed Woodpecker in **August 2019**. The project is Apache 2.0 licensed and remains community-maintained. **woodpecker-cli** is built from the same Go tree as the server and agent (`cmd/cli`). Current releases are in the **3.x** series (3.18 as of August 2026).

# INSTALL

```pacman: sudo pacman -S woodpecker-cli```

```apk: sudo apk add woodpecker-cli```

```zypper: sudo zypper install woodpecker-cli```

```brew: brew install woodpecker-cli```

```nix: nix profile install nixpkgs#woodpecker-cli```

<!-- packages: 2026-09-04 -->

# SEE ALSO

[docker](/man/docker)(1), [git](/man/git)(1), [act](/man/act)(1), [circleci](/man/circleci)(1), [gitea](/man/gitea)(1)

# RESOURCES

```[Source code](https://github.com/woodpecker-ci/woodpecker)```

```[Homepage](https://woodpecker-ci.org/)```

```[Documentation](https://woodpecker-ci.org/docs/cli)```

<!-- verified: 2026-09-05 -->
