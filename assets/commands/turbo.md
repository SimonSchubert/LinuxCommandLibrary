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

```turbo prune --scope=[app]```

**Clean cache**

```turbo run [build] --force```

# SYNOPSIS

**turbo** _command_ [_--filter pattern_] [_options_]

# PARAMETERS

**run** _TASKS_
> Run tasks.

**prune**
> Create subset.

**--filter** _PATTERN_
> Filter packages.

**--parallel**
> Parallel execution.

**--continue**
> Continue on error.

**--graph**
> Dependency graph.

**--force**
> Bypass cache.

**--cache-dir** _DIR_
> Cache directory.

# DESCRIPTION

**Turborepo** is a high-performance build system for JavaScript and TypeScript monorepos. It executes tasks like build, test, and lint across multiple packages while respecting inter-package dependencies and maintaining topological order automatically.

The tool uses content-aware hashing to cache task outputs, skipping work when inputs haven't changed. This caching works locally and can be shared across a team via remote caching, so developers don't rebuild what others have already built. The **--filter** flag targets specific packages for focused development.

Configuration is defined in **turbo.json** at the repository root, specifying task dependencies and caching behavior. The **--graph** flag visualizes the dependency structure, and **prune** creates minimal subsets of the monorepo for efficient deployment.

# CAVEATS

Requires turbo.json config. Monorepo setup needed. Cache strategy matters.

# HISTORY

**Turborepo** was created by **Jared Palmer** and acquired by **Vercel** in 2021. It focuses on making monorepo development fast.

# SEE ALSO

[npm](/man/npm)(1), [yarn](/man/yarn)(1), [nx](/man/nx)(1)
