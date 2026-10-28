# TAGLINE

Local GitHub Actions engine that runs workflows in microVMs

# TLDR

Walk through **first-run setup** (credentials, golden image, how to run)

```preloop init```

Print what this host **can run**, without changing anything

```preloop init --probe --json```

Start the **control plane** on `127.0.0.1:9090`

```preloop serve```

Run a **workflow** against the current working tree

```preloop run -f [.github/workflows/ci.yml] --event pull_request```

Show the **job DAG** without executing

```preloop plan -f [.github/workflows/ci.yml]```

List **recent runs**

```preloop status```

Stream **logs** for the latest run

```preloop logs```

Store a **secret** the engine can inject

```preloop secret set [NAME]```

Attach a **DAP** debugger to a run

```preloop dap [run-id]```

Print the **installed version**

```preloop version```

# SYNOPSIS

**preloop** _command_ [_options_]

# DESCRIPTION

**preloop** is the command-line client and control plane for **Preloop**, a local and self-hosted GitHub Actions engine. It accepts the same workflow YAML GitHub does (`${{ }}` expressions, matrix jobs, reusable workflows, concurrency groups, OIDC) and runs each job in a hardware-isolated **microVM**. Uncommitted and untracked files in the working tree are included in a local run (`.gitignore` still applies). `preloop run` starts the engine automatically when nothing is listening; **preloop serve** is the explicit foreground server.

The CLI talks to an engine at **PRELOOP_URL** (default `http://127.0.0.1:9090`). It can also register the official `actions/runner` binary, or the companion **preloop-runner** binary, against that engine. A webhook watchdog reconciles GitHub deliveries with the GitHub API so check runs still update when GitHub's webhook path is down.

The published CLI/server pair shares version **0.34.0**. Most of the tree is **MIT**; **preloop serve** (the control plane crate `preloop-runner-server`) is **FSL-1.1-MIT** and converts to MIT two years after each release.

# COMMANDS

**init**
> First-run wizard: GitHub credentials, the golden image every job VM forks from, run mode, then a preflight check. In a terminal it prompts; otherwise it takes the same answers as flags and never waits. Writes `$PRELOOP_CONFIG` (default `~/.preloop/config.toml`). **--probe** prints a JSON capability report and exits. **--auth** is `app`, `pat`, or `none`. **--golden** is `official` (default, about **60 GB** on disk), `oci`, `dockerfile`, or `file`. **--mode** is `foreground`, `service`, or `none`. Exit **2** is a missing or invalid flag, **3** is preflight, **4** is image resolve/build/pull

**serve**
> Run the control plane and microVM pool in the foreground. **--listen** overrides **PRELOOP_LISTEN**. **--public-url** is the externally reachable base URL. **--store** selects durable state (`sqlite://`_path_, a bare path, or `postgres://…`). GitHub App flags: **--github-app-id**, **--github-app-key**, **--github-app-installation-id**, **--webhook-secret**, **--save**

**run** [**-f** _file_] [**--event** _event_] [**--job** _job_]
> Submit a workflow and stream events until it finishes. Bare filenames resolve inside `.github/workflows/`. Default event is **push**. **--payload** is a webhook JSON body. **--base** is the base ref for `pull_request` / `merge_group`. **--secret** _NAME=VALUE_ is repeatable. **--strict-secrets** fails when the workflow reads a secret this engine has not stored. **-d** / **--detach** returns immediately. **--push** publishes the result to GitHub after the run; **--create-pr** opens a pull request (implies **--push**); **--pr-draft** defaults to true. Interactive terminals pause a failed SmolVM job so you can fix and retry; pipes, CI, and **--detach** never pause

**plan** [**-f** _file_] [**--json**]
> Print the expanded job DAG (matrix fan-out and `needs:`) without running anything

**status** [_run-id_] [**--json**] [**--limit** _n_]
> Table of recent runs, or one machine-readable status word when a run id is given. Default limit is **20**

**logs** [_run-id_] [**--job** _job_] [**--step** _n_] [**-f**]
> Logs for a run (default: most recent). **--step** is 1-based among steps declared in the workflow and needs **--job** when the run has more than one job. **-f** / **--follow** tails one job and needs **--job** unless the run has a single job

**cancel** [_run-id_]
> Cancel a run. Defaults to the most recent active run

