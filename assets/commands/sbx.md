# TAGLINE

Run AI coding agents in isolated sandboxes

# TLDR

Open the **interactive** dashboard

```sbx```

**Sign in** to Docker

```sbx login```

**Run** an agent in the current directory

```sbx run [claude]```

Run an agent on a **named** sandbox

```sbx run --name [my-project] [claude] [path/to/project]```

**List** sandboxes

```sbx ls```

Open a **shell** in a running sandbox

```sbx exec [-it|--interactive --tty] [sandbox_name] [bash]```

**Stop** a sandbox without deleting it

```sbx stop [sandbox_name]```

**Remove** a sandbox

```sbx rm [sandbox_name]```

**Allow** a host through the network policy

```sbx policy allow network [hostname]```

Store a **service secret** (prompted when the name is omitted)

```sbx secret set [github]```

# SYNOPSIS

**sbx** [**--cloud**] [**-D**] [_command_] [_args_...]

# DESCRIPTION

**sbx** is the command-line interface for Docker Sandboxes. It creates isolated environments for AI coding agents such as Claude Code, Codex, and Gemini CLI. Each local sandbox is a microVM with its own kernel, filesystem, and private Docker daemon, so the agent can install packages and build containers without using the host Docker engine.

With no command, **sbx** opens a terminal dashboard of sandbox cards (status, CPU, and memory). The same screen is **sbx tui**. From it you can create, start, stop, attach, shell into, and remove sandboxes, and edit network rules.

**sbx run** creates a sandbox if needed and attaches to the agent. The first argument is a built-in agent name or a sandbox kit (a local directory, a zip, a git repository, or an OCI reference). Extra arguments after `--` are passed to the agent. Repeating **sbx run** on the same workspace reconnects to the existing sandbox. **--name** gives the sandbox a stable identity so you can reattach from another directory, or run several sandboxes against one tree.

The host directory is mounted at the same absolute path inside the sandbox. That direct mode is the default: the agent can read and write the working tree, and edits show up on the host immediately. **--clone** instead checks out a private copy inside the sandbox. The host repository is then available read-only at `/run/sandbox/source`. Clone mode is fixed at creation time.

**--cloud** sends supported commands to Docker Cloud Sandboxes instead of the local `sandboxd` daemon. Local and cloud sandboxes have separate credentials, network policy, and lifecycle. The CLI and local compute are free to use. Cloud compute is billed separately, and model-provider charges are separate from Docker.

**sbx** does not require Docker Desktop or Docker Engine on the host.

# PARAMETERS

**--cloud**
> Dispatch to the Docker Cloud Sandboxes API instead of local `sandboxd`. Not every subcommand supports it. `sbx --cloud --help` lists the ones that do.

**-D**, **--debug**
> Enable debug logging.

**login**
> Sign in to Docker in a browser. Required before creating sandboxes.

**logout**
> Stop running local sandboxes and sign out.

**run** [_flags_] [_agent_|_kit_] [_path_...]
> Create a sandbox if it does not exist and attach to the agent. See **RUN OPTIONS**.

**create** [_flags_] _agent_|_kit_ [_path_...]
> Create a sandbox without attaching. A local sandbox stops when nothing is using it. Files and configuration remain until **rm**.

**ls**
> List sandboxes, including status, agent, published ports, workspace, and age.

**exec** [**-it**] [_flags_] _sandbox_ _command_
> Run a command in a sandbox. The default working directory is the primary workspace. Detached exec is not supported.

**stop** _sandbox_...
> Stop one or more sandboxes without deleting them.

**rm** [**-f**] _sandbox_...
> Remove one or more sandboxes. Prompts for confirmation. **--force** skips the prompt and allows removal while a session, SSH connection, or SFTP transfer is active.

**prune** [**--dry-run**] [**--filter** _until=DURATION_]
> Remove stopped local sandboxes. Running sandboxes are kept. **--dry-run** only prints the list.

**attach** _sandbox_
> Attach to a cloud sandbox, starting it first if it is stopped.

**cp** _src_ _dest_
> Copy files between the host and one sandbox. One side must be `sandbox:absolute-path`. Copying between two sandboxes is not supported.

**ports** _sandbox_ [**--publish** _host:sandbox_] [**--unpublish** _spec_]
> Publish or remove a port forward. Publishing a port on a stopped local sandbox starts it. Give only the sandbox port to let the OS pick the host port.

**policy** _command_
> Manage network and filesystem access rules: **allow**, **deny**, **ls**, **rm**, **inspect**, **check**, **log**, **init**, and **reset**.

**secret** _command_
> Store, list, and import credentials. The host proxy injects them so they are not written into the sandbox filesystem.

**template** _command_
> Save a sandbox filesystem as an image, list images, load a tar, or remove one. Mounted workspaces are not part of the saved image.

**daemon** _command_
> Manage the local `sandboxd` daemon.

