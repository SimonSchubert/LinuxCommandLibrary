# TAGLINE

All-in-one JavaScript runtime and toolkit

# TLDR

**Run** JavaScript file

```bun [script.js]```

**Install** dependencies

```bun install```

**Add** package

```bun add [react]```

**Run** script from package.json

```bun run [dev]```

**Create** new project

```bun create [react] [my-app]```

**Test** files

```bun test```

# SYNOPSIS

**bun** _command_ [_options_]

# DESCRIPTION

**bun** is an all-in-one JavaScript runtime, package manager, bundler, and test runner. It's designed as a drop-in replacement for Node.js with significantly faster startup times and package installation.

The tool aims to be a complete toolkit for JavaScript/TypeScript development with performance as a priority.

# PARAMETERS

**run** _file_
> Execute JavaScript/TypeScript file

**install**
> Install dependencies from package.json

**add** _package_
> Add package to dependencies

**remove** _package_
> Remove package

**test**
> Run tests

**build** _file_
> Bundle for production

**create** _template_
> Create new project

**upgrade**
> Upgrade Bun itself

# FEATURES

- Fast JavaScript runtime (using JavaScriptCore)
- Built-in TypeScript support
- Package manager (npm-compatible)
- Bundler (esbuild-compatible)
- Test runner
- Native web APIs
- Hot reloading
- SQLite support

# PERFORMANCE

- 4x faster npm install
- 2-3x faster script execution vs Node.js
- Near-instant startup

# WORKFLOW

```bash
# Create project
bun create react my-app
cd my-app

# Install deps
bun install

# Run dev server
bun run dev

# Add package
bun add tailwindcss

# Run tests
bun test

# Build for production
bun build ./src/index.ts --outdir ./dist
```

# COMPATIBILITY

- Drop-in Node.js replacement (most APIs)
- npm package ecosystem
- Jest-compatible test runner
- ESM and CommonJS support

# CONFIGURATION

**bunfig.toml**
> Project-level and global configuration for Bun. Controls package installation behavior, runtime settings, test runner options, and bundler defaults. Searched in the project root directory, or globally at ~/.bunfig.toml.

# CAVEATS

Not 100% Node.js compatible. Some native modules don't work. Not all npm packages tested. Windows is supported natively since v1.1 (April 2024).

# HISTORY

**Bun** was created by Jarred Sumner and first released in **2021** as a fast all-in-one JavaScript toolkit built on Zig and JavaScriptCore.

# INSTALL

```pacman: sudo pacman -S bun```

```brew: brew install bun```

```nix: nix profile install nixpkgs#bun```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[node](/man/node)(1), [npm](/man/npm)(1), [deno](/man/deno)(1)

# RESOURCES

```[Source code](https://github.com/oven-sh/bun)```

```[Homepage](https://bun.sh)```

```[Documentation](https://bun.sh/docs)```

<!-- verified: 2026-06-22 -->
