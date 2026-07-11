# TAGLINE

CLI for letting AI coding agents capture screenshots of browser tabs

# TLDR

**Start** the WebSocket daemon that the browser extension connects to

```peeked start```

**List** currently tracked browser tab URLs

```peeked list```

**Capture** a screenshot of the page at a given URL (extension must be connected)

```peeked at http://localhost:3000```

**Check** server and extension connection status

```peeked status```

**Stop** the WebSocket server

```peeked stop```

# SYNOPSIS

**peeked** _command_ [arguments]

# COMMANDS

**start**

> Start the local WebSocket server (on port 7336) that receives screenshot requests and streams to the browser extension. Cleans previous images on start.

**list**

> List all tracked open tab URLs reported by the connected browser extension.

**at** _url_

> Request a screenshot of the specified URL from the connected browser tab. Saves the JPEG to a temporary directory (e.g. `$TMPDIR/peek_cli/images/`).

**status**

> Report whether the server is running and whether a browser extension is connected.

**stop**

> Stop the running WebSocket server process.

# DESCRIPTION

`peeked` is the command-line component of peek-cli. It lets AI coding agents (such as Claude Code, Codex, and others) obtain live screenshots of open browser tabs.

The tool consists of a local WebSocket server started by `peeked start`. A companion Chrome extension connects to the server and forwards screenshots on demand. Agents issue commands through the CLI (or via agent skills/plugins) to list tabs and request captures.

Screenshots are delivered as base64 and written locally by the CLI; the agent never directly accesses the browser or injects code.

Installation:

```bash
npm i -g peeked
```

A matching browser extension must also be installed from the Chrome Web Store.

# CAVEATS

Requires the official Peek CLI Chrome extension; without it the server has no tabs to report or capture from.

The server binds only to localhost. You must explicitly start it on every machine/session before use.

Screenshots are written to a per-user temp directory and are not automatically cleaned except on `start`.

Error messages may refer to outdated command names in some versions (e.g. "peeked begin").

Only provides read-only screenshot capability; no navigation, input, or page manipulation is possible.

# SEE ALSO

[claude](/man/claude)(1), [codex](/man/codex)(1)

# RESOURCES

```[Source code](https://github.com/puffinsoft/peek-cli)```

<!-- verified: 2026-07-11 -->
