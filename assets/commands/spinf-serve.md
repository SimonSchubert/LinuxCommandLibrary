# TAGLINE

Bulk classification and decision inference server for one GPU

# TLDR

**Install** the server extra and serve the default 12B checkpoint (downloads on first start)

```pip install "spinf-serve[server]"```

```spinf-serve serve [spinf/gemma-4-12b-fp8]```

Listen on a **different port** and require a Bearer token

```spinf-serve serve [spinf/gemma-4-12b-fp8] --port [8000] --token [secret]```

**Score** one saved `/v1/score` request without starting a server

```spinf-serve score [request.json] [spinf/gemma-4-12b-fp8] --device [cuda:0]```

**List** prompt packs a server would enable

```spinf-serve packs list```

**Validate** a local pack repository

```spinf-serve packs validate [./my-packs]```

Ask **two questions** about one message

```curl http://localhost:8000/v1/score -H "Content-Type: application/json" -d '{"model":"spinf/gemma-4-12b-fp8","messages":[{"role":"user","content":"[I was charged twice, please refund one charge.]"}],"scoring":{"queries":[{"id":"refund","template":"\n\nIs the customer asking for a refund?\nAnswer:{?}","options":[" yes"," no"]}]}}'```

Wait until the process is **ready** (warmup can take minutes)

```curl -s http://localhost:8000/readyz```

# SYNOPSIS

**spinf-serve** _command_ [_options_]

# DESCRIPTION

**spinf-serve** is the console script from the **spinf-serve** Python package. It is a local inference engine for **decision models**: it reads a piece of content once and answers many fixed-choice questions about it in the same GPU pass. Each answer is a probability over the options you give, not generated chat text. The HTTP API matches the hosted spinf service and is OpenAI-compatible through `/v1/chat/completions` when a scoring block is sent in the extra body field. Apache 2.0. Package version **0.1.2**.

It is not a chat server. Nothing is generated unless a request asks for an extraction or generation slot. The engine is built for throughput on one NVIDIA GPU rather than the latency of a single request.

`pip install "spinf-serve[server]"` pulls the GPU stack (pinned torch, triton, transformers) plus FastAPI and uvicorn. Python **3.12** is required. Linux, a driver supporting **CUDA 13**, and `gcc` at run time (kernels compile on first start, then cache) are required. `ffmpeg` is needed to decode audio. One process owns one GPU.

Default bind is **0.0.0.0:8000**. Without **--token** the server is open. Readiness is **GET /readyz** (the container health check uses this). **GET /v1/models** reports the served model, features, and limits. Scoring is **POST /v1/score**. Settings layer as flags, then `SPINF` environment variables, then a TOML file (**--config**), then the model's manifest defaults.

Published checkpoints (Hugging Face `spinf/`):

> **spinf/gemma-4-12b-fp8** (default): Gemma 4 12B, FP8, one 24 GB card with fp8 tensor cores. Text, images, audio, video.

> **spinf/gemma-4-31b-fp8**: Gemma 4 31B, FP8, one 48 GB card. Text, images, video.

> **spinf/qwen3.8-27b-int4**: Qwen3.8-27B, GPTQ int4, one 24 GB card. Text, images, video.

> **spinf/pplx-decider-v1-27b-int4**: Perplexity pplx-decider-v1-27b, GPTQ int4, one 24 GB card. Text only, scores only, with its own prompts and packs.

Ampere cards (no fp8 tensor cores) run int8 weights (`w8a16`) instead of the calibrated `fp8s` scheme. Scores then depend slightly on how the batch is packed. The response system fingerprint says when two results are not comparable. With `fp8s`, a content's scores are bit-identical alone or packed with others.

A scored query template ends in `{?}`. Extraction slots on the same read are `{*}` (text), `{n}` (number), and `{$}` (amount). Prompt packs are named, calibrated question sets; official packs load by default from **spinf-prompts**. **spinf-serve packs** validates a folder or lists what a server would enable, without loading a model.

