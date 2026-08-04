# TAGLINE

Fine-tune and post-train large language models from one YAML config

# TLDR

**Install** the light CLI (no PyTorch) or the training stack

```pip install soup-cli```

```pip install "soup-cli[train]"```

Create a config from a **template**

```soup init --template chat```

**Train** from a YAML config

```soup train --config soup.yaml```

**Chat** with a fine-tuned model or adapter

```soup chat --model ./output```

Run **batch inference**

```soup infer --model ./output --input prompts.jsonl```

**Export** to GGUF for Ollama / llama.cpp

```soup export --model ./output --format gguf --quant q4_k_m```

Start an **OpenAI-compatible** server

```soup serve --model ./output --port 8000```

Check GPU, deps, and environment

```soup doctor```

# SYNOPSIS

**soup** [_global-options_] _command_ [_args_]

# PARAMETERS

**init** [**--template** _name_]
> Create a **soup.yaml** config interactively or from a template (**chat**, **code**, **tool-calling**, **medical**, **reasoning**, **vision**, compliance templates such as **hipaa** / **soc2**, and others).

**train** **--config** _file_
> Run supervised or preference fine-tuning (SFT, DPO, KTO, ORPO, SimPO, GRPO, PPO, and more) from YAML. Handles LoRA/QLoRA, batch size, quantization, and multi-GPU when the **[train]** extra is installed. Optional layer streaming (**stream_layers: true**) keeps the frozen base out of VRAM for small GPUs.

**chat** **--model** _path_
> Interactive chat against a local model or adapter directory.

**infer** **--model** _path_ **--input** _file_
> Batch inference over prompts (JSONL and related formats).

**serve** **--model** _path_ [**--port** _n_] [**--backend** _name_]
> Serve an OpenAI-compatible HTTP API (optional backends include **vllm**, **sglang**).

**merge** **--adapter** _path_
> Merge a LoRA adapter into the base model weights.

**export** **--model** _path_ **--format** _fmt_
> Export for deployment (**gguf**, **onnx**, **tensorrt**, **awq**, **gptq**, and others).

**push** **--model** _path_ **--repo** _user/name_
> Upload a model or adapter to the Hugging Face Hub.

**data** _subcommand_ ...
> Dataset tools: **inspect**, **validate**, **convert**, **dedup**, **split**, **generate**, **forge**, and many quality / PII / contamination helpers.

**eval** _subcommand_ ...
> Evaluation: benchmarks, custom JSONL tasks, LLM-as-judge, gates, and comparison.

**ship** **--base** _model_ **--adapter** _path_ **--task-eval** _file_
> Emit a SHIP / DON'T-SHIP gate (task win plus regression suite). Exit codes: **0** ship, **2** don't ship, **3** bad flags, **1** runtime error.

**doctor**
> Diagnose GPU, drivers, Python packages, and environment.

**recipes** **list**|**show**|**use**|**search**
> Browse and materialize ready-made training recipes.

**version** [**--full**] [**--json**]
> Print the installed Soup version.

**--log-level** **quiet**|**normal**|**verbose**|**debug**
> Global logging verbosity (Rich-formatted output).

# DESCRIPTION

**soup** is the command-line interface for **Soup** (PyPI package **soup-cli**): a Python toolkit that turns LLM fine-tuning into a single config file and a few subcommands. You describe base model, data, task type, and training knobs in **soup.yaml**, then run **soup train**. The same binary covers data prep, evaluation, export, local serving, adapter management, and shipping gates.

The default **pip install soup-cli** is intentionally light (CLI, config, and data tools without PyTorch). Fine-tuning needs **pip install "soup-cli[train]"** (or **[all]** for the full optional stack). Training can run on CUDA GPUs, Apple Silicon (MPS), or CPU for smoke tests; optional extras enable Unsloth, MLX, serving backends, UI, and more.

Supported data formats include Alpaca, ShareGPT, ChatML, preference pairs (DPO-style), KTO, vision, audio, and pretraining text. Models load through Hugging Face **AutoModelForCausalLM**, so most Hub text-generation checkpoints work without custom glue code.

# CONFIGURATION

Primary file: **soup.yaml** (path passed to **--config**). Core fields include **base** (model id or path), **task** (for example **sft**), **data.train** / format / split, **training** (epochs, learning rate, LoRA, quantization, optional **stream_layers**), and **output**. Schema details live in the project docs under **docs/** and **config/schema.py**.

# CAVEATS

Fine-tuning requires substantial disk, RAM, and preferably a GPU; an 8B QLoRA run typically wants on the order of 8 GB+ VRAM without layer streaming. The bare **soup-cli** install cannot train until the **[train]** extra is installed. Layer streaming is still marked BETA. Prefer double quotes around extras in shells that treat **[train]** as a glob (**pip install "soup-cli[train]"**). Some advanced commands need optional extras (**[serve]**, **[ui]**, **[mcp]**, and others).

# HISTORY

**Soup** is an Apache-2.0 open-source project maintained as **soup-cli** on PyPI. Recent releases focus on low-VRAM training (layer streaming for 8B models on ~4 GB laptop GPUs), preference-training losses over that path, and shipping / eval gates for CI.

# SEE ALSO

[ollama](/man/ollama)(1), [llama](/man/llama)(1), [huggingface-cli](/man/huggingface-cli)(1), [pip](/man/pip)(1)

# RESOURCES

```[Source code](https://github.com/MakazhanAlpamys/Soup)```

```[Homepage](https://trysoup.dev)```

```[Documentation](https://github.com/MakazhanAlpamys/Soup/tree/main/docs)```

<!-- verified: 2026-08-04 -->
