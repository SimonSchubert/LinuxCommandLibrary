# TAGLINE

Command-line client for a self-hosted Sutra ontology

# TLDR

Run a verb against the instance this checkout is aimed at

```bin/sutra [projects]```

Point at an explicit **base URL**

```bin/sutra --base [http://127.0.0.1:8080] [read]```

Ask for the **guide**

```bin/sutra guide```

**Diagnose** the connection

```bin/sutra diagnose```

# SYNOPSIS

**sutra** [_OPTIONS_] _VERB_ [_ARGS_]

# DESCRIPTION

**sutra** is the babashka client in the Sutra-OS repository. The file you run is `bin/sutra`. It is not published as a distro package. The process must be babashka: that wrapper, or `bb --config clients/sutra-cli/bb.edn -m sutra.cli.main`.

Sutra-OS is a self-hosted ontology platform. Object types, links, and actions live in EDN runbooks. The CLI sends those operations to one instance. License is AGPL.

The client resolves its target in this order: `--base`, an instance name, then these variables, then a git remote, then a production default, then a local default.

```SUTRA_HTTP_URL```

```SUTRA_HTTP_PORT```

Verb names shipped as files in the CLI (run `bin/sutra VERB` without extra flags until you have read that verb):

`access`, `actions`, `apps`, `automations`, `branches`, `checkouts`, `checks`, `constructs`, `data`, `diagnose`, `documents`, `explore`, `feedback`, `graphs`, `guide`, `identity`, `images`, `imports`, `install`, `llm`, `maintenance`, `observe`, `platform`, `projects`, `read`, `sources`, `watch`.

Two more verb files use underscore names. Type them exactly:

```custom_apps```

```widget_sets```

`bin/sutra change` execs a different program, `bin/change`. That name is not a Sutra verb and is not documented here. `bin/sutra-solo` starts the frontend for development. It is not this client. `bin/enta` is a separate tool in the same repository.

Per-verb flags are defined in those verb files. This page does not repeat them. `bin/sutra guide` and `bin/sutra VERB --help`, when the verb implements it, are the source for arguments.

# CAVEATS

The client can install and change an ontology on the instance it targets. Confirm `--base` before a write. File install of an ontology is retired. Use the verbs.

The repository's default branch is `master`.

# SEE ALSO

[curl](/man/curl)(1), [git](/man/git)(1)

# RESOURCES

```[Source code](https://github.com/0nelight/sutra-os)```

```[Documentation](https://github.com/0nelight/sutra-os#sutra-os)```

<!-- verified: 2026-11-17 -->