**move**
> Move a sandbox between the local machine and Docker's cloud.

**ttl**
> Show or extend a cloud sandbox's time to live.

**mcp**
> Register MCP servers for sandboxed agents.

**volume**
> Manage persistent volumes. Cloud only.

**settings**
> Manage Docker Sandboxes settings.

**diagnose**
> Check the local installation.

**version**
> Print the version.

**completion** _shell_
> Print a shell completion script.

**tui**
> Open the interactive dashboard. This is also the default when no command is given.

**reset**
> Remove sandboxes and local state. Prompts unless forced. Can keep stored secrets.

**env**
> Experimental. Manage sandboxes from an `sbxenv.yaml` file.

**kit**
> Experimental. Manage sandbox kit artifacts.

**setup**
> Experimental. Detect host configuration and prepare Docker Sandboxes.

**skills**
> Experimental. Manage skills available inside sandboxes.

# RUN OPTIONS

**--name** _name_
> Assign or reattach to a sandbox by name. The agent argument can be omitted when reattaching.

**--rm**
> Delete the sandbox when the agent exits, without a prompt. The **sbx run** exit status is the agent's. Cannot be combined with **--detach** or **--detach-keys**.

**-d**, **--detach**
> Start the sandbox and return without an agent session. The sandbox keeps running until **stop** or **rm**. Using this on an existing sandbox switches it to detached mode permanently.

**--clone**
> Give the agent a private in-sandbox Git clone. Must be set when the sandbox is created. The primary workspace has to be the main checkout of a Git repository, not a linked worktree.

**-t**, **--template** _image_
> Create the sandbox from a template image. Pass the full reference. **sbx** does not assume `docker.io`.

**--publish** _host:sandbox_
> Publish a port at creation time. Ignored when **run** reattaches to an existing sandbox. Use **sbx ports** for that case.

**-e**, **--env** _var_[=_value_]
> Set an environment variable in the sandbox. A bare name copies the value from the host. On create, the variable is stored with the sandbox. On reattach, it applies to that session only. Requires **sbx** 0.39.0 or later.

**--env-file** _path_
> Load variables from a file. Later files override earlier ones. **-e** overrides both.

**--cpus** _n_
> CPUs to assign. `0` means all host CPUs, at most 16 on Linux arm64.

**--deny-network** _host_
> Add a per-sandbox network deny rule at creation. Repeat for more hosts. A local deny can only narrow access.

**--allow-network** _pattern_
> Network pattern to allow for cloud sandbox egress. Cloud only. Repeatable.

# CONFIGURATION

**sbx policy init** _allow-all_|_balanced_|_deny-all_
> Choose the global network preset. `balanced` is the recommended starting point. Later changes use `sbx policy allow`, `sbx policy deny`, and `sbx policy rm`. Rules apply to every sandbox unless **--sandbox** _name_ is set. `sbx policy reset` clears custom policy and asks for a preset again. Running sandboxes are stopped when the local daemon restarts.

**sbx secret set**
> Store a credential for a supported service, a custom host, or a registry (`sbx secret set --registry`). Prefer this to writing tokens into the sandbox or into a saved template.

**/etc/sandbox-persistent.sh**
> Inside a sandbox, Bash sources this file for later interactive sessions and for agents started with **sbx run**. Append `export` lines via `sbx exec` when a variable must outlive a single **-e** flag. A command passed straight to **sbx exec** does not start a shell.

# CAVEATS

This page is Docker's **sbx** command. It is unrelated to the Python package `sbx-rl` (Stable Baselines Jax), which is imported as a library and is not this binary.

Local sandboxes need a hypervisor. On Linux that is KVM, and the user must be in the `kvm` group. Docker supports local sandboxes on Ubuntu 24.04 or later (x86_64 or arm64). Nested virtualization is required when the host itself is a VM. macOS needs Apple silicon and macOS Sonoma or later. Windows needs Windows 11 and Windows Hypervisor Platform. **--cloud** does not need KVM.

`sbx rm` deletes the sandbox filesystem, including packages installed inside it and a clone-mode worktree. Host workspace files and the shared skills store on the host stay. A saved template includes files from the container filesystem, so credentials written into the sandbox are baked into the image.

Network access is denied or limited by policy. A process inside the sandbox is not reachable from the host until a port is published.

Sign-in is required. `sbx login` uses a browser OAuth flow.

nixpkgs ships this command as `docker-sbx` and marks the package unfree.

# INSTALL

```nix: nix profile install nixpkgs#docker-sbx```

<!-- packages: 2026-10-18 -->

# SEE ALSO

[docker](/man/docker)(1)

# RESOURCES

```[Homepage](https://docs.docker.com/ai/sandboxes/)```

```[Documentation](https://docs.docker.com/reference/cli/sbx/)```

```[Source code](https://github.com/docker/sbx-releases)```

<!-- verified: 2026-10-18 -->
