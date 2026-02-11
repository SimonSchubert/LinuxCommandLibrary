# TAGLINE

Haskell build tool and project manager

# TLDR

**Create new project**

```stack new [project_name]```

**Build project**

```stack build```

**Run project executable**

```stack run```

**Run tests**

```stack test```

**Start REPL with project**

```stack ghci```

**Install package globally**

```stack install [package_name]```

**Execute Haskell file as script**

```stack runghc [script.hs]```

**Update package index**

```stack update```

# SYNOPSIS

**stack** _command_ [_--resolver version_] [_options_] [_arguments_]

# PARAMETERS

**new** _NAME_ [_TEMPLATE_]
> Create new project.

**init**
> Initialize stack in existing project.

**build**
> Build project.

**run**
> Build and run executable.

**test**
> Build and run tests.

**bench**
> Build and run benchmarks.

**ghci**
> Start REPL with project loaded.

**install** _PACKAGES_
> Build and copy executables to bin.

**exec** _COMMAND_
> Run command in build environment.

**clean**
> Clean build artifacts.

**upgrade**
> Upgrade stack itself.

**--resolver** _RESOLVER_
> Stackage snapshot (lts-19.0, nightly-2023-01-01).

**--system-ghc**
> Use system GHC instead of stack-managed.

**--no-install-ghc**
> Don't automatically install GHC.

**--fast**
> Disable optimizations for faster build.

**--test**
> Enable test building.

**--bench**
> Enable benchmark building.

**--file-watch**
> Rebuild on file changes.

**--ghc-options** _OPTS_
> Additional GHC options.

# DESCRIPTION

**stack** is a build tool and project manager for Haskell. It provides reproducible builds by pinning GHC versions and package sets via Stackage snapshots.

Stackage snapshots (LTS or Nightly) define curated package sets known to build together. This avoids "dependency hell" by ensuring compatible versions. The resolver in stack.yaml specifies which snapshot to use.

Stack manages GHC installations automatically. Different projects can use different GHC versions without system-wide conflicts. The correct version downloads and builds on first use.

Project structure includes stack.yaml (configuration), package.yaml (package definition), and source directories. Templates provide starting points for libraries, executables, or specific frameworks.

The REPL (ghci) loads project code for interactive development. File watching (--file-watch) rebuilds on changes, enabling rapid iteration.

Integration with Cabal packages works through package.yaml or .cabal files. Stack can use Hackage packages not in Stackage via extra-deps.

# CAVEATS

Initial builds download GHC and many dependencies. Different from cabal workflow - teams should standardize. Stackage may lag behind Hackage for new releases. Disk space usage can be significant. Some advanced Cabal features require workarounds.

# HISTORY

**stack** was created by **FP Complete** in **2015** to solve Haskell's dependency management challenges. It built on work from Stackage (stable package sets). The tool became widely adopted for its reproducibility guarantees and simplified workflow. Development continues with community involvement.

# SEE ALSO

[ghc](/man/ghc)(1), [ghci](/man/ghci)(1), [cabal](/man/cabal)(1), [runghc](/man/runghc)(1)
