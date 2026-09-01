# TAGLINE

runs Qwen3.8-Flash-Next on Apple Silicon by streaming experts from SSD

# TLDR

**Check** whether this Mac has the RAM and disk for the model, before downloading

```slotstream doctor```

**Download** the 104 GB 4-bit weights (resumable, hash-verified)

```slotstream pull```

**Verify** an existing download against pinned sha256 hashes

```slotstream pull --verify```

**Serve** an Ollama- and OpenAI-compatible API on port 11434

```slotstream serve```

**Generate** from a prompt on the command line

```slotstream run --prompt "[Your question]"```

**Cap process memory** and print the plan as JSON

```slotstream doctor --memory-gb [16] --json```

# SYNOPSIS

**slotstream** _subcommand_ [_options_]

# PARAMETERS

**run**
> Generate from a prompt. **--prompt** _TEXT_ (default: a built-in sample), **--max-tokens** _N_ (default 128; ≤0 means as many as allowed), **--greedy** (deterministic), **--raw** (no chat template), **--think** (thinking mode).

**serve**
> Start an Ollama-compatible HTTP server. **--port** _N_ (default 11434), **--max-context** _N_ (default 32768), **--no-prefix-cache** (re-prefill every request), **--no-elastic** (pin the expert cache at startup size).

**pull** [_MODEL_]
> Download the pinned 4-bit weights (only **qwen3.8-flash-next:4bit** in v0). **--dir** _PATH_ (default `~/.slotstream/models/...`), **--connections** _N_, **--verify** (re-hash an existing copy; download nothing).

**doctor**
> Print device RAM, the memory plan your flags would produce, estimated decode speed, and whether the weights fit on disk. **--json**, **--sim-ram** _GB_, **--sim-working-set** _GB_, **--sim-available** _GB_.

**--model** _NAME_or_DIR_
> Model name or directory (default: the pinned Qwen3.8-Flash-Next 4-bit build).

**--memory-gb** _G_
> Total memory the process may use, in GB (minimum 8.1). First of the three size knobs that wins.

**--experts-per-layer** _N_
> Cache _N_ of 512 routed experts per layer (pool ≈ _N_ × 0.133 GB). Takes precedence over **--memory-gb** and **--pool-gb**.

**--pool-gb** _G_
> Raw expert-pool size in GB. Beats **--memory-gb**; loses to **--experts-per-layer**.

**--max-ram-percent** _P_
> Auto sizing only: largest share of RAM auto may target (default 70). Cannot raise the target past the ~33 GB decode knee.

# DESCRIPTION

**slotstream** is a Swift CLI that runs the 104 GB 4-bit **Qwen3.8-Flash-Next** mixture-of-experts model on Apple Silicon Macs that cannot hold the whole checkpoint in RAM. The dense trunk (~3.8 GB) stays resident; 68 GB of routed experts (512 per layer, 10 active per token) and a 32 GB n-gram table are read from SSD into a fixed pool of cache slots shared across all 48 layers.

**serve** listens on port 11434 and implements the chat/generate subset used by Ollama clients and OpenAI SDKs (streaming, CORS, and common sampling fields). The advertised model name is **qwen3.8-flash-next:4bit**. Unsupported features (tools, images, JSON-schema output, logprobs, other model names) return HTTP 400 instead of being ignored.

With no size flags, auto picks the lowest of 33 GB, 70% of RAM, and the Metal working-set limit, then stays elastic: every 15 s it may shrink or grow the cache between requests. Greedy decoding is byte-identical across cache sizes. Follow-up turns reuse prefix state so time-to-first-token stays flat; **--no-prefix-cache** disables that.

**pull** downloads 103.8 GB in 24 files from Hugging Face, resumes on interrupt, and checks sha256 hashes compiled into the binary. **serve** and **run** offer the same download on first use if a terminal is attached.

# CAVEATS

Requires **Apple Silicon** and **macOS 14+**. It does not run on Linux or Intel Macs. You need about **110 GB free disk** for the weights. Performance numbers in the upstream README were measured on **one** M5 Pro with 48 GB; smaller RAM tiers are estimated. Long prompts are slow to start (prefill is paid up front). Prefix-cache reuse is not bit-identical to a full re-prefill, so greedy replies can differ on near-tied tokens. One model process at a time. macOS 14 and 15 have had the installer exercised, not a full runtime campaign.

# HISTORY

**slotstream** was published as a Show HN project by **carloslfu** in **2026**. It is a single Swift binary using **MLX**, written to run Qwen3.8-Flash-Next by streaming MoE experts rather than mmap'ing the full 104 GB checkpoint.

# SEE ALSO

[ollama](/man/ollama)(1), [llama.cpp](/man/llama.cpp)(1), [llamafile](/man/llamafile)(1)

# RESOURCES

```[Source code](https://github.com/carloslfu/slotstream)```

<!-- verified: 2026-09-01 -->
