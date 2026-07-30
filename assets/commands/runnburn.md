# TAGLINE

Memory-aware GGUF language model inference CLI

# TLDR

**Run** a GGUF model with a one-shot prompt

```runNburn [path/to/model.gguf] "[prompt]"```

**Start** interactive chat (omit the prompt)

```runNburn [path/to/model.gguf]```

**Chat** with multi-turn history and sampling options

```runNburn chat --system "[prompt]" --max-tokens [n] [path/to/model.gguf]```

**Serve** an OpenAI-compatible HTTP API

```runNburn serve --host 127.0.0.1 --port 8000 --ram-budget 16GiB [path/to/model.gguf]```

**Cap** host working-set memory

```runNburn --ram-budget 16GiB [path/to/model.gguf] "[prompt]"```

# SYNOPSIS

**runNburn** [_options_] _model.gguf_ [_prompt_]

**runNburn** **chat** [_options_] _model.gguf_

**runNburn** **serve** [_options_] _model.gguf_

# DESCRIPTION

**runNburn** (package/crate name **runNburn**; product binary commonly **runNburn**) is a pre-1.0 Rust inference runtime for quantized GGUF models that are larger than available fast memory. Weights stay file-backed where possible, host residency is bounded by detected or explicit RAM budgets, and optional CUDA or Metal paths accelerate supported operators.

The same product path covers one-shot generation, interactive chat, and a local OpenAI-compatible HTTP server (**chat/completions**, **responses**, models listing). Architecture-aware support includes Llama/Phi, Gemma, Qwen dense/hybrid/MoE, and other families; recognition does not guarantee every community GGUF variant is fully accelerated.

CPU is the default backend. Build with Cargo feature flags (**cpu**, **cuda**, **metal**, experimental **vulkan**) depending on hardware. Without **--ram-budget**, the engine reserves about one quarter of physical RAM for the OS and uses the remainder as a working-set budget.

# PARAMETERS

**--ram-budget** _size_

> Cap engine-owned host residency (e.g. **16GiB**, **32GB**). Binary and decimal suffixes are accepted. Direct CLI options must appear before the GGUF path.

**chat** / **serve**

> Subcommands for multi-turn REPL and HTTP serving. See **runNburn chat --help** and **runNburn serve --help** for sampling, cache, and bind options.

**serve** options commonly include **--host**, **--port**, **--model-name**, **--response-cache-budget**, and **--api-key-file**. Non-loopback binds require an API key.

# CAVEATS

Pre-1.0; APIs and backend coverage change. **--ram-budget** is not an OS RSS hard limit. The OpenAI surface is partial compatibility, not a full OpenAI API. Vulkan and some mobile paths are experimental. The binary name uses mixed case (**runNburn**) as shipped by the project.

# SEE ALSO

[llama-cli](/man/llama-cli)(1), [ollama](/man/ollama)(1), [curl](/man/curl)(1)

# RESOURCES

```[Source code](https://github.com/coderredlab/runNburn)```

<!-- verified: 2026-07-30 -->
