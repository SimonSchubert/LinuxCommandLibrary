# TAGLINE

Serve pretrained Jeffy text classifiers over HTTP

# TLDR

**Start** the playground and HTTP API (default port 8400)

```jeffy-serve```

Run via **uvx** from the published package

```uvx --python 3.12 --from jeffy-classify jeffy-serve```

Serve **custom-trained** heads from a directory

```JEFFY_PACK_DIR=[my_models] jeffy-serve```

Listen on a **different port**

```JEFFY_PORT=[9000] jeffy-serve```

Force the encoder onto a **specific device**

```JEFFY_DEVICE=[cpu] jeffy-serve```

Check whether the server is **ready**

```curl -s [localhost:8400]/health```

**Classify** text with a named head

```curl -s -X POST [localhost:8400]/v1/predict -H 'content-type: application/json' -d '{"text":"[I was charged twice for the same transaction]","task":"[banking77]"}'```

**List** shipped classifiers

```curl -s [localhost:8400]/v1/capabilities```

# SYNOPSIS

**jeffy-serve**

# DESCRIPTION

**jeffy-serve** is a console script from the **jeffy-classify** Python package (**nicobrenner/jeffy**). It loads a pack of pretrained logistic-regression heads on a frozen **BAAI/bge-large-en-v1.5** text encoder and starts a **FastAPI** app under **uvicorn**. Each request names a task (`banking77`, `sms_spam`, `ag_news`, and so on) and gets back a label, confidence, and per-class probabilities. There is no generated free text.

The process takes **no command-line flags**. Bind port, encoder device, model-pack directory, and analytics log path come from environment variables. Default listen address is **0.0.0.0:8400**. After `pip install jeffy-classify` (Python **3.11** or newer), invoke `jeffy-serve`. The README also shows `uvx --python 3.12 --from jeffy-classify jeffy-serve`.

The wheel ships **14** classifiers: 13 text heads plus **doom_fire**, a 24-feature game-state classifier. Text heads cover banking intent, SMS spam, news topic, Wikipedia category, movie-review sentiment, voice-assistant intent, tweet sentiment/emotion/offense, SNLI, and similar tasks. The first encoder load downloads about **1.2 GB** (cached afterward). Runtime memory is around **2 GB**.

**GET /** serves an HTML playground. **GET /docs** is the FastAPI schema. **GET /health** reports readiness, capability count, and encoder identity. **GET /v1/capabilities** lists every loaded head; **GET /v1/capabilities/{task_id}** returns one manifest plus an example request. **POST /v1/predict** classifies one `text` string or a numeric `features` vector. **POST /v1/predict/batch** classifies a list of texts. **POST /v1/systemone** is a Jeff-shaped decision endpoint that requires an explicit `capability` field (and an optional `label_map` when the caller's option keys differ from the head's labels). **GET /v1/analytics** dumps request logs. **WebSocket /v1/doom/stream** runs a live VizDoom demo when VizDoom is installed.

This command is unrelated to **jeff-serve** (firelex/jeff) and to the **jeff** semantic-review CLI.

# CONFIGURATION

**JEFFY_PORT**
> TCP port passed to uvicorn. Default `8400`.

**JEFFY_DEVICE**
> Device for the sentence-transformers encoder: `cpu` (default), `cuda`, or `mps`.

**JEFFY_PACK_DIR**
> Directory of model-pack artifacts. Unset uses the pack bundled in the installed package, then `data/model_pack` in the working directory.

**JEFFY_ANALYTICS_FILE**
> JSONL request log. Default `~/.jeffy-analytics.jsonl`.

# CAVEATS

The server binds **0.0.0.0**, so it is reachable on every interface of the machine, not only loopback. Put a reverse proxy or firewall in front of it if the host is not isolated.

There is no zero-shot or automatic task routing: an unknown `task` is an error. Probabilities are uncalibrated. SNLI and tweet sentiment heads are weaker than task-specific models. Several source datasets are academic or non-commercial; see `ATTRIBUTION.md` in the repository.

Custom heads saved by **jeffy-train** may include a joblib pickle. Load those artifacts only from trusted sources. Bundled pretrained files use numpy `.npz`.

The live Doom playground needs **VizDoom** (and related extras) in addition to the core package. Without it, `/v1/doom/stream` fails while the rest of the API still works.

`jeffy-serve` does not parse argv, so extra flags including `--help` are ignored and the server still starts.

# HISTORY

**jeffy-serve** shipped with **Jeffy** on GitHub in **October 2026** (package **jeffy-classify**, MIT license, author Nico Brenner). The project is alpha.

# SEE ALSO

[jeffy-train](/man/jeffy-train)(1), [jeffy-build](/man/jeffy-build)(1), [jeffy-evaluate](/man/jeffy-evaluate)(1), [jeff-serve](/man/jeff-serve)(1), [curl](/man/curl)(1), [uv](/man/uv)(1), [uvx](/man/uvx)(1), [python](/man/python)(1), [uvicorn](/man/uvicorn)(1), [pip](/man/pip)(1)

# RESOURCES

```[Source code](https://github.com/nicobrenner/jeffy)```

<!-- verified: 2026-10-04 -->
