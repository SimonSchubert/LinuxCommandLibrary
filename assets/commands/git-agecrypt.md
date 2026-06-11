# TAGLINE

Transparent file-level encryption for Git, powered by age

# TLDR

**Initialise** the current Git repository for transparent encryption

```git agecrypt init```

**Register** an age identity (private key) for decryption

```git-agecrypt config add -i [path/to/age.key]```

**Register** an age recipient for one or more paths

```git-agecrypt config add -r [age1...] -p [secrets/prod.env]```

**List** the current recipients and identities

```git-agecrypt config list```

**Remove** a previously registered recipient

```git-agecrypt config remove -r [age1...] -p [secrets/prod.env]```

**Show** which tracked files are encrypted

```git-agecrypt status```

**Tear down** the integration in this repository

```git-agecrypt deinit```

# SYNOPSIS

**git-agecrypt** _command_ [_options_]
**git agecrypt** _command_ [_options_]

# PARAMETERS

**init**
> Install the **clean**, **smudge**, and **textconv** filters into _.git/config_ so encryption / decryption happen automatically on commit and checkout.

**deinit**
> Remove the filter integration from the current repository. Tracked encrypted blobs are unaffected.

**config add -r** _recipient_ **-p** _path..._
> Register an age _recipient_ (public key) that should be able to decrypt the listed _paths_. Repeat to grant access to multiple keys. SSH **ed25519** public keys and age **age1...** keys are both accepted.

**config add -i** _identity_
> Register an age _identity_ (private key file) used by the local checkout to decrypt files. Stored in **.git/config**, never committed.

**config remove -r** _recipient_ [**-p** _path..._]
> Revoke a recipient, optionally limited to specific paths.

**config remove -i** _identity_
> Forget a local identity.

**config list**
> Print the configured recipients (per-path) and registered local identities.

**status**
> Report which tracked paths are configured for encryption and whether the working copy matches the encrypted blob.

**clean**
> Internal filter entry point: read plaintext from stdin and write ciphertext to stdout. Invoked by Git via the **filter.agecrypt.clean** hook.

**smudge**
> Internal filter entry point: read ciphertext from stdin and write plaintext to stdout. Invoked by Git on checkout.

**textconv** _file_
> Internal helper used by **git diff** to render encrypted blobs as plaintext for diffing without leaking ciphertext into the working copy.

**-v**, **--verbose**
> Increase logging verbosity.

**--help**
> Print help for the chosen subcommand.

**--version**
> Print version and exit.

# DESCRIPTION

**git-agecrypt** is a Git integration that keeps secrets in a repository encrypted at rest while exposing plaintext to the working tree. It is an alternative to **git-crypt**, swapping **GPG** for **age**, with smaller key material and support for **SSH** keys and age plugin stubs (for example **age-plugin-yubikey**).

After **git-agecrypt init**, the repository's _.git/config_ contains **clean**, **smudge**, and **textconv** filter entries pointing at the binary. Every file matched by a path pattern in _.gitattributes_ (typically **filter=agecrypt diff=agecrypt**) is encrypted on its way into the object store and decrypted on its way out. Recipients and per-path scoping live in a committed _git-agecrypt.toml_, while local private identities live in _.git/config_ so they never leave the developer's machine.

Because age encryption is non-deterministic, git-agecrypt records a **BLAKE3** hash of each plaintext under _.git/git-agecrypt/_; if the plaintext has not changed, the previously stored ciphertext is reused so commits do not produce noisy churn.

# CONFIGURATION

**git-agecrypt.toml** (committed) declares recipients and the paths they can decrypt:

```
[[recipient]]
key = "age1abc..."
paths = ["secrets/*.env", "deploy/*.yaml"]

[[recipient]]
key = "ssh-ed25519 AAAA... user@host"
paths = ["secrets/*.env"]
```

**.gitattributes** marks which files are subject to encryption:

```
secrets/*.env  filter=agecrypt diff=agecrypt
deploy/*.yaml  filter=agecrypt diff=agecrypt
```

**.git/config** (per-checkout, never committed) stores identity locations and the filter wiring written by **init**:

```
[filter "agecrypt"]
        clean = git-agecrypt clean %f
        smudge = git-agecrypt smudge %f
        required = true
[diff "agecrypt"]
        textconv = git-agecrypt textconv
[agecrypt]
        identity = /home/user/.config/age/keys.txt
```

# CAVEATS

Both **git-crypt** and **git-agecrypt** rely on Git filters, which means **git log -p**, **git blame**, and similar tools can leak plaintext through **textconv** unless tooling is run on a checkout that lacks the identity. **age** is an authenticated stream cipher rather than a deterministic format, so encrypted blobs change on every encryption unless git-agecrypt's hash cache is preserved - clearing _.git/git-agecrypt/_ will produce diffs even when the plaintext is unchanged. Revoking a leaked recipient requires rewriting history; like every Git-level encryption tool, **git-agecrypt** cannot un-publish ciphertext that already left the repository.

# HISTORY

**git-agecrypt** was created by **vlaci** and is maintained as an open-source project on GitHub. It builds on **age**, the modern file encryption tool by **Filippo Valsorda**, and is positioned as a lighter, more flexible successor to **git-crypt** for teams that already use age or SSH keys for secrets management.

# SEE ALSO

[git-crypt](/man/git-crypt)(1), [age](/man/age)(1), [sops](/man/sops)(1), [git](/man/git)(1)
