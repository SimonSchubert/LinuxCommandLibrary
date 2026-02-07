# TAGLINE

Execute files and package scripts

# TLDR

**Run a JavaScript/TypeScript file**

```bun run [script.ts]```

**Run a package.json script**

```bun run [start]```

**Run file in watch mode**

```bun --watch run [script.ts]```

**List available scripts**

```bun run```

**Evaluate code string**

```bun run --eval "[console.log('hello')]"```

**Evaluate and print result**

```bun run --print "[1 + 2]"```

**Run with environment file**

```bun run --env-file [.env] [script.ts]```

# SYNOPSIS

**bun run** [_options_] _file|script_ [_arguments_]

**bun** _file|script_ [_arguments_]

# DESCRIPTION

**bun run** executes JavaScript, TypeScript, and JSX files using Bun's fast native transpiler. It can also run package.json scripts with lifecycle hook support.

The command can be shortened to just **bun** followed by the file or script name, though built-in commands take precedence.

# PARAMETERS

**--watch**
> Re-run on file changes

**--eval, -e** _code_
> Evaluate argument as script

**--print, -p** _code_
> Evaluate and print result

**--env-file** _file_
> Load environment variables from file

**--cwd** _directory_
> Set working directory

**--silent**
> Suppress script output

# BEHAVIOR

**Source files**
> Paths starting with ./ or absolute paths run as source files

**Package scripts**
> Scripts defined in package.json are executed with lifecycle hooks (pre/post)

**Resolution**
> With bun run, package.json scripts take precedence over files with same name

# LIFECYCLE HOOKS

Bun respects pre and post lifecycle hooks. Running **bun run build** will execute **prebuild**, **build**, and **postbuild** in order. If a pre-script fails, the main script is not executed.

# CAVEATS

TypeScript and JSX are transpiled on-the-fly without configuration. Startup time is significantly faster than npm run. Some Node.js-specific APIs may not be available.

# SEE ALSO

[bun](/man/bun)(1), [bun-test](/man/bun-test)(1), [node](/man/node)(1), [npm-run](/man/npm-run)(1)
