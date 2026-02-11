# TAGLINE

Deprecated TypeScript linter

# TLDR

**Lint files**

```tslint [file.ts]```

**Lint with config**

```tslint -c [tslint.json] [file.ts]```

**Fix automatically**

```tslint --fix [file.ts]```

**Lint project**

```tslint -p [tsconfig.json]```

**Output as JSON**

```tslint --format json [file.ts]```

**Lint all TypeScript**

```tslint -p . "[src/**/*.ts]"```

# SYNOPSIS

**tslint** [_-c config_] [_-p project_] [_--fix_] [_options_] _files_

# PARAMETERS

**-c** _FILE_
> Config file.

**-p** _FILE_
> Project tsconfig.

**--fix**
> Auto-fix issues.

**--format** _FMT_
> Output format.

**-e** _PATTERN_
> Exclude pattern.

# DESCRIPTION

**TSLint** was a static analysis tool for TypeScript that checked code for readability, maintainability, and functional correctness. It enforced configurable rules covering style conventions, potential errors, and best practices.

The tool supported automatic fixing of many rule violations and integrated with editors and CI systems. Configuration was managed through a tslint.json file that specified which rules to enable and their severity levels.

TSLint was deprecated in 2019 in favor of **ESLint** with the **typescript-eslint** plugin, which provides the same TypeScript linting capabilities within the more widely adopted ESLint ecosystem.

# CAVEATS

Deprecated in favor of ESLint. TypeScript-specific. Node.js required.

# HISTORY

**TSLint** was the standard TypeScript linter until 2019 when the team deprecated it in favor of **ESLint** with TypeScript support.

# SEE ALSO

[eslint](/man/eslint)(1), [tsc](/man/tsc)(1), [prettier](/man/prettier)(1)
