# TAGLINE

Run one AWS CLI command across many accounts in parallel

# TLDR

**Check** environment, aws CLI, and profile discovery

```awsmux doctor```

**List verified targets** (profiles/regions with STS identity)

```awsmux targets --regions [us-east-1,us-west-2]```

**Run a read-only command** across matching profiles

```awsmux run --profiles '[prod-*]' --format jsonl -- ec2 describe-instances --query 'Reservations[].Instances[].InstanceId'```

**Fan out** with concurrency and exclude patterns

```awsmux run --profiles '[prod-*]' --exclude '[*-sandbox]' --concurrency [100] -- ec2 describe-vpcs```

**Plan a mutating/destructive change** (does not execute)

```awsmux plan -- ssm put-parameter --name [/app/flag] --value [on] --type String```

**Approve a plan** (prints a one-time token)

```awsmux approve [plan-01k...]```

**Apply an approved plan** with the token

```awsmux apply [plan-01k...] --approval-token [token]```

**Serve MCP** for AI agents over stdio

```awsmux mcp```

# SYNOPSIS

**awsmux** _command_ [_options_] [**--** _aws-cli-args_...]

# PARAMETERS

**doctor**

> Verify aws CLI presence, shared config/credentials files, and profile discovery.

**targets**

> List STS-verified account/region targets selected by profile and region filters.

**run**

> Execute an aws CLI invocation across selected targets in parallel. Read-only operations run freely; mutating and destructive ops require confirmation, **--yes** (mutating only), or a plan.

**plan**

> Build an immutable plan for a mutating or destructive aws CLI operation without executing it.

**approve** _PLAN_ID_

> Approve a plan and print a one-time approval token (never stored).

**apply** _PLAN_ID_ **--approval-token** _TOKEN_

> Execute an approved plan. Token is bound to the plan’s SHA-256 hash; tampering refuses apply.

**replay**

> Re-run a past execution from **history**, re-selecting its targets.

**history**

> Show past runs and results.

**mcp**

> Serve the agent interface over stdio (Model Context Protocol). No extra credentials; uses the same AWS profiles as the shell.

Common selection and execution flags (on **run**, **plan**, **targets**, and related commands):

**--profiles** _GLOB_

> Include profiles matching shell-style globs (comma-separated).

**--exclude** _GLOB_

> Exclude matching profiles.

**--regions** _LIST_

> Comma-separated regions to fan out into.

**--dedupe**

> Collapse targets that resolve to the same account, principal, and region (runs STS preflight).

**--concurrency** _N_

> Parallel aws CLI workers (default **100**).

**--timeout** _DURATION_

> Per-target timeout (e.g. **30s**).

**--format** _jsonl_|_table_

> Result stream format.

**--output-dir** _DIR_

> Write one result file per target.

**--interactive**

> Checkbox picker for targets (**run** only).

**--max-errors** _N_ / **--stop-on-access-denied**

> Stop the fan-out when error thresholds are hit.

# DESCRIPTION

**awsmux** fans a single **aws** CLI command out across many accounts and regions in parallel. It discovers profiles from the standard shared config and credentials files (**~/.aws/config**, **~/.aws/credentials**, and **AWS_CONFIG_FILE** / **AWS_SHARED_CREDENTIALS_FILE**), supports SSO, static keys, and **credential_process** profiles unchanged, and always executes through the installed **aws** CLI. Every target is identity-checked with STS before work runs.

Operations are classified into **read_only**, **mutating**, **destructive**, and **unknown** (treated as mutating). Read-only work (e.g. describe/list/get, **s3 ls**) runs freely. Mutating work needs **--yes**, interactive confirm, or an approved plan. Destructive work (delete/terminate/revoke, **s3 rm**, **s3 mv**, **s3 sync --delete**, etc.) never accepts **--yes**; it requires a typed confirm or the plan/approve/apply flow. Some verbs that look read-only are forced mutating (credential-minting STS calls, **s3 presign**, s3api get-object to a local outfile).

Exit codes are stable for automation: **0** all succeeded, **1** some failed, **2** selection/config error, **3** approval required or rejected, **4** stopped by threshold. **awsmux mcp** exposes the same safety model to AI agents over MCP; agents can list targets and run reads, but mutating work returns a plan the human must approve in a real terminal.

# CAVEATS

Requires a working **aws** CLI on **PATH** (or a well-known install path for MCP clients with a sparse GUI PATH). awsmux does not replace credential tools such as **aws-vault**; it runs through the profiles those tools manage. Destructive commands cannot be forced with **--yes**. Plan tokens bind to plan content: editing a plan file after approve invalidates apply. Default concurrency of 100 spawns many aws subprocesses — tune for rate limits and local resources.

# SEE ALSO

[aws](/man/aws)(1), [aws-vault](/man/aws-vault)(1), [go](/man/go)(1)

# RESOURCES

```[Source code](https://github.com/0hardik1/awsmux)```

```[Documentation](https://github.com/0hardik1/awsmux/blob/main/docs/ARCHITECTURE.md)```

<!-- verified: 2026-07-26 -->
