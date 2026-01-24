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

**tslint** lints TypeScript. It checks code quality.

Rule-based checking. Configurable rules.

Auto-fixing. Correct issues.

Integration ready. Editor plugins.

Deprecated now. Use ESLint.

# CAVEATS

Deprecated in favor of ESLint. TypeScript-specific. Node.js required.

# HISTORY

**TSLint** was the standard TypeScript linter until 2019 when the team deprecated it in favor of **ESLint** with TypeScript support.

# SEE ALSO

[eslint](/man/eslint)(1), [tsc](/man/tsc)(1), [prettier](/man/prettier)(1)
