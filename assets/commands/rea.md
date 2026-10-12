# TAGLINE

Reverse-engineering CLI and MCP server for binaries, apps, and runtime behavior

# TLDR

**Register** REA with coding agents (preview, then approve)

```rea setup```

Plan the same changes **without writing files**

```rea setup --dry-run --json```

Check **host and provider** readiness

```rea doctor --json```

Inspect a **JavaScript / Electron** app directory or ASAR

```rea analyze-javascript-application [/absolute/path/to/app] --json```

Native **overview** with Ghidra (Hopper and IDA also work)

```rea analyze [/absolute/path/to/program] --provider [ghidra] --json```

**Search**, **decompile**, and **xrefs** at an address

```rea search [/absolute/path/to/program] "[query]" --provider [ghidra] --json```

```rea decompile [/absolute/path/to/program] [0x1000] --provider [ghidra] --json```

List **analysis providers**

```rea providers --json```

**Update** a global npm or Bun install

```rea update```

# SYNOPSIS

**rea** [_--json_] _command_ [_options_] [_args_]

**rea-agents** _command_ [_options_] [_args_]

# DESCRIPTION

**rea** (Reverse Engineer Anything) inspects native binaries, JavaScript and Electron apps, .NET assemblies, websites, firmware, Android packages, and related artifacts, and returns findings with the evidence behind them. The same workflows are exposed as a one-shot CLI and as an MCP server for coding agents. Analysis runs locally.

The npm package is **rea-agents**. `package.json` installs two bins, **rea** and **rea-agents**, both `scripts/rea.mjs`. Node.js **22.19+**, **24.11+**, or **26+** is required. After `npm install --global rea-agents`, use **rea**. Without a global install, `npx -y rea-agents@latest` runs the same CLI; `npx rea-agents setup` is the documented first step.

**rea setup** registers the MCP server and matching workflow instructions with selected agents (Claude Code, Codex, Cursor, Gemini CLI, Grok Build, and others). It previews paths and changes and asks for approval before writing files or optionally installing Hopper. **rea doctor** is read-only. **rea update** updates only the npm or Bun global installation that owns the running CLI. **rea uninstall** removes REA-owned agent registrations and skill files; **--purge-data** also removes cache and state under `~/.rea`.

Native analysis needs a configured **Hopper**, **Ghidra**, or **IDA** provider (`--provider` or `REA_ANALYSIS_PROVIDER`). Static JavaScript analysis needs no native engine. Default terminal output is TOON; **--json** is indented on a TTY and compact when piped. Exit **0** means the operation completed (the result may still include partial evidence); **1** is a failure; a cancelled setup also exits **0**.

`rea --help` lists the full command catalog (inspect, decompile, function, capture-process, inspect-artifact, inspect-go-binary, inspect-managed-artifact, firmware and Android helpers, Frida, ADB, browser and Electron observation, evidence import/export, and more). Each command's **--help** documents its arguments.

# COMMANDS

**setup**
> Register MCP access and the bundled skill with selected agents. **--client** _id_ (repeatable) skips the picker. **--all-detected** configures every detected supported client. **--skill=false** omits the workflow. **--dry-run** returns status `planned` and exits 0. **--yes** applies an explicit scope; without a scope it only refreshes existing REA registrations. **--install-hopper** is required to install missing Hopper non-interactively. **--json** prints the plan.

**doctor**
> Read-only readiness. **--provider** _hopper_|_ghidra_|_ida_, **--client** _id_, **--skill**, and **--json** narrow or format the report. Exit 1 when required checks in the selected scope fail.

**update**
> Install the resolved release into the owning npm prefix or Bun global directory, then verify the new version. Does not reopen onboarding.

**uninstall** [**--purge-data**]
> Remove REA-owned MCP registrations and skill files. **--purge-data** also deletes `~/.rea` cache and state. Hopper, Node.js, Evidence files, and other MCP servers stay.

