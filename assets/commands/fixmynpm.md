# TAGLINE

Audit and repair insecure npm configuration files

# TLDR

**Check the global ~/.npmrc** for security and configuration issues

```fixmynpm doctor```

**Scan a directory tree** for every .npmrc file and report problems

```fixmynpm audit --root [path/to/projects]```

**Apply recommended fixes** to .npmrc files

```fixmynpm fixer --root [path/to/projects]```

Preview the changes **without writing** anything (dry run)

```fixmynpm fixer --root [path/to/projects] --dry-run```

**Hunt for a specific package** across all node_modules (incident response)

```fixmynpm scan --package "[lodash@4.17.20]" --incident```

Find .npmrc files matching a **glob pattern**

```fixmynpm scan --root [~/code] --npmrc```

# SYNOPSIS

**fixmynpm** _command_ [_options_]

# DESCRIPTION

**fixmynpm** is a diagnostic CLI for finding and fixing insecure or misconfigured **.npmrc** files. It inspects the global **~/.npmrc**, walks project directories for nested **.npmrc** files, audits each entry against a built-in catalogue of security rules, and can apply fixes automatically. Built-in checks cover registry validation, TLS settings, authentication-token handling, lifecycle-script execution, and dependency-confusion risks.

In addition to configuration hygiene, **fixmynpm** doubles as an incident-response tool: the **scan** command can recurse through **node_modules** to locate specific compromised packages by name, version range, or bundled-.npmrc presence, making it useful when responding to supply-chain advisories.

# PARAMETERS

**doctor**
> Inspect ~/.npmrc and report security or configuration violations with suggested fixes.

**audit**
> Recursively scan a directory tree, listing every .npmrc file and the issues found in each.

**fixer**
> Apply recommended corrections to .npmrc files discovered during a scan.

**scan**
> Locate .npmrc files or search node_modules for specific packages (incident-response mode).

**--root** _dir_
> Starting directory for scan, audit, and fixer (defaults to the user's home directory).

**--package** _glob_
> Filter scan results to packages matching a name or glob pattern.

**--version** _range_
> Filter scan results by semver range when combined with **--package**.

**--npmrc**
> Limit scan output to packages that bundle a .npmrc file.

**--incident**
> Enable incident-response heuristics, including bundled .npmrc detection inside node_modules.

**--dry-run**
> Show planned changes without modifying any files.

# CAVEATS

Operates on **.npmrc** files only; it does not modify **package.json**, lockfiles, or installed binaries. The fixer rewrites files in place — pair it with **--dry-run** or version control before running broadly. Incident-response scans can be slow on large workstations because they recurse through every **node_modules** directory below the chosen root.

# HISTORY

**fixmynpm** was created by **madhugb** and announced on **Hacker News in 2026** following a series of npm supply-chain incidents that exposed dangerous defaults in user **.npmrc** files. It is written in **Go** and distributed via **go install github.com/madhugb/fixmynpm@latest**.

# SEE ALSO

[npm](/man/npm)(1), [npm-audit](/man/npm-audit)(1), [yarn](/man/yarn)(1), [pnpm](/man/pnpm)(1)
