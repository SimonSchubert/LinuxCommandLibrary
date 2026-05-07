# TAGLINE

Test runner for AI agent skills

# TLDR

**Run** the evaluator against a skills directory

```npx agent-skills-eval [./skills]```

**Compare** with-skill vs. baseline performance using a target and judge model

```npx agent-skills-eval [./skills] --target [gpt-4o-mini] --judge [gpt-4o-mini] --baseline```

**Use** a YAML configuration file

```npx agent-skills-eval --config [agent-skills-eval.yaml]```

**Generate** an HTML report alongside the run artifacts

```npx agent-skills-eval [./skills] --baseline --report```

**Limit** parallel evals and filter which skills run

```npx agent-skills-eval [./skills] --concurrency [2] --include "[skills/translate*]" --exclude "[**/draft-*]"```

**Stream** machine-readable JSONL logs and abort on validation errors

```npx agent-skills-eval [./skills] --log-format [jsonl] --strict```

# SYNOPSIS

**agent-skills-eval** [_options_] [_skills_root_]

# PARAMETERS

**\-\-config**  _file_
> Load YAML configuration from _file_. CLI flags override values from the config.

**\-\-workspace**  _dir_
> Output directory for results (default: **./agent-skills-workspace**).

**\-\-baseline**
> Enable the **with_skill** vs **without_skill** comparison. Without it, only the with-skill run is performed.

**\-\-target**  _model_
> Target model whose performance is being evaluated.

**\-\-judge**  _model_
> Judge model used to grade target outputs.

**\-\-base-url**  _url_
> API base URL (defaults to the OpenAI endpoint).

**\-\-api-key-env**  _VAR_
> Environment variable that holds the API key (default: **OPENAI_API_KEY**).

**\-\-include**  _glob_
> Run only skills whose path matches _glob_.

**\-\-exclude**  _glob_
> Skip skills whose path matches _glob_.

**\-\-concurrency**  _N_
> Number of parallel eval runs (default: **4**).

**\-\-layout**  _mode_
> Workspace layout: **iteration** (default, numbered run folders) or **flat**.

**\-\-strict**
> Fail when **SKILL.md** validation errors are detected.

**\-\-log-format**  _mode_
> Output format: **pretty**, **jsonl**, or **silent**.

**\-\-report**
> Emit a static HTML report under the workspace.

**\-\-report-output**  _dir_
> Override the directory where the report is written.

# DESCRIPTION

**agent-skills-eval** is a test harness for the **agentskills.io** specification. Each skill lives in a directory with a **SKILL.md** describing its purpose plus an **evals/evals.json** file enumerating prompts, attached files, and judge-graded assertions. The runner loads each eval, sends the prompt to the configured target model—optionally with the skill content injected—and asks the judge model to score the result against the declared assertions.

When **\-\-baseline** is set, every eval runs twice: once with the skill loaded into context and once without. Comparing the two scores measures whether the skill actually improves the model's output rather than just confirming it can solve the task on its own. Outputs, timing, token counts, tool calls, and grading rationales are persisted under the workspace so runs are reproducible and auditable.

The CLI is designed for both ad-hoc local iteration and CI pipelines. The **iteration** layout numbers each run, making before/after comparisons easy; the **flat** layout overwrites a single result tree. Logs can be rendered as colored progress for humans or streamed as JSONL for programmatic consumers, and a static HTML report can be produced for sharing without a server.

# CONFIGURATION

A YAML config keeps long invocations manageable. Every CLI flag has an equivalent key.

```
root: ./skills
workspace: ./agent-skills-workspace
baseline: true
target: gpt-4o-mini
judge: gpt-4o-mini
baseUrl: https://api.openai.com/v1
apiKeyEnv: OPENAI_API_KEY
include: ["skills/**"]
exclude: ["**/draft-*"]
concurrency: 4
layout: iteration
strict: true
report:
  enabled: true
  title: Agent Skills Report
logging:
  format: pretty
  verbose: false
  color: auto
targetParams:
  temperature: 0
judgeParams:
  temperature: 0
```

# EVALS FILE

Each skill provides **evals/evals.json**:

```
{
  "skill_name": "my-skill",
  "evals": [
    {
      "id": "eval-id",
      "name": "Human-readable name",
      "prompt": "The test prompt",
      "files": ["path/to/file.csv"],
      "expected_output": "Expected behavior description",
      "assertions": ["Criterion the judge checks"]
    }
  ]
}
```

# OUTPUT LAYOUT

A run produces per-eval artifacts under the workspace:

> **meta.json**, **benchmark.json** — run metadata and pass/fail summary  
> **eval-{id}/with_skill/** — outputs, timing, grading with skill in context  
> **eval-{id}/without_skill/** — same artifacts for the baseline run  
> **report/index.html** — offline-viewable static report (with **\-\-report**)

# CAVEATS

Costs scale with the number of evals: enabling **\-\-baseline** doubles target-model calls and adds judge calls on top. Set **\-\-concurrency** carefully to avoid rate limits. The judge is itself an LLM, so grading is probabilistic—pin **temperature: 0** in **judgeParams** for stable scores. Skills must conform to the agentskills.io frontmatter rules; combine **\-\-strict** with CI to catch malformed **SKILL.md** files early.

# HISTORY

**agent-skills-eval** was published as an open-source npm package in **2025** by Rishabh (darkrishabh) to provide a reproducible benchmark for the emerging **agentskills.io** ecosystem of model-portable AI agent skills. It implements the official iteration-N artifact layout adopted by that specification.

# SEE ALSO

[claude](/man/claude)(1), [codex](/man/codex)(1), [gemini](/man/gemini)(1), [npx](/man/npx)(1), [node](/man/node)(1)
