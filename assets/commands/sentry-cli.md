# TAGLINE

Official Sentry command-line interface

# TLDR

**Login** / configure auth token

```sentry-cli login```

**Create a release**

```sentry-cli releases new [version]```

**Upload source maps** for a release

```sentry-cli sourcemaps upload -r [version] [path]```

**Upload debug symbols** (native)

```sentry-cli debug-files upload [path]```

**List recent issues**

```sentry-cli issues list```

**Show help** for a subcommand

```sentry-cli [command] --help```

# SYNOPSIS

**sentry-cli** [*global-options*] *command* [*args*]

# DESCRIPTION

**sentry-cli** is the official CLI for [Sentry](https://sentry.io/). It automates release management, source map and debug-file uploads, deploys, and various account/project operations used in CI/CD. Configuration uses environment variables (**SENTRY_AUTH_TOKEN**, **SENTRY_ORG**, **SENTRY_PROJECT**, etc.) and/or config files; see https://docs.sentry.io/cli/.

A newer agent-oriented Sentry CLI is under development at https://cli.sentry.dev/; existing **sentry-cli** remains the stable tool for pipelines until an official migration path is announced.

# PARAMETERS

Common high-level commands (exact set grows over time):

**login**

> Interactive authentication setup.

**releases**

> Create, finalize, and manage releases.

**sourcemaps** / **debug-files**

> Upload client source maps or native debug information files.

**deploys**

> Record deploy events for a release.

**issues**

> List or manage issues.

**send-event**

> Send a test/manual event.

**info** / **projects** / **organizations**

> Introspect account metadata.

Global flags typically include **--auth-token**, **--log-level**, and **--url** for self-hosted servers. Prefer **sentry-cli --help** and the online docs for the installed major version.

# CAVEATS

Requires a Sentry auth token with appropriate scopes. Self-hosted Sentry versions older than 24.11.1 may need **sentry-cli** &lt; 3.x. Some features are SaaS-only. Never commit auth tokens.

# INSTALL

```pacman: sudo pacman -S sentry-cli```

```brew: brew install sentry-cli```

```nix: nix profile install nixpkgs#sentry-cli```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[curl](/man/curl)(1), [npm](/man/npm)(1)

# RESOURCES

```[Source code](https://github.com/getsentry/sentry-cli)```

```[Documentation](https://docs.sentry.io/cli/)```

<!-- verified: 2026-07-19 -->
