# TAGLINE

Agentic end-to-end testing CLI for web and mobile apps

# TLDR

**Scaffold** a project (engine, model, example test)

```npx e2e init```

Skip prompts (**Playwright**, AI on, no install)

```npx e2e init --yes```

**Run** the tests the config discovers

```npx e2e run```

Run one **file**, headed

```npx e2e run [tests/signup.e2e.ts] --headed```

**List** tests a run would select

```npx e2e list --tag [smoke]```

**Explore** the app toward a goal (no test file)

```npx e2e explore "[Explore checkout like a first-time buyer]"```

Sign in with a **subscription** for agent steps

```npx e2e login [openai]```

Print the **skill** for coding agents

```npx e2e guide```

Serve **MCP** on stdio

```npx e2e mcp```

Turn **telemetry** off

```npx e2e telemetry disable```

# SYNOPSIS

**e2e** [_-v_|_--version_] _command_ [_options_]

# DESCRIPTION

**e2e** is the CLI, SDK, and runner for TesterArmy's open **e2e** framework: write locators and assertions in TypeScript, and optionally let an agent drive the app with natural-language **act** / **assert** steps. An agent step that a later assertion verifies records its actions; the next run **replays** them with no model calls until the app changes. Tests without agent steps need no model.

The npm package **e2e** installs the **e2e** bin (`packages/e2e`, commander). Engines are separate packages: **@e2e-dev/web** (Chromium, Firefox, WebKit through Playwright) and **@e2e-dev/mobile** (iOS simulators and Android emulators). Config is **e2e.config.ts** (`export default { ... } satisfies E2EConfig`). Node.js **22.22.3+** or **24.8+** is required. On Windows, run inside WSL.

`npx e2e init` writes an ESM `package.json` if missing, `e2e.config.ts`, `tests/example.e2e.ts`, `.gitignore` entries, and the e2e skill for coding agents, without overwriting existing files. **--yes** takes defaults (Playwright, AI on) and does not install dependencies.

Default results directory is **.e2e** (`report.json`, artifacts, sessions, replay cache). Exit **0** every selected test passed, was flaky, or was skipped; **1** a test failed or timed out; **2** CLI, config, or agent policy error; **3** engine, app process, model provider, or artifact failure; **4** internal runner error; **130** interrupted.

# COMMANDS

**init** [_directory_] [**-y**|**--yes**]
> Scaffold a project. _directory_ is created when missing (default: current directory). Prompts need a TTY on stdin and stdout.

**run** [_files..._]
> Run discovered tests. Files, directories, globs, **file:line**, **--tag**, **--exclude-tag**, **--grep**, **--grep-invert**, **--target**, **--last-failed**, and **--shard** _index/total_ narrow the selection. **--headed**, **--agent**, **--workers**, **--retries**, **--max-failures**, **--repeat-each**, **--no-cache**, **--strict-cache**, **-u** / **--update-snapshots**, **-w** / **--watch**. Output: **--reporter**, **--output**, **--debug**, **--ai-trace**, **--trace** [_mode_], **--video** [_mode_]. **--watch** is refused in CI and with **--reporter json**.

**list** [_files..._]
> Print one line per test and target (`file › title [target] #tag`) without starting the app or engine. Same selection flags as **run**. **--reporter** _list_|_json_.

**explore** [_goal_]
> Agent exploration without a test file (default goal: "Explore the app and find bugs"). **--target**, **--agent**, **--session**, **--max-steps**, **--timeout**, **--headed**, plus the **run** output flags. Writes `report.json` with the exploration under `run.explore`.

**login** [_openai_|_github-copilot_|_opencode-console_|_spacexai_]
> Store a subscription login for agent models. **--device** (ChatGPT), **--from-gh** / **--client-id** / **--enterprise-url** (Copilot).

**logout** / **models** [_provider_]
> Forget a stored login, or list model ids that login serves.

**guide** [_topic_]
> Print the installed skill (overview, or a topic such as setup, writing-tests, agent, running, debugging, explore).

**mcp**
> MCP server on stdio (`open_session`, observe/tap/type/… tools, `close_session`). **--config**, **--target**, **--headed**, **--max-sessions**. Example: `claude mcp add e2e -- npx e2e mcp`.

**cache** **ls** | **stats** | **clear**
> Inspect or empty the replay cache under `.e2e/cache` (**--config** selects which store).

**feedback** **-m** _text_ [**--type** _bug_|_docs_|_feature_|_other_]
> One report about e2e itself. **--dry-run** prints the event and sends nothing. **E2E_TELEMETRY_DISABLED** and **DO_NOT_TRACK** also block it; `e2e telemetry disable` does not.

**telemetry** [_status_|_enable_|_disable_]
> Anonymous usage telemetry (commands and engines, not test content). Default action **status**.

**-v**, **--version**
> Print the version.

# CONFIGURATION

**e2e.config.ts**
> Project config: `targets` (required; a UI target names `engine` and `app`), `agents.default.model`, workers, retries, output directory, cache. The nearest file is used unless **--config** is set.

**.e2e/**
> Default output: `report.json`, artifacts, sessions, replay cache. Override with **--output** or `output` in the config.

**E2E_TELEMETRY_DISABLED** / **DO_NOT_TRACK**
> Disable anonymous telemetry for this process. **E2E_TELEMETRY_DEBUG=1** prints events to stderr instead of sending them.

# CAVEATS

Agent steps need a configured model (subscription login, API key, or local endpoint). The example test from **init** makes no model calls. Replay can go stale when the UI changes; **--strict-cache** fails those steps instead of calling the agent.

The CLI sends anonymous usage data unless disabled as above. **feedback** is a separate opt-in event. Mobile targets need Xcode with an iOS simulator runtime, or the Android SDK with an emulator. Do not put a `--` before e2e flags when a package script forwards arguments (`pnpm test:e2e -- --headed` makes `--headed` look like a file); run `e2e run --headed` directly.

`--artifacts` was removed: use **--output** for the directory that holds the report and `artifacts/`.

# HISTORY

**e2e** is an Apache-2.0 project by **TesterArmy**. The published **e2e** package (0.20.0 on the main tree) is the SDK, runner, and commander CLI; web and mobile engines ship as **@e2e-dev/web** and **@e2e-dev/mobile**.

# SEE ALSO

[playwright](/man/playwright)(1), [vitest](/man/vitest)(1), [mocha](/man/mocha)(1), [npx](/man/npx)(1), [npm](/man/npm)(1), [node](/man/node)(1)

# RESOURCES

```[Source code](https://github.com/tester-army/e2e)```

```[Homepage](https://tester.army/e2e)```

```[Documentation](https://e2e.tester.army/docs)```

<!-- verified: 2026-10-12 -->
