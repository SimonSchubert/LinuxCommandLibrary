# TAGLINE

Record Terraform runs with git context and timing

# TLDR

**Record a Terraform apply**

```tfjournal -- terraform apply```

**Record with a workspace label**

```tfjournal -w [prod] -- tofu plan```

**List recent failed runs**

```tfjournal list --since 7d --status failed```

# SYNOPSIS

**tfjournal** [_options_] **--** _terraform-command_

# DESCRIPTION

**tfjournal** wraps terraform, tofu, and terragrunt commands to capture output, timing, exit codes, and git context (commit, branch, user, CI provider). It parses resource-level events and can display them as Gantt charts, with an optional S3 backend for sharing run history across teams.

# HISTORY

**tfjournal** was created by **Owloops** and is written in **Go**.

# SEE ALSO

[terraform](/man/terraform)(1), [tofu](/man/tofu)(1), [terragrunt](/man/terragrunt)(1)
