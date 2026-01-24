# TLDR

**Create new project**

```nest new [project-name]```

**Generate controller**

```nest generate controller [name]```

**Generate service**

```nest generate service [name]```

**Generate module**

```nest generate module [name]```

**Generate resource** (full CRUD)

```nest generate resource [name]```

**Start development server**

```nest start --watch```

**Build for production**

```nest build```

**Show help**

```nest --help```

# SYNOPSIS

**nest** [_new_] [_generate_] [_start_] [_build_] [_options_] [_args_]

# PARAMETERS

**new** _NAME_
> Create new project.

**generate**, **g** _TYPE_ _NAME_
> Generate component.

**start**
> Start application.

**build**
> Build application.

**info**
> Display project info.

**add** _LIBRARY_
> Add NestJS library.

**--watch**, **-w**
> Watch mode for development.

**--prod**
> Build for production.

**--flat**
> Don't create directory for generated file.

**--spec**
> Generate spec file (default true).

**--no-spec**
> Skip spec file generation.

**--dry-run**, **-d**
> Report actions without writing.

**--skip-git**
> Skip git initialization.

# DESCRIPTION

**nest** is the CLI for NestJS, a progressive Node.js framework for building server-side applications. It generates projects and components following NestJS conventions.

New projects include TypeScript configuration, testing setup, and the NestJS module structure. The generator creates controllers, services, modules, and other components.

The resource generator creates complete CRUD functionality including controller, service, DTOs, and entities. It can generate REST, GraphQL, or WebSocket resources.

Development server includes hot reload. Code changes trigger automatic restart. Production builds optimize for deployment.

The modular architecture separates concerns into modules, each containing related controllers, services, and providers. The CLI maintains this structure.

NestJS supports Express or Fastify as underlying HTTP servers, with decorators providing routing and dependency injection.

# CAVEATS

Requires Node.js 16+. Generated code uses TypeScript. Some features need additional packages. Learning curve for decorators and dependency injection.

# HISTORY

**NestJS** was created by **Kamil Myśliwiec** in **2017**, inspired by Angular's architecture. It brought Angular-style dependency injection and decorators to Node.js backend development. The CLI provides Rails-like code generation.

# SEE ALSO

[node](/man/node)(1), [npm](/man/npm)(1), [express](/man/express)(1), [typescript](/man/typescript)(1)
