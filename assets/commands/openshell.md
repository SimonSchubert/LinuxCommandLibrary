# TAGLINE

Sandbox runtime for autonomous AI agents

# TLDR

Check that the CLI can reach the **local gateway**

```openshell status```

Create a sandbox and start a **login shell** in it

```openshell sandbox create --name [demo]```

Create a sandbox from an **image** and run a command in it

```openshell sandbox create --name [worker] --from [registry.example.com/agents/python:latest] -- [python] [agent.py]```

Create a sandbox with a **policy file**

```openshell sandbox create --name [my-sandbox] --policy [policy.yaml]```

**Run one command** in a sandbox that is already up

```openshell sandbox exec -n [my-sandbox] -- ls -la /workspace```

**Attach** to the sandbox's main process

```openshell sandbox connect [my-sandbox]```

Show the **effective policy**, including rules added by providers

```openshell policy get [my-sandbox] --full```

**Allow one binary** to call one host, and wait until the sandbox loads the rule

```openshell policy update [my-sandbox] --rule-name [github_readonly] --binary [/usr/bin/curl] --add-endpoint [api.github.com:443:read-only:rest:enforce] --wait```

Read recent **sandbox logs**

```openshell logs [my-sandbox] --since [10m] --source [sandbox]```

List registered gateways and **switch** the active one

```openshell gateway list```

```openshell gateway select [production]```

# SYNOPSIS

**openshell** [**-g** _name_] [_command_] [_subcommand_] [_options_]

# DESCRIPTION

**openshell** is the command-line client for NVIDIA OpenShell, an open-source runtime that runs AI agents in isolated sandboxes. A local or remote **gateway** is the control plane: it creates sandboxes, stores provider credentials, and delivers policy. Enforcement happens in the sandbox. Filesystem access is confined with Landlock, process privileges and dangerous system calls are restricted, and outbound connections are checked against policy before they leave. Agents do not receive real credentials; OpenShell attaches them only to requests for approved endpoints.

The installer sets up the **openshell** CLI, the **openshell-gateway** service, and the **openshell-prover** policy checker, then starts a gateway. Sandboxes run through Docker, Podman, a microVM, or Kubernetes. Without **--from**, the gateway uses its configured image, which defaults to **nvcr.io/nvidia/base/ubuntu:24.04**. That image is a minimal Ubuntu userspace: it does not include an agent, and OpenShell applies a restrictive default policy when the sandbox has none of its own.

Commands use the active gateway. **-g** or **OPENSHELL_GATEWAY** selects another one for a single invocation. When a sandbox name is omitted, many commands reuse the sandbox you most recently created, connected to, or ran a command in.

# PARAMETERS

**-g** _name_, **--gateway** _name_

> Gateway to use instead of the active one. Also read from **OPENSHELL_GATEWAY**.

**--gateway-endpoint** _url_

> Connect to this gateway URL directly.

**--gateway-insecure**

> Skip TLS certificate verification. Also set by a non-empty **OPENSHELL_GATEWAY_INSECURE** other than **0** or **false**.

**--workspace** _name_

> Workspace scope. Defaults to **default**, or **OPENSHELL_WORKSPACE**.

**-v**, **--verbose**

> Increase verbosity. Repeat for more detail.

**--color** _when_

> **auto**, **always**, or **never**. **auto** colors output only on a terminal. Also **OPENSHELL_COLOR**.

**-h**, **--help**

> Show help. **openshell** _command_ **--help** lists that command's subcommands.

**-V**, **--version**

> Print the version.

**sandbox** (alias **sb**)

> Create, list, get, start, stop, and delete sandboxes. **create** accepts **--name**, **--from** (an image reference or a **.tar** / **.tar.gz** / **.tgz** rootfs), **--policy**, **--cpu**, **--memory**, **--gpu**, **--env**, **--env-from**, **--detach**, **--no-keep**, and a trailing command. **exec -n** _name_ runs one command; **connect** attaches to the main process. **upload** and **download** copy files. Disconnect from **connect** with **Ctrl-D**, or **Ctrl-P** then **Ctrl-Q**; the main process keeps running.

**policy** (alias **pol**)

> **get**, **list**, **set**, **update**, and **delete**. **set --policy** _file_ replaces the whole policy. **update** adds or removes network endpoints and allow or deny rules on a running sandbox. **--global** applies or inspects one policy for every sandbox on the gateway. **--wait** waits until the sandbox loads the revision (exit **124** on timeout).

**gateway** (alias **gw**)

> **add**, **list**, **select**, **info**, **remove**, **login**, and **logout**. **add** registers an endpoint. **remove** drops the local registration and does not stop the gateway service. **select** with no name opens a chooser on a terminal.

**service** (alias **svc**)

> **expose**, **list**, **get**, and **delete** HTTP services listening on loopback inside a sandbox. The gateway prints a URL that reaches that port.

**forward** (alias **fwd**)

> **start**, **stop**, **list**, and **service**. Forward a local TCP port into a sandbox.

**logs** (alias **lg**)

