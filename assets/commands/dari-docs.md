# TAGLINE

Test documentation clarity with simulated developer agents

# TLDR

**Check** local docs against a developer task

```dari-docs check . --managed --task "[Install the SDK and make a first API call]"```

**Optimize** docs and download proposed edits

```dari-docs optimize . --managed --wait --task "[Install the SDK and make a first API call]"```

**Check** a public docs URL instead of a local directory

```dari-docs check [https://docs.example.com] --managed --task "[Set up auth]"```

**Authenticate** with the hosted dari.dev service

```dari-docs auth login```

**Wait** for a managed run to complete inside the same invocation

```dari-docs check . --managed --wait --task "[...]"```

# SYNOPSIS

**dari-docs** _command_ [_path_|_url_] [_options_]

Commands: **check**, **optimize**, **auth**

# PARAMETERS

**check** _PATH_|_URL_
> Run tester agents against the docs at _PATH_ (local directory) or _URL_ (public docs site) and report where they got stuck.

**optimize** _PATH_|_URL_
> Run tester agents and then editor agents; download proposed doc edits into **.dari-docs/updated/** without touching the repo.

**auth login** / **auth logout**
> Authenticate (or sign out) against the hosted dari.dev Docs service.

**--task** _STRING_
> The developer task the agents should attempt using only the docs. Repeat the flag for multiple tasks.

**--managed**
> Submit the run to hosted Dari Docs agents (default mode). Without it, the CLI expects a **self-managed** setup driven by **dari.yml**.

**--wait**
> Block until the run finishes; print the report and (for **optimize**) download proposed edits.

**--run-id** _ID_
> Resume waiting on or fetch results for a previously submitted run.

**--help**
> Show usage for the CLI or a subcommand.

# DESCRIPTION

**dari-docs** is a CLI for measuring whether technical documentation is clear enough for an AI agent (and, by proxy, a new developer) to complete real tasks unaided. It packages a local docs directory (or accepts a public docs URL) and submits it along with one or more **--task** descriptions to hosted tester agents. The agents read only the provided docs and attempt the task, reporting the exact points where they got blocked, misled, or had to guess.

**check** stops at that diagnostic report. **optimize** additionally runs editor agents that propose concrete documentation edits to fix the issues, downloading them into **.dari-docs/updated/** for human review before any change lands in the repo.

The default **--managed** mode uses Dari's hosted tester and editor agents and is the fastest way to get value. **Self-managed** mode (configured through a **dari.yml** file) lets teams customize agent prompts, skills, setup scripts, and execution environment within their own dari.dev organization.

# CONFIGURATION

**dari.yml**
> Project-level configuration for self-managed runs. Defines tester/editor agent prompts, skills, setup commands, and the docs surface to expose. Only read when **--managed** is not set.

**.dari-docs/**
> Created by the CLI inside the target directory. **updated/** holds proposed edits from **optimize**; review and copy into the repo manually.

**dari.dev account**
> Both managed and self-managed modes require authentication via **dari-docs auth login**, which stores a token in the user's config directory.

# CAVEATS

Runs are billed against a dari.dev account and require network access; **--managed** sends the bundled docs to Dari's hosted agents, so private documentation may need self-managed mode or a private deployment. Proposed edits are agent-generated suggestions and should be reviewed for factual accuracy before merging. Public-URL inputs are fetched by the agents themselves, so paywalled or auth-gated docs cannot be evaluated that way.

# HISTORY

**dari-docs** is developed by **mupt-ai** and lives at **github.com/mupt-ai/dari-docs**, part of the broader **dari.dev** platform for agent-driven documentation quality. It launched as the agent-era successor to traditional docs-linting tools, shifting the measure of quality from style conformance to task completability.

# SEE ALSO

[vale](/man/vale)(1), [markdownlint](/man/markdownlint)(1), [alex](/man/alex)(1)
