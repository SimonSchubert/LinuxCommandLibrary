# TAGLINE

Deprecated name for the SolidCraft headless CLI

# TLDR

**Run** a script under the old name

```solvecraft-cli run [examples/bracket.json]```

Speak **MCP** on stdio the way older client configs did

```solvecraft-cli mcp --in [part.solidcraft]```

# SYNOPSIS

**solvecraft-cli** [_arguments_]

# DESCRIPTION

**solvecraft-cli** is the previous name of **solidcraft-cli**. It is a compatibility program shipped next to that binary for at least one release, so existing scripts and MCP client lines (`solvecraft-cli mcp`) keep working.

On startup it prints one deprecation line to stderr telling you to use **solidcraft-cli**. Stdout is left alone so an MCP JSON-RPC session stays clean. It then runs **solidcraft-cli** with the same arguments and the same standard streams, and exits with that program's status. It looks for **solidcraft-cli** in the same directory as itself first, and on `PATH` otherwise.

Every subcommand and flag is documented on **solidcraft-cli**(1). This page is only the old name.

# CAVEATS

The stderr note appears on every invocation, including MCP. If **solidcraft-cli** cannot be found beside this binary or on `PATH`, **solvecraft-cli** reports that and exits with a failure status. The name is scheduled to be removed in a later release.

# HISTORY

The SolidCraft headless CLI was renamed from **solvecraft-cli** to **solidcraft-cli**. The alias binary is `src/alias.rs` in `apps/solidcraft-cli` of **bherbruck/solidcraft**.

# SEE ALSO

[solidcraft-cli](/man/solidcraft-cli)(1), [openscad](/man/openscad)(1)

# RESOURCES

```[Source code](https://github.com/bherbruck/solidcraft)```

<!-- verified: 2026-10-27 -->
