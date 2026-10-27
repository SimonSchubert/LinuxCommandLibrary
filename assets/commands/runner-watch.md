# TAGLINE

Sync the preloop runner with upstream GitHub Actions runner releases

# TLDR

**Write** the default config and surface map

```runner-watch init```

**Diff** two actions/runner tags

```runner-watch diff --from [v2.320.0] --to [v2.321.0]```

**Triage** that delta into spec files, without calling an agent

```runner-watch triage --no-agents```

**Replay** a golden capture against a local preloop

```runner-watch conform --runner [v2.321.0] --preloop-url [http://127.0.0.1:9090] --skip-cargo-test```

**Compare** two captures

```runner-watch flows-diff --left [golden/official] --right [golden/preloop] --json```

**Orchestrate** diff, triage, and a dry-run PR body

```runner-watch run --from [v2.320.0] --to [v2.321.0] --no-agents --skip-implementation --skip-review```

# SYNOPSIS

**runner-watch** [**--config** _file_] _command_ [_options_]

# DESCRIPTION

**runner-watch** is the maintainer CLI for keeping **preloop** aligned with the official GitHub Actions runner. It polls releases, diffs two tags, turns the delta into per-change specs, can invoke Codex and Claude on those specs, replays recorded HTTP flows against a running **preloop**, and writes tiered draft pull requests with **gh**. It is not the runner that executes jobs; that is **preloop-runner**.

State and artifacts live under **.runner-watch** (delta, specs, golden captures, coverage, PR bodies). **--config** defaults to **.runner-watch/config.toml** and is global. **init** writes that config and **docs/preloop-surface.toml** when they are missing.

**run** always finishes by writing PR body files only. It does not call **gh**. Use **pr** without **--dry-run** to open the drafts.

The binary is the **runner-watch** crate in the preloop workspace. From a checkout, **cargo run -p runner-watch -- init**.

# COMMANDS

**init** [**--force**]
> Write the default config and **docs/preloop-surface.toml**. **--force** overwrites both

**watch** [**--feed-url** _url_]
> Poll actions/runner releases and update state when a new tag appears. The default feed is the GitHub releases atom for **actions/runner**

**diff** **--from** _tag_ **--to** _tag_
> Clone the two tags and write **.runner-watch/delta.json**

**triage** [**--no-agents**]
> Turn the delta into per-change TOML specs. **--no-agents** does not call the configured triage agent for unknown entries

**implement** [**--dry-run**]
> Invoke Codex over the generated specs. **--dry-run** writes prompts and does not invoke Codex

**review** [**--dry-run**]
> Invoke Claude to review implementation diffs. **--dry-run** writes prompts only

**record-golden** **--runner** _version_ [**--scenario** _name_] [**--non-interactive**] [**--target** _official_]
> Record a golden capture through the mitm worktree's record script. **--target** defaults to **official**, the only value. **--non-interactive** is forwarded to that script. **--scenario** limits the recording

**conform** **--runner** _version_ **--preloop-url** _url_ [**--scenario** _name_] [**--cell** _name_] [**--skip-cargo-test**] [**--value-gate-strict**]
> Replay **flows.jsonl** from the golden directory for that runner version against a running preloop and compare responses. **--cell** selects a directory under the version (for example **gh-official**). **--skip-cargo-test** skips **cargo test --workspace** first. **--value-gate-strict** also fails on normalized response values; the default gate checks status and schema and only reports value diffs

**coverage** [**--runner** _version_] [**--routes-src** _file_] [**--strict**]
> Report golden coverage of implemented runner-facing routes. **--runner** defaults to the last reconciled version in **.runner-watch/state.json**. **--routes-src** defaults to **crates/preloop-runner-server/src/routes.rs**. **--strict** fails when a route has no golden coverage after the allowlist in **.runner-watch/coverage-allow.txt**

**flows-diff** **--left** _dir_ **--right** _dir_ [**--left-label** _text_] [**--right-label** _text_] [**--status-ignore** _substr_] [**--schema-gate** _substr_] [**--value-gate-except** _substr_] [**--json**]
> Compare two capture directories that each contain **flows.jsonl**. Labels default to **reference** and **candidate**. **--status-ignore** and **--schema-gate** are repeatable; a schema gate of an asterisk covers every endpoint. **--json** prints the machine-readable result

**pr** [**--base** _branch_] [**--head** _branch_] [**--dry-run**]
> Create tiered draft PRs (critical, high, low) via **gh pr create --draft**, labeled **protocol-sync** and **priority:critical**, **priority:high**, or **priority:low**. **--dry-run** only writes the body files under **.runner-watch/prs**

**run** **--from** _tag_ **--to** _tag_ [**--preloop-url** _url_] [**--no-agents**] [**--skip-implementation**] [**--skip-review**] [**--skip-cargo-test**]
> Run diff, triage, then implement and review unless skipped. Conformance runs only when **--preloop-url** is set; otherwise a skipped report is written. PR bodies are written with dry-run forced

# PARAMETERS

**--config** _file_
> Path to the runner-watch config. Default **.runner-watch/config.toml**. Global

# CAVEATS

**implement** and **review** shell out to Codex and Claude unless **--dry-run** or **--no-agents** says not to. **pr** needs the **gh** CLI and a GitHub remote; **run** never opens those PRs. **record-golden** needs the mitm worktree named in the config. **conform** needs a preloop already listening at **--preloop-url**. This tool rewrites protocol-sync artifacts in the preloop checkout; it does not register a runner or execute a workflow.

# HISTORY

**runner-watch** is the **runner-watch** crate in **preloopdev/preloop**, beside the **preloop** and **preloop-runner** binaries.

# SEE ALSO

[preloop](/man/preloop)(1), [preloop-runner](/man/preloop-runner)(1), [gh](/man/gh)(1), [git](/man/git)(1), [act](/man/act)(1)

# RESOURCES

```[Source code](https://github.com/preloopdev/preloop)```

<!-- verified: 2026-10-27 -->