> Show sandbox or gateway logs. **-n** sets the line count (default **200**). **--tail** streams. **--since** takes a duration such as **5m** or **1h**. **--source** is **gateway**, **sandbox**, or **all**.

**provider**

> **create**, **get**, **list**, **update**, and **delete** credential providers. Example: **provider create --name openai --type openai --credential OPENAI_API_KEY**.

**profile**

> **list**, **describe**, **export**, **import**, **update**, **lint**, and **delete** provider profiles.

**settings**

> **get**, **set --key** _name_ **--value** _value_, and **delete** sandbox or **--global** settings.

**workspace** (alias **ws**)

> **create**, **get**, **list**, and **delete** workspaces.

**status**

> Report whether the gateway is reachable, whether authentication succeeded, and the gateway version. **--output json** or **--output yaml** for scripts.

**whoami**

> Show the identity the gateway validated.

**doctor check**

> Check that a Docker-compatible runtime is installed and reachable. Hidden from the default command list; the alias is **dr**.

**term**

> Open the interactive terminal UI. **--theme** is **auto**, **dark**, or **light** (**OPENSHELL_THEME**).

**completions** _shell_

> Print a shell completion script.

# CONFIGURATION

The CLI stores gateway registrations under **~/.config/openshell/**. **openshell gateway select** writes the active gateway; installer-provided entries may also appear from **/etc/openshell** and are labeled **system** in **gateway list**.

The gateway reads **~/.config/openshell/gateway.toml** when that file exists. On macOS with Homebrew it otherwise uses **$(brew --prefix)/var/openshell/gateway.toml**. Debian and RPM packages also load **~/.config/openshell/gateway.env** (for example **OPENSHELL_SANDBOX_RUNTIME_IMAGE** and **OPENSHELL_SUPERVISOR_IMAGE**). Check a file before restarting the service:

```openshell-gateway config preflight --path ~/.config/openshell/gateway.toml```

A sandbox policy is YAML. Pass it with **sandbox create --policy** or set **OPENSHELL_SANDBOX_POLICY** to a file used for every new sandbox. An image may ship **/etc/openshell/policy.yaml**; an explicit policy replaces it. **openshell-prover** checks policy files locally and does not connect to the gateway. On snap that binary is **openshell.prover**.

To turn off anonymous gateway telemetry, set **OPENSHELL_TELEMETRY_ENABLED=false** on the gateway (or **server.telemetryEnabled=false** in a Helm install).

# CAVEATS

Every sandbox command needs a gateway. A fresh install starts one and registers it; otherwise register an endpoint with **gateway add** and select it.

Filesystem, Landlock, and process settings take effect when the sandbox starts. Network rules can be changed on a running sandbox with **policy update** or **policy set**; tightening filesystem or process rules after start is rejected, so those changes need a new sandbox. **--wait** confirms that the sandbox loaded a revision. Without it, success only means the gateway accepted the change.

**--from** does not build a Dockerfile or expand a short catalog name. Pass an image reference the compute driver can see, or a rootfs tar. Rootfs tar sources work only with a local gateway using the VM driver, and the CLI and gateway must share a filesystem and user. Docker, Podman, and Kubernetes gateways reject them.

Values passed with **--env** are visible to every process in the sandbox. Names that look like credentials print a warning. Put secrets on a provider profile and attach it with **--provider** so the agent does not see the raw credential. Names beginning with **OPENSHELL_** are reserved.

The documented desktop installs are Linux (glibc 2.28 or newer) and macOS on Apple Silicon. Windows is experimental and uses WSL 2. Docker, Podman, or host virtualization must be available. Snap, Debian, RPM, and Homebrew installs do not migrate into each other; remove the old install before switching. A snap user gateway binds **127.0.0.1:17670**, so only one user on the machine should run it.

# HISTORY

NVIDIA published OpenShell in **March 2026** as an open-source runtime for running agents under a sandbox, a policy engine, and a privacy boundary. The **0.1.x** line is the stable release cadence; current documentation tracks that line (Apache License 2.0). In **October 2026** NVIDIA announced an OpenShell Reference Architecture that uses the same runtime as the software foundation for larger deployments. **0.1.0** changed **sandbox create --from**: Dockerfile paths and bare catalog names are no longer accepted.

# INSTALL

```aur: yay -S openshell```

```brew: brew install openshell```

```nix: nix profile install nixpkgs#openshell```

<!-- packages: 2026-10-22 -->

# SEE ALSO

[openshell-gateway](/man/openshell-gateway)(1), [openshell-prover](/man/openshell-prover)(1), [openshell-supervisor](/man/openshell-supervisor)(1), [docker](/man/docker)(1), [podman](/man/podman)(1), [kubectl](/man/kubectl)(1), [ssh](/man/ssh)(1)

# RESOURCES

```[Source code](https://github.com/NVIDIA/OpenShell)```

```[Homepage](https://www.nvidia.com/en-us/ai/openshell/)```

```[Documentation](https://docs.nvidia.com/openshell/latest/index.html)```

<!-- verified: 2026-10-22 -->
