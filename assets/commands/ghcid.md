# TAGLINE

Auto-reloading daemon for rapid Haskell development

# TLDR

**Start with default settings**

```ghcid```

**Watch specific file**

```ghcid --target=[file.hs]```

**Run test on reload**

```ghcid --test=[main]```

**With custom command**

```ghcid --command="[cabal repl]"```

**Output to terminal title**

```ghcid --title```

# SYNOPSIS

**ghcid** [_options_]

# PARAMETERS

**--command** _CMD_
> GHCi command to run.

**--target** _TARGET_
> Target to load.

**--test** _EXPR_
> Expression to run after reload.

**--reload** _PATH_
> Additional paths to watch.

**--restart** _PATH_
> Paths that trigger full restart.

**--title**
> Update terminal title with status.

**--help**
> Display help information.

# DESCRIPTION

**ghcid** (GHCi daemon) provides rapid Haskell development feedback by running GHCi in the background, watching source files, and automatically reloading on changes. Errors and warnings are displayed immediately.

The tool minimizes the compile-fix-compile cycle by providing instant feedback. It integrates with cabal, stack, and bare GHCi. The --test option runs expressions after successful compilation, enabling continuous testing.

# CAVEATS

Requires GHCi setup working correctly. Large projects may have reload delays. Watch paths need correct configuration.

# HISTORY

ghcid was created by **Neil Mitchell** to provide fast feedback during Haskell development, becoming a popular development tool in the Haskell ecosystem.

# SEE ALSO

[ghci](/man/ghci)(1), [ghc](/man/ghc)(1), [cabal](/man/cabal)(1)
