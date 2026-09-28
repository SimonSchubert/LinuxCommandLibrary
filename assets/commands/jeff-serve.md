# TAGLINE

Serve a local Jeff decision model over HTTP

# TLDR

**Serve** a downloaded checkpoint (PyTorch, NVIDIA GPU or CPU)

```JEFF_CHECKPOINT=[checkpoints/jeff-0.8b] PORT=[8765] jeff-serve```

Serve with the **MLX** backend on Apple silicon (Qwen checkpoints only)

```JEFF_BACKEND=mlx JEFF_CHECKPOINT=[checkpoints/jeff-0.8b] PORT=[8765] jeff-serve```

Listen on **all interfaces** instead of localhost

```JEFF_HOST=[0.0.0.0] JEFF_CHECKPOINT=[checkpoints/jeff-0.8b] jeff-serve```

Force the **CPU** even when CUDA is available

```JEFF_DEVICE=[cpu] JEFF_CHECKPOINT=[checkpoints/jeff-0.8b] jeff-serve```

Require a **Bearer API key** on decision endpoints

```JEFF_API_KEY=[secret] JEFF_CHECKPOINT=[checkpoints/jeff-0.8b] jeff-serve```

**Download** a published 0.8B checkpoint from Hugging Face

```hf download [mstrasser/Jeff-Qwen3.5-0.8B] --local-dir [checkpoints/jeff-0.8b]```

Check whether the server is **ready**

```curl -s [localhost:8765]/health```

Ask a **choice** question and a **yes/no** question in one request

```curl -s [localhost:8765]/v1/systemone -H 'content-type: application/json' -d '{"model":"jeff-latest","state":"[the parcel arrived crushed]","questions":{"route":{"type":"choice","instructions":"[Which team?]","criteria":{"1":"[Refunds]","2":"[Damaged parcels]"}},"angry":{"type":"noul","instructions":"[Is the customer angry?]"}}}'```

# SYNOPSIS

**jeff-serve**

# DESCRIPTION

**jeff-serve** is the console script from the **firelex/jeff** Python package. It loads a Jeff checkpoint and starts a FastAPI app under **uvicorn** so local code can ask the model to pick among options. The request shape matches TypeSafe's **Jev** `/v1/systemone` API: a `state` description plus one or more `questions`. Jeff is an independent project and is not affiliated with TypeSafe.

The process takes **no command-line flags**. Bind address, port, checkpoint path, backend, device, and optional API key come from environment variables. Default bind is **127.0.0.1:8000**. After `uv sync` in a clone, the usual invocation is `uv run jeff-serve`. Python **3.12** or newer is required.

Each question is one of three types. **choice** picks one of up to **255** labelled options. **noul** is a yes/no (returned as a probability). **score** places the state on a scale you describe (2 to 10 points). Several independent questions in one request are answered together. The JSON response includes a probability per option, the chosen option, a confidence, and token usage. There is no generated free text to parse.

On **pytorch** (the default backend) the server accepts text and up to **4** PNG, JPEG, or WebP images as base64 data URLs. On **mlx** it is text only, and only Qwen checkpoints are supported. A playground HTML page is served at **/**. **GET /health** reports readiness, model name, checkpoint, whether authentication is enabled, and which modalities are available. **GET /v1/models** lists aliases (`jeff`, `jeff-latest`, and the loaded checkpoint name). **POST /v1/systemone** runs the decision.

The server answers one request at a time. A second overlapping call receives HTTP **529** with `Retry-After: 1`. If `JEFF_API_KEY` is set, `/v1/models` and `/v1/systemone` require `Authorization: Bearer` with that key. `/` and `/health` stay unauthenticated.

Published weights include **Jeff-Qwen3.5-0.8B**, **Jeff-Qwen3.5-2B**, and **Jeff-Gemma4-E2B** on Hugging Face under **mstrasser**. This command is unrelated to the **jeff** semantic-review CLI.

# CONFIGURATION

**JEFF_CHECKPOINT**
> Directory of the local checkpoint to load. Default `checkpoints/selected`. The directory must contain `decision_config.json`.

**JEFF_BACKEND**
> `pytorch` (default) or `mlx`. `mlx` uses Metal kernels on Apple silicon and is text-only. Any other value is an error.

**JEFF_DEVICE**
> For the PyTorch backend: `cuda`, `mps`, or `cpu`. Unset uses CUDA when present, otherwise the CPU. A device the machine does not have is an error rather than a silent fallback.

**JEFF_HOST**
> Bind address passed to uvicorn. Default `127.0.0.1`.

**PORT**
> TCP port passed to uvicorn. Default `8000`. The variable name is `PORT`, not `JEFF_PORT`.

**JEFF_API_KEY**
> When set, `/v1/models` and `/v1/systemone` require a matching Bearer token. Compared with `hmac.compare_digest`.

# CAVEATS

Jeff models are small classifiers. They return calibrated probabilities over the options you describe; they do not plan or generate explanations. Wording of options changes results substantially. The README documents English text only.

The package is not published on PyPI. Install from the GitHub repository with **uv** (`uv sync`, then `uv run jeff-serve`). Apple silicon MLX serving needs `uv sync --extra mac`. Dependencies include PyTorch, Transformers, FastAPI, and related ML stacks, so a first sync is large.

Checkpoints must already be on disk. `jeff-serve` does not download weights. MLX cannot serve the Gemma checkpoint. Image inputs are rejected on the MLX backend.

Default `PORT` is **8000**, while upstream examples often use **8765**. `JEFF_CHECKPOINT` defaults to `checkpoints/selected`, which is empty until you download or train a run into that path.

The HTTP API is Jev-compatible, not OpenAI-compatible. Tools that speak `/v1/chat/completions` will not work against **jeff-serve**.

# HISTORY

**jeff-serve** shipped with **Jeff** on GitHub in **September 2026**. The project fine-tunes Qwen3.5 (0.8B and 2B) and Gemma 4 E2B for one-forward-pass decisions, starting from the open **AutoJev** training recipe. Code is MIT; model weights are Apache 2.0.

# SEE ALSO

[curl](/man/curl)(1), [uv](/man/uv)(1), [python](/man/python)(1), [uvicorn](/man/uvicorn)(1), [hf](/man/hf)(1), [vllm](/man/vllm)(1), [ollama](/man/ollama)(1), [jevchat](/man/jevchat)(1)

# RESOURCES

```[Source code](https://github.com/firelex/jeff)```

<!-- verified: 2026-09-29 -->
