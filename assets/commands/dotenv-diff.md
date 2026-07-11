# TAGLINE

Scan and validate environment variable usage across a codebase

# TLDR

**Scan the codebase** for missing, unused, duplicated and misused environment variables

```dotenv-diff```

**Compare** the runtime .env file against .env.example

```dotenv-diff --compare```

**Compare specific files**, including their values

```dotenv-diff --compare --env [.env.production] --example [.env.example] --check-values```

**Automatically fix** issues such as missing keys and duplicates

```dotenv-diff --fix```

**Explain a single variable**: where it is defined, where it is used and its status

```dotenv-diff --explain [DATABASE_URL]```

**Generate a default configuration file**

```dotenv-diff --init```

**Record current warnings as a baseline** when adopting the tool in an existing project

```dotenv-diff --baseline```

**Run in CI**, treating warnings as errors

```dotenv-diff --ci --strict```

# SYNOPSIS

**dotenv-diff** [**--compare**] [**--env** _FILE_] [**--example** _FILE_] [_options_]

# DESCRIPTION

**dotenv-diff** is a Node.js command-line tool that scans a JavaScript/TypeScript codebase for environment variable references and validates them before they cause runtime errors. It detects variables that are used in code but missing from the .env file, variables that are defined but never used, duplicate keys, empty values, and accidental secrets in tracked files.

In comparison mode (**--compare**) it diffs the runtime **.env** file against a reference file such as **.env.example**, reporting missing keys, extra keys, empty values, duplicates, and whether the .env file is listed in .gitignore. The **--matrix** mode shows key presence across multiple environment files side by side.

The tool has first-class support for SvelteKit, Next.js and Nuxt, warning about framework-specific misuse such as exposing server-only variables to the client. It exits with status **0** when no errors are found and **1** on errors (or warnings in strict mode), which makes it suitable for git hooks and CI/CD pipelines.

It is distributed via npm and can be run without installation using ```npx dotenv-diff```.

# OPTIONS

**--compare**

> Compare the runtime .env file against a reference file instead of scanning the codebase.

**--env** _FILE_

> Primary environment file to check (default: .env).

**--example** _FILE_

> Reference file for comparisons (default: .env.example).

**--check-values**

> Compare values as well as keys between the two files.

**--only** _LIST_

> Restrict comparison to specific issues: missing, extra, empty, duplicate, gitignore.

**--matrix** [_FILES_...]

> Side-by-side comparison of multiple env files showing where each key is present.

**--fix**

> Automatically correct issues such as missing keys and duplicates.

**--ignore** _KEYS_

> Exclude specific keys from checks (comma-separated).

**--ignore-regex** _PATTERNS_

> Exclude keys matching regular expression patterns.

**--include-files** _PATTERNS_

> Extend the default scan patterns with additional files, useful in monorepos.

**--exclude-files** _PATTERNS_

> Skip specified files beyond the defaults.

**--explain** _KEY_

> Show where a variable is defined, where it is used and its overall status.

**--list-all**

> List all unique environment variables found in the scan.

**--strict**

> Treat warnings as errors and exit with a failure code.

**--no-secrets**

> Skip the built-in secret detection.

**--baseline**

> Record current warnings into a baseline file so existing issues are suppressed in later runs.

**--init**

> Generate a default configuration file.

**--json**

> Output results as JSON.

**--ci**

> Non-interactive, read-only mode for CI/CD pipelines.

**-y**, **--yes**

> Auto-accept all prompts.

# CONFIGURATION

**dotenv-diff.config.json**

> Optional configuration file in the project root. Accepts all CLI flags in camelCase form (e.g. ```allowDuplicates```, ```ignoreRegex```). Command-line arguments override file settings.

Inline ignore comments (```// dotenv-diff-ignore```) suppress warnings for a single line of code, and an expiration date can be attached to a variable in the .env file with ```# @expire YYYY-MM-DD``` to get warnings before credentials go stale.

# CAVEATS

Requires Node.js and is aimed at JavaScript/TypeScript projects; codebase scanning looks for references like ```process.env.KEY``` and framework-specific patterns, so variables read in other languages are not detected. Several checks (secret detection, unused-variable reporting, uppercase key enforcement, expiration warnings) are enabled by default and may need to be disabled with their ```--no-``` counterparts in unconventional setups.

# HISTORY

dotenv-diff is an MIT-licensed open-source project by GitHub user Chrilleweb, first published on npm in **July 2025**. It started as a simple .env vs .env.example diff tool and grew into a codebase-wide environment variable scanner with framework awareness, secret detection and CI integration; version 3.0.0 was released in **July 2026**.

# SEE ALSO

[dotenvx](/man/dotenvx)(1), [direnv](/man/direnv)(1), [env](/man/env)(1), [envsubst](/man/envsubst)(1), [trufflehog](/man/trufflehog)(1)

# RESOURCES

```[Source code](https://github.com/Chrilleweb/dotenv-diff)```

```[Documentation](https://dotenv-diff-docs.vercel.app)```

<!-- verified: 2026-07-11 -->
