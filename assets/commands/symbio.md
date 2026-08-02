# TAGLINE

Local AI agent CLI that learns from corrections via LoRA (Apple Silicon / MLX)

# TLDR

**Start** interactive chat (first run opens the setup wizard)

```symbio```

```symb```

**Show or edit** configuration

```symb config```

```symb config get agent.temperature```

```symb config set agent.temperature 0.7```

**Train** a LoRA adapter from collected data

```symb train```

**Manage skills** and idle adapters

```symb skill list```

```symb skill new [name]```

```symb archive --dry-run```

**Telegram** gateway

```symb gateway status```

```symb gateway start```

# SYNOPSIS

**symbio** [_subcommand_] [_options_]

**symb** [_subcommand_] [_options_]

# DESCRIPTION

**symbio** (short alias **symb**) is a local AI assistant that chats in the terminal (or via Telegram), keeps markdown notes, runs sandboxed tools, and turns your corrections into **LoRA** fine-tuning data so the model improves on-device.

It uses Apple's **MLX** / Metal stack: current releases target **Apple Silicon** (recommended ~16 GB unified memory). There is no cloud API requirement for the core loop. On first launch an interactive wizard sets names, model preset, and optional features (browser, web search, mixture-of-agents dispatch, Telegram).

Corrections are detected automatically (phrases like "No, …" / "Actually …") and stored as mistake notes; when **learn.mistake_threshold** (default 5) is reached, a batch LoRA update runs and is checked against a **golden set** with automatic rollback on regression. Optional **MOA** mode delegates bounded tasks to smaller worker models. Skills start as markdown procedures and can grow dedicated adapters.

Install from a clone with **pip install -e .** or **pipx install .** so **symbio** / **symb** land on **$PATH**.

# PARAMETERS

**(no subcommand)** / **chat**
> Start the interactive chat session.

**config** [**show** | **get** _key_ | **set** _key_ _value_]
> View or change **config.json** (bot tokens redacted in show output).

**train**
> Run LoRA fine-tuning (**lora.iters**) and reload the adapter.

**skill list** | **skill new** _name_ | **skill rm** _role_
> List, create, or remove skill notes/adapters.

**archive** [**--dry-run**] [**--restore** **note**|**adapter** _name_]
> Archive idle notes/adapters or restore one.

**gateway status** | **gateway start** | **gateway stop**
> Check or control the Telegram bot gateway.

**setup**
> Re-run the interactive setup wizard.

# CONFIGURATION

**config.json** (project / install directory)
> Model name, agent limits, LoRA hyperparameters, learn thresholds, Telegram settings, dispatch (MOA), and tool groups. Prefer **symb config set** over hand-editing secrets.

**SYMBIO_TELEGRAM_TOKEN**
> Telegram bot token; overrides the value stored in config when set.

**notes/**, **training_data/**, **adapters/**
> Markdown memory, JSONL training corpora, and LoRA adapter weights (workers live under **workers/**_role_/).

# CAVEATS

Inference and training currently require **Apple Silicon + MLX**; CUDA/llama.cpp backends are roadmap items, not production defaults. Sandbox for shell/Python is best-effort under your user privileges. Telegram and browser features need extra config and explicit approval for dangerous actions. Model downloads and LoRA training are resource-heavy.

# HISTORY

**Symbio** is an open-source local agent (Apache-2.0) focused on correction-driven LoRA personalization without a cloud subscription. Upstream: **github.com/huyedits/Symbio**.

# SEE ALSO

[ollama](/man/ollama)(1), [pipx](/man/pipx)(1), [python](/man/python)(1), [claude](/man/claude)(1)

# RESOURCES

```[Source code](https://github.com/huyedits/Symbio)```

```[Homepage](https://huggingface.co/spaces/HuyEdits/symbio-demo)```

<!-- verified: 2026-08-02 -->
