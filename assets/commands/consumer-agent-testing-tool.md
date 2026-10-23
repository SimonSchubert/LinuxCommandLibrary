# TAGLINE

Surrogate tester for how a consumer assistant uses your service

# TLDR

Check **setup** (no model requests)

```consumer-agent-testing-tool doctor```

Write a **local model config** (OpenRouter)

```consumer-agent-testing-tool init --provider [openrouter] --model [meta/muse-spark-open] --config [agent.yaml]```

Replay **scripted connector calls** with no model

```consumer-agent-testing-tool connector-run [scenario.yaml] --driver scripted --script [calls.json]```

Start a **loopback service**, then run the scenario

```consumer-agent-testing-tool connector-run [scenario.yaml] --driver scripted --script [calls.json] --start "[python -m myservice --port {port}]"```

Review an MCP catalog against **Muse connector guidelines** (no tool calls)

```consumer-agent-testing-tool check [url] --suite muse-guidelines```

**Scaffold** a scenario from a live catalog

```consumer-agent-testing-tool scaffold [url] --output [scenario.yaml]```

Show a sealed run's **report**

```consumer-agent-testing-tool report [runs/id]```

**Compare** two sealed runs

```consumer-agent-testing-tool diff [runs/baseline] [runs/candidate]```

List **surrogate targets** as JSON

```consumer-agent-testing-tool targets --json```

# SYNOPSIS

**consumer-agent-testing-tool** [**--development-extensions**] _command_ [_options_]

# DESCRIPTION

**consumer-agent-testing-tool** (CATT) is a local test host that approximates how a consumer assistant talks to your service. It drives an MCP server, an embedded MCP app, a website, or a mapped HTTP API, then checks what the service actually did, seals the evidence, and compares runs. The package installs the console script **consumer-agent-testing-tool**. Package version **0.2.1**. Python **3.12** or newer is required. From a clone, **uv run consumer-agent-testing-tool** is the documented invocation.

**Muse** is the default surrogate target. **Instinct** is also supported on the connector lane. Both share a native/CLI testing contract (routing, memory, payments, browser/HTTP tasks, scheduling). The inference model is a separate choice from the assistant being emulated. A passing test does not certify compatibility with Muse, Instinct, or any hosted assistant. Each Muse-specific behavior is labeled `documented`, `unofficial`, `assumed`, or `unknown`.

Scripted trials need no model account. Agent trials need a model profile from **init** and an API key in the environment. Sealed runs live under `runs/`. Share **export** output, not the run directory: `private/` holds host-private values.

# COMMANDS

**targets**
> List supported surrogate targets and their testing contract. **--json** prints versioned capabilities.

**init**
> Write a local configuration. No Muse account is required. **--provider** is a live adapter (`openrouter`, `meta`, `bedrock`, `local-glimmer`) or `none`. Template-only providers (`openai`, `anthropic`, `gemini`, `azure-openai`, `vertex-gemini`, `openai-compatible`) need **--development-extensions** before **init**. **--model** (or Azure **--deployment**) is required unless the provider is `none`. **--config** defaults to `consumer-agent-testing-tool.yaml` and is refused if the file already exists. **--routing-provider** pins the OpenRouter provider slug (default `together`). **--allow-training-on-prompts** opts in to a contributor-mode model ID. Also **--target**, **--region**, **--auth**, **--aws-profile**, **--base-url**, **--endpoint**, **--api-version**, **--api**, **--project**, **--key-env**. Stages API and browser example scenarios beside the config.

**doctor**
> Check Node, Playwright Chromium, and optional protocol tooling. Makes no model requests unless **--model-preflight** is set (those requests may incur charges).

**inspect** _target_
> Inspect a configured service. Default target is `booking-service`.

**check** [_target_]
> Check a service contract or readiness. **--suite** is `contract` (default), `static`, `surrogate`, `muse-guidelines`, `poppy`, or `gadget`. **surrogate** reviews the catalog and projection for Muse or Instinct without calling tools (**--emulation-target**, **--projection**). **muse-guidelines** is a documented constraint check, not admission; **--drift-check** only compares the live guidelines hash. **poppy** is Personal Agent Protocol draft 0.1. **gadget** checks a `link.register` document against the official Gadget SDK limits and opens no connection. **--endpoint**, **--manifest**, connector auth flags, **--junit**, **--summary-json**.

