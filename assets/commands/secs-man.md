# TAGLINE

Encrypt and back up secrets with interoperable age archives

# TLDR

**Export** and encrypt all secrets listed in a manifest

```sudo secs-man export [path/to/secrets] [path/to/export/endpoint]```

**Import** the latest encrypted snapshot back into a secrets directory

```sudo secs-man import [path/to/export/endpoint] [path/to/secrets]```

**Import** a specific snapshot by name

```sudo secs-man import [path/to/export/endpoint]/export-[YYYY-MM-DD_HH-MM-SSZ] [path/to/secrets]```

**Import** only selected secrets from a snapshot

```sudo secs-man import [path/to/export/endpoint] [path/to/secrets] --pick [ssh/id_ed25519] [wg/wg0.key]```

**Verify** integrity of all exported snapshots

```sudo secs-man verify-export [path/to/export/endpoint]```

# SYNOPSIS

**secs-man** _subcommand_ [_options_] [_paths_]

# PARAMETERS

**export** _secrets-dir_ _export-endpoint_
> Encrypt every file listed in `.secrets-manifest` under _secrets-dir_ with **age** and write a timestamped snapshot under _export-endpoint_. Passphrase is prompted interactively.

**import** _export-endpoint_ _secrets-dir_
> Decrypt and restore secrets from the latest snapshot (or a specific snapshot path) into _secrets-dir_, applying owner and mode from the manifest.

**verify-export** _export-endpoint_
> Check SHA-256 checksums for every file in one or all snapshots under _export-endpoint_.

**--pick** _paths..._
> On import, restore only the listed manifest-relative paths.

**--from-plaintext** / **--skip-chown-chmod**
> Advanced flags used by the companion **secs-man-ssh** script for remote workflows.

# DESCRIPTION

**secs-man** is a command-line secrets manager focused on **tool-independent backups**. Files are encrypted with **age** using a passphrase you enter at export and import time; the tool never reads the passphrase from a file, argument, or environment variable. Each export creates a timestamped snapshot of `.age`-suffixed ciphertext files plus companion **sha256sums** manifests.

A plaintext **.secrets-manifest** at the root of the secrets directory lists which paths to manage. Each entry may specify **owner** and **mode** permissions applied on import. The design goal is recoverability without secs-man itself: decryption and restore can be reproduced manually with **age**, **cp**, **chmod**, and **chown**.

The optional **secs-man-ssh** shell script (shipped separately in the repository) exports from or imports to remote hosts over SSH without passing the passphrase through the remote machine.

# CONFIGURATION

**.secrets-manifest** — plaintext file at the secrets root listing managed paths (relative), optional owner, and optional mode. See the upstream `.secrets-manifest.example` for syntax. File paths cannot contain whitespace.

# CAVEATS

Not published to crates.io, nixpkgs, or distro repos; install via **cargo install --git**, **nix run**, or a Nix flake. **sudo** is required when the manifest assigns owners other than the invoking user. Export snapshots are never auto-deleted — rotate or remove old snapshots manually when backing up decrypting secrets (disk keys, age identities). Integrity checks run automatically on every export; **verify-export** is for auditing older snapshots.

# HISTORY

**secs-man** was written in **Rust** by **Fran314** and released as **secrets-manager-rs** under the **AGPL-3.0** license, emphasizing long-term accessibility through standard **age** encryption rather than proprietary formats.

# SEE ALSO

[age](/man/age)(1), [sha256sum](/man/sha256sum)(1)

# RESOURCES

```[Source code](https://github.com/Fran314/secrets-manager-rs)```

<!-- verified: 2026-06-28 -->