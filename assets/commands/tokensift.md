# TAGLINE

Token-efficiency linter for LLM prompts and payloads

# TLDR

**Analyze** prompt files for a model

```tokensift [prompts/*.md] --model [gpt-4o]```

Lint text from **stdin**

```tokensift --stdin --model [gpt-4o]```

Write a **config file** and CI snippets

```tokensift init --model [gpt-4o]```

**Autofix** safe findings in place (not for .json files)

```tokensift [prompt.md] --model [gpt-4o] --fix --write```

Record a **baseline**, then fail CI when a file grows more than 10%

```tokensift [prompts/*.md] --model [gpt-4o] --update-baseline```

Set per-file **token ceilings** and **check** them in CI

```tokensift budget init [prompts/*.md] --model [gpt-4o]```

```tokensift check [prompts/*.md] --model [gpt-4o]```

Print **bundled prices** for a model

```tokensift pricing show [gpt-4o]```

# SYNOPSIS

**tokensift** [_file_...] [_options_]

**tokensift** **--stdin** [_options_]

**tokensift** **init** [**--model** _id_] [**--force**]

**tokensift** **check** [_file_...] [_options_]

**tokensift** **budget** **init** [_file_...] [_options_]

**tokensift** **calibrate** **anthropic** {**init**|**run**} [_options_]

**tokensift** **pricing** {**show** [_model_]|**update**}

# PARAMETERS

[_file_...]
> Prompt files or globs. Quote **\*\*** globs so the shell does not expand them. With no subcommand this is the analyze path.

**--stdin**
> Read the prompt from standard input instead of files.

**--model** _id_
> Tokenizer and price table to use (for example **gpt-4o**, **gpt-4-turbo**, **claude-sonnet-4-5**). Required unless set in **tokensift.config.json**.

**--format** {**json**|**github**|**markdown**|**sarif**}
> Machine-readable output. **json** is a per-file **Report**. **github** emits workflow commands for PR annotations. **markdown** is a summary table. **sarif** is SARIF 2.1.0 for code scanning.

**--rules** _spec_
> Comma-separated **id=off|info|warn|error** overrides (example: **uuid-bloat=off,filler=error**).

**--max-warnings** _n_
> Analyze-mode exit **1** when warning-level findings exceed _n_.

**--config** _path_
> Config file (default: **tokensift.config.json** next to the working directory). CLI flags win over the file.

**--fix** **--write**
> Apply safe autofixes (**unicode-punct**, **whitespace-run**, **pretty-json**, **html-whitespace**) and write files back. Refuses **.json** inputs.

**--update-baseline**
> Write current token counts to **.tokensift/baseline.json**. Later analyze/check runs fire **baseline-regression** if a file grew more than 10%.

**--baseline-file** _path_
> Alternate baseline store (default **.tokensift/baseline.json**).

**init**
> Write **tokensift.config.json** plus example GitHub Action, pre-commit, and test-matcher snippets under **.tokensift/**. Does not install those snippets. **--force** overwrites.

**check**
> CI gate: run analysis plus budget and baseline rules. Exit **0** or **2** (any error-severity finding). No **--fix**, **--write**, or **--max-warnings**.

**budget init**
> Measure files and write **.tokensift/budgets.json**. **check** then fails with **budget-exceeded** when a file is over its ceiling. **--budget-file** overrides the path.

**calibrate anthropic init**
> Write placeholder fixtures to **.tokensift/anthropic-fixtures.json**. **--force** overwrites.

**calibrate anthropic run** **--model** _id_
> Call Anthropic's token-count API on the fixtures (needs **ANTHROPIC_API_KEY** or **--api-key-env**) and write **.tokensift/anthropic-calibration.json**. At least 20 real samples. The only analyze-time network alternative is **pricing update**.

**pricing show** [_model_]
> Print bundled input/output/cache rates. With no model, list every tokenizable id.

**pricing update**
> Fetch LiteLLM's price snapshot into **.tokensift/pricing-overrides.json** (or **--out**). Opt-in; never automatic.

**-h**, **--help**
> Print usage. With no arguments, the CLI also prints help.

**-v**, **--version**
> Print the installed package version.

Exit codes: **0** clean, **1** too many warnings, **2** error-severity finding, **3** bad input, flags, or config.

# DESCRIPTION

**tokensift** is a deterministic, offline linter for LLM prompt text, chat **Message** arrays, and tool schemas. It tokenizes with the same BPE family the provider uses (exact counts for OpenAI **o200k_base** and **cl100k_base** models; calibrated estimates for bundled Claude 4.5 ids) and reports where tokens are spent on structure the model does not need: UUIDs, pretty-printed JSON, repeated boilerplate, base64 blobs, filler phrases, and similar patterns.

Each finding includes a rule id, severity, token delta, and a dollar cost from a bundled LiteLLM price snapshot (**perCall** and **per1000Calls**). The npm package is both a library (**analyze()**, **budget()**, vitest/jest matchers) and this CLI (**bin**: **tokensift**). It does not call an LLM to rewrite prompts and does not proxy live API traffic.

Builtin rules (default severities): **uuid-bloat** (warn), **unicode-punct** (info, autofix), **whitespace-run** (warn, autofix), **pretty-json** (warn, autofix), **repeated-block** (warn), **base64-blob** (error), **high-entropy-string** (info), **digit-fragmentation** (info), **duplicate-message-content** (warn), **filler** (info), **row-json** (warn), **long-keys** (info), **redundant-structure** (info), **verbose-schema-values** (info), **dead-instruction** (info), **unlabeled-dynamic** (info), **html-whitespace** (warn, autofix), **encoder-mismatch** (warn), **budget-exceeded** (error), **baseline-regression** (error).

Install with **pnpm add tokensift**, **npm install tokensift**, or **npx tokensift**. Node **>=18**.

# CONFIGURATION

**tokensift.config.json**
> Project config. Common keys: **model**, **rules** (id to severity or **off**), **volume.requestsPerDay** (adds **atVolume** cost), **pricing.overrides** (dollars per million tokens).

**.tokensift/baseline.json**
> Per-file token counts for **baseline-regression**.

**.tokensift/budgets.json**
> Per-file hard token ceilings for **budget-exceeded**.

**.tokensift/pricing-overrides.json**
> Local price table from **pricing update**.

**.tokensift/anthropic-calibration.json**
> Optional local Claude calibration from **calibrate anthropic run**.

# CAVEATS

Gemini and **gpt-oss** encodings are not implemented (clear error, no silent guess). Claude findings are **confidence: estimate**; unknown **claude-*** ids need **calibrate**. **--fix --write** will not rewrite **.json** files. **check** treats any error-severity rule as a hard fail. Analyze and check are offline; **calibrate anthropic run** and **pricing update** are the only network commands. Early-stage package; rule set and model list still change.

# HISTORY

TypeScript library and CLI by **ritenv**, MIT licensed. npm package **tokensift**. Tokenizer data comes from **gpt-tokenizer**; prices from a curated LiteLLM snapshot.

# SEE ALSO

[eslint](/man/eslint)(1), [llm](/man/llm)(1), [prettier](/man/prettier)(1)

# RESOURCES

```[Source code](https://github.com/ritenv/tokensift)```

```[Homepage](https://www.npmjs.com/package/tokensift)```

<!-- verified: 2026-08-30 -->
