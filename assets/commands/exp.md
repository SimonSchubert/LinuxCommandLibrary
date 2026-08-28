# TAGLINE

Local OpenAI-compatible model gateway and router built from agent traces

# TLDR

**Install** the PyPI package (binary name **exp**)

```pip install experiential```

Start the **local gateway** (first-run wizard when the root is empty)

```exp```

**Sign in** to Experiential Cloud and sync account models

```exp login```

Start the gateway **without** the interactive home screen

```exp run```

**Check** readiness and print the loopback URL without binding

```exp --check```

Build a project from an **OTLP** trace export, then fit a router

```exp build [support-agent] -t [traces.otel.jsonl] --source otlp```

```exp optimize router [support-agent]```

**Disable** anonymous product telemetry

```exp config telemetry disable```

# SYNOPSIS

**exp** [_options_]

**exp** **run** [_project_] [_options_]

**exp** **login** [**--root** _dir_]

**exp** **build** _project_ [**-t** _path_] [_options_]

**exp** **optimize** **router**|**model** _project_ [_options_]

**exp** **config** _subcommand_ ...

# PARAMETERS

**--root** _dir_
> Local **.exp** project root (default **.exp** in the current directory). Shared by every subcommand.

**--project** _name_
> With no subcommand: expose one frozen project as the gateway's project-backed alias.

**--policy** _id_
> Exact frozen policy used with **--project** (or **exp run --policy**). Requires a project.

**--port** _n_
> Loopback TCP port (default **8000**). The data plane binds **127.0.0.1** only.

**--check**
> Validate gateway readiness and exit without binding.

**--json**
> Versioned JSON receipt (or JSON error) instead of the branded banner.

**--non-interactive**
> Never open first-run prompts. An uninitialized gateway exits **2** with **gateway_not_initialized** and the exact next commands.

**--ghost**
> Compatibility flag for a project-backed alias: project journals stay off while gateway accounting stays on. Requires a project.

**--graceful-timeout** _seconds_
> Drain admitted work on shutdown (default **10**).

**--max-active-requests** _n_
> Concurrent admission cap (default **1024**).

**-h**, **--help**
> Show help. Each subcommand also accepts **--help**.

# COMMANDS

**run** [_project_]
> Start the local gateway directly. Optional _project_ becomes one project-backed alias. Same flags as the root command (**--root**, **--port**, **--check**, **--json**, **--non-interactive**, **--ghost**, **--policy**).

**login**
> Open the Experiential Cloud Platform browser approval flow, save the organization key, and synchronize hosted model identities into **.exp/models.toml**. If a browser cannot be opened, paste a key at the hidden prompt.

