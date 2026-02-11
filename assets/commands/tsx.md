# TAGLINE

Fast TypeScript execution with esbuild

# TLDR

**Run a TypeScript file**

```tsx [script.ts]```

**Run with watch mode**

```tsx watch [script.ts]```

**Start TypeScript REPL**

```tsx```

**Run as Node.js loader**

```node --import tsx [script.ts]```

**Run with environment variables**

```tsx [script.ts] --env-file [.env]```

**Pass arguments to script**

```tsx [script.ts] -- [arg1] [arg2]```

# SYNOPSIS

**tsx** [_options_] [_file_] [_args_...]

**tsx** **watch** [_options_] [_file_]

# PARAMETERS

**watch**
> Watch mode: restart on file changes.

**--tsconfig** _file_
> Path to tsconfig.json file.

**--env-file** _file_
> Load environment variables from file.

**--no-cache**
> Disable transform caching.

**--help**
> Display help information.

**--version**
> Display version information.

# DESCRIPTION

**tsx** (TypeScript Execute) is an enhanced Node.js runtime that seamlessly runs TypeScript and ESM files. It uses esbuild for fast transpilation, making it ideal for development and scripting.

The tool requires zero configuration and works without a tsconfig.json file. It supports both CommonJS and ES modules, handles path aliases from tsconfig.json, and includes a watch mode for development.

tsx is a drop-in replacement for node, supporting all Node.js command-line flags. It transpiles TypeScript on-the-fly without writing JavaScript files to disk.

Note that tsx focuses on execution speed and does not perform type checking. Use tsc or your editor for type checking.

Install globally: `npm install -g tsx`

# CAVEATS

Does not perform type checking. Adds slight startup overhead for transpilation. For production, pre-compile TypeScript with tsc. Works best with dynamically linked Node.js features.

# HISTORY

**tsx** was created by Hiroki Osame (privatenumber) as a modern alternative to ts-node. It prioritizes speed and simplicity, leveraging esbuild for near-instant transpilation. The project has become popular for running TypeScript during development.

# SEE ALSO

[ts-node](/man/ts-node)(1), [node](/man/node)(1), [tsc](/man/tsc)(1), [esbuild](/man/esbuild)(1)
