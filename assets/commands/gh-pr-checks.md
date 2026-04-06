# TAGLINE

Display CI check status on pull requests

# TLDR

**View checks for the current branch's PR**

```gh pr checks```

**View checks for a specific PR**

```gh pr checks [pr-number]```

**Watch checks until they finish**

```gh pr checks --watch```

**Watch checks and exit on first failure**

```gh pr checks --watch --fail-fast```

**Show only required checks**

```gh pr checks --required```

**Output check results as JSON**

```gh pr checks --json [name,state,bucket]```

**Open check details in a web browser**

```gh pr checks --web```

# SYNOPSIS

**gh pr checks** [_number_ | _url_ | _branch_] [_options_]

# PARAMETERS

_number_ | _url_ | _branch_
> Pull request number, URL, or branch name (defaults to current branch).

**--watch**
> Watch checks until they finish.

**-i**, **--interval** _SECONDS_
> Refresh interval in seconds when watching (default 10).

**--fail-fast**
> Exit watch mode on first check failure.

**--required**
> Only show checks that are required.

**-w**, **--web**
> Open the web browser to show details about checks.

**--json** _fields_
> Output JSON with the specified fields. Available fields: bucket, completedAt, description, event, link, name, startedAt, state, workflow.

**-q**, **--jq** _expression_
> Filter JSON output using a jq expression.

**-t**, **--template** _string_
> Format JSON output using a Go template.

**-R**, **--repo** _OWNER/REPO_
> Select another repository using the [HOST/]OWNER/REPO format.

# DESCRIPTION

**gh pr checks** displays the status of CI checks and status checks on a pull request. It shows each check's name, status (pending, passing, failing), and conclusion.

The watch mode enables waiting for checks to complete, useful in scripts that need to proceed only after successful CI runs. The command integrates with GitHub Actions and third-party CI services. When using **--json**, the **bucket** field categorizes the state into pass, fail, pending, skipping, or cancel.

# CAVEATS

Only shows checks reported to GitHub. Some CI systems may have delays in reporting. The **--fail-fast** flag only works in combination with **--watch**. Watch mode is subject to API rate limits.

# SEE ALSO

[gh-pr](/man/gh-pr)(1), [gh-pr-merge](/man/gh-pr-merge)(1), [gh-run](/man/gh-run)(1), [gh-pr-view](/man/gh-pr-view)(1)
