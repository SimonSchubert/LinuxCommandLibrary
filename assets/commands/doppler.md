# TAGLINE

secrets management and injection platform

# TLDR

**Login to Doppler**

```doppler login```

**Setup project** configuration

```doppler setup```

**List secrets** in current config

```doppler secrets```

**Run command with** secrets injected

```doppler run -- [command]```

**Dump secrets** to stdout as a dotenv file

```doppler secrets download --no-file --format [env]```

**Run against a specific** project and config

```doppler run -p [backend] -c [prod] -- [command]```

**Authenticate in CI** with a service token

```echo "[dp.st.prd.xxxx]" | doppler configure set token --scope /```

# SYNOPSIS

**doppler** _command_ [_subcommand_] [_flags_]

# COMMANDS

**login** / **logout**
> Authenticate this machine against Doppler, or disconnect it.

**setup**
> Interactively bind the current directory to a project and config, so later commands need no **-p**/**-c**.

**run** **--** _command_
> Run _command_ with the config's secrets injected into its environment.

**secrets**
> List, get, set, delete, download, upload, and substitute secrets.

**projects** / **configs** / **environments**
> Manage the project, config, and environment hierarchy.

**configure**
> View and edit the CLI's own configuration, including the auth token and the directory-to-config mapping.

**import**
> Import secrets from another source into a config.

**activity**
> Show the audit log of recent changes.

**me**
> Show which identity the current token belongs to.

**open**
> Open the current project's dashboard in a browser.

**update**
> Update the CLI itself to the latest version.

# PARAMETERS

**-p**, **--project** _NAME_ / **-c**, **--config** _NAME_
> Project and config to act on, overriding what `doppler setup` chose for this directory.

**--command** _STRING_
> Pass the command to **run** as a single shell string instead of after `--`.

**--preserve-env** [_LIST_]
> Let existing environment values win over Doppler's for the named secrets.

**--mount** _PATH_
> Write secrets to an ephemeral file instead of injecting them into the environment.

**--fallback** _PATH_, **--fallback-only**
> Use an encrypted local fallback file so processes still start when Doppler is unreachable.

**--json**
> Print output as JSON.

# DESCRIPTION

**Doppler** is a hosted secrets manager, and its CLI exists mainly to keep secrets out of files. The central command is **doppler run**, which fetches the current config's secrets and injects them as environment variables into a child process. Nothing is written to disk, so there is no `.env` to leak, commit, or leave stale.

The model is a three-level hierarchy: a *project* per service, an *environment* per stage (dev, staging, production), and a *config* holding the actual key/value pairs. `doppler setup` records which project and config a directory belongs to, so that a developer can `cd` into a repository and have `doppler run` pick the right secrets automatically.

For CI and production, a *service token* scoped to a single config replaces the interactive login, which is why the same command works unchanged on a laptop and in a pipeline. An encrypted **fallback file** is written after each successful fetch so that a deploy still comes up if Doppler itself is unreachable.

# CAVEATS

Doppler is a commercial SaaS product: it needs an account, and secrets are fetched over the network at process start, so an outage or a missing token stops your application from booting unless a fallback file is in place. Secrets injected into the environment are visible to the child process and its descendants, and on Linux to anyone who can read `/proc/<pid>/environ` for that user, so **--mount** is the safer option for high-value credentials. Exporting with `secrets download --no-file` puts plaintext on your terminal and into shell history, which defeats much of the point of using the tool.

# HISTORY

Doppler was founded in **2018**, part of a wave of tools reacting to the ubiquity of `.env` files, which are easy to use, easy to commit by accident, and impossible to rotate centrally. The CLI is open source and written in Go, even though the backend service is proprietary, so the injection mechanism can be audited independently of the platform.

# INSTALL

```brew: brew install doppler```

```nix: nix profile install nixpkgs#doppler```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[doppler-secrets](/man/doppler-secrets)(1), [doppler-projects](/man/doppler-projects)(1), [vault](/man/vault)(1), [aws-vault](/man/aws-vault)(1), [sops](/man/sops)(1), [env](/man/env)(1)

# RESOURCES

```[Source code](https://github.com/DopplerHQ/cli)```

```[Homepage](https://www.doppler.com)```

```[Documentation](https://docs.doppler.com/docs/cli)```

<!-- verified: 2026-07-14 -->

