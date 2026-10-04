# TAGLINE

Local Qwen3.8-Flash-Next engine with an OpenAI-compatible API

# TLDR

**Clone** and run the Linux installer (first start downloads the model)

```git clone https://github.com/Niko1221/Strata.git && cd Strata && ./setup.sh```

Accept the **recommended** model, size, context, and vision answers

```./setup.sh --yes```

**Start** a model that is already installed (later runs skip the download)

```./setup.sh```

Start a specific size through its **run script** (written by setup)

```./run-[iq2_xs].sh```

Install or change settings **without** starting the model

```./setup.sh --setup --no-start --yes```

Listen on the **LAN** (always set a key)

```./setup.sh --host 0.0.0.0 --api-key [secret]```

**Update** the engine and Python packages without starting

```./update.sh```

Open a **terminal chat** against a running server

```python3 chat.py --port 8080```

Send an **OpenAI-compatible** chat request

```curl http://127.0.0.1:8080/v1/chat/completions -H "Content-Type: application/json" -d '{"model":"strata","messages":[{"role":"user","content":"[Hello]"}]}'```

**Check** that the process is up

```curl http://127.0.0.1:8080/health```

Print the compiled engine's **flags**

```engine/strata --help```

# SYNOPSIS

**strata** [_options_]

**./setup.sh** [_options_]

# PARAMETERS

**--help** / **-h**
> Print the engine's flag list (`strata generate --pack DIR --tokens LIST ...`). There is no `generate` subcommand: those words are the help banner. **--serve** keeps the process resident for the HTTP wrapper.

**--serve**
> Stay loaded and take requests from `serve/server.py` on stdin. Setup writes this into the per-model config.

**--pack** _DIR_
> Packed-model directory (default `pack/full`).

**--tokens** _LIST_ / **--tokens-file** _PATH_
> Prompt as comma-separated token ids, or a file of ids. Required unless **--serve**.

**--max-context** _N_
> KV/state capacity in tokens (engine default **4096**; setup stores the size you chose, up to **524288**).

**--kv** `fp16`|`int8`|`q4_0`|`k8v4`
> KV-cache storage. Setup's default above 8K context is **int8**.

**--vision**
> Accept image embeddings from **strata-vision** while serving.

**--batch** _N_ / **--slots** _N_
> Serve up to _N_ requests together (2–8). Each slot needs its own session VRAM.

**--layer-split** _SPEC_
> Multi-GPU layer split: a layer index, a comma list, or `auto`.

**--expert-cache** _N_
> Expert blobs kept resident in VRAM (0 = off).

The Linux launcher **./setup.sh** (it execs `.venv/bin/python setup.py`) accepts:

**--yes**
> Take every recommended answer (no prompts).

**--setup**
> Install another model or change remembered settings instead of only starting.

**--no-start**
> Install only.

**--update**
> Refresh the engine, Python packages, and model configs without starting (`./update.sh` runs this after `git pull`).

**--family** `qwen`|`swift`|`coder`|`unsloth`
> Model family. **qwen** is Qwen3.8-Flash-Next; **coder** is the half-expert coding cut; **swift** is the shorter-thinking fine-tune.

**--model** `Q2_0`|`IQ2_XS`|`IQ3_XXS`|`IQ3_S`|`IQ1_M`|`UD-IQ4_XS`|`UD-Q4_K_XL`
> Quant size. **IQ2_XS** is the usual 64 GB recommendation; **IQ1_M** is Coder-only; the Unsloth 4-bit sizes need more RAM or SSD paging.

**--context** _N_
> Served context (8192, 32768, 65536, 131072, 262144, 393216, or 524288). Past 262144 setup adds YaRN.

**--vision** `yes`|`no`|`gpu`|`cpu`
> Image encoder. AMD on Linux uses **cpu**.

**--port** _N_
> HTTP port (default **8080**).

**--host** _ADDR_
> Bind address. Default **127.0.0.1**; **0.0.0.0** needs **--api-key**.

**--api-key** _KEY_
> Require `Authorization: Bearer` or `x-api-key` on `/v1/*`. Also `$STRATA_API_KEY`.

**--gpu** _N_ / **--gpus** `0,2`|`all`
> NVIDIA ids as `nvidia-smi` numbers them; AMD ids as setup lists them. **--gpus** is saved.

**--backend** `cuda`|`hip`|`sycl`
> **cuda** NVIDIA, **hip** AMD, **sycl** experimental Intel Arc (`docs/INTEL_ARC.md`).

**--yes** is not consent to a risky override: an explicit **--model**, **--gpus**, or similar is.

