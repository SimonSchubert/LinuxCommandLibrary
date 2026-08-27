# TAGLINE

Runtime behavior diffs for pull requests by comparing instrumented test traces

# TLDR

**Compare** the current branch against **origin/main** and write findings

```realdiff [path/to/repo] --base origin/main --pr HEAD --findings [.realdiff/artifacts/findings.json]```

Print the **detected language**, workdir, and inferred build/test commands

```realdiff detect [path/to/repo]```

Resolve refs from a **GitHub Actions** pull_request event

```realdiff --ci=github --findings [.realdiff/artifacts/findings.json]```

**Warm** the base-trace cache for a branch without comparing a pull request

```realdiff warm [path/to/repo] --target origin/main --cache-dir [path/to/cache]```

**Acknowledge** current findings into a suppression baseline

```realdiff baseline write --findings [.realdiff/artifacts/findings.json]```

**Post** findings to Azure DevOps from a saved report

```realdiff post --provider=azuredevops --findings [findings.json]```

# SYNOPSIS

**realdiff** [_repo_] [**--base** _ref_] [**--pr** _ref_] [_options_]

**realdiff** **detect** _repo_

**realdiff** **warm** _repo_ **--target** _ref_ [**--cache-dir** _dir_]

**realdiff** **baseline** **write** **--findings** _file_ [_options_]

**realdiff** **post** [**--provider=**_name_] **--findings** _file_

# PARAMETERS

