# TAGLINE

Haskell package manager and build system

# TLDR

**Build** project

```cabal build```

**Run** executable

```cabal run```

**Install** package

```cabal install [package]```

**Create** new project

```cabal init```

**Test** project

```cabal test```

**Update** package list

```cabal update```

# SYNOPSIS

**cabal** _command_ [_options_]

# DESCRIPTION

**cabal** (Common Architecture for Building Applications and Libraries) is the package manager and build system for Haskell. It handles dependency resolution, building, testing, and distributing Haskell packages. Cabal uses Nix-style local builds by default, isolating dependencies per project to avoid conflicts.

# PARAMETERS

**build**
> Build project

**run** [_target_]
> Build and run executable

**install** _package_
> Install package

**update**
> Update package index

**test**
> Run test suite

**repl**
> Start GHCi with project loaded

**clean**
> Remove build artifacts

**sdist**
> Create source distribution

**upload**
> Upload package to Hackage

# PROJECT FILE

cabal.cabal example:
```
cabal-version: 2.4
name: myproject
version: 0.1.0.0

executable myproject
  main-is: Main.hs
  build-depends: base >=4.14 && <5
  hs-source-dirs: src
  default-language: Haskell2010
```

# WORKFLOW

```bash
# Create new project
cabal init

# Update package list
cabal update

# Build project
cabal build

# Run executable
cabal run myproject

# Install dependencies
cabal install --only-dependencies

# Run tests
cabal test

# Start REPL
cabal repl
```

# FEATURES

- Dependency resolution
- Sandboxed builds
- Multiple build targets
- Test framework integration
- Benchmarking support
- Documentation generation
- Package publishing to Hackage

# CAVEATS

Dependency resolution can be slow. "Cabal hell" (dependency conflicts) historically problematic (improved with Nix-style builds). Large download sizes. Compilation times can be long. GHC version compatibility important.

# HISTORY

**Cabal** was developed for Haskell starting around **2003**, with major improvements in Cabal 2.0 (2017) introducing Nix-style local builds.

# CONFIGURATION

**~/.cabal/config**
> Global configuration for package repositories, install directories, and build settings

# SEE ALSO

[stack](/man/stack)(1), [ghc](/man/ghc)(1), [ghci](/man/ghci)(1)
