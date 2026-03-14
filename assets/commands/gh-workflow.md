# TAGLINE

Manage GitHub Actions workflows from the command line

# TLDR

**List workflows**

```gh workflow list```

**View workflow details**

```gh workflow view [workflow-name]```

**Run a workflow**

```gh workflow run [workflow-name]```

**Enable a workflow**

```gh workflow enable [workflow-name]```

**Disable a workflow**

```gh workflow disable [workflow-name]```

**Run a workflow with input parameters**

```gh workflow run [workflow-name] -f [key]=[value]```

**Run a workflow on a specific branch**

```gh workflow run [workflow-name] --ref [branch-name]```

**View workflow runs in web browser**

```gh workflow view [workflow-name] --web```

# SYNOPSIS

**gh workflow** _command_ [_options_]

# PARAMETERS

**list**
> List workflow files.

**view** _WORKFLOW_
> View workflow details.

**run** _WORKFLOW_
> Trigger a workflow run.

**enable** _WORKFLOW_
> Enable a workflow.

**disable** _WORKFLOW_
> Disable a workflow.

**-r** _REF_, **--ref** _REF_
> Branch or tag for workflow run.

**-f** _KEY=VALUE_
> String input parameters for workflow run.

**-F** _KEY=VALUE_
> Input parameters from file or stdin (use @file or - for stdin).

**-w**, **--web**
> Open workflow in the web browser.

**-a**, **--all**
> Include disabled workflows when listing.

**-L**, **--limit** _N_
> Maximum number of items to list (default 50).

**--json** _FIELDS_
> Output results in JSON format with specified fields.

# DESCRIPTION

**gh workflow** manages GitHub Actions workflows from the command line. It provides control over workflow definitions including listing, viewing, triggering, and enabling or disabling workflows.

The run command triggers workflow_dispatch events, executing workflows on demand with optional input parameters. This enables manual CI runs and parameter-driven workflows from the terminal.

# CAVEATS

Workflow must have workflow_dispatch trigger for manual runs. Enable/disable requires admin access. Inputs must match workflow definition.

# HISTORY

gh workflow was added to the **GitHub CLI** as part of comprehensive GitHub Actions integration, enabling complete workflow management from the terminal.

# SEE ALSO

[gh](/man/gh)(1), [gh-run](/man/gh-run)(1)
