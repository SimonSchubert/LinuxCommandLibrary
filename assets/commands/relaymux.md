# TAGLINE

Local tmux-based meta-harness for coding agents

# TLDR

**Set up** relaymux with Telegram remote control

```relaymux setup --telegram --telegram-bot-token '[token]'```

**Check** service status

```relaymux status```

**Launch** an agent on a repository

```relaymux launch --repo [~/code/my-app] --agent [claude] --name [fix-tests] --prompt "[Fix the failing tests]"```

**Send** a test notification

```relaymux notify --from [test] --reply-mode telegram --message "[hello]"```

# SYNOPSIS

**relaymux** _subcommand_ [_options_]

# DESCRIPTION

**relaymux** is a lightweight local meta-harness that runs command-line coding agents inside visible **tmux** sessions while letting you monitor and reply to them remotely. Each agent run gets its own tmux tab on your machine, so the work stays local and inspectable, and Telegram acts as the remote control channel for status updates and prompts.

It orchestrates existing agent CLIs (for example **claude**, **codex**, or **pi**) rather than replacing them, making it useful for kicking off and supervising long-running agent tasks from a phone.

# SUBCOMMANDS

**setup**
> Initialize configuration, including Telegram integration.

**status**
> Report the status of the relaymux service and running agents.

**launch**
> Start an agent run on a given repository with a prompt.

**notify**
> Send a manual notification through the configured reply channel.

**db**
> Perform database operations (requires the system **sqlite3** CLI).

# PARAMETERS

**--telegram**
> Enable Telegram integration (used with **setup**).

**--telegram-bot-token** _token_
> Telegram bot authentication token.

**--repo** _path_
> Repository or workspace path for the agent run.

**--agent** _name_
> Agent CLI to launch (for example **claude**, **codex**, or **pi**).

**--name** _name_
> Label for the agent run.

**--prompt** _text_
> Task instructions passed to the agent.

**--from** _source_
> Notification source label (used with **notify**).

**--reply-mode** _channel_
> Reply channel, for example **telegram**.

**--message** _text_
> Notification body (used with **notify**).

# CAVEATS

Requires Node.js 20+, npm, **tmux**, and a local agent CLI to drive. Database operations need the system **sqlite3** command on the PATH.

# HISTORY

**relaymux** is written in TypeScript and released under the MIT license. It was published in 2026 as a way to supervise local coding agents remotely without handing control to a hosted service.

# SEE ALSO

[tmux](/man/tmux)(1), [screen](/man/screen)(1), [zellij](/man/zellij)(1), [claude](/man/claude)(1)

# RESOURCES

```[Source code](https://github.com/mupt-ai/relaymux)```

<!-- verified: 2026-06-19 -->
