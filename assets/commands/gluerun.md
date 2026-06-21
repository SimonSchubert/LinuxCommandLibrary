# TAGLINE

Orchestration engine for parallel AI coding agents

# TLDR

**Scaffold** configuration and documentation in the current repository

```gluerun init```

**Validate** dependencies and repository configuration

```gluerun doctor```

**Run one orchestration cycle** (import, recover, integrate, dispatch, snapshot)

```gluerun reconcile --actuate```

**Execute a single task** through the agent pipeline

```gluerun drive [TASK-0001]```

**Run the autonomy loop** within a wall-clock budget

```gluerun auto```

**Pin** a specific engine version

```gluerun update [version]```

# SYNOPSIS

**gluerun** _command_ [_arguments_] [_options_]

# DESCRIPTION

**gluerun** is an orchestration engine that coordinates multiple AI coding agents to work in parallel on a software repository. It implements a multi-tier scheduling model with lease management, audit workflows, and isolated execution using **git worktrees** so that concurrent agents do not interfere with each other.

Each task is dispatched to a supported runner CLI (such as **claude** or **codex**), driven through a pipeline, and then integrated back with an audit trail of the evidence produced. The engine is installed once per machine and pinned per repository through a **.gluerun-version** file, so improvements propagate by bumping the version rather than re-copying scripts.

# PARAMETERS

**init**
> Scaffold the initial configuration and documentation in a consumer repository.

**doctor**
> Validate required dependencies and the repository configuration.

**reconcile** [**--actuate**]
> Run one orchestration cycle: import, recover, integrate, dispatch, and snapshot. Without **--actuate** the cycle is a dry run.

**drive** _TASK-ID_
> Execute a single task through the agent pipeline.

**auto**
> Run the autonomy loop, dispatching work until a wall-clock budget is exhausted.

**update** _version_
> Pin a new engine version for the current repository.

# CAVEATS

Requires Bash 4 or newer, Python 3, Git, and at least one supported agent runner CLI on the PATH. Because the engine grants autonomous agents the ability to edit and commit code, run it only on repositories where you can review the resulting changes.

# HISTORY

gluerun (glueRun-go) is a community project written primarily in Bash and Python, built around git-worktree isolation and task evidence for agentic coding workflows. It is distributed under the GPL-3.0 license.

# SEE ALSO

[git-worktree](/man/git-worktree)(1), [claude](/man/claude)(1)

# RESOURCES

```[Source code](https://github.com/alex-reysa/glueRun-go)```

<!-- verified: 2026-06-22 -->
