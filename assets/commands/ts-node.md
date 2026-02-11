# TAGLINE

TypeScript execution environment for Node.js

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

**ts-node** is a TypeScript execution engine for Node.js that compiles and runs TypeScript files on-the-fly without a separate build step. By default it performs full type checking at runtime, reporting type errors before execution begins.

The **--transpile-only** mode skips type checking for significantly faster startup, which is useful during development when your editor already provides type feedback. ESM mode (**--esm**) handles ES module imports and is needed when working with import/export syntax natively. The built-in REPL provides an interactive TypeScript environment for experimentation.

Configuration is loaded from tsconfig.json by default, and a custom config can be specified with **-P**. The tool integrates well with development workflows using ts-node-dev or nodemon for automatic restart on file changes.

# CAVEATS

Slower startup than precompiled JavaScript. Type checking adds overhead. Some advanced TypeScript features need configuration. Not recommended for production.

# HISTORY

**ts-node** was created around **2015** to enable direct TypeScript execution. It became essential for TypeScript development, enabling scripts, REPL, and development servers.

# SEE ALSO

[tsc](/man/tsc)(1), [node](/man/node)(1), [npx](/man/npx)(1), [tsx](/man/tsx)(1)