**analyze** / **inspect** _PATH_ [**--provider** _id_] [**--snapshot** _path_] [**--json**]
> Native binary overview. **inspect** is the same workflow.

**analyze-javascript-application** _PATH_ [**--json**]
> Static graph of an extracted app directory or `.asar` (modules, imports, Electron boundaries, evidence).

**search** _PATH_ _query_ [**--provider** _id_]
> Search strings and procedures in a native target.

**function** _PATH_ _name-or-address_ [**--provider** _id_]
> Function dossier.

**decompile** _PATH_ _address_ [**--provider** _id_]
> Pseudocode for a procedure.

**xrefs** / **trace** / **instructions**
> Cross-references, feature trace, and assembly for a native target (provider required).

**providers** / **capabilities** [**--json**]
> Available binary-session providers and auxiliary capabilities.

**inspect-go-binary** _PATH_ [**--json**]
> Embedded Go build metadata; no Go toolchain or disassembler required.

**inspect-managed-artifact** / **inspect-managed-members** _PATH_ [**--type** _name_] [**--json**]
> .NET PE/CLI metadata and CIL without loading the assembly.

**evidence-import** / **evidence-export** / **compare** / **inspect-analysis-view**
> Validate, canonicalize, compare, or project saved Evidence JSON.

**mcp**
> Run the MCP server on stdio (`rea mcp` or `rea --mcp`).

# PARAMETERS

**--json**
> Machine-readable JSON instead of the default TOON terminal format.

**--provider** _id_
> Native analysis engine (`hopper`, `ghidra`, `ida`). Overrides **REA_ANALYSIS_PROVIDER**.

**--snapshot** _path_
> Reuse or update a local analysis snapshot (owner-only permissions). An exact cache hit is read before starting a provider process.

# CONFIGURATION

**REA_ANALYSIS_PROVIDER**
> Standing native-provider preference when **--provider** is omitted.

**REA_GHIDRA_STARTUP_TIMEOUT_MS** / **REA_HOPPER_STARTUP_TIMEOUT_MS**
> Provider startup deadline for large binaries.

**REA_MCP_MAX_RESPONSE_BYTES**
> MCP response budget (minimum 10485760). Restart the server after changing it.

**REA_JEB_MCP_URL**
> Optional JEB client serving MCP for JEB project tools.

**~/.rea**
> Cache and state. **rea uninstall --purge-data** removes it.

# CAVEATS

Native commands need a working Hopper, Ghidra, or IDA install; **rea doctor --provider** diagnoses one engine. Static JavaScript and .NET inspection read files without running the app; runtime capture (browser, Electron, process, ADB) uses your user permissions. Application Evidence for a real app can be hundreds of megabytes: save **--json** to a file and project a summary with **inspect-analysis-view**.

`rea update` does not upgrade a source checkout or an `npx` copy; use `npx rea-agents@latest` for those. Setup will not install Hopper without explicit approval (**--install-hopper** when non-interactive). Historical-source import needs safe no-follow file opens on Linux or macOS (`unsupported_host` on native Windows).

# HISTORY

**REA** is an MIT-licensed project by **morluto**. Early trees were an MCP bridge for Hopper (`betterBinaryMCP`); the published **rea-agents** package (6.4.0 on npm as of 2026-10-11) is a CLI plus MCP catalog covering native providers, JavaScript/Electron, managed code, firmware, Android, and evidence workflows.

# SEE ALSO

[radare2](/man/radare2)(1), [r2](/man/r2)(1), [objdump](/man/objdump)(1), [readelf](/man/readelf)(1), [ida](/man/ida)(1), [frida](/man/frida)(1), [binwalk](/man/binwalk)(1), [jadx](/man/jadx)(1), [adb](/man/adb)(1), [npm](/man/npm)(1), [npx](/man/npx)(1), [node](/man/node)(1)

# RESOURCES

```[Source code](https://github.com/morluto/rea)```

```[Homepage](https://rea.tools/)```

```[Documentation](https://rea.tools/guides/)```

<!-- verified: 2026-10-12 -->
