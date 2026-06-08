# TAGLINE

Local generative AI chat via Ubuntu inference snaps

# TLDR

**Start** an interactive terminal chat session

```inference-snap chat```

**Show** the active engine and chat server status

```inference-snap status```

**Select** a hardware engine and matching model

```sudo inference-snap use-engine [cuda|cpu|...]```

**Print** host hardware details for model selection

```sudo inference-snap show-machine```

**Read** the running chat server configuration

```inference-snap get```

# SYNOPSIS

**inference-snap** **chat**

**inference-snap** **status**

**inference-snap** **get**

**sudo inference-snap** **use-engine** _engine_

**sudo inference-snap** **show-machine**

# DESCRIPTION

**inference-snap** is the command-line interface for Ubuntu **Inference Snaps**: packaged generative AI models tuned for local CPU, GPU, or NPU hardware. Each snap ships model weights and a runtime that auto-detects the host and exposes a local chat API.

The **chat** subcommand starts a terminal conversation and, on first use, brings up the background chat server. Supported model families include **deepseek-r1**, **gemma3**, **gemma4**, **nemotron3-nano**, and **qwen-vl**, depending on which inference snap is installed.

**use-engine** switches the execution backend (for example **cuda** on NVIDIA GPUs) and downloads the model variant appropriate for that engine. **show-machine** reports RAM, architecture, and device details to help pick an engine. **get** prints server settings such as **http.host** and **http.port**; **status** summarizes engine choice and service health.

Inference snaps also expose an OpenAI-compatible HTTP API for IDEs and other tools, but **inference-snap** itself is the snap-managed CLI for chat and administration.

# CAVEATS

Requires a supported Ubuntu inference snap installed via **snap**. Engine changes and hardware inspection need **sudo**. First **chat** start may download model weights and take noticeable time.

# SEE ALSO

[snap](/man/snap)(8), [curl](/man/curl)(1)