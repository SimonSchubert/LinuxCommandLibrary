# TAGLINE

run Qwen3.6-35B-A3B locally on a 16 GB machine

# TLDR

**Ask** a question in the terminal

```samosa "explain how DNS works"```

**Continue** a sealed conversation

```samosa --continue "and which strategy does Python use?"```

**Enable** general **thinking** mode

```samosa --think "solve this logic puzzle"```

**Use more threads** when the machine is cool

```samosa --fast "summarize this design"```

**Check** the installation

```samosa doctor```

**Start** the local web chat app

```samosa app```

# SYNOPSIS

**samosa** [_OPTIONS_] ["_prompt_"]

**samosa** **doctor** | **app** | **serve** [**--stop**]

# DESCRIPTION

**samosa** (Samosa Chat) runs the text part of **Qwen3.6-35B-A3B** entirely on the local CPU with no cloud account and no telemetry. The model is a mixture of experts (35B total parameters, about 3B active per token). Shared weights stay in RAM while expert weights stream from NVMe as needed, so a 16 GB machine can run it (install footprint under **~/.samosa**, roughly 30 GB free disk recommended).

The primary interface is the terminal: pass a prompt string and stream the answer. Conversations are sealed to disk and resume byte-exactly with **--continue**, so follow-ups do not re-read full history. **samosa app** / **samosa serve** start a loopback-only HTTP UI and OpenAI-compatible endpoints on **127.0.0.1:8642**.

macOS on Apple Silicon is the fast path (on the order of 5–7 tok/s on a 16 GB M3); Linux and Windows typically run via Docker and are slower until x86 SIMD dispatch lands. Default thread count is two for cooler operation; **--fast** raises concurrency when thermal headroom allows.

# PARAMETERS

_"prompt"_
> Question or instruction to send to the model

**--continue**
> Resume from the last sealed conversation snapshot

**--think**
> General reasoning mode (higher temperature / thinking budget)

**--think-code**
> Precise coding profile with a larger thinking budget

**--fast**
> Adaptive multi-thread mode (runs warmer)

**--seed** _n_
> Fix the sampling seed for reproducible output

**--max-tokens** _n_
> Cap new answer tokens (outer ceiling up to 8192)

**--thinking-budget** _n_
> Cap internal reasoning tokens when thinking is enabled

**doctor**
> Verify install paths, model files, and environment

**app**
> Start the server in the background and open the chat page

**serve**
> Run the local server in the foreground on 127.0.0.1:8642

**serve --stop**
> Stop the background server

# CAVEATS

Needs about **16 GB RAM**, a fast **NVMe SSD**, and substantial free disk for weights. Decode is often SSD-bound, not GPU-bound; there is no Metal/CUDA path yet. Conversation total size is capped (24,576 tokens). Text only for now (vision weights may ship but runtime image path is incomplete). x86 Docker performance is much lower than Apple Silicon until runtime CPU dispatch is finished. Intel Macs and machines under 16 GB are unsupported.

# HISTORY

Independent Apache-2.0 project by Deepan Wadhwa. Inference engine and packaging build on ideas from **colibrì** and the Qwen3.6 model family; Samosa adds group-32 quantization, a byte-budgeted expert cache, sealed conversations, installer rollback, and a local server.

# SEE ALSO

[ollama](/man/ollama)(1), [llama-cli](/man/llama-cli)(1), [llamafile](/man/llamafile)(1), [llm](/man/llm)(1)

# RESOURCES

```[Source code](https://github.com/deepanwadhwa/samosa-chat)```

```[Documentation](https://github.com/deepanwadhwa/samosa-chat/blob/main/docs/USAGE.md)```

<!-- verified: 2026-07-17 -->
