# TAGLINE

KiCad MCP server and guidance installer

# TLDR

**Print usage** without writing any files

```konnect --help```

**Print the version**

```konnect --version```

**Run first-time Claude setup** when stdin is a terminal

```konnect```

**Install** Claude skills, agents, and hooks

```konnect init```

**Install** Codex skills under ~/.agents/skills

```konnect init --client codex```

**Check** whether installed guidance matches this binary

```konnect status```

**Remove** the Codex files Konnect installed

```konnect uninstall --client codex```

**Print** one bundled skill

```konnect skill [kicad-schematic]```

**Show** open schematic write-ahead journals

```konnect transaction status [path/to/project]```

**Finish** journals left by an interrupted multi-file edit

```konnect transaction recover [path/to/project]```

# SYNOPSIS

**konnect** [_subcommand_] [_options_] [_arguments_]

# DESCRIPTION

**konnect** is the command for Konnect, a Rust program that lets an AI assistant edit KiCad designs through the Model Context Protocol. Launched by an MCP client, with stdin piped, it speaks JSON-RPC on stdout. Schematic edits go through Konnect's own S-expression writer. PCB edits talk to KiCad 10 over its IPC API. Exports, ERC, and DRC call **kicad-cli**.

Typed at a shell, the same binary is an installer and a recovery tool. **init**, **status**, and **uninstall** manage the skills Konnect bundles for Claude (under ~/.claude) or Codex (under ~/.agents/skills). **skill** and **hook** print bundled guidance. **transaction** inspects, finishes, or abandons write-ahead journals from multi-file schematic edits.

Releases ship a standalone binary and a KiCad Plugin and Content Manager package. A source build is **cargo build --release -p konnect** and needs **protoc** and **cmake**.

# COMMANDS

**init** [**--client** _CLIENT_]

> Install Konnect's skills for _CLIENT_. For **claude** (the default) this also writes agents under ~/.claude/agents and hook entries in ~/.claude/settings.json. For **codex** it writes skills only. Re-running overwrites files that differ from this binary.

**uninstall** [**--client** _CLIENT_]

> Remove the skills, and for Claude the agents and hook entries, that Konnect installed for _CLIENT_. Other files in those directories are left in place.

**status** [**--client** _CLIENT_]

> Compare each installed skill, agent, and hook with the copy embedded in this binary. Each item is marked **current**, **different**, **missing**, or **unreadable**. Writes nothing.

**skill** _NAME_

> Print one bundled skill as text. Names include **konnect**, **kicad-schematic**, **kicad-pcb**, **kicad-manufacture**, **kicad-review**, and **kicad-library**. Writes nothing.

**hook** _NAME_

> Print one Claude hook response as a single JSON object. Hook names are **pre-pcb-ipc**, **pre-pcb-fallback**, **pre-pcb-closed**, and **pre-pcb-conditional**. Writes nothing.

**transaction status** _PROJECT-DIR_

> List active schematic transaction journals and whether each target file is **pending**, **applied**, or **divergent**. Journal contents are not printed. Writes nothing.

**transaction recover** _PROJECT-DIR_

> Complete active journals, applying the schematic writes they still owe.

**transaction abandon** _PROJECT-DIR_ _ID_ **--force**

> Drop a journal without changing its target files. The abandoned journal is kept and contains complete before-and-after schematic images.

**--client** _CLIENT_

> **claude** or **codex**. On **init**, **uninstall**, and **status** it selects the client. On a server launch it is accepted and does not install guidance.

**--config** _PATH_

> Load this configuration file and skip the search list. A **.json** file is parsed as JSON. Any other extension is parsed as TOML.

**-h**, **--help**

> Print help for the program, or for the named subcommand, and exit. Nothing is written. **konnect help** and **konnect help** _SUBCOMMAND_ do the same.

**-V**, **--version**

> Print **konnect** and the version, then exit.

# CONFIGURATION

The server loads the first file that exists. Later files are ignored, not merged. A broken selected file is an error. Search order:

```
konnect.toml                                          working directory
settings.json                                         working directory
settings.json                                         beside the executable
settings.json                                         parent of the executable
~/.config/konnect/config.toml                         Linux
~/Library/Application Support/konnect/config.toml     macOS
%APPDATA%\konnect\config.toml                         Windows
```

**--config** replaces that list.

A blank **ipc_address** is filled from the **KICAD_API_SOCKET** environment variable, then from the platform's default KiCad socket. The field **ipc_socket_path** is accepted as an alias. **RUST_LOG** overrides **log_level** for the process log, which is written to stderr so it stays off the MCP stdout stream.

```
kicad_cli = "kicad-cli"
kicad_binary = "kicad"
ipc_address = "ipc:///tmp/kicad/api.sock"
transport = "stdio"
http_address = "127.0.0.1:3000"
log_level = "info"
```

**transport** is **stdio** (the default), **http**, or **both**. **http_address** is used when HTTP is enabled. **project_dir** sets the default project. **auto_load_toolsets** and **eager_toolsets** control how much of the tool list is exposed up front. Both default to off.

Guidance install state is recorded under **~/.konnect**.

# CAVEATS

With a terminal on stdin and no subcommand, **konnect** runs first-time Claude setup and waits for Enter. It does not start the MCP server. An MCP client has to launch the binary with stdin piped. The same is true of **konnect --config**: typed at a prompt, it still takes the terminal setup path.

**init** overwrites differing skill files, including local edits. **status** only reports drift.

Live PCB tools need KiCad 10 running with that board open and the KiCad API enabled. Schematic file edits and **transaction** do not need a running KiCad. **kicad-cli** must be on **PATH**, or named by **kicad_cli**, for exports and design checks.

An argument this build does not recognise is an error. A typo such as **--cleint** stops the command.

# HISTORY

Konnect is the Rust successor to **KiCAD-MCP-Server**, the Python and TypeScript MCP server from the same author. It is licensed under the **GNU AGPL-3.0**. Standalone binaries and KiCad plugin packages are published from the project repository.

# SEE ALSO

[claude](/man/claude)(1), [codex](/man/codex)(1)

# RESOURCES

```[Source code](https://github.com/mixelpixx/Konnect)```

```[Documentation](https://github.com/mixelpixx/Konnect/blob/main/README.md)```

<!-- verified: 2026-10-16 -->
