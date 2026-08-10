# TAGLINE

Multi-model AI pull request review CLI with cost receipts

# TLDR

**Review the current branch against a base**

```juror review --base [main]```

**Review a pull request and print findings**

```juror review --pr [1234] --repo [owner/name]```

**Review a PR and post the sticky comment**

```juror review --pr [1234] --repo [owner/name] --post```

**Use a jury preset**

```juror review --preset [balanced] --base [main]```

**Run a shadow benchmark from a corpus file**

```juror benchmark --file [benchmarks/case.json]```

# SYNOPSIS

**juror** **review** [_options_]

**juror** **benchmark** [**--file** _path_]

# PARAMETERS

**review**
> Run a multi-model review of a local branch or a GitHub pull request

**--base** _REF_
> Base ref to diff against for a local working-branch review

**--pr** _NUMBER_
> Pull request number to review

**--repo** _OWNER/NAME_
> GitHub repository for **--pr** reviews

**--post**
> Post (or update) the sticky review comment on the pull request

**--preset**, **--mode** _NAME_
> Jury preset: fast (default), balanced, high, or ultra

**--models** _A,B,..._
> Narrow the selected preset (or custom jury) to these model ids for one run

**--config** _PATH_
> Path to a Juror config file (default: **.juror.yml** at the repo root)

**--cost-target** _USD_
> Per-PR planning cost target in USD

**--repo-dir** _PATH_
> Local repository directory (used by CI and advanced invocations)

**--json** _PATH_
> Write structured review output as JSON to _PATH_

**--dry-run**
> Do not treat the run as a live publish (used with Action dry runs)

**benchmark**
> Evaluate reviewer quality against an adjudicated corpus file

**--file** _PATH_
> Benchmark corpus JSON file

# DESCRIPTION

**juror** (npm package **juror-ai**) is a multi-model code review tool that runs several frontier models in parallel through their native agent harnesses (Claude Code, Codex, OpenCode, Grok Build, Kimi Code, and generic OpenAI-compatible endpoints), then merges and deduplicates findings into one report with a merge-confidence score and a per-model cost receipt.

It is designed for GitHub pull requests and local branch diffs. Typical install is **npm i -g juror-ai** (binary names **juror** and **juror-ai**). The same code path powers the **juror-ai/juror** GitHub Action, which posts a sticky summary comment and batched inline review comments on PRs.

Findings are anchored to the diff, blocked by file/line window, collapsed by exact and similarity/referee stages, and optionally filtered for higher precision via **publish_mode: consensus**. Provider keys are isolated per harness; models never receive **GITHUB_TOKEN**.

# CAVEATS

Requires Node.js 20+ and at least one LLM provider API key (**JUROR_OPENAI_API_KEY**, **JUROR_ANTHROPIC_API_KEY**, **JUROR_XAI_API_KEY**, **JUROR_FIREWORKS_API_KEY**, or unprefixed vendor fallbacks). Actual review quality and cost depend on installed harness CLIs and available keys. Cost for some harnesses is estimated from tokens × list price rather than provider-reported USD. Fork PRs in GitHub Actions are skipped by design when secrets are withheld. Not an autofix bot or linter.

# CONFIGURATION

Repo-root **.juror.yml** (optional). Keys include **preset**, **models**, **consensus**, **review** (publish_mode, severity_floor, paths_ignore), **budget**, and **output**. An explicit **models:** list replaces the preset entirely.

Provider keys in environment or a local **.env** (loaded automatically; untracked files are not exposed to model checkouts).

# SEE ALSO

[gh](/man/gh)(1), [claude](/man/claude)(1), [codex](/man/codex)(1), [opencode](/man/opencode)(1), [grok](/man/grok)(1)

# RESOURCES

```[Source code](https://github.com/Juror-AI/juror)```

```[Documentation](https://github.com/Juror-AI/juror#readme)```

<!-- verified: 2026-08-10 -->
