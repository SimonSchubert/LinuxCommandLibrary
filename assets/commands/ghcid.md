# TAGLINE

auto-reloading GHCi daemon for rapid Haskell development

# TLDR

**Start** in the current project, auto-detecting ghci or cabal repl

```ghcid```

**Use** a specific repl command

```ghcid --command="[cabal repl]"```

**Run** an expression after every successful load

```ghcid --test=[main]```

**Run** the test even when there are warnings

```ghcid --test=[:main] --warnings```

**Build** a particular component

```ghcid --target=[lib:foo]```

**Reload** when non-Haskell files change

```ghcid --reload=[templates] --reload=[config.yaml]```

**Clear** the screen on each reload

```ghcid --clear```

**Run** hlint when the code compiles cleanly

```ghcid --lint```

# SYNOPSIS

**ghcid** [_options_] [_module_ ...]

# PARAMETERS

**-c**, **--command**=_COMMAND_
> Command to run. Defaults to **ghci**, or **cabal repl** / **stack ghci** when a project is detected.

**--target**=_TARGET_
> Component to build, e.g. **lib:foo** for Cabal or **foo:lib** for Stack. May be repeated.

**-T**, **--test**=_EXPR_
> GHCi expression to run after a successful load.

**-r**, **--run**[=_EXPR_]
> Like **--test**, but defaults to **main**.

**--test-message**=_MESSAGE_
> Message shown before running the test. Defaults to **Running test...**.

**-W**, **--warnings**
> Allow tests to run even when the code produced warnings.

**--lint**[=_COMMAND_]
> Run a linter when there are no errors. Defaults to **hlint**.

**--setup**=_COMMAND_
> Commands passed to ghci on stdin at startup, usually **:set** something. May be repeated.

**--reload**=_PATH_
> Also reload when this file or directory changes. Defaults to none.

**--restart**=_PATH_
> Restart the whole command when this path changes. Defaults to **.ghci** and any **.cabal** file, unless a custom command or stack is in use.

**-C**, **--directory**=_DIR_
> Set the current directory. Defaults to **.**.

**-o**, **--outputfile**=_FILE_
> Write the full output to a file, in a format editors can parse.

**--project**=_NAME_
> Project name shown in the title. Defaults to the current directory.

**--clear**
> Clear the screen when reloading.

**-S**, **--no-status**
> Suppress status messages.

**--reverse-errors**
> Reverse the output order. Works best with **--no-height-limit**.

**--no-height-limit**
> Disable the height limit and print all messages.

**--height**=_N_
> Number of lines to use. Defaults to the console height.

**-w**, **--width**=_N_
> Number of columns to use. Defaults to the console width.

**-n**, **--max-messages**=_N_
> Maximum number of messages to print.

**--colour**[=_always/never/auto_], **--color**
> Colour the output. Defaults to **auto**.

**--no-title**
> Do not update the shell title or icon.

**-t**, **--topmost**
> Keep the window on top. Windows only.

**--poll**[=_SECONDS_]
> Poll for changes every N seconds instead of using filesystem notifications. Defaults to **0.1**.

**--allow-eval**
> Execute REPL commands written in source comments.

**--ignore-loaded**
> Keep going when no files are loaded. Requires **--reload**.

**--no-cabal-repl-rtsopts**
> Disable the default **+RTS -N -RTS** passed to an auto-selected **cabal repl**.

**--server**
> Enable the local ghcid socket server.

**--help**
> Display help information.

# DESCRIPTION

**ghcid** is "GHCi as a daemon": it starts a GHCi session, watches your source files, and reloads whenever something changes, formatting the errors and warnings to fit the console. The author describes it as GHC plus a bit of an IDE.

Its value is the speed of the feedback loop. Because GHCi stays resident, a reload only recompiles what changed, so errors typically appear within a fraction of a second of saving. The output is deliberately truncated to the terminal height, so a clean build shows **All good** and a broken one shows the first error at the top, where you are already looking.

With no arguments **ghcid** picks a sensible repl command for the project, using **cabal repl** or **stack ghci** when it detects one and falling back to plain **ghci**. **--test** turns it into a continuous test runner by evaluating an expression after each successful load, which combined with **--warnings** gives a tight red/green cycle without leaving the editor.

The tool is intentionally narrow: it does not integrate with editors, expose GHCi to you directly, depend on the GHC API, or run a web server. **--outputfile** exists so editors can consume its results instead.

# CAVEATS

**ghcid** is only as reliable as the underlying repl. If **cabal repl** or **ghci** cannot load your project by hand, **ghcid** will not fix it; test the command directly first and pass a working one with **--command**.

Reloading only picks up changes GHCi itself can see. Changes to **.cabal** files, CPP includes, or generated code often need a full restart, which is what **--restart** is for. Non-Haskell assets need an explicit **--restart** or **--reload**.

Filesystem notifications can be unreliable over network mounts, in containers and in some virtual machines; use **--poll** when saves seem to go unnoticed.

**--test** runs inside the same GHCi session, so an expression that loops forever or calls **exitWith** will hang or kill the daemon.

**--allow-eval** executes code found in comments, so avoid it on code you have not read.

# HISTORY

**ghcid** was written by **Neil Mitchell**, with significant contributions from **JP Moresmau**, and released around **2014**. It became a standard part of many Haskell development setups by offering fast, editor-independent feedback, and is distributed through **Hackage** and **Stackage**.

# SEE ALSO

[ghci](/man/ghci)(1), [ghc](/man/ghc)(1), [cabal](/man/cabal)(1), [stack](/man/stack)(1), [hlint](/man/hlint)(1)

# RESOURCES

```[Source code](https://github.com/ndmitchell/ghcid)```

```[Documentation](https://hackage.haskell.org/package/ghcid)```

<!-- verified: 2026-07-16 -->
