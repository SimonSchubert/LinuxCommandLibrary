# TAGLINE

Record Terraform runs with git context and timing

# TLDR

**Record a Terraform apply**

```tfjournal -- terraform apply```

**Record with a workspace label**

```tfjournal -w [prod] -- tofu plan```

**Open the TUI** to browse recorded runs

```tfjournal```

**List recent failed runs**

```tfjournal list --since 7d --status failed```

**List runs that actually changed resources**

```tfjournal list --action apply --has-changes```

**Show a run** with its captured output

```tfjournal show [run_abc123] --output```

**Start the web UI** on a custom port

```tfjournal serve -p [9090]```

# SYNOPSIS

**tfjournal** [_options_] **--** _terraform-command_

**tfjournal** [_filters_]

**tfjournal** **list** [_workspace-pattern_] [_options_]

**tfjournal** **show** _run-id_ [_options_]

**tfjournal** **serve** [_options_]

# PARAMETERS

**-w**, **--workspace** _NAME_
> Workspace name (default: auto-detected).

**--since** _DURATION_
> Show runs since a duration, for example 7d or 24h.

**--status** _STATUS_
> Filter by status: success or failed.

**--user** _USER_
> Filter by user.

**--program** _PROGRAM_
> Filter by program: terraform, tofu, or terragrunt.

**--branch** _BRANCH_
> Filter by git branch.

**--has-changes**
> Show only runs with actual changes.

**-n**, **--limit** _N_
> Maximum runs to show (default: 100 in the TUI, 20 for **list**).

**--action** _ACTION_
> With **list**, filter by plan, apply, destroy, import, or taint.

**--json**
> With **list** or **show**, output as JSON.

**--output**
> With **show**, print the captured output.

**-p**, **--port** _PORT_
> With **serve**, port to listen on (default: 8080).

**-b**, **--bind** _ADDRESS_
> With **serve**, address to bind to (default: 127.0.0.1).

# DESCRIPTION

**tfjournal** wraps terraform, tofu, and terragrunt commands to capture output, timing, exit codes, and git context (commit, branch, user, CI provider). It parses resource-level events and can display them as Gantt charts in a TUI or web UI, with an optional S3 backend for sharing run history across teams.

# CONFIGURATION

Runs are stored in **~/.local/share/tfjournal/**, which **TFJOURNAL_STORAGE_PATH** overrides. Set **TFJOURNAL_S3_BUCKET**, **TFJOURNAL_S3_REGION** and optionally **TFJOURNAL_S3_PREFIX** to sync runs to S3. **TFJOURNAL_USERNAME** and **TFJOURNAL_PASSWORD** enable basic auth for the web UI, and **TFJOURNAL_PORT** and **TFJOURNAL_BIND** set its defaults.

# HISTORY

**tfjournal** was created by **Owloops** and is written in **Go**.

# SEE ALSO

[terraform](/man/terraform)(1), [tofu](/man/tofu)(1), [terragrunt](/man/terragrunt)(1)

# RESOURCES

```[Source code](https://github.com/Owloops/tfjournal)```

<!-- verified: 2026-11-09 -->
