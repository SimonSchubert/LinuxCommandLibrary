# TAGLINE

Autonomous multi-agent orchestration engine for software repos

# TLDR

**Install** the engine from a checkout (creates `~/.singular/bin/singular`)

```bash install.sh```

**Prepare** the current Git repo (pin, scaffold, migrate, doctor, optional tests; never actuates)

```singular setup```

**Check** interpreter, engine pin, and repo config

```singular doctor```

**Run** one reconcile cycle (import, recover, integrate, dispatch, snapshot)

```singular reconcile --actuate```

**Drive** a single task through planner, worker, and audit

```singular drive [TASK-0001]```

**Start** the self-driving loop (wall-clock budget `SINGULAR_MAX_HOURS`)

```singular auto```

**Print** orchestration status

```singular status```

**Write STOP** so workers are not dispatched

```singular stop```

# SYNOPSIS

**singular** _command_ [_args_]

# PARAMETERS

**setup** [**--json**] [**--no-test**] [**--test-async**]
> One idempotent path from an ordinary Git repo to a verified, STOPPED consumer. Resolves the engine pin, installs a matching local checkout if needed, writes `.singular-state/STOP` first, scaffolds, migrates, runs doctor, and optionally records a regression run. Never actuates.

**init**
> Scaffold `singular.config.json`, `docs/orchestration/`, and `.singular-version` in the current repo.

**doctor** [**--json**] [**--repair-model-cache**]
> Structured preflight. JSON checks have stable `id`, `severity`, `requiredFor`, and `remediation`.

**reconcile** [**--dry-run** | **--apply** | **--actuate** | **--status** | **--drain**]
> L0 reconciler: import staged planner tasks, recover stale leases, integrate finished branches, dispatch frontier workers, snapshot. **--actuate** performs the cycle. **--drain** waits for detached workers.

**auto** [**--once**]
> Self-driving autonomy loop. Honors `SINGULAR_MAX_HOURS` (default 12).

**drive** _TASK-XXXX_
> Run one task through L1 planning, L2 worker, gate, and audit.

**status**
> Orchestration status (same as `reconcile --status`).

**integrate** [**--task** _TASK-XXXX_] [**--dry-run**]
> Merge accepted worker branches into the target branch.

**stop** [**--wait**[=_S_]] / **resume** / **wake** [**--keep-stop**]
> Cooperative halt, restart, and nap/backoff reset.

**human-gate** **request** | **approve** | **status**
> Owner- and artifact-hash-bound human approval records (schema v2 preferred path).

**gate validate** _FILE_
> Report every contract violation in a gate-result file.

**test** [**--status** [**--json**] | **--wait** | **--no-wait** | **--new-run** | **--rerun-failures**]
> Supervised engine regression suite. Requires an engine **checkout** (installed copies under `~/.singular/versions/` do not ship tests). Evidence lands in the current repo under `.singular-state/test-runs/`.

**update** [_VERSION_]
> Pin this repo in `.singular-version`. With no argument, pins the machine `current` version.

**migrate** [**--dry-run**]
> Raise `schemaVersion` in `singular.config.json` through the engine's `migrations/` chain.

**version**
> Print CLI version and the resolved engine home.

**console** [**--ensure** | **--status** | **--stop**]
> Local visualization server (default `http://127.0.0.1:8765`). URL persisted at `.singular-state/console.url`.

**metrics** [**--json**] [**--runs-dir** _DIR_] [**--events-file** _FILE_]
> Read-only context metrics from the event log.

**gc** [**--dry-run**]
> Cap run history, prune integrated worktrees, rotate events.

**help**
> Print the launcher usage. `graph` and `experiment-report` appear only when `SINGULAR_CTX_GRAPH=1` or `SINGULAR_CTX_EXPERIMENT=1`.

Other operator commands include **recover**, **validate-dag**, **next-area**, **promote-gate**, **health**, **gates**, **lease**, **plan**, **ask**, **report**, **supersede**, **unpark**, **breaker**, **clear-backoff**, and **accept-packet**.

# DESCRIPTION

**singular** is the command-line launcher for Singular, a bash and Python orchestration engine that runs autonomous AI coding agents in parallel against a Git repository. The binary you type is **singular**; the upstream checkout is **singular-lite**. It is not related to Singularity/Apptainer containers.

The engine is installed once per machine (`bash install.sh` from a checkout) into `SINGULAR_HOME` (default `~/.singular`): versioned trees under `versions/<ver>/`, a `current` symlink, and `bin/singular`. Each consumer repo pins the engine in `.singular-version` (overrides `engineVersion` in `singular.config.json`). The launcher resolves that pin, binds `SINGULAR_ROOT` to the repo, and execs the matching engine scripts.

