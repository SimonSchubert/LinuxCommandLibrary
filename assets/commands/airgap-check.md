# TAGLINE

Audit AI repositories for offline crashes, telemetry, and secret routing

# TLDR

**Static scan** a repository

```airgap-check [path/to/repo]```

Static scan plus a **Dockerfile snippet**

```airgap-check --fix [path/to/repo]```

Run the app in a container with **no network**

```airgap-check --run [path/to/repo]```

**Build** the repo Dockerfile, then run a smoke command offline

```airgap-check --run --build --run-cmd "python3 -m pytest tests/smoke_test.py" [path/to/repo]```

Use a **custom image** and fail DNS immediately

```airgap-check --run --dns-action nxdomain --image [my-app:latest] --run-cmd "node server.js" [path/to/repo]```

Apply a **custom rules** file

```airgap-check --rules [./airgap.custom.json] [path/to/repo]```

**JSON** output

```airgap-check [path/to/repo] --json```

# SYNOPSIS

**airgap-check** [_options_] _path_

# PARAMETERS

_path_
> Repository to scan. Flags may appear before or after the path.

**--fix**
> Print Dockerfile ENV flags and pre-warm commands for known download and telemetry sites.

**--run**
> Run a probe in `docker run --rm --network none`. Needs Docker.

**--build**
> With **--run**, build the repo Dockerfile first.

**--run-cmd** _command_
> Command to run inside the isolated container.

**--image** _name_
> Existing image to run instead of a built one.

**--dns-action** **sinkhole**|**nxdomain**
> DNS mode for **--run**. Default **sinkhole** answers A queries with 127.0.0.1 so TLS SNI and HTTP Host still show. **nxdomain** fails at DNS.

**--rules** _file_
> Extra rules (or use `.airgap-check.json` in the repo).

**--json**
> Machine-readable output.

**-h**, **--help**
> Show help and exit.

# DESCRIPTION

**airgap-check** (Humanet) is a Go CLI that looks for what an AI application downloads or tries to reach when the network is gone. It scans lockfiles and source for runtime fetches (tokenizers, ONNX weights, `from_pretrained`, telemetry hosts, installer subprocesses) and can run the app in a container with no network.

The static pass reads requirements files, `pyproject.toml`, `package.json`, `Cargo.toml`, `go.mod`, and matching lockfiles with a small built-in TOML/YAML reader. It classifies `.env` key names (not values) and git-tracked status.

**--run** starts an ephemeral container, injects a loopback DNS/TLS/HTTP sinkhole, and hooks Python and Node sockets. After the main process exits it waits briefly so detached atexit senders can finish. A command that exits 0 after attempted egress is reported as silent egress.

# CAVEATS

Go standard library only; **--run** needs Docker. Static parsing can miss unusual formatting. Only code paths you exercise are tested. Traffic to literal IP addresses may show as ENETUNREACH instead of SNI. Compiled binaries that ignore HTTP PROXY and cannot bind ports 53/80/443 as a non-root user will not hit the loopback listeners. Findings that a library can fetch offline do not prove the application reaches that call in production.

# SEE ALSO

[docker](/man/docker)(1), [curl](/man/curl)(1), [strace](/man/strace)(1)

# RESOURCES

```[Source code](https://github.com/humanethq/airgap-check)```

<!-- verified: 2026-11-12 -->
