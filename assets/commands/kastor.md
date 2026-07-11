# TAGLINE

Terraform-style source-of-truth layer for AI agents using HCL specs

# TLDR

**Validate** an agent specification

```kastor validate examples/weather```

**Compile** the spec to runnable LangGraph code

```kastor build examples/weather```

**Plan** changes for hosted agents (Terraform-style)

```kastor plan examples/weather```

**Apply** the plan to create or update agents

```kastor apply examples/weather```

**Install** via Homebrew or Go

```brew install kastor```

# SYNOPSIS

**kastor** <command> [options] [path]

# DESCRIPTION

Kastor provides a declarative, versionable source of truth for AI agents. You define agents, tools, prompts, models and deployment targets in HCL files (`.agent`, `.tool`, `.prompt`, `kastor.hcl`). Kastor validates the spec, can generate runnable framework code (currently LangGraph), and supports plan/apply/destroy operations against targets with state, diffs and drift detection.

It is not an agent runtime or executor; it manages the contract and reconciliation around agents.

# COMMANDS

**validate** [path]
> Parse and validate references in a Kastor module.

**build** [path]
> Compile the module into runnable framework code (e.g. LangGraph project).

**plan** [path]
> Show a plan of changes against the target state.

**apply** [path]
> Apply changes to create/update agents and state.

**destroy** [path]
> Destroy agents managed by the module.

# PARAMETERS

Common options include paths to modules containing the declarative files. Many commands operate on a directory (the module root).

# CAVEATS

- Early proof-of-concept; the CLI surface is stable but hosted provider support is limited.
- Generated code is an output; the `.agent`/`.tool` files are the source of truth.
- Requires appropriate credentials (e.g. OPENAI_API_KEY) when running generated agents.

# SEE ALSO

[terraform](/man/terraform)(1)

# RESOURCES

```[Source code](https://github.com/weirdGuy/kastor)```

```[Homepage](https://www.getkastor.dev)```

```[Documentation](https://github.com/weirdGuy/kastor#readme)```

<!-- verified: 2026-07-11 -->
