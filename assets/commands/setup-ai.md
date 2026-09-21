# TAGLINE

Alias for local-coder, which configures a local OpenCode agent team on Ollama

# TLDR

**Preview** setup without writing files or downloading models

```setup-ai --dry-run```

Run **interactive setup**

```setup-ai```

Use the **minimal** preset without prompts

```setup-ai --yes --preset minimal```

Configure the **current project**

```setup-ai --project```

Show **recorded setup**

```setup-ai status```

**Uninstall** preview

```setup-ai uninstall --dry-run```

# SYNOPSIS

**setup-ai** [_setup_|_configure_|_reinstall_|_uninstall_|_status_|_models_] [_options_]

**setup-ai verify-contract** _contract.json_ [**--root** _path_] [**--baseline** _json_] [**--changed** _path_ ...]

# PARAMETERS

**--dry-run**

> Print the plan and exit.

**--yes**, **-y**

> Accept defaults without interactive confirmation.

**--preset** _balanced_|_quality_|_fast_|_minimal_

> Choose a model mix. **minimal** uses one model for every role.

**--project** [_path_]

> Use **<path>/.opencode** instead of **~/.config/opencode**.

**--no-pull**

> Do not download models.

**--backup**

> Back up generated files before **--yes** replaces them.

**--skip-validation**

> Skip inference and runtime probes.

**-h**, **--help**

> Print usage. The text says **local-coder**, which is the name hardcoded in the program.

# DESCRIPTION

**setup-ai** is the second bin name of **local-coder**. After **npm link** in a checkout of that repository, both names point at the same Node.js script. Subcommands, flags, and exit codes match.

With no subcommand it runs setup: detect the machine, assign local **Ollama** models to OpenCode roles, write permission-restricted agent files, and probe whether those models can call tools and survive an edit-and-verify run. **status**, **models**, **reinstall**, **uninstall**, and **verify-contract** behave as they do under **local-coder**.

# CAVEATS

The help banner always prints **local-coder**, including when argv[0] is **setup-ai**. Requirements are the same as **local-coder**: macOS or Linux, Node.js 20 or newer, Ollama, and OpenCode. There is no separate **setup-ai** package on the npm registry.

# HISTORY

The alias is declared in the **local-coder** package **bin** map. That project was published in **September 2026** and is licensed under **MIT**.

# SEE ALSO

[local-coder](/man/local-coder)(1), [opencode](/man/opencode)(1), [ollama](/man/ollama)(1), [npm](/man/npm)(1)

# RESOURCES

```[Source code](https://github.com/gmarland/local-coder)```

```[Documentation](https://github.com/gmarland/local-coder/blob/main/README.md)```

<!-- verified: 2026-09-21 -->
