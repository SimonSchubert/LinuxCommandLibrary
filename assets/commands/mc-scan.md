# TAGLINE

Static scanner for AI agent tools and capabilities (part of MakerChecker)

# TLDR

**Scan** a directory or tools file for risky agent capabilities

```mc-scan .```

**Output** machine-readable JSON

```mc-scan . --json```

**Generate** a shareable Markdown report

```mc-scan . --markdown```

**Write** a deny-by-default policy file

```mc-scan init .```

**Generate** governance scaffold code with `--fix`

```mc-scan . --fix```

**Fail** CI on catastrophic findings

```mc-scan . --fail-on CATASTROPHIC```

**Run** an optional LLM deep scan (private with Ollama)

```mc-scan . --llm --llm-provider ollama```

# SYNOPSIS

**mc-scan** [_options_] _path_  
**mc-scan** init [_path_] [_options_]

# DESCRIPTION

`mc-scan` (also available as `npx @makerchecker/scan`) is a zero-dependency, fully offline static analysis tool that inspects an AI agent's tools, function schemas, and source code to discover what actions the agent is capable of performing.

It parses OpenAI-style tool definitions, MCP `tools/list` output, LangChain decorators, Vercel AI SDK tools, and similar declarations in JavaScript, TypeScript, and Python. It classifies each capability against a database of real AI agent incidents and reports risk tiers:

- **CATASTROPHIC**: irreversible harm (delete data, exec code, move funds, etc.)
- **HIGH / MEDIUM**: significant but scoped impact

It also detects dangerous **composition risks** (e.g., read-untrusted + shell-exec = RCE channel).

The tool can emit JSON, Markdown reports, enforce policy files, and with `--fix` emit ready-to-use governance wrappers (deny-by-default + separation of duties) for the `@makerchecker/embedded` runtime.

It is part of the larger MakerChecker security gateway project but the scanner can be used standalone in development, audits, and CI.

# PARAMETERS

**_path_**  
> Directory or JSON file containing agent tool definitions (defaults to current directory).

**--json**  
> Emit machine-readable JSON instead of terminal report.

**--markdown**, **--md**  
> Emit a shareable Markdown results card.

**--policy** _file_, **-p** _file_  
> Load an existing `mc-policy.json` to evaluate against.

**--fail-on** _SEVERITY_  
> Exit non-zero if any finding meets or exceeds the severity (CATASTROPHIC, HIGH, etc.). Useful for CI.

**init** [_path_]  
> Generate a deny-by-default `mc-policy.json` (or custom path with `--policy`).

**--fix**  
> After scanning, write a governance scaffold (`mc-governance.mjs` or via `--out`) using the embedded primitives.

**--out** _file_, **-o** _file_  
> Output path for files written by `--fix`.

**--llm**  
> Enable optional LLM deep scan (re-ranks tools or scans source for latent capabilities). Never lowers static severity.

**--llm-provider** _id_  
> anthropic (default), openai, openrouter, together, groq, ollama, or openai-compatible.

**--llm-model** _id_  
> Override model for the chosen provider.

**--llm-base-url** _url_  
> Custom endpoint (for Ollama or gateways).

**--llm-key** _key_  
> API key (prefer provider environment variables).

**--llm-no-key**  
> Explicitly run without a key where supported.

**-h**, **--help**  
> Show usage.

**--version**, **-v**  
> Print version.

# CAVEATS

The default scan is completely local and deterministic. `--llm` mode is opt-in and non-deterministic; it does not affect `--fail-on` exit codes.

"scan" and "mc-scan" binaries are provided by `@makerchecker/scan`. The generic name "scan" may conflict with other tools on PATH; prefer `mc-scan` or the npx form.

LLM scans that use cloud providers send tool names/descriptions (and optionally code snippets) to the provider. Use `--llm-provider ollama` for fully private operation.

The tool only analyzes declared interfaces and some source; runtime behavior or heavily obfuscated code may not be fully covered.

# HISTORY

MakerChecker and its `mc-scan` component were created to provide practical, auditable guardrails for agentic AI systems after a series of high-profile agent failures. The scanner emphasizes offline operation and integration with both development workflows and production gateways.

# SEE ALSO

[deptrust](/man/deptrust)(1), [semgrep](/man/semgrep)(1)

# RESOURCES

```[Source code](https://github.com/makerchecker/MakerChecker)```

```[Homepage](https://makerchecker.ai)```

```[Documentation](https://makerchecker.ai/docs)```

<!-- verified: 2026-07-11 -->
