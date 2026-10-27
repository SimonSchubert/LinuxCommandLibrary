# TAGLINE

Interactive terminal chat with a Janas-LLM model streamed from disk

# TLDR

**Start** a chat (pick a catalog model; it is downloaded if missing)

```janas-chat```

Chat with a **catalog name**

```janas-chat [qwen3-4b]```

Chat with a converted **.jns** file

```janas-chat [models/qwen3-next.jns]```

Cap the **expert cache** so the desktop stays out of swap

```janas-chat [qwen3-30b-a3b] --cache [8]```

Keep the **GPU** off

```janas-chat [qwen3-4b] --no-gpu```

Use the catalog **fast** profile

```janas-chat [qwen3-4b] --profile [fast]```

Print **speed counters** after every reply

```janas-chat [qwen3-4b] --stats```

# SYNOPSIS

**janas-chat** [_model_] [_options_]

# DESCRIPTION

**janas-chat** is the terminal client of **Janas-LLM**, a family of C programs that run mixture-of-experts language models whose weights stay on disk. Experts each token needs are streamed from an NVMe SSD; the ones that keep coming back stay in an in-memory cache. An 80-billion-parameter model can answer on a laptop with 32 GB of RAM.

_model_ is a **.jns** file, or a name from the catalog (`janas-get list` shows them). With no model, the chat lists the catalog, marks what is already on disk, and asks which one. A catalog model that is not in `~/.local/share/janas/models` (or **JANAS_MODELS** / **--models**) is downloaded and converted after asking, through **janas-get**.

