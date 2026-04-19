# TAGLINE

scalable build system for monorepos

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
> Run tests for matching test targets.

**fmt**
> Format source files in-place using configured formatters.

**lint**
> Run lint checks on matching targets.

**check**
> Run type/compilation checks (e.g. mypy, javac).

**package**
> Build deployable artifacts (wheels, pex, jars, docker images).

**run**
> Run an executable target.

**publish**
> Publish deployable artifacts to a remote registry.

**dependencies**
> Show the transitive dependencies of a target.

**dependents**
> Show targets that depend on the given target.

**roots**
> List all root targets that match.

**peek**
> Print detailed metadata about matching targets.

**repl**
> Start an interactive REPL preloaded with the specified targets.

**tailor**
> Auto-generate or update BUILD files.

**update-build-files**
> Apply deprecation fixes to existing BUILD files.

**--changed-since** _REF_
> Limit targets to those changed since the given git ref.

**--changed-dependents=**_MODE_
> Include dependents of changed targets (_none_, _direct_, _transitive_).

**-l**, **--level** _LEVEL_
> Log level (trace, debug, info, warn, error).

**--keep-sandboxes=**_MODE_
> Keep the execution sandbox for debugging (_always_, _on_failure_, _never_).

**--no-local-cache**, **--no-remote-cache**
> Disable the local or remote build cache for the run.

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
