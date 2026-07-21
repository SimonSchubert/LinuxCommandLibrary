# TAGLINE

CLI for instancez, a single-binary Supabase alternative

# TLDR

**Install** the inz CLI

```curl -fsSL https://get.instancez.ai | sh```

**Scaffold** a new project (creates instancez.yaml)

```inz init```

**Run the dev server** with embedded Postgres

```inz dev --embedded-pg```

**Run the dev server** against an existing database

```inz dev```

**Serve** in production mode

```inz serve```

**Deploy** instancez.yaml to instancez Cloud

```inz cloud deploy```

# SYNOPSIS

**inz** \<command\> [_options_]

# DESCRIPTION

**inz** is the command-line interface for **instancez**, an LLM-friendly, single-binary backend intended as a drop-in replacement for many Supabase use cases. Schema, auth policies, storage buckets, and functions are declared in one **instancez.yaml** file. On change, instancez diffs the file against the live database and applies only the delta—including drops—without hand-written migration scripts.

The binary embeds a dashboard and speaks PostgREST-style REST, auth (password, magic link, OTP, anonymous, OAuth, TOTP MFA), SQL RPC, Node.js edge functions, and storage (local or S3) with row-level security. Existing **@supabase/supabase-js** clients can point at an instancez API URL and publishable key. **inz dev** provisions roles, applies the schema, and serves the API (default **http://localhost:8080**); with **--embedded-pg** no external Postgres install is required. Publishable and secret keys are written to **.development.env** on first run. Production secrets load from **.production.env** when present.

# PARAMETERS

**init**
> Create a scaffold project including **instancez.yaml** and example tables/functions.

**dev** [**--embedded-pg**]
> Run the development API with live schema reload. **--embedded-pg** starts an embedded Postgres; otherwise set **INSTANCEZ_DATABASE_URL**.

**serve**
> Run the production server (self-host).

**cloud deploy**
> Push **instancez.yaml** to a managed instancez Cloud project.

# CAVEATS

Realtime/websockets are not supported yet. Storage image resize covers JPEG/PNG only (no WebP/AVIF). Phone/SMS auth is not available. Production still needs Postgres (or cloud hosting); the single binary is not a full multi-region Supabase stack. Building from source needs Go 1.25+ and Node 22+ to embed the dashboard.

# HISTORY

**instancez** is an Apache-2.0 project shipping a portable Go binary (**cmd/inz**) aimed at declarative, AI-friendly backend scaffolding with Supabase client compatibility.

# SEE ALSO

[supabase](/man/supabase)(1), [curl](/man/curl)(1), [docker](/man/docker)(1)

# RESOURCES

```[Source code](https://github.com/instancez/instancez)```

```[Homepage](https://instancez.ai)```

```[Documentation](https://instancez.github.io)```

<!-- verified: 2026-07-21 -->
