# TAGLINE

AST-powered CLI to visualize codebases and enforce architecture boundaries

# TLDR

**Initialize** project configuration and architecture rules

```onboard init```

**Visualize** a portion of the codebase in an interactive canvas

```onboard map --target "internal/parser" --radius 2```

**Detect** architecture drift against rules

```onboard drift --rules architecture.yml```

**Extract** backend routes for a framework

```onboard routes --protocol rest --framework express```

**Install** via the provided script

```curl -fsSL https://raw.githubusercontent.com/animesh-94/Onboard-CLI/main/install.sh | bash```

# SYNOPSIS

**onboard** <command> [options]

# DESCRIPTION

Onboard-CLI is a Go-based tool that uses Tree-sitter to parse codebases (Go, JS/TS, Python, Java, etc.), build structural graphs, and present them in a local React Flow visualizer. It also supports drift detection against declarative architecture rules and various analysis commands useful for large systems and onboarding.

It spins up a local web UI for exploration and can be integrated into CI for boundary enforcement.

# COMMANDS

**init**
> Generate .onboard configuration and architecture.yml.

**map**
> Map code and launch the visualizer server.

**drift**
> Check for violations of architecture rules.

**routes**
> Extract API routes for supported frameworks.

**impact**, **owners**, **export**, **pulse**
> Additional analysis commands.

# PARAMETERS

Most commands accept `--target`, `--radius`, `--port`, and framework/protocol selectors as appropriate.

# CAVEATS

- The visualizer requires a browser and opens a local port.
- Rule evaluation uses regex on import paths; tune architecture.yml carefully.
- Primarily for developer workflow and CI gatekeeping.

# RESOURCES

```[Source code](https://github.com/animesh-94/Onboard-CLI)```
```[Homepage](https://onboard-cli.vercel.app)```
```[Documentation](https://github.com/animesh-94/Onboard-CLI#readme)```

<!-- verified: 2026-07-10 -->

# SEE ALSO

tree-sitter(1)