**python3 chat.py** talks to a running server: **--host**, **--port**, **--think** `none`|`low`|`medium`|`high`, **--max-tokens**. In-chat: `/image` _path_, `/think` _level_, `/reset`, `/quit`.

# DESCRIPTION

**strata** is the compiled inference engine from **Niko1221/Strata**. It runs **Qwen3.8-Flash-Next** (a 125-billion-parameter Mixture-of-Experts model) on a consumer PC by keeping hot experts in GPU VRAM, the rest in RAM, and a large lookup table on SSD. A small draft model proposes tokens; the large model verifies a window of them. The tree also ships **strata-vision** (image encoder) and helper binaries such as **strata-device**.

Linux users start from the checkout with **./setup.sh**. The first run creates `.venv`, fetches or compiles the engine into `engine/strata` (prebuilt zip `strata-linux-x64.zip` for RTX 20/30/40/50), downloads about 70 GB of GGUF weights, packs them, writes `run-<model>.sh`, and launches `serve/server.py`. Later runs of **./setup.sh** or **./run-<model>.sh** only load the model. Closing that process stops it.

The HTTP app listens at **http://127.0.0.1:8080** (Chat, Monitor, About). API bases:

> OpenAI Chat Completions / models: `http://127.0.0.1:8080/v1`

> Anthropic Messages (Claude Code: `ANTHROPIC_BASE_URL`): `http://127.0.0.1:8080/v1/messages`

> OpenAI Responses (Codex CLI): `http://127.0.0.1:8080/v1/responses`

Useful paths include `/health`, `/v1/status`, and `/v1/vram`. Any API key and any model name work unless **--api-key** was set. Reasoning effort is **off**, **low**, **medium**, or **high**. By default one request runs at a time; **--parallel** _N_ (or `"parallel"` in the config) enables batch slots.

NVIDIA needs driver **580** or newer and **12 GB** of VRAM (8 GB starts, slowly). AMD uses the kernel **amdgpu** driver and the HIP engine (RX 7900 / 7800 / 7700 XT, RX 9060 XT, RX 9070 / AI PRO R9700; 6800 / 6900 community-reported). **32 GB** of RAM fits Coder; **64 GB** fits every regular size. Plan about **80 GB** of disk, preferably NVMe.

# CONFIGURATION

Setup writes `strata-<model>.json` in the checkout (exe path, pack, context, host, API key, GPUs, vision, KV, batch). Model files live in **Strata-data** next to the Strata folder so a new clone finds them. Chats stay in the browser's `localStorage` (`strata.*` keys), not on the server.

Docker (NVIDIA) builds the engine into the image:

```docker build -t strata .```

```docker run --rm --gpus all -p 8080:8080 --ulimit memlock=-1 -v strata-data:/data strata```

Image env vars include **MODEL**, **FAMILY**, **CONTEXT**, **VISION**, **KV**, **GPU**, **GPUS**, **LAYER_SPLIT**, **API_KEY**, **LOW_RAM**, and **REINSTALL**. The container listens on `0.0.0.0:8080` and has a **HEALTHCHECK** on `/health`.

An MCP server for coding agents is documented in `docs/MCP_SERVER.md`.

# CAVEATS

The first load copies **35–55 GB** into RAM and can freeze the machine for **1–3 minutes**. Do not close the setup window during that. If port **8080** is in use, Strata is already running.

Ready-made engines need an **AVX2** CPU; older CPUs compile an experimental slower build. AMD vision runs on the CPU. Unsloth **UD-Q4_K_XL** is NVIDIA-only and SSD-bound on a 64 GB PC. Distro packages named **strata** are not this project: install from the GitHub tree or the published engine zip.

Do not bind **0.0.0.0** without **--api-key**. `GET /api-monitor` stores recent prompts in memory only if enabled.

# HISTORY

**Strata** is MIT-licensed (ggml, fonts, and each GGUF keep their own licenses). The engine version in CMake is **0.1.39**. Weights are **Qwen3.8-Flash-Next** by the Qwen team, quantized by ISTA-DASLab, UkisAI (Swift 1.5), and Unsloth. The runtime reuses parts of **llama.cpp** / **ggml**.

# SEE ALSO

[ollama](/man/ollama)(1), [llama-cli](/man/llama-cli)(1), [llama.cpp](/man/llama.cpp)(1), [llamafile](/man/llamafile)(1), [janus](/man/janus)(1), [koboldcpp](/man/koboldcpp)(1), [vllm](/man/vllm)(1)

# RESOURCES

```[Source code](https://github.com/Niko1221/Strata)```

```[Documentation](https://github.com/Niko1221/Strata/blob/main/docs/INSTALL.md)```

<!-- verified: 2026-10-04 -->
