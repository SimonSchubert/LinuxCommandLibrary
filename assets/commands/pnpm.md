# TAGLINE

Fast disk-efficient Node.js package manager

# TLDR

**Install dependencies**

```pnpm install```

**Add a package**

```pnpm add [package]```

**Add dev dependency**

```pnpm add -D [package]```

**Run script**

```pnpm run [script]```

**Update packages**

```pnpm update```

**Remove package**

```pnpm remove [package]```

# SYNOPSIS

**pnpm** [_command_] [_options_]

# PARAMETERS

**install**
> Install all dependencies.

**add** _PACKAGE_
> Add a package.

**-D**, **--save-dev**
> Save as dev dependency.

**remove** _PACKAGE_
> Remove a package.

**update**
> Update packages.

**run** _SCRIPT_
> Run a script.

**exec** _CMD_
> Execute a command.

**-r**, **--recursive**
> Run in all workspaces.

# DESCRIPTION

**pnpm** is a fast, disk-efficient package manager for Node.js that uses a content-addressable storage system. Instead of copying packages into each project's node_modules, pnpm creates hard links from a single global store, dramatically reducing disk usage when multiple projects share the same dependencies.

It provides a strict node_modules structure that prevents accessing undeclared dependencies, improving project reliability. The CLI is largely compatible with npm, supporting **install**, **add**, **remove**, **update**, and **run** commands with similar syntax. Workspace support via **-r** (recursive) enables managing monorepo projects.

# CONFIGURATION

**.npmrc**
> Project-level or user-level configuration file for registry URLs, authentication tokens, and pnpm-specific settings like `store-dir` and `strict-peer-dependencies`.

**~/.local/share/pnpm/store/** (Linux), **~/Library/pnpm/store/** (macOS)
> Content-addressable package store shared across all projects.

**pnpm-workspace.yaml**
> Defines workspace packages for monorepo setups.

# CAVEATS

Node.js required. Uses hard links for efficiency.

# HISTORY

pnpm was created as a **fast alternative** to npm with better disk usage.

# SEE ALSO

[npm](/man/npm)(1), [yarn](/man/yarn)(1), [node](/man/node)(1)

