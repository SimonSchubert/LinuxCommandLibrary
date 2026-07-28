# TAGLINE

World Model Optimizer CLI for routing, distilling, and serving models

# TLDR

Install and **configure providers**

```pip install world-model-optimizer```

```wmo providers set```

**Build** a model from agent traces

```wmo build --file [traces.jsonl] --name [my-model]```

**Serve** a tuned router/model

```wmo serve --name [my-model]```

**Log in** to the hosted platform

```wmo login```

**Run** a hosted agent or world model

```wmo run [agent-id]```

# SYNOPSIS

**wmo** _command_ [_options_]

# PARAMETERS

**providers set**
> Register model providers and candidates in `.wmo/pool.toml`

**build** **--file** _traces_ **--name** _name_
> Build a world model / routing setup from OTel or agent traces

**optimize**
> Subcommands for route sweep/fit/report, distill, harness, and pin

**serve** **--name** _name_
> Serve an endpoint that routes between frontier and smaller models

**login**
> Authenticate against the Experiential Labs hosted platform

**run** _id_
> Run a hosted world model or agent harness

**config telemetry** {_enable_|_disable_|_status_}
> Control anonymous usage telemetry

**eval**
> Evaluate harnesses/tasks (optional E2B backend)

# DESCRIPTION

**wmo** (World Model Optimizer) turns collected agent traces into smaller open models and cost-aware routers. It can distill via external APIs (e.g. Tinker), fit routing policies on held-out traces, and serve a local endpoint that keeps frontier quality while cutting inference cost.

The project also ships world-model simulation APIs for closed-loop agent testing and optional E2B sandbox backends for harness optimization. Local state lives under `.wmo/`.

# CAVEATS

Requires Python packaging (`pip install world-model-optimizer`) and provider API keys for most optimize/serve workflows. Hosted features need `wmo login`. Telemetry is on by default; disable with `wmo config telemetry disable` or `DO_NOT_TRACK=1` / `WMO_TELEMETRY=0`.

# HISTORY

Open-source CLI from **Experiential Labs** for continual improvement of agent models from production traces.

# SEE ALSO

[pip](/man/pip)(1), [python](/man/python)(1)

# RESOURCES

```[Source code](https://github.com/experientiallabs/world-model-optimizer)```

```[Homepage](https://platform.experientiallabs.ai)```

<!-- verified: 2026-07-28 -->
