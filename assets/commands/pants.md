# TLDR

**List targets**

```pants list ::```

**Run tests**

```pants test ::```

**Format code**

```pants fmt ::```

**Lint code**

```pants lint ::```

**Build package**

```pants package [path/to:target]```

**Run specific target**

```pants run [path/to:target]```

**Check types**

```pants check ::```

**Show dependencies**

```pants dependencies [path/to:target]```

# SYNOPSIS

**pants** [_options_] _goal_ [_targets_...]

# PARAMETERS

**list**
> List matching targets.

**test**
> Run tests.

**fmt**
> Format source files.

**lint**
> Run linters.

**check**
> Type check.

**package**
> Build package.

**run**
> Run executable target.

**dependencies**
> Show dependencies.

**repl**
> Start interactive REPL.

**--changed-since** _REF_
> Only changed files.

**-l**, **--level** _LEVEL_
> Log level.

# DESCRIPTION

**pants** is a scalable build system for monorepos. It supports Python, Go, Java, Scala, Shell, and Docker.

Target notation uses colons to separate path and target name. Double colons (::) match all targets recursively.

Caching and memoization make repeated builds fast. Remote caching enables team-wide build sharing.

Dependency inference automatically discovers imports. Explicit dependencies can be declared in BUILD files.

Fine-grained invalidation rebuilds only affected targets. Concurrent execution uses available cores.

# CAVEATS

Requires BUILD files defining targets. Initial setup has learning curve. Large codebase initial run can be slow.

# HISTORY

**Pants** was originally developed at **Twitter** around **2011**. Version 2.x was a ground-up rewrite focusing on Python ergonomics. Now maintained by **Toolchain** as an open-source project.

# SEE ALSO

[bazel](/man/bazel)(1), [buck](/man/buck)(1), [make](/man/make)(1), [gradle](/man/gradle)(1)