Also present: **parity** (GPU parity run against a recorded reference) and **calibrate** (fp8s scale calibration). Those are research commands forwarded to other modules.

The image `ghcr.io/spinfinc/spinf-serve` runs `spinf-serve serve` as its entrypoint. Mount a volume on `/root/.cache` so the Hub snapshot and compile caches survive restarts.

# PARAMETERS

**serve** [_MODEL_]
> Load a model and serve the public scoring API. _MODEL_ is a manifest id (default **spinf/gemma-4-12b-fp8**), an alias, or a Hub checkpoint path.

**score** _REQUEST.json_ [_MODEL_]
> Load the engine, score one `/v1/score` JSON file, print the public response on stdout. No HTTP server. The same engine and server flags as **serve** apply. Trusted limits apply to the file.

**packs validate** _FOLDER_
> Check a pack repository or folder (manifest, schema, lock, files). Prints a listing. Exit **1** on any problem.

**packs list**
> Print the packs a server with these sources would enable, and skipped ones with reasons. **--packs** _SOURCE_ (repeatable) is `github:<owner>/<repo>[@ref][#path]` or a folder. **--model** _ID_ filters to that served model. **--no-official** leaves the official repository out. **--allow-namespace** _NS_ (repeatable) serves a reserved namespace from any source. **--refresh** resolves GitHub refs again.

**--config** _FILE_
> TOML config with tables `[engine]`, `[server]`, `[features]`, and `[limits]`. Keys use underscores matching the flags. Also `SPINF-CONFIG`.

**--device** _ID_
> GPU (default `cuda:0`).

**--quant** _scheme_
> Quantization scheme. Default is automatic for the card. Choices: `fp8s`, `fp8`, `fp8row`, `w8a16`, `w8a8`, `bf16`, `f16`, `i8`. `f16` and `i8` are for int4 checkpoints.

**--model-dir** _DIR_
> Local snapshot directory instead of the Hub.

**--token-budget** _N_
> Packed tokens per forward pass (default **16384**).

**--max-tokens** _N_
> Largest single input (content plus its questions) the engine runs.

**--lm-head** _kind_
> Output precision of the lm head: `f32out` (default), `bf16`, or `fp32`.

**--no-media**
> Skip loading image and audio embedders, and disable media kinds.

**--no-compile**
> Skip `torch.compile` (debugging; 2 to 3 times slower).

**--warmup** _kind_
> Work before the server reports ready: `full` (default: every compile a request could pay, about 1.5 to 2 minutes after load on a 4090 with the 12B), `short`, or `none`.

**--stack-options** _KV_
> Research knobs of the model family as `key=value,key=value` (Qwen stack; none for Gemma).

**--host** _ADDR_
> Bind address (default `0.0.0.0`).

**--port** _N_
> TCP port (default **8000**).

**--token** _SECRET_
> Require `Authorization: Bearer` on every call. Without any token the server is open.

**--trusted-token** _SECRET_
> Token for trusted callers (per-call limits and features, engine-internal fields, `/v0/score`, `/v0/info`, `/v0/drain`). Also accepted as an access token.

**--queue** _N_
> Requests accepted while one is on the GPU (default **4**). Beyond it HTTP **429** (concurrency limit) with `Retry-After`.

**--max-body-bytes** _N_
> Maximum request body (default **2** MiB).

**--debug**
> Add packed tokens and engine internals to every response.

**--media** _KINDS_
> Comma-separated `image`, `audio`, `video` (default: all the model reads), or `none` for text only.

**--extraction** / **--no-extraction**
> Allow or refuse `{*}`, `{n}`, and `{$}` slots (default on).

**--generation** / **--no-generation**
> Allow or refuse `generate` on `{*}` slots (default on; off whenever extraction is off).

**--packs** _SOURCE_
> Extra pack source (repeatable): `github:<owner>/<repo>[@ref][#path]` or a folder.

**--no-official-packs**
> Do not load the official pack repository.

