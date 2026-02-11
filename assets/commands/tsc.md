# TAGLINE

TypeScript to JavaScript compiler

# TLDR

**Compile a TypeScript file** to JavaScript

```tsc [file.ts]```

**Compile using a tsconfig.json** configuration

```tsc -p [tsconfig.json]```

**Compile in watch mode** (recompile on changes)

```tsc -w```

**Compile with strict mode** enabled

```tsc --strict [file.ts]```

**Compile to a specific ECMAScript** target

```tsc --target [ES2020] [file.ts]```

**Output to a specific directory**

```tsc --outDir [dist] [file.ts]```

**Generate source maps**

```tsc --sourceMap [file.ts]```

**Initialize a new tsconfig.json**

```tsc --init```

# SYNOPSIS

**tsc** [_options_] [_file_...]

# PARAMETERS

**-p**, **--project** _path_
> Compile project from tsconfig.json at path

**-w**, **--watch**
> Watch input files and recompile on changes

**-t**, **--target** _version_
> ECMAScript target version (ES3, ES5, ES2015, ES2020, ESNext)

**--outDir** _directory_
> Redirect output to specified directory

**--outFile** _file_
> Concatenate and emit output to single file

**--strict**
> Enable all strict type-checking options

**--noEmit**
> Do not emit outputs; type-check only

**--sourceMap**
> Generate corresponding .map source map files

**--declaration**
> Generate .d.ts declaration files

**--skipLibCheck**
> Skip type checking of declaration files

**--strictNullChecks**
> Enable strict null checks

**--noImplicitAny**
> Raise error on expressions with implied any type

**--init**
> Initialize a tsconfig.json file

**-h**, **--help**
> Show help

**-v**, **--version**
> Show version

# DESCRIPTION

**tsc** is the TypeScript compiler that transforms TypeScript (.ts, .tsx) files into JavaScript (.js). Developed by Microsoft, TypeScript is a superset of JavaScript that adds optional static typing and modern language features.

When run without arguments in a directory with **tsconfig.json**, tsc compiles the project according to that configuration. When files are specified on the command line, tsconfig.json is ignored unless **-p** is used.

The compiler performs type checking to catch errors during development, then emits valid JavaScript. The **--strict** flag enables comprehensive type checking including strict null checks and no implicit any.

Watch mode (**-w**) monitors source files and recompiles automatically when changes are detected, enabling a fast development workflow.

# CAVEATS

tsc requires Node.js and is typically installed via npm (**npm install -g typescript**). Compilation options on the command line override tsconfig.json settings. Large projects may have slow compile times; consider using **--incremental** for faster rebuilds.

# HISTORY

**TypeScript** was developed by **Microsoft** under the lead of **Anders Hejlsberg** (creator of C# and Turbo Pascal). It was first publicly released in **October 2012**. The language was designed to address the challenges of large-scale JavaScript development by adding optional static types while maintaining full compatibility with existing JavaScript.

# SEE ALSO

[node](/man/node)(1), [npm](/man/npm)(1), [esbuild](/man/esbuild)(1), [swc](/man/swc)(1)
