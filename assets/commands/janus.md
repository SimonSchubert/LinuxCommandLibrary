# TAGLINE

Local GGUF LLM server with an OpenAI-compatible API

# TLDR

**Build** the Linux binary (downloads llama.cpp Vulkan shared libraries)

```./build.sh```

**Start** the server (reads `.env` from the working directory or next to the binary)

```janus```

**Start** without trying to open a browser

```JANUS_NO_BROWSER=1 janus```

Run on **CPU** with an explicit GGUF file

```INFERENCE_BACKEND=cpu JANUS_MODEL_PATH=[./models/model.Q4_K_M.gguf] janus```

**Listen** on a different address

```JANUS_LISTEN_ADDR=[127.0.0.1:8991] janus```

**Check** that the process is up

```curl http://127.0.0.1:8990/health```

Send an **OpenAI-compatible** chat request

```curl http://127.0.0.1:8990/v1/chat/completions -H "Content-Type: application/json" -d '{"model":"local","messages":[{"role":"user","content":"[Hello]"}]}'```

**Proxy** chat to a local Ollama instance

```INFERENCE_BACKEND=ollama OLLAMA_MODEL=[mistral:7b] janus```

# SYNOPSIS

**janus**

# DESCRIPTION

**janus** is a single Go binary from **Vibra-Ingenn** that loads a **GGUF** model on the local machine and serves it over HTTP. Inference uses **llama.cpp** through **Vulkan** (AMD, Intel, or NVIDIA) or a CPU fallback. The process also ships a bundled web UI (Assistant, Chat, Kernel, Config, Memory, Skills) and a **ReAct** tool loop that can read and write files, run shell commands, extract text from documents, and render PDF or Word output.

There are no command-line flags. Startup reads a `.env` file (walking from the current directory toward the filesystem root, then next to the executable) and environment variables. The default listen address is **127.0.0.1:8990**. The OpenAI-style base URL is `http://127.0.0.1:8990/v1`. Useful paths include `/health`, `/v1/models`, `/v1/chat/completions` (streaming supported), `/v1/tools/list`, `/v1/tools/call`, `/kernel/run`, and `/upload` (50 MB multipart cap).

On Linux, `./build.sh` fetches llama.cpp Vulkan `.so` files, compiles `dist/janus`, copies the libraries beside the binary, and sets `RPATH` to `$ORIGIN` when **patchelf** is available. Otherwise run with `LD_LIBRARY_PATH` pointing at the directory that contains `libllama.so`. The companion **modelget** binary in the same repository downloads a GGUF file from Hugging Face into `models/`.

Hot-swap a model from the web UI Config tab or `POST /models/load` without restarting. Optional backends besides local GGUF are **Ollama** (`INFERENCE_BACKEND=ollama`) and cloud routers such as OpenRouter when the matching API key is set.

# CONFIGURATION

Copy `.env.example` to `.env` in the directory you launch **janus** from, or export the same names in the environment. Relative `JANUS_MODEL_PATH` values are resolved against the **current working directory**, not the source tree.

**INFERENCE_BACKEND**
> `vulkan` (default), `cpu`, `ollama`, or `openrouter`.

**JANUS_MODEL_PATH**
> Path to the `.gguf` file. Required for local Vulkan/CPU inference.

**JANUS_LIB_PATH**
> Path to `libllama.so` / `llama.dll`. Auto-detected next to the binary when unset.

**JANUS_GPU_LAYERS**
> Layers to offload to the GPU. `-1` is all layers; `0` is CPU only.

**JANUS_VRAM_CEILING_MB**
> Internal VRAM budget hint in MiB (default **9216**).

**JANUS_CTX_SIZE**
> Context window in tokens.

**JANUS_MAX_TOKENS**
> Maximum tokens per reply (default **4096**).

**JANUS_PROMPT_FORMAT**
> Prompt template: `chatml`, `llama2`, or `alpaca`.

**JANUS_LISTEN_ADDR**
> Bind address (default **127.0.0.1:8990**). A bare port is treated as `127.0.0.1:PORT`.

**JANUS_NO_BROWSER**
> Set to any non-empty value to skip the automatic browser launch.

**JANUS_AUTH**
> When `true`, require login on admin routes (Config, model load, and similar).

**JANUS_ADMIN_PASSWORD**
> Admin password when auth is on. Generated on first run if unset.

**JANUS_SAFE_MODE**
> When `true`, block shell commands from the `run_command` tool.

**JANUS_EXECUTION_MODE**
> Kernel tool loop: `yolo` auto-runs tools; `safe` prompts before destructive tools.

**OLLAMA_BASE_URL** / **OLLAMA_MODEL**
> Used when `INFERENCE_BACKEND=ollama` (default URL `http://127.0.0.1:11434`).

Logs append to `logs/janus.log`. Uploads land in `workspace/uploads/`; generated files in `workspace/outputs/`. Conversation facts persist in a local SQLite database.

# CAVEATS

This **janus** is the Vibra-Ingenn GGUF runner. Distro packages named **janus** are almost always the unrelated **Meetecho Janus WebRTC gateway**. Several other projects also ship a `janus` binary.

The process takes no flags; a missing or wrong `.env` is the usual startup failure. Local Vulkan/CPU mode refuses to start without a readable `JANUS_MODEL_PATH`. Linux needs `libllama.so` beside the binary or on `LD_LIBRARY_PATH`. First model load commonly takes 10–60 seconds. The built-in browser opener uses Windows `cmd /c start` and does not open a browser on Linux. Built-in tools can run arbitrary shell commands unless **JANUS_SAFE_MODE** is set. OCR tools need **tesseract** on `PATH`. Default bind is loopback; do not expose the port without **JANUS_AUTH**.

# HISTORY

**Janus** is developed by **Vibra-Ingenn** as a MIT-licensed Go binary that wraps llama.cpp inference, an OpenAI-compatible router, and a local tool-using assistant. Windows is the primary target; Linux and macOS builds are supported from the same tree.

# SEE ALSO

[ollama](/man/ollama)(1), [llama-cli](/man/llama-cli)(1), [llama.cpp](/man/llama.cpp)(1), [llamafile](/man/llamafile)(1), [koboldcpp](/man/koboldcpp)(1), [vllm](/man/vllm)(1), [tesseract](/man/tesseract)(1)

# RESOURCES

```[Source code](https://github.com/Vibra-Ingenn/Janus)```

```[Documentation](https://github.com/Vibra-Ingenn/Janus/blob/main/docs/USER_MANUAL.md)```

<!-- verified: 2026-10-02 -->
