# TAGLINE

OpenAI- and Anthropic-compatible HTTP server for NInfer artifacts

# TLDR

Serve **Qwen3.8-Flash-Next** on two 16 GB GPUs (capy-flash profile)

```ninfer-serve [model.ninfer] --profile flash-next --model-id capy-flash```

Serve **Qwen3.8-27B** with Vision and a host KV tier

```ninfer-serve [model.ninfer] --profile 27b --model-id [qwen3.8-27b]```

Bind a **host and port**, require an API key

```ninfer-serve [model.ninfer] --host [127.0.0.1] --port [8080] --api-key [secret]```

Check that the **engine is ready**

```curl http://127.0.0.1:8080/health```

Send an **OpenAI-compatible** chat request

```curl http://127.0.0.1:8080/v1/chat/completions -H "Content-Type: application/json" -d '{"model":"capy-flash","messages":[{"role":"user","content":"[What is 17*23?]"}]}'```

**Release launcher** after `install.sh` (same profile as **--profile flash-next**)

```~/capy-flash/current/serve-flash-next.sh [~/capy-flash/models/flash-next/qwen3_8_flash_next_nvfp4_idxgdnq8.ninfer]```

Print **usage**

```ninfer-serve --help```

# SYNOPSIS

**ninfer-serve** _model.ninfer_ [**--profile** **flash-next**|**27b**] [_options_]

**ninfer-serve** {**-h**|**--help**}

# DESCRIPTION

**ninfer-serve** loads one v3 `.ninfer` artifact into a resident NInfer Engine and exposes HTTP APIs compatible with OpenAI Chat Completions, OpenAI Responses, and Anthropic Messages. It is the server binary of **capy-flash** (formerly ninfer-tp2).

Default bind is **127.0.0.1:8080**. **GET /health** returns `{"status":"ok"}` while the engine can accept work and HTTP 503 after a permanent engine failure. Generation paths include **POST /v1/chat/completions**, **POST /v1/responses**, and **POST /v1/messages**. **GET /v1/models** reports the public model id (artifact `metadata.name`, or **--model-id**).

**--profile** expands a tested two-GPU flag set before the rest of the command line; later flags override it. **flash-next** is `--tp 2 --devices 0,1 --kv-dtype int8 --elastic --max-context 262144 --max-concurrency 1 --spec mtp --draft-tokens 3`. **27b** is `--tp 2 --devices 0,1 --kv-dtype int8 --max-context 196608 --device-state-slots 4 --max-concurrency 1 --spec mtp --draft-tokens 3 --vision --vision-device 0 --max-vision-tokens 4096 --host-state-slots 8 --host-kv-mib 8192`.

**--elastic** (Flash-Next) grows KV on demand and can lend unused KV pages to the CPU expert-slot cache. Routed experts that do not fit in VRAM live in page-locked host RAM and run on AVX-512; the server refuses to start without about **70 GiB** free (`NINFER_RAM_GUARD=0` skips that check). An engine-wide failure stops listening and **exits 2** so a supervisor can reload the model (startup errors exit 1).

# PARAMETERS

**--profile** **flash-next**|**27b**
> Insert the named two-GPU flag set after the artifact path. Other flags override it.

**--host** _H_
> Listen address (default **127.0.0.1**).

**--port** _N_
> TCP port (default **8080**).

**--api-key** _KEY_
> Require this value as an OpenAI bearer token or Anthropic `x-api-key`. **GET /health** stays unauthenticated.

**--model-id** _ID_
> Public model name in `/v1/models` and request `model` fields. Default is the artifact name.

**--max-context** _N_
> Logical context ceiling (default **8192**).

**--kv-capacity** _N_|**auto**
> Shared Main Text KV pool. Omitted, it follows **--max-context**.

**--max-concurrency** _N_
> Admitted requests, **1..8** (default **1**).

**--tp** **1**|**2** / **--devices** _A,B_ / **--device** _N_
> Tensor parallel. **--tp 2** requires **--devices**.

