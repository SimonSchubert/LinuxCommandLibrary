# TAGLINE

Agent evals and guardrails in one typed decision request

# TLDR

**List** built-in evals

```jevals list```

List evals in one **category**

```jevals list --category [agent]```

**Describe** an eval's questions

```jevals describe [grounded]```

Score a **JSONL dataset** of traces

```jevals run [traces.jsonl] --evals [agent.tool_choice,agent.grounded]```

Write per-trace results and show **failures**

```jevals run [traces.jsonl] --evals [agent.grounded] --out [results.jsonl] --show-failures [10]```

Evaluate **one sample** (exit 1 if it failed)

```jevals check [sample.json] --evals [agent.grounded,security.phi]```

**Gate** one sample (exit 0 allow, 2 escalate, 3 block)

```jevals gate [sample.json] --evals [evals/tool_call_risk.yaml]```

**Calibrate** a threshold against human labels

```jevals calibrate [labeled.jsonl] --eval [evals/tool_call_risk.yaml] --label [human_decision]```

**Validate** YAML eval files

```jevals validate [evals/*.yaml]```

Install the **MCP server** for a coding agent

```jevals mcp --install [cursor]```

# SYNOPSIS

**jevals** [_--backend_ _url_] _command_ [_options_]

# DESCRIPTION

**jevals** runs agent evaluations and request-path guardrails as typed decision questions instead of a generative LLM judge. Several checks on one trace are packed into a single backend request that returns calibrated probabilities (yes/no, multiple choice, or a scored rubric). Plain code handles splitting, tool-call matching, and regex or Presidio entity detection; the model only answers the judgment questions.

Built-in evals live under **agent** (tool choice, groundedness, scope, loops), **security** (injection, PII/PHI, secrets, toxicity), and **quality** (faithfulness, relevancy, completeness, and related Ragas-style metrics). The same class can score a dataset offline, monitor production traces, or sit in a **Gate** that maps answers to allow, escalate, block, or redact.

Backends resolve from the environment unless **--backend** is set: TypeSafe Jev (`TYPESAFE_API_KEY`), Jev through Vercel AI Gateway (`AI_GATEWAY_API_KEY`), a local Kev server (`KEV_BASE_URL` or `kev://host:port`), in-process Laya (`JEVALS_BACKEND=laya`), an emulated chat LLM (`OPENROUTER_API_KEY` / `llm:<model>`), or `mock` for tests.

# COMMANDS

**run** _path_
> Evaluate a JSONL dataset. **--evals** is a comma-separated list of built-in names or YAML paths. **--out** writes one result row per trace. **--limit**, **--concurrency**, **--show-failures** _N_, **--json**, **--quiet**.

**check** _path_
> Evaluate one JSON sample (or **-** for stdin). Prints a table, or JSON with **--json**. Exit 0 if every eval passed, else 1.

**gate** _path_
> Run evals as a policy gate. Exit **0** allow/modify, **2** escalate, **3** block.

**list**
> List built-in evals. **--category** filters; **--json** prints machine-readable rows.

**describe** _name_
> Show an eval's required fields, state keys, and questions.

**validate** _paths_
> Parse YAML/JSON eval files and report errors.

**schema**
> Print the JSON Schema for declarative YAML evals.

**docs**
> Print a compact reference (intended for pasting into an agent context).

**calibrate** _path_
> Fit a threshold table against a label field. Requires **--eval** and **--label**. **--max-false-pass** picks the highest auto-pass rate under that wrong-pass budget.

**mcp**
> Run an MCP server, or **--install** [_cursor_|_claude_|_vscode_|_all_] to write client config.

**hook** {_pre_|_post_}
> Claude Code hook: read a PreToolUse/PostToolUse event on stdin and print allow, ask, or deny.

**bench**
> Measure requests, tokens, and latency on a fixed dataset. **--ragas** also runs Ragas on the same rows.

# PARAMETERS

**--backend** _spec_
> Override backend discovery: `jev`, `vercel`, `kev://host:port`, `laya`, `llm:<model>`, or `mock`.

# CAVEATS

The project is alpha. Decision-model probabilities need calibration on your own labels before they drive irreversible actions. Chat-LLM backends emulate the typed API and are slower, more expensive, and poorly calibrated (often 0.00 or 1.00). Gates fail open if the backend is still down after retries unless the gate is constructed with `on_error="block"`. PII/PHI detection is stronger with the optional Presidio extra.

# HISTORY

**jevals** is published by **Openlayer** (2026) as an eval library on top of TypeSafe **Jev** and compatible local models (**Kev**, **Laya**). It reuses Ragas-style metric names while collapsing several LLM-judge round trips into one System One request.

# SEE ALSO

[pytest](/man/pytest)(1)

# RESOURCES

```[Source code](https://github.com/openlayer-ai/jevals)```

```[Documentation](https://github.com/openlayer-ai/jevals#readme)```

<!-- verified: 2026-09-21 -->