On a terminal the program takes the window: a banner, the conversation, and a footer with the model name, context used, last speed, and expert-cache fill. Lines starting with **/** are commands (`/help` lists them). A backslash then Enter adds a line to the message instead of sending it. **Ctrl-C** stops a reply; **Ctrl-D** quits. Piped in or out it stays a plain chat for scripts.

Settings stack in this order: the model's catalog profile, the measure of the model on this machine, `~/.config/janas/chat.conf`, `~/.config/janas/models/<name>.conf`, then the command line. `/save-config` writes the model's file (`/save-config global` the chat's). The first start of a model on a machine can offer to measure it (`--tune` / `--no-tune`).

A model whose catalog entry names a draft or multi-token prediction file gets it by itself. **--mtp** names one; **--no-mtp** goes without. **--draft** puts a small model of the same family in place of conversation-copied guesses (worth it on dense models). Speculative decoding does not change which tokens come out, only how many a pass checks; **--no-spec** and `/spec off` turn it off.

# PARAMETERS

_model_
> A `.jns` path or catalog name. None: list the catalog and ask.

**--profile** _quality_|_fast_
> Catalog profile. **quality** (default) keeps answers as the file gives them; **fast** adds levers measured to make that model faster at a small cost to its answers.

**--models** _dir_
> Where models live (default **JANAS_MODELS**, or `~/.local/share/janas/models`).

**--tune**, **--no-tune**
> Measure again how the model runs fastest on this machine, or neither ask nor use that measure.

**--mtp** _file_
> Multi-token prediction file (an MTP block, or Gemma 4's assistant). Without it, the matching file beside the model.

**--no-mtp**
> No prediction file, not even one found beside the model.

**--draft** _file_
> A small model of the same family to guess the next tokens.

**--ctx** _tokens_
> Context length (default **16384**, never more than the model was trained for).

**--cache** _GiB_
> Memory for streamed experts (default: what the machine can spare).

**--reserve** _GiB_
> When the cache is automatic, memory left to other programs (default: a fifth of the machine's).

**--bits** _2_|_4_|_6_
> Bits per weight of the experts' down matrix, for files stored in planes (default: the memory decides).

**--head** _4_|_6_
> Bits of the output head. **4** requantizes a six-bit head at start (default **6**, as in the file).

**--attention** _exact_|_fast_
> How attention scores are computed (default: **fast** above 16384 tokens of context).

**--system** _text_
> System message (`""` for none).

**--temp**, **--top-k**, **--top-p**, **--min-p**, **--seed**
> Sampling. Defaults follow Qwen's recommendations: temperature **0.7**, top-k **20**, top-p **0.8**.

**--max** _tokens_
> Longest reply (default: no limit).

**--mode** _auto_|_eco_|_max_
> Power mode. **eco** never uses the GPU for speed alone.

**--think** _on_|_off_
> Reasoning before replying, for models that do it (default **off**).

**--stats**
> A line of counters after every reply.

**--no-gpu**
> Never give the GPU work, whatever the mode says.

**--no-spec**
> No speculative decoding.

**--no-markdown**
> Print the model's marks instead of rendering them.

**--mcp-config** _file_
> MCP servers whose tools the model may call (default `~/.config/janas/mcp.json`).

**--no-mcp**
> Start no MCP server, including Janas's own services.

**--no-services**
> Start none of Janas's own services: **janas-flights**, **janas-git**, **janas-github**, **janas-maps**, **janas-prices**, **janas-quakes**, **janas-system**, **janas-weather**, and **janas-wiki**.

**--progress** _s_
> A line on stderr every _s_ seconds while a long prompt is read.

# CONFIGURATION

**~/.local/share/janas/models**
> Default model directory.

**~/.config/janas/chat.conf**
> Global chat settings (`/save-config global`).

**~/.config/janas/models/<name>.conf**
> Per-model settings (`/save-config`).

**~/.cache/janas/**
> Tuning profiles, expert-cache learning, and other machine-local state.

**~/.config/janas/mcp.json**
> MCP servers in the usual `mcpServers` format.

**JANAS_MODELS**
> Override the model directory.

**JANAS_GPU=0**
> Keep the engine off the GPU entirely.

**JANAS_TUNE=0**
> Turn self-tuning off (fixed defaults).

# CAVEATS

Janas is early software: the public API and the command line change without notice. The engine fills free memory with its expert cache and reads the disk with **O_DIRECT**; on a machine with less headroom than it reckons, the desktop can be pushed into swap. Using a GPU has, once, caused a driver reset that took the desktop with it. It was developed on one Linux x86-64 laptop (Debian 13, Intel Core Ultra 9 185H, 32 GB, NVMe); other CPUs, discrete GPUs, slower disks, and smaller machines are untested. macOS is not supported. Models must be **.jns** files (converted from GGUF); IQ2 and IQ1 types are refused. Qwen3.5-0.8B is a test model left out of the pick list.

# HISTORY

**Janas** is designed and written by **Maurizio "camauri" Cammalleri**. The first public release of Janas-LLM was in **September 2026**. It is free software under the **GNU GPL version 3 or later**.

# SEE ALSO

[janas-get](/man/janas-get)(1), [janas-nsm](/man/janas-nsm)(1), [gguf2jns](/man/gguf2jns)(1), [hf2jns_mtp](/man/hf2jns_mtp)(1), [jns_planes](/man/jns_planes)(1), [janas-bench](/man/janas-bench)(1), [vkcheck](/man/vkcheck)(1), [gpu_check](/man/gpu_check)(1), [janas-server](/man/janas-server)(1), [janas-mcp](/man/janas-mcp)(1), [janas-flights](/man/janas-flights)(1), [janas-git](/man/janas-git)(1), [janas-github](/man/janas-github)(1), [janas-maps](/man/janas-maps)(1), [janas-prices](/man/janas-prices)(1), [janas-quakes](/man/janas-quakes)(1), [janas-system](/man/janas-system)(1), [janas-weather](/man/janas-weather)(1), [janas-wiki](/man/janas-wiki)(1), [llama-cli](/man/llama-cli)(1), [ollama](/man/ollama)(1), [janus](/man/janus)(1), [koboldcpp](/man/koboldcpp)(1)

# RESOURCES

```[Source code](https://github.com/prabanta-dev/janas)```

```[Documentation](https://github.com/prabanta-dev/janas/blob/main/docs/chat.md)```

<!-- verified: 2026-10-13 -->
