# TAGLINE

Check whether docs changes help coding agents complete real tasks

# TLDR

**Set up** the repository (writes the config and a GitHub workflow)

```dari-docs init```

**Add a task** that a reader of the docs should be able to complete

```dari-docs tasks add "[Install the SDK and make a first API call]"```

**Add tasks** from a file (one per paragraph or bullet)

```dari-docs tasks add --file [docs-tasks.txt]```

**List tasks** and their approval state

```dari-docs tasks list```

**Preview** the changed docs and ablation scripts without calling SelfBench

```dari-docs check --base [origin/main] --head [HEAD] --dry-run```

**Run a check** for a pull request without commenting on it

```dari-docs check --pr [123] --no-comment```

**Stop** a pull request's comparison and delete its ablations

```dari-docs cleanup --pr [123]```

# SYNOPSIS

**dari-docs** _command_ [_options_]

Commands: **init**, **check**, **cleanup**, **tasks add**, **tasks list**

# PARAMETERS

**init**
> Check that the repository is connected to SelfBench, pick a model and credentials, and write **.dari-docs/config.json** and **.github/workflows/dari-docs.yml**. Options: **--dir**, **--org**, **--repo**, **--model**, **--force**.

**check**
> Compare agent results on the configured tasks with the docs before and after a change. In a pull request job it reads the PR from the GitHub event.

**cleanup**
> Stop a pull request's comparison and delete its ablations.

**tasks add** [_TEXT_]
> Have SelfBench write a task from a scenario; options **--title**, **--file**, **--commit**, **--difficulty** (easy, medium, hard).

**tasks list**
> Show every task in the repository, its state, and whether checks run it.

**--base** _REV_, **--head** _REV_
> Revisions to compare (default: the pull request's base/head, else **origin/main** and **HEAD**).

**--pr** _N_
> Pull request number (default: from the GitHub event).

**--dry-run**
> Print the changed docs, both ablation scripts, and the comparison without calling SelfBench.

**--fresh**
> Start a new comparison even if this exact check already ran.

**--no-comment**
> Don't comment on the pull request.

**--github-token** _TOKEN_
> Token used to comment on the pull request (default: **GITHUB_TOKEN**).

**--config** _FILE_, **--repo** _OWNER/NAME_
> Config file and connected repository to use.

# DESCRIPTION

**dari-docs** is a CLI and GitHub bot built on **SelfBench** that measures whether a documentation change helps or hurts coding agents. For each pull request that changes docs, it builds the repository's approved tasks twice as SelfBench repo ablations, once with the changed docs as they were and once as the pull request has them, runs the chosen models on both, and posts a comment listing tasks that now pass, now fail, or fail either way.

Only the paths matching **docs** in the config are swapped between the two runs, so the docs change is the only difference. Pushing again reuses builds for unchanged docs.

# CONFIGURATION

**.dari-docs/config.json**
> Written by **init**. Lists the docs paths, **tasks**, model and credentials, plus options such as **failOnRegression**, **timeoutMinutes** (default 240) and **apiUrl** for a self-hosted SelfBench.

**SELFBENCH_API_KEY**
> Repository secret used by the generated workflow.

# CAVEATS

Requires a SelfBench workspace with the repository connected and the **self-bench** CLI signed in. Model and sandbox usage is billed to the workspace, and each check builds every approved task twice. One trial per task per side means a single flip can be noise. Docs changes over about 64 KB compressed are refused, and pull requests from forks are skipped.

# HISTORY

**dari-docs** is developed by **mupt-ai** in **Go**. Early 2026 releases ran hosted tester and editor agents via **check**/**optimize**; version **0.2.0** (November 2026) rebuilt it as a SelfBench pull-request bot.

# SEE ALSO

[vale](/man/vale)(1), [markdownlint](/man/markdownlint)(1), [gh](/man/gh)(1)

# RESOURCES

```[Source code](https://github.com/mupt-ai/dari-docs)```

```[Documentation](https://docs.selfbench.dev/)```

<!-- verified: 2026-11-23 -->
