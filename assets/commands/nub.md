# TAGLINE

All-in-one toolkit that augments Node.js

# TLDR

**Run** a TypeScript or JavaScript file with automatic transpilation

```nub [file.ts]```

**Run** a file and restart it on changes

```nub watch [file.ts]```

**Execute** an npm script from package.json

```nub run [script]```

**Execute** a package binary (faster npx alternative)

```nubx [command]```

**Install** all project dependencies

```nub install```

**Add** a package to the project

```nub add [package]```

**Install** and switch to a specific Node.js version

```nub node install [version]```

**Update** Nub itself to the latest version

```nub upgrade```

# SYNOPSIS

**nub** [_options_] _file_

**nub** _subcommand_ [_arguments_]

**nubx** [_options_] _command_

# DESCRIPTION

**Nub** is a fast all-in-one toolkit that augments Node.js instead of replacing it. Written in **Rust** with the embedded oxc parser for transpilation, it bundles a file runner, a script runner, a package manager, a package executor, and a Node.js version manager behind a single command.

Unlike alternative runtimes, Nub does not ship its own JavaScript engine. It runs files on the existing Node.js installation while adding native TypeScript execution, automatic **.env** loading, and a watch mode. The file runner aims to be a drop-in replacement for the **node** binary, accepting the same flags and environment variables through passthrough.

The companion **nubx** command runs package binaries from the registry or from local **node_modules/.bin**, serving as a faster substitute for **npx**. The package manager subcommands (install, ci, add, remove, update) provide an alternative to **npm**, **pnpm**, and **yarn**, while **nub node** and **nub pm** manage Node.js versions and Corepack-style package manager shims.

# PARAMETERS

**nub** _file_
> Run a TypeScript or JavaScript file with automatic transpilation and .env loading.

**nub run** _script_
> Execute a script defined in the package.json file.

**nub watch** _file_
> Run a file and automatically restart it when source files change.

**nubx** _command_
> Execute a package binary from the registry or from local node_modules/.bin.

**nub install**
> Install all project dependencies.

**nub ci**
> Perform a clean install of dependencies.

**nub add** _packages_
> Add one or more packages to the project.

**nub remove** _package_
> Remove a package from the project.

**nub update**
> Update project dependencies.

**nub node install** _version_
> Download and provision a specific Node.js version.

**nub node ls**
> List the cached Node.js versions.

**nub node which**
> Print the path to the resolved Node.js binary.

**nub pm shim**
> Register global package manager shims (Corepack-style).

**nub upgrade**
> Update Nub itself to the latest release.

# CAVEATS

Nub augments rather than replaces Node.js, so a working Node.js installation is still required for execution. As a young project the command surface and flags may change between releases; check the documentation for the version you have installed.

# HISTORY

Nub was published in 2025 as a Rust-based companion to Node.js, positioned alongside all-in-one runtimes such as **bun** and **deno** but focused on speeding up existing Node.js workflows rather than introducing a separate runtime.

# INSTALL

```aur: yay -S nub```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[node](/man/node)(1), [npm](/man/npm)(1), [npx](/man/npx)(1), [pnpm](/man/pnpm)(1), [yarn](/man/yarn)(1), [bun](/man/bun)(1), [deno](/man/deno)(1)

# RESOURCES

```[Source code](https://github.com/nubjs/nub)```

```[Homepage](https://nubjs.com)```

```[Documentation](https://nubjs.com/docs)```

<!-- verified: 2026-06-25 -->
