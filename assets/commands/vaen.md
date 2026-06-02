# TAGLINE

Package and import portable bundles of AI coding-agent setups

# TLDR

**Validate** an agent manifest before building

```vaen validate```

**Build** a .agent archive from the current manifest

```vaen build -f agent.yaml -o my-setup.agent```

**Inspect** the contents of a .agent archive

```vaen inspect my-setup.agent```

**Import** a .agent bundle into a target repository for Claude Code

```vaen import my-setup.agent --client claude --target /path/to/repo```

**Doctor** an imported setup

```vaen doctor --client claude --target /path/to/repo```

**Clean up** the locally stored canonical copy after verification

```vaen cleanup```

# SYNOPSIS

**vaen** _subcommand_ [_options_]

# DESCRIPTION

**vaen** is a Python CLI that packages an AI coding-agent setup (instructions, skills and MCP server declarations) into a portable, OCI-style archive with a `.agent` extension, so it can be shared across repositories or teammates without copy-pasting files.

A `.agent` bundle declares which instruction files exist, which skills it bundles, which MCP servers it expects, and which environment-variable names hold credentials. It never contains credential values, only the names of variables the receiver must populate locally. `import` materializes the bundle into a target repo for a specific client (for example Claude Code) and writes files to the expected locations. `doctor` verifies that an import is structurally valid.

vaen exists because a zip file can move files but cannot describe what the setup is, where files should land, or which secrets the receiver must provide.

# PARAMETERS

**validate**
> Check the manifest syntax.

**build**
> Build a `.agent` archive. Flags: `-f` manifest, `-o` output filename.

**inspect** _archive_
> Print the contents of a `.agent` archive without importing.

**import** _archive_
> Materialize the bundle into a target. Flags: `--client`, `--target`, `--target-instructions-file-name`, `--target-skills-directory`.

**doctor**
> Validate an imported structure. Accepts the same client and target flags as `import`.

**cleanup**
> Remove the locally stored canonical copy.

# CONFIGURATION

A bundle is described by an `agent.yaml` manifest that lists instructions, skills, MCP servers, required environment-variable names and metadata such as version and publisher.

# INSTALLATION

Install from the project's GitHub repository using `pipx`:

```pipx install git+https://github.com/sjhalani7/vaen.git```

# SEE ALSO

[claude](/man/claude), [pipx](/man/pipx), [oras](/man/oras)
