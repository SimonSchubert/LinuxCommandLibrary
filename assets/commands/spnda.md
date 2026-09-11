# TAGLINE

LLM uncertainty guardrail and OpenAI-compatible proxy gateway

# TLDR

**Evaluate** candidate answers and print a JSON risk receipt

```spnda eval "42" "42.0" "42"```

Evaluate against **retrieved context** (RAG grounding)

```spnda eval --context "[The cluster runs in us-east-1.]" "us-east-1" "eu-west-3" "us-east-1"```

**Proxy** an OpenAI-compatible LLM and inject uncertainty headers

```spnda serve --upstream [http://localhost:11434/v1] --port [8080]```

Reject high-uncertainty replies with **HTTP 422**

```spnda serve --upstream [https://api.openai.com/v1] --block --threshold [0.35] --k [3]```

**Benchmark** the native evaluation kernel

```spnda bench --iterations [200000]```

Print **version** and engine details

```spnda version```

# SYNOPSIS

**spnda** **serve** [**--port** _port_] [**--upstream** _url_] [**--threshold** _n_] [**--block**] [**--k** _n_]

**spnda** **eval** [_samples_...] [**--context** _text_] [**--threshold** _n_]

**spnda** **bench** [**--iterations** _n_]

**spnda** **version**

# PARAMETERS

**serve**
> Start an OpenAI-compatible reverse proxy. Completions are forwarded to **--upstream**, sampled **K** times when the client requested **n=1**, scored for lexical consensus, then returned with **X-Spanda-*** headers (and an audit object on the JSON body).

**--port** _port_
> Local listen port. Default **8080**. Binds **0.0.0.0**.

**--upstream** _url_
> Base URL of the upstream OpenAI-compatible API (OpenAI, Ollama, vLLM, Groq, and similar). Default is the OpenAI public API.

**--threshold** _n_
> **R_sc** uncertainty cutoff in the range 0..1. Default **0.35**. Higher values are more permissive.

**--block**
> When a reply is scored unsafe, return **HTTP 422** instead of forwarding it. Without this flag the gateway still injects headers and audit fields.

**--k** _n_
> Number of completion paths to sample when the client sent **n=1**. Default **3**. Used only for non-streaming chat/completions.

**eval** _samples_...
> Score one or more candidate strings and print a JSON receipt (risk score, dominant answer, decision, safety flag). Needs at least one sample.

**--context** _text_
> Optional grounding text. When set, unanimous but ungrounded answers can be flagged as mode-collapse risk rather than consensus.

**bench**
> Time the native mathematical kernel. Present on the compiled Rust binary; the pure-Python CLI does not implement this subcommand.

**--iterations** _n_
> Benchmark loop count. Default **100000** on the Rust binary.

**version**
> Print package version and a short description of the engine.

**--python**
> Python installer only: skip exec of a sibling native **spnda** binary and keep the stdlib gateway.

# DESCRIPTION

**spnda** is the command-line entry point for Spanda, an epistemic-uncertainty engine for large language model outputs. It clusters sampled answers by normalized exact match, computes a combined risk score **R_sc** from Shannon entropy and modal dominance, and classifies the result (consensus, divergence, or suspected mode collapse).

The same binary can sit in front of any OpenAI-compatible server as **spnda serve**. For each non-streaming chat or completions request it may raise **n** to **K**, call the upstream, score the candidate texts, collapse the response back to the dominant answer when the client asked for a single choice, and attach telemetry:

> **X-Spanda-Rsc**, **X-Spanda-Decision**, **X-Spanda-Safe**, **X-Spanda-Latency-Ms** (Python) or **X-Spanda-Latency-Us** (native), plus Prometheus **GET /metrics**, Kubernetes **GET /healthz** and **GET /readyz**.

**spnda eval** runs the same kernel on strings you already have, without a network hop. Install the PyPI package **spnda** (`import spanda`) for the Python CLI and SDK, or build the **spnda** binary from the Rust crate **spanda-core**. When a compiled binary is found next to the Python package, the Python wrapper execs it unless **--python** is passed.

# CONFIGURATION

**SPANDA_UPSTREAM**
> Upstream LLM base URL. Default **https://api.openai.com/v1** in the Python gateway.

**SPANDA_PORT**
> Listen port for **serve**. Default **8080**.

**SPANDA_THRESHOLD**
> **R_sc** cutoff. Default **0.35**.

**SPANDA_BLOCK_MODE**
> Set to **1** to reject unsafe completions with HTTP 422.

**SPANDA_DEFAULT_K**
> Sample count when the client sends **n=1**. Default **3**.

# CAVEATS

The score is lexical, not semantic. It is intended for structured answers (math, code, tool arguments, short factual extraction), not free-form prose where paraphrases are expected. On large ungrounded models, identical wrong answers can look like high-confidence consensus; pass **--context** or retrieval text if that failure mode matters.

**serve** listens on all interfaces. The Python package is MIT; the compiled Rust gateway is Business Source License 1.1 and is not a drop-in substitute for a neural NLI judge. **bench** exists only on the native binary. Upstream API keys still have to be supplied by the client (the proxy forwards Authorization).

# HISTORY

**Spanda** was written by **Bhupen Nayak** at **BRHMN Labs**. It implements exact-match normalized entropy as a CPU-only stand-in for neural Semantic Entropy clustering. Version **0.3.0** ships the **spnda** CLI (Python console script and Rust binary) together with a Python SDK. A companion write-up is archived at DOI **10.5281/zenodo.22233648**.

# SEE ALSO

[ollama](/man/ollama)(1), [vllm](/man/vllm)(1), [openai](/man/openai)(1), [aichat](/man/aichat)(1), [llm](/man/llm)(1), [curl](/man/curl)(1)

# RESOURCES

```[Source code](https://github.com/Adarshent/Spnda)```

<!-- verified: 2026-09-12 -->
