# TAGLINE

Run hardware-optimized local AI models from Ubuntu inference snaps

# TLDR

**Install** an inference snap (here Gemma 4)

```sudo snap install [gemma4]```

**Start** an interactive terminal chat session

```[gemma4] chat```

**Show** the service status, endpoints and active engine

```[gemma4] status```

**List** available engines (the active one is marked with *)

```[gemma4] list-engines```

**Select** the best engine for this machine automatically

```sudo [gemma4] use-engine --auto```

**Switch** to a specific engine

```sudo [gemma4] use-engine [engine]```

**Print** host hardware details as JSON

```[gemma4] show-machine --format=json```

**Read** or change configuration values

```[gemma4] get [http.port]```

```sudo [gemma4] set [http.port]=[8080]```

**Remove** cached data of inactive engines

```sudo [gemma4] prune-cache```

# SYNOPSIS

_inference-snap_ [_command_] [_options_] [_args_]

# DESCRIPTION

Ubuntu **Inference Snaps** package generative AI models together with runtimes tuned for the local CPU, GPU or NPU. There is no binary literally called **inference-snap**: each model snap (for example **gemma4**, **gemma3**, **deepseek-r1**, **qwen3**, **qwen-vl**, **nemotron-3-nano** or **phi4**) installs a command named after itself, and all of them share the same CLI described here.

On installation the snap inspects the host and picks a matching **engine**, a combination of runtime and model weights for the available hardware. It then runs a background service that exposes a local OpenAI-compatible HTTP API for IDEs and other tools. The CLI is used to chat with the model, inspect status, and switch or prune engines.

# PARAMETERS

**status**
> Show service status, active endpoints and the selected engine.

**chat**
> Start the command-line chat client.

**get** [_key_]
> Print configuration values; without a key, list all of them as a table.

**set** _key_=_value_
> Override a configuration value. Unknown keys are rejected.

**list-engines** [**--format**=**json**]
> List engines with name, vendor and compatibility.

**show-engine** _engine_ [**--format**=**json**]
> Show engine details such as supported devices and default configuration (YAML by default).

**use-engine** _engine_ | **--auto**
> Switch engine, downloading its resources as snap components after a confirmation prompt. **--auto** picks the best match for the host.

**show-machine** [**--format**=**json**]
> Print information about the host machine (YAML by default).

**prune-cache** [**--engine**=_engine_]
> Remove cached resources of the snap or of one engine.

**-v**, **--verbose**
> Enable verbose logging.

**-h**, **--help**
> Show help for the CLI or a subcommand.

# CAVEATS

Accelerated engines need the matching hardware driver installed first. Switching engines downloads model weights, which can be several gigabytes. Pruned components are only marked for deletion; **snapd** frees the disk space later. Service management (start, stop, restart, logs) is done with **snap** itself, e.g. **snap logs gemma4**.

# SEE ALSO

[snap](/man/snap)(8), [ollama](/man/ollama)(1), [curl](/man/curl)(1)

# RESOURCES

```[Source code](https://github.com/canonical/inference-snaps)```

```[Documentation](https://documentation.ubuntu.com/inference-snaps)```

<!-- verified: 2026-11-23 -->
