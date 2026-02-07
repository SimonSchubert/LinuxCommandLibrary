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

**migrate**
> Migrate from other tools (ESLint, Prettier).

**--write**
> Apply fixes and formatting to files.

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

**Biome** is a fast code formatter, linter, and more for JavaScript, TypeScript, JSON, and CSS. It is designed as a unified toolchain to replace ESLint, Prettier, and other tools with a single, faster alternative.

Written in Rust, Biome provides exceptional performance - often 10-100x faster than JavaScript-based alternatives. It requires minimal configuration, with sensible defaults out of the box while remaining highly customizable through **biome.json**.

The tool integrates formatting and linting into a single pass, reducing overhead. Editor integrations provide real-time feedback, and the CLI supports various output formats for CI systems.

# CONFIGURATION

**biome.json**
> Project-level configuration file controlling formatter settings, linter rules, file include/exclude patterns, and language-specific options. Created by `biome init`.

# CAVEATS

Biome is relatively new and may not support all ESLint rules or Prettier options. Plugin systems are limited compared to ESLint. Some projects with unusual configurations may require adjustments during migration. CSS support is newer and less mature than JS/TS support.

# HISTORY

Biome emerged from **Rome Tools**, a project started by **Sebastian McKenzie** (creator of Babel) in **2020**. When Rome Tools Inc. ceased operations in **2023**, the community forked the project as Biome under a new governance model. The fork quickly gained traction, maintaining the performance-focused Rust implementation while accelerating development under community stewardship.

# SEE ALSO

[eslint](/man/eslint)(1), [prettier](/man/prettier)(1), [deno](/man/deno)(1)
