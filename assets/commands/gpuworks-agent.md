# TAGLINE

Connect a GPU node to a GPUWorks control plane

# TLDR

Write the node config (the token is read from stdin, not from a flag)

```gpuworks-agent configure --state [/opt/gpuworks] --server [http://server:8800]```

Connect and serve workloads

```gpuworks-agent run --state [/opt/gpuworks]```

Check the node environment

```gpuworks-agent doctor --state [/opt/gpuworks]```

Check only the **connection**

```gpuworks-agent doctor --connectivity --state [/opt/gpuworks] --json```

Handshake once, then exit

```gpuworks-agent smoke --state [/opt/gpuworks]```

Load-test an OpenAI-compatible URL

```gpuworks-agent bench --url [http://server:8800/v1] --model [model-id]```

List runveil containers on this node

```gpuworks-agent runveil --state [/opt/gpuworks] ps```

# SYNOPSIS

**gpuworks-agent** _command_ [_options_]

# PARAMETERS

**configure** **--state** _dir_ [**--server** _url_] [**--connect-mode** _mode_]

> Write `gpuworks-agent.conf` in _dir_ (mode 0600). The node token is the first line of stdin. **--driver** forces `docker`, `udocker`, `nerdctl`, `host`, or `none`

> **--connect-mode** `agent_dial` makes the agent connect out. **--server** is required in that mode

> **--connect-mode** `server_dial` makes the server connect in. **--listen** then defaults to `0.0.0.0:18800`

**run** **--state** _dir_

> Connect and provide node capabilities. This is the only normal way to start the agent. Flag, then environment, then the config file, then the default. **--token** and **--server** override the file. **--data-lane** defaults to true. **--dcgm** is `off`, or `auto` when `dcgmi` is on `PATH`

**smoke**

> One handshake, then exit. Used before an agent binary is replaced. Exit 0 on success, 3 on a 10-second timeout, 4 if the server rejects the token, 1 on other errors

**upgrade**

> Linux only. Download a new agent from the server, **smoke** it, and replace this binary. A `server_dial` agent cannot download and refuses the command. The budget is 10 minutes

**doctor** [**--state** _dir_] [**--connectivity**] [**--json**]

> Host, runtime, and GPU report. **--connectivity** skips GPU, CUDA, and NCCL checks and uses a 10-second handshake budget. Exit codes match **smoke** for that mode. The full environment report is text you read. Its exit code is not a hardware health bit

**grant-device-access** **--user** _user_ [**--state** _dir_] [**--create-user**]

> Add a non-root user to the groups that own accelerator devices, for the runveil driver. Needs root when groups must change

**bench** **--url** _url_ **--model** _id_

> Closed-loop or open-loop load against an OpenAI-compatible endpoint. **--concurrency** defaults to 1, **--isl** to 128, **--osl** to 32, **--dataset** to `random`. **--api-key** falls back to the OpenAI API key environment variable

**runveil** [**--state** _dir_] **ps** | **images** | **load** | **exec** | **logs**

> Inspect the runveil state directory without the agent process. **--state** must come before the subcommand. **ps -a** lists stopped containers. **load -i** _file_ _ref_ registers an archive under the reference the UI expects. **exec** must run as root or as the runtime user

**install-service**

> Register this binary as a macOS launchd job. The installer calls this

**uninstall**

> Stop and remove the agent service

**version**

> Print the version

# DESCRIPTION

**gpuworks-agent** runs on each GPU node. It probes accelerators, starts inference engines through Docker, nerdctl, runveil (the driver name `udocker`), or a host process on macOS, and reports metrics and logs to a **gpuworks** server. The agent dials out. The node does not publish an inference port. Inference traffic uses the tunnel.

You must pass a subcommand. **run** is not implied by environment variables alone. Unknown commands exit 2. **--help** exits 0.

**configure** is what the node install script runs. Later starts are `gpuworks-agent run --state DIR` and read the rest from `gpuworks-agent.conf` in that directory. The token is not stored on the **run** command line when the file is present.

If **--driver** is omitted, macOS uses `host` so Metal is reachable. Other systems try docker, then nerdctl, then runveil. An unknown driver disables deployments rather than guessing.

**bench** is the same load generator as the Benchmarks page in the UI. **runveil** reads the state directory directly, so it works when you are debugging a node without going through the server.

# CONFIGURATION

**gpuworks-agent.conf**

> In the state directory, written by **configure**. Mode 0600. Holds the server URL, token, connect mode, listen address, and driver

**State directory**

> Logs, models, and runtime state. **--state** defaults to the GPUWORKS STATE DIR environment variable, then `/opt/gpuworks` if that directory exists, then platform-specific paths, and finally `./gpuworks-state`

# CAVEATS

Do not pass the node token as a process argument if you can avoid it. **configure** reads it on stdin for that reason. **run --token** puts it on the command line.

**upgrade** on a server-dial node is rejected. Those nodes receive upgrades from the server UI. **smoke** does not start workloads.

**runveil exec** is a shell inside a workload container, with that workload's mounts and GPUs. **runveil load** must use the image reference the control plane expects, not whatever tag is inside the archive.

**doctor** without **--connectivity** can spend time on CUDA and NCCL. It is a report, not a pass/fail exit code.

# HISTORY

**gpuworks-agent** ships in the same flitai-io/gpuworks repository as the **gpuworks** server. The node install script served by the control plane calls **configure**, **grant-device-access**, and **install-service**. The flags on this page are taken from that repository's CLI reference.

# SEE ALSO

[docker](/man/docker)(1), [curl](/man/curl)(1)

# RESOURCES

```[Source code](https://github.com/flitai-io/gpuworks)```

```[Documentation](https://gpuworks.readthedocs.io/)```

<!-- verified: 2026-11-07 -->
