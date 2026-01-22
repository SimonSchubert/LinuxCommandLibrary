# TLDR

**List workflow runs**

```gh run list```

**View run details**

```gh run view [run-id]```

**Watch a run**

```gh run watch [run-id]```

**Download artifacts**

```gh run download [run-id]```

**Rerun failed jobs**

```gh run rerun [run-id] --failed```

# SYNOPSIS

**gh run** _command_ [_options_]

# PARAMETERS

**list**
> List recent workflow runs.

**view** _RUN-ID_
> View run details.

**watch** _RUN-ID_
> Watch run progress live.

**download** _RUN-ID_
> Download run artifacts.

**rerun** _RUN-ID_
> Rerun a workflow run.

**cancel** _RUN-ID_
> Cancel a running workflow.

**--workflow** _NAME_
> Filter by workflow name.

**--branch** _BRANCH_
> Filter by branch.

**--failed**
> Only rerun failed jobs.

**--help**
> Display help information.

# DESCRIPTION

**gh run** manages GitHub Actions workflow runs from the command line. It provides visibility into CI/CD execution including logs, status, and artifacts without visiting github.com.

The watch command provides live progress updates for running workflows. Download retrieves artifacts produced by workflows. Rerun enables retriggering workflows with options for full or partial reruns.

gh run brings GitHub Actions management to terminal workflows.

# CAVEATS

Requires Actions enabled on repository. Log access may be limited. Artifacts have retention limits.

# HISTORY

gh run was added to the **GitHub CLI** alongside broader GitHub Actions integration, enabling workflow management from the command line.

# SEE ALSO

[gh](/man/gh)(1), [gh-workflow](/man/gh-workflow)(1), [gh-pr-checks](/man/gh-pr-checks)(1)
