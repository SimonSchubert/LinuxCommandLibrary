# TAGLINE

programmatic After Effects control for agents and scripts

# TLDR

**Start** the controller (WebSocket, REST, UI, MCP endpoint)

```aftr controller
npx aftr-studio controller```

Start the **stdio MCP** adapter (controller must already be running)

```aftr mcp
npx aftr-studio mcp```

Run the headless **simulator** (no After Effects)

```aftr sim```

# SYNOPSIS

**aftr** _command_ [_options_]

# DESCRIPTION

**aftr** (packages **aftr-studio** on npm/PyPI) is a bridge that drives Adobe After Effects from code and AI agents. A Node controller hosts WebSocket and REST APIs; a CEP panel inside After Effects executes ExtendScript commands and streams render progress. Agents and UIs connect to the controller instead of scripting AE directly.

Typical setup: install the CEP panel once from a clone (**npm run deploy:panel**), open **Window → Extensions → aftr** in After Effects, run **aftr controller**, then attach Claude Code or another MCP client to **http://127.0.0.1:8787/mcp** (or the stdio MCP via **aftr mcp**). Commands cover comps, layers, keyframes, effects, text animators, VFX presets, and non-blocking **aerender** jobs. A headless simulator exercises the same protocol without AE.

# PARAMETERS

**controller**
> Start the bridge server (default **127.0.0.1:8787**)

**mcp**
> Stdio MCP server that forwards tools to a running controller

**sim**
> Headless AE panel simulator for tests and demos

# CONFIGURATION

Root **config.json** sets host, port, paths, and timeouts. Environment overrides include **AE_BRIDGE_HOST**, **AE_BRIDGE_PORT**, **AE_BRIDGE_TOKEN** (auth when exposing beyond loopback), **AE_BRIDGE_AERENDER**, **AE_BRIDGE_FFMPEG**, and **AE_BRIDGE_ALLOW_DEV**. Requires After Effects 2024–2026, Node 18+, and **ffmpeg** on **PATH** for pipeline features.

# CAVEATS

Full creative control needs a licensed After Effects install and a deployed, signed CEP panel. Exposing the controller beyond localhost without **AE_BRIDGE_TOKEN** is unsafe. macOS and Windows only for real AE; Docker image serves controller without the panel.

# SEE ALSO

[ffmpeg](/man/ffmpeg)(1)

# RESOURCES

```[Source code](https://github.com/Arman-Luthra/aftr)```

```[Homepage](https://www.npmjs.com/package/aftr-studio)```

<!-- verified: 2026-07-14 -->