**--packs-allow-namespace** _NS_
> Serve this reserved namespace from any source (repeatable).

**--packs-refresh**
> Resolve GitHub pack refs again.

**--max-content-tokens** _N_
> Per input, media included (default **4096**).

**--max-query-tokens** _N_
> Filled template length (default **256**).

**--max-prompts-per-input** _N_
> Templates times combinations (default **10000**).

**--max-extractions-per-input** _N_
> Extraction slots per input (default **10**).

**--max-processed-tokens** _N_
> Per request: content, questions, floors, decode (default **2000000**).

**--max-options** _N_
> Answers per question (default **1000**).

**--max-option-tokens** _N_
> Tokens per scored option (default **5**).

**--max-frames** _N_
> Video frames per video part (default **1024**).

**--max-audio-seconds** _N_
> Seconds per audio part (default **600**).

**--max-image-pixels** _N_
> Pixels per image (default **50000000**).

# CONFIGURATION

Flags override `SPINF` environment variables, which override `--config` TOML, which override the model's manifest. Environment names are the flag names in upper case with a `SPINF` prefix. **--no-media** is the `SPINF` media variable set to `0`. **--trusted-token** is the engine-token variable. Extra Hub snapshot directories, extra model manifests, the official pack source, and the pack fetch cache (default under `~/.cache/spinf-serve/packs`) have matching `SPINF` variables. A GitHub token is used for private pack repositories. A Hugging Face token is optional for public `spinf/` models and raises Hub rate limits.

```
SPINF_DEVICE=cuda:0
SPINF_PORT=8000
SPINF_TOKEN=secret
SPINF_CONFIG=server.toml
SPINF_ENGINE_TOKEN=trusted
SPINF_MEDIA=0
```

Example `server.toml`:

```
[engine]
model = "spinf/gemma-4-12b-fp8"
quant = "fp8s"
[server]
port = 8010
token = "change-me"
[features]
media_kinds = ["image", "video"]
packs = ["github:acme/prompt-packs@v1.2", "./my-packs"]
[limits]
max_content_tokens = 8192
```

# CAVEATS

Needs Linux, CUDA 13, Python 3.12, one NVIDIA GPU (24 GB for the default 12B fp8 checkpoint), and `gcc` at first start. Ampere cards do not get bit-identical `fp8s` scores. Default bind is all interfaces with no token: set **--token** before exposing the port. Warmup `full` can take one to two minutes after the model loads; `/readyz` stays unready until that finishes. Several GPUs means several processes behind your own load balancer; a process never shares its GPU.

`pip install spinf-serve` without the `server` extra is the protocol and packs only (no GPU). Distro indexes may have no package; do not confuse this with unrelated `serve` tools.

Scoring long option strings is a poor fit (the option-token cap is a cost guard). Use extraction slots for anything longer than a label. The engine has been tested with content up to 64k tokens; raise **--max-content-tokens** and **--max-tokens** together. Long inputs run alone. Current models are less effective on them.

# HISTORY

**spinf-serve** 0.1 is the Apache 2.0 open-source engine behind the hosted spinf scoring API (spinf.com). It was published so the same bulk-classification API can run on a local 24 GB GPU. Gemma 4 and Qwen checkpoints used with the default manifests are Apache 2.0.

# SEE ALSO

[python](/man/python)(1), [pip](/man/pip)(1), [curl](/man/curl)(1), [docker](/man/docker)(1), [uvicorn](/man/uvicorn)(1), [vllm](/man/vllm)(1), [ollama](/man/ollama)(1), [hf](/man/hf)(1), [jeff-serve](/man/jeff-serve)(1), [janus](/man/janus)(1)

# RESOURCES

```[Source code](https://github.com/spinfinc/spinf-serve)```

```[Homepage](https://spinf.com/open-source)```

```[Documentation](https://github.com/spinfinc/spinf-serve/blob/main/docs/README.md)```

<!-- verified: 2026-10-31 -->
