# TAGLINE

Unified toolchain for web development

# TLDR

Create a **new project** interactively

```vp create```

**Install** dependencies with the project's package manager

```vp install```

Start the **development server**

```vp dev```

Run **format, lint, and type checks**

```vp check```

Run **tests** with Vitest

```vp test```

**Build** the project for production

```vp build```

Add a **package** to dependencies

```vp add [package_name]```

Run a **package.json script** or configured task

```vp run [task_name]```

**Migrate** an existing project onto Vite+

```vp migrate```

Show the **active toolchain** versions

```vp toolchain```

# SYNOPSIS

**vp** [**-C** _dir_] [**-V**] [_command_] [_options_]

# PARAMETERS

**-C** _dir_
> Run as if started in _dir_ instead of the current working directory.

**-V**, **--version**
> Print the CLI version.

**create**
> Scaffold a new app, library, or monorepo from a template.

**migrate**
> Move an existing project onto Vite+. Prints a plan before rewriting files.

**install**, **i**
> Install all dependencies, or add packages when names are given. Detects npm, pnpm, Yarn, or Bun from `packageManager`, lockfiles, and related config.

**add**
> Add packages to dependencies.

**remove**, **rm**, **un**, **uninstall**
> Remove packages from dependencies.

**update**, **up**
> Update packages to their latest versions.

**dev**
> Start the Vite development server with HMR. Powered by Vite and Rolldown.

**check**
> Run format, lint, and type checks together (Oxfmt and Oxlint).

**lint**
> Lint code with Oxlint.

**fmt**, **format**
> Format code with Oxfmt.

**test**
> Run tests with Vitest.

**build**
> Build the application for production.

**preview**
> Serve the production build locally.

**pack**
> Build a library for publishing, or a standalone executable.

**run**
> Run `package.json` scripts and monorepo tasks with caching. Also available as the standalone **vpr** binary.

**exec**
> Run a binary from the project's `node_modules/.bin`.

**dlx**
> Download and run a package binary without adding it as a dependency. Also available as **vpx**.

**node**
> Run a Node.js script with the resolved Vite+ environment. Use **vpx** _file_ for TypeScript.

**env**
> Manage Node.js and package-manager versions. Global CLI only. See **vp-env**(1).

**toolchain** [**--global**] [**--json**] [_tools_...]
> Show the versions of Vite+, Vite, Rolldown, Oxc, Vitest, and related tools. Uses the project's `vite-plus` package when present; **--global** inspects the machine install.

**config**
> Configure Git hooks and agent integration.

**hooks**
> Manage the Git hook dispatcher.

**staged**
> Run checks on Git staged files.

**cache**
> Manage the task cache.

**upgrade** [_version_] [**--check**] [**--rollback**] [**--force**] [**--tag** _tag_] [**--registry** _url_]
> Update the global **vp** binary. Homebrew installs must be upgraded with Homebrew instead.

**implode** [**-y**]
> Remove the global **vp** installation and Vite+-managed runtimes, packages, config, and caches.

# DESCRIPTION

**vp** is the CLI for **Vite+**, VoidZero's unified toolchain for local web development. One command covers Node.js and package-manager versions, dependency install, the Vite dev server, Oxc lint/format, Vitest, production builds (Vite and Rolldown), library packing (tsdown), and cached monorepo tasks (Vite Task).

There are two distributions. The **global CLI** is a standalone **vp** binary: it does not need Node.js already installed, manages runtimes and package managers, and can run the toolchain without adding `vite-plus` to a project. The **project-local** `vite-plus` npm package records the toolchain in the project's lockfile. For **dev**, **build**, **test**, **check**, and **run**, the global CLI uses the project's installed `vite-plus` when present, otherwise the globally bundled toolchain. **env**, **upgrade**, and **implode** always belong to the global CLI.

With no command, **vp** opens an interactive picker. Built-in commands such as **dev**, **test**, and **build** cannot be replaced by `package.json` scripts; run those scripts with **vp run** (or **vpr**).

Install the global CLI on Linux and macOS with `curl -fsSL https://vite.plus | bash`, then open a new shell and run **vp help**. Prebuilt binaries cover Linux x64/arm64 glibc and macOS; Linux musl is experimental. On Alpine, install `libstdc++` before using managed Node.js.

# CONFIGURATION

**vite.config.ts**
> Project config via `defineConfig` from `vite-plus`. Holds Vite (`plugins`, `build`), Vitest (`test`), Oxlint (`lint`), Oxfmt (`fmt`), Vite Task (`run`), and staged-file (`staged`) options in one file.

**package.json**
> `packageManager` and `devEngines.packageManager` select the package manager. `devEngines.runtime` and `engines.node` contribute to Node.js version resolution. See **vp-env**(1).

**.node-version** / **.nvmrc**
> Project Node.js version files read by **vp env**.

**VP_HOME**
> Optional single-root install directory. When unset, a fresh install uses split XDG paths (`~/.local/share/vite-plus`, `~/.cache/vite-plus`, `~/.config/vite-plus`, `~/.local/state/vite-plus` on Linux and macOS). An existing `~/.vite-plus` install is reused.

# CAVEATS

**env**, **upgrade**, and **implode** are not in the project-local `vite-plus` package.

**implode** deletes managed Node.js runtimes, global packages, configuration, and caches.

Homebrew owns its **vp** binary: **vp upgrade** refuses to replace it and points at `brew upgrade vite-plus`.

Built-in commands ignore same-named `package.json` scripts. Use **vp run** _script_.

On Alpine (musl), managed Node.js needs `libstdc++`. A missing prebuilt binary for the current OS/CPU fails the installer.

# HISTORY

**Vite+** is developed by **VoidZero**, the company founded by **Evan You** (creator of Vite and Vue). The public beta shipped on **2 July 2026**. **Vite+ 1.0** was released on **28 September 2026** (MIT licensed), bundling Vite 8, Vitest, Rolldown, Oxlint, Oxfmt, and tsdown behind **vp**. VoidZero later joined Cloudflare.

# INSTALL

```aur: yay -S vite-plus```

```brew: brew install vite-plus```

<!-- packages: 2026-10-21 -->

# SEE ALSO

[vp-env](/man/vp-env)(1), [vite](/man/vite)(1), [vitest](/man/vitest)(1), [npm](/man/npm)(1), [pnpm](/man/pnpm)(1), [node](/man/node)(1), [nvm](/man/nvm)(1), [uv](/man/uv)(1)

# RESOURCES

```[Source code](https://github.com/voidzero-dev/vite-plus)```

```[Homepage](https://viteplus.dev)```

```[Documentation](https://viteplus.dev/guide/)```

<!-- verified: 2026-10-21 -->
