# TLDR

**Bundle JavaScript/TypeScript file**

```bun build [./src/index.ts] --outdir [./dist]```

**Create standalone executable**

```bun build [./server.ts] --compile --outfile [server]```

**Bundle with minification**

```bun build [./src/index.ts] --outdir [./dist] --minify```

**Generate source maps**

```bun build [./src/index.ts] --outdir [./dist] --sourcemap```

**Bundle for Node.js target**

```bun build [./src/index.ts] --outdir [./dist] --target [node]```

**Mark packages as external**

```bun build [./src/index.ts] --outdir [./dist] --external [react]```

**Bundle multiple entrypoints**

```bun build [./src/index.ts] [./src/worker.ts] --outdir [./dist]```

# SYNOPSIS

**bun build** _entrypoints_ [_options_]

# DESCRIPTION

**bun build** is Bun's fast native bundler for JavaScript and TypeScript. It bundles code for production, generates standalone executables, and supports both server and client code in a single command.

The bundler automatically performs tree-shaking to eliminate unused code.

# PARAMETERS

**--outdir** _directory_
> Output directory for bundled files

**--outfile** _file_
> Output file path (for single output)

**--compile**
> Create standalone executable with embedded Bun runtime

**--minify**
> Enable minification

**--sourcemap**
> Generate source maps (external, inline, or none)

**--target** _runtime_
> Target runtime: browser, bun, or node

**--external** _package_
> Exclude package from bundle

**--splitting**
> Enable code splitting

**--format** _type_
> Output format: esm or cjs

**--define** _key=value_
> Define global constants

**--loader** _ext:loader_
> Configure file type loaders

# JAVASCRIPT API

```javascript
await Bun.build({
  entrypoints: ['./src/index.js'],
  outdir: './build',
  minify: true,
})
```

# CAVEATS

Standalone executables include a copy of the Bun runtime, increasing file size. Tree-shaking is always enabled. Some npm packages may not bundle correctly due to dynamic imports.

# SEE ALSO

[bun](/man/bun)(1), [bun-run](/man/bun-run)(1), [esbuild](/man/esbuild)(1), [webpack](/man/webpack)(1)
