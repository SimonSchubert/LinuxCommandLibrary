# TAGLINE

High-performance monorepo build system

# TLDR

**Run task**

```turbo run [build]```

**Run multiple tasks**

```turbo run [build] [test]```

**Run with filter**

```turbo run [build] --filter=[package-name]```

**Run in parallel**

```turbo run [build] --parallel```

**Continue on error**

```turbo run [build] --continue```

**Show dependency graph**

```turbo run [build] --graph```

**Prune for deployment**

```turbo prune [app]```

**Prune with Docker-optimized output**

```turbo prune [app] --docker```

**Bypass cache and re-execute**

```turbo run [build] --force```

# SYNOPSIS

**turbo** _command_ [_--filter pattern_] [_options_]

# PARAMETERS

**run** _TASKS_
> Run specified tasks across packages.

**prune** _package_
> Create pruned subset of monorepo for a target package.

**-F**, **--filter** _PATTERN_
> Filter packages by name, directory, or git changes.

**--affected**
> Run only in packages changed since the base branch.

**--continue**
> Continue on error (never, dependencies-successful, always).

**--graph** _file_
> Output dependency graph (svg, html, mermaid, dot).

**--force**
> Bypass cache and re-execute all tasks.

**--dry**
> Display tasks without executing.

**--cache-dir** _DIR_
> Set filesystem cache directory.

**--concurrency** _num_
> Limit parallel task execution (number or percentage).

# DESCRIPTION

**Turborepo** is a high-performance build system for JavaScript and TypeScript monorepos. It executes tasks like build, test, and lint across multiple packages while respecting inter-package dependencies and maintaining topological order automatically.

The tool uses content-aware hashing to cache task outputs, skipping work when inputs haven't changed. This caching works locally and can be shared across a team via remote caching, so developers don't rebuild what others have already built. The **--filter** flag targets specific packages for focused development.

Configuration is defined in **turbo.json** at the repository root, specifying task dependencies and caching behavior. The **--graph** flag visualizes the dependency structure, and **prune** creates minimal subsets of the monorepo for efficient deployment.

# CAVEATS

Requires turbo.json config. Monorepo setup needed. The **--parallel** and **--scope** flags are deprecated; use **--filter** and task configuration instead.

# HISTORY

**Turborepo** was created by **Jared Palmer** and acquired by **Vercel** in 2021. It focuses on making monorepo development fast.

# SEE ALSO

[npm](/man/npm)(1), [yarn](/man/yarn)(1), [pnpm](/man/pnpm)(1), [nx](/man/nx)(1)
