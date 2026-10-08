# TAGLINE

Deploy Kubernetes faults and score incident investigations

# TLDR

**Write** an editable `arena.json` in the current directory

```incident-bench init```

**List** the scenarios in the configured suite

```incident-bench catalog```

**Deploy** the fixture application into the context named in `arena.json`

```incident-bench deploy```

**Inject** the selected fault

```incident-bench fault```

**Check** that a full-suite fault actually shows up

```incident-bench verify```

**Save** cluster evidence for the case

```incident-bench evidence```

**Import** the investigation's final answer

```incident-bench archive```

**Build** the scoring packet, then **judge** it

```incident-bench packet```

```incident-bench judge```

**Print** a summary table of judgments

```incident-bench report --summary```

**Reset** a full-suite fault on a disposable cluster

```incident-bench reset --confirm-disposable```

**Create** or **delete** a local kind cluster named `incident-bench`

```incident-bench cluster create```

```incident-bench cluster delete --name [incident-bench] --confirm-delete```

Use another run file or another attempt directory

```incident-bench --run [path/to/run.json] --case [oom-attempt2] fault```

# SYNOPSIS

**incident-bench** [**--run** _FILE_] [**--case** _NAME_] _command_ [_options_]

# DESCRIPTION

**incident-bench** deploys a disposable Kubernetes application, injects a known fault, stores an investigation record, and scores that record against the scenario's answer key. It is the command-line entry point of **Project Arena** (the Python module `bench`). From a checkout that has not been installed onto `PATH`, the same CLI is `python3 -m bench`.

Two suite sizes are separate from where the cluster runs. `suite` in the run file is `full` (21 scenarios, private fixture images, Linux AMD64 workers) or `smoke` (six scenarios, a pinned public image). The cluster itself is either a local [kind](/man/kind) cluster or any context you already have, including EKS. The runner uses only the context you name. It does not install a CNI, a registry, or a vendor agent.

A normal pass is **init**, edit `arena.json`, **deploy**, let the product see a healthy app, **fault**, **verify** (full suite only), save `final.txt` (and optionally `intermediate.txt` and `actions.txt`), **archive**, **packet**, **judge**, then **report**. **reset** puts the fixture back so another fault can be injected. **cluster delete** removes a local kind cluster; it does not destroy cloud resources.

Full-suite container images are built with `python3 -m bench.scenarios build-images`, which is a separate module, not a subcommand of **incident-bench**.

# COMMANDS

**init**
> Write `arena.json` (or the path given by **--run**) and exit. Edit `product`, `scenario`, `suite`, `context`, and `judge` before deploying. Refuses to overwrite an existing file.

**catalog**
> Print the scenario names in the configured suite, one per line.

**cluster** **create** | **delete**
> Run `kind create cluster` or `kind delete cluster`. **delete** errors unless **--confirm-delete** is set. Default cluster name is `incident-bench`. Needs Docker and kind on `PATH`. This only manages a local kind cluster.

**render**
> Print the manifests that would be applied. For the full suite, pass **--scenario** or set `scenario` in the run file.

**deploy**
> Apply the baseline application and wait for `deployment/api` to roll out (smoke). The full suite deploys the shop fixture for the configured registry and tag. Requires an explicit Kubernetes context.

**fault**
> Apply the selected scenario's fault. Requires **--scenario** or `scenario` in the run file.

**verify**
> Wait until the expected full-suite failure is visible. Exits with an error when it is not observed within **--timeout** seconds (default 120). The smoke suite has no automated verify; inspect pods, events, and the app yourself.

**evidence**
> Capture pod, event, and application evidence to `evidence.json` under the case directory (or **--out**).

**archive**
> Import the operator-selected final answer into `archive.json` without rewriting it. Reads `final.txt`, and `intermediate.txt` / `actions.txt` when those files exist. **--detection** records whether the product opened an investigation (`detected`, `not_detected`, or `not_measured`). Missing final text is an error.

**adapter**
> Run an external exporter: request JSON on its stdin, an investigation record on its stdout. The record is validated and written to **--out**.

**packet**
> Combine the archive, the scoring rubric, and the scenario answer key into `packet.json`. **--truth** replaces the bundled answer key for that scenario.

**judge**
> Send the packet to the judge configured in `arena.json`, or validate a judgment you already have. With no **--manual** and no **--command**, the built-in adapter calls OpenAI (`OPENAI_API_KEY`), Anthropic (`ANTHROPIC_API_KEY`), or an OpenAI-compatible endpoint (`ARENA_JUDGE_API_KEY`, or the name in `judge.api_key_env`). Writes `judgment.json`. Refuses to overwrite an existing judgment file. Each attempt is kept under `judge-attempts/` next to that file.

