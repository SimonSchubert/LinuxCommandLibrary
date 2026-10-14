# TAGLINE

Deterministic CLI that plans, estimates, and scaffolds cloud infrastructure from a catalog

# TLDR

Install the **CLI** (the agent plugin installs it on first use too)

```go install github.com/bealesh/neckbeard/cmd/neckbeard@latest```

Check **local tools** with no cloud access

```neckbeard doctor -for all```

Draft an **app profile** from the current repository

```neckbeard analyze -dir . -out app-profile.yaml```

Resolve the profile and `neckbeard.yaml` into a **blueprint**

```neckbeard plan -config neckbeard.yaml -profile app-profile.yaml -out blueprint.yaml```

Write a **monthly cost report** from the blueprint (Infracost, no cloud credentials)

```neckbeard estimate -out costs/estimate.md```

**Scaffold** OpenTofu, pipelines, and runbooks into the repo

```neckbeard scaffold -blueprint blueprint.yaml -root .```

Run **V0 static checks** (fmt, init, validate) on the rendered environments

```neckbeard validate -blueprint blueprint.yaml -root .```

Print the bundled **JSON schema** for `neckbeard.yaml`

```neckbeard schema neckbeard```

# SYNOPSIS

**neckbeard** _command_ [_options_]

# DESCRIPTION

**neckbeard** is a Go CLI that turns an application repository into reviewable cloud infrastructure and a monthly cost estimate. Planning, rendering, and validation are deterministic code against a bundled catalog of tested **OpenTofu** modules. The same binary is what the neckbeard coding-agent plugin shells out to; the agent is not required.

The usual loop is **analyze → plan → estimate → scaffold → validate**. `analyze` writes a draft `app-profile.yaml` (facts with file:line evidence, loud assumptions, and open questions). After you answer those questions and write `neckbeard.yaml` (cloud, VCS, runtime, tier), `plan` hashes the inputs into `blueprint.yaml`. `estimate` renders into a scratch tree and prices it with Infracost 0.10.x. `scaffold` writes files under an ownership contract: files neckbeard did not just generate are never overwritten; conflicts land next to the original. `validate` reports V0 static checks only (syntax, schema, policy). Authenticated plan (V1) and deployment verification (V2) are separate and may be reported as **NOT EXERCISED**.

The catalog covers AWS, GCP, and Azure; GitHub Actions or GitLab CI; serverless containers or Kubernetes. The supported workload is one image, up to 10 HTTP/worker/cron processes, Postgres, object storage, and secrets, deployed into existing accounts. Anything else is an explicit `unsupported` finding. Apache-2.0. Status is pre-alpha: live deploy is proven on some serverless paths; Kubernetes, GitLab, and GCP deploy are implemented and not yet exercised.

Install with `go install github.com/bealesh/neckbeard/cmd/neckbeard@latest`, or let the plugin install a sha256-verified release binary on first `/neckbeard:` command.

# COMMANDS

**analyze** [**-dir** _PATH_] [**-out** _FILE_] [**-force**]
> Detect services, needs, and secrets in _PATH_ (default **.**) and write a draft profile (default **app-profile.yaml**). Refuses to overwrite an existing profile unless **-force** is set.

**plan** [**-config** _FILE_] [**-profile** _FILE_] [**-catalog** _PATH_] [**-out** _FILE_]
> Resolve `neckbeard.yaml` (default) and `app-profile.yaml` (default) against the bundled catalog into **blueprint.yaml**. **-catalog** selects an external catalog index.

**estimate** [**-config** _FILE_] [**-blueprint** _FILE_] [**-infracost-bin** _PATH_] [**-out** _FILE_] [**-catalog-source** _SRC_]
> Cost report from the blueprint. Looks for **infracost-0.10**, then **infracost**, on PATH unless **-infracost-bin** is set. Default report: **costs/estimate.md**. No cloud credentials.

**scaffold** [**-blueprint** _FILE_] [**-root** _PATH_] [**-catalog-source** _SRC_]
> Render the blueprint into _PATH_ (default **.**). Reports created, updated, unchanged, adopted, yours, removed, and kept paths. On conflict, writes a sibling file and exits nonzero.

**validate** [**-blueprint** _FILE_] [**-root** _PATH_]
> V0 static checks over the rendered `infra/envs/` trees. Passing V0 is not proof of deployability.

**doctor** [**-for** **plan**|**estimate**|**validate**|**all**]
> Check local prerequisites (default **-for all**). No cloud access. Prints READY/missing for OpenTofu, Infracost, Checkov, and related tools.

**schema** **neckbeard**|**app-profile**|**blueprint**|**environment-manifest**
> Print an embedded JSON schema to stdout.

**presets**
> Print supported tiers, sizing, and usage assumptions as YAML.

**skill install** [**-target** **agents**|**codex**|**cursor**] [**-scope** **project**|**user**]
> Install the agent skill. Default target **agents** (Codex, Cursor, and other SKILL.md tools); default scope **project**.

**release** _verb_ **-env** **dev**|**stg**|**prd** [_options_]
> Experimental lifecycle: **pin**, **promote**, **rollback**, **stage**, **deploy**, **configure-ci**, receipt save/restore, and foundation/database/infra plan/apply. Documented as experimental in the skill; do not treat static validation as deployment proof.

**version**
> Print `neckbeard` and the build version.

# CONFIGURATION

**neckbeard.yaml**
> Cloud, VCS, runtime, tier, and region. Reviewed input to **plan**.

**app-profile.yaml**
> Evidence-backed profile from **analyze**, then human-edited. Open questions go under `confirmed`.

**blueprint.yaml**
> Hash-verified lockfile from **plan**. Scaffold and validate read this file.

# CAVEATS

Pre-alpha. Static validation never claims the stack will deploy. **estimate** needs Infracost 0.10.x for live prices; unpriced resources are named in the report instead of omitted. **scaffold** will not silently overwrite your edits. **release** is experimental. The agent plugin is separate from this CLI.

# SEE ALSO

[tofu](/man/tofu)(1), [terraform](/man/terraform)(1), [checkov](/man/checkov)(1), [git](/man/git)(1), [claude](/man/claude)(1), [codex](/man/codex)(1)

# RESOURCES

```[Source code](https://github.com/bealesh/neckbeard)```

```[Documentation](https://github.com/bealesh/neckbeard/blob/main/README.md)```

<!-- verified: 2026-10-14 -->
