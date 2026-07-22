# TAGLINE

RLM-based analyzer for AI agent execution traces

# TLDR

**Analyze a trace file** with a diagnostic prompt

```halo [traces.jsonl] -p "[Diagnose errors and suggest fixes]"```

**Use a specific model** for the analysis run

```halo [traces.jsonl] -p "[prompt]" --model [gpt-5.4-mini]```

**Point at an OpenAI-compatible provider**

```halo [traces.jsonl] -p "[prompt]" --base-url [https://openrouter.ai/api/v1]```

**Emit telemetry** for the HALO run itself

```halo [traces.jsonl] -p "[prompt]" --telemetry```

# SYNOPSIS

**halo** _TRACE_PATH_ **--prompt** _TEXT_ [_options_]

**halo** _TRACE_PATH_ **-p** _TEXT_ [_options_]

# DESCRIPTION

**halo** is the command-line front end for the HALO engine, a recursively structured trace analyzer built around **RLM** (Recursive Language Models). It ingests OpenTelemetry-compatible JSONL execution traces from agent harnesses, decomposes failures across many runs, and produces a report of systemic issues rather than overfitting to a single bad trace.

The CLI sends a user prompt plus the trace file to a root agent that can spawn subagents, summarize long contexts, and synthesize findings. Output is intended to feed back into coding agents such as **claude** or **cursor** so harness prompts, tools, and guardrails can be improved iteratively. A separate desktop app and hosted service exist, but **halo** is the local, scriptable entry point installed from the **halo-engine** Python package.

# PARAMETERS

**--prompt**, **-p** _TEXT_
> Required user prompt describing what to look for in the traces.

**--model**, **-m** _MODEL_
> Model used for root and subagent calls (default `gpt-5.4-mini`).

**--synthesis-model** _MODEL_
> Cheaper model for trace summarization (defaults to **--model**).

**--compaction-model** _MODEL_
> Cheaper model for context compaction (defaults to **--model**).

**--max-depth** _N_
> Maximum subagent recursion depth (default 2).

**--max-turns** _N_
> Maximum turns per agent (default 20).

**--max-parallel** _N_
> Maximum concurrent subagents (default 10).

**--base-url** _URL_
> OpenAI-compatible API base URL.

**--api-key** _KEY_
> Provider API key (falls back to **OPENAI_API_KEY**).

**--header**, **-H** _NAME:VALUE_
> Extra provider header; repeatable.

**--temperature** _N_
> Sampling temperature forwarded to the model.

**--max-output-tokens** _N_
> Maximum output tokens forwarded to the model.

**--telemetry**
> Emit OpenInference telemetry for HALO's own LLM and tool activity.

# CONFIGURATION

**OPENAI_API_KEY**
> Default credentials for the configured provider.

**OPENAI_BASE_URL**
> Default API base URL when **--base-url** is not set.

**CATALYST_OTLP_TOKEN**
> When **--telemetry** is enabled, upload spans to inference.net Catalyst over OTLP.

# CAVEATS

**halo** requires a valid API key and provider access for the chosen model. Trace files must be JSONL in an OpenTelemetry-compatible format produced by an integrated harness. Analysis cost scales with trace size, recursion depth, and model choice; using smaller models for synthesis and compaction is recommended on large runs.

# HISTORY

HALO was developed by **Context Labs** (inference.net) in 2026 as a methodology and engine for improving agent harnesses from production traces. The **halo** CLI ships with the open-source **halo-engine** package on PyPI.

# INSTALL

```nix: nix profile install nixpkgs#halo```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[claude](/man/claude)(1), [codex](/man/codex)(1), [jq](/man/jq)(1)

# RESOURCES

```[Source code](https://github.com/context-labs/HALO)```

```[Homepage](https://inference.net/products/halo)```

```[Documentation](https://docs.inference.net)```

<!-- verified: 2026-06-30 -->