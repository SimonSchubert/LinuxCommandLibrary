# TAGLINE

Local OpenAI/Anthropic-compatible HTTP server for DwarfStar LLM inference

# TLDR

**Start the API** with a GGUF model (default bind 127.0.0.1:8000)

```ds4-server -m [ds4flash.gguf]```

**Serve with a large context** and Metal backend

```ds4-server -m [ds4flash.gguf] --metal --ctx [100000]```

**Listen on a custom host and port**

```ds4-server -m [ds4flash.gguf] --host [127.0.0.1] --port [8000]```

**Enable CORS** for browser clients

```ds4-server -m [ds4flash.gguf] --cors```

**Stream model weights from SSD** when the model does not fit in RAM

```ds4-server -m [ds4flash.gguf] --ssd-streaming --ctx [32768]```

**Persist KV cache** to disk under a size budget

```ds4-server -m [ds4flash.gguf] --ctx [100000] --kv-disk-dir [~/.ds4/server-kv] --kv-disk-space-mb [8192]```

**List models** via the local API

```curl http://127.0.0.1:8000/v1/models```

**Lower GPU duty cycle** for quieter thermals

```ds4-server -m [ds4flash.gguf] --power [60]```

# SYNOPSIS

**ds4-server** [_options_]

# PARAMETERS

**-m**, **--model** _FILE_
> Path to the GGUF model. Default: **ds4flash.gguf**.

**--metal** | **--cuda** | **--rocm** | **--cpu**
> Select the inference backend explicitly. Metal is primary on macOS; CUDA/ROCm on Linux where built.

**-c**, **--ctx** _N_
> Allocated context length in tokens.

**-n**, **--tokens** _N_
> Default maximum output tokens when the client does not set a limit.

**--host** _HOST_
> Bind address. Default: **127.0.0.1**.

**--port** _N_
> Bind port. Default: **8000**.

**--cors**
> Add **Access-Control-Allow-*** headers for browser JavaScript clients.

**--power** _N_
> GPU duty-cycle target from 1 to 100. Default: **100**.

**--ssd-streaming**
> Opt into SSD-backed model streaming instead of full RAM residency.

**--ssd-streaming-cache-experts** _N_|_NGB_
> Size of the routed-expert cache (expert count or GiB, e.g. **32GB**).

**--think** / **--think-max** / **--nothink**
> Default thinking mode for chat-style requests (server also maps OpenAI/Anthropic effort fields).

**--kv-disk-dir** _DIR_
> Enable on-disk KV checkpoints in _DIR_.

**--kv-disk-space-mb** _N_
> Disk budget in megabytes when KV disk is enabled. Default: **4096**.

**--trace** _FILE_
> Write prompts, cache decisions, outputs, and tool calls to a trace file.

**-t**, **--threads** _N_
> CPU helper threads for host-side work.

# DESCRIPTION

**ds4-server** is the HTTP API front end of **DwarfStar** (project **ds4** by **Salvatore Sanfilippo** / **antirez** and contributors). It loads a project-specific **GGUF** and serves OpenAI- and Anthropic-compatible endpoints so local tools, IDEs, and coding agents can talk to a specialized DeepSeek V4 (and related) inference engine without calling a cloud API.

Each client connection is handled by a blocking request thread; inference itself is serialized onto a single worker that owns the live session and KV state. That design keeps session reuse, optional disk KV checkpoints, and graph execution in one place. Endpoints include **/v1/chat/completions**, **/v1/responses**, **/v1/completions**, and **/v1/messages**. Model name aliases such as **deepseek-v4-flash** and **deepseek-v4-pro** both refer to the GGUF currently loaded.

Unlike generic GGUF runners, DwarfStar targets a narrow set of carefully prepared weights (DeepSeek V4 Flash/PRO and experimental forks for other MoE models). Use the project's download scripts and published GGUFs; arbitrary community GGUF files are not expected to work. Backends include **Metal** (primary on Apple Silicon), **CUDA** (including DGX Spark), and **ROCm** (e.g. Strix Halo). **--ssd-streaming** keeps models runnable when they exceed RAM by paging routed experts from disk.

# CAVEATS

Software is explicitly **beta**. Only DwarfStar-prepared GGUFs are supported. Default bind is localhost; expose to a network only if you understand there is no built-in auth. On-disk KV and large contexts need substantial free disk and RAM. CPU-only builds are mainly for diagnostics; production use expects Metal, CUDA, or ROCm. The interactive CLI binary is also named **ds4**, which collides with unrelated DualShock 4 tools of the same name on Linux.

# HISTORY

**DwarfStar** (**ds4**) was created by **Salvatore Sanfilippo** (**antirez**) as a small, self-contained local inference stack optimized for large open-weight MoE models that barely fit (or do not fit) in consumer RAM. **ds4-server** provides the HTTP API half of that stack so coding agents and OpenAI-compatible clients can use the same engine as the interactive **ds4** CLI.

# SEE ALSO

[ds4-agent](/man/ds4-agent)(1), [ds4-bench](/man/ds4-bench)(1), [ds4-eval](/man/ds4-eval)(1), [ollama](/man/ollama)(1), [llama-cli](/man/llama-cli)(1), [llama.cpp](/man/llama.cpp)(1)

# RESOURCES

```[Source code](https://github.com/antirez/ds4)```

```[Documentation](https://github.com/antirez/ds4/blob/main/docs/ENGINE_REFERENCE.md)```

<!-- verified: 2026-07-18 -->
