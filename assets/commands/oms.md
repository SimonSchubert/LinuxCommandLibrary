# TAGLINE

durable runtime for supervised parent/subagent teams

# TLDR

Initialize a **workspace** and providers

```oms init```

Install a user **background service** and start it

```oms service install```

Check **service** status

```oms service status```

Run the controller in the **foreground** instead

```oms serve```

Show **migration** status from Banksia, then migrate

```oms migrate-from-banksia```

# SYNOPSIS

**oms** _command_ [_options_]

# COMMANDS

**init** [_--database-url_ _url_]
> First-run setup: workspace, Codex or Claude provider, starter workflows. SQLite is the default; PostgreSQL needs the extra `oh-my-subagents[postgres]`.

**serve**
> Portable foreground controller (http://127.0.0.1:18125/ by default).

**service** **install**|**status**|**restart**|**stop**|**logs**|**uninstall**
> Native per-user service (systemd user unit on Linux). **uninstall** removes the unit but keeps config and the database.

**migrate-from-banksia**
> Move a previous Banksia install onto OMS paths. Run **before** **init** if you still have Banksia data.

**db** **upgrade**|**reset**
> Schema migrations. Do not use **reset** as a rename step.

# DESCRIPTION

**oms** is the CLI for **Oh My Subagents** (PyPI **oh-my-subagents**). A parent agent delegates a wave of child assignments; the controller persists waits, checkpoints, and the lead's Result so a closed terminal does not lose the run. You design reusable responsibility trees (Workflows) in a web Console; the Operator chat uses the same APIs.

Install with **pipx**: `pipx install oh-my-subagents`. Requires Python 3.12+ and a Codex or Claude task provider.

# CAVEATS

The visual Console is under a Sustainable Use License (n8n-derived); the rest of the project is MIT. **init** on a migrated Banksia tree can create an empty new database — migrate first. The background service is per-user, not system-wide.

# HISTORY

Successor to the Banksia controller (same author line). Package name **oh-my-subagents**, command **oms**.

# SEE ALSO

[claude](/man/claude)(1), [codex](/man/codex)(1)

# RESOURCES

```[Source code](https://github.com/ringlochid/oh-my-subagents)```

```[Documentation](https://github.com/ringlochid/oh-my-subagents/blob/main/docs/start/getting-started.md)```

```[Homepage](https://pypi.org/project/oh-my-subagents/)```

<!-- verified: 2026-08-26 -->