Scheduling is three-tier. **L0** is the single origin loop (`reconcile`): import planner proposals, recover expired leases, integrate finished branches, dispatch work, snapshot. **L1** planners produce batches of tasks per DAG area. **L2** workers run one task in an isolated `git worktree` on a per-task branch and write a state packet. A configured **gate** command (for example a test suite) runs after the worker; an auditor model reviews the packet; a decider maps `(failure-class, retries-left)` to retry, amend-scope, escalate, or park.

Detached dispatch is on by default (`SINGULAR_DETACHED_DISPATCH=1`): `reconcile` pre-leases frontier tasks, spawns workers in their own session, and returns in seconds. A reaper attributes completions on later cycles. Set the variable to `0` for the older synchronous batch wait.

Prerequisites: **Bash >= 4**, **python3**, **git**, and at least one configured runner CLI on `PATH` (`claude`, `codex`, or another runner named in config). On macOS the system `/bin/bash` is 3.2; install a newer bash and optionally set `SINGULAR_BASH_BIN` to its absolute path. The launcher is licensed **GPL-3.0**.

# CONFIGURATION

**singular.config.json**
> Per-repo declarative config: `targetBranch`, `gateCommand`, `runner`, `areas`, `promoter`, `worktreeCopyPaths`, `modules`, capability/role profiles, evidence limits, bootstrap commands, and `legacyCompatibility`. The starter `gateCommand` is `false` so a new repo fails closed until you set a real health check.

**singular.config.sh**
> Optional shell extras (computed values, functions).

**.singular-state/config.local.sh**
> Gitignored operator overrides and secrets.

**.singular-version**
> Authoritative engine pin for this repo.

**SINGULAR_HOME**
> Machine install root (default `~/.singular`). Must be an absolute path.

**SINGULAR_ENGINE_HOME**
> Override the resolved engine tree (required to run `singular test` against a checkout).

**SINGULAR_BASH_BIN** / **SINGULAR_CODEX_BIN**
> Absolute paths to Bash >= 4 and a specific Codex binary. `SINGULAR_BASH_BIN` is bootstrap-only and is ignored inside `singular.config.json`.

**SINGULAR_MAX_CONCURRENT** (default 3) / **SINGULAR_MAX_DISPATCH** (default 5) / **SINGULAR_MAX_HOURS** (default 12)
> Worker slots, tasks per reconcile cycle, and autonomy wall-clock budget.

**SINGULAR_DETACHED_DISPATCH** (default 1) / **SINGULAR_AUTO_INTEGRATE** (default 1) / **SINGULAR_PUSH**
> Detached workers, automatic merge of accepted branches, and whether to push. Direct commands default `SINGULAR_PUSH=0`; `singular auto` defaults to `1`.

**SINGULAR_TARGET_BRANCH**
> Integration branch. Required for actuate cycles (also settable in JSON).

**SINGULAR_CTX_GRAPH** / **SINGULAR_CTX_EXPERIMENT**
> Opt-in flags that expose `singular graph` and `singular experiment-report`.

# CAVEATS

Not **singularity**(1) (containers). macOS users must install Bash >= 4 or the launcher exits `SINGULAR_BASH_UNSUPPORTED`. `singular test` refuses installed (non-checkout) engine trees. `setup` installs a missing pin only from a matching engine checkout already on the machine — there is no download step. The default promoter only knows its built-in node registry; a custom DAG that omits `promoter` stalls after layer 0 with `promotion: no promotable frontier gates`. Singular executes repo-configured shell commands and launches coding agents in worktrees — review config and task files before running it in an untrusted repo. Schema v2 rejects unbound `accept-waiver` / `promote-gate --operator` paths unless `legacyCompatibility.unboundWaivers` is `true`.

# HISTORY

Singular is developed by **alex-reysa** in the **singular-lite** repository (GPL-3.0). The machine launcher is a Bash script (`cli/singular`) that resolves a pinned engine version and execs `engine/*.sh`. Engine releases are identified by the repo `VERSION` file (0.19.x line at documentation time); the embedded CLI version string is independent.

# SEE ALSO

[claude](/man/claude)(1), [codex](/man/codex)(1), [aider](/man/aider)(1), [git](/man/git)(1), [git-worktree](/man/git-worktree)(1)

# RESOURCES

```[Source code](https://github.com/alex-reysa/singular-lite)```

<!-- verified: 2026-08-18 -->
