# TAGLINE

Validate and run GitHub Actions workflows locally

# TLDR

**Launch** the interactive TUI

```wrkflw```

**Validate** workflows in the repo

```wrkflw validate```

**Run** a workflow locally

```wrkflw run [workflow.yml]```

# SYNOPSIS

**wrkflw** [*command*] [*options*]

# DESCRIPTION

**wrkflw** validates and executes GitHub Actions workflows on your machine using Docker, Podman, or secure emulation. It offers a TUI for browsing workflows, execution logs, DAGs, triggers, and secrets—useful before pushing CI changes.

# PARAMETERS

**validate**

> Structural/syntax checks on workflow files.

**run** *workflow*

> Execute locally with container or emulation backend.

Default TUI mode lists workflows and past runs. See **wrkflw --help** for watch mode and backend flags.

# CAVEATS

Not every GitHub-hosted capability is reproducible offline (actions marketplace, OIDC, service networking). Docker socket access has security implications. Secrets handling must stay local.

# INSTALL

```brew: brew install wrkflw```

```nix: nix profile install nixpkgs#wrkflw```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[act](/man/act)(1), [docker](/man/docker)(1), [gh](/man/gh)(1)

# RESOURCES

```[Source code](https://github.com/bahdotsh/wrkflw)```

<!-- verified: 2026-07-19 -->