**build** _project_
> Build a grounded world model from a local trace export. Bare **exp build** _project_ (no **-t**) is the interactive wizard. Automation needs **-t**/**--traces** _path_. **--source** names the export format (default **otlp**; also **braintrust**, **chat-json**, **langfuse**, **langsmith**, **mastra**, **otel-genai**, **phoenix**, **posthog**). **--dry-run** prints preflight with no provider calls. **--yes** confirms an in-budget estimate. **--max-build-cost-usd** is the embedding spend ceiling (default **5.00**). Repeatable **--provider** skips the opening list during setup (**experiential-cloud**, **openai**, **anthropic**, **gemini**, **openrouter**, **openai-compatible**, **azure**, **bedrock**).

**optimize router** _project_
> Fit a frozen router from a completed build and verify held-out evidence.

**optimize model** _project_
> Preflight bounded managed Tinker SFT from routed interactions (optional extra **experiential[sft]**).

**config budget** [_usd_]
> Show or set the per-command cost ceiling (default **$50.00**). Stored in **.exp/settings.toml**.

**config telemetry** **status**|**enable**|**disable**
> Anonymous aggregate PostHog product telemetry (on by default). Never includes prompts, traces, paths, model names, or credentials.

**config providers**
> Author secret-free provider connections, aliases, and build roles (**world_model**, **judge**, **embedder**). Interactive setup can paste keys into the user-data store.

**config gateway** ...
> Explicit gateway authoring without optimizer roles: **init**, **status**, **provider**, **identity**, **alias**, **grant**, **key**, **usage**, plus caller helpers **call**, **models**, and **key check**. Use **--non-interactive --json** in scripts.

**config judge** **setup**|**calibrate**
> Set up or manually calibrate a project judge.

# DESCRIPTION

**exp** is the command-line interface of **Experiential** (PyPI package **experiential**). It starts a local OpenAI-compatible (and Anthropic Messages) model gateway on loopback, controls which identities may call which model aliases and how much they may spend, and can turn production agent traces into a fitted router or a fine-tuned model.

With no subcommand, an interactive terminal opens the branded home screen (**Run Gateway** is first). A non-interactive terminal starts the default gateway. First-run setup persists provider connections, creates one initial alias and identity, and prints a one-time virtual key as **EXP_GATEWAY_URL** and **EXP_GATEWAY_KEY** before readiness is checked, so the key remains available even if a provider route is not ready. Those names are used so an upstream **OPENAI_API_KEY** is not overwritten.

The compiled **exp-gateway-native** data plane serves Chat Completions, Responses, and Anthropic Messages. Startup makes no provider call. The gateway writes no prompts, responses, tool arguments, raw keys, or provider secrets to SQLite. **GET /usage** and **GET /usage.json** expose content-free counts, tokens, latency, and estimated cost.

Paid commands (**build**, **optimize router**, **optimize model**) share one cost-authorization policy: an estimate at or below 50% of the command budget runs automatically; up to the budget needs confirmation or **--yes**; above the budget fails closed unless an interactive override is given. **--yes** never raises the ceiling.

A hosted gateway with the same wire protocol is available at **https://api.experientiallabs.ai/v1**. The CLI can also load a fitted project router from Python (`import exp`).

# CONFIGURATION

**.exp/**
> Default project root (**--root**). Holds **settings.toml**, **models.toml**, gateway SQLite, and project artifacts.

**.exp/settings.toml**
> Telemetry preference and optional **maximum_cost_usd** command budget.

**.exp/models.toml**
> Secret-free provider connections and model aliases. Catalogs store an environment-variable **name**, never a raw key.

**~/.local/share/exp/auth.json**
> Linux user-data credential store (mode **0600**). Process environment values override the store without rewriting it. Bedrock uses the AWS credential chain.

# CAVEATS

Requires **Python 3.12+**. The console script is **exp**, which collides with other tools that have used that name (the old Expo CLI, now **expo**; DVC's **dvc exp**; unrelated PyPI packages). Install **experiential**, not a package named **exp**.

The gateway listens on **127.0.0.1** only. First-run virtual-key material is shown once; if it was not saved, issue a replacement with **exp config gateway key issue** _identity_ **--key-id** _key_ **--json**. Human key issuance on a non-terminal requires **--json** or **--output**.

Anonymous product telemetry is **enabled by default**; disable it with **exp config telemetry disable**. **build --dry-run** and exact completed-build replay make zero paid provider calls.

# HISTORY

**Experiential** is developed by **Experiential Labs** (Apache-2.0; copyright 2026). PyPI package version **0.6.1** as of 2026-08-28. The CLI is a Typer app whose help text is "Build grounded simulations, optimize model use, and serve routers locally."

# SEE ALSO

[llm](/man/llm)(1), [ollama](/man/ollama)(1), [aider](/man/aider)(1), [claude](/man/claude)(1), [curl](/man/curl)(1), [python](/man/python)(1)

# RESOURCES

```[Source code](https://github.com/experientiallabs/experiential)```

```[Homepage](https://www.experientiallabs.ai)```

```[Documentation](https://platform.experientiallabs.ai/docs)```

<!-- verified: 2026-08-28 -->
