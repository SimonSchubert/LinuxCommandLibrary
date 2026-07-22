# TAGLINE

Run local code in the context of a Kubernetes cluster

# TLDR

**Run a local binary** as if it were a specific pod

```mirrord exec --target pod/[pod_name] -- [command] [arguments]```

**Target a deployment** in a specific namespace

```mirrord exec --target deployment/[deployment_name] --target-namespace [namespace] -- [command]```

**Run with a configuration file**

```mirrord exec --config-file [path/to/mirrord.json] -- [command]```

**Forward a remote port** to a locally reachable host

```mirrord port-forward --target pod/[pod_name] --port-mapping [local_port]:[remote_port]```

**Dump incoming traffic** of a target's port

```mirrord dump --target pod/[pod_name] --ports [8080]```

**Generate a configuration** interactively

```mirrord wizard```

**Check setup and connectivity**

```mirrord diagnose```

# SYNOPSIS

**mirrord** _command_ [_options_] [**--** _binary_ [_args_]]

# DESCRIPTION

**mirrord** lets a process running on your own machine behave as if it were running inside a remote Kubernetes cluster. It connects the local process to a chosen target (a pod or a deployment) and transparently relays that target's network traffic, environment variables, DNS resolution, and file system, so the local code observes the same context as the real workload without being built into an image, pushed, and deployed.

It works by spawning a temporary agent pod on the same node as the target. Incoming traffic for the target can be **mirrored** (a copy is sent to the local process while the cluster keeps serving) or **stolen** (traffic is redirected to the local process instead). Outgoing traffic, DNS, and file reads are tunnelled through the agent so they resolve against the cluster. When the local process exits, the agent is cleaned up and the cluster returns to its previous state.

mirrord is most often used through its **exec** subcommand, which wraps an arbitrary command, but it also ships editor integrations for VS Code and IntelliJ that drive the same engine. It is typically installed from a shell with the upstream install script (`curl -fsSL https://raw.githubusercontent.com/metalbear-co/mirrord/main/scripts/install.sh | bash`) or via Homebrew.

# COMMANDS

**exec**

> Run a local binary in the context of a target. Everything after **--** is the command and its arguments.

**port-forward**

> Forward one or more cluster ports to a host reachable from the local machine.

**dump**

> Capture and print incoming traffic seen by a target's port, without running a local binary.

**container**

> Run a container locally in the cluster's context, mirroring what **exec** does for a plain binary.

**operator**

> Manage the optional mirrord Operator, which enables team features such as queue splitting and shared targets.

**wizard**

> Interactively build a mirrord configuration file.

**diagnose**

> Run connectivity and latency checks against the cluster to verify the setup.

# PARAMETERS

These apply to **exec** (and most other subcommands that take a target).

**-t**, **--target** _path_

> Target to impersonate, for example `pod/my-pod`, `deployment/my-deploy`, or `pod/my-pod/container/sidecar`.

**-n**, **--target-namespace** _namespace_

> Namespace of the target. Defaults to the current kubectl context namespace.

**-f**, **--config-file** _file_

> Load options from a JSON, TOML, or YAML configuration file instead of flags.

**-a**, **--agent-namespace** _namespace_

> Namespace in which the temporary mirrord agent pod is created.

**--steal**

> Redirect (steal) the target's incoming traffic to the local process instead of mirroring a copy of it.

**--fs-mode** _mode_

> Control how file system access is handled (for example read from the remote, the local machine, or both).

**-h**, **--help**

> Show help for mirrord or for a specific subcommand.

# CAVEATS

mirrord needs access to a Kubernetes cluster and permission to create the temporary agent pod, so the same care that applies to `kubectl exec` applies here. Stealing traffic with **--steal** diverts real requests away from the cluster workload, which can disrupt a shared environment; mirroring is safer for that reason. File and network behaviour can differ subtly from a true in-cluster deployment, so it complements rather than replaces staging tests.

# HISTORY

mirrord is developed by **MetalBear** and released under the **MIT** license. It is written largely in **Rust** and grew from the idea of removing the slow build-push-deploy loop from cloud-native development, letting developers debug against a live cluster from their local machine. Adopters cited by the project include monday.com, SurveyMonkey, and Cadence.

# INSTALL

```nix: nix profile install nixpkgs#mirrord```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[kubectl](/man/kubectl)(1), [docker](/man/docker)(1), [skaffold](/man/skaffold)(1), [helm](/man/helm)(1)

# RESOURCES

```[Source code](https://github.com/metalbear-co/mirrord)```

```[Homepage](https://metalbear.com/mirrord)```

```[Documentation](https://metalbear.com/mirrord/docs)```

<!-- verified: 2026-06-27 -->
