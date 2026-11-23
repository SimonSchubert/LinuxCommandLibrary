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

**Show transitive dependencies**

```pants dependencies --transitive [path/to:target]```

**Test only what changed** since a git ref, including dependents

```pants --changed-since=[origin/main] --changed-dependents=transitive test```

**Generate BUILD files** for new source files

```pants tailor ::```

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
> Show the direct dependencies of a target (all of them with **--transitive**).

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

**--no-local-cache**
> Disable the local build cache for the run.

**--no-remote-cache-read**, **--no-remote-cache-write**
> Disable reading from or writing to the remote cache.

**--no-pantsd**
> Run without the pantsd daemon.

# DESCRIPTION

**pants** is a scalable build system for monorepos. It supports Python, Go, Java, Scala, Kotlin, JavaScript, Shell, Docker, Helm and Terraform, among others.

Target notation uses colons to separate path and target name. Double colons (::) match all targets recursively.

Caching and memoization make repeated builds fast. Remote caching enables team-wide build sharing.

Dependency inference automatically discovers imports. Explicit dependencies can be declared in BUILD files.

Fine-grained invalidation rebuilds only affected targets. Concurrent execution uses available cores.

# CAVEATS

Requires a **pants.toml** at the repository root and BUILD files defining targets (**pants tailor** can generate them). The **pants** command is a launcher (scie-pants) that downloads the Pants version pinned in pants.toml. Initial setup has a learning curve and the first run on a large codebase can be slow. Windows is only supported via WSL.

# HISTORY

**Pants** was originally developed at **Twitter** around **2011**. Version **2.0** (2020) was a ground-up rewrite with a Rust engine, developed largely by **Toolchain Labs** and focused on Python first. It is now maintained by the open-source Pants community.

# SEE ALSO

[bazel](/man/bazel)(1), [buck](/man/buck)(1), [make](/man/make)(1), [gradle](/man/gradle)(1)

# RESOURCES

```[Source code](https://github.com/pantsbuild/pants)```

```[Homepage](https://www.pantsbuild.org)```

```[Documentation](https://www.pantsbuild.org/stable/docs/introduction/welcome-to-pants)```

<!-- verified: 2026-11-23 -->
