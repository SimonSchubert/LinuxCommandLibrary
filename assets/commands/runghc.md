# TLDR

**Run Haskell script**

```runghc [script.hs]```

**Run with arguments**

```runghc [script.hs] [arg1] [arg2]```

**Specify GHC version**

```runghc-[8.10] [script.hs]```

**With GHC options**

```runghc -- -O2 [script.hs]```

# SYNOPSIS

**runghc** [_options_] [_ghc-options_] _file_ [_args_]

# PARAMETERS

**--**
> Separator for GHC options.

**-f** _file_
> Use different GHC.

**--help**
> Show help.

**--version**
> Show version.

# DESCRIPTION

**runghc** runs Haskell programs without compiling them first. It's useful for scripts and quick tests, invoking GHC to compile to memory and execute immediately.

Part of GHC (Glasgow Haskell Compiler).

# EXAMPLES

```bash
# Run script
runghc hello.hs

# With arguments
runghc calculator.hs 2 + 3

# Pass GHC options
runghc -- -Wall script.hs

# Shebang usage
#!/usr/bin/env runghc
```

# SCRIPT EXAMPLE

```haskell
#!/usr/bin/env runghc
import System.Environment

main = do
    args <- getArgs
    putStrLn $ "Hello, " ++ head args
```

# ALTERNATIVES

```bash
runhaskell  # Synonym
ghci        # Interactive (load with :load)
ghc -e      # One-liner
```

# CAVEATS

Slower than compiled code. Recompiles each run. For performance, use ghc to compile.

# HISTORY

runghc is part of **GHC** (Glasgow Haskell Compiler), the primary Haskell compiler developed by the GHC team.

# SEE ALSO

[ghc](/man/ghc)(1), [ghci](/man/ghci)(1), [cabal](/man/cabal)(1), [stack](/man/stack)(1)
