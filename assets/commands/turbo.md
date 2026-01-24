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

**turbo** (Turborepo) runs monorepo tasks efficiently. It caches and parallelizes builds.

Task running respects dependencies. topological order maintained.

Caching skips unchanged work. Content hashing identifies changes.

Filtering targets specific packages. Patterns select subsets.

Graph visualization shows structure. Understand task relationships.

Remote caching shares across team. Avoid rebuilding others' work.

# CAVEATS

Requires turbo.json config. Monorepo setup needed. Cache strategy matters.

# HISTORY

**Turborepo** was created by **Jared Palmer** and acquired by **Vercel** in 2021. It focuses on making monorepo development fast.

# SEE ALSO

[npm](/man/npm)(1), [yarn](/man/yarn)(1), [nx](/man/nx)(1)
