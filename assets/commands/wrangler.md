# TLDR

**Create a new Worker project**

```wrangler init [project-name]```

**Start local development server**

```wrangler dev```

**Deploy Worker to Cloudflare**

```wrangler deploy```

**Login to Cloudflare account**

```wrangler login```

**List KV namespaces**

```wrangler kv namespace list```

**Create a KV namespace**

```wrangler kv namespace create [namespace-name]```

**Tail Worker logs** in real-time

```wrangler tail [worker-name]```

**Generate types** from configuration

```wrangler types```

# SYNOPSIS

**wrangler** _command_ [_subcommand_] [_options_]

# PARAMETERS

**init** [_name_]
> Create a new Worker project with optional name.

**dev**
> Start a local development server with hot reloading.

**deploy**
> Deploy Worker to Cloudflare's global network.

**publish**
> Alias for deploy (deprecated).

**login**
> Authenticate with Cloudflare account via browser.

**logout**
> Revoke local authentication.

**whoami**
> Display currently logged-in user information.

**tail** [_worker_]
> Stream real-time logs from a deployed Worker.

**kv namespace** _action_
> Manage Workers KV namespaces (list, create, delete).

**kv key** _action_
> Manage KV key-value pairs (put, get, delete, list).

**r2 bucket** _action_
> Manage R2 storage buckets.

**d1** _action_
> Manage D1 databases.

**secret put** _name_
> Create or update an encrypted secret.

**types**
> Generate TypeScript types from wrangler.toml configuration.

**--config** _file_
> Specify configuration file path.

**--env** _environment_
> Target a specific environment.

# DESCRIPTION

**Wrangler** is the command-line interface for Cloudflare's Developer Platform, used to create, develop, test, and deploy Cloudflare Workers and manage related services like KV storage, R2 object storage, D1 databases, and Queues.

The tool provides a local development server that emulates the Cloudflare Workers runtime, enabling rapid iteration without deploying to production. It handles bundling JavaScript and TypeScript code, managing secrets, and configuring bindings to other Cloudflare services.

Configuration is managed through wrangler.toml (or wrangler.json) in the project root, defining the Worker's name, entry point, compatibility settings, and service bindings. Wrangler supports multiple environments for staging and production deployments.

# CAVEATS

Requires Node.js 18 or higher. Local development environment may have subtle differences from production Cloudflare edge runtime. Some features require a Cloudflare account with appropriate plan level. Rate limits apply to API operations.

# HISTORY

**Wrangler** was originally developed by **Cloudflare** in **2019** to support the Workers serverless platform. Version 1 was written in Rust, while **Wrangler 2** (released **2022**) was rewritten in TypeScript for better integration with the JavaScript ecosystem. The tool is part of the open-source workers-sdk repository and continues active development with frequent releases.

# SEE ALSO

[npx](/man/npx)(1), [node](/man/node)(1), [miniflare](/man/miniflare)(1)
