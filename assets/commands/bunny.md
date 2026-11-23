# TAGLINE

Official command-line interface for bunny.net

# TLDR

**Authenticate** the CLI with your bunny.net account

```bunny login```

**Log in** non-interactively with an API key (CI, remote machines)

```bunny login --api-key "$BUNNYNET_API_KEY"```

**Deploy** the current project as a Magic Containers app

```bunny apps deploy```

**Deploy** a pre-built container image

```bunny apps deploy [ghcr.io/me/api:v1.2]```

**Deploy** a built static site directory

```bunny sites deploy [./dist]```

**List** databases as JSON

```bunny db list --output json```

**Open** an interactive SQL shell for a Bunny Database

```bunny db shell```

**Call** the raw bunny.net API

```bunny api GET [/pullzone]```

**Install** the CLI via the shell installer

```curl -fsSL https://cli.bunny.net/install.sh | sh```

**Install** the CLI globally via npm

```npm install -g @bunny.net/cli```

**Show** help and list available subcommands

```bunny --help```

# SYNOPSIS

**bunny** _command_ [_subcommand_] [_options_]

# PARAMETERS

**login**
> Authenticate via the browser (or **--api-key**) and store the key in a named profile.

**logout**, **whoami**
> Remove a stored profile, or show the authenticated account.

**apps deploy**
> Build and deploy the current project to **Magic Containers**. Automatically provisions infrastructure, scales globally, and routes traffic.

**db**
> Manage Bunny Database: **create**, **list**, **shell**, **studio**, **migrations**, **tokens**, **regions**.

**sites**, **storage**, **dns**, **scripts**, **stream**, **registry**, **sandbox**
> Manage static sites, storage zones, DNS zones, Edge Scripts, Stream video libraries, container registries and dev sandboxes.

**config**
> Manage configuration and named profiles (**init**, **show**, **profile create**/**delete**).

**api** _METHOD_ _PATH_
> Send a raw request to **https://api.bunny.net**.

**completion**
> Print a shell completion script.

**-p**, **--profile** _NAME_
> Configuration profile to use (default **default**).

**-o**, **--output** _FORMAT_
> Output format: **text** (default), **json**, **table**, **csv**, or **markdown**.

**--api-key** _KEY_
> API key; takes priority over the profile and environment.

**-v**, **--verbose**
> Enable verbose output.

**--help**
> Print help for the CLI or a specific subcommand.

**-V**, **--version**
> Print version information.

# DESCRIPTION

**bunny** is the official command-line client for **bunny.net**, providing terminal access to the platform's developer toolkit: **Magic Containers**, Bunny Database, storage zones, static sites, Edge Scripts, DNS zones, and Stream video libraries. It is implemented in **TypeScript** (built with **Bun**) and distributed both as a standalone binary and as the npm package **@bunny.net/cli**.

The CLI's primary workflows include logging in, deploying applications to Magic Containers (which auto-provisions globally distributed runtimes), and managing supporting resources such as databases. It lives in a monorepo alongside SDKs such as **@bunny.net/openapi-client**, **@bunny.net/database-client** and **@bunny.net/sandbox**.

# CAVEATS

The CLI is comparatively new and still evolving - subcommands and flags may change between releases. **bunny** is the binary name shipped by **BunnyWay/cli**; several unrelated community projects also call themselves "bunny CLI" (for example **own3d/bunny-cli**, **straticus1/bunny-cli**, and **simplesurance/bunny-cli**), each with its own command surface. Confirm which package is installed before troubleshooting.

# CONFIGURATION

After **bunny login**, profiles and API keys are stored in **~/.config/bunnynet.json**. Project links (database, app, site) are written to **.bunny/** in the working directory, and app and site settings can be declared in **bunny.jsonc**.

**BUNNYNET_API_KEY**
> API key that overrides the profile-based key; useful for CI.

**BUNNYNET_API_URL**
> API base URL (default **https://api.bunny.net**).

**NO_COLOR**
> Disable colored output.

# HISTORY

**bunny** is published by **bunny.net** in the **BunnyWay/cli** monorepo on GitHub. It was introduced in **2026** to expose the company's developer platform - in particular the **Magic Containers** product - through a single, scriptable CLI.

# SEE ALSO

[curl](/man/curl)(1), [docker](/man/docker)(1), [flyctl](/man/flyctl)(1), [wrangler](/man/wrangler)(1)

# RESOURCES

```[Source code](https://github.com/BunnyWay/cli)```

```[Homepage](https://bunny.net)```

```[Documentation](https://bunny.net/docs/cli)```

<!-- verified: 2026-11-23 -->