**--kv-dtype** **bf16**|**int8**|**fp8**|**nvfp4**|**k8v4**
> KV-cache storage (default **bf16**).

**--elastic**
> On-demand KV plus expert-slot lending (Qwen3.8-Flash-Next). **--kv-grow** _N_ is the grow step (default **8192** tokens). **--kv-budget-gib** _G_ caps one request's KV.

**--spec** **mtp**|**dflash**|**dflash2** / **--draft-tokens** _N_ / **--lm-head-draft**
> Speculative decoding. Off when **--spec** is omitted.

**--vision** / **--no-vision** / **--vision-device** _N_ / **--max-vision-tokens** _N_
> Media input. Off by default. **--no-vision** clears a profile's Vision flags.

**--kv-lease-window** _N_
> Device KV reserved as prompt plus _N_ output tokens, grown as the answer grows (default **4096**). **0** reserves the request's full `max_tokens` at admission.

**--host-state-slots** _N_ / **--host-kv-mib** _N_
> Pinned host checkpoint and KV tiers. At **--tp 2** both default to **0** unless set (**--profile 27b** turns them on).

**--cors**
> Permissive browser CORS headers (off by default).

**--no-thinking** / **--preserve-thinking** / **--default-max-tokens** _N_ / **--default-thinking-budget** _N_
> Request defaults for thinking mode and omitted output limits.

**--greedy** / **--temperature** _F_ / **--top-p** _F_ / **--top-k** _N_ / **--seed** _N_
> Process-level sampler overrides. Request fields override these.

**--log-level** _level_
> stderr verbosity (default **info**).

# CONFIGURATION

Release wrappers `serve-flash-next.sh` and `serve-tp2.sh` exec **ninfer-serve** with a profile. They honor **NINFER_HOST**, **NINFER_PORT**, **NINFER_DEVICES**, **NINFER_MAX_CONTEXT**, **NINFER_MODEL_ID**, and **NINFER_VISION**. Extra flags after the artifact path are appended.

**NINFER_CUDA_SYNC**
> CUDA wait policy: **spin** (default), **blocking**, **yield**, or **auto**. Shared with **ninfer**.

**NINFER_RAM_GUARD**
> Set to **0** to start even when Flash-Next's page-locked expert allocation does not fit in free RAM.

**NINFER_HOST_TIER_RAM_GUARD**
> Set to **0** to skip the host KV/state RAM check.

# CAVEATS

Linux x86_64, CUDA 13.1, NVIDIA driver R580 or newer. Flash-Next needs two sm_120 16 GB GPUs, AVX-512 (F/BW/VL/VNNI), and about 70 GiB free RAM. Default listen is loopback; do not expose the port without **--api-key**. **GET /health** is never authenticated. After an engine-wide failure the process exits **2**; run it under systemd `Restart=on-failure` or llama-swap. Stored OpenAI Responses live only in this process. Output can vary run to run when experts move between GPU and CPU. Install from the capy-flash release tarball or build from source.

# HISTORY

**capy-flash** is Neroued/ninfer's two-GPU tensor-parallel fork, renamed from **ninfer-tp2** at v0.5.0. **ninfer-serve** is `apps/serve`. Status **v0.5.4** (2026-10-16). Apache License 2.0.

# SEE ALSO

[ninfer](/man/ninfer)(1), [ninfer-perplexity](/man/ninfer-perplexity)(1), [vllm](/man/vllm)(1), [ollama](/man/ollama)(1), [llama-cli](/man/llama-cli)(1), [llama.cpp](/man/llama.cpp)(1), [janus](/man/janus)(1), [koboldcpp](/man/koboldcpp)(1), [curl](/man/curl)(1), [nvidia-smi](/man/nvidia-smi)(1)

# RESOURCES

```[Source code](https://github.com/ValerioDolci/capy-flash)```

```[Documentation](https://github.com/ValerioDolci/capy-flash/blob/main/docs/serving.md)```

<!-- verified: 2026-10-17 -->
