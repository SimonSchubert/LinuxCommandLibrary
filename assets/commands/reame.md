# TAGLINE

CPU-first local LLM inference server with persistent caches

# TLDR

**List** catalog models and what is already on disk

```reame list```

**Download**, autoconfigure, and **chat** with a model

```reame run [qwen2.5-1.5b]```

One-shot **prompt**

```reame run [qwen2.5-1.5b] "[Explain mmap]"```

Serve an **OpenAI-compatible API**

```reame run [qwen2.5-1.5b] --serve```

Use the **Conclave** (best-of-N majority) for a harder question

```reame run [qwen2.5-1.5b] "[question?]" --best-of [5]```

Run with an explicit **config** file

```reame --config [config/reame.conf] --serve```

# SYNOPSIS

**reame** [_options_]

**reame** **run** _model_ [_prompt_] [_options_]

**reame** **list**

# DESCRIPTION

**reame** is an LLM inference server built on **llama.cpp**, optimized for cheap CPU hardware. Its design goal is to avoid recomputing work: shared prompt prefixes are snapshotted to disk, completed generations feed an on-disk archive used for drafting later requests, and optional speculative decoding adapts to measured acceptance.

**reame run** resolves a catalog name or local GGUF path, downloads into **~/.reame/models** on first use, and picks threads, KV settings, and cache paths for the host. **--serve** exposes OpenAI-compatible **completions** and **chat/completions** (with SSE streaming), sessions, metrics, and health endpoints. Advanced features include interleaved multi-user batches, grammar-driven drafting, **--best-of** consensus (**Conclave**), and an optional **reame arca** shared memory daemon.

# PARAMETERS

**list**
> Show model catalog and local downloads

**run** _model_ [_prompt_]
> Chat or one-shot; **--serve** for API mode; **--best-of** _N_ for majority voting

**--config** _file_
> Path to reame configuration (model path, threads, cache, server, speculative, …)

**--prompt** / **--max-tokens** / **--serve**
> Direct inference and server flags when not using **run**

# CONFIGURATION

INI-style config sections include **[model]**, **[memory]** (KV quantization), **[speculative]**, **[cache]** (disk budget), **[server]** (port, API key, parallel users), and optional **[arca]** remote cache. Homebrew: **brew install reame** from the project's tap.

# CAVEATS

CPU-focused; not a general GPU or multi-model manager like Ollama. Quality is workload-dependent—best for extraction, classification, and repetitive domain tasks where caching pays off. Young project; pin versions for production.

# SEE ALSO

[ollama](/man/ollama)(1), [llama-cli](/man/llama-cli)(1)

# RESOURCES

```[Source code](https://github.com/swellweb/reame)```

```[Documentation](https://github.com/swellweb/reame/blob/main/docs)```

<!-- verified: 2026-07-14 -->
