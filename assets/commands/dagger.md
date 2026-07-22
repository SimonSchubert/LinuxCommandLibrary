# TAGLINE

Programmable CI/CD engine that runs pipelines as code

# TLDR

**Initialize** a new Dagger module in the current directory

```dagger init --sdk=[go|python|typescript]```

**Call** a function defined in the current module

```dagger call [function_name] --[arg]=[value]```

**Develop** the module (regenerate SDK bindings after editing dagger.json)

```dagger develop```

**Install** another module as a dependency

```dagger install [github.com/owner/repo@version]```

**Open** an interactive shell inside the module context

```dagger```

**Run** an external command with the Dagger engine attached

```dagger run -- [go test ./...]```

**Query** the Dagger API directly with GraphQL

```dagger query < [query.graphql]```

# SYNOPSIS

**dagger** [_global-options_] _command_ [_command-options_] [_arguments_]

# PARAMETERS

**call**
> Invoke a function from the current module; arguments are passed as **--flag=value** pairs and outputs are streamed back.

**init**
> Scaffold a new module in the current directory. Requires **--sdk** to choose the language.

**develop**
> Regenerate code bindings after editing **dagger.json** or adding dependencies.

**install**
> Add a module reference (local path or remote Git URL) as a dependency.

**run**
> Execute an arbitrary command with a transient Dagger engine session, exposing the engine on **DAGGER_SESSION_PORT**.

**query**
> Send raw GraphQL queries to the Dagger engine (read from a file or stdin).

**login** / **logout**
> Authenticate against Dagger Cloud for pipeline traces and caching.

**-m**, **--mod** _REF_
> Use a remote module instead of the local one (e.g. **github.com/dagger/dagger/ci**).

**--progress** _MODE_
> Progress UI: **auto**, **plain**, or **tty**.

**--silent**
> Suppress progress output entirely.

**-v**, **--debug**
> Verbose / debug logging.

# DESCRIPTION

**dagger** is a CLI for a portable build engine that executes pipelines as code rather than YAML. Each pipeline is expressed as a function in **Go**, **Python**, **TypeScript**, **Java**, **PHP**, or **Elixir** using the matching Dagger SDK. Functions take typed inputs (directories, secrets, services, primitives), describe a graph of containerized operations, and return typed outputs.

The engine runs locally on Docker, Podman, or any OCI-compatible runtime, and identically inside any CI (GitHub Actions, GitLab CI, Jenkins, CircleCI, Azure Pipelines, Buildkite). Because every step is content-addressed and cached, repeated calls reuse prior results, making local iteration as fast as the CI run.

**dagger call** is the primary entry point: it locates the module (defined by **dagger.json**), invokes the requested function with the provided flags, and streams the result. Modules can compose other modules from local paths or Git URLs, enabling reusable building blocks across projects and organizations.

# MODULE LAYOUT

A typical module directory contains:

```
dagger.json     # module manifest (sdk, dependencies)
.dagger/        # generated SDK bindings (do not edit)
main.<ext>      # user-authored functions
```

After editing **dagger.json** or any function signature, run **dagger develop** to regenerate the bindings.

# CAVEATS

A working OCI runtime (Docker, Podman, nerdctl) is required; Dagger spins up its own engine container the first time it is invoked. Function arguments are strongly typed and case-sensitive; **--myArg** and **--my-arg** are not interchangeable. Modules pinned to a Git ref can break on **dagger develop** if the upstream SDK changes its surface. The cache lives in a Docker volume named **dagger-engine-***, which can grow large; prune with **docker volume rm**.

# HISTORY

**Dagger** was founded by **Solomon Hykes** (creator of Docker), **Sam Alba**, and **Andrea Luzzardi** and publicly launched in **March 2022**. The initial 0.x releases drove pipelines via **CUE**. In **early 2023** the project pivoted to a polyglot **module** model with native-language SDKs, and **dagger call** replaced the older **dagger do** entry point. Version **0.9** introduced the module system as the default in late 2023.

# INSTALL

```pacman: sudo pacman -S dagger```

```brew: brew install dagger```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[docker](/man/docker)(1), [podman](/man/podman)(1), [act](/man/act)(1), [buildah](/man/buildah)(1)