**run** _scenarios_
> Run API or browser trials. **--surface** is `api-tools` (default) or `browser`. **--trials** defaults to 10 (values below 10 are smoke tests). **--resume** continues one original trial with **--trials 1**. **--resumable** retains private state for an explicit continuation. **--decision-contract** names a fixed sample contract declared before collecting trials.

**connector-run** _scenario_
> Test a service through a Muse or Instinct surrogate. **--driver scripted** replays **--script** with no model. **--driver agent** (default) calls the configured model. **--emulation-target** is `muse` or `instinct`. **--projection** is `native`, `cli`, or `muse-cli`. **--exposure** is `in-prompt` or `search-only`. **--client-profile** is `generic-sdk` or `muse-template-unofficial-2026-10`. **--output-schema** is `lenient` (default) or `strict`. **--trials** _N_ runs independent trials and reports pass^k. **--start** _COMMAND_ starts a service without a shell (`{port}`, `${PORT}`, and `PORT` share a free loopback port), waits for HTTP, then stops the process group. **--ready-url**, **--ready-timeout** (default 30 s). **--set** _NAME=VALUE_ fills `${NAME}` in scenario URLs (repeatable). **--junit**, **--summary-json**. Sealed output defaults to `runs/`.

**scaffold** [_endpoint_]
> Read an MCP catalog without calling service tools, or turn a sealed agent run into scripted calls (**--from-run**). **--output** is required. Replace every `TODO(scaffold)` before running. **--name**, **--emulation-target**. One Streamable HTTP connector; no OpenAPI input.

**surface-run** _scenario_
> Render an embedded MCP app in Chromium. **--driver** is `scripted` (default) or `agent`. **--resume**, **--secrets-file**, **--replies**, **--tooling** (default `tooling/payment-ui`). Generic MCP Apps host, not Muse.

**browse** _policy_
> Act on accessibility snapshots under request rules. **--actions**, **--decisions**, **--driver**, **--goal**. Takeover pauses the run (exit 3); the CLI has no handback. Native Chromium, without OS isolation. Packaged browser scenarios use the reservation portal.

**browser-diagnostics** _run_
> Verify private browser captures. **--trace-command** prints the local Playwright Trace Viewer command.

**report** _run_
> Show or rebuild a run's report. **--format** is `html` (default) or `json`.

**export** _run_
> Export a run with private values redacted. **--output** defaults to `exports/<run-id>`. Refuses (exit 2) when a staged file still holds a registered secret.

**replay** _run_
> Verified playback, isolated contract replay, or locked rerun. **--mode** is `playback` (default), `contract`, or `rerun`. Playback never substitutes a live request.

**diff** _baseline_ _candidate_
> Compare sealed runs. Exit **0** no outcome regression, **1** outcome regression, **3** not comparable. **--treatment** declares an intentional change. **--ignore** _POINTER_ excludes a JSON pointer under `/outcomes`, `/capabilities`, or `/milestones` (repeatable). Compare runs from the same checkout: a package-source change counts as a run-lock change.

**release-audit**
> Check whether the evidence qualifies a release. **--ledger** defaults to `release/release-gates.json` when recorded, else the committed policy `docs/release-gates.json` (unverified gates).

# PARAMETERS

**--development-extensions**
> Enable experiments outside the supported release. Must appear before the subcommand. Unlocks **calibrate**, **worker**, `run --surface cli-skill`, and template-only **init** providers. Requires the `development-extensions` dependency group.

**--config** _file_
> Settings file (default `consumer-agent-testing-tool.yaml` on commands that take it).

**--model-profile** _name_
> Model profile for agent drivers (default: `defaults.model_profile`).

**--interface-profile** _name_
> Interface profile. **--profile** is a legacy alias.

**--offline**
> Offline readiness mode. On Linux this reports unsupported rather than running unconfined (macOS Seatbelt).

**--output** _dir_
> Where sealed runs are written (default `runs` on commands that take it).

**--emulation-target** {_muse_|_instinct_}
> Assistant host being emulated. Separate from the model provider.

**--auth-from** _scenario_
> Link with the auth block of a connector-v1 scenario's first connector.

**--auth-env** _VAR_
> Environment variable that holds the connector's API key.

**--junit** _file_
> Also write a JUnit XML report (one testsuite per trial, one testcase per check). Blocked checks are skipped.

**--summary-json** _file_
> Also write a machine-readable summary (`schemas/summary-v1.schema.json`). `-` writes it to stdout and moves other output to stderr.

# CONFIGURATION

