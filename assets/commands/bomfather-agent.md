# TAGLINE

eBPF LSM agent that enforces executable-based access policy in the kernel

# TLDR

**Build** from source (writes `./agent`)

```make```

Run with a **YAML policy** (needs root and LSM)

```sudo ./agent run --config [config.yaml]```

The same after a **GoReleaser** install (binary name `bomfather-agent`)

```sudo bomfather-agent run --config [config.yaml]```

**Status** of a running agent (Prometheus metrics)

```sudo bomfather-agent status```

Print status as **JSON**

```sudo bomfather-agent status --json```

Point status at a **non-default metrics port**

```sudo bomfather-agent status --metrics-port [9095]```

# SYNOPSIS

**bomfather-agent** **run** [**--config** _FILE_] [_options_]

**bomfather-agent** **status** [**--json**] [**--metrics-host** _HOST_] [**--metrics-port** _PORT_]

# DESCRIPTION

**bomfather-agent** is Bomfather's Linux security agent. It loads eBPF programs and LSM hooks so policy is enforced in kernel space: which executables may read which directories, which IPs they may connect to, and related restrictions. A restriction is default-deny for every process; only listed executables are allowed through.

`make` writes the binary as **agent** in the build directory (`BIN := agent`). GitHub releases rename it **bomfather-agent** (GoReleaser `binary: bomfather-agent`, Linux amd64 and arm64). The README examples use `sudo ./agent run --config config.yaml`. This page uses the release name.

**run** parses a YAML file of `policies` and `attributes`, loads the embedded BPF object, optionally talks to a CRI socket for container context, and serves Prometheus metrics (default port **9095**, **0** disables them). An API key is optional: without it the agent stays fully local and sends nothing to Bomfather servers. **status** queries that metrics server and prints a summary, or JSON with **--json**.

Requires Linux **5.18+** with LSM enabled, plus cgroup v2. Apache-2.0.

# COMMANDS

**run**
> Load policy and start enforcement until SIGINT or SIGTERM.

**status**
> Read the running agent's metrics. Default host/port match **run**. Exits nonzero if the agent cannot be queried.

# PARAMETERS

**--config**, **-c** _FILE_
> Policy YAML for **run**.

**--api-key** _KEY_
> Optional Bomfather cloud key (**BOMFATHER_API_KEY**). Mutually exclusive with **--api-key-file**.

**--api-key-file** _FILE_
> Plain-text file containing the API key.

**--verbosity** **debug**|**info**|**warn**|**error**
> Log level for **run**. Default **info**.

**--metrics-port** _PORT_
> Prometheus port for **run** (default **9095**, **0** = off). For **status**, the port of the already-running agent (default **9095**).

**--metrics-host** _HOST_
> Host of the running agent's metrics server (**status** only).

**--json**
> **status**: print the full report as JSON.

**--server** _URL_
> gRPC server when an API key is set. Default `https://grpc.bomfather.dev` (**BOMFATHER_SERVER_URL**).

**--api-server-url** _URL_
> Key-verification HTTP API. Default `https://api.bomfather.dev`.

**--enable-debug-logging**
> Forward eBPF printk debug logs.

**--grpc-buffer-size** _N_, **--grpc-batch-size** _N_, **--grpc-batch-interval** _DURATION_
> Offline event buffer and batching when talking to Bomfather gRPC (defaults 10000, 100, 100ms). Must be positive if an API key is set.

# CONFIGURATION

Policy YAML has two sections. **policies** list which executables may access protected directories or IPs. **attributes** bound an executable (for example `can_only_access_ips`). Paths in the file are absolute. Official field reference: https://docs.bomfather.dev/configuration-guide.

# CAVEATS

Needs root, LSM, and kernel 5.18+. `fsverity_digest` rules need kernel 6.8+; on older kernels those rules are disabled with a warning. Without a CRI socket, container mapping is off. Source builds need Go, clang, LLVM, and protobuf. The README command name is `./agent`; package and release archives install `bomfather-agent`.

# SEE ALSO

[bpftool](/man/bpftool)(1), [strace](/man/strace)(1), [iptables](/man/iptables)(1), [apparmor](/man/apparmor)(1), [auditctl](/man/auditctl)(1)

# RESOURCES

```[Source code](https://github.com/bomfather/agent)```

```[Homepage](https://bomfather.dev)```

```[Documentation](https://docs.bomfather.dev)```

<!-- verified: 2026-10-14 -->
