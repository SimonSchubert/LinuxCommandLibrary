# TLDR

**Run TypeScript file**

```ts-node [script.ts]```

**Start REPL**

```ts-node```

**Run with specific config**

```ts-node -P [tsconfig.json] [script.ts]```

**Transpile only** (skip type checking)

```ts-node --transpile-only [script.ts]```

**Run as ESM**

```ts-node --esm [script.ts]```

**Evaluate code**

```ts-node -e "console.log('Hello')"```

**Print transpiled code**

```ts-node --print "1 + 1"```

# SYNOPSIS

**ts-node** [_-P config_] [_--transpile-only_] [_--esm_] [_options_] [_file_] [_args_]

# PARAMETERS

**-P** _FILE_
> Path to tsconfig.json.

**--transpile-only**, **-T**
> Skip type checking.

**--esm**
> Use ESM loader.

**-e** _CODE_
> Evaluate code.

**-p** _CODE_
> Evaluate and print.

**-r** _MODULE_
> Require module.

**--pretty**
> Pretty-print errors.

**--skip-project**
> Skip loading tsconfig.json.

**--compiler** _NAME_
> TypeScript compiler to use.

**--emit**
> Write compiled files.

**-i**, **--interactive**
> Force REPL.

# DESCRIPTION

**ts-node** executes TypeScript directly without precompilation. It compiles TypeScript on-the-fly and runs the result.

Type checking happens at runtime by default. Errors are reported before execution starts.

Transpile-only mode skips type checking for faster startup. Type errors aren't caught but execution is quicker.

ESM mode handles ES module imports. It's required when using import/export syntax without bundling.

The REPL provides interactive TypeScript execution. Code is type-checked and executed immediately.

Integration with ts-node-dev or nodemon enables automatic restart on file changes during development.

# CAVEATS

Slower startup than precompiled JavaScript. Type checking adds overhead. Some advanced TypeScript features need configuration. Not recommended for production.

# HISTORY

**ts-node** was created around **2015** to enable direct TypeScript execution. It became essential for TypeScript development, enabling scripts, REPL, and development servers.

# SEE ALSO

[tsc](/man/tsc)(1), [node](/man/node)(1), [npx](/man/npx)(1), [tsx](/man/tsx)(1)
