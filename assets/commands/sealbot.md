# TAGLINE

Seal and verify documents with the Let's Seal (SEAL) standard

# TLDR

**Seal** a file (PDF or other)

```sealbot seal [contract.pdf]```

**Verify** a sealed file offline

```sealbot verify [contract.sealed.pdf]```

Install via **npm**

```npm i -g sealbot```

Run without installing via **npx**

```npx sealbot seal [file]```

# SYNOPSIS

**sealbot** {_seal_|_verify_|_issue_|_anchor_|_watch_} [_options_] [_file_]

# PARAMETERS

**seal** _file_
> Seal a PDF or other file through the Let's Seal API or self-hosted service

**verify** _file_
> Verify a seal offline (integrity, issuer, time anchor)

**issue**
> Issue-related sealing operations (see `sealbot --help`)

**anchor**
> Anchor related proofs (e.g. time anchoring workflows)

**watch**
> Watch/automation mode for sealing workflows

# DESCRIPTION

**sealbot** is the command-line client for **Let's Seal**, an open standard (SEAL — Sealed Evidence Anchored to a Ledger) for proving that a file is unaltered, sealed by a known certificate, and existed by a certain date. Seals use format-native mechanisms where possible (PAdES for PDF, C2PA for media, detached CMS for arbitrary files) and can be verified without trusting a single vendor forever.

Install with `npm i -g sealbot` or run `npx sealbot`. A self-contained Rust build lives in the upstream `cli-rs/` directory. Hosted sealing uses organization API keys; verification is free and works offline once roots and proofs are available.

# CAVEATS

Sealing through the hosted service requires network access and credentials. Verification needs pinned trust roots for full authenticity verdicts. Format support varies (PDF, images, XML, email, detached signatures).

# HISTORY

Part of the **Let's Seal** open-source project (Apache-2.0), modeled after free public certificate infrastructure for document authenticity.

# SEE ALSO

[openssl](/man/openssl)(1), [ots](/man/ots)(1)

# RESOURCES

```[Source code](https://github.com/letsseal/letsseal)```

```[Homepage](https://letsseal.org)```

```[Documentation](https://letsseal.org)```

<!-- verified: 2026-07-28 -->
