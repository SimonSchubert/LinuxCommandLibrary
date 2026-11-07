# TAGLINE

Measure whether a change helped a coding agent

# TLDR

Install the CLI (Node.js 22.13 or newer)

```npm install -g @withgauge/cli```

Download the local **runtime** image

```gauge local runtime pull```

Create a private `.gauge/` workspace in this project

```gauge init --local```

Also write shared case files

```gauge init --local --cases```

Teach the coding agent where the instructions are

```gauge install-skill```

Sign in to hosted Gauge

```gauge auth login```

Sign in on a remote terminal

```gauge auth login --device```

Run a saved eval locally

```gauge run --eval [eval-id] --local --input [release-notes]```

Compare two runs

```gauge run compare --local --baseline batch=[before-id] --candidate batch=[after-id]```

# SYNOPSIS

**gauge** [_command_] [_options_]

# PARAMETERS

**local runtime pull**

> Download the Docker image pinned to this CLI release. It contains the agent harnesses Gauge runs

**local runtime inspect**

> Show the local runtime Gauge will use

**init --local**

> Create `.gauge/`, including a SQLite database. This does not change tracked files

**init --local --cases**

> Also write `gauge.json`, a `gauge-cases/` directory, and a note in `AGENTS.md`

**init --hosted**

> Point this checkout at the hosted backend

**install-skill**

> Install the Gauge skill so a coding agent can find the CLI's instructions

**auth login** [**--device**]

> Sign in for hosted Chat and Agents. **--device** is the flow without a local browser

**onboard**

> Sign in and create or select a workspace

**eval create --local --name** _name_

> Save an eval in the local database

**run --eval** _id_ [**--local** | **--hosted**] [**--input** _name_] [**--dry-run**] [**--verify**] [**--files** _glob_]

> Execute an eval. **--dry-run** does not spend a full session. **--files** limits which case files are included

**run compare --local --baseline** _batch=id_ **--candidate** _batch=id_

> Compare two local batches

**run analysis save**

> Record findings from a local session. Hosted mode analyzes sessions itself

**run insight**

> Show the evidence for a run

**run list --local -o json**

> List local runs as JSON

**preference create --kind** _open-ended_

> Start a choice study instead of a fixed eval

**instructions** [_topic_] [**--local** | **--hosted**] [**--list**]

> Print the instructions a coding agent should follow. Topics include **init**, **run**, **eval**, **preference**, and **session-analysis**

# DESCRIPTION

**gauge** is the command from the npm package `@withgauge/cli` (gauge-sh/gauge-cli). It runs coding agents against tasks you define, stores the transcripts, and gives you a way to see whether a later change did better. It is meant to be driven by the agent that is editing the project, as well as from the shell.

Local mode needs Docker running Linux containers, plus credentials for Claude Code, Codex, Pi, or OpenCode. **init --local** keeps measurements in `.gauge/`, which should stay uncommitted. **--cases** adds Markdown cases you can commit. Skills and files are read from the working tree. An npm CLI or SDK under test should be packed first. Gauge installs that tarball in the sandbox.

Hosted mode adds docs, authenticated MCP servers, and authenticated APIs. **gauge auth login** (or **--device** on a remote terminal) is required for hosted Chat and Agents. **gauge onboard** picks the workspace.

`gauge instructions` is how an agent learns the current command surface. `gauge --help` and `gauge run --help` cover flags this page does not list.

# CONFIGURATION

**.gauge/**

> Private workspace: SQLite database, backend preference, and local measurements. Do not commit it

**gauge.json**

> Present when shared cases are enabled. Declares inputs and automation

**gauge-cases/**

> Optional Markdown cases for measurements you want to share or run in CI

**AGENTS.md**

> Guidance added by **init --cases** so an agent can find the cases

# CAVEATS

This is not ThoughtWorks Gauge, the acceptance-testing tool. Packages named `gauge` in apt, Homebrew, or GitHub releases are usually that other project. This CLI is installed as `@withgauge/cli`.

Local runs need a working Docker engine and agent credentials. Usage is billed by the agent provider, not by a Gauge package fee described in the CLI readme.

**.gauge/** holds durable results. Deleting it drops the local history.

# HISTORY

Gauge (withgauge) is published by gauge-sh as `@withgauge/cli`. The skill that teaches agents the CLI lives in the companion repository gauge-skills. Product documentation is at docs.withgauge.com.

# SEE ALSO

[npm](/man/npm)(1), [node](/man/node)(1), [docker](/man/docker)(1)

# RESOURCES

```[Source code](https://github.com/gauge-sh/gauge-cli)```

```[Documentation](https://docs.withgauge.com/agents)```

<!-- verified: 2026-11-07 -->