**report**
> Read judgment JSON files (arguments, or every `judgment.json` under the run's `output_dir`) and print CSV. **--summary** is one row per metric. **--details** is one row per scenario, including whether it counts in each denominator. **--records** points at investigation archives when detection totals should include cases that were not scored.

**reset**
> Retire the injected fault and restore the baseline. The full suite requires **--confirm-disposable**. Smoke reset restores the app and keeps the storage-fault PVC. Reset does not delete the cluster.

# PARAMETERS

**--run** _FILE_
> Run configuration JSON. Default `arena.json` in the current directory when that file exists. Paths inside the file are relative to the file, not to the working directory. Put this flag before the subcommand.

**--case** _NAME_
> Artifact directory name for a repeated attempt (`output_dir/NAME`). A simple name: it must start with a letter or digit and then use only letters, digits, `.`, `_`, or `-`. Put this flag before the subcommand. It does not change which scenario is injected; change `scenario` for that.

**--context** _NAME_
> Kubernetes context for **deploy**, **fault**, **reset**, **verify**, and **evidence**. Overrides `context` in the run file. There is no fallback to kubectl's current context. The namespace must either be absent or already labelled as this fixture.

**--scenario** _NAME_
> Scenario id from the configured suite. Required for **fault** and **verify** when the run file does not set one. **verify** also accepts `healthy`.

**--image** _REF_
> Override the smoke baseline image with a public image digest.

**--timeout** _SECONDS_
> How long **verify** waits. Default 120.

**--name** _NAME_
> kind cluster name for **cluster**. Default `incident-bench`.

**--confirm-delete**
> Required for **cluster delete**.

**--confirm-disposable**
> Required for **reset** of the full suite.

**--out** _PATH_
> Output JSON path. Default is the case directory: `archive.json`, `packet.json`, `judgment.json`, or `evidence.json`.

**--detection** _STATUS_
> For **archive**: `detected`, `not_detected`, or `not_measured` (the default).

**--suite** **smoke** | **full**
> Override the suite recorded by **archive**.

**--rubric** _FILE_
> Scoring rubric for **packet**. Paths in the run file are relative to that file.

**--truth** _FILE_
> Reviewed ground-truth JSON for **packet**, instead of the bundled answer key.

**--manual** _FILE_
> A finished judgment JSON for **judge** to validate. Mutually exclusive with **--command**.

**--command** _ARGV_ ...
> For **judge**, an external judge program. The packet is written to its stdin and the judgment is read from its stdout. For **adapter**, the exporter program follows the option.

**--summary**
> Report aggregated detection and scoring rates.

**--details**
> Report every scenario and whether it is in each denominator.

**--records** _FILE_ ...
> Investigation record JSON files included in detection totals. Requires **--summary** or **--details**.

# CONFIGURATION

`incident-bench init` writes `arena.json`. Unknown keys are rejected. String fields other than `context` must be non-empty.

**run_id**, **product**
> Names copied into archives and report columns. `product` is the investigating tool's name, not a package to install.

**suite**
> `full` or `smoke`. Default when omitted at runtime is `smoke`. The init template sets `full`.

**scenario**
> Fault to inject. The init template uses `oom`.

**output_dir**
> Where case directories are created. The init template uses `runs/demo`.

**context**
> kubeconfig context of a disposable cluster. Empty until you set it. Commands that talk to Kubernetes refuse to run without it.

**registry**, **tag**
> Full-suite image coordinates. Template values are `fixture.local` and `v1`. Must match what `python3 -m bench.scenarios build-images` pushed or loaded.

**image**
> Smoke baseline image. Overridable with **--image**.

**truths**
> Map of scenario name to a reviewed truth-file path.

**judge**
> Object with `provider` (`openai`, `anthropic`, or `openai-compatible`), `model`, and optional `base_url`, `api_key_env`, `max_output_tokens` (1–131072, default 8192), `timeout` (1–1800 seconds, default 180), `temperature` (0–2), and `reasoning_effort` (`none`, `minimal`, `low`, `medium`, `high`, `xhigh`; not valid for Anthropic). Credentials are an environment variable, never a key inside this file. `base_url` must be HTTPS, except `http` on localhost.

**judge_command**
> Argument array of an external judge program. When this list is non-empty and **--manual** is absent, **judge** runs that program instead of the built-in API adapter. The init template sets it to an empty list.

**rubric**
> Optional path to a custom scoring rubric.

**gitops**
> Optional object for an Argo CD layout (`app_repo` and `fault_repo` checkouts). Direct **deploy** / **fault** mutations fight a self-healing Argo application; use the repository's GitOps guide for that layout.

# ENVIRONMENT

**OPENAI_API_KEY**
> Default credential for `judge.provider` `openai`.

**ANTHROPIC_API_KEY**
> Default credential for `judge.provider` `anthropic`.

**ARENA_JUDGE_API_KEY**
> Default credential for `judge.provider` `openai-compatible`. Override the variable name with `judge.api_key_env`. An empty `api_key_env` allows an unauthenticated local endpoint.

# CAVEATS

Point this only at a disposable cluster. **deploy**, **fault**, and **reset** apply manifests with kubectl. **cluster delete** deletes a kind cluster. Cloud clusters are not torn down by **reset** or **cluster delete**; leftover load balancers and volumes keep billing.

The context is never implicit. A namespace that already exists without the fixture ownership label is refused.

**verify** does not support the smoke suite. A successful **fault** apply is not proof the failure happened; run **verify** on the full suite or inspect smoke yourself.

Judgment files are created exclusively and are not overwritten. Archive, evidence, packet, and judgment JSON are written mode `0600`. Judge API calls can cost money. The same model and rubric should be used for every product you compare. Detection is recorded by the operator at **archive** time; the judge does not decide it.

The full suite's prebuilt application images are Linux AMD64. An Apple Silicon Mac can run the smoke suite on native ARM64 kind nodes, or build `linux/amd64` images for an AMD64 cluster. Python 3.10 or newer is required. Kubernetes commands need kubectl. Local cluster create and delete need Docker and kind.

Installing the project (so that `incident-bench` is on `PATH`) is what publishes the console script. A git checkout runs the identical parser as `python3 -m bench`.

# SEE ALSO

[kubectl](/man/kubectl)(1), [kind](/man/kind)(1), [helm](/man/helm)(1), [k9s](/man/k9s)(1), [k10s](/man/k10s)(1)

# RESOURCES

```[Source code](https://github.com/edgedelta/project-arena)```

```[Documentation](https://github.com/edgedelta/project-arena/blob/master/README.md)```

<!-- verified: 2026-10-08 -->
