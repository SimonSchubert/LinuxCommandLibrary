# TAGLINE

Fast code formatter and linter for JavaScript, TypeScript, and CSS

# TLDR

**Initialize Biome in a project**

```biome init```

**Check code for errors** (lint and format)

```biome check [path/to/directory]```

**Format code**

```biome format --write [path/to/directory]```

**Lint code and show issues**

```biome lint [path/to/directory]```

**Fix auto-fixable lint issues**

```biome lint --write [path/to/directory]```

**Check a single file**

```biome check [path/to/file.js]```

**Output in JSON format**

```biome check --reporter=json [path/to/directory]```

**CI mode** (fails on any issues)

```biome ci [path/to/directory]```

# SYNOPSIS

**biome** _command_ [_options_] [_paths_]

# PARAMETERS

**init**
> Create a biome.json configuration file.

**check**
> Run linter and formatter checks.

**format**
> Format source files.

**lint**
> Lint source files.

**ci**
> Check for CI environments (stricter mode).

**migrate eslint** | **migrate prettier**
> Read an existing ESLint or Prettier config and port its settings into biome.json. Add **--write** to apply.

**--write**
> Apply safe fixes and formatting to files (formerly **--apply**).

**--fix**
> Alias of **--write**; apply safe fixes.

**--unsafe**
> Also apply fixes marked unsafe (use with **--write**).

**--only** _rule_
> Run only the given lint rule or group.

**--skip** _rule_
> Skip the given lint rule or group.

**--error-on-warnings**
> Exit with an error code when warnings are emitted.

**--reporter** _format_
> Output format: summary, json, github, gitlab.

**--config-path** _path_
> Path to configuration file.

**--vcs-enabled** _bool_
> Use VCS ignore files (.gitignore).

**--no-errors-on-unmatched**
> Don't error if no files match.

**--diagnostic-level** _level_
> Minimum severity: info, warn, error.

# DESCRIPTION

**Biome** is a fast code formatter, linter, and more for JavaScript, TypeScript, JSX, JSON, CSS, GraphQL, and (in newer releases) HTML. It is designed as a unified toolchain to replace ESLint, Prettier, and other tools with a single, faster alternative.

Written in Rust, Biome provides exceptional performance - often 10-100x faster than JavaScript-based alternatives. It requires minimal configuration, with sensible defaults out of the box while remaining highly customizable through **biome.json**.

The tool integrates formatting and linting into a single pass, reducing overhead. Editor integrations provide real-time feedback, and the CLI supports various output formats for CI systems.

# CONFIGURATION

**biome.json**
> Project-level configuration file controlling formatter settings, linter rules, file include/exclude patterns, and language-specific options. Created by `biome init`.

# CAVEATS

Biome may not support all ESLint rules or Prettier options, and some projects with unusual configurations require adjustments during migration. Biome 2.0 (2025) added a plugin system and type-aware linting, but the plugin ecosystem is still much smaller than ESLint's. CSS, GraphQL, and HTML support are newer than the mature JS/TS support.

# HISTORY

Biome emerged from **Rome Tools**, a project started by **Sebastian McKenzie** (creator of Babel) in **2020**. When Rome Tools Inc. ceased operations in **2023**, the community forked the project as Biome under a new governance model. The fork quickly gained traction, maintaining the performance-focused Rust implementation while accelerating development under community stewardship. Biome 2.0, released in 2025, introduced a plugin system and type-aware linting.

# INSTALL

```pacman: sudo pacman -S biome```

```zypper: sudo zypper install biome```

```brew: brew install biome```

```nix: nix profile install nixpkgs#biome```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[eslint](/man/eslint)(1), [prettier](/man/prettier)(1), [deno](/man/deno)(1), [node](/man/node)(1)

# RESOURCES

```[Source code](https://github.com/biomejs/biome)```

```[Homepage](https://biomejs.dev/)```

```[Documentation](https://biomejs.dev/guides/getting-started/)```

<!-- verified: 2026-06-19 -->
