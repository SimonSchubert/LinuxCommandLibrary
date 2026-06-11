# TAGLINE

Rank local LLMs that actually run well on your hardware

# TLDR

**Detect hardware and list** the best-fit local models

```whichllm```

**Show only your detected hardware**

```whichllm hardware```

**Restrict ranking to CPU-only** machines

```whichllm --cpu-only```

**Simulate a specific GPU** for purchase planning

```whichllm --gpu "[RTX 4090]"```

**Plan in reverse**: what GPU runs a given model

```whichllm plan [model_name]```

**Download a model and chat** with it interactively

```whichllm run [model_name]```

**Print a Python snippet** for using a model

```whichllm snippet [model_name]```

**Emit JSON** for scripting

```whichllm --json```

# SYNOPSIS

**whichllm** [_command_] [_options_]

# PARAMETERS

**hardware**
> Print detected GPU, CPU, RAM, and OS information without ranking models.

**run** _model_
> Download _model_ via Ollama and start an interactive chat session.

**plan** _model_
> Reverse lookup: estimate which GPU or RAM tier is needed to run _model_ at usable speed.

**snippet** _model_
> Print a ready-to-paste Python snippet that loads _model_ from HuggingFace or Ollama.

**--gpu** _name_
> Override hardware detection and rank as if running on the named GPU (e.g. "RTX 4090").

**--cpu-only**
> Restrict ranking to models that run acceptably without a GPU.

**--top** _N_
> Show the top _N_ ranked models instead of the default short list.

**--quant** _type_
> Filter results by quantization (e.g. _Q4_K_M_, _Q5_K_M_, _Q8_0_, _fp16_).

**--profile** _use_case_
> Bias ranking towards a specific profile (_coding_, _vision_, _math_, _general_).

**--json**
> Emit machine-readable JSON instead of the formatted table.

**--refresh**
> Bypass the local cache and refetch benchmark data.

**--version**
> Print version and exit.

**--help**
> Print help and exit.

# DESCRIPTION

**whichllm** detects local hardware (GPU model and VRAM, CPU, RAM, OS) and ranks open-weight large language models from **HuggingFace** and **Ollama** by how well they will actually run on that machine. Instead of treating "fits in VRAM" as the only criterion, it combines a fit check with **recency-aware benchmark** scores from sources such as **LiveBench**, **Artificial Analysis**, **Aider**, and the **Chatbot Arena** ELO leaderboard, and applies penalties for quantization, partial offload, and MoE architectures.

The tool is designed for the common practical question "which model should I download tonight" rather than for marketing claims. The default invocation prints a short ranked table; subcommands extend the same engine to launch interactive sessions, plan hardware upgrades, or emit code snippets for direct integration.

# CONFIGURATION

**~/.cache/whichllm/**
> Cached benchmark snapshots; cleared by **--refresh**.

**Ollama**
> When present, **whichllm run** delegates model download and serving to a local Ollama daemon.

# CAVEATS

Rankings depend on third-party benchmarks; new models appear before their scores stabilise, so use **--refresh** if a recent release is missing. Hardware detection works best on NVIDIA, AMD, and Apple Silicon; exotic accelerators may fall back to CPU-only estimates. The tool only recommends models — it does not enforce licensing constraints on the suggested weights.

# HISTORY

**whichllm** was published in **2025** by **Andyyyy64** as a Python utility distributed via **uv**, **pip**, and **Homebrew**. It emerged as the local-LLM ecosystem fragmented across HuggingFace, Ollama, and dozens of quantization formats, where simply checking VRAM size was no longer enough to pick a usable model. The project has continued to track new releases and benchmark updates through **v0.5.x** (2026).

# SEE ALSO

[ollama](/man/ollama)(1), [llm](/man/llm)(1), [huggingface-cli](/man/huggingface-cli)(1)