**rerun** [_run-id_] [**--failed**] [**--job** _job_]
> Re-run a completed run. With no flags every job starts a new attempt. **--failed** resets failed and cancelled jobs plus their dependents. **--job** resets one job and its dependents

**secret set** [_--value_ _value_] [_--repo_ _owner/repo_] [_--env_ _name_] _NAME_
> Store a secret. Omit **--value** to read one line from stdin (hidden on a TTY). **list** never prints values. **rm** deletes a name at the same scope

**setup github**
> Configure GitHub App or fine-grained PAT credentials. **--via** is `app` or `pat`

**doctor** [**--repo** _owner/name_]
> Verify the stored GitHub credential

**server install** / **server uninstall**
> Install or remove the control plane as a systemd or launchd service. **--user** uses per-user units. **--dry-run** prints the plan

**shell** [_run-ref_]
> Open a shell in a preserved failed VM. Default is the last failed run

**debug** [_session_]
> Attach to a job paused at a failed step. **--verdict** is `retry`, `continue`, or `abort`. **--from** / **--from-start** pick the retry step. **--json** prints the paused session and exits

**dap** _run-id_
> Attach an interactive DAP client to a debugger-enabled run and inspect live `github`, `env`, `runner`, `job`, `steps`, and `secrets` scopes

**push**
> Publish a completed run's result to GitHub (commit, pull request, check runs)

**webhooks** **list** | **replay** | **health**
> Inspect, requeue, and health-check the durable webhook queue. Replay needs no GitHub call; retention is 30 days

**update** [**--check**] [**--version** _tag_]
> Poll GitHub Releases and atomically replace the installed binary

**version**
> Print the installed Preloop version

# CONFIGURATION

**~/.preloop/config.toml**
> Default config written by **preloop init**. Override the path with **PRELOOP_CONFIG**. **init** records `[golden] base_image`; **serve** prepares that golden on first run. **PRELOOP_RUNNER_BASE_IMAGE** overrides the recorded image

**~/.preloop/**
> Default **PRELOOP_HOME**: state, goldens, and per-user service data. A system service defaults to `/var/lib/preloop`

# ENVIRONMENT

**PRELOOP_URL**
> Engine base URL (default `http://127.0.0.1:9090`)

**PRELOOP_CONFIG** / **PRELOOP_HOME**
> Config file and state directory

**PRELOOP_LISTEN** / **PRELOOP_PUBLIC_URL**
> Bind address and public URL for **serve** (overridden by **--listen** / **--public-url**)

**PRELOOP_STORE_URL**
> Durable-state backend for **serve**

**PRELOOP_GITHUB_PAT**
> Fine-grained PAT used by **init** / **setup github** when **--token** is omitted

**PRELOOP_RUNNER_BASE_IMAGE** / **PRELOOP_RUNNER_STORAGE_GB**
> Golden image override and VM disk size (default **80** GiB)

# CAVEATS

The official GitHub runner golden is about **9 GB** compressed and unpacks toward **50 GB**; **80 GB** free disk is recommended. First **serve** can take several minutes while that artifact is downloaded and the golden VM is created. On Apple Silicon, x86_64 goldens run through Rosetta 2; Docker actions inside those VMs currently fail. `preloop run` invents only the git-derivable parts of a webhook (changed files, default PR type `synchronize`, target branch); pass **--payload** when a workflow needs PR numbers, labels, or similar. Secrets listed by preflight come from this engine's store, never from GitHub. The control plane licence forbids offering it as a hosted CI service that competes with Preloop's own offering.

# HISTORY

**Preloop** is developed at **preloopdev/preloop**. The CLI crate is **preloop-cli**; it embeds the control plane so **preloop status** reports one version for both. **preloop-runner** is a separate Rust binary that speaks the same `actions/runner` protocol.

# SEE ALSO

[preloop-server](/man/preloop-server)(1), [preloop-runner](/man/preloop-runner)(1), [runner-watch](/man/runner-watch)(1), [act](/man/act)(1), [gh](/man/gh)(1), [git](/man/git)(1), [docker](/man/docker)(1)

# RESOURCES

```[Source code](https://github.com/preloopdev/preloop)```

```[Documentation](https://github.com/preloopdev/preloop/blob/main/docs/cli_reference.md)```

<!-- verified: 2026-10-12 -->