**--base** _ref_
> Git ref of the stable side (the pull request's base).

**--pr** _ref_
> Git ref of the proposed change (typically **HEAD**).

**--target** _ref_
> Branch to instrument for **warm** (cache the noise-baseline traces only).

**--ci=github** / **--ci=azuredevops**
> Resolve the repository path and refs from GitHub Actions or Azure Pipelines environment variables.

**--work** _directory_
> Override the temporary work directory used for isolated checkouts.

**--findings** _file_
> Write canonical machine-readable findings JSON.

**--cache-dir** _directory_
> Opt in to a local base-trace cache. Persistence is off unless this is set.

**--cache-retention** _window_
> Expire cached traces after a stated window (for example **12h** or **7d**). Default is one day when caching is enabled.

**--keep-traces** _window_
> Keep working traces for a stated hours/days window. Traces are deleted after analysis by default.

**--keep**
> Keep temporary Git worktrees. Traces are still deleted unless **--keep-traces** is set.

**--baseline** _file_
> Use this suppression file instead of **.realdiff/baseline.yml**.

**--no-baseline**
> Inspect the raw result without applying the suppression baseline.

**--no-cache**
> Do not restore or store base traces even if **--cache-dir** is set.

**--strict**
> Include all unsuppressed findings in provider comments (default comments are high-confidence only).

**detect**, **detect-language**
> Print the effective language, work directory, entry point, commands, test projects, and scope. **detect-language** is an alias.

**warm**
> Run the three baseline instrumented tests for **--target** and store them in **--cache-dir**, without a pull-request comparison.

**baseline write**
> Merge 30-day acknowledgements for every currently actionable member. **--expires** _window_ changes the lifetime; **--no-expiry** makes them permanent.

**post**
> Post a previously written **findings.json** through a CI provider (for example **--provider=azuredevops**).

**-h**, **--help**
> Print help from the managed CLI and exit.

# DESCRIPTION

**realdiff** finds runtime behavior changes that a source diff does not show. It checks out both sides of a pull request, instruments each build, runs the **same existing tests**, records method arguments and return values, then diffs those traces. It does not mutate production code, generate tests, or infer behavior from source.

The public executable is a thin Rust launcher. It owns argument routing, repository config loading, and **detect**, then starts a sibling **realdiff-managed** binary for ref resolution, builds, caches, instrumentation, and posting. Language tracers emit one NDJSON contract; a streaming Rust engine matches events, subtracts self-noise (the base build is run more than once), collapses a changed call tree onto the **frontier** (the first changed member whose descendants behaved identically), and writes **findings.json**.

Supported languages in the v0.4.0 unified CLI are **.NET 8** (Mono.Cecil IL weaving, xUnit), **Java** (ASM javaagent, Maven/Gradle), **Node/TypeScript** (CommonJS/ESM Babel hooks), **Go** (stable AST rewrite into a cache), **Rust** (stable **syn** rewrite into a cache), and **Python 3.12+** (PEP 669 **sys.monitoring**, no bytecode rewrite). Mixed-language repositories and multiple entry points are refused rather than guessed; set **language** and **workdir** in **.realdiff/config.yml**.

Findings in unedited files are **unexpected**; changes in edited files are **expected**. A **behavior gap** is a changed value that at least one executing test did not assert on. Comments on pull requests use a high-confidence policy by default.

# CONFIGURATION

**.realdiff/config.yml** (optional) overrides detection field by field:

**language** / **workdir** / **build** / **test**
> Language id (**dotnet**, **java**, **node**, **go**, **rust**), repository-relative work directory, and the exact build/test commands run on both sides.

**test_projects** / **source_roots**
> .NET test project globs, or Java source directories when inference is not enough.

**include_namespaces** / **exclude_namespaces**
> Extra tracing scope. Go exclusions may name exact **.go** files.

**redaction.names** / **types** / **paths**
> Extra display-redaction rules (digests still use the real value).

**baseline**
> Nested **realdiff.baseline/2** document, same schema as **.realdiff/baseline.yml**.

Environment (comma or semicolon lists): **REALDIFF_REDACT_NAMES**, **REALDIFF_REDACT_TYPES**, **REALDIFF_REDACT_PATHS**. **REALDIFF_MANAGED_CLI** names an alternate managed binary. **REALDIFF_RUST_ENGINE** overrides the packaged native engine for development. **ANTHROPIC_API_KEY** may add a constrained explanation at post time; missing model output never changes the deterministic verdict.

# CAVEATS

Only methods the existing tests execute have evidence. Unexecuted edited files report zero traced members, never "unchanged". Incomplete path attribution, source information, call-tree integrity, or coverage is **exit 3** (refused), not a clean result.

The extracted release directory must stay together: the launcher starts **realdiff-managed** beside it and needs the tracers and native engine. **--engine** was removed; the Rust engine is the only path.

Traces can contain application values. Redaction is on by default for credential-shaped names and strings, but method names, paths, and the fact that a secret changed remain visible. Treat unredacted traces as sensitive build output. Target tests run with the CI agent's permissions; RealDiff is not a sandbox.

Status is early preview (v0.4.0). Python 3.11 and older are refused. Node worker threads, .NET type initializers, and several other callable shapes are recorded as skipped coverage boundaries.

# EXIT CODES

**0**
> Analysis completed; no unexpected behavior changes.

**1**
> Analysis completed; behavior findings exist.

**3**
> Evidence could not support a verdict (also used by the launcher for invalid usage).

**4**
> Could not instrument the repository (also used if **realdiff-managed** cannot start).

**5**
> The unmodified repository did not build in this environment.

# HISTORY

Developed by **Nitin Issac** as **RealDiff** (MIT). Earlier releases were named **BehaviorDiff**; v0.3.0 introduced the Rust launcher and engine, and v0.4.0 added the Python tracer and the all-language container **ghcr.io/issacnitin/realdiff**.

# SEE ALSO

[git](/man/git)(1), [git-diff](/man/git-diff)(1), [diff](/man/diff)(1), [diffoscope](/man/diffoscope)(1), [gh](/man/gh)(1), [dotnet](/man/dotnet)(1)

# RESOURCES

```[Source code](https://github.com/issacnitin/RealDiff)```

```[Documentation](https://github.com/issacnitin/RealDiff#readme)```

<!-- verified: 2026-08-27 -->
