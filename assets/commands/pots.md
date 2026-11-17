# TAGLINE

Run a durable chat bot that can use the computer it is installed on

# TLDR

The bot gets **full control** of that computer, with no approval step. Use a machine or VM you can wipe.

**Install** and create the first bot

```npm install -g pi-durable-bot```

```pots init```

**Sign in** to models, or list what is already available

```pots login```

```pots login --list```

**Talk** to a bot in this terminal

```pots chat```

Show the gateway, the service, and each bot

```pots status```

Install the gateway as a **background service**

```pots service install```

On Linux, install it as a **system** service

```pots service install --system```

Follow the service **log**

```pots service logs```

**Add** another bot

```pots bot new [name] --about "[what it is for]"```

Show what a bot **did**

```pots trace```

List or **stop** child agents

```pots children```

```pots children --stop-all```

# SYNOPSIS

**pots** _COMMAND_ [_OPTIONS_]

# DESCRIPTION

**pots** is the command for pi-durable-bot. The npm package name is `pi-durable-bot`. The binary is `pots`. It needs Node.js 24 or newer. `pots init` asks for a name, a model, who judges group messages that do not mention the bot, and an optional one-line purpose. It then starts a gateway that comes back at login.

Commands:

- `init` — first bot, or another one
- `login` — models and API keys for every bot on this computer. `--list` shows what can be used. `--link` prints a login URL for another device
- `mcp add|remove|list|login|logout` — MCP servers shared by every bot. `pots mcp add SERVER -- COMMAND...` runs a local server. `--url` adds a remote one
- `chat` — talk in this terminal
- `status` — gateway, service, and bots
- `service install|uninstall|restart|logs` — launchd on macOS, systemd on Linux, Task Scheduler on Windows. `--system` on Linux installs a system unit
- `start` — run the gateway in the foreground
- `bot new|list` — create and list bots
- `trace` — recent wakes and the runs they started
- `children` — longer-running child agents. `--stop ID` or `--stop-all` stops them

Models are pi model ids (`provider/modelId`), stored per bot in `bot.json`. Logins and keys live in `~/.pi/agent/`, shared with the pi coding agent if that is installed. MCP config is `~/.pi/agent/mcp.json` for every bot, or `.pi/mcp.json` inside one bot's `workspace/` directory.

# CONFIGURATION

Bot state is `~/.pots/`. Set this variable to use another directory:

```POTS_HOME``` Model and judge fields in `bot.json` are `model`, `thinking` (`off`, `minimal`, `low`, `medium`, `high`, `xhigh`, `max`), and `judge` (`off`, a classifier model id, or `main`).

# CAVEATS

There is no per-action approval. The process can use the shell, the screen, and the files of the account it runs as. The project tells you to give it a computer of its own. Uninstall the service with `pots service uninstall` before removing the npm package. The `~/.pots/` directory remains until you delete it.

# SEE ALSO

[npm](/man/npm)(1), [node](/man/node)(1), [systemctl](/man/systemctl)(1)

# RESOURCES

```[Source code](https://github.com/Crokily/pi-durable-bot)```

```[Documentation](https://github.com/Crokily/pi-durable-bot#pi-durable-bot-pots)```

<!-- verified: 2026-11-17 -->