**consumer-agent-testing-tool.yaml**
> Default local settings file. Git-ignored. **init** writes YAML, or JSON when the path ends in `.json`. Schema version **1**. Top-level keys: `execution`, `model_profiles`, `targets`, `defaults`. Target credentials must use a different environment variable from inference credentials.

A profile **init** writes for OpenRouter looks like:

```
model_profiles:
  openrouter-dev:
    provider: openrouter
    api: chat-completions
    model_id: meta/muse-spark-open
    auth:
      mode: api_key
      env: OPENROUTER_API_KEY
    routing:
      only: [together]
      allow_fallbacks: false
      require_parameters: true
      data_collection: deny
      zdr: true
defaults:
  model_profile: openrouter-dev
```

Live adapters in the supported release: **openrouter**, **meta**, **bedrock**, **local-glimmer**. Profiles are labeled `specified/unverified` until live evidence marks them `supported`. Contributor-mode model IDs (the token `contributor`) require **--allow-training-on-prompts** at **init**.

Connector scenarios are YAML (`connector-v1`). Scripted calls are a JSON list of tool-call steps, optional `{"idle": true}` pauses, and a final answer. Replace `TODO(scaffold)` placeholders before **connector-run**.

# ENVIRONMENT

**OPENROUTER_API_KEY**
> OpenRouter agent runs. Requests require zero data retention by default (`routing.zdr: true`), pin one provider, and disable fallbacks.

**MODEL_API_KEY**, **META_API_KEY**
> Meta Model API. If both are set, they must agree. **--key-env** selects a single name instead.

**AWS_BEARER_TOKEN_BEDROCK**
> Bedrock bearer auth. **--auth aws_credentials** uses an AWS profile instead.

Keep keys out of scenarios and shared evidence. The provider boundary refuses any model request that still contains a registered credential.

# EXIT CODES

**connector-run** (and the same 0/1/2/3 shape on several other commands):

**0**
> Completed: every required check passed.

**1**
> Failed: a check failed, the answer made a false claim, or an agent limit was reached.

**2**
> Setup, harness, or reporting error. Nothing about the connector is concluded.

**3**
> Blocked or unsupported: an uncertain write to reconcile, an unobservable check, or a client-profile limit.

With **--trials** _N_, precedence is: **2** if any trial's evidence is not shareable, else **1** if any trial failed, else **2** if any trial hit a setup error, else **3** if any was blocked, else **0**.

**check --suite muse-guidelines** with **--drift-check**: **0** unchanged, **1** drifted, **2** not fetched.

**diff**: **0** comparable with no outcome regression, **1** outcome regression, **3** not comparable.

# CAVEATS

Alpha software. The project is not affiliated with Meta, Instinct, OpenAI, or Anthropic.

Recorded release evidence covers macOS. Linux commands match CI but have not been qualified the same way. Three features rely on macOS Seatbelt (`sandbox-exec`) and report unsupported or blocked on Linux: **--offline** readiness, the network-denied validator workers behind **run --surface api-tools**, and the local-model memory profile. The connector lane, scripted runs, readiness checks, and Docker-backed stdio targets do not depend on it.

Browser and MCP Apps lanes need Node.js 20+ and Playwright Chromium. Agent drivers may incur model charges. Streaming is not supported on the OpenRouter or Meta adapters.

**--development-extensions** paths (workers, isolation, local Glimmer, generated OpenAPI, `run --surface cli-skill`) are outside the supported release. The supported way to give an agent a CLI over an MCP server is **connector-run --projection muse-cli**.

# HISTORY

Published by **Coverage Cat, Inc.** as **Consumer Agent Testing Tool (CATT)**. First public release **0.1.0** on 2026-10-20. **0.2.0** / **0.2.1** (2026-10-22) added Instinct as a second supported surrogate target alongside Muse. Written in Python (argparse) on top of Inspect. MIT licensed; the Coverage Cat and CATT names and the logo are excluded (see `TRADEMARKS.md`).

# SEE ALSO

[uv](/man/uv)(1), [pytest](/man/pytest)(1), [mcp-probe](/man/mcp-probe)(1), [jevals](/man/jevals)(1), [playwright](/man/playwright)(1), [python3](/man/python3)(1)

# RESOURCES

```[Source code](https://github.com/Coverage-Cat/consumer-agent-testing-tool)```

```[Documentation](https://github.com/Coverage-Cat/consumer-agent-testing-tool/blob/main/docs/README.md)```

<!-- verified: 2026-10-23 -->
