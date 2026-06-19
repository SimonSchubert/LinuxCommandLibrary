# TAGLINE

Compile markdown skills into standalone Python agents

# TLDR

**Initialize** configuration and the LLM provider

```agenthatch init```

**Register** a skill file

```agenthatch skills add [./my-skill/SKILL.md]```

**Compile** a skill into an agent

```agenthatch hatch [my-skill]```

**Run** a hatched agent interactively

```agenthatch run [my-skill]```

**List** registered skills

```agenthatch skills list```

**Diagnose** the environment

```agenthatch doctor```

# SYNOPSIS

**agenthatch** _command_ [_arguments_] [_options_]

# DESCRIPTION

**agenthatch** is a compiler that turns a markdown **SKILL.md** definition into a standalone, runnable Python AI agent. It parses the skill file, runs an AI inference pass to infer tools and structure, and generates a complete Python package with its own CLI entry point, type-annotated tool definitions, and MCP integration.

Registered skills live in a local index (the "skillhouse"). The typical flow is to register a skill, **hatch** it to generate code, then **run** the resulting agent in an interactive terminal UI.

# COMMANDS

**init**
> Initialize configuration and set up the LLM provider.

**skills add** _path_
> Register a SKILL.md file in the skillhouse index.

**skills list**
> Display all registered skills.

**skills delete** _name_
> Remove a skill from the skillhouse.

**hatch** _name_
> Run the full compilation pipeline (parse, AI inference, code generation).

**run** _name_
> Launch a hatched agent in interactive terminal UI mode.

**search** _query_
> Query the skillhouse index.

**assemble**
> Rebuild an existing skillhouse agent.

**doctor**
> Diagnose the environment and dependencies.

# PARAMETERS

**--no-generate**
> Skip the code-generation phase so the inferred spec can be reviewed first (used with **hatch**).

**--force**
> Overwrite an existing hatched agent.

**--dry-run**
> Preview the output without writing files.

# CAVEATS

Requires Python 3.11 or later. Compilation calls an LLM provider (OpenAI, DeepSeek, Anthropic, or any OpenAI-compatible endpoint), configured via a TOML file, so an API key and network access are needed for the **hatch** step.

# HISTORY

**agenthatch** is written in Python and released under the MIT license. It was published in 2026 around the idea of treating markdown skill files as source code that compiles into deployable agents.

# SEE ALSO

[python](/man/python)(1), [pipx](/man/pipx)(1), [claude](/man/claude)(1)

# RESOURCES

```[Source code](https://github.com/agenthatch/agenthatch)```

<!-- verified: 2026-06-19 -->
