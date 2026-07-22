# TAGLINE

Concord workflow CLI for linting and running flows locally

# TLDR

**Show the installed CLI version**

```concord --version```

**Lint Concord YAML files in the current directory**

```concord lint```

**Lint files in a specific directory with verbose output**

```concord lint -v [path/to/project]```

**Run the default flow defined in concord.yml locally**

```concord run```

**Run with a custom local secret directory**

```concord run --secret-dir=[$HOME/.my_secrets]```

# SYNOPSIS

**concord** **lint** [_options_] [_target_dir_]

**concord** **run** [_options_]

**concord** **--version**

# COMMANDS

**lint** [_dir_]
> Parse and validate Concord YAML files in _dir_ (default: current directory). Checks DSL syntax and expression correctness without executing anything. Cannot verify task invocations, parameter types, or dynamically imported resources.

**run**
> Execute a Concord v2 flow locally without contacting a Concord server. Files from the current directory are copied to **$PWD/target**, dependencies are resolved, and the default flow is run.

# PARAMETERS

**-h**, **--help**
> Show help text.

**-v**, **--verbose**
> Verbose output (lint command).

**--secret-dir** _DIR_
> Directory used by the local secret resolver (default **$HOME/.concord/secrets**).

**--version**
> Print the CLI version.

# DESCRIPTION

**concord** is the command-line companion to the **Concord** workflow orchestration server developed by Walmart Labs. The CLI focuses on the local development loop:

- **Linting** parses **concord.yml** and any imported YAML, validating DSL syntax and expression syntax. It does not require a running Concord server.
- **Running flows locally** executes a flow on the developer machine, resolving Maven dependencies into **$HOME/.concord/depsCache** and Git imports into **$HOME/.concord/repoCache**. Local file-based secrets are resolved from **$HOME/.concord/secrets** (or the directory passed to **--secret-dir**).

Local execution supports standard flow elements, tasks, external dependencies, Git imports, and string/key-pair/credential/file secrets. **Forms**, **profiles**, and **password-protected secrets** are currently unsupported. Local execution forces the runtime to **concord-v2**.

# CONFIGURATION

**concord.yml**
> The flow definition consumed by both **lint** and **run**.

**$HOME/.concord/secrets/_org_/_name_**
> Default location for local secrets, organised by org and secret name. String, key-pair (**name** + **name.pub**), credential (JSON), and file secrets are recognised.

**$HOME/.concord/depsCache/**
> Cached Maven dependencies pulled in during **concord run**.

**$HOME/.concord/repoCache/**
> Cached Git repositories used by imports.

# CAVEATS

Requires **Java 17** or newer in **PATH**. Local **run** is not a full Concord server: forms, profiles, and password-protected secrets do not work. Linting is best-effort and may miss errors that only manifest at runtime, such as missing tasks, wrong parameter types, or unresolved dynamic imports.

# HISTORY

**Concord** was open-sourced by **Walmart Labs** in **2017** as a workflow orchestration and continuous-deployment platform built around YAML-defined flows and a server runtime. The standalone **concord** CLI was added later to give developers a fast local linting and execution loop without round-tripping through the Concord server.

# INSTALL

```brew: brew install concord```

```nix: nix profile install nixpkgs#concord```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[java](/man/java)(1), [git](/man/git)(1), [mvn](/man/mvn)(1), [yq](/man/yq)(1)
