# TAGLINE

Continuous memory and self-improvement layer for coding agents

# TLDR

**Install** komi-learn hooks for Claude Code

```komi-learn install```

**Install** for Codex instead of Claude Code

```komi-learn install --host codex```

**Run a health check** and surface issues

```komi-learn doctor```

**Show** current configuration and learning progress

```komi-learn status```

**Update** komi-learn and its agent hooks

```komi-learn update```

**Preview** an update without applying

```komi-learn update --check```

**Edit** a configuration value

```komi-learn config set [key] [value]```

**Sync** community-pool lessons

```komi-learn sync```

**Review** pending contributions before they are shared

```komi-learn queue```

**Forget** a previously learned item (archive by default)

```komi-learn forget [topic]```

**Permanently delete** a learned item instead of archiving

```komi-learn forget [topic] --hard```

**Uninstall** hooks (use `--purge` to also delete stored data)

```komi-learn uninstall```

# SYNOPSIS

**komi-learn** _subcommand_ [_options_]

# DESCRIPTION

**komi-learn** is a Python CLI that adds a memory and self-improvement loop to coding agents such as **Claude Code** and **Codex**. It installs per-agent hooks that observe sessions and persist durable lessons across runs.

The learning loop has four stages. **Recall** activates relevant lessons at the start of a session. **Distill** analyzes the session transcript after it ends and extracts durable lessons. **Curate** merges overlapping items and archives outdated ones. **Share** optionally publishes user-approved lessons to a GitHub-hosted, cryptographically signed community pool so they can be pulled by other users with `komi-learn sync`.

Secrets, absolute paths, and one-off failures are filtered before content is stored or shared. `forget` archives a learning by default and only deletes it with `--hard`. `uninstall` removes hooks; `--purge` also removes stored learnings.

# PARAMETERS

**install**
> Set up the agent hooks. `--yes` accepts defaults. `--host` selects the agent (`claude`, `codex`).

**doctor**
> Verify the installation and report problems.

**update**
> Upgrade komi-learn and its hooks. `--check` previews only.

**status**
> Display configuration and learning progress.

**config**
> Adjust settings, either interactively or via `config set <key> <value>`.

**sync**
> Pull community-pool lessons.

**queue**
> Review pending shared contributions.

**forget** _topic_
> Archive a learned item. `--hard` deletes it permanently.

**uninstall**
> Remove hooks. `--purge` deletes all stored data.

# INSTALLATION

```pip install komi-learn```

Then install hooks for the desired agent:

```komi-learn install```

# CAVEATS

komi-learn modifies the host agent's configuration during `install`. Run `komi-learn doctor` after an upgrade to confirm hooks are still valid. The community pool is opt-in, but be aware that lessons you queue for sharing may include excerpts of code or commands from your sessions; review the queue before syncing.

# SEE ALSO

[claude](/man/claude), [aislop](/man/aislop)
