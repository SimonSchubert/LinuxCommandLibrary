# TAGLINE

wasmCloud development and management CLI

# TLDR

**Create new WebAssembly component project**

```wash new component [project-name]```

**Build a component**

```wash build```

**Start development server with hot reload**

```wash dev```

**Start local wasmCloud environment**

```wash up```

**Stop local wasmCloud environment**

```wash down```

**Push component to OCI registry**

```wash push [registry.example.com/component:tag] [component.wasm]```

**Inspect component interfaces**

```wash inspect [component.wasm]```

# SYNOPSIS

**wash** [_options_] _command_ [_arguments_]

# COMMANDS

**new**: Create project from template (component, provider).

**build**: Build and sign component or provider.

**dev**: Start hot-reload development loop.

**up**: Bootstrap local wasmCloud environment.

**down**: Tear down local environment.

**app**: Manage declarative applications (wadm).

**start**: Start a component or provider.

**stop**: Stop a running component or provider.

**scale**: Scale component instances.

**push**: Push artifact to OCI registry.

**pull**: Pull artifact from OCI registry.

**inspect**: Show component WIT interfaces and metadata.

**lint**: Check component for common issues.

**completions**: Generate shell completions.

# PARAMETERS

**-o** _format_
> Output format: text, json.

**--nats-host** _host_
> NATS server host.

**--nats-port** _port_
> NATS server port.

**--lattice** _id_
> Lattice ID to connect to.

**--ctl-host** _host_
> Control interface host.

# DESCRIPTION

**wash** (wasmCloud Shell) is the comprehensive CLI for developing WebAssembly components and managing wasmCloud distributed applications. It provides tools for the complete development lifecycle from project scaffolding to deployment.

The CLI supports multi-language component development including Rust, Go, and TypeScript. Projects are built to WebAssembly components following the Component Model specification. The dev command provides a hot-reload development server for rapid iteration.

wasmCloud enables distributed applications where components communicate through capability providers for networking, storage, and other system services. wash manages local development environments and interacts with remote wasmCloud lattices.

# CAVEATS

Requires language-specific toolchains (Rust, Go, TinyGo) for building components. Local development needs Docker or Podman for NATS messaging. Some features require wasmCloud host running.

# HISTORY

**wash** was created by the wasmCloud project as the primary interface for WebAssembly component development. The wasmCloud platform emerged from the Wasm community's effort to build distributed systems using the Component Model. wash consolidated multiple tools into a single CLI, becoming the standard interface for the wasmCloud ecosystem.

# SEE ALSO

[wasm-tools](/man/wasm-tools)(1), [wasmtime](/man/wasmtime)(1), [docker](/man/docker)(1)
