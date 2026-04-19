# TAGLINE

Next.js command-line interface

# TLDR

**Create a new Next.js app** (uses create-next-app)

```npx create-next-app@latest [app-name]```

**Start development server**

```next dev```

**Build for production**

```next build```

**Start production server**

```next start```

**Run linter**

```next lint```

**Print environment info** for bug reports

```next info```

**Enable or disable telemetry**

```next telemetry --disable```

# SYNOPSIS

**next** [_command_] [_options_]

# PARAMETERS

**dev** [_directory_]
> Start development server with Hot Module Reloading.

**build** [_directory_]
> Create an optimized production build.

**start** [_directory_]
> Start the production server (requires **build** first).

**lint**
> Run ESLint on the project.

**info**
> Print system, binary, and package versions (for bug reports).

**telemetry** **--enable** | **--disable**
> Enable or disable anonymous telemetry.

**-p**, **--port** _port_
> Port to listen on (default: 3000). Applies to **dev** and **start**.

**-H**, **--hostname** _host_
> Hostname to bind to (default: 0.0.0.0).

**--turbopack**
> Force enable Turbopack (default in recent versions).

**--webpack**
> Use Webpack instead of Turbopack.

**--experimental-https**
> Serve **dev** over HTTPS using a self-signed certificate.

**-h**, **--help**
> Display help information.

**-v**, **--version**
> Display Next.js version.

# DESCRIPTION

**next** is the Next.js CLI for developing, building, and serving React applications. It provides file-based routing, server-side rendering, static generation, and API routes out of the box.

Running **next** with no command is an alias for **next dev**. Configuration lives in **next.config.js** (or **.mjs**/**.ts**). Starting with Next 13 the default output directory is **.next**.

# CAVEATS

Requires Node.js. The standalone **next export** command was removed in Next.js 14 in favor of `output: 'export'` in **next.config.js**. Linting as part of **next build** is being phased out starting in Next.js 15.5.

# HISTORY

Next.js was created by **Vercel** (then ZEIT) and released in **2016** as a React framework for production applications. Later versions introduced App Router, React Server Components, and Turbopack.

# SEE ALSO

[npm](/man/npm)(1), [vercel](/man/vercel)(1), [node](/man/node)(1)
