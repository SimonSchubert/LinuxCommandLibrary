# TAGLINE

Run a local binary, a package, or a script with Vite+

# TLDR

Run a **project binary**

```vpx eslint .```

**Download and run** a package without adding it

```vpx create-vue@latest [my-app]```

Run a **shell pipeline** with a package on PATH

```vpx -p cowsay -c 'echo hi | cowsay'```

Run a **TypeScript** script

```vpx ./scripts/seed.ts --dry-run```

**Rerun** a script when a file it uses changes

```vpx --watch ./server.ts```

Pass a **Node.js** option before the script

```vpx --inspect ./server.ts```

# SYNOPSIS

**vpx** [**-p** _pkg_]... [**-c**] [**-s**] [**--tsconfig** _file_] [_pkg_**@**_version_ | _script_] [_arguments_]

# DESCRIPTION

**vpx** is the package-runner bin shipped with **vite-plus**, the same job as **vp dlx** when it downloads a package. The `vite-plus` package installs it as `vpx`. Inside a project, the copy that package managers put first on PATH for scripts does not hand off to a global CLI.

A name that is installed as a project-local binary runs directly (`vpx eslint .`). A package, a `name@version`, **--package**, or **--shell-mode** runs through this package's `vp dlx`. A script path, or Node.js options followed by a script, runs in Node.js with the loader from this package. TypeScript files are scripts (`vpx ./scripts/seed.ts`).

Flags that **vpx** itself understands must come before the first positional argument. **--watch** before a script reruns it when a file it uses changes; it does not turn on Node.js's own watch mode. **--watch-path** is rejected. **--package** and **--shell-mode** cannot be combined with running a script. **--tsconfig** applies only to a script.

With nothing to run, **vpx** exits with an error and prints usage.

# PARAMETERS

**-p**, **--package** _pkg_
> Package to place on PATH. Repeatable. Also `-p=name` and `--package=name`

**-c**, **--shell-mode**
> Run the positional text as a shell command, as in the cowsay example

**-s**, **--silent**
> Quieter package execution. Forwarded to the `vp dlx` invocation

**--tsconfig** _file_
> TypeScript config for a script. Also `--tsconfig=file`. Not valid in package mode

**--watch**
> Before a script, rerun it when a file it uses changes

**-h**, **--help**
> Print usage

**-v**, **--version**
> Print the version

_pkg_**@**_version_
> Download and run that package. Extra arguments are the package's arguments

_script_
> A file to run, or Node.js options (such as **--inspect**) and then the file

# CAVEATS

A leading option is never treated as a package name: it selects script mode, and a missing script is an error rather than a download. **--package** together with a script path fails. The project-local `vpx` never delegates to a different global `vpx`. Package execution goes through **vp dlx** from this same package.

# HISTORY

**vpx** is a bin entry of the **vite-plus** package from **voidzero-dev/vite-plus** (Vite+, VoidZero), next to **vp** and **vpr**.

# INSTALL

```aur: yay -S vite-plus```

```brew: brew install vite-plus```

<!-- packages: 2026-10-27 -->

# SEE ALSO

[vp](/man/vp)(1), [vpr](/man/vpr)(1), [vp-env](/man/vp-env)(1), [npx](/man/npx)(1), [npm](/man/npm)(1), [node](/man/node)(1)

# RESOURCES

```[Source code](https://github.com/voidzero-dev/vite-plus)```

```[Homepage](https://viteplus.dev)```

```[Documentation](https://viteplus.dev/guide/)```

<!-- verified: 2026-10-27 -->
