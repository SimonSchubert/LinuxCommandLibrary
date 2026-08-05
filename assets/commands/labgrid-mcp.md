# TAGLINE

MCP server for labgrid hardware-in-the-loop device control

# TLDR

**Run the demo lab** (no real hardware; prints MCP client config)

```labgrid-mcp demo```

```uvx labgrid-mcp demo```

**Start the MCP server** against a labgrid coordinator (stdio)

```LG_COORDINATOR=[host:20408] labgrid-mcp```

**One-shot via uvx** without a permanent install

```uvx labgrid-mcp```

**Demo on a custom coordinator port**

```labgrid-mcp demo --port [20409]```

# SYNOPSIS

**labgrid-mcp** [_command_] [_options_]

# PARAMETERS

**(no subcommand)**
> Serve the MCP protocol over **stdio**. This is the shape every MCP client spawns. Configuration comes from environment variables (see CONFIGURATION).

**demo** [**--port** _n_]
> Boot a hardware-free local lab: real labgrid coordinator and exporter plus a fake board (power switch and serial console). Prints a paste-ready MCP client snippet. Default port is the demo coordinator port; **Ctrl-C** tears everything down.

# DESCRIPTION

**labgrid-mcp** is a Model Context Protocol (MCP) server that exposes [labgrid](https://github.com/labgrid-project/labgrid) lab operations to AI agents and other MCP clients. labgrid is the open-source framework embedded teams use to share boards ("places") with remotely switchable power, serial consoles, USB muxes, and flashers. This package plugs a gRPC-era labgrid coordinator into MCP so agents can reserve hardware, power-cycle, open consoles, SSH, and (when explicitly allowed) flash devices.

It registers on the order of **47 tools** (list/acquire places, power and I/O, console open/read/send, SSH and tunnels, optional flash jobs, place metadata) plus browseable **labgrid://** resources. Safety gating keeps irreversible families (**flash**, **place_delete**) off unless listed in **LABGRID_MCP_ALLOW**; **LABGRID_MCP_READONLY=1** registers only read-oriented tools.

Identity matches **labgrid-client**: **LG_HOSTNAME** / **LG_USERNAME**, or the real host and user when unset. Network security is delegated to VPN or SSH tunnels, the same trust model as labgrid itself.

# CONFIGURATION

Environment variables (native labgrid **LG_*** plus **LABGRID_MCP_***):

- **LG_COORDINATOR** — coordinator **host:port** (default **127.0.0.1:20408**)
- **LG_HOSTNAME** / **LG_USERNAME** — labgrid client identity
- **LABGRID_MCP_READONLY** — set to **1**/**true**/**yes** for read-only tool registration
- **LABGRID_MCP_ALLOW** — comma-separated tool categories; **flash** and **place_delete** must be listed explicitly to enable
- **LABGRID_MCP_SSH_KEYFILE** — private key path for SSH tools
- **LABGRID_MCP_ACQUIRE_TIMEOUT** — max seconds **acquire_place** waits (default **120**)

# CAVEATS

Needs a running **labgrid ≥ 24** coordinator (gRPC era; tested against 26.x). Python **3.12+**. Old crossbar coordinators cannot connect. Flashing and place deletion are off by default on purpose. Do not share one running server instance across users: each instance holds a single labgrid identity. SSH tools are full remote command execution on the acquired board.

# HISTORY

**labgrid-mcp** is written by **Onur Celep**, licensed **Apache-2.0**, and published on PyPI as **labgrid-mcp**. It depends on **labgrid** (LGPL-2.1-or-later) as an unmodified library dependency.

# SEE ALSO

[ssh](/man/ssh)(1), [pip](/man/pip)(1), [uv](/man/uv)(1)

# RESOURCES

```[Source code](https://github.com/onurcelep/labgrid-mcp)```

```[Homepage](https://pypi.org/project/labgrid-mcp/)```

```[Documentation](https://github.com/onurcelep/labgrid-mcp/blob/main/docs/DESIGN.md)```

<!-- verified: 2026-08-05 -->
