# TAGLINE

local LLM inference that streams model experts from disk

# TLDR

**Build** the engine and CLI

```make```

**Run** a one-shot prompt against a converted container

```waste run [~/models/k3.waste] "[What is the capital of France?]" -n [32]```

**Interactive multi-turn chat**

```waste chat [~/models/k3.waste]```

**Show next-token distribution**

```waste eval [~/models/k3.waste] "[2 + 2 =]" --top-k [5]```

**Plan RAM budget** for a container

```waste plan [~/models/k3.waste] --budget [46G]```

**Run with image input** (multimodal models)

```waste run [~/models/k3.waste] "[What is in this picture?]" --image [photo.png]```

**Verify expert CRC** on load

```waste run [~/models/k3.waste] "[prompt]" --verify```

# SYNOPSIS

**waste** _command_ [_options_] [_args_...]

# PARAMETERS

**run** _CONTAINER_ [_PROMPT_]
> Generate a completion from a prompt (or stdin). Common flags: **-n** _count_ (token cap), **--budget** _SIZE_, **--image** _FILE_, **--verify**.

**chat** _CONTAINER_
> Multi-turn interactive session; conversation state is kept in the process.

**eval** _CONTAINER_ _PROMPT_
> Show next-token scores/distribution. Supports **--top-k**, **--json**, **--image**.

**plan** _CONTAINER_
> Report what RAM budget fits on this machine and what the engine would pick.

**info** _CONTAINER_
> Print container/model metadata.

**bench** _CONTAINER_
> Run a built-in performance check.

**tokenize** _CONTAINER_
> Tokenize or inspect prompt layout (see **--help** for current subflags).

**--budget** _SIZE_
> Hard RAM ceiling (e.g. `46G`). If omitted, the engine picks a budget under about 7/8 of physical RAM, never below the model floor.

**--verify**
> Check each expert record CRC on cache miss (slower; useful after copy/download). Also **WASTE_VERIFY=1**.

**--json**
> Machine-readable output for eval/plan/info/bench and similar commands.

**--help**
> List all commands and flags.

# DESCRIPTION

**waste** (Weight-Aware Streaming Tensor Engine) is a dependency-free C inference engine and CLI for running large mixture-of-experts language models when the full weight set does not fit in RAM. It keeps a resident "trunk" in memory, streams activated experts from a converted **.waste** container on NVMe, and uses remaining RAM as a bounded expert cache.

The flagship proof point is open-weight **Kimi K3** (~2.78T parameters, ~982 GiB container) running on consumer hardware at roughly half a token per second with enough RAM and internal NVMe. Smaller models in the same format (e.g. Kimi-Linear 48B) run much faster with far lower RAM floors.

Convert published safetensors with the repo's Python tools once; at runtime only the **waste** binary (and libc/pthreads) is required. An optional OpenAI-compatible HTTP server lives under `serve/` and uses the same public C API via ctypes.

# CAVEATS

K3-class models need tens of GB of RAM (about **29 GB** minimum open, **~64 GB** for useful throughput) and a **~1 TB** container on **fast internal NVMe**—USB enclosures are far too slow. Build needs a C11 compiler and **make**; conversion needs Python/torch. Expert CRC checks are off by default. Chat templates are fully filled for models the converter knows (K3 today); other containers may run in raw prompt mode. Not a drop-in replacement for general multi-model runtimes like **ollama**.

# HISTORY

**WASTE** is developed by **SQLite Cloud, Inc.** (sqliteai) and released under **Apache 2.0**. It targets disk-streaming inference for frontier-scale MoE models on single machines rather than multi-GPU servers.

# SEE ALSO

[ollama](/man/ollama)(1), [llama.cpp](/man/llama.cpp)(1)

# RESOURCES

```[Source code](https://github.com/sqliteai/waste)```

```[Documentation](https://github.com/sqliteai/waste/tree/main/docs)```

<!-- verified: 2026-08-01 -->
