# TAGLINE

Configure OpenCode as a private team of coding agents on local Ollama models

# TLDR

**Preview** the recommendation, downloads, and files without writing anything

```local-coder --dry-run```

Run the **interactive setup** (global OpenCode config)

```local-coder```

Set up with the **minimal** preset and skip questions

```local-coder --yes --preset minimal```

Configure **this repository** instead of the global config

```local-coder --project```

Write config from models **already downloaded**

```local-coder --yes --preset balanced --no-pull```

Show the **current setup**

```local-coder status```

List models the catalogue would **assign on this machine**

```local-coder models```

**Rebuild** generated files from the last saved selection

```local-coder reinstall --dry-run```

**Remove** generated files, and models only this setup still owns

```local-coder uninstall --dry-run```

Check a task contract **against the repository**

```local-coder verify-contract [contract.json] --root [path/to/repo] --changed [src/file.ts]```

# SYNOPSIS

**local-coder** [_setup_|_configure_|_reinstall_|_uninstall_|_status_|_models_] [_options_]

**local-coder verify-contract** _contract.json_ [**--root** _path_] [**--baseline** _json_] [**--changed** _path_ ...]

# PARAMETERS

**--project** [_path_]

> Write **<path>/.opencode** instead of **~/.config/opencode**. With no path, the current directory is used.

**--preset** _name_

> One of **balanced**, **quality**, **fast**, or **minimal**. **minimal** reuses one compatible model for every role.

**--catalog** _path_

> Read a compatible versioned model catalogue. The bundled **catalog/models.json** is the offline fallback.

**--yes**, **-y**

> Accept defaults without the interactive confirmation.

**--backup**

> Copy existing generated files aside before replacing them. Interactive setup offers backups on its own. **--yes** creates them only when this flag is set.

**--no-pull**

> Do not download models. Context variants are created only from models already present.

**--skip-validation**

> Skip inference and runtime probes. Setup then warns that the configuration was not validated.

**--dry-run**

> Print the plan and exit. Nothing is written or downloaded.

**-h**, **--help**

> Print the usage summary. The summary names the command **local-coder** even when you launched the **setup-ai** alias.

# COMMANDS

**setup**

> Default when no command is given. Detect hardware, recommend models, assign roles, write OpenCode configuration, and run capability probes.

**configure**

> Same operation as **setup**.

**status**

> Show the recorded setup for the selected global or project destination.

**models**

> Show catalogue recommendations for this machine.

**reinstall**

> Rewrite generated configuration and agent files from the last saved selection. It does not download, replace, test, or remove Ollama models.

**uninstall**

> Restore files that existed before setup, delete files this tool created, and remove models downloaded for that scope when no other local-coder scope still uses them. Pre-existing and shared models stay.

**verify-contract** _contract.json_

> Check file existence, contents, hashes, JSON pointers, changed paths, protected values, and validation results for one task contract. The process exits unsuccessfully when anything disagrees. Validation commands are an executable plus an argument array, run without a shell.

# DESCRIPTION

**local-coder** builds a local coding-agent environment on top of **Ollama** and **OpenCode**. It reads the machine's memory, GPU, and disk, picks models that fit, and assigns them to seven roles: **orchestrator**, **explorer**, **planner**, **researcher**, **coder**, **verifier**, and **reviewer**. A single model may fill several roles. The **minimal** preset uses one model for all seven.

The orchestrator is the user-facing OpenCode agent. It is instructed to pick a workflow instead of calling every role every time: coder then verifier for a trivial edit, explorer then coder then verifier for ordinary work, and planner plus reviewer when the change is larger. The researcher is for configured web lookups, not for ordinary repository edits.

Setup's probes check more than a model reply. A selected model must emit a real tool call, the coder role must edit a temporary file and reread it, the orchestrator must delegate, the verifier must reject seeded bad evidence, and an end-to-end OpenCode run must leave the expected bytes on disk with a completed coder task and a verifier pass. If those live probes fail and the runtimes are available, setup refuses to write the configuration.

The package also installs the command as **setup-ai**. Both names run this same program. With no subcommand, either name starts setup.

The documented install is a clone of the repository, then **npm install** and **npm link** inside it (Node.js 20 or newer). That link step puts **local-coder** and **setup-ai** on **PATH**. The **prepare** script compiles TypeScript during install.

# CONFIGURATION

Global setup writes **~/.config/opencode**. **--project** writes **<path>/.opencode** instead.

A finished setup leaves **opencode.json** (or merges an existing **opencode.jsonc**), **AGENTS.md**, one markdown file per role under **agents/**, **local-coder-state.json**, and **local-coder-ownership.json**. Unrelated providers, MCP servers, plugins, and instructions in an existing config are kept. Invalid existing JSON stops setup before it overwrites anything.

Cross-scope model ownership is recorded in **${XDG_DATA_HOME:-~/.local/share}/local-coder/registry.json**. Older installs without ownership records are left for manual review rather than deleted on a guess.

Ollama traffic from this tool goes to **127.0.0.1**. OpenCode sharing stays disabled unless the existing config already says otherwise. Model downloads and **npm install** still use the network. If the researcher role uses configured web tools, those queries leave the machine.

# CAVEATS

Requires **macOS or Linux**, **Node.js 20+**, a running **Ollama** when models must be downloaded or tested, and **OpenCode** for the generated environment. The project states that the smallest bundled option needs about **9 GB** of usable model memory and **11 GB** of free disk, plus a 5 GB reserve after downloads. **Git** and **ripgrep** are detected and recommended.

Probes show that the chosen models completed a controlled workflow at setup time. Later interactive tasks still depend partly on the generated agent instructions. **--skip-validation** writes a configuration that has not been checked.

**verify-contract** rejects shell-string validation commands, disallowed operations, and working directories outside the repository. Semantic requirements in a contract still need the verifier agent. The command exits unsuccessfully when the contract and the tree disagree.

**uninstall** keeps timestamped backups, because they may contain user data. It removes a model only when no remaining local-coder scope uses it.

# HISTORY

**local-coder** was published in **September 2026** (GitHub repository created 2026-09-16). It is written in **TypeScript** and released under the **MIT License**. The npm registry does not host a package by this name; the command is linked from a checkout.

# SEE ALSO

[setup-ai](/man/setup-ai)(1), [opencode](/man/opencode)(1), [ollama](/man/ollama)(1), [node](/man/node)(1), [npm](/man/npm)(1), [rg](/man/rg)(1), [git](/man/git)(1)

# RESOURCES

```[Source code](https://github.com/gmarland/local-coder)```

```[Documentation](https://github.com/gmarland/local-coder/blob/main/README.md)```

<!-- verified: 2026-09-21 -->
