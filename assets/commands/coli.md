# TAGLINE

Tiny pure-C engine to run large MoE LLMs (e.g. GLM-5.2 744B) from disk on modest hardware

# TLDR

**Build** the engine

```cd c && ./setup.sh```

**Convert** (or point at pre-converted model) and chat

```COLI_MODEL=/path/to/glm52_i4 ./coli chat```

**Inspect** planned RAM/VRAM tier before loading

```COLI_MODEL=/path/to/glm52_i4 ./coli plan```

**Serve** an OpenAI-compatible local API

```COLI_MODEL=/path/to/glm52_i4 ./coli serve --host 127.0.0.1 --port 8000```

**Benchmark** quality

```./coli bench```

# SYNOPSIS

**coli** <command> [options]

# DESCRIPTION

coli (colibrì) is a minimal, zero-dependency C inference engine (single-file core) for running very large Mixture-of-Experts models such as GLM-5.2 by keeping only the dense portion resident in RAM and streaming the routed experts from disk on demand, with aggressive caching and optional MTP speculative decoding.

It is intentionally disk-bound on small machines and is designed for experimentation and local use of frontier-scale models on consumer hardware. Runtime inference is pure C; Python is used only for the offline converter and the optional HTTP gateway.

# COMMANDS

**chat**
> Interactive chat (supports sampling, MTP, thinking mode). Conversations can persist a compressed KV cache across restarts.

**convert**
> One-time FP8→int4 conversion of the model shards (resumable; downloads one shard at a time).

**plan**
> Report dense/expert footprint, safe expert-cache cap, and VRAM tier plan from safetensors headers without loading tensors.

**serve**
> OpenAI-compatible HTTP API (`/v1/chat/completions`, `/v1/models`, legacy completions) with optional API key and queueing.

**bench**
> Run quality benchmarks (HellaSwag, ARC, MMLU).

**run**, **info**
> Single-prompt generation and model info.

# PARAMETERS

Environment variables and flags control temperature, topp, draft depth (MTP), RAM budget, autopin, CUDA expert tier, and more. `COLI_MODEL` (or `--model`) is required for most operations. Common knobs include `--temp`, `--topp`, `--ngen`, `DRAFT`, `THINK=1`, `PIN`/`PIN_GB`, and `--auto-tier` (applies the plan to chat/run/serve). See the project README for the full set.

# CAVEATS

- Requires a large amount of fast local storage (~370 GB for the example model) and benefits enormously from fast random-read NVMe.
- Currently specialized for the GLM-5.2 architecture; not a general-purpose LLM runner.
- Cold performance is low; warm cache + MTP dramatically improves responsiveness. The MTP head should be int8 for speculation to engage usefully.

# SEE ALSO

[llama.cpp](/man/llama.cpp)(1)

# RESOURCES

```[Source code](https://github.com/JustVugg/colibri)```

```[Documentation](https://github.com/JustVugg/colibri#readme)```

<!-- verified: 2026-07-11 -->
