# TAGLINE

Continuous memory and self-improvement layer for coding agents

# TLDR

**Install** komi-learn hooks for Claude Code

```komi-learn install```

**Install** for Codex instead of Claude Code

```komi-learn install --host codex```

**Install non-interactively** with default settings

```komi-learn install --yes```

**Run a health check** and surface issues

```komi-learn doctor```

**Show** current configuration and learning progress

```komi-learn status```

**Update** komi-learn and its agent hooks

```komi-learn update```

**Preview** an update without applying

```komi-learn update --check```

**Edit** a configuration value

```komi-learn config set [recall.semantic] [false]```

**Leave the community pool**

```komi-learn config set pool.repo_url ""```

**Sync** community-pool lessons

```komi-learn sync```

**Review** pending contributions before they are shared

```komi-learn queue```

**Forget** learnings matching a term (archive by default)

```komi-learn forget [topic]```

**Permanently delete** a learned item instead of archiving

```komi-learn forget [topic] --hard```

**Uninstall** hooks (use `--purge` to also delete stored data)

```komi-learn uninstall```

**Move** newly confidential learnings to private storage

```komi-learn reclassify```

# SYNOPSIS

**komi-learn** _subcommand_ [_options_]

# DESCRIPTION

**komi-learn** is a Python CLI that adds a memory and self-improvement loop to coding agents such as **Claude Code** and **Codex**. It installs per-agent hooks that observe sessions and persist durable lessons across runs.

The idea is borrowed from Hermes Agent. Recall and learning happen automatically through hooks; there are no slash commands and nothing to save by hand.

The learning loop has four stages. **Recall** activates relevant lessons at the start of a session. **Distill** analyzes the session transcript after it ends and extracts durable lessons. **Curate** merges overlapping items and archives outdated ones. **Share** optionally contributes user-approved lessons to a community pool: a GitHub repository of Markdown files that are content-addressed (BLAKE3) and signed (Ed25519). Each contribution opens a pull request you reviewed, and other users pull lessons with `komi-learn sync`.

Secrets, machine-specific paths, one-off failures, and "tool X is broken" complaints are filtered by a deterministic check before content is stored or shared. `forget` archives a learning by default and only deletes it with `--hard`. `uninstall` removes hooks; `--purge` also removes stored learnings.

# PARAMETERS

**install**
> Run interactive setup and install the agent hooks. `--yes` accepts defaults. `--host` selects the agent (`claude`, `codex`). `--api-key` supplies a model key for the distill step.

**doctor**
> Verify the installation and report problems.

**update**
> Upgrade komi-learn and its hooks. `--check` previews only.

**status**
> Display configuration and learning progress.

**config**
> Adjust settings, either through a menu or via `config set <key> <value>`.

**login**
> Authenticate the model used for the distill step when no Claude Code login is available.

**sync**
> Pull community-pool lessons.

**queue**
> Review, approve or reject pending contributions to the pool.

**forget** _term_
> Archive learnings matching _term_. `--hard` deletes them permanently.

**reclassify**
> Re-scan memory and move newly confidential learnings to private (.local) storage.

**uninstall**
> Remove hooks. `--purge` deletes all stored data.

# INSTALLATION

```pip install komi-learn```

Optional extras add real signing and local semantic recall:

```pip install "komi-learn[crypto,smart]"```

# CAVEATS

Requires Python 3.10+, Claude Code or Codex, and a working model for distillation (an existing Claude Code login, `komi-learn login`, or an API key). The project is early and not yet battle-tested. komi-learn modifies the host agent's configuration during `install`. Run `komi-learn doctor` after an upgrade to confirm hooks are still valid. The community pool is opt-in, but be aware that lessons you queue for sharing may include excerpts of code or commands from your sessions; review the queue before approving. The multi-signer ranking of pool items is Sybil-resistant but not Sybil-proof, so recalled community items are treated as untrusted input.

# SEE ALSO

[claude](/man/claude)(1), [codex](/man/codex)(1), [aislop](/man/aislop)(1)

# RESOURCES

```[Source code](https://github.com/kurikomi-labs/komi-learn)```

<!-- verified: 2026-11-23 -->
