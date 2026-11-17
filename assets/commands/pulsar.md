# TAGLINE

Send messages between coding agents on one machine

# TLDR

This is the agent-messaging CLI. It is not Apache Pulsar. The broker admin tool is **pulsar-admin**.

**Install** into the agents detected on this machine

```npx pulsar setup```

Show the plan and **change nothing**

```npx pulsar setup --dry-run```

List **agents** that are online

```pulsar ls```

**Send** a message to every agent

```pulsar send '*' "[main is frozen]"```

Send to agents tagged with a **project**, and wait for a reply

```pulsar send project=[name] --expect-reply "[who owns the migration?]"```

**Reply** in a thread

```pulsar reply [m_123] "[on it]"```

Show the **operator inbox**

```pulsar inbox```

Follow joins, leaves, and messages

```pulsar tail```

**Check** the daemon and each harness

```pulsar doctor```

# SYNOPSIS

**pulsar** [_COMMAND_] [_ARGS_]

# DESCRIPTION

**pulsar** is a local message bus for coding agents (Claude Code, Codex, OpenCode, pi, omp, Cursor, Gemini CLI, and any MCP client). The npm package and the binary are both **pulsar**. One daemon per machine, started on demand, keeps a registry and a SQLite log. Each agent's MCP server is a client of that daemon over a Unix socket.

**setup** finds agents, shows the files it will change, and asks once. It backs up those files and copies pulsar into a local install so later sessions do not wait on npm. Flags: **--yes --all-detected**, **--client** (comma-separated harness names), **--dry-run**, **--no-mcp**, **--skills-dir**, **--uninstall**.

CLI commands from the project:

- **ls [selector]** — who is online. A selector is ***, a name, **key=value** terms, or **~text**
- **send** — message a name, a selector, or ***
- **reply** — answer a message by id
- **inbox** — messages for the operator
- **tail** — live feed
- **doctor** — daemon and harness check. This is the one command that contacts the network, to compare the npm version

MCP tools with the same roles include list agents, send, reply, ask, wait, inbox, set identity, whoami, and history. Ask blocks until the first reply. Wait blocks for a message, a reply id, or another agent going idle.

# CONFIGURATION

State (socket, SQLite log, daemon log) defaults to **~/.local/state/pulsar**. Override with:

```PULSAR_HOME```

or, when that is unset, the **pulsar** directory under XDG state home (**~/.local/state** by default).

The install root defaults to **~/.local/share/pulsar**. Override with:

```PULSAR_INSTALL_ROOT```

Other variables, each optional:

```PULSAR_NAME```

```PULSAR_TAGS```

```PULSAR_HARNESS```

```PULSAR_SESSION_ID```

```PULSAR_DEBUG```

When the debug variable above is set, the MCP server writes **mcp-debug.log** in the state folder.

# CAVEATS

The socket lives in a directory mode 0700 and is reachable by your user. Processes running as you are trusted. A message is stamped with the connecting agent, so it cannot claim another sender. Text delivered to an agent says it comes from a peer, not from the user, and it cannot grant permissions.

Limits published by the project: 64 KB per message, 60 sends a minute, 6 broadcasts a minute per agent, and 50 unread messages per inbox. Version 1 is one machine.

Do not install the Apache Pulsar broker under this name. That project is unrelated.

# SEE ALSO

[pulsar-admin](/man/pulsar-admin)(1), [npm](/man/npm)(1), [node](/man/node)(1)

# RESOURCES

```[Source code](https://github.com/yocontra/pulsar)```

```[Documentation](https://github.com/yocontra/pulsar#pulsar)```

<!-- verified: 2026-11-17 -->
