# TAGLINE

improves Git hooks management for JavaScript projects

# TLDR

**Initialize husky** (creates .husky/pre-commit and sets the "prepare" script)

```npx husky init```

**Add a pre-commit hook** (hooks are plain shell scripts now)

```echo "npm test" > .husky/pre-commit```

**Add a pre-push hook**

```echo "npm run lint" > .husky/pre-push```

**Commit while skipping hooks for one command**

```git commit -m "[message]" -n```

**Disable husky for a whole session** (useful in CI/Docker)

```export HUSKY=0```

# SYNOPSIS

**husky** [_init_]

# PARAMETERS

**init**
> Initialize husky in the current repository: creates **.husky/pre-commit** and adds a **"prepare": "husky"** script to package.json.

_no arguments_
> Run as the **prepare** script; sets **core.hooksPath** to **.husky/_** so git invokes hooks from the **.husky/** directory.

**HUSKY=0** (environment variable)
> Skip installing/running husky hooks; useful for CI and Docker builds.

# DESCRIPTION

**Husky** improves Git hooks management for JavaScript projects. It enables running linters, tests, and other scripts automatically on commit, push, and other git events.

Since **v9**, husky's CLI has been drastically simplified: the only real subcommand is **init**, which scaffolds a starter hook and wires up the **prepare** npm script. Hooks themselves are just plain, executable shell scripts placed directly in the **.husky/** directory (e.g. **.husky/pre-commit**) rather than being managed through commands. The older **add**, **set**, and **install** subcommands from husky v4-v8 have been removed. It's widely used together with **lint-staged** for pre-commit code quality checks.

# CAVEATS

Node.js package, installed as a dev dependency (**npm install --save-dev husky**). Versions 5-8 used **husky add**/**husky set**/**husky install**, which are no longer supported in v9+; hook files are now created directly. Husky does not install hooks in parent directories for security reasons, which affects monorepo setups. Hook scripts must be executable (**chmod +x**) on some systems/package managers.

# HISTORY

Husky was created by **Typicode** to simplify Git hook management in JavaScript projects, becoming a standard dev dependency. Version 9 (2024) rewrote the tool to be dependency-free and reduced its API to a single **init** command, favoring plain shell scripts over a custom DSL.

# INSTALL

```nix: nix profile install nixpkgs#husky```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[lint-staged](/man/lint-staged)(1), [git](/man/git)(1), [npm](/man/npm)(1)

# RESOURCES

```[Source code](https://github.com/typicode/husky)```

```[Documentation](https://typicode.github.io/husky/)```

<!-- verified: 2026-07-19 -->
