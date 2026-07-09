# TAGLINE

Free, local, open-source LLM cost analyzer

# TLDR

**Analyze** LLM usage logs and see potential savings by routing to cheaper models

```frugon analyze ./logs.jsonl```

**Capture** LLM calls locally via a proxy shim to generate logs

```frugon capture --out ./logs.jsonl```

**Run** a demo analysis on bundled sample data

```frugon analyze --demo```

**List** available models for routing candidates

```frugon models```

**Generate** a shareable HTML or Markdown report of the analysis

```frugon analyze ./logs.jsonl --report savings.html```

**Install** via pipx for permanent use

```pipx install frugon```

# SYNOPSIS

**frugon** <command> [options]

# DESCRIPTION

Frugon is a local-first tool that analyzes your real LLM API call logs (in OpenAI-compatible JSONL format) to show exactly where your spend is going and how much you could save by routing easier calls to cheaper models while keeping hard calls on capable ones.

It runs entirely on your machine: no logs or keys are sent anywhere. It uses tokenizers and current pricing data locally. Optional `--measure` mode samples your traffic against candidate models using your own provider keys (directly, never via Frugon) to give quality estimates.

Frugon can act as a transparent local proxy (`frugon capture`) that logs calls while forwarding them unchanged to the real provider.

# COMMANDS

**analyze** [file]
> Analyze a JSONL log file (or `--demo`) and recommend routing.

**capture**
> Run a local proxy that logs requests/responses to a JSONL file.

**models** [filter]
> List models available for `--candidates` with pricing/quality tiers.

**update**
> Refresh local pricing and quality data.

# PARAMETERS

**analyze**
> `--candidates` comma list of models to consider for routing
> `--measure` sample real traffic for quality comparison (requires extra install + keys)
> `--report` path to write .html or .md report
> `--demo` use bundled sample instead of a file

**capture**
> `--out` output JSONL file (default capture.jsonl)
> `--port` listen port (default 8787)
> `--verbose` log one line per captured call

# CAVEATS

- Logs must be in the specific JSONL shape (model + request/response + optional usage).
- `--measure` makes real API calls to your providers and incurs their cost.
- Quality tiers are estimates; always verify with `--measure --judge` on your data before switching production traffic.
- Routing recommendations are offline math; they do not automatically change your application.

# RESOURCES

```[Source code](https://github.com/Rodiun/frugon)```
```[Homepage](https://frugon.rodiun.io)```
```[Documentation](https://github.com/Rodiun/frugon#readme)```

<!-- verified: 2026-07-10 -->

# SEE ALSO

pipx(1), uvx(1)