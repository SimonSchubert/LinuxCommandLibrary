# TAGLINE

Run Haskell programs without compilation

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

**runghc** runs Haskell source files directly without a separate compilation step, making it ideal for scripting and quick prototyping. It invokes GHC (Glasgow Haskell Compiler) behind the scenes to compile the program to a temporary location and execute it immediately, providing a scripting-like experience for Haskell code.

The tool supports shebang lines (#!/usr/bin/env runghc), enabling Haskell files to be used as executable scripts. Command-line arguments after the filename are passed to the Haskell program, and GHC options can be specified before a **--** separator. The synonym **runhaskell** is also available.

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
