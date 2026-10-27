# TAGLINE

Run package scripts with Vite+; shorthand for vp run

# TLDR

**Run** a package script or monorepo task

```vpr [test]```

Run a task in **another directory**

```vpr -C [packages/web] [dev]```

Show **vp run** help

```vpr --help```

# SYNOPSIS

**vpr** [**-C** _dir_] [_task_] [_arguments_]

# DESCRIPTION

**vpr** is the **vp run** command as its own program. The `vite-plus` package installs it next to **vp**. Starting the process as `vpr` rewrites the argument list to `run` plus the same arguments, then enters the Vite+ CLI. **-C** is applied first, so `vpr -C dir task` changes directory and then runs the task.

**vp run** executes `package.json` scripts and monorepo tasks with caching. Built-in **vp** commands such as **dev**, **test**, and **build** are not replaced by a script of the same name; **vpr** is how those scripts are run. A global Vite+ install that dispatches on the program name treats `vpr` the same way.

The binary ships in the `vite-plus` package. See **vp**(1) for install and for the rest of the toolchain.

# PARAMETERS

**-C** _dir_
> Run as if started in _dir_. Accepted as `-C dir`, `-Cdir`, or `-C=dir`, and consumed before the `run` rewrite

_task_
> `package.json` script or configured monorepo task. Further arguments are passed through to **vp run**

**--help**
> Help for the run command, rendered by the installed toolchain

# CAVEATS

**vpr** is not a separate toolchain. It is **vp run**. Flags that belong only to other **vp** subcommands are not inserted for you. **env**, **upgrade**, and **implode** stay on the global **vp** binary.

# HISTORY

**vpr** is a bin entry of the **vite-plus** package from **voidzero-dev/vite-plus** (Vite+, VoidZero). The name is the program `vpr`; the command it runs is `run`.

# INSTALL

```aur: yay -S vite-plus```

```brew: brew install vite-plus```

<!-- packages: 2026-10-27 -->

# SEE ALSO

[vp](/man/vp)(1), [vpx](/man/vpx)(1), [vp-env](/man/vp-env)(1), [npm](/man/npm)(1), [pnpm](/man/pnpm)(1), [node](/man/node)(1)

# RESOURCES

```[Source code](https://github.com/voidzero-dev/vite-plus)```

```[Homepage](https://viteplus.dev)```

```[Documentation](https://viteplus.dev/guide/)```

<!-- verified: 2026-10-27 -->
