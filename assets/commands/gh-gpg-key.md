# TAGLINE

Manage GPG keys on GitHub for commit signing

# TLDR

**List GPG keys** on your GitHub account

```gh gpg-key list```

**Add a GPG key** from a file

```gh gpg-key add [key.pub]```

**Add a GPG key** from stdin

```gpg --armor --export [key_id] | gh gpg-key add -```

**Add a GPG key with a title**

```gh gpg-key add [key.pub] --title "[Work laptop]"```

**Delete a GPG key** by ID

```gh gpg-key delete [key_id]```

# SYNOPSIS

**gh** **gpg-key** _subcommand_ [_options_]

# SUBCOMMANDS

**list**
> List the GPG keys associated with the authenticated user.

**add** [_key-file_]
> Add a GPG public key to your GitHub account. Reads from stdin if **-** is passed instead of a file.

**delete** _key-id_
> Remove a GPG key from your GitHub account by its numeric ID.

# PARAMETERS

**-t**, **--title** _string_
> Title of the new key (used by **add**).

**--yes**
> Skip the interactive confirmation prompt (used by **delete**).

# DESCRIPTION

**gh gpg-key** manages GPG keys associated with your GitHub account. GitHub uses these keys to verify signed commits and tags, displaying a "Verified" badge in the web UI when signatures match a registered key.

Keys must be exported in ASCII-armored format (e.g. via **gpg --armor --export**). To enable verification, the key's email must also match a verified email on the account, and commits must be signed locally (e.g. via **git config commit.gpgsign true**).

# CAVEATS

Requires authentication via **gh auth login**. The acting user must have **admin:gpg_key** scope on their token. Keys uploaded to GitHub cannot be used to decrypt anything — GitHub only stores public keys for signature verification.

# INSTALL

```apt: sudo apt install gh```

```dnf: sudo dnf install gh```

```pacman: sudo pacman -S github-cli```

```apk: sudo apk add github-cli```

```zypper: sudo zypper install gh```

```brew: brew install gh```

```nix: nix profile install nixpkgs#gh```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[gh](/man/gh)(1), [gh-ssh-key](/man/gh-ssh-key)(1), [gpg](/man/gpg)(1), [git-commit](/man/git-commit)(1)
