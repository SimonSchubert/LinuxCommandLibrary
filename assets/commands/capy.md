# TAGLINE

Git-style end-to-end encrypted secrets CLI

# TLDR

**Install** via npm

```npm install -g @capysc/cli```

**Sync** secrets (initializes the project on first run)

```capy```

**Edit** secrets in the interactive TUI

```capy edit```

**Run a command** with decrypted secrets injected

```capy run -- npm run dev```

**Invite** a teammate

```capy invite [teammate@example.com]```

**Remove** a teammate (cryptographic revoke)

```capy kick [teammate@example.com]```

**Deploy** secrets to a hosting platform

```capy deploy```

# SYNOPSIS

**capy** [_subcommand_] [_options_] [_args_]

# DESCRIPTION

**capy** is a secrets toolchain with git-style primitives — sync, branch, deploy, invite, and kick — that encrypts values on your machine before they leave. The service stores membership records and ciphertext only; decryption needs a key share that never leaves the client. Your `.env` becomes versioned state the team can commit (`keep.lock`), roll back, and offboard without rotating every application key.

On first run in a project with a plain `.env`, Capy encrypts each value in place to `capy:{resourceId}:{ciphertext}` snippets and backs up the original as `.env.pre-capy.old`. **capy run** decrypts into process memory and spawns any command that reads environment variables. **capy kick** makes the removed user's local key cryptographically inert without rotating the master key for remaining members.

Branches parallel git: each Capy branch holds its own secret state and access list; git branches pin to a Capy branch via committed `keep.lock`. Offline **capy run** works from the local cache after the first authenticated sync.

# PARAMETERS

**(no subcommand)**
> Three-way sync between local `.env`, pinned `keep.lock`, and remote. Initializes the project on first use.

**run** **--** _command_...
> Decrypt secrets in memory and run _command_ with them as environment variables.

**edit**
> Interactive table of variables: reveal, edit, drift/conflict status.

**status**
> Show drift between local, pinned, and remote.

**push**
> Push local changes without pulling.

**lock**
> Lock the local key so the passphrase is required next time.

**deploy**
> Generate a deploy token and walk through platform setup (Vercel, Cloudflare, Docker, Fly, Railway, Render, Heroku, GitHub Actions, AWS Lambda, and others).

**connect** _provider_
> Pull a credential from a linked provider into `.env`.

**rotate** [_var_]
> Rotate a managed credential.

**invite** _email_
> Invite a teammate (code travels out-of-band).

**redeem** _code_
> Redeem an invite code.

**kick** _email_
> Remove a teammate with cryptographic revocation.

**users**
> Interactive member management.

**org**
> List or switch organizations.

**branch**, **checkout** _branch_
> List/switch Capy branches; **checkout -b** creates.

**grant-branch**, **revoke-branch**
> Protected-branch access control.

**recover**, **end-recover**
> Restore access from a recovery phrase / end recovery.

**decrypt**
> Offline decrypt (owner only).

**use** _profile_, **profile**
> Switch or manage CLI profiles.

**byoc** [_url_]
> Connect to a self-hosted Capy instance when available.

**info**, **logout**, **cleanup**, **transport**
> Session info, clear session, remove hooks/local state, move account to another machine.

# CONFIGURATION

**.env**
> Project secrets file; values become `capy:...` ciphertext snippets after init.

**keep.lock**
> Committed manifest pinning the branch and encrypted resource state (like a lockfile).

**~/.capy/**
> Local cache and keys so **capy run** works offline after the first sync.

**.env.pre-capy.old**
> Automatic backup of the original plaintext `.env` on first migration (gitignored).

# CAVEATS

The hosted service component is not fully self-hostable for all deployments; losing the org owner seed phrase with no other device holding `key.enc` means permanent loss of access by design. First sync needs network; offline work uses the local cache only. CLI is AGPL-3.0; review license obligations for your team.

# HISTORY

**Capy** (npm package **@capysc/cli**) is an AGPL-3.0 secrets product from **Incentv Technologies** / capysc, positioned as zero-trust, encrypt-at-source secrets management for humans and agents alongside git.

# SEE ALSO

[sops](/man/sops)(1), [age](/man/age)(1), [doppler](/man/doppler)(1), [git](/man/git)(1)

# RESOURCES

```[Source code](https://github.com/capysc/capy-cli)```

```[Homepage](https://capy.sc)```

```[Documentation](https://docs.capy.sc)```

<!-- verified: 2026-08-06 -->
